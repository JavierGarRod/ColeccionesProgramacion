package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION;

public class ApuntesMapas {

    /*

  PARA RECORRER VALORES

    for (List<Publicacion> lista : mapa.values()) { }
    for (Cancion c : mapa.values()) { }


  PARA RECORRER CLAVES

    for (Artista a : mapa.keySet()) { }


  PARA RECORRER AMBAS COSAS

    for (Map.Entry<Artista, List<Cancion>> entry : mapa.entrySet()) {
    Artista a = entry.getKey();
    List<Cancion> canciones = entry.getValue();
    }


  CUANDO HAGO UNA COPIA ARRAYLIS (para no modificar la original o no)

        List<Artista> lista = new ArrayList<>(mapa.keySet());
        List<Cancion> lista = new ArrayList<>(mapa.values());
        List<Cancion> lista = mapa.get(artista);

        List<Cancion> todasLasCanciones = new ArrayList<>();
          for (List<Cancion> canciones : mapa.values()) {
              todasLasCanciones.addAll(canciones);
                        }


  OPERACIONES

       Añadir clave-valor
           mapa.put(artista, new ArrayList<>());

        Obtener el valor de una clave
            List<Cancion> canciones = mapa.get(artista);

        Comprobar si existe una clave
            mapa.containsKey(artista);

         Añadir a la lista de un artista que ya existe
            mapa.get(artista).add(cancion);

         Tamaño de la lista de un artista
            mapa.get(artista).size();

         Modificar un atributo de un objeto dentro de la lista
            for (Cancion c : mapa.get(artista)) {
                c.setReproducciones(c.getReproducciones() + 1);
                 }

     */
}
