public class Filme {
    String nome;
    int anoDeLancamento;
    double duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvalaicoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no Plano: " + (incluidoNoPlano ? "Sim" : "Não"));
    }

    void avalia(double nota) {
        somaDasAvalaicoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvalaicoes / totalDeAvaliacoes;
    }


}

