package com.company;

public class Main {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
//        for (int i = 0; i <computers.length; i++) {
//            computers[i] = new Computer();
//
//        }
        Computer acer = new Computer("acer", 1264, 25500,4,37);
        Computer asus = new Computer("asus", 1251, 24600,3,43);
        Computer macB = new Computer("macB", 1543, 255670,2,76);
        Computer dell = new Computer("dell", 1785, 57500,1,34);
        Computer xmi = new Computer("xiaomi", 7654, 654322,5,6);

        computers[0] = acer;
        computers[1] = asus;
        computers[2] = macB;
        computers[3] = dell;
        computers[4] = xmi;

        for (int i = 0; i <computers.length ; i++) {
             float price = computers[i].getPrice();
                price *= 1.1f;
             computers[i].setPrice(price);

        }
//        for (int i = 0; i < computers.length ; i++) {
//            System.out.println(computers[i].getPrice());
//        }
        for (Computer computer : computers) {
            computer.view();
        }


    }


}
