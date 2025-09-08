import java.util.Scanner;
public class string {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the text message:");
String text=sc.nextLine();
int letterCount=0;
int digitCount=0;
for(int i=0;i<text.length();i++) {
char c=text.charAt(i);
if (Character.isLetter(c)) {
letterCount++;
} else if (Character.isDigit(c)) {
digitCount++;
}
}
System.out.println("no of letter="+letterCount);
System.out.println("no of digits="+digitCount);
}
}