package MisionEspacial;

import java.util.concurrent.Callable;

public class SistemaSoporteV implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1200);
        return "🧪 Soporte vital: presión y oxígeno dentro de parámetros normales.";
    }
}