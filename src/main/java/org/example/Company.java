package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames)
    {
        this.id = id;
        this.name = name;
        this.giro = giro >= 0 ? giro : 0;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro >= 0 ? giro : 0;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name)
    {
        if(index < 0 || index > developerNames.length - 1)
        {
            System.out.println("This index is not allowed");
            return;
        }

        if(developerNames[index] != null)
        {
            System.out.println("This index is full");
        }else{
            developerNames[index] = name;
        }
    }

    public void ToString()
    {
        System.out.println("Id: " + id + " Name: " + name + " Giro: " + giro);
    }
}
