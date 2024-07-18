
public class ContatoTelefonico {


    public static final int FAMILIAR = 1;
    public static final int PROFISSIONAL = 2;
    public static final int OUTROS = 3;
    
    
    //ATRIBUTOS
     private String nome; // primeiro nome
     private String sobrenome; // sobrenome
     private String email; //endereço de email
     private int codigoPais; // codigo telefonico do país 
     private String telefone; // numero telefonico
     private int categoria; // categoria(familiar, profissional ou outros)
    
     //CONSTRUTOR
     public ContatoTelefonico(String nome, String sobrenome, String email, int codigoPais,
      String telefone, int categoria) throws IllegalArgumentException {
        if (categoria != FAMILIAR && categoria != PROFISSIONAL && categoria != OUTROS) {
            throw new IllegalArgumentException("Tipo de contato invalido");
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.codigoPais = codigoPais;
        this.telefone = telefone;
        this.categoria = categoria;
      }

      // metodos getters e setters
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ContatoTelefonico that = (ContatoTelefonico) obj;
        return telefone.equals(that.telefone);
    }

     // metodo toString pra retornar a descrição do contato telefonico 
     public String toString(){
        return "Contato telefonico [ nome : " + nome + ", sobrenome: " + sobrenome +
         ", email: " + email + ", codigo do país: " + codigoPais + ", telefone: " + telefone +
         ", categoria: " + categoria + "]";
    }


 
  
}
