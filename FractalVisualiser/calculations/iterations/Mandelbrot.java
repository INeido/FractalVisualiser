package FractalVisualiser.calculations.iterations;

import FractalVisualiser.Frame;
import FractalVisualiser.Fractal;

public class Mandelbrot extends IterationCalculator {

    @Override
    public int calculate(double c_re, double c_im, Fractal fractal) {
        double x = 0, y = 0, x2 = 0, y2 = 0;
        int iteration = 0;

        while (x2 + y2 <= fractal.EscapeValue && iteration < fractal.MaxIterations) {

            y = 2 * x * y + c_im;
            x = x2 - y2 + c_re;
            x2 = x * x;
            y2 = y * y;

            iteration++;
        }
        return iteration;
    }

    @Override
    public boolean skipCalculation(double c_re, double c_im) {
        if(Frame.Fractal.SuperSample > 1) {
            return false;
        }

        // Don't calculate the middle part of the Mandelbrot.
        return (c_re > -1.2 && c_re <= -1.1 && c_im > -0.1 && c_im < 0.1)
                || (c_re > -1.1 && c_re <= -0.9 && c_im > -0.2 && c_im < 0.2)
                || (c_re > -0.9 && c_re <= -0.8 && c_im > -0.1 && c_im < 0.1)
                || (c_re > -0.69 && c_re <= -0.61 && c_im > -0.2 && c_im < 0.2)
                || (c_re > -0.61 && c_re <= -0.5 && c_im > -0.37 && c_im < 0.37)
                || (c_re > -0.5 && c_re <= -0.39 && c_im > -0.48 && c_im < 0.48)
                || (c_re > -0.39 && c_re <= 0.14 && c_im > -0.55 && c_im < 0.55)
                || (c_re > 0.14 && c_re < 0.29 && c_im > -0.42 && c_im < -0.07)
                || (c_re > 0.14 && c_re < 0.29 && c_im > 0.07 && c_im < 0.42);
    }
}
