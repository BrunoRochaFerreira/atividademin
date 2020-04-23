package atividademin;
import java.util.Scanner;

public class Atividademin {
    

 public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
    int valor1, valor2;
    
    System.out.println("Digite o maior valor: " );
        valor1 = entrada.nextInt();
        
    System.out.println("Digite o menor valor: ");
        valor2 = entrada.nextInt();
  
    
System.out.println("O maior entre os dois é "+Math.max(valor1, valor2));
System.out.println("O menor entre os dois é "+Math.min(valor1, valor2));
}
}
