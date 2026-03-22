public class Main {
    public static void main(String []arg){
        // employeeProfiles em1=new employeeProfiles(1,"ravi","Student");
        // em1.displayEmployeeDetails();


        // vehical v1=new vehical(null, "Frod mustaing",1987);
        // vehical v2=new vehical(null, "Tesla model");
        // v1.displayDetails();
        // v2.displayDetails();


        String [] employes={"ravi","Suhail","Sanchit"};
        for(String i:employes){
            EmployeeID a=new EmployeeID(i);
            a.displayDetails();
        }
    } 
}
