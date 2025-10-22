package claudiopostiglione.u5w3d3.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerGerarchia implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Ufficiale ufficiale1 = new Ufficiale(GradoMilitare.GENERALE,"Claudio", "Postiglione", 5000);

        LoggerFilter loggerFilter = new LoggerFilter();
        StipendioFilter stipendioFilter = new StipendioFilter();

        //Impostiamo l'ordine di esecuzione dei filter
        loggerFilter.setNext(stipendioFilter);

        //Inizio catena
        loggerFilter.doFilter(ufficiale1);


    }
}
