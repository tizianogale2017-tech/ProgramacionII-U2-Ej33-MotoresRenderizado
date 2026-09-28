package Ejercicio33_motoresRenderizado;

public class RenderizadorOpenGL implements MotorGrafico {
    private boolean contextoInicializado = false;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("[OpenGL] Contexto inicializado.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {
        if (!contextoInicializado) {
            System.out.println("[OpenGL] ERROR: el contexto no está inicializado, no se puede dibujar \"" + nombreMalla + "\".");
            return;
        }
        System.out.println("[OpenGL] Dibujando la malla \"" + nombreMalla + "\".");
    }

    @Override
    public void liberarRecursos() {
        contextoInicializado = false;
        System.out.println("[OpenGL] Recursos liberados.");
    }
}
