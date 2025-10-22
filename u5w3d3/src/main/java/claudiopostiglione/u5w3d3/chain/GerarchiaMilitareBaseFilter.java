package claudiopostiglione.u5w3d3.chain;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
public abstract class GerarchiaMilitareBaseFilter {
    private GerarchiaMilitareBaseFilter next;

    public abstract void doFilter(Ufficiale ufficiale);

    public void nextFilter(Ufficiale ufficiale){
        if(this.next != null) this.next.doFilter(ufficiale);
        else System.out.println("Fine catena!");
    }


}
