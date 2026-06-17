package Exam17GestionContenido.Controller;

import Exam17GestionContenido.Models.*;
import Exam17GestionContenido.Repository.RepositorioContenidos;
import Exam17GestionContenido.Exception.ContenidoException;

import java.util.List;

public class GestionaPlataforma {
    // TODO: Implementa este método que intente agregar una etiqueta al contenido
    // Debe llamar al método agregarEtiqueta del repositorio usando try-catch
    // Captura ContenidoException y devuelve false si se lanza
    // Si se agrega correctamente, devuelve true
    public boolean agregaEtiqueta(RepositorioContenidos repo, String idContenido, Etiqueta etiqueta) {
        // TODO: Completar implementación
        return false;
    }

    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////
        // ESTE BLOQUE NO SE DEBE MODIFICAR
        /////////////////////////////////////////////////////////////
        System.out.println("=== INICIANDO PRUEBAS DEL SISTEMA ===\n");

        RepositorioContenidos repo = new RepositorioContenidos();
        GestionaPlataforma gestiona = new GestionaPlataforma();

        // Crear creadores
        Creador creador1 = new Creador("techguru", "Ana García", "ana@email.com");
        Creador creador2 = new Creador("codewizard", "Luis Martín", "luis@email.com");
        Creador creador3 = new Creador("designpro", "María López", "maria@email.com");

        // Crear etiquetas
        Etiqueta etiqJava = new Etiqueta("Java", CategoriaEtiqueta.PROGRAMACION);
        Etiqueta etiqPython = new Etiqueta("Python", CategoriaEtiqueta.PROGRAMACION);
        Etiqueta etiqWeb = new Etiqueta("WebDev", CategoriaEtiqueta.TECNOLOGIA);
        Etiqueta etiqIA = new Etiqueta("IA", CategoriaEtiqueta.CIENCIA);
        Etiqueta etiqUX = new Etiqueta("UX", CategoriaEtiqueta.DISENO);

        // Crear contenidos
        Contenido cont1 = new Contenido("VID001", "Tutorial Java Avanzado", TipoContenido.VIDEO, creador1);
        cont1.setVisualizaciones(1500);

        Contenido cont2 = new Contenido("ART001", "Guía de Python 2024", TipoContenido.ARTICULO, creador1);
        cont2.setVisualizaciones(800);

        Contenido cont3 = new Contenido("POD001", "Podcast sobre IA", TipoContenido.PODCAST, creador2);
        cont3.setVisualizaciones(2200);

        Contenido cont4 = new Contenido("VID002", "Java Spring Boot", TipoContenido.VIDEO, creador2);
        cont4.setVisualizaciones(3000);

        Contenido cont5 = new Contenido("IMG001", "Diseño UI/UX", TipoContenido.IMAGEN, creador3);
        cont5.setVisualizaciones(500);

        // PRUEBA 1: Agregar contenidos al repositorio
        System.out.println("PRUEBA 1 - Agregar contenidos al repositorio");
        repo.agregarContenido(cont1);
        repo.agregarContenido(cont2);
        repo.agregarContenido(cont3);
        repo.agregarContenido(cont4);
        repo.agregarContenido(cont5);
        System.out.println("✓ OK - Contenidos agregados al repositorio");
        System.out.println();

        // PRUEBA 2: Agregar etiquetas a contenidos en estado BORRADOR (debe funcionar)
        System.out.println("PRUEBA 2 - Agregar etiquetas a contenido en BORRADOR");
        boolean agregado1 = gestiona.agregaEtiqueta(repo, "VID001", etiqJava);
        boolean agregado2 = gestiona.agregaEtiqueta(repo, "VID001", etiqWeb);
        boolean agregado3 = gestiona.agregaEtiqueta(repo, "VID001", etiqUX);
        boolean agregado4 = gestiona.agregaEtiqueta(repo, "VID002", etiqJava);
        boolean agregado5 = gestiona.agregaEtiqueta(repo, "POD001", etiqIA);

        if (agregado1 && agregado2 && agregado3 && agregado4 && agregado5) {
            System.out.println("✓ OK - Etiquetas agregadas correctamente");
        } else {
            System.out.println("✗ ERROR - No se pudieron agregar las etiquetas");
        }
        System.out.println();

