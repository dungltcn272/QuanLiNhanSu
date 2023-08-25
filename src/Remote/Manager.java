/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Remote;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Manager extends Worker {

    private double hsl;

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public Manager() {
    }

    public double getHsl() {
        return hsl;
    }

    public void inputHsl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hsl: ");
        setHsl(sc.nextDouble());
    }

    public double lastSalary() {
        return (double) (getHsl() * getSalary());
    }

    public void outputInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Salary: " + getSalary());
        System.out.println("Address: " + getAddress());
        System.out.println("Position: " + getPosition());
        System.out.println("Last Salary: " + lastSalary());
    }
}
