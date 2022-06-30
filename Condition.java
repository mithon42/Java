import java.util.*;

// **********Adult Or Not Adult*********
// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();

//     if(age > 20){
//       System.out.println("Adult");
//     } else{
//       System.out.println("Not Adult");
//     }
//   }
// }


// ********Even Or Odd Number*******
// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();

//     if(number % 2 == 0){
//       System.out.println("Even");
//     } else{
//       System.out.println("Odd");
//     }
//   }
// }


// ******* 2 Input = Equal Greaten Lessen ******
// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();


//    if (a == b) {
//       System.out.println("Equal");
//    } else if(a > b) {
//       System.out.println("A is Greaten");    
//    } else{
//     System.out.println("A is Lessen");
//    }
//   }
// }



// public class Condition {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     System.out.println(a + b);
//     System.out.println(a - b);
//     System.out.println(a * b);
//     System.out.println(a / b);
//     System.out.println(a % b);

//   }
// }


public class Condition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    // if(number == 1){
    //   System.out.println("January");
    // } else if(number == 2){
    //   System.out.println("February");
    // } else if(number == 3){
    //   System.out.println("March");
    // } else if(number == 4){
    //   System.out.println("April");
    // } else if(number == 5){
    //   System.out.println("May");
    // } else if(number == 6){
    //   System.out.println("June");
    // } else if(number == 7){
    //   System.out.println("July");
    // } else if(number == 8){
    //   System.out.println("August");
    // } else if(number == 9){
    //   System.out.println("September");
    // } else if(number == 10){
    //   System.out.println("October");
    // } else if(number == 11){
    //   System.out.println("November");
    // } else if(number == 12){
    //   System.out.println("December");
    // } else{
    //   System.out.println("Invalid Number / Number is Very High");
    // }

      
    switch(number){
      case 1: System.out.println("January");
      break;
      case 2: System.out.println("February");
      break;
      case 3: System.out.println("March");
      break;
      case 4: System.out.println("April");
      break;
      case 5: System.out.println("May");
      break;
      case 6: System.out.println("june");
      break;
      case 7: System.out.println("July");
      break;
      case 8: System.out.println("August");
      break;
      case 9: System.out.println("September");
      break;
      case 10: System.out.println("October");
      break;
      case 11: System.out.println("November");
      break;
      case 12: System.out.println("December");
      break;
      default : System.out.println("Invalid Number");
    }

  }
}