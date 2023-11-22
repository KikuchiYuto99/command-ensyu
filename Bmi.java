import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2人分の身長と体重を入力してください");
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double height2 = sc.nextDouble();
        double weight2 = sc.nextDouble();
        double height_bmi = height / 100;
        double height_bmi2 = height2 / 100;
        double bmi = weight / (height_bmi * height_bmi);
        double bmi3 = weight2 / (height_bmi2 * height_bmi2);
        String sv = String.format("%.2f", bmi);
        String sv2 = String.format("%.2f", bmi3);
        double bmi2 = Double.parseDouble(sv);
        double bmi4 = Double.parseDouble(sv2);
        System.out.println("1人目のBMIは" + bmi2 + "です");
        System.out.println("2人目のBMIは" + bmi4 + "です");
    }
}


