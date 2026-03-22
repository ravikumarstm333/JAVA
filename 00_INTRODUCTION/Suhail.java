import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;

public class Suhail {

    public static void main(String[] args) {

        PrintStream console = System.out; // save console

        try {
            PrintStream fileOut = new PrintStream(new File("output.txt"));
            System.setOut(fileOut);

            System.out.println("Suhail beta");
            System.out.println("This goes to file");

            System.setOut(console); // restore console
            System.out.println("This goes to terminal");

            fileOut.close();

        } catch (FileNotFoundException e) {
            System.setOut(console);
            System.out.println("File error: " + e.getMessage());
        }
    }
}
