public class classfourpattern {
    public static void main(String[] args) {
    /* 
        int n=5;
        for (int i=1; i<=2*n-1; i++){
          if(i<=n){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
           
          }
           else{
                for(int j =0; j<2*n-i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
*/

/* 
 for (int i =1; i<=n; i++){
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}
*/
// for (int i =1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(number+" ");
//     number++;
//     }
//  System.out.println();   
// }



// for (int i = 1; i<=n; i++){
//     for (int j =1; j<=i; j++){
//         int k= i+j;
//         if (k%2==0){
//             System.out.print("1 ");
//         }
//         else{
//             System.out.print("0");
//         }
//     }
//     System.out.println();
// }  

// butterflypatterns
//      int n=4;
//      for (int i =1; i<=2*n; i++){
//       if(i<=n){
//          for(int j=1; j<=i; j++){
//            System.out.print("*");
//             }
//          for(int j=1; j<= 2*(n-i); j++){
//              System.out.print(" ");
//             }
//          for(int j=1; j<=i; j++){
//             System.out.print("*");
//          }
//   }
//   else{
//     for(int j=1; j<=((2*n)-i)+1; j++ ){
//         System.out.print("*");
//     }
//     for(int j=1; j<=((i-n)*2)-2; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=((2*n)-i)+1; j++ ){
//         System.out.print("*");
//     }
    
//   }
//   System.out.println();
//     }



// rhombus
// int n=5;
// for (int i=1; i<=5; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=n; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// number-pyramid
// int n=5;
// for (int i=1; i<=n; i++){
//     for (int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }

//palindrom
// int n = 5;
// for (int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=i; j>=1; j--){
//         System.out.print(j);
//     }
//     for(int j =2; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

// diamond
int n=4;
 for(int i=1; i<=n; i++){
         for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    for (int j=1; j<=2*i-1; j++){
        System.out.print("*");
    
    }
   System.out.println();
     
    }
    for(int i =n; i>=1; i--){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for (int j=1;j<=(i*2)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
   
 }
}


    
