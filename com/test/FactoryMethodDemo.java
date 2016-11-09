package com.test;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProduct.class) ;
        /*
        * 继续业务处理
        * */
    }
}
