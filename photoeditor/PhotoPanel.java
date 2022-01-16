package photoeditor;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PhotoPanel extends JPanel {

    private BufferedImage image;

    public PhotoPanel(BufferedImage image) {
        this.image = image;
        this.setSize(image.getWidth(), image.getHeight());
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(10,10,100,100);
        g.drawImage(this.image, 0,0, null);
    }
}
