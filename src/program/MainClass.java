package program;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(Soma(n1,n2));
		
		sc.close();
	}
	
	public static int Soma(int n1, int n2) 
	{
		return n1 + n2;
	}

}
