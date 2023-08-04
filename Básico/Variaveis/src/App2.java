public class App2 {
    public static void main(String[] args) {
        String filme = "Vingadores"; // Declarando %s
        int anoLancamento = 2015; // %d
        int duracao = 240; 
        float notaCritica = 9.8f; // %f
        char letraInicial = 'V'; // %c
        boolean foiSucesso = true; // %b

        System.err.println("O filme " + filme);
        System.out.println("Ano de lançamento " + anoLancamento);
        System.out.println("Nota média " + notaCritica);
        System.out.println("Letra inicial " + letraInicial);
        System.out.println("Foi um sucesso " + foiSucesso);

        // O Filme <filme> lançado em <ano> tem uma duração de <duracao> minutos;
        System.out.println("O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos");
        System.out.format("O Filme %s lançado em %d tem uma duração de %d minutos", filme, anoLancamento, duracao);
    }
}
