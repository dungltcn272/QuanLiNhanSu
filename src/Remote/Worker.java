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
public class Worker {
    private String name;
    private String date;
    private long salary;
    private String address;
    private String position;

    public Worker() {
    }

    public Worker(String name, String date, long salary, String address, String position) {
        this.name = name;
        this.date = date;
        this.salary = salary;
        this.address = address;
        this.position = position;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        System.out.println("Enter date: ");
        sc=new Scanner(System.in);
        setDate(sc.nextLine());
        System.out.println("Enter salary: ");
        setSalary(sc.nextLong());
        System.out.println("Enter address: ");
        sc=new Scanner(System.in);
        setAddress(sc.nextLine());
        System.out.println("Enter position (Employee, Manager or Ceo): ");
        sc=new Scanner(System.in);
        setPosition(sc.nextLine());
    }
    
    public void output(){
        System.out.println("Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Salary: " + getSalary());
        System.out.println("Address: " + getAddress());
        System.out.println("Position: " + getPosition());
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public long getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
