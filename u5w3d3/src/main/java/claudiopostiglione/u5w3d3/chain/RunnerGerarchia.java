package claudiopostiglione.u5w3d3.chain;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerGerarchia implements CommandLineRunner {

    @Autowired
    private Faker faker;

    @Override
    public void run(String... args) throws Exception {

        Ufficiale ufficiale1 = new Ufficiale(GradoMilitare.GENERALE, "Claudio", "Postiglione", 5000);
        Ufficiale ufficiale2 = new Ufficiale(GradoMilitare.CAPITANO, faker.lordOfTheRings().character(), faker.name().lastName(), 4000);
        Ufficiale ufficiale3 = new Ufficiale(GradoMilitare.COLONNELLO, faker.lordOfTheRings().character(), faker.name().lastName(), 3000);
        Ufficiale ufficiale4 = new Ufficiale(GradoMilitare.MAGGIORE, faker.lordOfTheRings().character(), faker.name().lastName(), 2000);
        Ufficiale ufficiale5 = new Ufficiale(GradoMilitare.TENENTE, faker.lordOfTheRings().character(), faker.name().lastName(), 1000);


        LoggerFilter loggerFilter = new LoggerFilter();
        StipendioFilter stipendioFilter = new StipendioFilter();

        //Impostiamo l'ordine di esecuzione dei filter
        loggerFilter.setNext(stipendioFilter);

        //Inizio catena
        System.out.println("\n");
        loggerFilter.doFilter(ufficiale1);
        System.out.println(" ");
        loggerFilter.doFilter(ufficiale2);
        System.out.println(" ");
        loggerFilter.doFilter(ufficiale3);
        System.out.println(" ");
        loggerFilter.doFilter(ufficiale4);
        System.out.println(" ");
        loggerFilter.doFilter(ufficiale5);
        System.out.println(" ");


    }
}
