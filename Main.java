import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Find the series of fibonacci");
       Scanner fibonacci = new Scanner(System.in);
       int numFi = fibonacci.nextInt();
       int firstNumber = 0;
       int secondNumber = 1;
       for(int i = 1 ; i<=numFi ; i++){
       int c = firstNumber + secondNumber;
       System.out.println(firstNumber + " ");
           firstNumber = secondNumber;
            secondNumber = c;
       }
    }
}