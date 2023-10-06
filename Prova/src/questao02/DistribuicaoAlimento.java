package questao02;

public class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        return getDatafim().isEmpty();
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Início: " + getDatainicio() + "\n" +
                "Data de Fim: " + getDatafim() + "\n" +
                "Descrição do Alimento: " + descAlimento + "\n" +
                "Quantidade: " + qtde + "\n";
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
}
