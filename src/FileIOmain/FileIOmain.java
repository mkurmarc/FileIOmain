package FileIOmain;

import java.util.Scanner;

public class FileIOmain {

    public static void main(String[] args) {
        String filename = "groceries.txt", item;

         // file name and item variables
        Scanner keyboard = new Scanner(System.in);

        // Get item count
        System.out.print("How many items do you have? ");
        int numItems = keyboard.nextInt();

        // clear keyboard buffer
        keyboard.nextLine();

    }
}
