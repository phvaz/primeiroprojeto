public class ScreenMatch {

    public static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.nome = "Duna 2";
        novoFilme.anoDeLancamento = 2024;
        novoFilme.duracaoEmMinutos = 154;
        novoFilme.incluidoNoPlano = true;

        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(9);
        novoFilme.avalia(8);
        novoFilme.avalia(9);

        System.out.println("Média de avaliações do filme: " +novoFilme.pegaMedia());
    }

}