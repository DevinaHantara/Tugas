import  java.util.Scanner;


public class Tugas6 {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int angka = 1;
    do{
        System.out.print("masukkan angka: ");
        angka = input.nextInt();
        int hasil = angka;
        System.out.print("Perkalian faktorial adalah: ");
        for(int n = angka; n>0; n--){
            System.out.print(n);   
            if(n>1){
                System.out.print("x");
            if(angka != n){
                hasil *=n;
            }
            }
        };
        System.out.println("");
        System.out.println("hasil:"+hasil); 
    } 
    while(angka!=0); 
        }
    }


    
