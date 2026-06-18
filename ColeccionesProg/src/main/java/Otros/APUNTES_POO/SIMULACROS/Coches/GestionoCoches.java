package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.Coches;

public class GestionoCoches {
    public static void main(String[] args) {

        // 1. Crear conductores
        Conductor c1 = new Conductor("Helen", 12);
        Conductor c2 = new Conductor("Pepe", 30);
        Conductor c3 = new Conductor("Javi", 5);

        // 2. Crear sensores
        Sensores s1 = new Sensores(20, 160);   // obstáculo cerca + velocidad alta
        Sensores s2 = new Sensores(100, 80);   // todo correcto
        Sensores s3 = new Sensores(10, 50);    // obstáculo muy cerca

        // 3. Crear coches
        Coche ch1 = new Coche("Fiat", "Rosa", "12345KNB", c1, s1);
        Coche ch2 = new Coche("BMW", "Serie 1", "88888ABC", c2, s2);
        Coche ch3 = new Coche("Audi", "A3", "12345KNB", c3, s3); // misma matrícula que ch1

        // 4. Probar equals
        System.out.println("--- PROBANDO EQUALS ---");
        System.out.println("¿ch1 y ch3 son iguales? " + ch1.equals(ch3));

        // 5. Intentar arrancar con NO dueño
        System.out.println("--- ARRANCAR CON NO DUEÑO ---");
        ch1.arrancar(c2); // Pepe intenta arrancar coche de Helen

        // 6. Arrancar con dueño correcto
        System.out.println("--- ARRANCAR CON DUEÑO CORRECTO ---");
        ch1.arrancar(c1);

        // 7. Verificar si debe parar (tiene obstáculo cerca)
        System.out.println("--- VERIFICAR SI DEBE PARAR (ch1) ---");
        ch1.verificarSiDebeParar();

        // 8. Intentar apagar coche ya apagado
        System.out.println("--- APAGAR COCHE YA APAGADO ---");
        ch1.apagar();

        // 9. Arrancar coche sin peligro
        System.out.println("--- ARRANCAR COCHE SIN PELIGRO (ch2) ---");
        ch2.arrancar(c2);

        // 10. Verificar si debe parar (no hay obstáculo)
        System.out.println("--- VERIFICAR SI DEBE PARAR (ch2) ---");
        ch2.verificarSiDebeParar();

        // 11. Mostrar estado final de los coches
        System.out.println("--- ESTADO FINAL DE LOS COCHES ---");
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
}

