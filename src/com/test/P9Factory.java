package com.test;

public class P9Factory implements HuaiWeiFactory {
    @Override
    public Huaiwei CreateTel() {
        return new P9();
    }
}
