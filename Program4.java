public class Program4 {
	public static void main(String[] args) {
		int k = 1;
		int gaps = 12;
		for(int i=1;i<=14;i++){
			if(i<=6){
				System.out.println();
			}else if(i>=7 && i<=12){
				for(int j=1;j<=k;j++) {
					System.out.print("*");
				}
				for(int g=1;g<=gaps;g++){
					System.out.print(" ");
				}
				for(int x=1;x<=14-k-gaps;x++){
					System.out.print("*");
				}
				k++;
				gaps-=2;
				System.out.println();
			}else{
				for(int a=1;a<=14;a++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
	}
}