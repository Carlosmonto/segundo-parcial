 public class ReporteCarrera {
    Carrera carrera;
    double promedioNotas;
    double promedioEdad;
    //Constructores, getters, setters, etc
    public ReporteCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public void setPromedioEdad(double promedioEdad) {
        this.promedioEdad = promedioEdad;
    }

    public String toString() {
        return "Carrera: " + carrera.nombre +  ", Promedio de notas: " + promedioNotas + " Promedio de edad: " + promedioEdad;
    }
}