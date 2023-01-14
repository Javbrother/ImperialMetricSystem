import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose system to use(Imperial or Metric): ");
        String result = scanner.nextLine().toLowerCase();

        if (result.equals("imperial")) {
            System.out.println("Imperial system is activated!");
            System.out.print("Enter feet or inch to use: ");
            String option = scanner.nextLine().toLowerCase();
            if (option.equals("feet")) {
                System.out.print("How many feet you want to convert to cm: ");
                String input = scanner.nextLine();
                if (isNumeric(input)) {
                    double userInputA = Double.parseDouble(input);
                    Feet feet = new Feet(userInputA);
                    double res = feet.toConvert();
                    System.out.println("Result:" + res + "cm");
                } else {
                    System.out.println("This is not a  number!");
                }
            } else if (option.equals("inch")) {
                System.out.print("How many feet you want to convert to cm: ");
                String input = scanner.nextLine();
                if (isNumeric(input)) {
                    double userInputB = Double.parseDouble(input);
                    Inch inch = new Inch(userInputB);
                    double res = inch.toConvert();
                    System.out.println("Result:" + res + "cm");
                } else {
                    System.out.println("This is not a  number!");
                }
            }
        } else if (result.equals("metric")) {
            System.out.println("Metric system is activated!");
            System.out.print("Choose to convert to(feet or inch): ");
            String input = scanner.nextLine();
            if (input.equals("inch")) {
                System.out.print("Insert value in cm: ");
                String value1 = scanner.nextLine();
                if (isNumeric(value1)) {
                    double userInputB = Double.parseDouble(value1);
                    Cm cm = new Cm(userInputB);
                    double res = cm.toConvertInch();
                    System.out.print("Result:" + res + "inches");
                } else {
                    System.out.println("Invalid input!");
                }
            } else if (input.equals("feet")) {
                System.out.print("Insert value in cm: ");
                String value2 = scanner.nextLine();
                if (isNumeric(value2)) {
                    double userInputB = Double.parseDouble(value2);
                    Cm cm = new Cm(userInputB);

                    double res = cm.toConvertFeet();

                    System.out.print("Result:" + res + "feet");
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    public static boolean isNumeric(String str) { // see  kontrollib kas on arvud või miski muu
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}