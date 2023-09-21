import java.util.Scanner;

public class Gaji07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int JmlMasuk, JmlTdkMasuk, TotGaji;
    int gaji=40000, potgaji=25000;
    System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
    JmlMasuk=input.nextInt();
    System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
    JmlTdkMasuk=input.nextInt();
    TotGaji=(JmlMasuk*gaji)-(JmlTdkMasuk*potgaji);
    System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}