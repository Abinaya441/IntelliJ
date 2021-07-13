package bintang_project;
import java.util.Scanner;

public class id0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai = ");
        int num = sc.nextInt();
        System.out.println("Pilih Pola = ");
        int opt = sc.nextInt();
        switch (opt){
            case(1):
                id1.hitung(num);
                break;
            case(2):
                id2.hitung(num);
                break;
            case(3):
                id3.hitung(num);
                break;
            case(4):
                id4.hitung(num);
                break;
            default:
                System.out.println("Tidak Ada Pilihan");
        }
    }
}
