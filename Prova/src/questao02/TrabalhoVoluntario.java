package questao02;

public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        return duracaoTrabalho > 2;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Início: " + getDatainicio() + "\n" +
                "Data de Fim: " + getDatafim() + "\n" +
                "Tipo de Trabalho: " + tipoTrabalho + "\n" +
                "Duração do Trabalho: " + duracaoTrabalho + "\n";
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }
}
