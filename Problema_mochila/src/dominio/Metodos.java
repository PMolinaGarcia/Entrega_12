package dominio;
import java.util.*;

public class Metodos {

    public static class Objeto{
        public double peso;
        public double beneficio;
        public String nombre;

        public Objeto(){}

        public Objeto(String nombre, double peso, double beneficio){
            this.nombre=nombre;
            this.peso=peso;
            this.beneficio=beneficio;
        }
    }

    public static class Mochila{
        double capacidad;
        public ArrayList<Objeto> cosas = new ArrayList<>();

        public Mochila(){};
        public Mochila(double capacidad){
            this.capacidad=capacidad;
        }
    }

    public static void addObjeto(Mochila mochila, Objeto objeto){
        if (objeto.peso<=mochila.capacidad){
            mochila.cosas.add(objeto);
            mochila.capacidad-=objeto.peso;
        }

    }



}
