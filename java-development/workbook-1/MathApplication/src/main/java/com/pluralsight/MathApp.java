package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobsSalary = 50000;
        int garysSalary = 80000;

        int highestSalary = Math.max(bobsSalary, garysSalary);

        System.out.println("The highest salary is "+ highestSalary);

        float carPrice = 100000.00f;
        float truckPrice = 50000.00f;

        float lowestVariable = Math.min(carPrice, truckPrice);
        System.out.println("The smallest variable is " +lowestVariable);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(" The area of the circle is " + area);







    }
}