package ec.edu.utpl.poo.semana16;
import java.util.Scanner;
import java.util.List;

public class Longitud {
    double valor;
    String unidadOrigen;
    String unidadDestino;
    List<String> unidadesSportadas = List.of("cm", "m", "km");

    public Longitud(double valor, String unidadOrigen, String unidadDestino) {
        setValor(valor);
        this.unidadOrigen = unidadOrigen;
        this.unidadDestino = unidadDestino;
    }

    public void setValor(double valor) {
        if (!esValorValido(valor)){
            this.valor = valor * (-1);
        } else {
            this.valor = valor;
        }
    }

    public void setUnidadOrigen(String unidadOrigen) {
        if ( esUnidadSoportada(unidadesSportadas, unidadOrigen)) {
            this.unidadOrigen = unidadOrigen;
        }
    }

    public void setUnidadDestino(String unidadDestino) {
        if ( esUnidadSoportada(unidadesSportadas, unidadOrigen)) {
            this.unidadDestino = unidadDestino;
        }

    }

    public double getValor() {
        return this.valor;
    }

    public String getUnidadOrigen() {
        return unidadOrigen;
    }

    public String getUnidadDestino() {
        return unidadDestino;
    }

    public double convertir(Longitudable l){
        return l.conversion(this.valor);
    }

    boolean esValorValido(double valor) {
        return valor > 0;
    };
    public boolean esUnidadValida(List<String> unidades, String unidad) {
        if(unidades.contains(unidad.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }

}
