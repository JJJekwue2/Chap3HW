import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     // Prompt user to enter height and weight in inches and pounds //
        System.out.println("Enter weight in pounds");
        int weightPounds = input.nextInt();
        System.out.println("Enter height in inches");
        int heightInches = input.nextInt();
    //Convert Pounds to Kilos and inches to meters //
        float weightKilos = (float) (weightPounds * 0.4536);
        float heightMeters = (float) (heightInches * 0.0254);
    // Calculate BMI //
        float BMI = (weightKilos / (heightMeters * heightMeters));
    // Print Result //
        System.out.println("Your BMI is "+BMI);
    // Interpret BMI and classify //
        if (BMI <= 18.5)
        {
            System.out.println("You are underweight");
        } else if (BMI > 18.6 && BMI <= 24.9) 
        {
            System.out.println("You are normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) 
        {
            System.out.println("You are overweight");
        } else if (BMI >= 30) {
            System.out.println("You are obese");
        }
    }
}
