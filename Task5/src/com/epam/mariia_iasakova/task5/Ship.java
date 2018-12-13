package com.epam.mariia_iasakova.task5;

import java.util.Random;

public class Ship extends Thread {

    private Random rnd = new Random();
    private static int number;
    private int cargo;
    private Logger logger;
    private int numberOfShip;
    private CommandPost commandPost;
    private Dock dock;
    private long timeOfStart;

    public Ship(String name, int cargo, CommandPost commandPost) {
        super(name);
        this.cargo = cargo;
        number++;
        this.numberOfShip = number;
        logger = new Logger();
        logger.logCargoOfShip(this);
        this.commandPost = commandPost;
    }

    public int getNumberOfShip() {
        return numberOfShip;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }

    public int getCargo() {
        return cargo;
    }

    public void addCargo(int cargo) {
        this.cargo += cargo;
    }

    public void subCargo(int cargo) {
        this.cargo -= cargo;
    }

    private void swim(){
        int timeToSleep = rnd.nextInt(((5000-1000)+1)+1000);
        try {
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        int itteration = 0;
        while (itteration<3) {
            this.swim();
            this.commandPost.passShip(this);
            if(this.dock!=null) {
                this.dock.dockShip(this);
                this.commandPost.releaseDock(this.dock);
                this.dock = null;
            }
            itteration++;
        }
    }
}
