package LambdaExpression.demo;

public class Lambda implements MyFunctionalInterface{

    public void m1(){
        System.out.println("override abstract method");
    }

    public void m2(){
        System.out.println("override default method m2");
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.m1();
        lambda.m2();
        lambda.m3();
        MyFunctionalInterface myFunctionalInterface = ()-> System.out.println("override abstract method using lambda");

        myFunctionalInterface.m1();
        MyFunctionalInterface.m4();
    }
}
