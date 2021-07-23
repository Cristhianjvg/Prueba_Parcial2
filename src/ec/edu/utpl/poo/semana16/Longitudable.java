package ec.edu.utpl.poo.semana16;
import java.util.List;
public interface Longitudable {
    double conversion(double x);
    boolean esValorValido(double valor);
    boolean esUnidadValida(List<String> unidades, String unidad);
}
