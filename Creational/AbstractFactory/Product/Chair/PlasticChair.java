package Creational.AbstractFactory.Product.Chair;

import Creational.AbstractFactory.AbstractProduct.Chair;

public class PlasticChair implements Chair {

    @Override
    public void create() {
        
        System.out.println("Create plastic chair");
    }    
}
