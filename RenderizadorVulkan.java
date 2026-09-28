package Ejercicio33_motoresRenderizado;

public class RenderizadorVulkan implements MotorGrafico {
    private boolean contextoInicializado = false;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("[Vulkan] Contexto inicializado.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {
        if (!contextoInicializado) {
            System.out.println("[Vulkan] ERROR: el contexto no está inicializado, no se puede dibujar \"" + nombreMalla + "\".");
            return;
        }
        System.out.println("[Vulkan] Dibujando la malla \"" + nombreMalla + "\".");
    }

    @Override
    public void liberarRecursos() {
        contextoInicializado = false;
        System.out.println("[Vulkan] Recursos liberados.");
    }
}
