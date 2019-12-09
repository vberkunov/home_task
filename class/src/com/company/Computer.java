package com.company;

public class Computer {
    private String manufactured;
    private int serialNumber;
    private float price;
    private int quantity;
    private int frequency;


    public Computer(String manufactured, int serialNumber, float price, int quantity, int frequency){
        this.manufactured = manufactured;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantity = quantity;
        this.frequency = frequency;

    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void view(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Computer : " + "\n"
                + manufactured + "\n"
                + "Computer's price : " + "\n"
                + price + "\n"
                + "Serial number : " + "\n"
                + serialNumber + "\n"
                + "Frequency : " + "\n"
                + frequency + "\n"
                + "Quantity : " + "\n"
                + quantity + "\n";
    }
}
