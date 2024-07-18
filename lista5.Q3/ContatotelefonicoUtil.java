import java.util.ArrayList;
import java.util.Scanner;

public class ContatotelefonicoUtil {

    final static ArrayList<ContatoTelefonico> listaTelefonica = new ArrayList<ContatoTelefonico>();
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {
            menu();

            System.out.print("Digite operação: ");
            op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 1:
                    criarContato();
                    break;
                case 2:
                    porcentagemCodigo();
                    break;
                case 3:
                    encerrar();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (op != 3);

        ler.close();
    }

    public static void criarContato() {
        System.out.println(" informe o nome: ");
        String nome = ler.nextLine();

        System.out.println(" informe o sobrenome: ");
        String sobrenome = ler.nextLine();

        System.out.println(" informe o email: ");
        String email = ler.nextLine();

        System.out.println(" informe o telefone: ");
        String telefone = ler.nextLine();

        System.out.println(" informe o codigo do país: ");
        int codigoPais = ler.nextInt();

        System.out.println(" informe a categoria: ");
        int categoria = ler.nextInt();

        if (categoria != 1 && categoria != 2 && categoria != 3) {
            throw new IllegalArgumentException("Tipo de contato inválido");
        }

        ContatoTelefonico contato = new ContatoTelefonico(nome, sobrenome, email, codigoPais, telefone, categoria);
            
        // Verifica se há duplicidade
            for (ContatoTelefonico Contato : listaTelefonica) {
                if (Contato.equals(contato)) {
                    System.out.println("Número de telefone já cadastrado!");
                    return; // sair do método se encontrar um número duplicado
                }
            }
        listaTelefonica.add(contato);
        System.out.println("Contato criado com sucesso!!!");

        System.out.println(contato.toString());
        System.out.println(" ");
    }

    
    public static void menu() {
        System.out.println("*****MENU*****");
        System.out.println("* - 1 - Inserir novo contato *");
        System.out.println("* - 2 - Listar *");
        System.out.println("* - 3 - Encerrar *");
        System.out.println("**************");

    }

    public static void porcentagemCodigo() {
        double totalContato = listaTelefonica.size();
        if (totalContato == 0) {
            System.out.println("Nenhum contato adicionado!");
            return;
        }

        double QtFamiliar = 0;
        double QtProfissional = 0;
        double QtOutros = 0;

        for (ContatoTelefonico contato : listaTelefonica) {
            switch (contato.getCategoria()) {
                case ContatoTelefonico.FAMILIAR:
                    QtFamiliar++;
                    break;
                case ContatoTelefonico.PROFISSIONAL:
                    QtProfissional++;
                    break;
                case ContatoTelefonico.OUTROS:
                    QtOutros++;
                    break;
            }
        }

       double percentualFamiliar = (QtFamiliar / totalContato) * 100;
       double percentualProfissional = (QtProfissional / totalContato) * 100;
      double  percentualOutros = (QtOutros / totalContato) * 100;

      System.out.println("** Quantidade total de contatos " + totalContato + " **");
        System.out.println("* Percentual da quantidade de contatos familiar => " + percentualFamiliar);
        System.out.println("* Percentual da quantidade de contatos profissional => " +percentualProfissional);
        System.out.println("* Percentual da quantidade de contatos outros => " + percentualOutros);
        System.out.println();

    }

    public static void encerrar() {
        System.out.println("Encerrando o programa...");
        ler.close();
        System.exit(0);
    }
}
