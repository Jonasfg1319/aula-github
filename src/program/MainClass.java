package program;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
			Scanner sc = new Scanner(System.in);
			SistemasNumericos sis = new SistemasNumericos();
			 
			
			System.out.println("Qual numero você quer converter?");
			 
			int s1 = sc.nextInt();
			
			System.out.println("qual a base atual dele?");
			 
			int ba = sc.nextInt();
			
			System.out.println("Para qual base você quer converter?");
			 
			int bc = sc.nextInt();
			
			if(ba > bc) 
			{
			      sis.Divisao_sucessiva(s1, bc);
			}
			
			else if(bc > ba) 
			{
				sis.Notacao_posicional(ba, bc);
			}
			
			sc.close();
		
		}
		
	
	
} class SistemasNumericos  
{

	
	
	public void Notacao_posicional(int base1, int base2) 
	{
		//Ainda em planejamento
	}
	
	public void Divisao_sucessiva(int num,int base) 
	{
		List<Integer> lista = new ArrayList<>();
		double resto;
		double temp = 1;
		double temp2;
		temp = num / base;
		resto = num % base;
		System.out.println(temp);
		while(temp > 1) 
		{
			lista.add((int)resto);
			temp = temp / base;
			resto = temp % base;
		    temp2 = temp;
		    System.out.println(temp2);
		    
		    
		}
		
		System.out.println(lista);
	}
	
	}