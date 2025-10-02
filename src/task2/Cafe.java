package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// 2.c
public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<String>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    // 2.c.a
    public void loadMenuData(){

        // 2.d
            try {
                File file = new File("coffees.txt");
                Scanner scan = new Scanner(file);
                // 2.e
                while(scan.hasNextLine()) {
                    coffeeMenu.add(scan.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Check path and filename");
            }
    }
}
