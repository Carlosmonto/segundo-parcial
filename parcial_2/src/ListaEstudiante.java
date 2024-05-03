import java.util.ArrayList;
import java.util.List;
public class ListaEstudiante {
    List<Estudiante> estudiantes;
    public ListaEstudiante() {
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20, 101L, 4.5));
        estudiantes.add(new Estudiante("María", 22, 102L, 4.1));
        estudiantes.add(new Estudiante("Carlos", 21, 103L, 3.8));
        estudiantes.add(new Estudiante("Rosa", 23, 101L, 4.5));
        estudiantes.add(new Estudiante("Luisa", 24, 102L, 4.1));
        estudiantes.add(new Estudiante("Camila", 21,103L, 3.8));
    }

    public List<ReporteCarrera> generarReportes(ListaCarrera listaCarrera) {
        List<ReporteCarrera> reportes = new ArrayList<>();
        for (Carrera carrera : listaCarrera.carreras) {
            ReporteCarrera reporte = new ReporteCarrera(carrera);
            int totalEstudiantes = 0;
            double totalNotas = 0;
            int totalEdad = 0;
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.carrera.equals(carrera.codigo)) {
                    totalEstudiantes++;
                    totalNotas += estudiante.promedio;
                    totalEdad += estudiante.edad;
                }
            }
            if (totalEstudiantes > 0) {
                double promedioNotas = totalNotas / totalEstudiantes;
                double promedioEdad = (double) totalEdad / totalEstudiantes;
                reporte.setPromedioNotas(promedioNotas);
                reporte.setPromedioEdad(promedioEdad);
            }
            reportes.add(reporte);
        }
        return reportes;
    }
}