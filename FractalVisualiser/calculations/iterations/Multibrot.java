package FractalVisualiser.calculations.iterations;

import FractalVisualiser.Fractal;

public class Multibrot extends IterationCalculator {

    @Override
    public int calculate(double c_re, double c_im, Fractal fractal) {
        double x = 0, y = 0;
        int iteration = 0;

        while (x*x+y*y < fractal.EscapeValue && iteration < fractal.MaxIterations) {

            double x_new = (x * x * x * x * x) - 10 * (x * x * x) * (y * y) + 5 * x * (y * y * y * y) + c_re;
            y = 5 * (x * x * x * x) * y - 10 * (x * x) * (y * y * y) + (y * y * y * y * y) + c_im;
            x = x_new;

            iteration++;
        }
        return iteration;
    }
}
