package es.centro.incidencias;

import java.util.List;
/**
 * @author Astrid Molina
 * @version 1.0
 */

/**
 * Gestiona una colección de incidencias y proporciona operaciones de filtrado
 * y búsqueda sobre ellas.
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Construye un nuevo gestor e inicializa la colección interna con
     * varias incidencias por defecto.
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }
    /**
     * Devuelve la lista completa de incidencias registradas.
     *
     * @return una lista con todas las instancias de incidencias
     */
    public List<Incidencia> listar() {
        return incidencias;
    }
    /**
     * Filtra la lista para devolver únicamente las incidencias que se encuentran abiertas.
     *
     * @return una lista que contiene solo las incidencias abiertas
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }
    /**
     * Busca incidencias que coincidan con el texto introducido.
     * La comprobación se delega en el método {@link Incidencia#coincideCon(String)}.
     *
     * @param texto la cadena de caracteres a buscar dentro del identificador o título
     * @return una lista con las incidencias que contienen el texto proporcionado
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }
    /**
     * Busca y devuelve una única incidencia cuyo identificador coincida exactamente
     * con el suministrado por el usuario.
     *
     * @param id el identificador exacto de la incidencia a buscar
     * @return el objeto de la incidencia encontrada
     * @throws IncidenciaNoEncontradaException si no existe ninguna incidencia con el identificador indicado
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }
    /**
     * Obtiene una incidencia mediante su identificador, silenciando los errores si no existe.
     *
     * @param id el identificador de la incidencia
     * @return la incidencia encontrada, o {@code null} si no existe
     * @since 1.0.0
     * @deprecated Ocultar errores devolviendo un valor nulo se considera una mala práctica.
     *             Utilice {@link #buscarPorId(String)} en su lugar, ya que gestiona correctamente
     *             los casos de error mediante excepciones.
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
