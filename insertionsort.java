public class insertionsort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={8,4,1,5,9,2};
        for (int i=1; i<arr.length; i++){
            int temp= arr[i];
            for(int j=i-1; j>=0 && temp<arr[j]; j--){
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
        printArray(arr);
    }
}
