package com.java.example01;
public class Bus extends Transportation{

    public Bus(String model, int price) {
        super(model, price);
    }


    public void showInfo() {
        System.out.println(this.getModel() + "번 버스의 승객은 " + this.getCount() + "명이고, 수입도 "  + this.getRevenue() + "원 입니다.");
    }
}
