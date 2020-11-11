import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public abstract class Game extends Application {

    private Player player1, player2;

    private int w,h,blockSize;
    private Canvas map;

    private int lastEntityID;


    public int generateEntityID() {
        this.lastEntityID++;
        return lastEntityID;
    }

    public void buildMap(String mapID) {
        this.map = new Canvas();
        Image mapImg = new Image(getClass().getResourceAsStream("/" + mapID + ".png"));
        this.w = (int) mapImg.getWidth();
        this.h = (int) mapImg.getHeight();
        for(int i = 0; i < h; i++)
            for(int j = 0; j < w; j++) {
                Integer pixel = mapImg.getPixelReader().getArgb(j, i);
                if(pixel != 0)
                    addEntity(new Wall(generateEntityID(), Integer.toString(pixel), -1000, j*blockSize, i*blockSize));
            }
    }
    public void addEntity(Entity entity) {
        //add entity to whatever list or logic is used
    }

}
