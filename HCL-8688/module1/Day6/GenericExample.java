package Day6;

public class GenericExample<K,V> {
//    String name;
//    int rolln;
    private K key;
    private V value;

    public GenericExample(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void getPair(K key, V value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }

//    public void setPair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }

    public static void main(String[] args) {
        GenericExample<Integer, String> e1 = new GenericExample<>(1, "One");
        GenericExample<String, String> e3 = new GenericExample<>("Apple", "A fruit");
        e1.getPair(1, "One");
        e3.getPair("Apple", "A fruit");
        GenericExample<String, Double> e2 = new GenericExample<>("Pi", 3.14);
        e2.getPair("Pi", 3.14);
//        GenericExample<String, Double> e2 = new GenericExample<>("Pi", 3.14);
//        e2.getPair("Pi", 3.14);
//        GenericExample<String, String> e3 = new GenericExample<>("Apple", "A fruit");
//        e3.getPair("Apple", "A fruit");
//        GenericExample<Double, String> e4 = new GenericExample<>();
//        e4.setPair(3.14, "Pi");
//        for (GenericExample genericExample : new GenericExample[]{e1, e2, e3}) {
//            System.out.println("Key: " + genericExample.key + ", Value: " + genericExample.value);
//        }

    }

}
