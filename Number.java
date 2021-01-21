import java.util.Scanner;
public class Number {
public static void main(String args[]) {
int bil, awal, akhir;
        
         System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
		 awal = 10;
		 akhir = 100;
         System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}