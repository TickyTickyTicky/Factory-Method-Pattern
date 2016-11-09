package com.test;

public interface Creator {
//  利用泛型将T的界限限定为Product类或者其子类，形参c为T type型 因为Product为一个接口
    public <T extends Product>T factory(Class<T> c) ;
}
