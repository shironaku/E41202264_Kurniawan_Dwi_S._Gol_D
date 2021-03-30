import java.util.Scanner;
public class MinMax {

    public static void main(String[] args) {
        int jumlah = 0, banyak;
        float average;

        Scanner dataInput = new Scanner(System.in);

        System.out.print("Masukkan banyaknya data nilai = ");
        banyak = dataInput.nextInt();
        int data[] = new int[banyak];

        //input
        for (int i = 0; i < banyak; i++){
            System.out.print("Masukkan data nilai ke-" + (i+1) + " = ");
            data[i] = dataInput.nextInt();
        }
        System.out.println("");

        //minimum value
        int dataMax = data[0];
        int dataMin = data[0];
        for (int i = 0; i < banyak; i++){
            if (data[i] > dataMax){
                dataMax = data[i];
            }else{
                dataMin = data[i];
            }
        }
        System.out.println("Nilai minimum = " + dataMin);
        System.out.println("Nilai maximum = " + dataMax);

        //average
        for (int i = 0; i < banyak; i++){
            jumlah += data[i];
        }
        average = jumlah / banyak;
        System.out.println("Nilai rata ratanya adalah = " + average);
    }
}