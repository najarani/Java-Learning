public class selectionsort {
    public static void prinntArray (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7, -5, 3, 2, 1, 0, 45};
        //selection sort

        for(int i =0; i<arr.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        prinntArray(arr);

    }
}
