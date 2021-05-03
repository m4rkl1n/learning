package oop;

public class Main {
    public static void main(String[] args) {
        Bird Phoenix = new Bird("nina","red",4,true,2 );
        System.out.println(Phoenix.getName());
        Phoenix.eat("meat");
        Phoenix.fly();
    }

}
