public class Program5 {
	public static void main(String[] args) {
		int k=6;
		int m=2;
		for(int i=1;i<=14;i++){
			if(i==1 || i==14){
				for(int j=1;j<=14;j++){
					System.out.print("*");
				}
			}else if(i<=7){
				for(int a=1;a<=k;a++) {
					System.out.print("*");
				}
				k--;
			}else{
				for(int a=1;a<=m;a++) {
					System.out.print("*");
				}
				m++;
			}
			System.out.println();
		}
	}
}