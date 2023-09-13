package main.java;

public class Laptop  extends Computer {

    private String keyboardColor;

    public Laptop(int memory, String color, String brand, String keyboardColor) {
        super(memory, color, brand);
        this.keyboardColor = keyboardColor;
    }

    public String getKeyboardColor() {
        return keyboardColor;
    }

    public void setKeyboardColor(String keyboardColor) {
        this.keyboardColor = keyboardColor;
    }

}
