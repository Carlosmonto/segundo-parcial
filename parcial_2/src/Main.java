import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        // Generar reportes
        List<ReporteCarrera> reportes = listaEstudiante.generarReportes(listaCarrera);

        // Imprimir reportes
        System.out.println("Reportes de Carreras:");
        for (ReporteCarrera reporte : reportes) {
            System.out.println(reporte);
        }
    }
}