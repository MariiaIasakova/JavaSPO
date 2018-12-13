package com.epam.mariia_iasakova.task5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Port {

    public static void main(String[] args) {
        Queue<Dock> dockQueue = new ArrayDeque<>();
        dockQueue.add(new Dock(12));
        dockQueue.add(new Dock(0));
        //dockQueue.add(new Dock(5));
        CommandPost commandPost = new CommandPost(dockQueue);
        ArrayList<Ship> shipArrayList = new ArrayList<>();
        Ship ship1 = new Ship("A", 80, commandPost);
        Ship ship2 = new Ship("B", 0, commandPost);
        Ship ship3 = new Ship("C", 30, commandPost);
        Ship ship4 = new Ship("D", 50, commandPost);
        Ship ship5 = new Ship("E", 10, commandPost);
        Ship ship6 = new Ship("F", 77, commandPost);
        Ship ship7 = new Ship("G", 35, commandPost);
        Ship ship8 = new Ship("H", 41, commandPost);
        shipArrayList.add(ship1);
        shipArrayList.add(ship2);
        shipArrayList.add(ship3);
        shipArrayList.add(ship4);
        shipArrayList.add(ship5);
        shipArrayList.add(ship6);
        shipArrayList.add(ship7);
        shipArrayList.add(ship8);
        int shipCargoAtStart = calculateCargoinShips(shipArrayList);
        int dockCargoAtStart = calculateCargoInDocks(dockQueue);
        int totalCargoInBeggining = shipCargoAtStart + dockCargoAtStart;
        System.out.println("Total cargo in system : " + totalCargoInBeggining);
        for (Ship ship : shipArrayList){
            ship.start();
        }
        for (Ship ship : shipArrayList){
            try {
                ship.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int shipCargoAtEnd = calculateCargoinShips(shipArrayList);
        int dockCargoAtEnd = calculateCargoInDocks(dockQueue);
        int totalCargoAtTheEnd = shipCargoAtEnd + dockCargoAtEnd;
        System.out.println("Ratio of dock's/ship's cargo :");
        System.out.println("\t\t- it was at the start:\t " + dockCargoAtStart + "/" + shipCargoAtStart + "(units)");
        System.out.println("\t\t- it became at the finish:\t " + dockCargoAtEnd + "/" + shipCargoAtEnd + "(units)");
        if (totalCargoAtTheEnd == totalCargoInBeggining){
            System.out.println("Congratulations");
        }else{
            System.out.println("Something go wrong");
        }
        System.out.println(totalCargoAtTheEnd + " out of " + totalCargoInBeggining + " units of cargo delivered to the destination.");
    }

    public static int calculateCargoInDocks(Queue<Dock> dockQueue){
        int totalCargoInDocks = 0;
        for (Dock dock: dockQueue
                ) {
            totalCargoInDocks += dock.getCargo();
        }
        return  totalCargoInDocks;
    }
    public static int calculateCargoinShips(List<Ship> shipList){
        int totalCargoInShips = 0;
        for (Ship ship : shipList){
            totalCargoInShips += ship.getCargo();
        }
        return totalCargoInShips;
    }
}
