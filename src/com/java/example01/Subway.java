package com.java.example01;

public class Subway extends Transportation{

    public Subway(String model, int price) {
        super(model, price);
    }


    @Override
    public void showInfo() {
        System.out.println(this.getModel() + "지하철의 승객은 " + this.getCount() + "명이고, 수입도 "  + this.getRevenue() + "원 입니다.");
    }
}
