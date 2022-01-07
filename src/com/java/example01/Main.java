package com.java.example01;

public class Main {

    public static void main(String[] args) {

        Person james = new Person("james", 5000);
        Person tomas = new Person("tomas", 10000);

        Transportation bus = new Bus("100", 1000);
        Transportation sub = new Subway("2", 1200);

        bus.takeTranportation(james);
        sub.takeTranportation(tomas);

        james.showInfo();
        tomas.showInfo();
        bus.showInfo();
        sub.showInfo();
    }
}
