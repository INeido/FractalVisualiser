package FractalVisualiser.calculations.iterations;

public class IterationManager {
    public static IterationCalculator getCalculator(int type) {
        switch (type) {
            case 0: return new Mandelbrot();
            case 1: return new Julia();
            case 2: return new Multibrot();
            case 3: return new Tricorn();
            default: return null;
        }
    }
}