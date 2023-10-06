package questao01;

public class Encontrar {
    public static void main(String[] args) {
        // Criação do objeto Usuario
        Usuario usuario = new Usuario("João", "joao@example.com", "senha123");

        // Criação do objeto AchadoPerdido
        AchadoPerdido achadoPerdido = new AchadoPerdido("Celular", "Celular perdido", "Eletrônico", "Perdido");
        achadoPerdido.completaDados("foto.jpg", "Local A", "2021-01-01 10:00:00");

        // Exibição dos métodos buscarTitulo e visualizarDetalhes
        String resultadoBusca = achadoPerdido.buscarTitulo("Celular");
        achadoPerdido.visualizarDetalhes();
    }
}
