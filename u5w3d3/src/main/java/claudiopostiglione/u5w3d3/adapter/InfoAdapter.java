package claudiopostiglione.u5w3d3.adapter;

import java.time.LocalDate;


public class InfoAdapter implements DataSource {

    private Info infoUser;

    public InfoAdapter(Info infoUser) {
        this.infoUser = infoUser;
    }

    @Override
    public String getNomeCompleto() {
        return infoUser.getNome() + " " + infoUser.getCognome();
    }

    @Override
    public int getEta() {

        LocalDate dataAttuale = LocalDate.now();
        int annoAttuale = dataAttuale.getYear();

        return annoAttuale - infoUser.getDataDiNascita().getYear();
    }

}
