import java.util.Scanner;
public class HargaBayar07 {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int harga, jumlah;
    double dis=0.1, total, bayar, jmlDis;

    System.out.println("Masukkan Harga Barang yang Dibeli!");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah-Jumlah Barang yang Dibeli!");
    jumlah=input.nextInt();
    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    System.out.println("Diskon yang anda dapat adalah" + jmlDis);
    System.out.println("Jumlah yang Harus Dibayar adalah" + bayar);

    
    }
}
