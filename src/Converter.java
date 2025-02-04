import java.util.Scanner;

public class Converter {
public static void main(String[] args){
System.out.println("Welcome to Converter! You can convert:");
System.out.println("1. Kilometers to Miles");
System.out.println("2. Kilograms to Pounds");
System.out.println("3. Millimeters to Inches");
System.out.println("4. Celsius to Fahrenheit");
System.out.println("5. Gallons to Liters");
Scanner scan = new Scanner(System.in);
int m = 8;
while (m == 8){
System.out.println("Enter the number of your conversion from above:");
int unitName;
unitName = scan.nextInt();
if (unitName == 1){
    System.out.println("Enter how many Km:");
    Double unit = scan.nextDouble();
    Double miles = unit * .621371;
    System.out.println(miles);
}else if(unitName == 2){
    System.out.println("Enter how many Kg:");
    Double unit = scan.nextDouble();
    Double pounds = unit * 2.205;
    System.out.println(pounds);
}else if (unitName ==3){
    System.out.println("Enter how many Millimeters:");
    Double unit = scan.nextDouble();
    Double inches = unit * 25.4;
    System.out.println(inches);
}else if (unitName == 4){
    System.out.println("Enter how many Celsius:");
    Double unit = scan.nextDouble();
    Double fahrenheit = unit * 9/5 + 32;
    System.out.println(fahrenheit);
}else if (unitName == 5){
    System.out.println("Enter how many gallons:");
    Double unit = scan.nextDouble();
    Double liters = unit * 3.785;
    System.out.println(liters);
}else{
    System.out.println("Wrong number entered, please try again.");
}
System.out.println("Type 8 if you would like to keep going");
m = scan.nextInt();
scan.close();
}
}
}