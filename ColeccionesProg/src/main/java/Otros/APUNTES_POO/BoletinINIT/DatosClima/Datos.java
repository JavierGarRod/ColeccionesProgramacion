package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.DatosClima;

public class Datos {

    //atributos

    double cantAgua;
    double tempMax;
    double tempMin;

    //constructor

    public Datos(double tempMin, double tempMax, double cantAgua) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.cantAgua = cantAgua;
    }

    //métodos

    public void calculo_riesgo_nieve(){
    if (this.tempMin < -5 && cantAgua > 0){
        System.out.println("RIESGO NEVADA");
    }
    else{
        System.out.println("NO NIEVA");
    }
    }

    private boolean validar(){
    if (this.tempMin == 0 && this.tempMax == 0){
        return true;
    }
    else{
        return false;
    }
    }

    public void alertarPosibleErrorEnTomaDatos(){
    if(validar()){
        System.out.println("Revisar el sistema de recogida de datos");
    }
    else{
        System.out.println("Todo ok :)");
    }
    }

    public double calculo_temp_media(){
        double total = this.tempMax + this.tempMin;
        double media = (total/2);
        return media;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "cantAgua=" + cantAgua +
                ", tempMax=" + tempMax +
                ", tempMin=" + tempMin +
                '}';
    }
}
