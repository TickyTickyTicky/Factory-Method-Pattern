package com.test;

public class Mate9 implements Huaiwei {
    public Mate9(){
        this.telcolor();
        this.telPrice();
        this.telCpu();
    }
    @Override
    public void telcolor() {
        System.out.println("华为Mate9的颜色是黑色");
    }

    @Override
    public void telCpu() {
        System.out.println("华为Mate9的内存是4G");
    }

    @Override
    public void telPrice() {
        System.out.println("华为Mate9的价格是3500元");
    }
}
