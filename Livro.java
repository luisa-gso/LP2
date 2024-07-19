public class Livro {

    private String titulo;
    private String autor;
    private int codigo;
    private int anoDeLançamento;
   

   public Livro(String titulo, String autor, int codigo, int anoDeLançamento){
    this.titulo = titulo;
    this.autor = autor;
    this.codigo = codigo;
    this.anoDeLançamento = anoDeLançamento;
   }
   
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }
    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

@Override
public boolean equals(Object obj) {
   if (obj == this) {
    return true;
   } 
   if (obj == null || getClass() != obj.getClass()) {
    return false;
   }
   Livro livroNovo = (Livro) obj;
   return anoDeLançamento == livroNovo.anoDeLançamento && 
   titulo.equals(livroNovo.titulo) && autor.equals(livroNovo.autor) && 
   codigo==livroNovo.codigo;
    
}


@Override
public String toString() {
    return "Livro: " + titulo + " autor: " +autor +  " codigo: " + codigo +
     " ano de lançamento: " + anoDeLançamento;
}
    

}