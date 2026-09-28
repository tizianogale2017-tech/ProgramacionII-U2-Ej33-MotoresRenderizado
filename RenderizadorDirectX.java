package Ejercicio33_motoresRenderizado;

public class RenderizadorDirectX implements MotorGrafico {
    private boolean contextoInicializado = false;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("[DirectX] Contexto inicializado.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {
        if (!contextoInicializado) {
            System.out.println("[DirectX] ERROR: el contexto no está inicializado, no se puede dibujar \"" + nombreMalla + "\".");
            return;
        }
        System.out.println("[DirectX] Dibujando la malla \"" + nombreMalla + "\".");
    }

    @Override
    public void liberarRecursos() {
        contextoInicializado = false;
        System.out.println("[DirectX] Recursos liberados.");
    }
}
