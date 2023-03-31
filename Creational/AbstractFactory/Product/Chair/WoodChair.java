package Creational.AbstractFactory.Product.Chair;

import Creational.AbstractFactory.AbstractProduct.Chair;

public class WoodChair implements Chair {

    @Override
    public void create() {
        
        System.out.println("Create wood chair");
    }
    
}
