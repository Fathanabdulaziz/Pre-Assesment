import java.util.Scanner;
public class ketiga {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukan Gender = ");
        String gender = userInput.nextLine();
        System.out.print("berat badan = ");
        double bb = userInput.nextDouble();
        System.out.print("tinggi badan = ");
        double tinggi = userInput.nextDouble();

        double meter = tinggi / 100;
        double bmi = (bb / (Math.pow(meter, 2)));

        System.out.printf("%.2f, ",bmi);
        asli(gender, bmi);
    }
        
        public static void asli (String gender, double bmi){
        switch (gender) {
            case "Pria":
                if (bmi < 20.50) {
                    System.out.println("Kurus");
                } else if (bmi >= 20.50 && bmi <= 26.99) {
                    System.out.println("Ideal");
                } else if (bmi >= 27.00) {
                    System.out.println("Gemuk");
                }
                break;
            case "Wanita":
                if (bmi < 18.50) {
                    System.out.println("Kurus");
                } else if (bmi >= 18.50 && bmi <= 24.99) {
                    System.out.println("Ideal");
                } else if (bmi >= 25.00) {
                    System.out.println("Gemuk");
                }
            default:
             System.out.println("Masukan Gender yang benar !!!!");
                break;
            }
        }
    }

