import java.util.Scanner;
public class Trails {
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter First Value : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Value : ");
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("Sum of First And Second Value "+ sum);
    }
}