package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro6;

import java.util.HashMap;
import java.util.Map;

public class BancoAlimentos {

    private Map<Integer, CentroLogistico> centros;

    public BancoAlimentos() {
        centros = new HashMap<>();
    }

    // Agregar centro
    public void agregarCentro(CentroLogistico c) throws BancoException {
        if (centros.containsKey(c.getIdCentro())) {
            throw new BancoException("Ya existe un centro con ese identificador");
        }
        centros.put(c.getIdCentro(), c);
    }

    // Agregar trabajador a un centro
    public void agregarTrabajador(Trabajador t) throws BancoException {
        CentroLogistico c = centros.get(t.getIdCentro());
        if (c == null) {
            throw new BancoException("El centro no existe");
        }

        if (c.getTrabajadores().contains(t)) {
            throw new BancoException("El trabajador ya está registrado en este centro");
        }

        c.agregarTrabajador(t);
    }

    // Obtener centro por id
    public CentroLogistico getCentro(int idCentro) throws BancoException {
        CentroLogistico c = centros.get(idCentro);
        if (c == null) {
            throw new BancoException("Centro no encontrado");
        }
        return c;
    }

    // Obtener trabajador por DNI
    public Trabajador getTrabajador(String dni) throws BancoException {
        return centros.values().stream()
                .flatMap(c -> c.getTrabajadores().stream())
                .filter(t -> t.getDni().equalsIgnoreCase(dni))
                .findFirst()
                .orElseThrow(() -> new BancoException("Trabajador no encontrado"));
    }
}

