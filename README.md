# Gestor de Incidencias

Aplicación de consola en Java diseñada para la consulta y gestión de un pequeño listado de avisos de soporte técnico de un centro educativo.

**Versión de Java:** Java (JDK) 17 o superior.

## Funcionalidades principales
- **Listar:** Muestra todas las incidencias registradas en el sistema.
- **Filtrar abiertas:** Muestra únicamente aquellas incidencias que están pendientes de resolución.
- **Buscar:** Permite localizar incidencias cuyo identificador o título coincidan con un texto proporcionado.
- **Detalle:** Busca una incidencia por su identificador exacto y muestra su información (lanzando una excepción controlada si no existe).

## Estructura de archivos

```text
/
├── .gitignore
├── pom.xml
├── README.md
├── src/
│   └── main/java/es/centro/incidencias/
│       ├── App.java
│       ├── GestorIncidencias.java
│       ├── Incidencia.java
│       └── IncidenciaNoEncontradaException.java
└── docs/                     ← (Contiene el sitio generado por Javadoc)