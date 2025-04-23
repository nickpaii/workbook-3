package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private float hoursWorked;
    private float payRate;


    public Employee(int employeeID, String name, float hoursWorked, float payRate) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getGrossPay() {
        return this.payRate * this.hoursWorked;
    }
}
