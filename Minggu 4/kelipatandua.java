  
public class kelipatandua {
    public static void main(String[] args) {

        System.out.println("           DO__WHILE        ");
        System.out.println("Bilangan kelipatan 2 (1-1000)");
        System.out.println("============================");
        int i = 1;
        do{
            System.out.print(i + "   ");
            i += i;
        }while(i<=1000);

    }
}