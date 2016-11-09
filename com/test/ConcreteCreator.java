package com.test;

public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null ;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return(T) product ;
    }
}
