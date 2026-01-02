package Recrusion;

import java.util.Scanner;

public class MergeQuickSort 
{
    public static void mergeSort(int arr[],int low, int high)
    {
        if(low<high)
        {
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge( arr, low, mid, high);

        }
    }

    public static void merge(int arr[] , int low , int mid,int high)
    {
        int i = low;
        int j = mid+1;
        int temp[]= new int[high-low+1];
        int k=0;
        while(i<=mid && j<=high)
        {
            if(arr[i]< arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else
            {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }

        for(k=0,i=low;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    public static void QuickSort(int arr[], int low, int high)
    {
       if(low<high)
       {
        int pivot=partition(arr, low, high);
        QuickSort(arr,low ,pivot-1);
        QuickSort(arr, pivot+1, high);
       }
	//The pivot itself is placed in its final sorted position.
    //Now you recursively sort the left side and the right side
    }

    public static int partition(int arr[], int low,int high)
    {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low ;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
                
            } 
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void swap(int arr[], int i, int j)
    {
        int temp=0;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int array [])
    {
        System.err.println("Array in sorted form");
        for(int num:array)
        {
            System.err.print(num + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.err.println("Enter element of array");
        for(int i=0; i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        
        while(true)
        {
            System.out.println("enter you choice");
            System.out.println("1.MergeSort");
            System.out.println("2.QuickSort");
            System.out.println("3.BubbleSort");
            System.out.println("4.SelectionSort");
            System.out.println("5.InsertionSort");
            System.err.println("0 Exiting");
            
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    mergeSort(arr,0,size-1);
                    printArray(arr);
                    break;
                case 2:
                    QuickSort(arr,0,size-1);
                    printArray(arr);
                    break;
                case 3:
                    printArray(arr);
                case 4:
                    printArray(arr);
                case 5:
                    printArray(arr);
                case 0:
                    System.exit(0);
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }


            
        }

        
        
    }
    
}
