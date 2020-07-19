package Day_25_Arrays_part2;

public class PaasElements {

	public static void main(String[] args) {
	
		int[] numbers= {5,10,15,20,25,30};
		for(int value:numbers) {
			
			showValue(value);
		}
		// yukarıdaki value her işlenmde aşağıdaki nyerime geçp sayfaya çıktı veriyor, tekrar yukarı
	}   // dönüp tekrar aynı işlem uygulanıyor

	public static void showValue(int n) {
		
		System.out.print(n+" ");
	}
}
