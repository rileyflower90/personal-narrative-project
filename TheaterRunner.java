import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // 2D Array
    String[][] names = {
      {"purple slime", "blue slime"},
      {"pink slime", "yellow slime"}
    };

    ImageFilter[][] images = {
      { new ImageFilter("best-slime.jpg"), new ImageFilter("edible-slime.jpg") },
      { new ImageFilter("fluff.jpg"), new ImageFilter("yellow.jpg") }
    };

    // MyStory object
    MyStory scene = new MyStory(names, images);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}