import java.util.Arrays;
import java.util.Scanner;

public class Array_insert {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element in array : ");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " Elements : ");
        for(int i = 0; i<size; i++) {
            System.out.println(" Enter" + (i+1) + " Element");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Insert the position you want to insert value ");
        int position = scanner.nextInt();

        if(position<0 || position>numbers.length || position>size) {
            System.out.println("Wrong position");
        }
        else {
            System.out.println("Enter your element : ");
            int element = scanner.nextInt();

            for(int i = size; i>position-1; i--) {
                numbers[i] = numbers[i-1];
            }
            numbers[position-1] = element;
        }
        System.out.println(Arrays.toString(numbers));
    }

}