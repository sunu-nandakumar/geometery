import java.util.Scanner;

import java.lang.*;

public class geometery
{
public static double compareMethod(double length , double length1)
{
double compare = Double.compare(length , length1);

if ( compare > 0 )
{
 double sub = ( length - length1);
	
	System.out.println(length + " is greater than " +length1 + sub );
return sub;

}
else if ( compare < 0 )
{
double sub = (length1 - length );
 System.out.println( + length1 + " is greater than " + length + sub);
return sub;
}
else 
{
	double sub = ( length - length1);

	 System.out.println(" both are equal  " + length  + length1+ sub );
return sub;

}
} 
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

System.out.println(" the length of the line is " + length1);


compareMethod(length , length1);




}

}
