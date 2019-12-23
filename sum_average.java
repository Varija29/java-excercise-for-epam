import java.util.Scanner;
public class sum_average
{
public static void main(String[]args)
{
int n,sum=0;
float average;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of elements in the array:");
n=sc.nextInt();
int a[] = new int[n];
System.out.println("enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum+=a[i];
}
System.out.println("sum:"+sum);
average=sum/n;
System.out.println("average:"+average);
}
}