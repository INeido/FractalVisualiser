package FractalVisualiser.calculations;

import FractalVisualiser.Fractal;

public abstract class ImageCalculator {

    protected FractalVisualiser.Fractal Fractal;

    public ImageCalculator(Fractal fractal) {
        Fractal = fractal;
    }

    public abstract void calculate(int threadNr, int threadCount);
}
