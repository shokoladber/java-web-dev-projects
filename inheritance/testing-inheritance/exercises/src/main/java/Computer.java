package main.java;

public class Computer extends AbstractEntity {

    private int memory;
    private String color;
    private String brand;

    public Computer(int memory, String color, String brand) {
        this.memory = memory;
        this.color = color;
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
