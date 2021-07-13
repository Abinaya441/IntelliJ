package bintang_project;

public class id3 {

    protected static void hitung(int num){
        for(int baris=1;baris<=num;baris++){
            int angka = num;
            for(int spasi=1;spasi<baris;spasi++){
                System.out.print(" ");
            }
            for(int bintang=num;bintang>=baris;bintang--){
                System.out.print(angka);
                angka--;
            }
            System.out.println();
        }
    }
}
