package FractalVisualiser.calculations;

public class SuperSampleDownscaler extends ImageCalculator {

    public SuperSampleDownscaler(FractalVisualiser.Fractal fractal) {
        super(fractal);
    }

    @Override
    public void calculate(int threadNr, int threadCount) {
        if(threadNr == 0) {
            Fractal.portBufferedImage();
            Fractal.portIterationGrid();
        }

        int Width = Fractal.Width;
        int Height = Fractal.Height;
        int SuperSample = Fractal.SuperSample;
        int[] Colors = new int[SuperSample * SuperSample];

        for (int x = threadNr * SuperSample; x < Width * SuperSample; x = x + SuperSample + threadCount) {
            for (int y = 0; y < Height * SuperSample; y += SuperSample) {

                if (x - 1 < 0 || y - 1 < 0 || x + 1 >= Width * SuperSample || y + 1 >= Height * SuperSample)
                    continue;

                int jot = 0;
                for (int cx = -SuperSample / 2; cx <= SuperSample / 2; cx++) {
                    for (int cy = -SuperSample / 2; cy <= SuperSample / 2; cy++, jot++) {

                        Colors[jot] = Fractal.oldIterationGrid[x + cx][y + cy];

                    }
                }

                Colors[Colors.length - 1] = 0;

                for (int i = 0; i < Colors.length - 1; i++) {

                    Colors[Colors.length - 1] = Colors[Colors.length - 1] + Colors[i];

                }

                Colors[Colors.length - 1] = Colors[Colors.length - 1] / (Colors.length - 1);

                Fractal.IterationGrid[x / SuperSample][y / SuperSample] = Colors[Colors.length - 1];

            }

        }
    }

}
