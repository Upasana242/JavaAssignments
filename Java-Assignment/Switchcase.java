import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		int i=1,a,b,c;
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		while(i==1){
			System.out.println("Enter the option as follows:\n1-printing\n2-addition\n3-subtraction\n4-multiplication\n5-division");
			System.out.println("Enter the numbers after that in order");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			if (a==0)
				break;
			else{
			switch (a){
			case 1:
				System.out.println(b+","+c);
				break;
			case 2:
				System.out.println(b+c);
				break;
			case 3:
				System.out.println(b-c);
				break;
			case 4:
				System.out.println(b*c);
				break;
			case 5:
				System.out.println(b/c);
				break;
			default:
				System.out.println("Wrong input");
			}
			}
			s.close();
		}
	}

}