package bintang_project;

public class id4 {

    protected static void hitung(int num){
        for(int i=1;i<=num;i++){
            for(int j=num; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
