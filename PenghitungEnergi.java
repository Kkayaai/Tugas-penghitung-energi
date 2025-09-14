
import java.util.Scanner;

public class PenghitungEnergi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Hari kita akan Menghitung energi potensial dan kinetik");
        System.out.println("misal dengan gravitasi (10 m/s^2)");
        int nilaimassa, nilaikecepatan, nilaiketinggian, nilaienergipotensial, nilaienergikinetik, nilaienergimekanik, garivitasi;
        System.out.println("masukan berapa massa-nya? (dalam bentuk kg)");
        nilaimassa=input.nextInt();
        System.out.println("masukan berapa kecepatannya? (dalam bentuk m/s^2)");
        nilaikecepatan=input.nextInt();
        System.out.println("masukan berapa ketinggiannya?(dalam bentuk m)");
        nilaiketinggian=input.nextInt();
        nilaienergipotensial=10*nilaimassa*nilaiketinggian;
        System.out.println("Hasil untuk energi potensial adalah =" + nilaienergipotensial);
        nilaienergikinetik=nilaimassa*nilaikecepatan*nilaikecepatan/2;
        System.out.println("Hasil untuk energi Kinetik adalah=" + nilaienergikinetik);
        nilaienergimekanik=nilaienergipotensial+nilaienergikinetik;
        System.out.println("Hasil untuk energi mekanik adalah=" + nilaienergimekanik);






    }
}
