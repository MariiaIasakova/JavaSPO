package com.epam.mariia_iasakova.task5;


import java.util.Queue;

public class CommandPost {

    private Queue<Dock> dockQueue;
    private Logger logger;

    public CommandPost(Queue<Dock> dockQueue) {
        this.dockQueue = dockQueue;
        this.logger = new Logger();
    }

    public synchronized void passShip(Ship ship) {
        if (this.dockQueue.isEmpty()) {
            try {
                wait();
                logger.logImpossibilityToOccupy(ship);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            Dock dock = this.dockQueue.poll();
            ship.setDock(dock);
            notifyAll();
        }
    }

    public void releaseDock(Dock dock){
        this.dockQueue.add(dock);
    }
}
