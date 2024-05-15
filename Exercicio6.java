package estruturaPosCondicionada;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner(System.in);
    int i = 0, num;
    String nome;
    
    System.out.println("Informe um nome: ");
    nome = ler.nextLine();
    System.out.println("Informe um número: ");
	num = ler.nextInt();
	
	while (i <= num) {
	System.out.println(nome);
	i++;
	}
   ler.close();
  }
}
