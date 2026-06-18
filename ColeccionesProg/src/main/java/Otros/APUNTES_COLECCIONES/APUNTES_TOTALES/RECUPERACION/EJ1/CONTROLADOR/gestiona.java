package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.CONTROLADOR;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.MODELO.Contacto;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.MODELO.Tipo_Contacto;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.REPOSITORIO.repoContacto;

import java.util.HashSet;

public class gestiona {
    public static void main(String[] args) {

        //Contactos
        Contacto c1 = new Contacto("Yina", "Sánchez Pablo", "678697041", "yina@gmail.com", Tipo_Contacto.CLIENTE);
        Contacto c2 = new Contacto("Rena", "Sánchez ", "678692341", "carest@gmail.com", Tipo_Contacto.PROVEEDOR);
        Contacto c3 = new Contacto("Anelise", "Pablo", "678697034", "tare@gmail.com", Tipo_Contacto.EMPLEADO);
        Contacto c4 = new Contacto("Solaire", "Sánchez Pablo", "678127041", "yare@gmail.com", Tipo_Contacto.CLIENTE);
        Contacto c5 = new Contacto("Elaina", "Mikage Yang", "678457041", "yang@gmail.com", Tipo_Contacto.EMPLEADO);
        Contacto c6 = new Contacto("Leo", "Yin", "678695991", "yinnn@gmail.com", Tipo_Contacto.PROVEEDOR);

        HashSet<Contacto> contactos = new HashSet<>();
        contactos.add(c1);
        contactos.add(c2);
        contactos.add(c3);
        contactos.add(c4);
        contactos.add(c5);
        contactos.add(c6);

        repoContacto r1 = new repoContacto(contactos);

        System.out.println("\n--LISTA DE TODOS LOS CONTACTOS--");
        for (Contacto c : r1.listarContactos()) {
            System.out.println(c);
        }
        System.out.println("\n--CONTACTOS TOTALES--");
        System.out.println(r1.contactos_totales());

        System.out.println("\n--LISTA POR TIPO--");
        for (Contacto c : r1.listarPorTipoContacto(Tipo_Contacto.CLIENTE)){
            System.out.println(c);
        }
        System.out.println("\n--ELIMINAR CONTACTO--");
        System.out.println(r1.eliminarContacto("678692341"));
    }
}
