package FractalVisualiser;

import java.io.*;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class FileHandler extends Frame {
    
    private static final long serialVersionUID = 1L;

    public String createDir(String name) {

        File theDir = new File(name);

        if (!theDir.exists()) {

            boolean result = false;

            try {
                theDir.mkdir();
                result = true;
            } catch (SecurityException se) {
                se.printStackTrace();
            }
            if (result) {

            }

        }
        return theDir.getName();
    }

    public void saveSettings(JFrame Frame) {

        String Path = System.getenv("APPDATA");

        createDir(Path + "\\Fractal");

        try {
            Properties Props = new Properties();
            Props.setProperty("Type", String.valueOf(Type));
            Props.setProperty("EscapeValue", EscapeValueField.getText());
            Props.setProperty("MaxIterations", IterationsField.getText());
            Props.setProperty("Zoom", ZoomField.getText());
            Props.setProperty("OffsetX", OffsetXField.getText());
            Props.setProperty("OffsetY", OffsetYField.getText());
            Props.setProperty("ThreadCount", ThreadField.getText());
            Props.setProperty("Width", String.valueOf(Frame.getWidth()));
            Props.setProperty("Height", String.valueOf(Frame.getHeight()));
            Props.setProperty("WindowPosX", String.valueOf(Frame.getLocationOnScreen().x));
            Props.setProperty("WindowPosY", String.valueOf(Frame.getLocationOnScreen().y));
            File File = new File(Path + "\\Fractal\\Settings.txt");
            OutputStream Out = new FileOutputStream(File);
            Props.store(Out, "Settings");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadSettings(JFrame Frame) throws IOException {

        String Path = System.getenv("APPDATA");

        BufferedReader Reader = new BufferedReader(new FileReader(Path + "\\Fractal\\Settings.txt"));

        Properties Props = new Properties();

        Props.load(Reader);

        Type = Integer.parseInt(Props.getProperty("Type"));
        EscapeValueField.setText(Props.getProperty("EscapeValue"));
        IterationsField.setText(Props.getProperty("MaxIterations"));
        ZoomField.setText(Props.getProperty("Zoom"));
        OffsetXField.setText(Props.getProperty("OffsetX"));
        OffsetYField.setText(Props.getProperty("OffsetY"));
        ThreadField.setText(Props.getProperty("ThreadCount"));
        Frame.setSize(Integer.parseInt(Props.getProperty("Width")), Integer.parseInt(Props.getProperty("Height")));
        Frame.setLocation(Integer.parseInt(Props.getProperty("WindowPosX")), Integer.parseInt(Props.getProperty("WindowPosY")));
    
    }

    public void takeImages() throws IOException {

        createDir((FolderNameField.getText()));

        BufferedWriter writer = new BufferedWriter(new FileWriter(FolderNameField.getText() + "/dump.txt", true));  
        writer.write("EscapeValue: " + EscapeValueField.getText());
        writer.newLine();
        writer.write("Iterations: " + IterationsField.getText());
        writer.newLine();
        writer.write("Offset X: " + OffsetXField.getText());
        writer.newLine();
        writer.write("Offset Y: " + OffsetYField.getText());
        writer.newLine();
        writer.write("Threads: " + ThreadField.getText());
        writer.newLine();
        writer.write("Starting Zoom: " + ZoomStartField.getText());
        writer.newLine();
        writer.write("Ending Zoom: " + ZoomEndField.getText());
        writer.newLine();
        writer.write("Increment: " + ZoomScaleField.getText());
        writer.newLine();
        writer.write("Type: " + Type);

        writer.close();

        double Zoom = Double.parseDouble(ZoomStartField.getText());
        double ZoomEnd = Double.parseDouble(ZoomEndField.getText());
        double ZoomScale = Double.parseDouble(ZoomScaleField.getText());
        
        while (Zoom < ZoomEnd) {

            Zoom *= ZoomScale;

            Frame.ZoomField.setText(String.valueOf(Zoom));

            Frame.render(false, true);

            ImageIO.write(Fractal.Image, "png", new File(System.currentTimeMillis() + "/seq_" + Zoom + ".png"));

        }
    }

    // TO-DO advanced file explorer
    
}