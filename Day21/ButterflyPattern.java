public class butterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper half
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			for(int s=1;s<=(4-i)*2;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			for(int s=1;s<=(4-i)*2;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

