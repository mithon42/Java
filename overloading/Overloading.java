package overloading;


public class Overloading {
  String name,gender;
  int phone;
  
  Overloading(){
    System.out.println("No Information");
  }

  Overloading(String n,String g){
    name = n;
    gender = g;
  }

  Overloading(String n,String g,int p){
    name = n;
    gender = g;
    phone = p;
  }

  void displayInformation(){
    System.out.println("Name:" + name);
    System.out.println("Gender:" + gender);
    System.out.println("Phone:" + phone);
  }
}
