package Creational.AbstractFactory.ConcreteFactory;

import Creational.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Creational.AbstractFactory.AbstractProduct.Chair;
import Creational.AbstractFactory.AbstractProduct.Table;
import Creational.AbstractFactory.Product.Chair.WoodChair;
import Creational.AbstractFactory.Product.Table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        
        return new WoodChair();
    }

    @Override
    public Table createTable() {
       
        return new WoodTable();   
    }
    
}
