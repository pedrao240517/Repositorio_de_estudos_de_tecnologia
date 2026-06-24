package NivelIntermediario.Enums;

public enum RankDeMissoes {
    
    D("baixo",1),
    C("Moderado",2),
    B("Pouco difícil",3),
    A("Difícil",4),
    S("Muito Difícil",5);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    RankDeMissoes() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
