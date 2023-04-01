package Creational.Prototype.FactoryMethod;

import java.util.HashMap;
import java.util.Map;

import Creational.Prototype.TypeColor;
import Creational.Prototype.Prototype.Cell;

public class CellFactory {
    private static final Map<TypeColor, Cell> CELL_CACHE = new HashMap<>();

    private CellFactory() {}

    public static Cell getCell(TypeColor color) {
        if (!CELL_CACHE.containsKey(color)) {
            Cell cell = new Cell(color.name());
            CELL_CACHE.put(color, cell);
        }
        return CELL_CACHE.get(color).clone();
    }
}