        // PRUEBA 3: Intentar agregar etiqueta a contenido ARCHIVADO (debe fallar)
        System.out.println("PRUEBA 3 - Intentar agregar etiqueta a contenido ARCHIVADO");
        cont5.setEstado(EstadoContenido.ARCHIVADO);
        boolean agregadoArchivado = gestiona.agregaEtiqueta(repo, "IMG001", etiqWeb);

        if (!agregadoArchivado) {
            System.out.println("✓ OK - Excepción capturada correctamente para contenido ARCHIVADO");
        } else {
            System.out.println("✗ ERROR - Debería haber devuelto false");
        }
        System.out.println();

        // PRUEBA 4: Intentar agregar etiqueta a contenido ELIMINADO (debe fallar)
        System.out.println("PRUEBA 4 - Intentar agregar etiqueta a contenido ELIMINADO");
        Contenido cont6 = new Contenido("VID003", "Video Eliminado", TipoContenido.VIDEO, creador1);
        cont6.setEstado(EstadoContenido.ELIMINADO);
        repo.agregarContenido(cont6);
        boolean agregadoEliminado = gestiona.agregaEtiqueta(repo, "VID003", etiqPython);

        if (!agregadoEliminado) {
            System.out.println("✓ OK - Excepción capturada correctamente para contenido ELIMINADO");
        } else {
            System.out.println("✗ ERROR - Debería haber devuelto false");
        }
        System.out.println();

        // PRUEBA 5: Intentar agregar etiqueta a contenido inexistente
        System.out.println("PRUEBA 5 - Intentar agregar etiqueta a contenido inexistente");
        boolean agregadoInexistente = gestiona.agregaEtiqueta(repo, "VID999", etiqJava);

        if (!agregadoInexistente) {
            System.out.println("✓ OK - Excepción capturada correctamente para contenido inexistente");
        } else {
            System.out.println("✗ ERROR - Debería haber devuelto false");
        }
        System.out.println();

        // PRUEBA 6: Buscar contenido existente (devuelve el contenido)
        System.out.println("PRUEBA 6 - Buscar contenido existente");
        Contenido encontrado = repo.buscarContenido("VID001");
        if (encontrado != null && encontrado.getTitulo().equals("Tutorial Java Avanzado")) {
            System.out.println("✓ OK - Contenido encontrado: " + encontrado);
        } else {
            System.out.println("✗ ERROR - Contenido no encontrado");
        }
        System.out.println();

        // PRUEBA 7: Buscar contenido inexistente (devuelve null)
        System.out.println("PRUEBA 7 - Buscar contenido inexistente");
        Contenido noEncontrado = repo.buscarContenido("VID888");
        if (noEncontrado == null) {
            System.out.println("✓ OK - Devuelve null para contenido inexistente");
        } else {
            System.out.println("✗ ERROR - Debería devolver null");
        }
        System.out.println();

        // PRUEBA 8: Publicar contenidos correctamente (gestionado en main)
        System.out.println("PRUEBA 8 - Publicar contenidos en estado BORRADOR");
        try {
            repo.publicarContenido("VID001");
            repo.publicarContenido("ART001");
            repo.publicarContenido("POD001");
            repo.publicarContenido("VID002");

            if (cont1.getEstado() == EstadoContenido.PUBLICADO && cont1.getFechaPublicacion() != null) {
                System.out.println("✓ OK - Contenidos publicados, estado y fecha actualizados");
            } else {
                System.out.println("✗ ERROR - El estado o la fecha no se actualizaron");
            }
        } catch (ContenidoException e) {
            System.out.println("✗ ERROR - " + e.getMessage());
        }
        System.out.println();

        // PRUEBA 9: Intentar publicar contenido que NO está en BORRADOR (gestionado en main)
        System.out.println("PRUEBA 9 - Intentar publicar contenido ARCHIVADO");
        try {
            repo.publicarContenido("IMG001"); // Este está ARCHIVADO
            System.out.println("✗ ERROR - Debería haber lanzado excepción");
        } catch (ContenidoException e) {
            System.out.println("✓ OK - Excepción capturada: " + e.getMessage());
        }
        System.out.println();

        // PRUEBA 10: Intentar publicar contenido inexistente (gestionado en main)
        System.out.println("PRUEBA 10 - Intentar publicar contenido inexistente");
        try {
            repo.publicarContenido("VID999");
            System.out.println("✗ ERROR - Debería haber lanzado excepción");
        } catch (ContenidoException e) {
            System.out.println("✓ OK - Excepción capturada: " + e.getMessage());
        }
        System.out.println();

