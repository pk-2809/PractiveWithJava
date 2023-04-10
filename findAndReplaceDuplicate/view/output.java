package findAndReplaceDuplicate.view;

import java.util.Scanner;

public class output {

    private Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.println("Please enter a string:");
        return scanner.nextLine();
    }

}
