package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//camelCase
		String internetSubeButonu="internet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.16;
		int vade = 14;
		
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugun<dolarDun) {
			System.out.println("dustu");
		}
		else if(dolarBugun==dolarDun){
			System.out.println("e�it");
		}
		else
			System.out.println("yukseldi");
		
		String[] krediler =
			{
					"h�zl� kredi",
					"mutlu emekli kredisi",
					"konut kredisi",
					"�ift�i kredisi",
					"msb kredisi",
					"meb kredisi"
			};
		
		//foreach d�ng�s�
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		
		
		
		
	}

}
