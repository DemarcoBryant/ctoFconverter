//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        while (true) {
            System.out.print("Enter a temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                break;
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("close")) {
                    System.out.println("Program terminated.");
                    return;
                }
                System.out.println("Invalid input. Please reenter a valid numeric temperature value.");
            }
        }
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        double freezingCelsius = 0;
        double boilingCelsius = 100;
        double freezingFahrenheit = (freezingCelsius * 9 / 5) + 32;
        double boilingFahrenheit = (boilingCelsius * 9 / 5) + 32;
        System.out.println("Freezing point of water: " + freezingCelsius + " degrees Celsius = " +
                freezingFahrenheit + " degrees Fahrenheit");
        System.out.println("Boiling point of water: " + boilingCelsius + " degrees Celsius = " +
                boilingFahrenheit + " degrees Fahrenheit");
    }
}