package tw.ethanchiang.java.ex;

public class TestDyna2DimArray {

	public static void main(String[] args) {
		int data[][]= {{1,2,3},{4,5,6,7},{1,2}};
		
		for(int i =0 ; i<data.length;i++){
			for(int j =0;j<data[i].length;j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
}
