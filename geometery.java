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


System.out.println( " Enter aone , atwo , bone and btwo : ");

int aone = myObj.nextInt();
int atwo = myObj.nextInt();
int bone = myObj.nextInt();
int btwo = myObj.nextInt();

double length1 = Math.sqrt(Math.pow((atwo - aone), 2 ) + Math.pow((btwo - bone) , 2));
System.out.println(" the length of the line is " + length);

if (length == length1)
{
	System.out.println(" the length of both lines is equal  " + length  + length1);
}

}

}
