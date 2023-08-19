public class rec4arrayproblems {
    public static boolean sortedornot(int arr[], int idx){

        if(idx ==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
           return sortedornot(arr, idx+1);
        }
        else{
            return false;
        }
    }
    //move all "x" to the end of the string
    public static void movestr(String str, int count, int index, String newString){
        if(index==str.length()){
            for(int i=0; i<count; i++){
                newString = newString+'x';
            }
            System.out.println(newString);
             return;
        }
        char curchar =str.charAt(index);
        if(curchar =='x'){
            count++;
            movestr(str, count, index+1, newString);
        }
        else{
            newString = curchar+newString;
            movestr(str, count, index+1, newString);
        }

    }
   public static void main (String[] args){
    movestr("axbxcxd", 0, 0, "");
   }
}
