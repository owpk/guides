package ToolsQA;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
    	File file = new File("file.txt");
    	Scanner sc = new Scanner(file);
    	while(sc.hasNext()) 
    	System.out.println(sc.next());
        //System.out.println( "Hello World!" );
    }
}
