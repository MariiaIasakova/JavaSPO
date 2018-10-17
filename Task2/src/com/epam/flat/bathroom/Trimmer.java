package com.epam.flat.bathroom;

import com.epam.flat.ElectricalStaff;

public class Trimmer extends ElectricalStaff {

    public Trimmer(String name, double valuePower) {
        super(name, valuePower);
    }

    @Override
    public void Activate() {
        System.out.println("Trimmer " + getName() + " turn on.");
    }

}
