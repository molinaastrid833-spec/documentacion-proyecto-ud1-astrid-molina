package es.centro.incidencias;
/**
 * @author Astrid Molina
 * @version 1.0
 */

/**
 * Excepción personalizada que se lanza cuando no se encuentra una incidencia
 * con el identificador proporcionado en el sistema.
 *
 * @see GestorIncidencias#buscarPorId(String)
 */

public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Construye una nueva excepción indicando el identificador que no existe.
     *
     * @param id el identificador de la incidencia que ha provocado la excepción
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
