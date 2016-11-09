package com.test;

public class Mate9Factory implements HuaiWeiFactory {
    @Override
    public Huaiwei CreateTel() {
        return new Mate9();
    }
}
