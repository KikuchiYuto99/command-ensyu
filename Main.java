import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身長と体重を入力してください");
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double height_bmi = height / 100;
        double bmi = weight / (height_bmi * height_bmi);
        String sv = String.format("%.2f", bmi);
        double bmi2 = Double.parseDouble(sv);
        System.out.println("あなたのBMIは" + bmi2 + "です");
    }
}
