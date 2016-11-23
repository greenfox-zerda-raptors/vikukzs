/**
 * Created by Zsuzska on 2016. 11. 10..
 */
/**
 * File I/O: The copy command exercise
 *
 * This is just standard I/O and it's usually given as an early IT assignment.
 *
 * Given all that you've already seen and done, this should be fairly easy.
 *
 * This is how it should work, but NOTE ...
 * >>> means that what the computer does; and
 * <<< is what you the user does.
 *
 * >>> Enter the Source filename (assuming reading from C:\TEMP\) or give a different path name to?
 * <<< TestA.txt
 * >>> File does not exist, try again or blank to exit
 * <<< Test.txt
 * >>> Enter the Target filename (assuming writing to C:\TEMP\) or give a different path name?
 * <<< NewTest.txt
 * >>> Writing from C:\TEMP\Test.txt to C:\TEMP\NewTest.txt.  Press Y to confirm, N to abort.
 * <<< Y
 * >>> Done, wrote 102 Characters to C:\TEMP\NewTest.txt.
 *
 * Note that you should compute the working directory (e.g. C:\TEMP\).
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop17 {
    static String filePath,parentDirectory;

    static File randomDir, randomFile, randomFile2;
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args){
        String path;
        String prompt = "Enter the Source filename (assuming reading from C:\\TEMP\\) or give a different path name to?";

        System.out.println(prompt);

        while (input.hasNext()){
            path  = input.next();

            randomFile = new File(path);

            if (path.equals("q")){
                System.out.println("Bye!");
                break;
            }
            if (!randomFile.exists()) {
                System.out.println("File does not exist, try again or q to exit");
            }
            if (randomFile.exists()) {
                System.out.println("Enter the Target filename (assuming writing to C:\\TEMP\\) or give a different path name?\n");
            }
        }


    } // end of MAIN
} // end
