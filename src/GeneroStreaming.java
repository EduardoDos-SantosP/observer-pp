public enum GeneroStreaming {
    ACAO ("Ação"),
    COMEDIA ("Comédia"),
    TERROR ("Terror"),
    ANIME ("Anime"),
    FICCAO ("Ficção científica");

    private final String descricao;

    GeneroStreaming(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
