package claudiopostiglione.u5w3d3.chain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Ufficiale {
    GradoMilitare grado;
    String nome;
    String cognome;
    double stipendio;

}
