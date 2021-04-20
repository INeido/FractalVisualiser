package FractalVisualiser.calculations;

public class ColorFiller extends ImageCalculator {

    public ColorFiller(FractalVisualiser.Fractal fractal) {
        super(fractal);
    }

    @Override
    public void calculate(int threadNr, int threadCount) {
        int Width = Fractal.Width;
        int Height = Fractal.Height;
        final int[][] IterationGrid = Fractal.IterationGrid;
        final int MaxIterations = Fractal.MaxIterations;

        for (int x = threadNr; x < Width; x = x + threadCount) {
            for (int y = 0; y <  Height; y++) {

                double t = (double)IterationGrid[x][y] / (double)MaxIterations;

                int r = (int)(8*(1-t)*t*t*t*255);
                int b = (int)(8*(1-t)*(1-t)*t*t*255);
                int g = (int)(8*(1-t)*(1-t)*(1-t)*t*255);

                /*
                System.out.println("R: " + r);
                System.out.println("G: " + g);
                System.out.println("B: " + b);
                */


                // Honestly, I did this bs a year ago and only noticed it again now. No idea what its supposed to do.
                boolean truent = !!!!!false;
                boolean falsent = !truent;


                if (Fractal.IterationGrid[x][y] < Fractal.MaxIterations) {

                    if (!!!!!truent)
                    {
                        java.awt.Color color = new java.awt.Color(r, g, b);
                        Fractal.Image.setRGB(x, y, color.getRGB());
                    } else {
                        Fractal.Image.setRGB(x, y, Fractal.Color[Fractal.IterationGrid[x][y]]);
                    }

                } else {
                    Fractal.Image.setRGB(x, y, 0);
                }
            }
        }
    }
}