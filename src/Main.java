public class Main {
    public static void main(String[] args) {
        var u1 = new Usuario("Fulano");
        u1.addGenero(GeneroStreaming.ACAO);
        u1.addGenero(GeneroStreaming.ANIME);
        u1.addGenero(GeneroStreaming.FICCAO);

        var u2 = new Usuario("Ciclano");
        u2.addGenero(GeneroStreaming.ACAO);
        u2.addGenero(GeneroStreaming.COMEDIA);
        u2.addGenero(GeneroStreaming.TERROR);

        var plataforma = new Plataforma();
        plataforma.attach(u1);
        plataforma.attach(u2);
        
        plataforma.addStreaming(
            new Streaming("IT, A Coisa", GeneroStreaming.TERROR)
        );
        plataforma.addStreaming(
            new Streaming("2001 - Uma odisséia no espaço", GeneroStreaming.FICCAO)
        );
        plataforma.addStreaming(
            new Streaming("Velozes e Furiosos", GeneroStreaming.ACAO)
        );
        plataforma.addStreaming(
            new Streaming("2 homens e meio", GeneroStreaming.COMEDIA)
        );
        plataforma.addStreaming(
            new Streaming("Rambo", GeneroStreaming.ACAO)
        );
    }
}
