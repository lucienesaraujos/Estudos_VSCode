package livro;

public class livroDeBiblioteca {
    
    public static void main(String[] args) {
        
        catalogoLivros livro002 = new catalogoLivros();

        livro002.titulo = "JavaScript: O guia definitivo";
        livro002.autor = "Castro & Hyslop";
        livro002.editora = "Alta Books";
        livro002.genero = "Técnico";
        livro002.paginas = 520;
        livro002.idioma = "Português";
        livro002.anoLancamento = 2025;
        livro002.isbn = "PSOD2256SA";
        boolean emprestado = false;
    }
}
