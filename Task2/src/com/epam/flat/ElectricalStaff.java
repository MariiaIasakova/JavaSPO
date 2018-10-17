package com.epam.flat;

public abstract class ElectricalStaff {
    private double valuePower;
    private String name;

    public ElectricalStaff(String name, double valuePower) {
        this.name = name;
        this.valuePower = valuePower;
    }

    public abstract void Activate();

    public int equals(ElectricalStaff obj) {
        return Double.compare(this.valuePower, obj.valuePower);
    }

    public double getValuePower() {
        return valuePower;
    }

    public void setValuePower(double valuePower) {
        this.valuePower = valuePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ElectricalStaff{" +
                "valuePower=" + valuePower +
                ", name='" + name + '\'' +
                '}';
    }
}
