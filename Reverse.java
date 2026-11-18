`import java.util.Scanner;
class Reverse
{
public static void main(String ar[])
{
int arr[5]={10,20,30,40,50};

        
 System.out.println("Original Array: " + arr[]);
   
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        System.out.println("Reversed Array: " + arr[]);
    }
}

