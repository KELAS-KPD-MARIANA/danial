package Gaji;
import java.util.Scanner;
public class Gaji { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        double komisyen;
        double gaji_asas = 1800;
        int bil;
        
        System.out.print("Masukkan bilangan kereta: ");
        bil = input.nextInt();
        
        if(bil > 10) {
            komisyen = 10000;
        } else if(bil>=5 && bil<=9) {
            komisyen = 6000;
        } else if(bil>=1 && bil<=4) {
            komisyen = 3000;
        } else { 
            komisyen = 0;
        }
        
        double jumlah_gaji = gaji_asas + komisyen;
        
        System.out.println("Bilangan kereta yang dapat dijual ialah: " + bil);
        System.out.println("Komisyen anda ialah: " + komisyen);
        System.out.println("Jumlah gaji anda: " + jumlah_gaji);
    }
}