import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height*height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <25 ) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
