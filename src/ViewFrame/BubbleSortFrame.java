package ViewFrame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Algorithm.Data;

public class BubbleSortFrame extends JFrame{

	
    private int canvasWidth;
    private int canvasHeight;
    private Data bubbleSortDatas;
    
    public BubbleSortFrame(int width,int height) {
    	this.canvasHeight=height;
    	this.canvasWidth=width;
    	
    	BubbleSortPanel bubbleSortPanel=new BubbleSortPanel();
    	setContentPane(bubbleSortPanel);
    	
		Dimension dimension= new Dimension(canvasWidth, canvasHeight);
		bubbleSortPanel.setPreferredSize(dimension);
    	pack();
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setVisible(true);
    	
    }
    
    public void render(Data bubbleSortDatas) {
    	this.bubbleSortDatas=bubbleSortDatas;
    	repaint();
    }
    
    
    private class BubbleSortPanel extends JPanel{

		@Override
		public void paint(Graphics arg0) {
			
			super.paint(arg0);
			
			Graphics2D graphics2d =(Graphics2D)arg0;
			
			int w=canvasWidth/bubbleSortDatas.N();
			
            for(int i = 0 ; i < bubbleSortDatas.N() ; i ++ ) {
            	if(i==bubbleSortDatas.currElement)BubbleSortHelper.setColor(graphics2d, BubbleSortHelper.Purple);
            	else if (i==bubbleSortDatas.fix) {
            		BubbleSortHelper.setColor(graphics2d, BubbleSortHelper.Green);
				}
            	else if( bubbleSortDatas.fixElemtent[i] ){
            		BubbleSortHelper.setColor(graphics2d, BubbleSortHelper.Yellow);
				}else {
					BubbleSortHelper.setColor(graphics2d, BubbleSortHelper.Grey);
				}
            	BubbleSortHelper.fillRectangle(graphics2d, i * w, canvasHeight - bubbleSortDatas.get(i), w -2, bubbleSortDatas.get(i));
            }
		}
    }
}
