package Algorithm;

import ViewFrame.BubbleSortFrame;
import ViewFrame.BubbleSortHelper;

public class AlgorithmVisualize {
	
	private Data bubbleSortDatas;
	private BubbleSortFrame bubbleSortFrame;
	
	public AlgorithmVisualize(int width,int height,int N) {
		
		bubbleSortDatas=new Data(N,height);
		bubbleSortFrame=new BubbleSortFrame(width, height);
		//printData();
		
		
		run();
		printData();
		
	}
	
	
	private void run() {
		
		setDatas(0,0);
		bubbleSort();
	}
	
	private void bubbleSort() {
		
		for(int i=bubbleSortDatas.N()-1;i>=0;i--) {
			setDatas(0, i);
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(bubbleSortDatas.get(j)>=bubbleSortDatas.get(j+1)) {
					bubbleSortDatas.swap(j, j+1);
					setDatas(j,i);
					flag=true;
				}
			}
			
			if(flag==false)break;
		}
	}
	
	
	private void setDatas(int currElement,int fixElement) {
		
		bubbleSortDatas.currElement=currElement;
		bubbleSortDatas.fix=fixElement;
		if(fixElement!=0) {
			bubbleSortDatas.fixElemtent[fixElement]=true;
			
		}
		
		bubbleSortFrame.render(bubbleSortDatas);
		BubbleSortHelper.pause(40);
	}
	
	
	/*Debug*/
	
	private void printData() {
		System.out.println();
		for(int i=0;i<bubbleSortDatas.N()-1;i++)
			System.out.print(" "+bubbleSortDatas.get(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=800;
		int height=800;
		int N=100;
		AlgorithmVisualize algvi=new AlgorithmVisualize(width, height, N);
		
	}

}
