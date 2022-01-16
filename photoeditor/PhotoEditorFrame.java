package photoeditor;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PhotoEditorFrame extends JFrame {

    private PhotoPanel photoPanel;
    private BufferedImage image, scaledImage, modifiedScaledImage;

    private int exposure, contrast;
    private boolean monochrome = false;

    public PhotoEditorFrame() {
        super();
        this.setTitle("Photo Editor");
        this.setResizable(false);
        this.setSize(800, 456);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        try {
            this.image = ImageIO.read(new File("img.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.scaledImage = scaleImage(image);
        this.modifiedScaledImage = scaleImage(image);
        this.photoPanel = new PhotoPanel(modifiedScaledImage);
        this.photoPanel.setLocation(10, 10);

        this.add(this.photoPanel);

        addExposureSlider();
        addContrastSlider();
        addMonochromeCheckBox();
        addApplyButton();

        this.setVisible(true);
    }

    private void addMonochromeCheckBox() {
        JLabel jLabel = new JLabel("Monochrome: %b".formatted(monochrome));
        jLabel.setLocation(620, 4 * 30 + 10);
        jLabel.setSize(160, 20);
        this.add(jLabel);
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setLocation(620, 5 * 30 + 10);
        jCheckBox.setSize(160, 20);
        this.add(jCheckBox);

        jCheckBox.addActionListener(e -> {
            monochrome = !monochrome;
            jLabel.setText("Monochrome: %b".formatted(monochrome));
        });
    }

    private BufferedImage scaleImage(BufferedImage image) {
        Image image1 = image.getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        BufferedImage bufferedImage = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image1, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    private void addApplyButton() {
        JButton jButton = new JButton("Apply");
        jButton.setSize(160, 30);
        jButton.setLocation(620, 380);
        jButton.addActionListener(e -> applyChanges());
        this.add(jButton);
    }

    private void applyChanges() {
        Color color = null;
        Color newColor = null;
        int red, green, blue, avg;
        for (int x = 0; x < scaledImage.getWidth(); x++) {
            for (int y = 0; y < scaledImage.getHeight(); y++) {
                // get colour
                color = new Color(scaledImage.getRGB(x, y));
                red = color.getRed();
                green = color.getGreen();
                blue = color.getBlue();

                // modify pixel
                // exposure
                red += exposure;
                green += exposure;
                blue += exposure;

                //contrast
                red += (red - 127) * (contrast / 100f);
                green += (green - 127) * (contrast / 100f);
                blue += (blue - 127) * (contrast / 100f);

                // monochrome
                if (monochrome) {
                    avg = (red + green + blue) / 3;
                    red = avg;
                    green = avg;
                    blue = avg;
                }

                // set new colour
                if (red < 0) red = 0;
                if (red > 255) red = 255;
                if (green < 0) green = 0;
                if (green > 255) green = 255;
                if (blue < 0) blue = 0;
                if (blue > 255) blue = 255;
                newColor = new Color(red, green, blue);
                modifiedScaledImage.setRGB(x, y, newColor.getRGB());
            }
        }
        photoPanel.repaint();
    }

    private void addExposureSlider() {
        JLabel jLabel = new JLabel("Exposure: %+d".formatted(exposure));
        jLabel.setLocation(620, 10);
        jLabel.setSize(160, 20);
        this.add(jLabel);
        JSlider jSlider = new JSlider();
        jSlider.setLocation(620, 30 + 10);
        jSlider.setSize(160, 20);
        this.add(jSlider);

        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                exposure = jSlider.getValue() - 50;
                jLabel.setText("Exposure: %+d".formatted(exposure));
            }
        });
    }

    private void addContrastSlider() {
        JLabel jLabel = new JLabel("Contrast: %+d".formatted(contrast));
        jLabel.setLocation(620, 2 * 30 + 10);
        jLabel.setSize(160, 20);
        this.add(jLabel);
        JSlider jSlider = new JSlider();
        jSlider.setLocation(620, 3 * 30 + 10);
        jSlider.setSize(160, 20);
        this.add(jSlider);

        jSlider.addChangeListener(e -> {
            contrast = jSlider.getValue() - 50;
            jLabel.setText("Contrast: %+d".formatted(contrast));
        });
    }
}
