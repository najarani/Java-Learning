public class sortinginjava {
   public static void prinntArray(int arr[]){
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }
    //bubble sort
    public static void main(String[] args) {
        int arr[]= {78,8,3,1,2};
        for (int i=0; i<arr.length-1; i++){
            for (int j =0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        prinntArray(arr);
    }
}
