public class EmployeeID {
    String name;
    static int empid;
    static int totalHire;

    EmployeeID(String name){
        this.name=name;
        totalHire++;
        empid++;
    }
    void displayDetails(){
        System.out.println("employe name is :"+name);
        System.out.println("employee id is :"+empid);
        System.out.println("Total hire employeee :"+totalHire);
    }
}
