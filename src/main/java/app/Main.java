package app;

import gestor.GestorDeArchivo;
import excepciones.ArchivoVacioException;
import validacion.ValidadorArchivo;

public class Main {
    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        String archivo = "archivoDemo.txt";
        String contenido = "Esto es una prueba de contenido.\nSegunda linea del archivo.";

        // Guardar el contenido en el archivo
        gestor.escribirArchivo(archivo, contenido);

        // Leer el contenido del archivo
        String textoLeido = gestor.leerArchivo(archivo);
        System.out.println("Contenido del archivo:\n" + textoLeido);

        // Verificar si el archivo está vacío
        try {
            validador.validarArchivoNoVacio(archivo);
            System.out.println("El archivo contiene texto.");
        } catch (ArchivoVacioException ave) {
            System.out.println("Excepción: " + ave.getMessage());
        }
    }
}
