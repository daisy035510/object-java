package com.java.example01;

public class Transportation {

    private String model;
    private int revenue;
    private int count;
    private int price;

    public Transportation(String model, int price) {
        this.model = model;
        this.revenue = 0;
        this.count = 0;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }


    public void takeTranportation(Person person) {

        int custMoney = person.getMoney();

        // 수입증가
        this.setRevenue(this.revenue + this.getPrice());

        // 승객 증가
        this.setCount(++this.count);

        // 고객 money 감소
        person.setMoney(custMoney - this.price);
    }

    public void showInfo(){
    }
}
