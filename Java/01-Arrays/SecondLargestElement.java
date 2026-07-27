import java.util.Scanner;

public class SecondLargestElement {

    public static int findSecondLargestElement(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } 
            else if(arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
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
        int secondLargest = findSecondLargestElement(array);
        System.out.println("Second Largest Element is : " + secondLargest);
    }
}


