import javax.swing.JOptionPane;

public class App3 {
    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme favorito de 2022", "Academia dos Devs", JOptionPane.QUESTION_MESSAGE);
        String texto = JOptionPane.showInputDialog(null, "Digite um número: ");
        int numero = Integer.parseInt(texto);
        numero = numero * 10;
        JOptionPane.showMessageDialog(null, "deixa o like", "Academia dos Devs", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(filme);
        System.out.println(numero);
    }
}
