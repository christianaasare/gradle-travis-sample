package io.turntabl;

public abstract class Client implements ContactName {
    private String name;
    private int id;
    private ServiceLevel serviceLevel;

    public Client(String name, int id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }
}
