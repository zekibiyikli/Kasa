import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deger;
		boolean durum=true;
		int kasa[]={0,0,0,0,0,0,0,0,0,0,0};
		while(durum){
			System.out.println(" ");
			System.out.println("1) Kasadaki paralarý göster.\n2) Müþteri al.\n3) Kasayý Kapat.\n4) Kasayý Aç");
			System.out.print("Bir islem seçiniz: ");
			deger=input.nextInt();
			
			if(deger==1){
				ParaGoster.Goster(kasa);
			}
			else if(deger==2){
				Musteri.Hesapla(kasa);
			}
			else if(deger==3){
				System.out.println("Bizi tercih ettiðiniz için teþekkürler");
				durum=false;
			}
			else if(deger==4){
				KasaAc.KasaAc(kasa);
			}
			else{
				System.out.println("Hatalý Tuþlama Yaptýnýz.");
			}
			
		}
		
	}

}
