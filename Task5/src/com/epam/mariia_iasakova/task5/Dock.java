package com.epam.mariia_iasakova.task5;

public class Dock {

    private Logger logger;
    private int cargo;
    private Ship ship;

    public Dock(int cargo) {
        this.cargo = cargo;
        this.ship = null;
        this.logger = new Logger();
    }

    public int getCargo() {
        return cargo;
    }

    public void dockShip(Ship ship) {
        this.ship = ship;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.ship.getCargo() == 0) {
            this.load();
        } else {
            this.unload();
        }
        this.ship = null;
    }

    private void load() {
        ship.addCargo(this.cargo);
        this.cargo =0;
        logger.logCargoOfShip(this.ship);
    }

    private void unload() {
        this.cargo += this.ship.getCargo();
        this.ship.subCargo(this.ship.getCargo());
        logger.logCargoOfShip(this.ship);
    }
}
