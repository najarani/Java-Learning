public class recursion1 {
    //print n numbers
public static void printNumb(int n){
    if (n==0){
        return;
    }
     System.out.println(n); 
    printNumb(n-1);
   
}
//print sum of first n natiural numbers 
public static void printSum(int i, int n, int sum){
    if (i==n){
        sum=sum+i;
        System.out.println(sum);
        return;
    }
    sum=sum+i;
    printSum(i+1, n, sum);
}
//print factorial of n
public static void printFactorial(int n, int factorial){
    if(n ==0){
        System.out.println(factorial);
        return;
    }
    factorial = n*factorial;
    printFactorial(n-1, factorial);
}
    public static void main(String[] args) {
        printFactorial(6, 1);
        
    }
}
