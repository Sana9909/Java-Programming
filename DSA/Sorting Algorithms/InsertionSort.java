class InsertionSort{

    static void InsertionSort(int[] arr,int n){
        
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

        InsertionSortAsc(arr,n);
        System.out.println("The array after insertion sort in Ascending Order is :");
        display(arr,n);    

        InsertionSortDesc(arr,n);
        System.out.println("The array after insertion sort in Descending Order is :");
        display(arr,n);        

        return;
    }
}