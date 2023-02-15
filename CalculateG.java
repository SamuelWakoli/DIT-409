import java.util.Scanner;

class CalculateG {

    // get multiplication of two numbers
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // get square of a single numbeer
    public static double square(double num) {
        return num * num;
    }

    // get summation of two numbers
    public static double summation(double num1, double num2) {
        return num1 + num2;
    }

    // output result
    public static void outline(String resultInfo, double result) {
        System.out.println(resultInfo + result);
    }

    // main method
    public static void main(String[] arguments) {

        // scanner object
        Scanner input = new Scanner(System.in);

        // original variables provided in the question
        final double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        // Add the formulas for position and velocity
        // 𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
        // 𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖

        finalPosition = (0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition)
                / fallingTime;

        finalVelocity = (gravity * fallingTime + initialVelocity) / fallingTime;

        // outputting final position and velocity
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
        // Add output line for velocity (similar to position)
        System.out.println("The object's velocity after " + fallingTime + " seconds is "
                + finalVelocity + " m/s.");


        
        // get user input
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        // outputting results by calling outline()
        outline("\nMultiplication result: ", multiplication(num1, num2));
        outline("Square result for " + num1 + " : ", square(num1));
        outline("Square result for " + num2 + " : ", square(num2));
        outline("Summation result: ", summation(num1, num2));

        // close scanner object
        input.close();
    }
}