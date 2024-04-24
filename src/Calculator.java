import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first and the Second number - ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");

        char ch = scanner.next().charAt(0);
        solve(a, b, ch);
    }

    public static int solve(int a, int b, char ch) {
        int ans = 0;
        if (ch == '+') {
            ans = a + b;
        } else if (ch == '-') {
            ans = a - b;
        } else if (ch == '*') {
            ans = a * b;
        } else if (ch == '/') {
            ans = a / b;
        } else {
            System.out.println("Error! Enter correct operator");
        }
        System.out.println("Your answer is - " + ans);
        return ans;
    }
}