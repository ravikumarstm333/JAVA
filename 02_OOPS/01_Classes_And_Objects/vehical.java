public class vehical {
    String manufacturer;
    String model;
    int productionYear;
    vehical(String manufacturer,String model,int productionYear){
        this.manufacturer=manufacturer;
        this.model=model;
        this.productionYear=productionYear;
    }
    vehical(String manufacturer,String model){
        this.manufacturer=manufacturer;
        this.model=model;
        this.productionYear=2026;
    }
    void displayDetails(){
        System.out.println("The vehical manufacturer name is :"+manufacturer);
        System.out.println("The vehical model name is :"+model);
        System.out.println("The vehical production year is :"+productionYear);
    }
    
}
