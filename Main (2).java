import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros [] = {2,4,6};
        int soma = numeros[0]+numeros[1]+numeros[2]; 
        System.out.println(soma);
		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 6;

	}
}
