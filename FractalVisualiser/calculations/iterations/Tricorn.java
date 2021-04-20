package FractalVisualiser.calculations.iterations;

import FractalVisualiser.Fractal;

public class Tricorn extends IterationCalculator {

    @Override
    public int calculate(double c_re, double c_im, Fractal fractal) {
        double x = 0, y = 0;
        int iteration = 0;

        while (x*x+y*y < fractal.EscapeValue && iteration < fractal.MaxIterations) {

            double xtemp = x*x - y*y + c_re;
            y = -2*x*y + c_im;
            x = xtemp;

            iteration++;
        }
        return iteration;
    }
}
