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

	Scanner sc = new Scanner(System.in);
	
	public void Notacao_posicional(int base1, int base2) 
	{
		//Ainda em planejamento
		System.out.println("Quantos algarismos tem o numero?");
		int alg = sc.nextInt();
		System.out.println("Digite o numero que você quer converter um numero de cada vez");
		int[] vect = new int[alg];
	    double som = 0;
	    double mult = 0;
	    int x = 0;
	    	for(int i = 0; i < vect.length; i++) 
	    	{
	    		System.out.println((i+1)+"# :"+" Numero?");
	    		vect[i] = sc.nextInt();
	    	}
	    	
	    	for(int i : vect) 
	    	{
	    		System.out.println(i);
	    	}
	    	
	    	for(int j = alg-1; j > -1; j--) 
	    	{
	    		
	    		System.out.print("valor do vect[i] atual: "+ vect[j]+" os outros valores: "+base1+" "+j);
	    		mult = vect[x]*(Math.pow(base1, j));
	    		
	    		som += mult;
	    		System.out.println(mult);
	    		x++;
	    		
	    	}
	    	System.out.println("O resultado é "+som);
	        
	    
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
		
		System.out.println("O resultado do numero "+num+" convertido para base "+base+" é:");
		
		for( Integer i : lista)
		{
		    System.out.print(i);
		}
		
		
	}
	
	}