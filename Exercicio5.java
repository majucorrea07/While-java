package estruturaPosCondicionada;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner (System.in);
    int i = 0;
    int num,soma =0;
    
    while (i < 10) {
	System.out.println("Digite um numero: ");
    num = ler.nextInt();
    i++;
    
    soma += num; 
   
    }
    System.out.println("A soma foi de : " + soma);
	ler.close();
	}
}