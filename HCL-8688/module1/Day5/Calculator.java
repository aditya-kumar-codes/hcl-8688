package Day5;
//Calculator using Lambda expression
public interface Calculator {
    int calculate(int a, int b);
    //boolean isEven(int a);
    public static void main(String[] args) {
        Calculator add =(a,b)->a+b;;
        Calculator sub  =(a,b)->a-b;
        Calculator mul  =(a,b)->a*b;
        Calculator div  =(a,b)->a/b;
//Calculator number=(a)->a%2==0;
        System.out.println(add.calculate(10,20));
        System.out.println(sub.calculate(10,20));
        System.out.println(mul.calculate(10,20));
        System.out.println(div.calculate(10,20));
//System.out.println(number.isEven(10));
        //System.out.println(number.isEven(11));
//        System.out.println(c.calculate(30,40));


    }
}
