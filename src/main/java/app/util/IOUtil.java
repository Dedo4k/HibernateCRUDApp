package app.util;

import java.util.Scanner;

public class IOUtil {

    private static Scanner scanner;

    public static int getInteger() {
        scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String getString() {
        scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()) {
            scanner.next();
        }
        return scanner.nextLine();
    }
}
