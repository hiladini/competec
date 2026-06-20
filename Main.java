import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int numero;
		boolean maisQueTres = false;
		int frequencia [] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
		    numero = sc.nextInt();
		    frequencia[numero]++;
		}
		for(int i = 0; i<10; i++){
		    if(frequencia[i] >= 3){
		        maisQueTres = true;
		    }
		}
		if(maisQueTres == true){
		    System.out.println("Sim");
		}
		else{
		    System.out.println("Não");
		}
		
	}
}
