package aplicacion;
import dominio.*;
import java.util.*;

public class Principal {

    static Metodos.Objeto libro = new Metodos.Objeto("libro", 5.0, 2.0);
    static Metodos.Objeto patata = new Metodos.Objeto("patata", 3.0, 6.0);
    static Metodos.Objeto portatil = new Metodos.Objeto("portatil", 10.0, 4.0);
    static Metodos.Objeto movil = new Metodos.Objeto("movil", 2.0, 3.0);

    public static ArrayList<Metodos.Objeto> objetos = new ArrayList<>(Arrays.asList(libro, patata, portatil, movil));

    public static Metodos.Mochila mochila = new Metodos.Mochila(15);

    public static void main(String[] args){

        objetos.sort(Comparator.comparingDouble(e -> e.beneficio / e.peso));
        System.out.println("\n Los objetos son:");
        for (int i = 0; i<objetos.size(); i++){
            System.out.println(objetos.get(i).nombre);
        }
        System.out.println("\n Los que entran en la mochila son: ");
        for (int i = 0; i<objetos.size(); i++) {
            Metodos.addObjeto(mochila, objetos.get(i));
        }
        for (Metodos.Objeto objeto: mochila.cosas){
            System.out.println(objeto.nombre);
        }

    }


}
