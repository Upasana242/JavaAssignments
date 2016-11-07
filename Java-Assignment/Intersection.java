import java.util.Scanner;
public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,size1,size2;
		int arr1[],arr2[];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the first array:");
		size1=s.nextInt();
		System.out.println("Enter the size of the second array:");
		size2=s.nextInt();
		arr1=new int[size1];
		arr2=new int[size2];
		System.out.println("Enter the elements of the first array");
		for (i=0;i<4;i++)
		{
			arr1[i]=s.nextInt();                                                         
		}
		System.out.println("Enter the elements of the second array");
		for (i=0;i<4;i++)
		{
			arr2[i]=s.nextInt();                                                         
		}
		s.close();
		for(i=0;i<arr1.length;i++)
		{	for (j=0;j<i;j++)
			{
				if (arr1[i]==arr1[j])
					continue;
				else
			
			for (j=0;j<arr2.length;j++)
			{
				if (arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
		}
		
	}

}
