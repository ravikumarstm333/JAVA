public class LibraryBook {
    private String title;
    private String isbn;
    private boolean isbrrowed;
    public void getters(){
        System.out.println("Title is :"+title);
        System.out.println("isbn :"+isbn);
    }
    public void borrowBook(){
        if(isbrrowed==false){
            isbrrowed=true;
            System.out.print("valid Succes");
        }else{
            System.out.print("here an error");
        }

    }
    public void returnBook(){
        isbrrowed=false;
    }

    
}
