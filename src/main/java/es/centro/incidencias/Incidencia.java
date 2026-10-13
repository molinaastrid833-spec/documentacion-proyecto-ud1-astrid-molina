package es.centro.incidencias;

import java.util.Locale;
/**
 * @author Astrid Molina
 * @version 1.0
 */

/**
 * Representa un aviso de soporte o incidencia técnica.
 * Almacena la información principal del aviso, incluyendo su identificador,
 * título, nivel de prioridad y su estado.
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una nueva instancia de incidencia con los datos especificados.
     *
     * @param id        el identificador único asignado a la incidencia
     * @param titulo    una breve descripción del problema
     * @param prioridad el nivel de urgencia o prioridad de la incidencia
     * @param abierta   {@code true} si la incidencia está pendiente, {@code false} si está resuelta
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtiene el identificador de la incidencia.
     *
     * @return el identificador único
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el título descriptivo de la incidencia.
     *
     * @return el título de la incidencia
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el nivel de prioridad asignado a la incidencia.
     *
     * @return la prioridad en formato de texto
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Comprueba el estado actual de la incidencia.
     *
     * @return {@code true} si la incidencia está abierta, {@code false} en caso contrario
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Verifica si el identificador o el título de la incidencia contienen el texto especificado,
     * ignorando el uso de mayúsculas y minúsculas.
     *
     * @param texto el criterio de búsqueda a evaluar
     * @return {@code true} si el texto forma parte del ID o del título, {@code false} si no hay coincidencia
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
