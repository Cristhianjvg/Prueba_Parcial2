package ec.edu.utpl.poo.semana16;
import java.util.List;

public class M2Km implements Longitudable{
    public double conversion(double x){
        return x/ (1000);
    }

    public boolean esValorValido(double valor){
        return valor > 0;
    }

    public boolean esUnidadValida(List<String> unidades, String unidad){
        if(unidades.contains(unidad.toLowerCase()) && unidad.equals("km")){
            return true;
        }else{
            return false;
        }
    }
}
