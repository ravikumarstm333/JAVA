public class employeeProfiles {
    int empId;
    String empName;
    String department;
    double salary;
    employeeProfiles(){
        empId=0;
        empName="Not Assigned";
        department="General";
        salary=0.0;
    }
    employeeProfiles(int empId,String name ,String department){
        this.empId=empId;
        empName=name;
        this.department=department;
        salary=0.0;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee Id is: "+empId);
        System.out.println("Employee Name is: "+empName);
        System.out.println("Employee Department is: "+department);
        System.out.println("Employee salary is: "+salary);
    }
    public static void main(String[] arrg){

    }
    
}