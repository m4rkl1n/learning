package oop;

public class Bird extends Animal{
    private int wings;

    public Bird(String name, String colour, int legs, boolean hasTail, int wings) {
        super(name, colour, legs, hasTail);
        this.wings = wings;
    }


    public void fly(){
        System.out.println(this.getName()+"is flying");
    }
}
