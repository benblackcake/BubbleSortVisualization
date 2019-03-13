package Algorithm;

public class Data {
	
	private int[] numbers;
	public int currElement;
	public int fix;
	public boolean []fixElemtent;
	
	public Data(int N,int radomBounded) {
		numbers=new int[N];
		fixElemtent=new boolean[N];
		
        for( int i = 0 ; i < N ; i ++) {
            numbers[i] = (int)(Math.random()*radomBounded);
            fixElemtent[i]=false;//ªì©l¤Æ
//            System.out.print("DEBUG");
            System.out.print(" "+numbers[i]);
        }
		
	}
	
	
	public int N() {return numbers.length;}
	
	public int get(int index) {return numbers[index];}
	
    public void swap(int i, int j) {
    	
        int t = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }
}
