package Creational.Prototype.Client;

import Creational.Prototype.ConcretePrototype.Board;

public class Prototype {
    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
 
        Board chessBoard = new Board();
 
        long endTime = System.currentTimeMillis();
 
        System.out.println("Time taken to create a board: " + (endTime - startTime) + " millis");
 
        chessBoard.print();
    }
}
