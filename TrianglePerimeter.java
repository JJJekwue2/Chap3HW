import java.util.Scanner;
public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter 3 sides of the triangle //
        System.out.println("Enter side 1.");
        int Side1 = input.nextInt();
        System.out.println("Enter side 2.");
        int Side2 = input.nextInt();
        System.out.println("Enter side 3.");
        int Side3 = input.nextInt();
        // Find out if inputs are valid //
        if (Side1 + Side2 > Side3) {
            if (Side1 + Side3 > Side2){
                if (Side2 + Side3 > Side1){
                    int Perimeter = Side1 + Side2 + Side3;
                    System.out.println("The perimeter is"+ Perimeter);

                }
                else
                {
                    System.out.println("Invalid Input.");
                }
            }
            else
            {
                System.out.println("Invalid Input.");
            }
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}
