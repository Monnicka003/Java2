import MisionEspacial.SistemaComunicaciones;
import MisionEspacial.SistemaCtrlTermico;
import MisionEspacial.SistemaNavegacion;
import MisionEspacial.SistemaSoporteV;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("🚀 Simulación de misión espacial iniciada...");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> nav = executor.submit(new SistemaNavegacion());
        Future<String> vital = executor.submit(new SistemaSoporteV());
        Future<String> com = executor.submit(new SistemaComunicaciones());
        Future<String> termico = executor.submit(new SistemaCtrlTermico());

        System.out.println(nav.get());
        System.out.println(vital.get());
        System.out.println(com.get());
        System.out.println(termico.get());

        executor.shutdown();
        System.out.println("✅ Todos los sistemas reportan estado operativo.");
    }
}