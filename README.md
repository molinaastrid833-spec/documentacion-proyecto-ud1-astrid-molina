# Gestor de Incidencias

Aplicación de consola en Java diseñada para la consulta y gestión de avisos de soporte técnico del centro. Permite a los usuarios interactuar con un registro de incidencias tanto a través de un menú interactivo como mediante argumentos directos en la línea de comandos.

## Funcionalidades y requisitos

**Funcionalidades principales:**
- **Listar:** Muestra el registro completo de incidencias.
- **Filtrar abiertas:** Muestra únicamente las incidencias que están pendientes de resolución.
- **Buscar:** Permite localizar incidencias cuyo identificador o título coincidan con un texto específico.
- **Detalle:** Busca una incidencia por su identificador exacto y muestra su información (lanzando un error controlado si no existe).

**Requisitos del sistema:**
- Java Development Kit (JDK) 17 o superior.
- Terminal o consola de comandos (Bash, PowerShell, CMD).
- Apache Maven (opcional, para compilar y generar Javadoc a través de `pom.xml`).

## Estructura de archivos

El proyecto sigue la estructura estándar de Maven:

```text
proyecto-base-maven-gestor-incidencias/
├── pom.xml
├── README.md
├── src/
│   └── main/java/
│       └── es/centro/incidencias/
│           ├── App.java
│           ├── GestorIncidencias.java
│           ├── Incidencia.java
│           └── IncidenciaNoEncontradaException.java
└── docs/                    ← (Se creará al generar el Javadoc)