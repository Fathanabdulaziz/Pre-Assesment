import java.util.Scanner;

public class keduafix {
    static Scanner userInput = new Scanner(System.in);

    public static String konversiSatuan(int hasil) { //method satuan
        switch (hasil) {
            case 0:
                return "nol";
            case 1:
                return "satu";
            case 2:
                return "dua";
            case 3:
                return "tiga";
            case 4:
                return "empat";
            case 5:
                return "lima";
            case 6:
                return "enam";
            case 7:
                return "tujuh";
            case 8:
                return "delapan";
            case 9:
                return "sembilan";
            default:
                return "";
        }
    }

    public static String konversipuluhan(int hasil) { //method puluhan
        switch (hasil) {
            case 2:
                return "dua puluh";
            case 3:
                return "tiga puluh";
            case 4:
                return "empat puluh";
            case 5:
                return "lima puluh";
            case 6:
                return "enam puluh";
            case 7:
                return "tujuh puluh";
            case 8:
                return "delapan puluh";
            case 9:
                return "sembilan puluh";
            default:
                return "";

        }
    }
    public static void main(String[] args) {
        

        System.out.println("Masukan harga pertama = ");
        int pertama = userInput.nextInt(); //user input angka ke 1
        System.out.println("Masukan harga kedua = ");
        int kedua = userInput.nextInt(); //user input angka ke 2

        // rumus untuk mendeklarisikan 1 per 1:
        int hasil = pertama + kedua;
        int ratus = hasil / 100;
        int ratusan = ratus % 10;
        int puluh = hasil / 10;
        int puluhan = puluh % 10;
        int satuan = hasil % 10;

        if (ratusan != 0) { //perkondisian tidak boleh 0 pada ratusan
            if (ratusan == 1) {
                System.out.print("Seratus ");
            } else {
                System.out.print(konversiSatuan(ratusan)+ " ratus ");
            }
        }

        if (puluhan != 0) { // perkodndisian ketika puluhan
            if (puluhan == 1) {
                if (satuan == 0) {
                    System.out.println("sepuluh");
                    return;
                } else if (satuan == 1) {
                    System.out.print("sebelas");
                    return;
                }
                System.out.print(konversiSatuan(satuan) + " belas ");
                return;
            } else {
                System.out.print(konversipuluhan(puluhan) + " ");
            }
        }
        if (satuan != 0) { //perkondisian ketika satuan 
            System.out.print(konversiSatuan(satuan));
        }
        userInput.close();
    }

}

