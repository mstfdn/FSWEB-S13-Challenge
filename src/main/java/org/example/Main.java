package org.example;

public class Main {
    public static void main(String[] args) {
        allOperations();
    }

    public static void allOperations()
    {
        Healthplan healthplan = new Healthplan(1,"MF-Sigorta", Plan.BASIC);
        healthplan.ToString();
        String[] healthPlans = new String[2];
        healthPlans[0] = healthplan.getName();
        Employee employee = new Employee(1,"Mustafa Fidan", "mfe@gmail.com","12345",healthPlans);
        employee.ToString();
        String[] developerNames = new String[5];
        developerNames[0] = "Mert";
        developerNames[1] = "Oğuz";
        developerNames[2] = "Mustafa";
        developerNames[3] = "Hilal";
        developerNames[4] = "Asım";
        Company company = new Company(1,"MF Software",100000, developerNames);
        company.ToString();
    }
}