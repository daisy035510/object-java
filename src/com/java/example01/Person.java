package com.java.example01;

public class Person {

    private String name;
    private int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void showInfo() {
        System.out.println(this.name + "님의 남은 돈은 " + this.money + "원 입니다.");
    }
}
