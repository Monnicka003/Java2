package MisionEspacial;


import java.util.concurrent.Callable;

public class SistemaCtrlTermico implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1100);
        return "🔥 Control térmico: temperatura estable (22°C).";
    }
}