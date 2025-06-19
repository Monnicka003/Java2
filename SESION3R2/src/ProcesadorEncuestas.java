import java.util.*;

public class ProcesadorEncuestas {

    public static void main(String[] args) {
        // 📋 Lista de sucursales con sus encuestas
        List<Sucursal> sucursales = List.of(
                new Sucursal("Centro", List.of(
                        new Encuesta("Gaby ", "El tiempo de espera fue largo", 1),
                        new Encuesta("Ferny", null, 5)
                )),
                new Sucursal("Norte", List.of(
                        new Encuesta("Ary", "La limpieza puede mejorar", 2),
                        new Encuesta("Ata", null, 4)
                ))

        );

        System.out.println("📋 Seguimiento a pacientes insatisfechos:");

        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3) // 🔍 Filtrar encuestas insatisfechas
                                .map(encuesta -> new Seguimiento(encuesta, sucursal.getNombre())) // 📝 Combinar encuesta + sucursal
                )
                .filter(seg -> seg.encuesta().getComentario().isPresent()) // 🔍 Filtrar encuestas con comentario
                .map(seg -> {
                    String comentario = seg.encuesta().getComentario().get();
                    return "Sucursal " + seg.sucursal() +
                            ": Seguimiento a paciente con comentario: \"" + comentario + "\"";
                })
                .forEach(System.out::println); // 📤 Imprimir mensajes
    }

    // Clase auxiliar para transportar Encuesta + Sucursal juntos, tipo record
    record Seguimiento(Encuesta encuesta, String sucursal) {
    }
}