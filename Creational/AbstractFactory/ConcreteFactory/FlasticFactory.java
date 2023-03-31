package Creational.AbstractFactory.ConcreteFactory;

import Creational.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Creational.AbstractFactory.AbstractProduct.Chair;
import Creational.AbstractFactory.AbstractProduct.Table;
import Creational.AbstractFactory.Product.Chair.PlasticChair;
import Creational.AbstractFactory.Product.Table.PlasticTable;

public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
     
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        
        return new PlasticTable();
    }
    
}
