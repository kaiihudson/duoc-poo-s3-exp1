package org.salmontt.model.employee;

import org.salmontt.model.person.Address;
import org.salmontt.model.person.Person;

/**
 * Employee class
 */
public class Employee extends Person {
    private EmployeeRole role;
    private final int id;

    /**
     * @param name          String to represent the person's name
     * @param address       Address object representing the person's address
     * @param identifier    String to represent the person's identifier. e.g. RUT
     * @param role          EmployeeRole enum to indicate its hierarchy on the company
     * @param id            int to identify the user inside the company
     */
    public Employee(String name, Address address, String identifier, EmployeeRole role, int id) {
        super(name, address, identifier);
        this.role = role;
        this.id = id;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Empleado " + id + " |\n Nombre: '" + getName() + "'.\n ID: '" + getIdentifier() + "'.\n Dirección: " + getAddress() +
                " \n Rol: " + role;
    }
}
