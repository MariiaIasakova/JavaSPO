package com.epam.mariia_iasakova.task5;

public class Logger {

    public void logCargoOfShip(Ship ship) {
        System.out.println("Ship " + ship.getNumberOfShip() + " has " + ship.getCargo() + " cargo.");
    }

    public void logImpossibilityToOccupy(Ship ship) {
        System.out.println("Ship " + ship.getNumberOfShip() + " can't occupy dock");
    }
}
