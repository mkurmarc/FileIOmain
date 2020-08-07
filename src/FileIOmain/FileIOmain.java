package FileIOmain;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOmain {

    public static void main(String[] args) throws IOException {
        String filename = "src/files/groceries2.txt", item;

         // file name and item variables
        Scanner keyboard = new Scanner(System.in);

        // get item count
        System.out.print("How many items do you have? ");
        int numItems = keyboard.nextInt(); // using nextInt() leaves data inside of memory, keyboard buffer, erase it

        // clear keyboard buffer
        keyboard.nextLine();

        /*
        FileWriter notes:
        - if no file exists to write to, then FWriter will create a new file automatically and
        write to it.
         */

        // create FileWriter object
        FileWriter fwriter = new FileWriter(filename, true);

        //create and open file
        PrintWriter outputFile = new PrintWriter(fwriter);

        // get items and write to file
        for(int i = 0; i < numItems; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            item = keyboard.nextLine();
            outputFile.println(item);
        }

        // close file
        outputFile.close();
        System.out.println("File written.");

    }
}
