import java.util.*;
public class javaFunctions {
    
    public static void calculateSum(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static float average(float a, float b, float c){
        float average= (a+b+c)/3;
       return average;
    }
   public static void oddsum(int a){
    int sum=0;
    for(int i=1; i<=a; i++){
        if(i%2!=0){
            sum = sum+i;
        }
    }
   }
   public static int addition(int a, int b){
    int sum;
    sum = a+b;
    return sum;
   }
   public static void greaterbnumber(int a, int b){
    if(a>b){
        System.out.println("greater number is:"+ a);
    }
    else if(b>a){
        System.out.println("greater number is:"+ b);
    }
    else{
        System.out.println("Numbers are equal");
    }
   }
   public static double circumference(double r){
    double c;
   // double PI = 3.14;
    c= 2*Math.PI*r;
    return c;
   }
   public static int raisedpower(int a, int b){
    int result =1;
    for(int i=b; i>=1; i--){
        result = result*a;
    }
    return result;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int o = sc.nextInt();
       System.out.println(addition(n, o));
        
    }
}
