package TASK1;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);

        System.out.println("|               BMI CALCULATOR               |");

        //Reading user inputs
        System.out.println("Enter your height in cm: ");
        double height = read.nextDouble();
        System.out.println("Enter your weight in kg: ");
        double weight = read.nextDouble();

        //Converting height from centimeters into meters
        height /= 100;
        //Calculating bmi
        double bmi = weight / (height * height);

        //Output displaying bmi and categories as per WHO
        System.out.println("\n\n\n      Your BMI is "+ bmi);
        System.out.print("\n      Category : ");
        if (bmi<=18.5){
            System.out.println("Underweight");
        }
        else if (bmi<=24.9){
            System.out.println("Normal weight");
        }
        else if (bmi<=29.9){
            System.out.println("Pre-obese");
        }
        else{
            System.out.println("obese");
        }


    }
}
