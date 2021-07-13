package bintang_project;

public class id2 {

    protected static void hitung(int num){
        for(int i=0;i<=num;i++){
            int k = 1;
            for(int j=num;j>i;j--){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
