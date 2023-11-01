import java.util.Scanner;

public class kedua {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukan harga pertama = ");
        int pertama = userInput.nextInt();
        System.out.println("Masukan harga kedua = ");
        int kedua = userInput.nextInt();
        
        int hasilPertambahan = pertama + kedua;
        
        switch (hasilPertambahan) {
            case 1:
                System.out.print("satu");
                break;
            case 2:
                System.out.print("dua");
                break;
            case 3:
                System.out.print("tiga");
                break;
            case 4:
                System.out.print("empat");
                break;
            case 5:
                System.out.print("lima");
                break;
            case 6:
                System.out.print("enam");
                break;
            case 7:
                System.out.print("tujuh");
                break;
            case 8:
                System.out.print("delapan");
                break;
            case 9:
                System.out.print("sembilan");
                break;
            default:
                break;
            }
            String hasil = Integer.toString(hasilPertambahan).toLowerCase();
            if ("hasil" = 1){
                System.out.println("satu");
            }
    }
}