import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome = scan.nextLine( );
    int tamanho = nome.length();
    System.out.println(tamanho);
    System.out.println("Olá, " + nome + ", seu nome tem " + tamanho + " caracteres."); 
	}
}
