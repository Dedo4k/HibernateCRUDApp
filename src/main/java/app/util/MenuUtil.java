package app.util;

public class MenuUtil {

    public static void mainMenu() {
        System.out.println();
        System.out.println("Choose operation:");
        System.out.println("[1] print all students");
        System.out.println("[2] print student by id");
        System.out.println("[3] print all cities");
        System.out.println("[4] print city by id");
        System.out.println("[5] add new student");
        System.out.println("[6] update student by id");
        System.out.println("[7] delete student by id");
        System.out.println("[8] add new city");
        System.out.println("[9] update city by id");
        System.out.println("[10] delete city by id");
        System.out.println("[11] exit");
    }

    public static void studentIdMenu() {
        System.out.println();
        System.out.print("Enter student id: ");
    }

    public static void cityIdMenu() {
        System.out.println();
        System.out.print("Enter city id: ");
    }

    public static void firstNameMenu() {
        System.out.println();
        System.out.print("Enter first name: ");
    }

    public static void lastNameMenu() {
        System.out.println();
        System.out.print("Enter last name: ");
    }

    public static void contactMenu() {
        System.out.println();
        System.out.print("Enter your contact number: ");
    }

    public static void cityMenu() {
        System.out.println();
        System.out.println("Choose your city: ");
    }

    public static void cityNameMenu() {
        System.out.println();
        System.out.print("Enter city name: ");
    }
}
