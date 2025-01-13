package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans)
    {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public void addHealthPlan(int index, String name)
    {
        if(index < 0 || index > healthPlans.length - 1)
        {
            System.out.println("This index is not allowed");
            return;
        }

        if(healthPlans[index] != null)
        {
            System.out.println("This index is full");
        }else{
            healthPlans[index] = name;
        }
    }

    public void ToString()
    {
        System.out.println("Id: " + id + " FullName: " + fullName + " Email: " + email + " Password: " + password);
    }
}
