public class Program3 {
	public static void main(String[] args) {
		int k = 7;
		int gaps = 0;
		for(int i=1;i<=14;i++) {
			if(i<=7){
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}
			for(int g=1;g<=gaps;g++) {
				System.out.print(" ");
			}
			for(int a=1;a<=14-k-gaps;a++) {
				System.out.print("*");
			}
				k--;
				gaps=2*i-1;
				System.out.println();
			}else if(i>=8 && i<=13){
				System.out.print("*");
				for(int x=1;x<=12;x++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}else{
				for(int z=1;z<=i;z++) {
					System.out.print("*");
				}
			}
		}
	}
}