        // PRUEBA 11: Actualizar contenido existente
        System.out.println("PRUEBA 11 - Actualizar contenido existente");
        Contenido cont1Actualizado = new Contenido("VID001", "Tutorial Java Actualizado", TipoContenido.VIDEO,
                creador1);
        cont1Actualizado.setVisualizaciones(5000);
        repo.agregarContenido(cont1Actualizado);

        Contenido actualizado = repo.buscarContenido("VID001");
        if (actualizado != null && actualizado.getVisualizaciones() == 5000) {
            System.out.println("✓ OK - Contenido actualizado correctamente");
        } else {
            System.out.println("✗ ERROR - El contenido no se actualizó");
        }
        System.out.println();

        // PRUEBA 12: Obtener etiquetas ordenadas por categoría y nombre (devuelve lista vacía si no existe)
        System.out.println("PRUEBA 12 - Obtener etiquetas ordenadas de VID001");
        List<Etiqueta> etiquetas = repo.obtenerEtiquetasOrdenadas("VID001");
        if (etiquetas.size() == 3) {
            // Verificar orden: DISENO < PROGRAMACION < TECNOLOGIA
            if (etiquetas.get(0).getCategoria() == CategoriaEtiqueta.DISENO
                    && etiquetas.get(1).getCategoria() == CategoriaEtiqueta.PROGRAMACION
                    && etiquetas.get(2).getCategoria() == CategoriaEtiqueta.TECNOLOGIA) {
                System.out.println("✓ OK - Etiquetas ordenadas correctamente por categoría:");
                for (Etiqueta e : etiquetas) {
                    System.out.println("  - " + e);
                }
            } else {
                System.out.println("✗ ERROR - El orden de categorías no es correcto");
            }
        } else {
            System.out.println("✗ ERROR - Se esperaban 3 etiquetas, se encontraron " + etiquetas.size());
        }
        System.out.println();

        // PRUEBA 13: Obtener etiquetas de contenido inexistente (devuelve lista vacía)
        System.out.println("PRUEBA 13 - Obtener etiquetas de contenido inexistente");
        List<Etiqueta> etiquetasInexistente = repo.obtenerEtiquetasOrdenadas("VID999");
        if (etiquetasInexistente.isEmpty()) {
            System.out.println("✓ OK - Devuelve lista vacía para contenido inexistente");
        } else {
            System.out.println("✗ ERROR - Debería devolver lista vacía");
        }
        System.out.println();

        // PRUEBA 14: Obtener contenidos más vistos (ordenados)
        System.out.println("PRUEBA 14 - Obtener contenidos más vistos (solo PUBLICADOS)");
        List<Contenido> masVistos = repo.obtenerContenidosMasVistos();
        if (masVistos.size() == 4) { // Solo los PUBLICADOS
            boolean ordenCorrecto = masVistos.get(0).getVisualizaciones() >= masVistos.get(1).getVisualizaciones()
                    && masVistos.get(1).getVisualizaciones() >= masVistos.get(2).getVisualizaciones();
            if (ordenCorrecto) {
                System.out.println("✓ OK - Contenidos ordenados correctamente por visualizaciones");
                for (Contenido c : masVistos) {
                    System.out.println("  - " + c + " (" + c.getVisualizaciones() + " vistas)");
                }
            } else {
                System.out.println("✗ ERROR - El orden no es correcto");
            }
        } else {
            System.out.println("✗ ERROR - Se esperaban 4 contenidos publicados, se encontraron " + masVistos.size());
        }
        System.out.println();

        System.out.println("=== FIN DE PRUEBAS ===");

        /////////////////////////////////////////////////////////////
        // FIN DEL BLOQUE NO MODIFICABLE
        /////////////////////////////////////////////////////////////

        /******************************************************************
         * A partir de este bloque puedes añadir tus propias pruebas
         *****************************************************************/

    }

    public boolean agregaEtiquetaContenido(String nombreContenidoBuscar, CategoriaEtiqueta categoria, String nombreEtiquetaAgregar){
        boolean resultado=true;
        try{

        } catch (ContenidoException e){
            resultado=false;
        }

        return resultado;
    }
}
