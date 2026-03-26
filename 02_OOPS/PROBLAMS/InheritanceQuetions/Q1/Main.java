public class Main {
    public static void main(String[] args) {
        // Instantiate a MovieContent object
        MovieContent myMovie = new MovieContent(
            "Inception", 
            148, 
            "Christopher Nolan", 
            2010
        );
        // Invoke the display method
        myMovie.display_info();
    }
}