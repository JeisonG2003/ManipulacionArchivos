package validacion;

import excepciones.ArchivoVacioException;
import java.io.*;

public class ValidadorArchivo {
    public void validarArchivoNoVacio(String rutaArchivo) throws ArchivoVacioException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            if (br.readLine() == null) {
                throw new ArchivoVacioException("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al validar archivo: " + e.getMessage());
        }
    }
}
