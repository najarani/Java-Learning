import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Conditions {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ing age = sc.nextInt();
    if(age > 18){
        System.out.println("Adult");
    } else{
        System.out.println("Not adult");
    }

}
}
