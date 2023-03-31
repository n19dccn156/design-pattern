package Creational.AbstractFactory.Product.Table;

import Creational.AbstractFactory.AbstractProduct.Table;

public class PlasticTable implements Table {

    @Override
    public void create() {
        
        System.out.println("Create plastic table");
    }
    
}
