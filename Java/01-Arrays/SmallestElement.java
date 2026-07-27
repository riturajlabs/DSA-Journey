import java.util.Scanner;

public class SmallestElement {

    public static void findSmallestElement(int[] arr) {
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] <= smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest number in the array is : " + smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        findSmallestElement(array);

        sc.close();

    }
}