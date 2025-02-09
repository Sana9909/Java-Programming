import java.util.*;
import java.io.*;

class ImprovedBubbleSort{
    
    static void ImpBubbleSortAsc(int[] arr,int n){
        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swapped=true;
                    swap(arr,j,j+1);
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    static void ImpBubbleSortDesc(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.print("Enter number of data : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+(i+1)+"] : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is :");
        display(arr,n);

        ImpBubbleSortAsc(arr,n);
        System.out.println("The array after improved bubble sort in Ascending Order is :");
        display(arr,n);    

        ImpBubbleSortDesc(arr,n);
        System.out.println("The array after improved bubble sort in Descending Order is :");
        display(arr,n);        

        return;
    }
}