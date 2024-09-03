import java.util.Scanner;

public class QuadraticSolver {

    /**
     * Main instance, contains a basic text interface.
     * @param args No overrides provided
     */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a quadratic equation solver. Please keep in mind these are equations in the form of ax^2+bx+c=0 and your equation must have x-intercepts");
        System.out.println("Provide the value for 'a':");

        int a = scanner.nextInt();

        System.out.println("Provide the value for 'b':");
        int b = scanner.nextInt();

        System.out.println("Provide the value for 'c':");
        int c = scanner.nextInt();

        System.out.println("Result:");
        double[] result = calculateX(a,b,c);
        for(double num : result){
            System.out.println(num);
        }

        scanner.close();
    }

    /**
     * Core calculation method, returns the two possible values for the quadratic equation.
     * @param a value of a
     * @param b value of b
     * @param c value of c
     * @return the two possible values to solve the equation
     */
    public static double[] calculateX(int a, int b, int c){
        int discriminant = (b*b - 4*(a*c));
        double[] numbers = {(-b + Math.sqrt(discriminant))/2*a, (-b - Math.sqrt(discriminant))/2*a};
        return numbers;
    }
}
