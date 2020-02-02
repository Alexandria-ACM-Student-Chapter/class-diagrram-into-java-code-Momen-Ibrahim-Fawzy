package hello.world;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class Employee {
    private int id , salary;
    private String firstName , lastName;
    public Employee (int id , String firstName, String lastName , int salary ){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the Name="firstName lastName"
     */
    public String gettName(String firstName ,String lastName) {
        String name=""+firstName+" "+ lastName+"";
        return name;
    }
    //OR
    /*public String gettName(String firstName ,String lastName) {
        return firstName+lastName;
    }*/
    
    
    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }
    
    /**
     * @get the salary
     */
    public void setSalary(int salary){
    this.salary=salary;
    }
    
    /**
     * @return the salary*12
     */
    public int getAnnualSalary(){
        return this.salary*12;
    }
    
    /**
     * @set the salary=salary+salary*percent
     * @return the salary(it will lose the fraction case it is int)
     */
    public int raiseSalary(double percent){
    salary+=percent*salary;
    return salary;
    }
    
    /**
     * @return "Employee[id=? name=firstName lastName salary=?]"
     */
    public String changeToString(){
    return "Employee[id="+id+",name="+firstName +" "+lastName+",salary="+salary+"]" ;
     //change;
    } 
    
}
