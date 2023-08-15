import java.util.Scanner;

public class operatorsandbinary {
    public static void main(String[] args) {
        //Get Bit
        /*  int n = 5;
        int pos =3;
        int bitMask = 1<<pos;
    if((bitMask & n)== 0){
        System.out.println("Bit was zero");
    }
    else{
        System.out.println("Bit was one");
    }*/

    //SET BIT  
    /*  
    int n =5;
    int pos =1;
    int bitMask = 1<<pos;
    int newNumber = bitMask |n;
    System.out.println(newNumber);
*/
//CLEAR
/* 
int n =5;
int pos = 2;
int bitMask =1<<pos;
int notBitMask = ~(bitMask);
int newnumber = notBitMask & n;
System.out.println(newnumber);
*/

//UPDATE
Scanner sc = new Scanner(System.in);
int operartion = sc.nextInt();
int n= 5;
int pos = 2;
if(operartion == 1){
int bitMask = 1<<pos;
int notBitMask = ~bitMask;
int newnumber = notBitMask & n;
System.out.println(newnumber);
}
else{
    int bitMask = 1<<pos;
    int newnumber = bitMask | n;
    System.out.println(newnumber);
}








    }
}
