package FractalVisualiser.calculations;

import FractalVisualiser.Frame;
import FractalVisualiser.Fractal;
import FractalVisualiser.ThreadMaster;
import FractalVisualiser.calculations.iterations.IterationCalculator;

public class IterationLoop extends ImageCalculator {

    private final IterationCalculator IterCalc;

    public IterationLoop(Fractal fractal, IterationCalculator iterCalc) {
        super(fractal);
        IterCalc = iterCalc;
    }

    @Override
    public void calculate(int threadNr, int threadCount) {
        int Width = Fractal.Width * Fractal.SuperSample;
        int Height = Fractal.Height * Fractal.SuperSample;
        int WidthHalf = Width / 2;
        int HeightHalf = Height / 2;
        double PixelScaler = 4.0 / Width / Fractal.Zoom;
        double OffsetX = Fractal.OffsetX;
        double OffsetY = Fractal.OffsetY;
        double c_re = 0;
        double c_im = 0;

        for (int x = threadNr; x < Width; x = x + threadCount) {

            for (int y = 0; y < Height; c_im = (y - HeightHalf) * PixelScaler - OffsetY, y++) {

                c_re = (x - WidthHalf) * PixelScaler + OffsetX;

                if (IterCalc.skipCalculation(c_re, c_im)) {
                    Fractal.IterationGrid[x][y] = Fractal.MaxIterations;
                    continue;
                }

                Fractal.IterationGrid[x][y] = IterCalc.calculate(c_re, c_im, Fractal);

            }

            ThreadMaster.Progress++;
            Frame.Progrressbar.setValue(ThreadMaster.Progress);
        }

    }

}
