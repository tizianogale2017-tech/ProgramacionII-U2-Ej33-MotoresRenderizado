package Ejercicio33_motoresRenderizado;

public interface MotorGrafico {
    void inicializarContexto();

    void dibujarMalla(String nombreMalla);

    void liberarRecursos();
}
