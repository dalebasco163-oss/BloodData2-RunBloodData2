package SetAndGet;
import java.util.Scanner;

public class RunBloodData2 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
while (true) {

System.out.print("Enter blood type (O, A, B, AB): ");
String input1 = input.nextLine();

if (input1.isEmpty()) {
System.out.println("No blood type entered.");
break;
}

System.out.print("Enter Rhesus factor (+ or -): ");
String input2 = input.nextLine();

BloodData2 bd = new BloodData2();

           
bd.setBloodType(input1);

if (input2.isEmpty()) {
bd.setrhFactor("None");
} else {
bd.setrhFactor(input2);
}

           
System.out.println("Blood Details: ");
System.out.println("BloodType: " + bd.getBloodType());
System.out.println("rhFactor: " + bd.getrhFactor());

System.out.print("Do you want to enter another blood type? (Yes/No): ");
String again = input.nextLine();

if (again.equalsIgnoreCase("No")) {
break;
}
}
input.close();
}
}