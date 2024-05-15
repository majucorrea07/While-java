package estruturaPosCondicionada;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner ler = new Scanner (System.in);
   System.out.println("Digite o nome do usuário:");
	String nome = ler.nextLine();
	int i =0;
	while (i <= 10) {
		System.out.println(nome);
		i++;
	}
	}

}
