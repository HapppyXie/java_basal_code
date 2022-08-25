/*
 * º∆À„1+3+5+7......+99£ª
 * º∆À„2+4+6.......+100
 * 
 * 
 * 
 * 
 * */
public class Task—≠ª∑¡∑œ∞1 {
	public static void main(String[] args) {
				int sum1 = 0;
	    for(int num = 1; num <= 99; num += 2) {
	    	sum1 += num;	    	
	    }
	      System.out.println("sum1:" + sum1);
	      
	        int sum2 = 0;
	      for(int num = 1; num <= 100 ;num += 2) {
	    	  sum2 += num;
	      }
	      System.out.println("sum2:" + sum2);
	}

}
