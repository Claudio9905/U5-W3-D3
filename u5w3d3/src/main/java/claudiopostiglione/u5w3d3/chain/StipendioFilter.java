package claudiopostiglione.u5w3d3.chain;

public class StipendioFilter extends GerarchiaMilitareBaseFilter {

    @Override
    public void doFilter(Ufficiale ufficiale) {

        double importoPercepito = 3000;

        if (ufficiale.getStipendio() >= importoPercepito) {
            System.out.println("L'ufficiale " + ufficiale.nome + " " + ufficiale.cognome + " percepisce l'importo di " + importoPercepito + " € avendo come stipendio: " + ufficiale.stipendio + " €");
            this.nextFilter(ufficiale);
        } else {
            System.out.println("L'ufficiale " + ufficiale.nome + " " + ufficiale.cognome + " non percepisce l'importo di " + importoPercepito + " €  avendo come stipendio: " + ufficiale.stipendio + " €");
        }
    }
}
