package ��ά����;


public class ArrayOfArrays {
	public static void main(String[] args) {
		int [][] a = new int [4][4];
		int [][] b = new int [2][];
		//ֻ�����ά���Բ���ֵ��������Ҫ
		b[0] = new int[10];
		b[1] = new int[5];
		
		int[][] aMatrix = new int[4][];
		//��ֵ
		for(int i =0;i<aMatrix.length;i++) {
			aMatrix[i] = new int[5];
			for(int j=0;j<aMatrix[i].length;j++) {
				aMatrix[i][j]=i+j;
				
			}
		}
		//��ӡ
		for(int i=0;i<aMatrix.length;i++) {
		for(int j=0;j<aMatrix[i].length;j++) {
			System.out.print(aMatrix[i][j]+" ");
		}
		System.out.println();
		}
	}
}
