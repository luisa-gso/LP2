import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {
    final static Scanner entrada = new Scanner(System.in);
    final static Collection<Livro> estante = new HashSet<Livro>();

    public static void main(String[] args) {
        int opçao;

        do {
            Menu();
            System.out.print("Digite a opção: ");
            opçao = entrada.nextInt();
            System.out.println(" ");

            switch (opçao) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    lista();
                    break;
                case 3:
                    remover();
                    ;
                    break;
                case 4:
                    pesquisarAutor();

                default:
                    System.out.println("valor invalido! ");
                    break;
            }

        } while (opçao != 5);

        entrada.close();
    }

    public static void Menu() {
        System.out.println("");
        System.out.println("----------Menu----------");
        System.out.println("[1] Adicionar Livro");
        System.out.println("[2] Exibir Lista completa");
        System.out.println("[3] Excluir livro ");
        System.out.println("[4] Pesquisar autor ");
        System.out.println("");

    }

    public static void adicionar() {
        System.out.print("Digite o autor:");
        String autor = entrada.next();

        System.out.print("digite o titulo:");
        String titulo = entrada.next();

        System.out.print("Digite o codigo do Livro:");
        int codigo = entrada.nextInt();

        System.out.print("Digite o ano de lançamento:");
        int anoDeLançamento = entrada.nextInt();
        
        Livro livroNovo = new Livro(titulo, autor, codigo, anoDeLançamento);

        for (Livro livro : estante) {
            if (livroNovo.equals(livro)) {
                System.out.println(" ");
                System.out.println("Livro já cadastrado!"); 
                return;
            }
        }

        estante.add(livroNovo);
        System.out.println("");
        System.out.println("Livro adicionado com sucesso!");

        System.out.println(livroNovo.toString());

    }

    public static void remover() {

       
        System.out.println("Digite o codigo do livro que deseja excuir: ");
        int Codigo = entrada.nextInt();
        System.out.println("*******************");

        Iterator <Livro> it = estante.iterator();

       while (it.hasNext()) {
          Livro livro = it.next();
        
          if (livro.getCodigo() == (Codigo))  {
            it.remove();
            System.out.println("Livro removido com sucesso! ");
          }
       }


    }

    public static void lista() {
        Iterator it = estante.iterator();

        if (estante.isEmpty()) {
            System.out.println("A lista está vazia! ");
        }
        while (it.hasNext()) {
          System.out.println("****************");
          System.out.println("Livro: " + it.next());  
          System.out.println("");

        }

    }

    public static void pesquisarAutor() {

        Iterator <Livro> it = estante.iterator();

        System.out.println("Digite o nome do autor: ");
        String nomeautor = entrada.next();
        System.out.println("*******************");
        
        while (it.hasNext() ) {
            Livro livro = it.next();
                    if (livro.getAutor().equalsIgnoreCase(nomeautor)) { 
                    System.out.println("Livro encontrado: ");
                    System.out.println("Título: " + livro.getTitulo());
                    System.out.println("Autor: " + livro.getAutor());
                    System.out.println("Ano de Publicação: " + livro.getAnoDeLançamento());
                    
                }
            }
        
        }
    }
                  

        
    
