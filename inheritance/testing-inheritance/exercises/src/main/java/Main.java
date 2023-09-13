package main.java;

public class Main {

    public static void main(String args[]){

        Laptop laptop = new Laptop(1000, "blue", "apple", "orange");
        SmartPhone smartPhone = new SmartPhone(1000, "black", "apple", "Dave Matthews");

        System.out.println(laptop.getId());
        System.out.println(smartPhone.getId());

    }

}
