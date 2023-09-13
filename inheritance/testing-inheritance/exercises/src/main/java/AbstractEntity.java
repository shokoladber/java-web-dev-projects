package main.java;

public abstract class AbstractEntity {

    private static int nextID = 1;

    private int id;

    public AbstractEntity(){
        this.id = nextID++;
    }

    public int getId() {
        return id;
    }

}
