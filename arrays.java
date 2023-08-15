import java.util.*;
public class arrays{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[]= new int[size];
for (int i=0; i<numbers.length; i++){
    numbers[i]=sc.nextInt();
}
int x = sc.nextInt();
// int[] marks = new int[3];
// marks[0] = 97; //phy
// marks[1] =98; //chem
// marks[2] = 99;//bio
for(int i=0; i<numbers.length; i++){
    if(numbers[i]==x){
        System.out.println("The x is at "+ i + " index");
    }
}
}



}