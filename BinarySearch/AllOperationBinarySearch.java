package BinarySearch;
import java.util.*;

public class AllOperationBinarySearch {
    
    public static int searchElementAtIndex(int arr[], int target)
    {
        int left =0;
        int right = arr.length-1;
        while(left <=right)
        {
            int mid = left +(right-left)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]< target)
            {
                left = mid+1;
            }
            else if(arr[mid]> target)
            {
                right = mid-1;
            }

        }
    return -1;
    }
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter total size of array");
        int size = scanner.nextInt();
        System.out.println("enter target");
        int target = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<=size;i++)
        {
            arr[i]= scanner.nextInt();
        }
        while(true)
        {
            System.out.println("Select operation");
            System.out.println("1. Find Element present at which index");
            System.out.println("2.Insert element at appropriate place  using binary search");
            System.out.println("3.Delete elememt from array using binary search");
            System.out.println("5.Update element using BS in arrays");
            System.out.println("6.Exit");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1: searchElementAtIndex( arr,target );
            }
            

        }
    

    }
}
