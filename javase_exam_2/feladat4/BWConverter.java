package potvizsga.feladat4;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BWConverter {

    public static void main(String[] args) {

        try {
            BufferedImage bufferedImage = ImageIO.read(new File("src/potvizsga/feladat4/parlament.jpg"));

            Color color;
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                for (int j = 0; j < bufferedImage.getHeight(); j++) {
                    color = new Color(bufferedImage.getRGB(i, j));
                    int avg = (color.getRed() + color.getGreen()+ color.getBlue()) / 3;
                    if(avg > 127){
                        avg = 255;
                    } else {
                        avg = 0;
                    }
                    bufferedImage.setRGB(i, j, new Color(avg, avg, avg).getRGB());
                }
            }

            ImageIO.write(bufferedImage, "jpg", new File("src/potvizsga/feladat4/bw4.jpg"));
        } catch (IOException e) {
            System.out.println("parlament.jpg not found");
        }

    }
}