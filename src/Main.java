import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deger;
		boolean durum=true;
		int kasa[]={0,0,0,0,0,0,0,0,0,0,0};
		while(durum){
			System.out.println(" ");
			System.out.println("1) Kasadaki paralar� g�ster.\n2) M��teri al.\n3) Kasay� Kapat.\n4) Kasay� A�");
			System.out.print("Bir islem se�iniz: ");
			deger=input.nextInt();
			
			if(deger==1){
				ParaGoster.Goster(kasa);
			}
			else if(deger==2){
				Musteri.Hesapla(kasa);
			}
			else if(deger==3){
				System.out.println("Bizi tercih etti�iniz i�in te�ekk�rler");
				durum=false;
			}
			else if(deger==4){
				KasaAc.KasaAc(kasa);
			}
			else{
				System.out.println("Hatal� Tu�lama Yapt�n�z.");
			}
			
		}
		
	}

}
