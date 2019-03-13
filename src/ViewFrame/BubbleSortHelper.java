package ViewFrame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class BubbleSortHelper {
	
	public static final Color Red = new Color(0xF44336);//pivot key
	public static final Color Green = new Color(0x4CAF50);//Sorting Data
	public static final Color Yellow = new Color(0xFFEB3B);//lower bounded
	public static final Color Blue=new Color(0x2196F3);//upper bounded
	public static final Color Grey = new Color(0x9E9E9E);//Unsorted data
	public static final Color Purple = new Color(0x9C27B0);
	
    public static void fillRectangle(Graphics2D g, int x, int y, int w, int h){

        Rectangle2D rectangle = new Rectangle2D.Double(x, y, w, h);
        g.fill(rectangle);
    }
    public static void setColor(Graphics2D g, Color color){
        g.setColor(color);
    }
    
    public static void pause(int t) {
        try {
            Thread.sleep(t);
        }
        catch (InterruptedException e) {
            System.out.println("Error sleeping");
        }
    }
}