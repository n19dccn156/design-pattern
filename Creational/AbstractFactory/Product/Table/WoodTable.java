package Creational.AbstractFactory.Product.Table;

import Creational.AbstractFactory.AbstractProduct.Table;

public class WoodTable implements Table {

    @Override
    public void create() {
        
        System.out.println("Create wood table");
    }
    
}
