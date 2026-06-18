package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.SeguridadEmp;
import java.time.LocalDate;
public class GestionaIncidenciasEquipo {
    public static void main(String[] args) {

        // Array para almacenar incidencias
        Incidente[] incidencias = new Incidente[20];
        int numIncidencias = 0;

        // 1. Crear equipos
        Equipo pcJuan = new Equipo("pcJuan", "3C:D9:2B:88:99:AA", "Windows 10");
        Equipo pcMaria = new Equipo("pcMaria", "AA:BB:CC:11:22:33", "Linux");
        Equipo pcPedro = new Equipo("pcPedro", "FF:EE:DD:44:55:66", "Windows 11");
        Equipo pcAna   = new Equipo("pcAna", "77:88:99:AA:BB:CC", "MacOS");

        // 2. Crear incidencias (usando tu constructor)
        Incidente inc1 = new Incidente(1, "Actualización JDK", "Fallo al actualizar", null,EstadoIncidente.REGISTRADO,Criticidad.CRITICO,pcJuan);
        Incidente inc2 = new Incidente(2, "Virus detectado", "Malware en descargas", null, EstadoIncidente.ANALIZADO, Criticidad.GRAVE, pcMaria);
        Incidente inc3 = new Incidente(3, "Pantalla azul", "Error crítico del sistema", null, EstadoIncidente.EN_RESOLUCION, Criticidad.MEDIO, pcPedro);
        Incidente inc4 = new Incidente(4, "Teclado roto", "No responde", LocalDate.of(2025, 2, 20),  // fecha_fin porque está cerrado
                        EstadoIncidente.CERRADO,
                        Criticidad.LEVE,
                        pcMaria
                );

                // 3. Asignar incidencias a equipos
                pcJuan.setNum_incidentes(1);
                pcMaria.setNum_incidentes(2);
                pcPedro.setNum_incidentes(1);

                // 4. Guardar incidencias en el array
                incidencias[numIncidencias++] = inc1;
                incidencias[numIncidencias++] = inc2;
                incidencias[numIncidencias++] = inc3;
                incidencias[numIncidencias++] = inc4;

                // 5. Mostrar incidencias
                System.out.println("=== TODAS LAS INCIDENCIAS ===");
                for (int i = 0; i < numIncidencias; i++) {
                    System.out.println(incidencias[i]);
                }
            }
        }


