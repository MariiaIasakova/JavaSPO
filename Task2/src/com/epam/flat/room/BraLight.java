package com.epam.flat.room;

import com.epam.flat.ElectricalStaff;

public class BraLight extends ElectricalStaff {

    public BraLight(String name, double valuePower) {
        super(name, valuePower);
    }

    public void Activate() {
        System.out.println("BraLight " + getName() + " turn on.");
    }

}
