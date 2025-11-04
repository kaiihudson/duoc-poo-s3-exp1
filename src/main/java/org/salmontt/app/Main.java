package org.salmontt.app;

import org.salmontt.model.*;

public class Main {
    public static void main(String[] args) {
        Address ap = new Address(Region.A, "Street1", "1", "303");
        Person p = new Person("Sebastian", ap, "12341232");
        System.out.println(p);

        Address ae1 = new Address(Region.B, "Street2", "040", "G13", "Lettuce");
        Employee e1 = new Employee("Maria", ae1, "12341234", EmployeeRole.Administration);
        System.out.println(e1);

        Employee e2 = new Employee(p.getName(), p.getAddress(), p.getIdentifier(), EmployeeRole.Logistics);
        System.out.println(e2);
    }
}