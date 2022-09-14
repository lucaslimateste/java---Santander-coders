// ManipulãçãoDeStrings 
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale; 
import java.time.LocalDateTime;
public class manipulaçãoString {
    public static void main(String[] args){
         String nome = "lucas";
        // System.out.println(nome.toLowerCase());
        // // pode haver comparação de strings 
        // String outroNome = "Lucas";
        // System.out.println(outroNome.equals(nome));
        // // pra ignorar a escrita e avaliar somente o conteudo
        // System.out.println(outroNome.equalsIgnoreCase(nome));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","br");
        String diaDaSemana =(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        System.out.println(diaDaSemana);
        
        String saudação;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudação = "bom dia";     
        } else if (agora.getHour()>=13 && agora.getHour()<=18){   saudação = "boa tarde";     
        } else if (agora.getHour()>=19 && agora.getHour()<=00 ){
            saudação ="boa noite";
        } else {
            saudação = "ok então";
        }
        System.out.printf("olá,%s.hoje é %s,%s.%n",nome,diaDaSemana,saudação.toUpperCase());

}
}
