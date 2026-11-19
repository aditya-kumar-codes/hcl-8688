import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

public class ApiRoutes {

    static Map<Integer, String> employees = new HashMap<>();

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(
                new InetSocketAddress(8081), 0);

        server.createContext("/api/employees", exchange -> {

            String method = exchange.getRequestMethod();

            if (method.equals("GET")) {
                String result = employees.toString();
                exchange.sendResponseHeaders(200, result.length());
                exchange.getResponseBody().write(result.getBytes());
            }

            if (method.equals("POST")) {
                employees.put(101, "Rahul");

                String result = "Employee added";
                exchange.sendResponseHeaders(200, result.length());
                exchange.getResponseBody().write(result.getBytes());
            }

            if (method.equals("DELETE")) {
                employees.remove(101);

                String result = "Employee deleted";
                exchange.sendResponseHeaders(200, result.length());
                exchange.getResponseBody().write(result.getBytes());
            }

            exchange.getResponseBody().close();
        });

        server.start();

        System.out.println("Server started at http://localhost:8081");
    }
}