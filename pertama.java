import java.util.Scanner;
//Disuruh buat codingan hasil enskripsi nilai dari user dengan (+5) apabila puluhan yang diambil satuannya saja
public class pertama {
    static Scanner userInput = new Scanner(System.in); //komputer nginput code
    
    private static int hasilTambah(int angka1h) { //Method penjumlahan +5
        angka1h += 5;
        if (angka1h >= 10){ //kondisi dimana hasil lebih dari 10
        angka1h %= 10;//dimodulus agar tidak lebih dari 10
        }
        return angka1h;
    }
    
    private static int digitPertama (int angkaPertama){ //Method digit ribuan
        int hasilRibuan = angkaPertama / 1000;
        int hasil4 = hasilRibuan % 10; 
    return hasil4;
    }
    private static int digitKedua (int angkaKedua){ //Method digit ratusan
        int hasilRatusan = angkaKedua / 100;
        int hasil2 = hasilRatusan % 10;
    return hasil2;
    }
    private static int digitKetiga(int angkaKetiga){//Method digit puluhan
        int hasilPuluhan = angkaKetiga / 10;
        int hasil3 = hasilPuluhan % 10;
    return hasil3;
    }
    private static int digitKeempat(int angkaKeempat){//Method digit satuan
        int hasil1 = angkaKeempat % 10;
    return hasil1;
    }
    
    public static void main(String[] args) { //PSVM
        System.out.println("Masukan angka inputanya :");
        int angka1 = userInput.nextInt();//user masukan angka pada line 1
        int angka2 = userInput.nextInt();//user masukan angka pada line 2
        int angka3 = userInput.nextInt();//user masukan angka pada line 3
        
        //Deklariskan method digit
        int digit1S = digitPertama(angka1); int digit1D = digitPertama(angka2); int digit1T = digitPertama(angka3);
        int digit2S = digitKedua(angka1); int digit2D = digitKedua(angka2); int digit2T = digitKedua(angka3);
        int digit3S = digitKetiga(angka1); int digit3D = digitKetiga(angka2); int digit3T = digitKetiga(angka3);
        int digit4S = digitKeempat(angka1); int digit4D = digitKeempat(angka2); int digit4T = digitKeempat(angka3);

        //masukin method digit didalam method pertambahan
        digit1S = hasilTambah(digit1S); digit1D = hasilTambah(digit1D); digit1T = hasilTambah(digit1T); 
        digit2S = hasilTambah(digit2S); digit2D = hasilTambah(digit2D); digit2T = hasilTambah(digit2T); 
        digit3S = hasilTambah(digit3S); digit3D = hasilTambah(digit3D); digit3T = hasilTambah(digit3T); 
        digit4S = hasilTambah(digit4S); digit4D = hasilTambah(digit4D); digit4T = hasilTambah(digit4T);

        //nyetak bahasa
        System.out.println("----------------------");
        System.out.println("Hasil Enskripsi");
        System.out.println(digit1S + ""  + digit4S + "" + digit3S + "" + digit2S);
        System.out.println(digit1D + ""  + digit4D + "" + digit3D + "" + digit2D);
        System.out.println(digit1T + ""  + digit4T + "" + digit3T + "" + digit2T);
        
        userInput.close();
    }

}