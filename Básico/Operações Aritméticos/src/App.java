import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = 6;
        int numero2 = 5;

        int resultado = numero1 + numero2;
        // int resultado = numero1 - numero2;
        // int resultado = numero1 * numero2;
        // int resultado = numero1 / numero2;
        // int resultado = 11 % 2;


        JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);

    }
}
