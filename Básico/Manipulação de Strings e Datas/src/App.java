public class App {
    public static void main(String[] args) throws Exception {
        String nome = "João";
        System.out.println(nome.toUpperCase()); // Para deixar tudo em letra maiuscula 
        System.out.println(nome.toLowerCase()); // Para deixar tudo em letra minuscula 
        System.out.println(nome.length()); // Para saber qual é o tamanho do meu texto

        String nomeOutro = "joão";
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); // Para comparar String
    }
}
