import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class App2 {
    public static void main(String[] args) {
        // Olá, {nome}. Hojé é {dia-de-semana}, BOM DIA . 

        String nome = "João";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        // System.out.println(hoje); 
        Locale brasil = new Locale("pt", "BR");
        // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // Dia da semana
        String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        } else if (agora.getHour() >=18 && agora.getHour() < 24){
            saudacao = "Boa Noite";
        } else{
            saudacao = "";
        }

        System.out.printf("Olá %s. Hojé é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}