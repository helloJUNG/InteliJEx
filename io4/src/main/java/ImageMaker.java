import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageMaker {

    //bad code
    public static void main(String[] args) throws Exception{

        BufferedImage image = new BufferedImage(1000,1000,BufferedImage.TYPE_INT_RGB);//메모리공간에 잠깐남겨두는 이미지.

        File bgFile = new File("C:\\zzz\\album\\bg.jpg");
        BufferedImage bgimage = ImageIO.read(bgFile);

        Graphics graphics = image.getGraphics(); ///붓임.
        //graphics.setColor(Color.pink);
        graphics.drawImage(bgimage,0,0,null);

        graphics.setColor(Color.pink);

        graphics.setFont(new Font("TimesRoman",Font.ITALIC,100));
        graphics.drawString("Hello World",200,500);


        ImageIO.write(image,"jpg",new File("C:\\zzz\\album\\test.jpg"));


    }

}
