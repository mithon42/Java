// import java.util.*;

// public class loops {
//   public static void main(String[] args) {
//     int n = 100;
//     for(int i = 1; i <= n; i++){
//       System.out.println( i + " Hello World");
//     }
//   }
// }




// public class loops{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();

//     for (int i = 1; i <= 10; i++) {
//       System.out.println(number + " * " + i + " = " + number * i);
//     }
//   }
// }





// public class loops {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();

//     int sum = 0;
//     for (int i = 1; i <= number; i++) {
//       sum = sum + i;
//     }
//     System.out.println(sum);
//   }
// }




import java.util.*;

public class loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int i = 1;
    while(i <= 10){
      System.out.println(number + " * " + i + " = " + number*i);
      i++;
      
    }
    System.out.println("Successful Mithon");
  }
}
