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
//another way of doing it
public static int calcFactoria(int n){
    if(n==0 || n==1){
        return 1;
    }
    int smallernum = calcFactoria(n-1);
    int factorial = n*smallernum;
    return factorial;
}
// print the fibonacci sequence till nth term
public static void printFib(int a, int b, int n){
    if(n==0){
        return;
    }
    int c =a+b;
    System.out.println(c);
    printFib(b, c, n-1);
}
//print x^n (stack height =n)
public static int caclPower(int x, int n){
    if(n==0){
        return 1;
    } 
    if(x==0){
        return 0;
    }
    int xPowernm1 = caclPower( x, n-1);
     x = x*xPowernm1;
    return x;
}
    public static void main(String[] args) {
        int x= 2;
        int n =5;
        int ans = caclPower(x, n);
        System.out.println(ans);
    }
}
