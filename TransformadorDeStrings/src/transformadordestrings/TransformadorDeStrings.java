package transformadordestrings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Elio Herrera
 */
public class TransformadorDeStrings {

    // Método que toma una lista de strings y una interfaz funcional para transformar los strings a mayúsculas
    private List<String> transformarAMayusculas(List<String> strings, TransformadorString transformador) {
        List<String> resultadoMayusculas = new ArrayList<>();

        // Recorrido de la lista de String y transformar
        for (String str : strings) {
            String transformado = transformador.transformar(str);
            resultadoMayusculas.add(transformado);
        }

        return resultadoMayusculas;
    }

    // Método que toma una lista de strings y una interfaz funcional para invertir el orden de los Strings
    private List<String> invertirOrden(List<String> strings, TransformadorString transformador) {
        List<String> resultadoInvertido = new ArrayList<>();

        //Tomamos el ultimo elemento de la lista y almacenamos en una nueva lista
        for (int i = strings.size() - 1; i >= 0; i--) {
            String transformado = transformador.transformar(strings.get(i));
            resultadoInvertido.add(transformado);
        }

        return resultadoInvertido;
    }

    public static void main(String[] args) {
        List<String> listaStrings = new ArrayList<>();

        listaStrings.add("!!!");
        listaStrings.add("central");
        listaStrings.add("es");
        listaStrings.add("rosario");

        // Crear una instancia de la clase TransformadorDeStrings
        TransformadorDeStrings transformador = new TransformadorDeStrings();

        // Expresión lambda para transformar los strings a mayúsculas
        List<String> stringsMayusculas = transformador.transformarAMayusculas(listaStrings, String::toUpperCase);

        // Expresión lambda para invertir el orden de los strings
        List<String> stringsInvertidas = transformador.invertirOrden(listaStrings, s -> s);

        // Impresion de listas de strings
        System.out.println("Lista original: " + listaStrings);
        System.out.println("Lista en mayúsculas: " + stringsMayusculas);
        System.out.println("Lista invertida: " + stringsInvertidas);
        System.out.println(""
                + "");

        System.out.println("------------------");
        // Recorrido e impresion de la lista s
        for (String stringMayuscula : stringsMayusculas) {
            System.out.print(stringMayuscula + "  ");
        }
        System.out.println("");

        // Recorrido e impresion de la lista stringInvertida
        for (String stringInvertida : stringsInvertidas) {
            System.out.print(stringInvertida + "  ");
        }
        System.out.println("");

    }
}
