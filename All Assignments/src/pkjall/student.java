package pkjall;

public class student {
int age;
int roll_no;
 public void display1()
 {
	 System.out.println("Hi i am method 1");
 }
 
 public void display2()
 
 {
	 System.out.println("Hi i am method 2");
 }
 public static void main(String[] args) {
	student niyati= new student();
	niyati.display1();
	niyati.display2();
	niyati.age=25;
	System.out.println("age is"  +niyati.age);
	niyati.roll_no=17;
	System.out.println("roll_no is" +niyati.roll_no);
	
}

}
