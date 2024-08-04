import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            int starCount = (n + 1) - i;

            for (int k = 1; k <= (2 * starCount) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
















