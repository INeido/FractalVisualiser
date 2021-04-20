package FractalVisualiser.calculations.iterations;

import FractalVisualiser.Fractal;

public class Julia extends IterationCalculator {

    @Override
    public int calculate(double c_re, double c_im, Fractal fractal) {
        double oldRe, oldIm;
        int iteration;
        for(iteration = 0; iteration < fractal.MaxIterations; iteration++)
        {
            oldRe = c_re;
            oldIm = c_im;
            c_re = oldRe * oldRe - oldIm * oldIm + -0.7;
            c_im = 2 * oldRe * oldIm + 0.26015;
            if((c_re * c_re + c_im * c_im) > fractal.EscapeValue) break;
        }
        return iteration;
    }
}
