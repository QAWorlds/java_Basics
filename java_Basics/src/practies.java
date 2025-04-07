
public class practies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] name = new int [3];
		
		
		name[0]=10;
		
		name[1]=20;
		name [2]=30;
		int sum =0;
		for (int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		sum*=name[i];
		}
		System.out.println(sum);
	}

}
