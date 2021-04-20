package FractalVisualiser;

import java.awt.image.BufferedImage;

public class Fractal {

    public final int Width;
    public int Height;
    public int MaxIterations;
    public int SuperSample;

    public double Zoom, OffsetX, OffsetY, EscapeValue;

    public BufferedImage Image, oldImage;

    public int[] Color;

    public int[][] IterationGrid, oldIterationGrid;


    /**
     * Constructor of the {@code Fractal} class.
     * 
     * <p>
     * 
     * @param SuperSample Factor the {@code BufferedImage} should be upscaled by. (1, 3, 5, 7)
     * @param Width Width of the {@code BufferedImage}.
     * @param Height Height of the {@code BufferedImage}.
     * @param MaxIterations Bailout Iteration count.
     * @param EscapeValue Bailout coordiante (Absolute).
     * @param Zoom Zoom.
     * @param OffsetX X offset on the coordinate system.
     * @param OffsetY Y offset on the coordinate system.
     *
     */
    public Fractal(int SuperSample, int Width, int Height, int MaxIterations, double Zoom, double OffsetX, double OffsetY, double EscapeValue) {

        this.Width = Width;
        this.Height = Height;
        this.MaxIterations = MaxIterations;
        this.Zoom = Zoom;
        this.OffsetX = OffsetX;
        this.OffsetY = OffsetY;
        this.EscapeValue = EscapeValue;
        this.SuperSample = SuperSample;
        this.IterationGrid = new int[Width * SuperSample][Height * SuperSample];
        this.oldIterationGrid= this.IterationGrid;

        Image = new BufferedImage(Width * SuperSample, Height * SuperSample, 1);
        Color = getColorPalette(MaxIterations);

    }

    public int[] getColorPalette(int colorCount) {
        int[] color = new int[colorCount];

        for (int i = 0; i < colorCount; i++) {
            color[i] = java.awt.Color.HSBtoRGB(i / 256f, 1f, i / (i + 8f));
        }
        return color;
    }

    public final void portBufferedImage() {

        oldImage = Image;

        Image = new BufferedImage(Width, Height, 1); 
    }

    public final void portIterationGrid() {

        oldIterationGrid = IterationGrid;

        IterationGrid = new int[Width][Height]; 
    }    

}
