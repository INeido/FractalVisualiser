package FractalVisualiser.calculations.iterations;

import FractalVisualiser.Fractal;

public abstract class IterationCalculator {
    public abstract int calculate(double c_re, double c_im, Fractal fractal);

    public boolean skipCalculation(double c_re, double c_im) {
        return false;
    }
}
