/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Remote;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class ListWorkers {

    static ArrayList<Worker> listAll = new ArrayList<>();
    static ArrayList<Employee> listEmp = new ArrayList<>();
    static ArrayList<Manager> listMana = new ArrayList<>();
    static ArrayList<CEO> listCeo = new ArrayList<>();

    public void inputs() {
        String choice;
        Scanner sc = new Scanner(System.in);
        do {
            Worker wk = new Worker();
            wk.input();
            listAll.add(wk);
            switch (wk.getPosition().toLowerCase()) {
                case "employee": {
                    Employee emp = new Employee();
                    emp.setName(wk.getName());
                    emp.setDate(wk.getDate());
                    emp.setSalary(wk.getSalary());
                    emp.setAddress(wk.getAddress());
                    emp.setPosition(wk.getPosition());
                    emp.inputHsl();
                    listEmp.add(emp);
                    break;
                }
                case "manager": {
                    Manager mana = new Manager();
                    mana.setName(wk.getName());
                    mana.setDate(wk.getDate());
                    mana.setSalary(wk.getSalary());
                    mana.setAddress(wk.getAddress());
                    mana.setPosition(wk.getPosition());
                    mana.inputHsl();
                    listMana.add(mana);
                    break;
                }
                case "ceo": {
                    CEO ceo = new CEO();
                    ceo.setName(wk.getName());
                    ceo.setDate(wk.getDate());
                    ceo.setSalary(wk.getSalary());
                    ceo.setAddress(wk.getAddress());
                    ceo.setPosition(wk.getPosition());
                    listCeo.add(ceo);
                }
                default:
                    break;
            }
            System.out.println("-----------------");
            System.out.println("Continue? (Y/N): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
    }

    public void outputs() {
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        do {
            int choice;
            System.out.println("-----Choose view employee list-----");
            System.out.println("1: All");
            System.out.println("2: Employee");
            System.out.println("3: Manager");
            System.out.println("4: Ceo");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    for (Worker all : listAll) {
                        all.output();
                        System.out.println("");
                    }
                }
                case 2: {
                    for (Employee emp : listEmp) {
                        emp.outputInfo();
                        System.out.println("");
                    }
                }
                case 3: {
                    for (Manager mana : listMana) {
                        mana.outputInfo();
                        System.out.println("");
                    }
                }
                case 4: {
                    for (CEO ceo : listCeo) {
                        ceo.output();
                        System.out.println("");
                    }
                }
                default:
                    break;
            }
            System.out.println("-----------------");
            System.out.println("Continue? (Y/N): ");
            ch = sc.next();
        } while (ch.equalsIgnoreCase("y"));

    }
}
