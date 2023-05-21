public class Streaming {
    private final String nome;
    private final GeneroStreaming genero;

    public Streaming(String nome, GeneroStreaming genero) {
        this.nome = nome;
        this.genero = genero;
    }
    

    public String getNome() {
        return nome;
    }

    public GeneroStreaming getGenero() {
        return genero;
    }
}