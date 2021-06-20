package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//camelCase
		String internetSubeButonu="internet þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.16;
		int vade = 14;
		
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugun<dolarDun) {
			System.out.println("dustu");
		}
		else if(dolarBugun==dolarDun){
			System.out.println("eþit");
		}
		else
			System.out.println("yukseldi");
		
		String[] krediler =
			{
					"hýzlý kredi",
					"mutlu emekli kredisi",
					"konut kredisi",
					"çiftçi kredisi",
					"msb kredisi",
					"meb kredisi"
			};
		
		//foreach döngüsü
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		
		
		
		
	}

}
