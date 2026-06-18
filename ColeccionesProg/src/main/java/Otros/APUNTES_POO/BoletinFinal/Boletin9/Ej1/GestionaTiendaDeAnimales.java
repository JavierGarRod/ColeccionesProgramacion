package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej1;

public class GestionaTiendaDeAnimales {

    // Atributos de la tienda

    // Array donde guardamos todas las mascotas
    private Mascota[] mascotas = new Mascota[20];

    // Contador para saber cuántas mascotas hay guardadas
    private int contador = 0;

    public static void main(String[] args) {

        // Creamos la tienda
        GestionaTiendaDeAnimales tienda = new GestionaTiendaDeAnimales();

        // Añadimos animales
        tienda.añadir(new Perro("Toby", 3, 12.5, "Pequinés", true));
        tienda.añadir(new Loro("Paco", 5, 1.2, "Marruecos", true));
        tienda.añadir(new Serpiente("Nagini", 4, 8.0, 3, 6));

        // Mostramos la lista
        tienda.mostrarLista();

        // Mostramos el más pesado
        System.out.println("Más pesado: " + tienda.masPesado());

        // Más pesado por especie
        System.out.println("Más pesado perro: " + tienda.masPesadoPorEspecie("Perro"));
    }

        // MÉTODOS DE GESTIÓN DE LA TIENDA

        // Añadir una mascota al array
        public void añadir(Mascota m) {
            if (contador < mascotas.length) {
                mascotas[contador++] = m;
            }
        }

        // Mostrar solo el nombre + clase de cada mascota
        public void mostrarLista() {
            for (Mascota m : mascotas) {
                if (m != null) System.out.println(m);
            }
        }

        // Buscar una mascota por objeto (usa equals)
        public Mascota buscar(Mascota m) {
            for (Mascota x : mascotas) {
                if (x != null && x.equals(m)) return x;
            }
            return null;
        }

        // Sobrecarga: buscar por nombre + peso + especie
        public Mascota buscar(String nombre, double peso, String especie) {
            for (Mascota m : mascotas) {
                if (m != null &&
                        m.nombre.equals(nombre) &&
                        m.peso == peso &&
                        m.getClass().getSimpleName().equalsIgnoreCase(especie)) {
                    return m;
                }
            }
            return null;
        }

        // Mostrar toda la información de todas las mascotas
        public void mostrarTodo() {
            for (Mascota m : mascotas) {
                if (m != null) System.out.println(m.toString());
            }
        }

        // Eliminar por objeto
        public void eliminar(Mascota m) {
            for (int i = 0; i < mascotas.length; i++) {
                if (mascotas[i] != null && mascotas[i].equals(m)) {
                    mascotas[i] = null;
                    return;
                }
            }
        }

        // Sobrecarga: eliminar por datos
        public void eliminar(String nombre, String raza, double peso) {
            for (int i = 0; i < mascotas.length; i++) {
                Mascota m = mascotas[i];
                if (m instanceof Perro p &&
                        p.nombre.equals(nombre) &&
                        p.getPeso() == peso &&
                        p.toString().contains(raza)) {
                    mascotas[i] = null;
                    return;
                }
            }
        }

        // Mascota más pesada de toda la tienda
        public Mascota masPesado() {
            Mascota max = null;
            for (Mascota m : mascotas) {
                if (m != null && (max == null || m.getPeso() > max.getPeso())) {
                    max = m;
                }
            }
            return max;
        }

        // Mascota más pesada por especie
        public Mascota masPesadoPorEspecie(String especie) {
            Mascota max = null;
            for (Mascota m : mascotas) {
                if (m != null &&
                        m.getClass().getSimpleName().equalsIgnoreCase(especie) &&
                        (max == null || m.getPeso() > max.getPeso())) {
                    max = m;
                }
            }
            return max;
        }
    }
