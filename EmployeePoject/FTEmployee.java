package EmployeePoject;

public class FTEmployee extends Employee{
    
     public double getPay(){
        double pay;
        if (hours > 40) {
            pay = rate * 40 + (hours - 40) * rate *2;
        }
        else{
            pay = rate * hours;
        }
        totalpay += pay;
        return pay;
     }
    
}




