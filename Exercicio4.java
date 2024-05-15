package estruturaPosCondicionada;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner ler = new Scanner (System.in);
      int i = 0; 
	  int idade = 0;
      int soma = 0; 
      
	   while (i < 20) {
	   System.out.println("Digite a idade: ");
       idade = ler.nextInt();
       i++;
       if(idade >= 18) {
	   soma = soma +1;
 }
	   
	   }
	   System.out.println("A quantidade de pessoas maiores de idade é: " + soma);
	}

}
