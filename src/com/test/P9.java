package com.test;

public class P9 implements Huaiwei {
    public P9(){
        this.telcolor();
        this.telPrice();
        this.telCpu();
    }
    @Override
    public void telcolor() {
        System.out.println("华为P9的颜色是玫瑰金");
    }

    @Override
    public void telCpu() {
        System.out.println("华为P9的内存是3G");
    }

    @Override
    public void telPrice() {
        System.out.println("华为P9的价格是3000元");
    }
}
