package EmployeePoject;

public class PTEmployee  extends Employee{
    
    public double getPay(){
        double pay;
        pay = rate * hours;
        totalpay += pay;
        return pay;
     }
}
