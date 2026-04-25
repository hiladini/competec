import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int idade1 = 20;
	    int idade2 = 25;
	    
	boolean iguais = idade1 != idade2;
	boolean menor12 = idade2 > 12;
	
		//System.out.println(idade1 + "é menor do que" + idade2 );
		//System.out.println(idade1 <= idade2 );
		System.out.println(iguais && menor12);
	}
}
