import java.util.Scanner;

public class Musteri {

	public static void Hesapla(int []kasa){
		Scanner input=new Scanner(System.in);
		double tutar,musteri,paraustu;
		System.out.print("Tutarı giriniz: ");
		tutar=input.nextDouble();
		System.out.print("Müşteriden gelen parayı giriniz: ");
		musteri=input.nextDouble();
		paraustu=musteri-tutar;
		System.out.println("paraüstü tutarı: "+paraustu);
		
		kasa[0]=kasa[0]+(int) (musteri/200);
		musteri=musteri-((int) (musteri/200)*200);
		kasa[1]=kasa[1]+(int) (musteri/100);
		musteri=musteri-((int) (musteri/100)*100);
		kasa[2]=kasa[2]+(int) (musteri/50);
		musteri=musteri-((int) (musteri/50)*50);
		kasa[3]=kasa[3]+(int) (musteri/20);
		musteri=musteri-((int) (musteri/20)*20);
		kasa[4]=kasa[4]+(int) (musteri/10);
		musteri=musteri-((int) (musteri/10)*10);
		kasa[5]=kasa[5]+(int) (musteri/5);
		musteri=musteri-((int) (musteri/5)*5);
		kasa[6]=kasa[6]+(int) (musteri/1);
		musteri=musteri-((int) (musteri/1)*1);
		kasa[7]=kasa[7]+(int) (musteri/0.5);
		musteri=musteri-((int) (musteri/0.5)*0.5);
		kasa[8]=kasa[8]+(int) (musteri/0.25);
		musteri=musteri-((int) (musteri/0.25)*0.25);
		kasa[9]=kasa[9]+(int) (musteri/0.10);
		musteri=musteri-((int) (musteri/0.10)*0.10);
		kasa[10]=kasa[10]+(int) (musteri/0.05);
		musteri=musteri-((int) (musteri/0.05)*0.05);

		kasa[0]=kasa[0]-(int) (paraustu/200);
		paraustu=paraustu-((int) (paraustu/200)*200);
		kasa[1]=kasa[1]-(int) (paraustu/100);
		paraustu=paraustu-((int) (paraustu/100)*100);
		kasa[2]=kasa[2]-(int) (paraustu/50);
		paraustu=paraustu-((int) (paraustu/50)*50);
		kasa[3]=kasa[3]-(int) (paraustu/20);
		paraustu=paraustu-((int) (paraustu/20)*20);
		kasa[4]=kasa[4]-(int) (paraustu/10);
		paraustu=paraustu-((int) (paraustu/10)*10);
		kasa[5]=kasa[5]-(int) (paraustu/5);
		paraustu=paraustu-((int) (paraustu/5)*5);
		kasa[6]=kasa[6]-(int) (paraustu/1);
		paraustu=paraustu-((int) (paraustu/1)*1);
		kasa[7]=kasa[7]-(int) (paraustu/0.5);
		paraustu=paraustu-((int) (paraustu/0.5)*0.5);
		kasa[8]=kasa[8]-(int) (paraustu/0.25);
		paraustu=paraustu-((int) (paraustu/0.25)*0.25);
		kasa[9]=kasa[9]-(int) (paraustu/0.10);
		paraustu=paraustu-((int) (paraustu/0.10)*0.10);
		kasa[10]=kasa[10]-(int) (paraustu/0.05);
		paraustu=paraustu-((int) (paraustu/0.05)*0.05);
		
		System.out.println("paraustu verildi.");
		
	
	}
}
