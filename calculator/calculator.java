import java.io.*;
import java.util.*;
public class calculator
{
public static void main(String[] args) 
{
int a,b,ch;
Scanner s=new Scanner(System.in);
addition add=new addition();
subtraction sub=new subtraction();
division div=new division();
multiplication mul=new multiplication();
do
{
System.out.println("Enter an option:\n 1.Addition \n2.Subtraction\n3.Division\n4.Multiplication\n5.exit\n");
ch=s.nextInt();
System.out.println("Enter first value:\n");
a=s.nextInt();
System.out.println("Enter Second value:\n");
b=s.nextInt();
switch(ch)
{
case 1 : add.add(a,b); break;
case 2 : sub.sub(a,b); break;
case 3 : div.div(a,b); break;
case 4 : mul.mul(a,b); break;
case 5 : System.exit(0); break;
default: System.out.println("Enter correct option");
}
}while(ch!=5);
}
}