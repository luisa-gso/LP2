
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class app {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    Stack<Integer> pilha = new Stack<>();

   
        System.out.println(" digite um numero: ");
        int numero = entrada.nextInt();
      
        while (true) {
            if (numero == 0) {
                break;
            }
            pilha.push(numero);
        }

    int Primeironum = pilha.get(0);

    int qtdrepetida = 0;
    
    for (int num : pilha){
        if(num == Primeironum){
            qtdrepetida ++;
        }

    }

        System.out.println( " O Primeiro numero inserido foi: " + Primeironum);
        System.out.println("Quantidade de vezer que o " + Primeironum + "aparece é: " + qtdrepetida);
    

    }
   
}

