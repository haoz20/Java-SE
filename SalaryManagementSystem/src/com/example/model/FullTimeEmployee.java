package com.example.model;

public class FullTimeEmployee extends Employee {
    private double allowance;
    private double bonus;

    public FullTimeEmployee(String name, double basicSalary, double allowance, double bonus) {
        super(name, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        Double result = this.getBasicSalary() + this.allowance + this.bonus;
        return result;
    }

}
