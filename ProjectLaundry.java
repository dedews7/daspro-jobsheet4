import java.util.Scanner;
public class ProjectLaundry {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nama, alamat;
    String payment="qris/bank/eWallet/cash";
    String jasa="antar/ambil";
    String jeniscuci="basah/kering/setrika lipat";
    double basah=4000, kering=4500, setrikalipat=5000, TotHarga, discLog=0.05, JmlDisc, Hasedis;
    int JmlKg;

    System.out.println("Masukkan Nama Penyewa!");
    nama=input.next();
    System.out.println("Masukkan Jumlah Kg!");
    JmlKg=input.nextInt();
    System.out.println("Pilih Jenis Cucian");
    System.out.println(jeniscuci);
    jeniscuci=input.next();
    System.out.println("Pilih Jasa!");
    System.out.println(jasa);
    jasa=input.next();
    System.out.println("Masukkan Alamat!");
    alamat=input.next();

     TotHarga=basah=4000*JmlKg;
     TotHarga=kering=4500*JmlKg;
     TotHarga=setrikalipat=5000*JmlKg;

     JmlDisc=TotHarga*discLog;
     Hasedis=TotHarga-JmlDisc;


System.out.println("Total Harga Cucian Anda:" +Hasedis);
System.out.println("Pilih Payment");
System.out.println(payment);
payment=input.next();


    }
}   
