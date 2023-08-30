import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;

        //asks the person to write the temperature
        System.out.println("Write the temperature in Celsius: ");
        double celsius =input.nextDouble();

        //takes the Celsius double and adds it into the conversion formula for Fahrenheit
        fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        //prints out the conversion and locks the decimals with "%,.2f"
        System.out.printf("The temperature in Fahrenheit is: " + "%,.2f", fahrenheit);

        input.close();
    }
}