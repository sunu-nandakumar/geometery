import java.util.Scanner;


public class geometery
{
public static void main(String args[])
{
Scanner myObj = new Scanner(System.in);
System.out.println( " Enter xone , xtwo , yone and ytwo : ");

int xone = myObj.nextInt();
int xtwo = myObj.nextInt();
int yone = myObj.nextInt();
int ytwo = myObj.nextInt();

double length = Math.sqrt(Math.pow((xtwo - xone), 2 ) + Math.pow((ytwo - yone) , 2));
System.out.println(" the length of the line is " + length);
}

}
