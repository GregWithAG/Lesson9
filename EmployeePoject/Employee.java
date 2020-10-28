package EmployeePoject;


abstract public class Employee {
    protected String name;
    protected int type;
    protected double rate;
    protected double hours;
    protected static double totalpay;
    
    
    public Employee(){
        name = "";
        type = 0;
        rate = 0;
        hours = 0;
    }
    public boolean setName(String nm){
        boolean blank = (nm.equals(""));
        if(blank)
            return false;
        else{
            name = nm;
            return true;
            }
    }
    public boolean setRate(double rt){
        boolean rateok = rt >= 6.75 && rt <=30.50;
        if(rateok){
            rate=rt;
            return true;
        }
        else{
            return false;
        }
    }
    public final boolean setType(int t){
        boolean oneortwo = (t==1 || t==2);
        if(oneortwo){
            return true;
        }
        else{
            type = t;
            return false;
        }
    }
    
    public final boolean setHours(int hrs){
        boolean hoursok= hrs >=1 && hrs <=60;
        if (hoursok){
            hours = hrs;
            return true;
        }
        else{
            return false;
        }
    }
    public String getName(){
        return name;
    }
    
    public static double getTotalPay(){
        return totalpay;
    }
    
    abstract public double getPay();
     
     public static String getHourRules(){
         return "between 1 and 60";
         
    }
     public static String getRateRules(){
         return "between 6.75 and 30.50";
         
    }
     public static String getTypeRules(){
         return "between 1 or 2";
         
    }
     public static String getNameRules(){
         return "minumum 1 letter";
         
    }
    
}
