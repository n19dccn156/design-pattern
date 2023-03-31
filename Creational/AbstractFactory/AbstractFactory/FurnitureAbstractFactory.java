package Creational.AbstractFactory.AbstractFactory;

import Creational.AbstractFactory.AbstractProduct.Chair;
import Creational.AbstractFactory.AbstractProduct.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
 
    public abstract Table createTable();
}
