package questao01;
import javax.swing.JOptionPane;

public class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    // Métodos setters e getters

    public void completaDados(String foto, String local_achado, String data_hora) {
        setFoto(foto);
        setLocalAchado(local_achado);
        setDataHora(data_hora);
    }

    public void visualizarDetalhes() {
        String mensagem = "Título: " + getTitulo() + "\nFoto: " + getFoto() + "\nLocal Achado: " + getLocalAchado() + "\nTipo: " + getTipo() + "\nStatus: " + getStatus();
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Implementação dos métodos da interface Publicacao
    public String buscarTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            return "Título: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nLocal Achado: " + getLocalAchado();
        } else {
            return "Título não encontrado";
        }
    }

    // Restante do código da classe AchadoPerdido

    // Métodos setters e getters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setLocalAchado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getLocalAchado() {
        return local_achado;
    }

    public void setDataHora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getDataHora() {
        return data_hora;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
