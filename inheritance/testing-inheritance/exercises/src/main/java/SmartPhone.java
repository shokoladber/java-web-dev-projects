package main.java;

public class SmartPhone extends Computer{

    private String ringTone;

    public SmartPhone(int memory, String color, String brand, String ringTone) {
        super(memory, color, brand);
        this.ringTone = ringTone;
    }

    public String getRingTone() {
        return ringTone;
    }

    public void setRingTone(String ringTone) {
        this.ringTone = ringTone;
    }

}
