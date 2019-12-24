import java.util.Scanner;
public class remove_duplicate
{
public static void main(String[]args)
{
int arr_ele[]=new int[20];
int init_ele,next_ele;
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size: ");
int arr_size=sc.nextInt();
System.out.println("enter the elements in the array: ");
for(i=0;i<arr_size;i++)
{
System.out.println("Enter array elements of index "+i+":");
arr_ele[i]=sc.nextInt();
}

System.out.println("After removing duplicate element array are:");
for(init_ele=0;init_ele<arr_size;init_ele++)
{
for(next_ele=init_ele+1;next_ele<arr_size;)
  {
    if(arr_ele[init_ele]==arr_ele[next_ele])
      {
       for(int temp=next_ele;temp<arr_size;temp++)
      {
        arr_size=arr_size-1;
      }
     }

   else
   {
    next_ele++;
    }
}
}
for(i=0;i<arr_size;i++)
System.out.println(arr_ele[i]);
}
}
