import java.util.Scanner;

public class Tugas10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] input=new int [4];
        System.out.println("Kalkulator Sederhana");
        System.out.println("====================");
        System.out.println("Pilih Tenik Arimatika : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("Choose : ");
        int choose = scn.nextInt();

        for (int i= 0; i < input.length; i++){
            System.out.print("Masukkan Angka ke-"+ (i + 1)+":");
            input[i]= scn.nextInt();
        }

        if(choose==1){
            for (int i = 1; i < input.length; i++) {
                input[0]+=input[i];
            }
            System.out.println("Hasil penjumlahan: " + input[0]);
        }else if(choose==2){
            for (int i = 1; i < input.length; i++) {
                input[0]-=input[i];
            }
            System.out.println("Hasil pengurangan: " + input[0]);
        }else{
            System.out.println("Tidak Valid");
        }

    }
}

