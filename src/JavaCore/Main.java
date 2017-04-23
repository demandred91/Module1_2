package JavaCore;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Please enter array size: ");
        int size = in.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "] = ");
            mas[i] = in.nextInt();
        }
        in.nextLine();
        String decision;
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) to find an element;");
            System.out.println("2) to sort it in ascending order;");
            System.out.println("3) to sort it in descending order;");
            System.out.println("4) to quit the program");
            decision = in.nextLine();
            switch (decision) {
                case "1": {
                    findElement(mas);
                    break;
                }
                case "2": {
                    sortInAscending(mas);
                    break;
                }
                case "3": {
                    sortInDescending(mas);
                    break;
                }
                case "4": {
                    System.out.println("Goodbye! Thanks for using my program!");
                    break;
                }
                default: {
                    System.out.println("Incorrect input! Please try again!");
                    break;
                }
            }
        } while (!(decision.equals("4")));
        in.close();
    }

    private static void findElement(int arr[]) {
        System.out.print("Enter an element you want to find in array: ");
        int element = in.nextInt();
        in.nextLine();
        int count = 0;
        System.out.print("Your element was found in: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                System.out.println("\nmas[" + i + "]");
                count++;
            }

            }
        if (count == 0){
            System.out.print("NOWHERE\n");
        }
    }
    private static void sortInAscending(int arr[]) {
        for (int i = 1; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){
                if (arr[j] < arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr [j-1];
                    arr[j-1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void sortInDescending(int arr[]){
        for (int i = 1; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){
                if (arr[j] > arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
