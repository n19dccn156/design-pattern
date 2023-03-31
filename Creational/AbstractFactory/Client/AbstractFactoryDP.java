package Creational.AbstractFactory.Client;

import Creational.AbstractFactory.MaterialType;
import Creational.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Creational.AbstractFactory.AbstractProduct.Chair;
import Creational.AbstractFactory.AbstractProduct.Table;
import Creational.AbstractFactory.SuperFactory.FurnitureFactory;

public class AbstractFactoryDP {
    
    public static void main(String[] args) {
        FurnitureAbstractFactory factoryPlastic = FurnitureFactory.getFactory(MaterialType.FLASTIC);
        FurnitureAbstractFactory factoryWood = FurnitureFactory.getFactory(MaterialType.WOOD);
 
        // factory plastic
        Chair chairPlastic = factoryPlastic.createChair();
        chairPlastic.create(); // Create plastic chair
        Table tablePlastic = factoryPlastic.createTable();
        tablePlastic.create(); // Create plastic table

        // factory wood
        Chair chairWood = factoryWood.createChair();
        chairWood.create(); // Create wood chair
        Table tableWood = factoryWood.createTable();
        tableWood.create(); // Create wood table
    }
}
