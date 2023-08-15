public class arraypractice {
    public static void main(String[] args) {
        int [] numbers = {24,7,30,45,21};
        boolean isAscending=true;
        for(int i =0; i<numbers.length; i++){
            if (numbers[i]> numbers[i+1]) {
                isAscending=false;
            }
        }
        if(isAscending==true){
            System.out.println("Ascending");
        }
        else{
            System.out.println("Not ascending");
        }
        // int max = numbers[0];
        // int min = numbers[0];
        // for(int i =0; i < numbers.length; i++){
        //     if (numbers[i]>max) {
        //         max = numbers[i];
        //     }
        //     if (numbers[i]<min){
        //         min = numbers[i];
        //     }
        // }
        // System.out.println("Min value is "+ min);
        // System.out.println("Max value is "+ max);
    }
}
