public class FindPI {

	public static void main(String[] args) {
		
		int count = 0;
		double n = 0;
		double num = 0;
		double holder = 0;
		double top = 0;
		double bottom = 0;
		
		while (count != 2500000) {
			count++;


			top = (double) Math.pow(-1, n);
			bottom = (2 * n) + 1 ;

			num = top / bottom;
			holder = holder + num;
			
			n++;
		}
		holder = holder * 4;
		System.out.println(holder + " after " + count + " iterations.");
	}
}