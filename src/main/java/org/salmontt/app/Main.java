package org.salmontt.app;

import org.salmontt.model.employee.Employee;
import org.salmontt.model.employee.EmployeeRole;
import org.salmontt.model.person.Address;
import org.salmontt.model.person.Region;

public class Main {
    public static void main(String[] args) {
        // empleado 1
        Address addressEmployee1 = new Address(Region.B, "Street2", "040", "G13", "Lettuce");
        Employee employee1 = new Employee("Maria", addressEmployee1, "12341234", EmployeeRole.Administration, 0);
        System.out.println(employee1);
        // empleado 2
        Address addressEmployee2 = new Address(Region.F, "Street9", "200");
        Employee employee2 = new Employee("Sebastian", addressEmployee2, "12341232", EmployeeRole.Logistics, 1);
        System.out.println(employee2);
        //empleado 3
        Address addressEmployee3 = new Address(Region.A, "Street00", "133", "A00");
        Employee employee3 = new Employee("Javier", addressEmployee3, "32141234", EmployeeRole.Finance, 3);
        System.out.println(employee3);
    }
}