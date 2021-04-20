package FractalVisualiser;

import FractalVisualiser.calculations.ColorFiller;
import FractalVisualiser.calculations.ImageCalculator;
import FractalVisualiser.calculations.IterationLoop;
import FractalVisualiser.calculations.SuperSampleDownscaler;
import FractalVisualiser.calculations.iterations.IterationCalculator;
import FractalVisualiser.calculations.iterations.IterationManager;
import FractalVisualiser.settings.Settings;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Frame extends JFrame {
    
    public static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public static ExecutorService ThreadStart = Executors.newFixedThreadPool(1);

    private static final long serialVersionUID = 1L;

    public Frame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogSettings = new JDialog();
        SettingsPanel = new JPanel();
        IterationsLabel = new JLabel();
        IterationsField = new JFormattedTextField();
        ThreadLabel = new JLabel();
        ThreadField = new JFormattedTextField();
        DetermineCoreCount = new JButton();
        EscapeValueField = new JFormattedTextField();
        EscapeValueLabel = new JLabel();
        SaveSettingsButton = new JButton();
        jSeparator7 = new JSeparator();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        SuperSamplingLabel = new JLabel();
        ThreadLabel2 = new JLabel();
        SuperSamplingSlider = new JSlider();
        SharpeningSlider = new JSlider();
        jSeparator9 = new JSeparator();
        jLabel8 = new JLabel();
        SaveSettingsButton1 = new JButton();
        DialogExport = new JDialog();
        ExportPanel = new JPanel();
        ExportImageButton = new JButton();
        ExportCurrentImageButton = new JButton();
        jSeparator5 = new JSeparator();
        OpenSettingsButton = new JButton();
        AdvancedResolutionSettingsButton1 = new JButton();
        SaveResolutionFieldY1 = new JFormattedTextField();
        SaveResolutionFieldX1 = new JFormattedTextField();
        ResolutionLabel3 = new JLabel();
        DialogSequence = new JDialog();
        SequencePanel = new JPanel();
        ZoomScaleField = new JFormattedTextField();
        jLabel1 = new JLabel();
        jLabel4 = new JLabel();
        ZoomEndField = new JFormattedTextField();
        jLabel5 = new JLabel();
        ZoomStartField = new JFormattedTextField();
        StartSequenceButton = new JButton();
        jLabel6 = new JLabel();
        FolderNameField = new JFormattedTextField();
        DialogSave = new JDialog();
        SavePaneä = new JPanel();
        DialogLoad = new JDialog();
        LoadPanel = new JPanel();
        DialogResolution = new JDialog();
        ResolutionPanel = new JPanel();
        SaveResolutionFieldX = new JFormattedTextField();
        SaveResolutionFieldY = new JFormattedTextField();
        ResolutionLabel1 = new JLabel();
        SetResolutionButton = new JButton();
        ResolutionLabel2 = new JLabel();
        AdvancedResolutionSettingsButton0 = new JButton();
        DialogColor = new JDialog();
        ColorMakerPanel = new JPanel();
        NewColorSchemeLabel = new JLabel();
        jColorChooser1 = new JColorChooser();
        ColorPresetsPanel = new JPanel();
        ColorLabel0 = new JLabel();
        SelectColorButton0 = new JButton();
        ColorPreview0 = new JLabel();
        ColorPreview1 = new JLabel();
        ColorLabel1 = new JLabel();
        SelectColorButton1 = new JButton();
        ColorPreview2 = new JLabel();
        ColorLabel2 = new JLabel();
        SelectColorButton2 = new JButton();
        ColorPreview3 = new JLabel();
        ColorLabel3 = new JLabel();
        SelectColorButton3 = new JButton();
        ColorPreview4 = new JLabel();
        ColorLabel4 = new JLabel();
        SelectColorButton4 = new JButton();
        ColorPreview5 = new JLabel();
        ColorLabel5 = new JLabel();
        SelectColorButton5 = new JButton();
        SelectColorButton11 = new JButton();
        ColorPreview6 = new JLabel();
        ColorLabel6 = new JLabel();
        SelectColorButton6 = new JButton();
        SelectColorButton7 = new JButton();
        ColorLabel7 = new JLabel();
        ColorPreview7 = new JLabel();
        ColorPreview8 = new JLabel();
        ColorLabel8 = new JLabel();
        SelectColorButton8 = new JButton();
        SelectColorButton9 = new JButton();
        ColorLabel9 = new JLabel();
        ColorPreview9 = new JLabel();
        ColorPreview10 = new JLabel();
        ColorPreview11 = new JLabel();
        ColorLabel11 = new JLabel();
        ColorLabel10 = new JLabel();
        SelectColorButton10 = new JButton();
        jScrollPane3 = new JScrollPane();
        jScrollPane1 = new JScrollPane();
        jScrollBar1 = new JScrollBar();
        jScrollBar2 = new JScrollBar();
        buttonGroup1 = new ButtonGroup();
        DialogAdvancedResolution = new JDialog();
        AspectRatioPanel = new JPanel();
        AspectRatioLabel = new JLabel();
        AspectRatio0 = new JRadioButton();
        AspectRatio1 = new JRadioButton();
        AspectRatio2 = new JRadioButton();
        AspectRatio3 = new JRadioButton();
        AspectRatio4 = new JRadioButton();
        CustomAspectRatio0 = new JFormattedTextField();
        CustomAspectRatio1 = new JFormattedTextField();
        SaveResolutionLabel = new JLabel();
        SetResolutionFieldX = new JFormattedTextField();
        SetResolutionFieldY = new JFormattedTextField();
        FixedRatioToggleButton = new JToggleButton();
        jPanel1 = new JPanel();
        PresetLabel = new JLabel();
        ResolutionButton0 = new JRadioButton();
        ResolutionButton1 = new JRadioButton();
        ResolutionButton2 = new JRadioButton();
        ResolutionButton3 = new JRadioButton();
        ResolutionButton4 = new JRadioButton();
        ResolutionButton5 = new JRadioButton();
        ResolutionButton6 = new JRadioButton();
        ResolutionButton7 = new JRadioButton();
        jLabel7 = new JLabel();
        ResolutionY0 = new JLabel();
        jLabel9 = new JLabel();
        ResolutionY1 = new JLabel();
        jLabel10 = new JLabel();
        ResolutionY2 = new JLabel();
        jLabel11 = new JLabel();
        ResolutionY3 = new JLabel();
        jLabel12 = new JLabel();
        ResolutionY4 = new JLabel();
        jLabel13 = new JLabel();
        ResolutionY5 = new JLabel();
        jLabel14 = new JLabel();
        ResolutionY6 = new JLabel();
        jLabel15 = new JLabel();
        ResolutionY7 = new JLabel();
        SaveResolutionButton = new JButton();
        buttonGroup2 = new ButtonGroup();
        jScrollPane2 = new JScrollPane();
        Canvas = new JPanel() {

            private static final long serialVersionUID = 1L;
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;

                g2.drawImage(Fractal.Image, 0, 0, null);
                g2.setColor (Color.gray);

                if (mDragged_size>0 && Type != -1)
                {
                    int width = mDragged_size;
                    int height = (mDragged_size * Canvas.getHeight())/Canvas.getWidth();
                    g2.draw3DRect(mPressed_x-width/2, mPressed_y - height/2, width, height, true);
                }
            }
        };
        QuickMenu = new JPanel();
        OffsetXLAbel = new JLabel();
        OffsetXField = new JFormattedTextField();
        ZoomLabel = new JLabel();
        ZoomField = new JFormattedTextField();
        StartButtonCalc = new JButton();
        OffsetYLabel = new JLabel();
        OffsetYField = new JFormattedTextField();
        ResetButton = new JButton();
        CalcTypeField = new JFormattedTextField();
        Progrressbar = new JProgressBar();
        MenuBarFile = new JMenuBar();
        ExportAs = new JMenu();
        MenuExport = new JMenuItem();
        jSeparator2 = new JPopupMenu.Separator();
        SettingsMenu = new JMenuItem();
        CustomResMenu = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        MenuLoadSettings = new JMenuItem();
        MenuSaveSettings = new JMenuItem();
        ModeMenu = new JMenu();
        MandelbrotSetMenu = new JMenuItem();
        MultibrotSetMenu = new JMenuItem();
        BuddhabrotSetMenu = new JMenuItem();
        JuliaSetMenu = new JMenuItem();
        TricornSetMenu = new JMenuItem();
        PresetsMenu = new JMenu();
        PresetMenu0 = new JMenuItem();
        PresetMenu1 = new JMenuItem();
        PresetMenu2 = new JMenuItem();
        ExtrasMenu = new JMenu();
        SequenceMenu = new JMenuItem();

        DialogSettings.setTitle("Set Resolution");
        DialogSettings.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        DialogSettings.setMinimumSize(new Dimension(360, 620));
        DialogSettings.setName("DialogExport"); // NOI18N
        DialogSettings.setResizable(false);
        DialogSettings.setSize(new Dimension(360, 620));
        DialogSettings.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        SettingsPanel.setMinimumSize(new Dimension(320, 580));
        SettingsPanel.setPreferredSize(new Dimension(320, 580));

        IterationsLabel.setText("Itrations");
        IterationsLabel.setMaximumSize(new Dimension(100, 20));
        IterationsLabel.setMinimumSize(new Dimension(100, 20));
        IterationsLabel.setPreferredSize(new Dimension(100, 20));

        IterationsField.setText("1024");
        IterationsField.setMaximumSize(new Dimension(100, 20));
        IterationsField.setMinimumSize(new Dimension(100, 20));
        IterationsField.setPreferredSize(new Dimension(100, 20));

        ThreadLabel.setText("Threads");
        ThreadLabel.setMaximumSize(new Dimension(100, 20));
        ThreadLabel.setMinimumSize(new Dimension(100, 20));
        ThreadLabel.setPreferredSize(new Dimension(100, 20));

        ThreadField.setText("4");
        ThreadField.setMaximumSize(new Dimension(100, 20));
        ThreadField.setMinimumSize(new Dimension(100, 20));
        ThreadField.setPreferredSize(new Dimension(100, 20));

        DetermineCoreCount.setText("Determine Optimal");
        DetermineCoreCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DetermineCoreCountActionPerformed(evt);
            }
        });

        EscapeValueField.setText("4.0");
        EscapeValueField.setMaximumSize(new Dimension(100, 20));
        EscapeValueField.setMinimumSize(new Dimension(100, 20));
        EscapeValueField.setPreferredSize(new Dimension(100, 20));

        EscapeValueLabel.setText("Escape Value");
        EscapeValueLabel.setMaximumSize(new Dimension(100, 20));
        EscapeValueLabel.setMinimumSize(new Dimension(100, 20));
        EscapeValueLabel.setPreferredSize(new Dimension(100, 20));

        SaveSettingsButton.setText("Save");
        SaveSettingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaveSettingsButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("General");

        jLabel3.setText("Graphics");

        SuperSamplingLabel.setText("Super Sampling");
        SuperSamplingLabel.setMaximumSize(new Dimension(100, 20));
        SuperSamplingLabel.setMinimumSize(new Dimension(100, 20));
        SuperSamplingLabel.setPreferredSize(new Dimension(100, 20));

        ThreadLabel2.setText("Sharpening");
        ThreadLabel2.setMaximumSize(new Dimension(100, 20));
        ThreadLabel2.setMinimumSize(new Dimension(100, 20));
        ThreadLabel2.setPreferredSize(new Dimension(100, 20));

        SuperSamplingSlider.setMajorTickSpacing(2);
        SuperSamplingSlider.setMaximum(7);
        SuperSamplingSlider.setMinimum(1);
        SuperSamplingSlider.setMinorTickSpacing(2);
        SuperSamplingSlider.setPaintLabels(true);
        SuperSamplingSlider.setValue(1);
        SuperSamplingSlider.setMinimumSize(new Dimension(70, 20));
        SuperSamplingSlider.setPreferredSize(new Dimension(70, 20));

        SharpeningSlider.setMajorTickSpacing(1);
        SharpeningSlider.setMaximum(5);
        SharpeningSlider.setMinimum(-5);
        SharpeningSlider.setPaintLabels(true);
        SharpeningSlider.setToolTipText("");
        SharpeningSlider.setValue(0);
        SharpeningSlider.setMinimumSize(new Dimension(70, 20));
        SharpeningSlider.setPreferredSize(new Dimension(70, 20));

        jLabel8.setText("Colors");

        SaveSettingsButton1.setText("Open Color Settings");
        SaveSettingsButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaveSettingsButton1ActionPerformed(evt);
            }
        });

        GroupLayout SettingsPanelLayout = new GroupLayout(SettingsPanel);
        SettingsPanel.setLayout(SettingsPanelLayout);
        SettingsPanelLayout.setHorizontalGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addComponent(ThreadLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ThreadField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(DetermineCoreCount, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7)
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addComponent(SuperSamplingLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SuperSamplingSlider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                                        .addComponent(IterationsLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IterationsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                                        .addComponent(EscapeValueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EscapeValueField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addComponent(ThreadLabel2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SharpeningSlider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jSeparator9)
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2))
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)))
                            .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(SaveSettingsButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(SaveSettingsButton1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SettingsPanelLayout.setVerticalGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ThreadLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThreadField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetermineCoreCount))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(IterationsLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(IterationsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EscapeValueLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EscapeValueField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(SuperSamplingSlider, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, SettingsPanelLayout.createSequentialGroup()
                        .addComponent(SuperSamplingLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(20, 20, 20)
                .addGroup(SettingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(SharpeningSlider, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ThreadLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveSettingsButton1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(SaveSettingsButton)
                .addGap(26, 26, 26))
        );

        GroupLayout DialogSettingsLayout = new GroupLayout(DialogSettings.getContentPane());
        DialogSettings.getContentPane().setLayout(DialogSettingsLayout);
        DialogSettingsLayout.setHorizontalGroup(DialogSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SettingsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DialogSettingsLayout.setVerticalGroup(DialogSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, DialogSettingsLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SettingsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DialogExport.setTitle("Export Image");
        DialogExport.setMinimumSize(new Dimension(360, 250));
        DialogExport.setName("DialogExport"); // NOI18N
        DialogExport.setResizable(false);
        DialogExport.setSize(new Dimension(460, 170));
        DialogExport.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        ExportPanel.setMaximumSize(null);
        ExportPanel.setMinimumSize(new Dimension(460, 170));
        ExportPanel.setPreferredSize(new Dimension(460, 170));

        ExportImageButton.setText("Export Image");
        ExportImageButton.setFocusPainted(false);
        ExportImageButton.setMaximumSize(new Dimension(100, 20));
        ExportImageButton.setMinimumSize(new Dimension(100, 20));
        ExportImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ExportImageButtonActionPerformed(evt);
            }
        });

        ExportCurrentImageButton.setText("Export Current Image");
        ExportCurrentImageButton.setFocusPainted(false);
        ExportCurrentImageButton.setMaximumSize(new Dimension(100, 20));
        ExportCurrentImageButton.setMinimumSize(new Dimension(100, 20));
        ExportCurrentImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ExportCurrentImageButtonActionPerformed(evt);
            }
        });

        OpenSettingsButton.setText("Open Settings");
        OpenSettingsButton.setFocusPainted(false);
        OpenSettingsButton.setMaximumSize(new Dimension(100, 20));
        OpenSettingsButton.setMinimumSize(new Dimension(100, 20));
        OpenSettingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OpenSettingsButtonActionPerformed(evt);
            }
        });

        AdvancedResolutionSettingsButton1.setText("Advanced Resolution Settings");
        AdvancedResolutionSettingsButton1.setMaximumSize(new Dimension(125, 25));
        AdvancedResolutionSettingsButton1.setMinimumSize(new Dimension(125, 25));
        AdvancedResolutionSettingsButton1.setPreferredSize(new Dimension(125, 25));
        AdvancedResolutionSettingsButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AdvancedResolutionSettingsButton1ActionPerformed(evt);
            }
        });

        SaveResolutionFieldY1.setText("720");
        SaveResolutionFieldY1.setMinimumSize(new Dimension(64, 20));
        SaveResolutionFieldY1.setPreferredSize(new Dimension(64, 20));
        SaveResolutionFieldY1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                SaveResolutionFieldY1KeyReleased(evt);
            }
        });

        SaveResolutionFieldX1.setText("1280");
        SaveResolutionFieldX1.setMinimumSize(new Dimension(64, 20));
        SaveResolutionFieldX1.setPreferredSize(new Dimension(64, 20));
        SaveResolutionFieldX1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                SaveResolutionFieldX1KeyReleased(evt);
            }
        });

        ResolutionLabel3.setText("Resolution");
        ResolutionLabel3.setMaximumSize(new Dimension(64, 20));
        ResolutionLabel3.setMinimumSize(new Dimension(64, 20));
        ResolutionLabel3.setPreferredSize(new Dimension(64, 20));

        GroupLayout ExportPanelLayout = new GroupLayout(ExportPanel);
        ExportPanel.setLayout(ExportPanelLayout);
        ExportPanelLayout.setHorizontalGroup(ExportPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ExportPanelLayout.createSequentialGroup()
                .addGroup(ExportPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(ExportPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ExportCurrentImageButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(ExportPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
                    .addGroup(ExportPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(ExportPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(ExportPanelLayout.createSequentialGroup()
                                .addGroup(ExportPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(SaveResolutionFieldY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SaveResolutionFieldX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ResolutionLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(AdvancedResolutionSettingsButton1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                            .addComponent(ExportImageButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(OpenSettingsButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExportPanelLayout.setVerticalGroup(ExportPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ExportPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ExportCurrentImageButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResolutionLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(ExportPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(ExportPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveResolutionFieldX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveResolutionFieldY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(ExportPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(AdvancedResolutionSettingsButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(OpenSettingsButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExportImageButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout DialogExportLayout = new GroupLayout(DialogExport.getContentPane());
        DialogExport.getContentPane().setLayout(DialogExportLayout);
        DialogExportLayout.setHorizontalGroup(DialogExportLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogExportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportPanel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        DialogExportLayout.setVerticalGroup(DialogExportLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogExportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportPanel, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        DialogSequence.setTitle("Sequence");
        DialogSequence.setMinimumSize(new Dimension(220, 200));
        DialogSequence.setName("DialogExport"); // NOI18N
        DialogSequence.setResizable(false);
        DialogSequence.setSize(new Dimension(220, 200));
        DialogSequence.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        SequencePanel.setMinimumSize(new Dimension(200, 180));
        SequencePanel.setPreferredSize(new Dimension(200, 180));

        ZoomScaleField.setText("1.1");

        jLabel1.setText("Zoom Scale");

        jLabel4.setText("Zoom End");

        ZoomEndField.setText("1");

        jLabel5.setText("Zoom Start");

        ZoomStartField.setText("1");

        StartSequenceButton.setText("Start");
        StartSequenceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                StartSequenceButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Folder Name");

        FolderNameField.setText("Sequence");

        GroupLayout SequencePanelLayout = new GroupLayout(SequencePanel);
        SequencePanel.setLayout(SequencePanelLayout);
        SequencePanelLayout.setHorizontalGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SequencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(SequencePanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(StartSequenceButton))
                    .addGroup(GroupLayout.Alignment.TRAILING, SequencePanelLayout.createSequentialGroup()
                        .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(GroupLayout.Alignment.LEADING, SequencePanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(FolderNameField))
                            .addGroup(SequencePanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ZoomScaleField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                            .addGroup(SequencePanelLayout.createSequentialGroup()
                                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(ZoomStartField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ZoomEndField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SequencePanelLayout.setVerticalGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SequencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomScaleField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomStartField))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomEndField))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SequencePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(FolderNameField, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(SequencePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(StartSequenceButton)
                .addGap(28, 28, 28))
        );

        GroupLayout DialogSequenceLayout = new GroupLayout(DialogSequence.getContentPane());
        DialogSequence.getContentPane().setLayout(DialogSequenceLayout);
        DialogSequenceLayout.setHorizontalGroup(DialogSequenceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogSequenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SequencePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogSequenceLayout.setVerticalGroup(DialogSequenceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogSequenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SequencePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DialogSave.setTitle("Save Settings");
        DialogSave.setMinimumSize(new Dimension(800, 600));
        DialogSave.setName("DialogExport"); // NOI18N
        DialogSave.setSize(new Dimension(800, 600));
        DialogSave.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        SavePaneä.setMinimumSize(new Dimension(800, 600));

        GroupLayout SavePaneäLayout = new GroupLayout(SavePaneä);
        SavePaneä.setLayout(SavePaneäLayout);
        SavePaneäLayout.setHorizontalGroup(SavePaneäLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SavePaneäLayout.setVerticalGroup(SavePaneäLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        GroupLayout DialogSaveLayout = new GroupLayout(DialogSave.getContentPane());
        DialogSave.getContentPane().setLayout(DialogSaveLayout);
        DialogSaveLayout.setHorizontalGroup(DialogSaveLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SavePaneä, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogSaveLayout.setVerticalGroup(DialogSaveLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, DialogSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SavePaneä, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        DialogLoad.setTitle("Load Settings");
        DialogLoad.setMinimumSize(new Dimension(800, 600));
        DialogLoad.setName("DialogExport"); // NOI18N
        DialogLoad.setSize(new Dimension(800, 600));
        DialogLoad.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        LoadPanel.setMinimumSize(new Dimension(800, 600));

        GroupLayout LoadPanelLayout = new GroupLayout(LoadPanel);
        LoadPanel.setLayout(LoadPanelLayout);
        LoadPanelLayout.setHorizontalGroup(LoadPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        LoadPanelLayout.setVerticalGroup(LoadPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        GroupLayout DialogLoadLayout = new GroupLayout(DialogLoad.getContentPane());
        DialogLoad.getContentPane().setLayout(DialogLoadLayout);
        DialogLoadLayout.setHorizontalGroup(DialogLoadLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogLoadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoadPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogLoadLayout.setVerticalGroup(DialogLoadLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, DialogLoadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoadPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        DialogResolution.setTitle("Set Resolution");
        DialogResolution.setMinimumSize(new Dimension(168, 255));
        DialogResolution.setName("DialogExport"); // NOI18N
        DialogResolution.setResizable(false);
        DialogResolution.setSize(new Dimension(168, 255));
        DialogResolution.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        ResolutionPanel.setMinimumSize(new Dimension(150, 205));
        ResolutionPanel.setPreferredSize(new Dimension(150, 205));

        SaveResolutionFieldX.setText("1280");
        SaveResolutionFieldX.setMinimumSize(new Dimension(64, 20));
        SaveResolutionFieldX.setPreferredSize(new Dimension(64, 20));
        SaveResolutionFieldX.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                SaveResolutionFieldXKeyReleased(evt);
            }
        });

        SaveResolutionFieldY.setText("720");
        SaveResolutionFieldY.setMinimumSize(new Dimension(64, 20));
        SaveResolutionFieldY.setPreferredSize(new Dimension(64, 20));
        SaveResolutionFieldY.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                SaveResolutionFieldYKeyReleased(evt);
            }
        });

        ResolutionLabel1.setText("Resolution");
        ResolutionLabel1.setMaximumSize(new Dimension(64, 20));
        ResolutionLabel1.setMinimumSize(new Dimension(64, 20));
        ResolutionLabel1.setPreferredSize(new Dimension(64, 20));

        SetResolutionButton.setText("Set Resolution");
        SetResolutionButton.setMaximumSize(new Dimension(125, 25));
        SetResolutionButton.setMinimumSize(new Dimension(125, 25));
        SetResolutionButton.setPreferredSize(new Dimension(125, 25));
        SetResolutionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SetResolutionButtonActionPerformed(evt);
            }
        });

        ResolutionLabel2.setText("Minimum is 1280 x 720");
        ResolutionLabel2.setMaximumSize(new Dimension(64, 20));
        ResolutionLabel2.setMinimumSize(new Dimension(64, 20));
        ResolutionLabel2.setPreferredSize(new Dimension(64, 20));

        AdvancedResolutionSettingsButton0.setText("Advanced Settings");
        AdvancedResolutionSettingsButton0.setMaximumSize(new Dimension(125, 25));
        AdvancedResolutionSettingsButton0.setMinimumSize(new Dimension(125, 25));
        AdvancedResolutionSettingsButton0.setPreferredSize(new Dimension(125, 25));
        AdvancedResolutionSettingsButton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AdvancedResolutionSettingsButton0ActionPerformed(evt);
            }
        });

        GroupLayout ResolutionPanelLayout = new GroupLayout(ResolutionPanel);
        ResolutionPanel.setLayout(ResolutionPanelLayout);
        ResolutionPanelLayout.setHorizontalGroup(ResolutionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ResolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResolutionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(ResolutionPanelLayout.createSequentialGroup()
                        .addGroup(ResolutionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(SaveResolutionFieldX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveResolutionFieldY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(ResolutionPanelLayout.createSequentialGroup()
                        .addGroup(ResolutionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(ResolutionLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetResolutionButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdvancedResolutionSettingsButton0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionLabel2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ResolutionPanelLayout.setVerticalGroup(ResolutionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ResolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResolutionLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveResolutionFieldX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveResolutionFieldY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResolutionLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(AdvancedResolutionSettingsButton0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(SetResolutionButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GroupLayout DialogResolutionLayout = new GroupLayout(DialogResolution.getContentPane());
        DialogResolution.getContentPane().setLayout(DialogResolutionLayout);
        DialogResolutionLayout.setHorizontalGroup(DialogResolutionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogResolutionLayout.createSequentialGroup()
                .addComponent(ResolutionPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        DialogResolutionLayout.setVerticalGroup(DialogResolutionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogResolutionLayout.createSequentialGroup()
                .addComponent(ResolutionPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        DialogColor.setTitle("Color Settings");
        DialogColor.setMinimumSize(new Dimension(360, 250));
        DialogColor.setName("DialogExport"); // NOI18N
        DialogColor.setResizable(false);
        DialogColor.setSize(new Dimension(521, 910));
        DialogColor.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        ColorMakerPanel.setMaximumSize(null);
        ColorMakerPanel.setMinimumSize(new Dimension(460, 170));

        NewColorSchemeLabel.setText("New Color Scheme");

        GroupLayout ColorMakerPanelLayout = new GroupLayout(ColorMakerPanel);
        ColorMakerPanel.setLayout(ColorMakerPanelLayout);
        ColorMakerPanelLayout.setHorizontalGroup(ColorMakerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ColorMakerPanelLayout.createSequentialGroup()
                .addGroup(ColorMakerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(ColorMakerPanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(NewColorSchemeLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                    .addGroup(ColorMakerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, GroupLayout.PREFERRED_SIZE, 613, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ColorMakerPanelLayout.setVerticalGroup(ColorMakerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ColorMakerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewColorSchemeLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ColorLabel0.setText("Color1");

        SelectColorButton0.setText("Select");
        SelectColorButton0.setFocusPainted(false);
        SelectColorButton0.setMaximumSize(new Dimension(100, 20));
        SelectColorButton0.setMinimumSize(new Dimension(100, 20));
        SelectColorButton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton0ActionPerformed(evt);
            }
        });

        ColorLabel1.setText("Color1");

        SelectColorButton1.setText("Select");
        SelectColorButton1.setFocusPainted(false);
        SelectColorButton1.setMaximumSize(new Dimension(100, 20));
        SelectColorButton1.setMinimumSize(new Dimension(100, 20));
        SelectColorButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton1ActionPerformed(evt);
            }
        });

        ColorLabel2.setText("Color1");

        SelectColorButton2.setText("Select");
        SelectColorButton2.setFocusPainted(false);
        SelectColorButton2.setMaximumSize(new Dimension(100, 20));
        SelectColorButton2.setMinimumSize(new Dimension(100, 20));
        SelectColorButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton2ActionPerformed(evt);
            }
        });

        ColorLabel3.setText("Color1");

        SelectColorButton3.setText("Select");
        SelectColorButton3.setFocusPainted(false);
        SelectColorButton3.setMaximumSize(new Dimension(100, 20));
        SelectColorButton3.setMinimumSize(new Dimension(100, 20));
        SelectColorButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton3ActionPerformed(evt);
            }
        });

        ColorLabel4.setText("Color1");

        SelectColorButton4.setText("Select");
        SelectColorButton4.setFocusPainted(false);
        SelectColorButton4.setMaximumSize(new Dimension(100, 20));
        SelectColorButton4.setMinimumSize(new Dimension(100, 20));
        SelectColorButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton4ActionPerformed(evt);
            }
        });

        ColorLabel5.setText("Color1");

        SelectColorButton5.setText("Select");
        SelectColorButton5.setFocusPainted(false);
        SelectColorButton5.setMaximumSize(new Dimension(100, 20));
        SelectColorButton5.setMinimumSize(new Dimension(100, 20));
        SelectColorButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton5ActionPerformed(evt);
            }
        });

        SelectColorButton11.setText("Select");
        SelectColorButton11.setFocusPainted(false);
        SelectColorButton11.setMaximumSize(new Dimension(100, 20));
        SelectColorButton11.setMinimumSize(new Dimension(100, 20));
        SelectColorButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton11ActionPerformed(evt);
            }
        });

        ColorLabel6.setText("Color1");

        SelectColorButton6.setText("Select");
        SelectColorButton6.setFocusPainted(false);
        SelectColorButton6.setMaximumSize(new Dimension(100, 20));
        SelectColorButton6.setMinimumSize(new Dimension(100, 20));
        SelectColorButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton6ActionPerformed(evt);
            }
        });

        SelectColorButton7.setText("Select");
        SelectColorButton7.setFocusPainted(false);
        SelectColorButton7.setMaximumSize(new Dimension(100, 20));
        SelectColorButton7.setMinimumSize(new Dimension(100, 20));
        SelectColorButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton7ActionPerformed(evt);
            }
        });

        ColorLabel7.setText("Color1");

        ColorLabel8.setText("Color1");

        SelectColorButton8.setText("Select");
        SelectColorButton8.setFocusPainted(false);
        SelectColorButton8.setMaximumSize(new Dimension(100, 20));
        SelectColorButton8.setMinimumSize(new Dimension(100, 20));
        SelectColorButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton8ActionPerformed(evt);
            }
        });

        SelectColorButton9.setText("Select");
        SelectColorButton9.setFocusPainted(false);
        SelectColorButton9.setMaximumSize(new Dimension(100, 20));
        SelectColorButton9.setMinimumSize(new Dimension(100, 20));
        SelectColorButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton9ActionPerformed(evt);
            }
        });

        ColorLabel9.setText("Color1");

        ColorLabel11.setText("Color1");

        ColorLabel10.setText("Color1");

        SelectColorButton10.setText("Select");
        SelectColorButton10.setFocusPainted(false);
        SelectColorButton10.setMaximumSize(new Dimension(100, 20));
        SelectColorButton10.setMinimumSize(new Dimension(100, 20));
        SelectColorButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectColorButton10ActionPerformed(evt);
            }
        });

        GroupLayout ColorPresetsPanelLayout = new GroupLayout(ColorPresetsPanel);
        ColorPresetsPanel.setLayout(ColorPresetsPanelLayout);
        ColorPresetsPanelLayout.setHorizontalGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(ColorPresetsPanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton5, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton6, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton7, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton8, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview9, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel9, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton9, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview10, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel10, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton10, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview11, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel11, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton11, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ColorPresetsPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview0, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel0, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton0, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ColorPresetsPanelLayout.createSequentialGroup()
                                .addComponent(ColorPreview2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ColorLabel2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SelectColorButton2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47))
        );
        ColorPresetsPanelLayout.setVerticalGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ColorPresetsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel0, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton0, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview0, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColorPresetsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorLabel11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectColorButton11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorPreview11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jScrollBar1);

        GroupLayout DialogColorLayout = new GroupLayout(DialogColor.getContentPane());
        DialogColor.getContentPane().setLayout(DialogColorLayout);
        DialogColorLayout.setHorizontalGroup(DialogColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(DialogColorLayout.createSequentialGroup()
                        .addComponent(ColorPresetsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(632, 632, 632)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ColorMakerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DialogColorLayout.setVerticalGroup(DialogColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorMakerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ColorPresetsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DialogColorLayout.createSequentialGroup()
                        .addGroup(DialogColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(DialogColorLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollBar2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        DialogAdvancedResolution.setTitle("Save Settings");
        DialogAdvancedResolution.setMinimumSize(new Dimension(360, 400));
        DialogAdvancedResolution.setName("DialogExport"); // NOI18N
        DialogAdvancedResolution.setSize(new Dimension(360, 400));
        DialogAdvancedResolution.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        AspectRatioPanel.setMinimumSize(new Dimension(120, 340));
        AspectRatioPanel.setPreferredSize(new Dimension(120, 340));

        AspectRatioLabel.setHorizontalAlignment(SwingConstants.CENTER);
        AspectRatioLabel.setText("Aspect Ratio");
        AspectRatioLabel.setMaximumSize(new Dimension(100, 20));
        AspectRatioLabel.setMinimumSize(new Dimension(100, 20));
        AspectRatioLabel.setPreferredSize(new Dimension(100, 20));

        buttonGroup1.add(AspectRatio0);
        AspectRatio0.setSelected(true);
        AspectRatio0.setText("16:9");
        AspectRatio0.setMaximumSize(new Dimension(50, 20));
        AspectRatio0.setMinimumSize(new Dimension(50, 20));
        AspectRatio0.setPreferredSize(new Dimension(50, 20));
        AspectRatio0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AspectRatio0ActionPerformed(evt);
            }
        });

        buttonGroup1.add(AspectRatio1);
        AspectRatio1.setText("21:9");
        AspectRatio1.setMaximumSize(new Dimension(50, 20));
        AspectRatio1.setMinimumSize(new Dimension(50, 20));
        AspectRatio1.setPreferredSize(new Dimension(50, 20));
        AspectRatio1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AspectRatio1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(AspectRatio2);
        AspectRatio2.setText("4:3");
        AspectRatio2.setMaximumSize(new Dimension(50, 20));
        AspectRatio2.setMinimumSize(new Dimension(50, 20));
        AspectRatio2.setPreferredSize(new Dimension(50, 20));
        AspectRatio2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AspectRatio2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(AspectRatio3);
        AspectRatio3.setText("1:1");
        AspectRatio3.setMaximumSize(new Dimension(50, 20));
        AspectRatio3.setMinimumSize(new Dimension(50, 20));
        AspectRatio3.setPreferredSize(new Dimension(50, 20));
        AspectRatio3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AspectRatio3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(AspectRatio4);
        AspectRatio4.setText("Custom");
        AspectRatio4.setMaximumSize(new Dimension(50, 20));
        AspectRatio4.setMinimumSize(new Dimension(50, 20));
        AspectRatio4.setPreferredSize(new Dimension(50, 20));
        AspectRatio4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AspectRatio4ActionPerformed(evt);
            }
        });

        CustomAspectRatio0.setEditable(false);
        CustomAspectRatio0.setText("16");
        CustomAspectRatio0.setMinimumSize(new Dimension(40, 20));
        CustomAspectRatio0.setPreferredSize(new Dimension(40, 20));
        CustomAspectRatio0.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                CustomAspectRatio0KeyPressed(evt);
            }
        });

        CustomAspectRatio1.setEditable(false);
        CustomAspectRatio1.setText("9");
        CustomAspectRatio1.setMinimumSize(new Dimension(40, 20));
        CustomAspectRatio1.setPreferredSize(new Dimension(40, 20));
        CustomAspectRatio1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                CustomAspectRatio1KeyPressed(evt);
            }
        });

        SaveResolutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SaveResolutionLabel.setText("Resolution");
        SaveResolutionLabel.setMaximumSize(new Dimension(100, 20));
        SaveResolutionLabel.setMinimumSize(new Dimension(100, 20));
        SaveResolutionLabel.setPreferredSize(new Dimension(100, 20));

        SetResolutionFieldX.setText("1280");
        SetResolutionFieldX.setMaximumSize(new Dimension(100, 20));
        SetResolutionFieldX.setMinimumSize(new Dimension(100, 20));
        SetResolutionFieldX.setPreferredSize(new Dimension(100, 20));
        SetResolutionFieldX.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SetResolutionFieldXKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                SetResolutionFieldXKeyReleased(evt);
            }
        });

        SetResolutionFieldY.setText("720");
        SetResolutionFieldY.setMaximumSize(new Dimension(100, 20));
        SetResolutionFieldY.setMinimumSize(new Dimension(100, 20));
        SetResolutionFieldY.setPreferredSize(new Dimension(100, 20));
        SetResolutionFieldY.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SetResolutionFieldYKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                SetResolutionFieldYKeyReleased(evt);
            }
        });

        FixedRatioToggleButton.setSelected(true);
        FixedRatioToggleButton.setText("Fixed Ratio");
        FixedRatioToggleButton.setMaximumSize(new Dimension(100, 30));
        FixedRatioToggleButton.setMinimumSize(new Dimension(100, 30));
        FixedRatioToggleButton.setPreferredSize(new Dimension(100, 30));
        FixedRatioToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FixedRatioToggleButtonActionPerformed(evt);
            }
        });

        GroupLayout AspectRatioPanelLayout = new GroupLayout(AspectRatioPanel);
        AspectRatioPanel.setLayout(AspectRatioPanelLayout);
        AspectRatioPanelLayout.setHorizontalGroup(AspectRatioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(AspectRatioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AspectRatioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(AspectRatioPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(SaveResolutionLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(SetResolutionFieldY, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(SetResolutionFieldX, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(AspectRatio0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspectRatio1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspectRatio2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FixedRatioToggleButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspectRatioLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspectRatio4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspectRatio3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(AspectRatioPanelLayout.createSequentialGroup()
                        .addComponent(CustomAspectRatio0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CustomAspectRatio1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AspectRatioPanelLayout.setVerticalGroup(AspectRatioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(AspectRatioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveResolutionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetResolutionFieldX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetResolutionFieldY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(FixedRatioToggleButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AspectRatioLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AspectRatio0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AspectRatio1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AspectRatio2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AspectRatio3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AspectRatio4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AspectRatioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomAspectRatio0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomAspectRatio1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        PresetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        PresetLabel.setText("Presets");
        PresetLabel.setMaximumSize(new Dimension(100, 20));
        PresetLabel.setMinimumSize(new Dimension(100, 20));
        PresetLabel.setPreferredSize(new Dimension(100, 20));

        buttonGroup2.add(ResolutionButton0);
        ResolutionButton0.setText("30720");
        ResolutionButton0.setMaximumSize(new Dimension(60, 20));
        ResolutionButton0.setMinimumSize(new Dimension(60, 20));
        ResolutionButton0.setPreferredSize(new Dimension(60, 20));
        ResolutionButton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton0ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton1);
        ResolutionButton1.setText("15360");
        ResolutionButton1.setMaximumSize(new Dimension(60, 20));
        ResolutionButton1.setMinimumSize(new Dimension(60, 20));
        ResolutionButton1.setPreferredSize(new Dimension(60, 20));
        ResolutionButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton2);
        ResolutionButton2.setText("7680");
        ResolutionButton2.setMaximumSize(new Dimension(60, 20));
        ResolutionButton2.setMinimumSize(new Dimension(60, 20));
        ResolutionButton2.setPreferredSize(new Dimension(60, 20));
        ResolutionButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton3);
        ResolutionButton3.setText("3840");
        ResolutionButton3.setMaximumSize(new Dimension(60, 20));
        ResolutionButton3.setMinimumSize(new Dimension(60, 20));
        ResolutionButton3.setPreferredSize(new Dimension(60, 20));
        ResolutionButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton4);
        ResolutionButton4.setText("2560");
        ResolutionButton4.setMaximumSize(new Dimension(60, 20));
        ResolutionButton4.setMinimumSize(new Dimension(60, 20));
        ResolutionButton4.setPreferredSize(new Dimension(60, 20));
        ResolutionButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton5);
        ResolutionButton5.setText("1920");
        ResolutionButton5.setMaximumSize(new Dimension(60, 20));
        ResolutionButton5.setMinimumSize(new Dimension(60, 20));
        ResolutionButton5.setPreferredSize(new Dimension(60, 20));
        ResolutionButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton6);
        ResolutionButton6.setText("1600");
        ResolutionButton6.setMaximumSize(new Dimension(60, 20));
        ResolutionButton6.setMinimumSize(new Dimension(60, 20));
        ResolutionButton6.setPreferredSize(new Dimension(60, 20));
        ResolutionButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton6ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ResolutionButton7);
        ResolutionButton7.setSelected(true);
        ResolutionButton7.setText("1280");
        ResolutionButton7.setMaximumSize(new Dimension(60, 20));
        ResolutionButton7.setMinimumSize(new Dimension(60, 20));
        ResolutionButton7.setPreferredSize(new Dimension(60, 20));
        ResolutionButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResolutionButton7ActionPerformed(evt);
            }
        });

        jLabel7.setText("x");
        jLabel7.setMaximumSize(new Dimension(8, 20));
        jLabel7.setMinimumSize(new Dimension(8, 20));
        jLabel7.setPreferredSize(new Dimension(8, 20));

        ResolutionY0.setText("17280");
        ResolutionY0.setMaximumSize(new Dimension(60, 20));
        ResolutionY0.setMinimumSize(new Dimension(60, 20));
        ResolutionY0.setPreferredSize(new Dimension(60, 20));

        jLabel9.setText("x");
        jLabel9.setMaximumSize(new Dimension(8, 20));
        jLabel9.setMinimumSize(new Dimension(8, 20));
        jLabel9.setPreferredSize(new Dimension(8, 20));

        ResolutionY1.setText("8640");
        ResolutionY1.setMaximumSize(new Dimension(60, 20));
        ResolutionY1.setMinimumSize(new Dimension(60, 20));
        ResolutionY1.setPreferredSize(new Dimension(60, 20));

        jLabel10.setText("x");
        jLabel10.setMaximumSize(new Dimension(8, 20));
        jLabel10.setMinimumSize(new Dimension(8, 20));
        jLabel10.setPreferredSize(new Dimension(8, 20));

        ResolutionY2.setText("4320");
        ResolutionY2.setMaximumSize(new Dimension(60, 20));
        ResolutionY2.setMinimumSize(new Dimension(60, 20));
        ResolutionY2.setPreferredSize(new Dimension(60, 20));

        jLabel11.setText("x");
        jLabel11.setMaximumSize(new Dimension(8, 20));
        jLabel11.setMinimumSize(new Dimension(8, 20));
        jLabel11.setPreferredSize(new Dimension(8, 20));

        ResolutionY3.setText("2160");
        ResolutionY3.setMaximumSize(new Dimension(60, 20));
        ResolutionY3.setMinimumSize(new Dimension(60, 20));
        ResolutionY3.setPreferredSize(new Dimension(60, 20));

        jLabel12.setText("x");
        jLabel12.setMaximumSize(new Dimension(8, 20));
        jLabel12.setMinimumSize(new Dimension(8, 20));
        jLabel12.setPreferredSize(new Dimension(8, 20));

        ResolutionY4.setText("1440");
        ResolutionY4.setMaximumSize(new Dimension(60, 20));
        ResolutionY4.setMinimumSize(new Dimension(60, 20));
        ResolutionY4.setPreferredSize(new Dimension(60, 20));

        jLabel13.setText("x");
        jLabel13.setMaximumSize(new Dimension(8, 20));
        jLabel13.setMinimumSize(new Dimension(8, 20));
        jLabel13.setPreferredSize(new Dimension(8, 20));

        ResolutionY5.setText("1080");
        ResolutionY5.setMaximumSize(new Dimension(60, 20));
        ResolutionY5.setMinimumSize(new Dimension(60, 20));
        ResolutionY5.setPreferredSize(new Dimension(60, 20));

        jLabel14.setText("x");
        jLabel14.setMaximumSize(new Dimension(8, 20));
        jLabel14.setMinimumSize(new Dimension(8, 20));
        jLabel14.setPreferredSize(new Dimension(8, 20));

        ResolutionY6.setText("900");
        ResolutionY6.setMaximumSize(new Dimension(60, 20));
        ResolutionY6.setMinimumSize(new Dimension(60, 20));
        ResolutionY6.setPreferredSize(new Dimension(60, 20));

        jLabel15.setText("x");
        jLabel15.setMaximumSize(new Dimension(8, 20));
        jLabel15.setMinimumSize(new Dimension(8, 20));
        jLabel15.setPreferredSize(new Dimension(8, 20));

        ResolutionY7.setText("720");
        ResolutionY7.setMaximumSize(new Dimension(60, 20));
        ResolutionY7.setMinimumSize(new Dimension(60, 20));
        ResolutionY7.setPreferredSize(new Dimension(60, 20));

        SaveResolutionButton.setText("Save");
        SaveResolutionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaveResolutionButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(SaveResolutionButton, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(ResolutionButton7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionButton6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResolutionY7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addComponent(PresetLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResolutionButton0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResolutionY0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PresetLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResolutionButton0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResolutionY0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResolutionButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(ResolutionButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionY2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResolutionY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResolutionButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(ResolutionButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionY4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResolutionY3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResolutionButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(ResolutionButton6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResolutionY6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResolutionY5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ResolutionButton7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResolutionY7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(SaveResolutionButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout DialogAdvancedResolutionLayout = new GroupLayout(DialogAdvancedResolution.getContentPane());
        DialogAdvancedResolution.getContentPane().setLayout(DialogAdvancedResolutionLayout);
        DialogAdvancedResolutionLayout.setHorizontalGroup(DialogAdvancedResolutionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogAdvancedResolutionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AspectRatioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        DialogAdvancedResolutionLayout.setVerticalGroup(DialogAdvancedResolutionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DialogAdvancedResolutionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogAdvancedResolutionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspectRatioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("FractalVisualiser");
        setBackground(new Color(0, 0, 0));
        setFont(new Font("Arial", 0, 12)); // NOI18N
        setLocation(new Point(0, 0));
        setMinimumSize(new Dimension(1296, 857));
        setName("Frame"); // NOI18N
        setPreferredSize(new Dimension(1296, 857));
        setSize(new Dimension(1296, 857));
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        Canvas.setBackground(new Color(0, 0, 0));
        Canvas.setFocusable(false);
        Canvas.setFont(new Font("Arial", 0, 12)); // NOI18N
        Canvas.setMinimumSize(new Dimension(1280, 720));
        Canvas.setPreferredSize(new Dimension(1280, 720));
        Canvas.setRequestFocusEnabled(false);
        Canvas.setVerifyInputWhenFocusTarget(false);
        Canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                CanvasMouseDragged(evt);
            }
        });
        Canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                CanvasMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                CanvasMouseReleased(evt);
            }
        });

        GroupLayout CanvasLayout = new GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(CanvasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(CanvasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        QuickMenu.setMinimumSize(new Dimension(1280, 68));
        QuickMenu.setName(""); // NOI18N
        QuickMenu.setPreferredSize(new Dimension(1280, 68));

        OffsetXLAbel.setHorizontalAlignment(SwingConstants.CENTER);
        OffsetXLAbel.setText("Offset-X");
        OffsetXLAbel.setMaximumSize(new Dimension(60, 20));
        OffsetXLAbel.setMinimumSize(new Dimension(60, 20));
        OffsetXLAbel.setPreferredSize(new Dimension(60, 20));

        OffsetXField.setText("0.0");
        OffsetXField.setMaximumSize(new Dimension(500, 20));
        OffsetXField.setMinimumSize(new Dimension(500, 20));
        OffsetXField.setPreferredSize(new Dimension(500, 20));

        ZoomLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ZoomLabel.setText("Zoom");
        ZoomLabel.setMaximumSize(new Dimension(60, 20));
        ZoomLabel.setMinimumSize(new Dimension(60, 20));
        ZoomLabel.setPreferredSize(new Dimension(60, 20));

        ZoomField.setText("1.0");
        ZoomField.setMaximumSize(new Dimension(500, 20));
        ZoomField.setMinimumSize(new Dimension(500, 20));
        ZoomField.setPreferredSize(new Dimension(500, 20));
        ZoomField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ZoomFieldKeyReleased(evt);
            }
        });

        StartButtonCalc.setText("Start");
        StartButtonCalc.setMaximumSize(new Dimension(100, 20));
        StartButtonCalc.setMinimumSize(new Dimension(100, 20));
        StartButtonCalc.setPreferredSize(new Dimension(100, 20));
        StartButtonCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                StartButtonCalcActionPerformed(evt);
            }
        });

        OffsetYLabel.setHorizontalAlignment(SwingConstants.CENTER);
        OffsetYLabel.setText("Offset-Y");
        OffsetYLabel.setMaximumSize(new Dimension(60, 20));
        OffsetYLabel.setMinimumSize(new Dimension(60, 20));
        OffsetYLabel.setPreferredSize(new Dimension(60, 20));

        OffsetYField.setText("0.0");
        OffsetYField.setMaximumSize(new Dimension(500, 20));
        OffsetYField.setMinimumSize(new Dimension(500, 20));
        OffsetYField.setPreferredSize(new Dimension(500, 20));

        ResetButton.setText("Reset");
        ResetButton.setMaximumSize(new Dimension(60, 20));
        ResetButton.setMinimumSize(new Dimension(60, 20));
        ResetButton.setPreferredSize(new Dimension(60, 20));
        ResetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        CalcTypeField.setEditable(false);
        CalcTypeField.setHorizontalAlignment(JTextField.CENTER);
        CalcTypeField.setText("Mandelbrot");
        CalcTypeField.setPreferredSize(new Dimension(100, 20));

        Progrressbar.setForeground(new Color(0, 204, 0));
        Progrressbar.setToolTipText("sajt");
        Progrressbar.setFocusable(false);
        Progrressbar.setMinimumSize(new Dimension(500, 20));
        Progrressbar.setName("ffff"); // NOI18N
        Progrressbar.setPreferredSize(new Dimension(500, 20));

        GroupLayout QuickMenuLayout = new GroupLayout(QuickMenu);
        QuickMenu.setLayout(QuickMenuLayout);
        QuickMenuLayout.setHorizontalGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(QuickMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(OffsetYLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(OffsetXLAbel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(OffsetYField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(OffsetXField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ZoomLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(Progrressbar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalcTypeField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartButtonCalc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        QuickMenuLayout.setVerticalGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(QuickMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(OffsetXLAbel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(OffsetXField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartButtonCalc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(Progrressbar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuickMenuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(OffsetYLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(OffsetYField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CalcTypeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResetButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        MenuBarFile.setMargin(new Insets(2, 5, 2, 5));

        ExportAs.setText("File");
        ExportAs.setIconTextGap(0);
        ExportAs.setMargin(new Insets(2, 5, 2, 5));
        ExportAs.setMinimumSize(new Dimension(35, 20));
        ExportAs.setPreferredSize(new Dimension(35, 22));

        MenuExport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        MenuExport.setText("Export");
        MenuExport.setIconTextGap(0);
        MenuExport.setMargin(new Insets(2, 5, 2, 5));
        MenuExport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MenuExportActionPerformed(evt);
            }
        });
        ExportAs.add(MenuExport);
        ExportAs.add(jSeparator2);

        SettingsMenu.setText("Settings");
        SettingsMenu.setIconTextGap(0);
        SettingsMenu.setMargin(new Insets(2, 5, 2, 5));
        SettingsMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SettingsMenuActionPerformed(evt);
            }
        });
        ExportAs.add(SettingsMenu);

        CustomResMenu.setText("Resolution");
        CustomResMenu.setIconTextGap(0);
        CustomResMenu.setMargin(new Insets(2, 5, 2, 5));
        CustomResMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CustomResMenuActionPerformed(evt);
            }
        });
        ExportAs.add(CustomResMenu);
        ExportAs.add(jSeparator1);

        MenuLoadSettings.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
        MenuLoadSettings.setText("Load Settings");
        MenuLoadSettings.setIconTextGap(0);
        MenuLoadSettings.setMargin(new Insets(2, 5, 2, 5));
        MenuLoadSettings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MenuLoadSettingsActionPerformed(evt);
            }
        });
        ExportAs.add(MenuLoadSettings);

        MenuSaveSettings.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
        MenuSaveSettings.setText("Save Settings");
        MenuSaveSettings.setIconTextGap(0);
        MenuSaveSettings.setMargin(new Insets(2, 5, 2, 5));
        MenuSaveSettings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MenuSaveSettingsActionPerformed(evt);
            }
        });
        ExportAs.add(MenuSaveSettings);

        MenuBarFile.add(ExportAs);

        ModeMenu.setText("Mode");
        ModeMenu.setMargin(new Insets(2, 5, 2, 5));

        MandelbrotSetMenu.setText("Mandelbrot Set");
        MandelbrotSetMenu.setMargin(new Insets(2, 5, 2, 5));
        MandelbrotSetMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MandelbrotSetMenuActionPerformed(evt);
            }
        });
        ModeMenu.add(MandelbrotSetMenu);

        MultibrotSetMenu.setText("Multibrot Set");
        MultibrotSetMenu.setMargin(new Insets(2, 5, 2, 5));
        MultibrotSetMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MultibrotSetMenuActionPerformed(evt);
            }
        });
        ModeMenu.add(MultibrotSetMenu);

        /*
        BuddhabrotSetMenu.setText("Buddhabrot Set");
        BuddhabrotSetMenu.setMargin(new Insets(2, 5, 2, 5));
        BuddhabrotSetMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BuddhabrotSetMenuActionPerformed(evt);
            }
        });
        ModeMenu.add(BuddhabrotSetMenu);
        */

        JuliaSetMenu.setText("Julia Set");
        JuliaSetMenu.setMargin(new Insets(2, 5, 2, 5));
        JuliaSetMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JuliaSetMenuActionPerformed(evt);
            }
        });
        ModeMenu.add(JuliaSetMenu);

        TricornSetMenu.setText("Tricorn");
        TricornSetMenu.setMargin(new Insets(2, 5, 2, 5));
        TricornSetMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TricornSetMenuActionPerformed(evt);
            }
        });
        ModeMenu.add(TricornSetMenu);

        MenuBarFile.add(ModeMenu);

        PresetsMenu.setText("Presets");
        PresetsMenu.setIconTextGap(0);
        PresetsMenu.setMargin(new Insets(2, 5, 2, 5));

        PresetMenu0.setText("Eye of the Universe");
        PresetMenu0.setIconTextGap(0);
        PresetMenu0.setMargin(new Insets(2, 5, 2, 5));
        PresetMenu0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PresetMenu0ActionPerformed(evt);
            }
        });
        PresetsMenu.add(PresetMenu0);

        PresetMenu1.setText("Grand Canyon");
        PresetMenu1.setIconTextGap(0);
        PresetMenu1.setMargin(new Insets(2, 5, 2, 5));
        PresetMenu1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PresetMenu1ActionPerformed(evt);
            }
        });
        PresetsMenu.add(PresetMenu1);

        PresetMenu2.setText("Spiral");
        PresetMenu2.setIconTextGap(0);
        PresetMenu2.setMargin(new Insets(2, 5, 2, 5));
        PresetMenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PresetMenu2ActionPerformed(evt);
            }
        });
        PresetsMenu.add(PresetMenu2);

        MenuBarFile.add(PresetsMenu);

        ExtrasMenu.setText("Extras");
        ExtrasMenu.setMargin(new Insets(2, 5, 2, 5));

        SequenceMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        SequenceMenu.setText("Sequence");
        SequenceMenu.setMargin(new Insets(2, 5, 2, 5));
        SequenceMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SequenceMenuActionPerformed(evt);
            }
        });
        ExtrasMenu.add(SequenceMenu);

        MenuBarFile.add(ExtrasMenu);

        setJMenuBar(MenuBarFile);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(QuickMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(Canvas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(QuickMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Canvas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void SaveResolutionFieldY1KeyReleased(KeyEvent evt) {

    }

    private void SaveResolutionFieldX1KeyReleased(KeyEvent evt) {
        
    }

    private void SaveResolutionButtonActionPerformed(ActionEvent evt) {
        SaveResolutionFieldX.setText(SetResolutionFieldX.getText());
        SaveResolutionFieldY.setText(SetResolutionFieldY.getText());
        DialogAdvancedResolution.setVisible(false);
    }

    private void ResolutionButton0ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("30720");
        SetResolutionFieldY.setText(ResolutionY0.getText());
    }

    private void ResolutionButton1ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("15360");
        SetResolutionFieldY.setText(ResolutionY1.getText());
    }

    private void ResolutionButton2ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("7680");
        SetResolutionFieldY.setText(ResolutionY2.getText());
    }

    private void ResolutionButton3ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("3840");
        SetResolutionFieldY.setText(ResolutionY3.getText());
    }

    private void ResolutionButton4ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("2560");
        SetResolutionFieldY.setText(ResolutionY4.getText());
    }

    private void ResolutionButton5ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("1920");
        SetResolutionFieldY.setText(ResolutionY5.getText());
    }

    private void ResolutionButton6ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("1600");
        SetResolutionFieldY.setText(ResolutionY6.getText());
    }

    private void ResolutionButton7ActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText("1280");
        SetResolutionFieldY.setText(ResolutionY7.getText());
    }

    private void AdvancedResolutionSettingsButton1ActionPerformed(ActionEvent evt) {
        DialogAdvancedResolution.setVisible(true);
        SetResolutionFieldX.setText(String.valueOf(Canvas.getWidth()));
        SetResolutionFieldY.setText(String.valueOf(Canvas.getHeight()));
    }

    private void AdvancedResolutionSettingsButton0ActionPerformed(ActionEvent evt) {
        DialogAdvancedResolution.setVisible(true);
        SetResolutionFieldX.setText(String.valueOf(Canvas.getWidth()));
        SetResolutionFieldY.setText(String.valueOf(Canvas.getHeight()));
    }

    /*
    private void SaveSettingsButton1ActionPerformed(ActionEvent evt) {
        DialogColor.setVisible(true);
    }

    private void SelectColorButton0ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton2ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton3ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton4ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton5ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton11ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton6ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton7ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton8ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton9ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SelectColorButton10ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    */

     /*
     *   Resolution Dialog
     */

    private void SaveResolutionFieldXKeyReleased(KeyEvent evt) {

        if (Integer.parseInt(SaveResolutionFieldX.getText()) < 1280 || Integer.parseInt(SaveResolutionFieldY.getText()) < 720) {
            SetResolutionButton.setEnabled(false);
        } else if (Integer.parseInt(SaveResolutionFieldX.getText()) > 1280 && Integer.parseInt(SaveResolutionFieldY.getText()) > 720){
            SetResolutionButton.setEnabled(true);
        }

    }

    private void SaveResolutionFieldYKeyReleased(KeyEvent evt) {

        if (Integer.parseInt(SaveResolutionFieldX.getText()) < 1280 || Integer.parseInt(SaveResolutionFieldY.getText()) < 720)
        {
            SetResolutionButton.setEnabled(false);
        } else if (Integer.parseInt(SaveResolutionFieldX.getText()) > 1280 && Integer.parseInt(SaveResolutionFieldY.getText()) > 720){
            SetResolutionButton.setEnabled(true);
        }

    }


    /*
    *   Advanced Resolution Dialog
    */

    private void CustomAspectRatio1KeyPressed(KeyEvent evt) {
        String value = CustomAspectRatio1.getText();
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_TAB || evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            CustomAspectRatio1.setEditable(true);
        } else {
            CustomAspectRatio1.setEditable(false);
        }
    }

    private void CustomAspectRatio0KeyPressed(KeyEvent evt) {
        String value = CustomAspectRatio0.getText();
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_TAB || evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            CustomAspectRatio0.setEditable(true);
        } else {
            CustomAspectRatio0.setEditable(false);
        }
    }

    private void FixedRatioToggleButtonActionPerformed(ActionEvent evt) {
        AspectRatio0.setEnabled(FixedRatioToggleButton.isSelected());
        AspectRatio1.setEnabled(FixedRatioToggleButton.isSelected());
        AspectRatio2.setEnabled(FixedRatioToggleButton.isSelected());
        AspectRatio3.setEnabled(FixedRatioToggleButton.isSelected());
        AspectRatio4.setEnabled(FixedRatioToggleButton.isSelected());

        UpdateAspectRatioY();

        if (AspectRatio4.isSelected() && FixedRatioToggleButton.isSelected()) {
            CustomAspectRatio0.setEnabled(true);
            CustomAspectRatio1.setEnabled(true);
        } else {
            CustomAspectRatio0.setEnabled(false);
            CustomAspectRatio1.setEnabled(false);
        }
    }

    private void SetResolutionFieldXKeyReleased(KeyEvent evt) {
        if (Integer.parseInt(SaveResolutionFieldX.getText()) > 1280 && Integer.parseInt(SaveResolutionFieldY.getText()) > 720) {
            SaveResolutionButton.setEnabled(true);
        } else {
            SaveResolutionButton.setEnabled(false);
        }

        if (FixedRatioToggleButton.isSelected() && Integer.parseInt(SaveResolutionFieldY.getText()) != 0 && Integer.parseInt(SaveResolutionFieldX.getText()) != 0)
            try {
                UpdateAspectRatioY();
            } catch (Exception e) {

            }
    }

    private void SetResolutionFieldYKeyReleased(KeyEvent evt) {
        if (Integer.parseInt(SaveResolutionFieldX.getText()) > 1280 && Integer.parseInt(SaveResolutionFieldY.getText()) > 720)
        {
            SaveResolutionButton.setEnabled(true);
        } else {
            SaveResolutionButton.setEnabled(false);
        }

        if (FixedRatioToggleButton.isSelected() && Integer.parseInt(SaveResolutionFieldY.getText()) != 0 && Integer.parseInt(SaveResolutionFieldX.getText()) != 0)
            try {
                UpdateAspectRatioX();
            } catch (Exception e) {

            }
    }

    private void SetResolutionFieldXKeyPressed(KeyEvent evt) {
        String value = SetResolutionFieldX.getText();
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_TAB || evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            SetResolutionFieldX.setEditable(true);
        } else {
            SetResolutionFieldX.setEditable(false);
        }
    }

    private void SetResolutionFieldYKeyPressed(KeyEvent evt) {
        String value = SetResolutionFieldY.getText();
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_TAB || evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            SetResolutionFieldY.setEditable(true);
        } else {
            SetResolutionFieldY.setEditable(false);
        }
    }

    private void AspectRatio4ActionPerformed(ActionEvent evt) {
        CustomAspectRatio0.setEnabled(true);
        CustomAspectRatio1.setEnabled(true);
        CustomAspectRatio0.setEditable(true);
        CustomAspectRatio1.setEditable(true);

        UpdateAspectRatioY();
        UpdatePresets();
    }

    private void AspectRatio3ActionPerformed(ActionEvent evt) {
        CustomAspectRatio0.setEnabled(false);
        CustomAspectRatio1.setEnabled(false);
        CustomAspectRatio0.setText("1");
        CustomAspectRatio1.setText("1");

        UpdateAspectRatioY();
        UpdatePresets();
    }

    private void AspectRatio2ActionPerformed(ActionEvent evt) {
        CustomAspectRatio0.setEnabled(false);
        CustomAspectRatio1.setEnabled(false);
        CustomAspectRatio0.setText("4");
        CustomAspectRatio1.setText("3");

        UpdateAspectRatioY();
        UpdatePresets();
    }

    private void AspectRatio1ActionPerformed(ActionEvent evt) {
        CustomAspectRatio0.setEnabled(false);
        CustomAspectRatio1.setEnabled(false);
        CustomAspectRatio0.setText("21");
        CustomAspectRatio1.setText("9");

        UpdateAspectRatioY();
        UpdatePresets();
    }
    
    private void AspectRatio0ActionPerformed(ActionEvent evt) {
        CustomAspectRatio0.setEnabled(false);
        CustomAspectRatio1.setEnabled(false);
        CustomAspectRatio0.setText("16");
        CustomAspectRatio1.setText("9");

        UpdateAspectRatioY();
        UpdatePresets();
    }

    private void UpdatePresets() {

        ResolutionY0.setText(String.valueOf(Integer.parseInt(ResolutionButton0.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY1.setText(String.valueOf(Integer.parseInt(ResolutionButton1.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY2.setText(String.valueOf(Integer.parseInt(ResolutionButton2.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY3.setText(String.valueOf(Integer.parseInt(ResolutionButton3.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY4.setText(String.valueOf(Integer.parseInt(ResolutionButton4.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY5.setText(String.valueOf(Integer.parseInt(ResolutionButton5.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY6.setText(String.valueOf(Integer.parseInt(ResolutionButton6.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));
        ResolutionY7.setText(String.valueOf(Integer.parseInt(ResolutionButton7.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText())));

    }

    private void MenuExportActionPerformed(ActionEvent evt) {
        SetResolutionFieldX.setText(String.valueOf(getWidth() - 16));
        SetResolutionFieldY.setText(String.valueOf(getHeight() - 137));
        DialogExport.setVisible(true);
    }

    private void SetResolutionButtonActionPerformed(ActionEvent evt) {
        setSize(Integer.parseInt(SetResolutionFieldX.getText()) + 16, Integer.parseInt(SetResolutionFieldY.getText()) + 137);
        DialogResolution.setVisible(false);
    }

    private void UpdateAspectRatioX() {
        int newRes = Integer.parseInt(SetResolutionFieldY.getText()) * Integer.parseInt(CustomAspectRatio0.getText()) / Integer.parseInt(CustomAspectRatio1.getText());
        SetResolutionFieldX.setText(String.valueOf(newRes));
    }

    private void UpdateAspectRatioY() {
        int newRes = Integer.parseInt(SetResolutionFieldX.getText()) * Integer.parseInt(CustomAspectRatio1.getText()) / Integer.parseInt(CustomAspectRatio0.getText());
        SetResolutionFieldY.setText(String.valueOf(newRes));
    }


    /*
    *   Settings Menu
    */

    private void SettingsMenuActionPerformed(ActionEvent evt) {
        DialogSettings.setVisible(true);
    }

    private void DetermineCoreCountActionPerformed(ActionEvent evt) {
        ThreadField.setText(String.valueOf(Runtime.getRuntime().availableProcessors()));
    }

    private void OpenSettingsButtonActionPerformed(ActionEvent evt) {
        DialogSettings.setVisible(true);
    }



    /*
    *   Zoom
    */

    private void CanvasMousePressed(MouseEvent evt) {

        mPressed_x = evt.getX();
        mPressed_y = evt.getY();

    }

    private void CanvasMouseDragged(MouseEvent evt) {

        mDragged_x = evt.getX();
        mDragged_y = evt.getY();
        mDragged_size = 2*Math.abs(mDragged_x-mPressed_x);

		int ds2 = (Math.abs(mDragged_y-mPressed_y)*2*Canvas.getWidth())/Canvas.getHeight();
        mDragged_size = Math.max(mDragged_size, ds2);

		Canvas.repaint();
    }

    private void CanvasMouseReleased(MouseEvent evt) {
        if (Type != -1) {
            mDragged_size = 0;

            mDragged_x = evt.getX();
            mDragged_y = evt.getY();
    
            double[] arr = getNewOffset(mPressed_x, mPressed_y);

            Frame.OffsetXField.setText(String.valueOf(arr[0]));
            Frame.OffsetYField.setText(String.valueOf(arr[1]));

            if (evt.getButton() == MouseEvent.BUTTON1)
                Frame.ZoomField.setText(String.valueOf(getNewZoom(mPressed_x, mDragged_x, false)));
            else if (evt.getButton() == MouseEvent.BUTTON3)
                Frame.ZoomField.setText(String.valueOf(getNewZoom(mPressed_x, mDragged_x, true)));

            render(true, true);

        }
    }

    /**
     * Calculates new Zoom Factor based on selection size.
     * If the selection size is 0, it will skip the calculation
     * and return the old zoom.
     * 
     * <p>
     * 
     * @param  mPressed_x  X-Coordinate of mouse press.
     * @param  mDragged_x  X-Coordinate of mouse release.
     *
     * <p>
     * 
     *  @return Returns new Zoom.
     */
    private double getNewZoom(int mPressed_x, double mDragged_x, boolean invert) {

        if (mPressed_x != mDragged_x) {

            double Multiplier;

            if (invert)
            {
                Multiplier = Math.abs(mDragged_x - mPressed_x) / Frame.Canvas.getWidth();
            } else {
                Multiplier = Frame.Canvas.getWidth() / Math.abs(mDragged_x - mPressed_x);
            }


            return Double.parseDouble(Frame.ZoomField.getText()) * Multiplier;
           
        }

        return Double.parseDouble(Frame.ZoomField.getText());
        
    }

    /**
     * Calculates X and Y Offset based on selection coordinates.
     * 
     * <p>
     * 
     * @param  mPressed_x  X-Coordinate of mouse press.
     * @param  mPressed_y  Y-Coordinate of mouse press.
     *
     * <p>
     * 
     * @return Returns double[]. The first index being the Offset for X
     * and the second index the Offset for Y.
     */
    private double[] getNewOffset(double mPressed_x, double mPressed_y) {

        double[] arr = new double[2];
        double PixelScaler = 4.0 / Frame.Canvas.getWidth() / Frame.Fractal.Zoom;

        arr[0] = (mPressed_x - Frame.Canvas.getWidth() / 2) * PixelScaler + Double.parseDouble(Frame.OffsetXField.getText());
        arr[1] = (Frame.Canvas.getHeight() / 2 - mPressed_y) * PixelScaler + Double.parseDouble(Frame.OffsetYField.getText());

        return arr;
    }



    /*
    *   Export
    */
   
    private void ExportImageButtonActionPerformed(ActionEvent evt) {
    
        Fractal = new Fractal(SuperSamplingSlider.getValue(), Integer.parseInt(SetResolutionFieldX.getText()), Integer.parseInt(SetResolutionFieldY.getText()), Integer.parseInt(IterationsField.getText()), Double.parseDouble(ZoomField.getText()), Double.parseDouble(OffsetXField.getText()), Double.parseDouble(OffsetYField.getText()), Double.parseDouble(EscapeValueField.getText()));

        render(false, false);

        FileHandler.createDir("img");            

        try {
            final long timestamp = System.currentTimeMillis();
            ImageIO.write(Fractal.Image, "png",
                    new File("img/mandelbrot_" + timestamp + ".png"));
            System.out.println("Image saved as 'mandelbrot_" + timestamp + ".png'!");
            
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private void ExportCurrentImageButtonActionPerformed(ActionEvent evt) {
        FileHandler.createDir("img");
        
        try {
            final long timestamp = System.currentTimeMillis();
            ImageIO.write(Fractal.Image, "png",
                    new File("img/mandelbrot_" + timestamp + ".png"));
            System.out.println("Image saved as 'mandelbrot_" + timestamp + ".png'!");
            
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }


    /*
    *   Sequence
    */

    private void StartSequenceButtonActionPerformed(ActionEvent evt) {
        try {
            FileHandler.takeImages();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void SequenceMenuActionPerformed(ActionEvent evt) {
        DialogSequence.setVisible(true);
    }


    /*
    *   Load / Save Settings
    */

    private void MenuLoadSettingsActionPerformed(ActionEvent evt) {
        try {
            FileHandler.loadSettings(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void MenuSaveSettingsActionPerformed(ActionEvent evt) {
        FileHandler.saveSettings(this);
    }

    private void SaveSettingsButtonActionPerformed(ActionEvent evt) {
        DialogSettings.setVisible(false);
    }


    /*
    *   Resolution Presets
    */

    private void CustomResMenuActionPerformed(final java.awt.event.ActionEvent evt) {
        SaveResolutionFieldX.setText(String.valueOf(Canvas.getWidth()));
        SaveResolutionFieldY.setText(String.valueOf(Canvas.getHeight()));
        DialogResolution.setVisible(true);
    }


    /*
    *   Mode Chooser
    */

    private void BuddhabrotSetMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Type = -1;
        CalcTypeField.setText("Buddhabrot");
    }

    private void TricornSetMenuActionPerformed(ActionEvent evt) {
        Type = 3;
        CalcTypeField.setText("Tricorn");
    }

    private void MultibrotSetMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Type = 2;
        CalcTypeField.setText("Multibrot");
    }

    private void JuliaSetMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Type = 1;
        CalcTypeField.setText("Julia");
    }

    private void MandelbrotSetMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Type = 0;
        CalcTypeField.setText("Mandelbrot");
    }



    /*
    *   Presets
    */

    private void PresetMenu0ActionPerformed(ActionEvent evt) {
        // Eye of the Universe
        OffsetXField.setText("0.360240443437614363236125244449545308482607807958585750488375814740195346059218100311752936722773426396233731729724987737320035372683285317664532401218521579554288661726564324134702299962817029213329980895208036363104546639698106204384566555001322985619004717862781192694046362748742863016467354574422779443226982622356594130430232458472420816652623492974891730419252651127672782407292315574480207005828774566475024380960675386215814315654794021855269375824443853463117354448779647099224311848192893972572398662626725254769950976527431277402440752868498588785436705371093442");
        OffsetYField.setText("-0.6413130610648031748603750151793020665794949522823052595561775430644485741727536902556370230689681162370740565537072149790106973211105273740851993394803287437606238596262287731075999483940467161288840614581091294325709988992269165007394305732683208318834672366947550710920088501655704252385244481168836426277052232593412981472237968353661477793530336607247738951625817755401065045362273039788332245567345061665756708689359294");
        ZoomField.setText("1000000.0");

        render(true, true);
    }

    private void PresetMenu1ActionPerformed(ActionEvent evt) {
        // Grand Canyon
        OffsetXField.setText("-0.1702961396430");
        OffsetYField.setText("-1.02418936115172");
        ZoomField.setText("100000000000.0");

        render(true, true);
    }

    private void PresetMenu2ActionPerformed(ActionEvent evt) {
        // Spiral
        OffsetXField.setText("0.36006063265920424");
        OffsetYField.setText("-0.6413285130781043");
        ZoomField.setText("1000000.0");

        render(true, true);
    }

    private void PresetMenu3ActionPerformed(ActionEvent evt) {
        Fractal.OffsetX = 0.0;
        Fractal.OffsetY = 0.0;

        render(true, true);
    }

    private void PresetMenu4ActionPerformed(ActionEvent evt) {
        Fractal.OffsetX = 0.0;
        Fractal.OffsetY = 0.0;
        
        render(true, true);
    }




    /*
    *   Main Buttons
    */

    private void StartButtonCalcActionPerformed(ActionEvent evt) {

        render(true, true);

    }

    private void ResetButtonActionPerformed(ActionEvent evt) {
        ZoomField.setText("1.0");
        OffsetXField.setText("0.0");
        OffsetYField.setText("0.0");

        render(true, true);
    }


    /*
    *   Start Render
    */

    public static void render(boolean Thread, boolean Object) {

        if (Object)
            Fractal = new Fractal(SuperSamplingSlider.getValue(), Canvas.getWidth(), Canvas.getHeight(), Integer.parseInt(IterationsField.getText()), Double.parseDouble(ZoomField.getText()), Double.parseDouble(OffsetXField.getText()), Double.parseDouble(OffsetYField.getText()), Double.parseDouble(EscapeValueField.getText()));

        if (Thread)
        {
            Runnable run = Frame::StartRender;
            ThreadStart.execute(run);
        } else {
            StartRender();
        }

    }


    /*
    *   Resize
    */

    private void formComponentResized(ComponentEvent evt) {
        Canvas.setSize(this.getWidth() - 16, this.getHeight() - 137);
    }

    private void ZoomFieldKeyReleased(KeyEvent evt) {
        System.out.println("Key");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            render(true, true);
            System.out.println("Enter");
        }
    }


    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Fractal = new Fractal(1, 1280, 720, 600, 1.0, 0.0, 0.0, 4.0);
            new Frame().setVisible(true);
            StartRender();
        });
    }

    public static void StartRender() {
        Settings settings = GetSettings();
        InitProgressBar();
        ArrayList<ImageCalculator> calcs = GetCalculator(Type, settings.SuperSampling > 1);
        ThreadMaster.Initialize(settings.ThreadCount, calcs);
        Canvas.repaint();
    }

    private static Settings GetSettings() {
        int tc = Integer.parseInt(ThreadField.getText());
        int iter = Integer.parseInt(IterationsField.getText());
        double escapeValue = Double.parseDouble(ZoomField.getText());
        int ss = SuperSamplingSlider.getValue();
        return new Settings(tc, iter, escapeValue, ss);
    }

    private static ArrayList<ImageCalculator> GetCalculator(int type, boolean useSuperSampling) {
        // The order is important because the ColorCalculator for example has to do its work after SuperSampling
        ArrayList calcList = new ArrayList<ImageCalculator>();
        IterationCalculator iterCalc = IterationManager.getCalculator(type);
        calcList.add(new IterationLoop(Fractal, iterCalc));
        if(useSuperSampling) {
            calcList.add(new SuperSampleDownscaler(Fractal));
        }
        calcList.add(new ColorFiller(Fractal));
        return calcList;
    }

    private static void InitProgressBar() {
        Frame.Progrressbar.setMaximum(Frame.Canvas.getWidth());
        if (Frame.Type == -1)
            Frame.Progrressbar.setMaximum(Frame.Canvas.getWidth() * 11);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton AdvancedResolutionSettingsButton0;
    private JButton AdvancedResolutionSettingsButton1;
    private JRadioButton AspectRatio0;
    private JRadioButton AspectRatio1;
    private JRadioButton AspectRatio2;
    private JRadioButton AspectRatio3;
    private JRadioButton AspectRatio4;
    private JLabel AspectRatioLabel;
    private JPanel AspectRatioPanel;
    private JMenuItem BuddhabrotSetMenu;
    private JFormattedTextField CalcTypeField;
    public static JPanel Canvas;
    private JLabel ColorLabel0;
    private JLabel ColorLabel1;
    private JLabel ColorLabel10;
    private JLabel ColorLabel11;
    private JLabel ColorLabel2;
    private JLabel ColorLabel3;
    private JLabel ColorLabel4;
    private JLabel ColorLabel5;
    private JLabel ColorLabel6;
    private JLabel ColorLabel7;
    private JLabel ColorLabel8;
    private JLabel ColorLabel9;
    private JPanel ColorMakerPanel;
    private JPanel ColorPresetsPanel;
    private JLabel ColorPreview0;
    private JLabel ColorPreview1;
    private JLabel ColorPreview10;
    private JLabel ColorPreview11;
    private JLabel ColorPreview2;
    private JLabel ColorPreview3;
    private JLabel ColorPreview4;
    private JLabel ColorPreview5;
    private JLabel ColorPreview6;
    private JLabel ColorPreview7;
    private JLabel ColorPreview8;
    private JLabel ColorPreview9;
    public static JFormattedTextField CustomAspectRatio0;
    public static JFormattedTextField CustomAspectRatio1;
    public static JMenuItem CustomResMenu;
    private JButton DetermineCoreCount;
    private JDialog DialogAdvancedResolution;
    private JDialog DialogColor;
    private JDialog DialogExport;
    private JDialog DialogLoad;
    private JDialog DialogResolution;
    private JDialog DialogSave;
    private JDialog DialogSequence;
    private JDialog DialogSettings;
    public static JFormattedTextField EscapeValueField;
    private JLabel EscapeValueLabel;
    private JMenu ExportAs;
    private JButton ExportCurrentImageButton;
    private JButton ExportImageButton;
    private JPanel ExportPanel;
    private JMenu ExtrasMenu;
    private JToggleButton FixedRatioToggleButton;
    public static JFormattedTextField FolderNameField;
    public static JFormattedTextField IterationsField;
    private JLabel IterationsLabel;
    private JMenuItem JuliaSetMenu;
    private JPanel LoadPanel;
    private JMenuItem MandelbrotSetMenu;
    private JMenuBar MenuBarFile;
    private JMenuItem MenuExport;
    private JMenuItem MenuLoadSettings;
    private JMenuItem MenuSaveSettings;
    private JMenu ModeMenu;
    private JMenuItem MultibrotSetMenu;
    private JLabel NewColorSchemeLabel;
    public static JFormattedTextField OffsetXField;
    private JLabel OffsetXLAbel;
    public static JFormattedTextField OffsetYField;
    private JLabel OffsetYLabel;
    private JButton OpenSettingsButton;
    private JLabel PresetLabel;
    private JMenuItem PresetMenu0;
    private JMenuItem PresetMenu1;
    private JMenuItem PresetMenu2;
    private JMenu PresetsMenu;
    public static JProgressBar Progrressbar;
    private JPanel QuickMenu;
    private JButton ResetButton;
    private JRadioButton ResolutionButton0;
    private JRadioButton ResolutionButton1;
    private JRadioButton ResolutionButton2;
    private JRadioButton ResolutionButton3;
    private JRadioButton ResolutionButton4;
    private JRadioButton ResolutionButton5;
    private JRadioButton ResolutionButton6;
    private JRadioButton ResolutionButton7;
    private JLabel ResolutionLabel1;
    private JLabel ResolutionLabel2;
    private JLabel ResolutionLabel3;
    private JPanel ResolutionPanel;
    private JLabel ResolutionY0;
    private JLabel ResolutionY1;
    private JLabel ResolutionY2;
    private JLabel ResolutionY3;
    private JLabel ResolutionY4;
    private JLabel ResolutionY5;
    private JLabel ResolutionY6;
    private JLabel ResolutionY7;
    private JPanel SavePaneä;
    private JButton SaveResolutionButton;
    public static JFormattedTextField SaveResolutionFieldX;
    public static JFormattedTextField SaveResolutionFieldX1;
    public static JFormattedTextField SaveResolutionFieldY;
    public static JFormattedTextField SaveResolutionFieldY1;
    private JLabel SaveResolutionLabel;
    private JButton SaveSettingsButton;
    private JButton SaveSettingsButton1;
    private JButton SelectColorButton0;
    private JButton SelectColorButton1;
    private JButton SelectColorButton10;
    private JButton SelectColorButton11;
    private JButton SelectColorButton2;
    private JButton SelectColorButton3;
    private JButton SelectColorButton4;
    private JButton SelectColorButton5;
    private JButton SelectColorButton6;
    private JButton SelectColorButton7;
    private JButton SelectColorButton8;
    private JButton SelectColorButton9;
    private JMenuItem SequenceMenu;
    private JPanel SequencePanel;
    private JButton SetResolutionButton;
    public static JFormattedTextField SetResolutionFieldX;
    public static JFormattedTextField SetResolutionFieldY;
    private JMenuItem SettingsMenu;
    private JPanel SettingsPanel;
    public static JSlider SharpeningSlider;
    private JButton StartButtonCalc;
    private JButton StartSequenceButton;
    private JLabel SuperSamplingLabel;
    public static JSlider SuperSamplingSlider;
    public static JFormattedTextField ThreadField;
    private JLabel ThreadLabel;
    private JLabel ThreadLabel2;
    private JMenuItem TricornSetMenu;
    public static JFormattedTextField ZoomEndField;
    public static JFormattedTextField ZoomField;
    private JLabel ZoomLabel;
    public static JFormattedTextField ZoomScaleField;
    public static JFormattedTextField ZoomStartField;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JColorChooser jColorChooser1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JScrollBar jScrollBar1;
    private JScrollBar jScrollBar2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JPopupMenu.Separator jSeparator1;
    private JPopupMenu.Separator jSeparator2;
    private JSeparator jSeparator5;
    private JSeparator jSeparator7;
    private JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
    public static Fractal Fractal;
    public static FileHandler FileHandler = new FileHandler();
    public static int Type;
    int mPressed_x, mPressed_y, mDragged_x, mDragged_y, mDragged_size;
    
}
