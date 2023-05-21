import java.util.ArrayList;

public class Usuario implements StreamingObserver {
    private final String nome;
    private final ArrayList<GeneroStreaming> generosPreferidos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Streaming streaming) {
        var genero = streaming.getGenero();
        if (!generosPreferidos.contains(genero)) return;

        var msg = nome + ", há um novo conteúdo do genero " 
            + genero.getDescricao() + ": " + streaming.getNome();
        System.out.println(msg);
    }

    public String getNome() {
        return nome;
    }

    public void addGenero(GeneroStreaming genero) {
        generosPreferidos.add(genero);
    }
}
