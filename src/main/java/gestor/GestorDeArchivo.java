package gestor;

import java.io.*;

public class GestorDeArchivo {
    public void escribirArchivo(String rutaArchivo, String datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write(datos);
        } catch (IOException e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    public String leerArchivo(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String lineaLeida;
            while ((lineaLeida = br.readLine()) != null) {
                contenido.append(lineaLeida).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return contenido.toString();
    }
}
