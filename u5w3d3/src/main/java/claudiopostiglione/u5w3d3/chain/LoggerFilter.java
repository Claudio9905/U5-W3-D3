package claudiopostiglione.u5w3d3.chain;

public class LoggerFilter extends GerarchiaMilitareBaseFilter {

    @Override
    public void doFilter(Ufficiale ufficiale) {
        System.out.println("|-- Dati ufficiale --|");
        System.out.println("| Nome: " + ufficiale.nome + "\n" +
                "| Cognome: " + ufficiale.cognome + "\n" +
                "| Grado militare: " + ufficiale.grado + "\n" +
                "| Stipendio: " + ufficiale.stipendio + " €");
        this.nextFilter(ufficiale);
    }
}
