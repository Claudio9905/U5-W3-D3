package claudiopostiglione.u5w3d3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        LocalDate data = LocalDate.of(1999, 11, 10);

        Info infoUser = new Info("Claudio", "Postiglione", data);
        InfoAdapter infoAdapterUser = new InfoAdapter(infoUser);

        UserData user = new UserData();
        user.getData(infoAdapterUser);


        System.out.println("|-- Info utente: " + "\n" +
                "| Nome completo: " + user.getNomeCompleto() + "\n" +
                "| Età: " + user.getEta() + "\n" +
                "--|");


    }
}
