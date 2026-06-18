package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej3.Model;

public class RedDeSensores {

    //atributos
    private Sensor[] sensores;
    private int numSensores;

    //constructor
    public RedDeSensores() {
        this.sensores = new Sensor[50];
    }

    //métodos

    /*
    public boolean addSensores(Sensor s) {
        if (numSensores < sensores.length) {
            sensores[numSensores] = s;
            numSensores++;
            return true;
        }
        return false;
    }
    public boolean validarSensores() throws SensorException, FalloCriticoException {

        int sensoresFallados = 0;

        for (int i = 0; i < numSensores; i++) {
            Sensor s = sensores[i];

            int anomalias = s.contarLecturasAnomalas();
            int total = s.getNumLecturas();

            if (total > 0 && anomalias >= total / 3.0) {
                sensoresFallados++;
                throw new SensorException(s.getId(),
                        "El sensor tiene un tercio de lecturas anómalas.");
            }
        }

        if (sensoresFallados > numSensores / 2.0) {
            throw new FalloCriticoException("Más de la mitad de los sensores han fallado.");
        }

        return true;
    }*/
}