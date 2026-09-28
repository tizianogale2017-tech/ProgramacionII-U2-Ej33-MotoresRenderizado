package Ejercicio33_motoresRenderizado;

public class Main {
    public static void main(String[] args) {
        MotorGrafico motor = new RenderizadorOpenGL();
        motor.dibujarMalla("Personaje");
        motor.inicializarContexto();
        motor.dibujarMalla("Personaje");
        motor.liberarRecursos();

        System.out.println("--- Cambio de motor ---");
        motor = new RenderizadorDirectX();
        motor.inicializarContexto();
        motor.dibujarMalla("Escenario");
        motor.liberarRecursos();

        System.out.println("--- Cambio de motor ---");
        motor = new RenderizadorVulkan();
        motor.inicializarContexto();
        motor.dibujarMalla("Vehículo");
        motor.liberarRecursos();
    }
}
