import org.code.theater.*;
import org.code.media.*;

//image filter class which extends the Imageplus
public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  public void adjustContrast(int multiplier) {
  Pixel[][] pixels = getImagePixels();

    //for loop
    for (Pixel[] row : pixels) {
      for (Pixel currentPixel : row) {
        int newRed = currentPixel.getRed() * multiplier;
        int newGreen = currentPixel.getGreen() * multiplier;
        int newBlue = currentPixel.getBlue() * multiplier;

        if (newRed > 255) {
          newRed = 255;
        }

        if (newGreen > 255) {
          newGreen = 255;
        }

        if (newBlue > 255) {
          newBlue = 255;
        }

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }
 //colorize filter
  public void colorize() {
        Pixel[][] pixels = getImagePixels(); 
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel currentPixel = pixels[row][col];
                
                int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
                grayValue /= 3;

                
                if (grayValue < 85) {
                    currentPixel.setRed(255); 
                    currentPixel.setBlue(0);
                } else if (grayValue < 170) {
                    currentPixel.setRed(0);
                    currentPixel.setGreen(255); 
                    currentPixel.setBlue(0);
                } else {
                    currentPixel.setRed(0);
                    currentPixel.setGreen(0);
                    currentPixel.setBlue(255); 
                }
            }
        }
  }

//treshhold filter
 public void threshold(int value) {
Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];
        int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        grayValue /= 3;

        if (grayValue < value) {
          currentPixel.setColor(Color.BLACK);
        }
        else {
          currentPixel.setColor(Color.WHITE);
        }
      }
    }

    
  }
  
}




 
