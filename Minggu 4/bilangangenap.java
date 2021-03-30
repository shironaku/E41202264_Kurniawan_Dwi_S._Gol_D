import java.util.Scanner;

public class BilanganGenap {


    public static void main(String[] args) {
        int bilgep;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Batas Angka Bilangan Genap = ");
        bilgep= keyboard.nextInt();

        for(int i=2; i<=bilgep; i+=2){
            System.out.print(i + " ");
        }

    }
}