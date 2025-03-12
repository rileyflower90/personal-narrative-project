import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] names;
  private ImageFilter[][] images;
  
  // Constructor
  public MyStory(String[][] names, ImageFilter[][] images) {
    this.names = names;
    this.images = images;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawTemplateScene();
  }

  public void drawTemplateScene() {
    int count =  1;
    for (int row = 0; row < names.length; row++) {
      for (int col = 0; col < names[row].length; col++) {
        
    // 1. clear the scene / draw background
    clear("purple");

    // 2. Set any style (text size, font, font style, etc)
    setTextColor("black");

    // 3. Draw text and images, play sounds
    drawText("Slime " + names[row][col], 20, 60);

    // 4. Pause before transitioning

    // get the image from 2D arrays
    ImageFilter currentImage = images[row][col];
  

    // apply filters to image
    if (count == 1){
      drawImage(currentImage, 100, 100, 300);
      pause(1);
      currentImage.adjustContrast(2);
      
    } else if (count == 2) {
      drawImage(currentImage, 100, 100, 300);
      pause(1);
      currentImage.colorize();
      
    } else if (count == 3) {
      drawImage(currentImage, 100, 100, 300);
      pause(1);
      currentImage.threshold(2);
      
    } else if (count == 4){
      drawImage(currentImage, 100, 100, 300);
      pause(1);
      currentImage.colorize();
    }

    // Draw filtered image
      drawImage(currentImage, 100, 100, 300);
      pause(1);

      count ++;
      
            }
         }
     }


  
 }
  
  
