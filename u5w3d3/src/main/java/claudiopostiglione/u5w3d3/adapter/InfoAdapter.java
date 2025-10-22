package claudiopostiglione.u5w3d3.adapter;

import java.time.LocalDate;


public class InfoAdapter extends UserData implements DataSource {

    private Info infoUser;

    public InfoAdapter(Info infoUser) {
        this.infoUser = infoUser;
    }

    @Override
    public String getNomeCompleto() {
        return infoUser.getNome() + infoUser.getCognome();
    }

    @Override
    public int getEta() {

        LocalDate dataAttuale = LocalDate.now();
        int annoAttuale = dataAttuale.getYear();

        return annoAttuale - infoUser.getDataDiNascita().getYear();
    }

    @Override
    public void getData(DataSource ds) {
        super.getData(ds);
    }
}
