package com.pentalog.pentastagiu.homework3.bluetooth.application;

public class Phone implements Connectable {

    private String name;
    private String type;
    private String memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Phone(String name, String type, String memory) {
        this.name = name;
        this.type = type;
        this.memory = memory;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Phone " + getName());
    }
}
