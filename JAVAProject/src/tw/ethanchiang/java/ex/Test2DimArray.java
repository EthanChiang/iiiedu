package tw.ethanchiang.java.ex;

public class Test2DimArray {

	public static void main(String[] args) {
		int data[][] = new int[5][5];
		
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				data[i][j] = i*j;
				System.out.println(data[i][j]);
			}
		}
	}

}
