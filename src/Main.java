import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz.");
        int sayi=scanner.nextInt();
        for (int i=1;i<sayi;i++){
            if (i%2==0){
                System.out.print(i+",");
            }
        }
    }
}