package JavaProjects.P04_okulYönetimi.notHesap;

public class Kisi {

   private String adSoyad;
   private String kimlikNo;
   private int yas;


   public Kisi(){

   }

   public Kisi(String adSoyad, String kimlikNo, int yas) { // burasi constraction
         setAdSoyad(adSoyad);  // this.adSoyad = adSoyad; bu ad soyad calisma seklini direk set
                               // haliyle degil uppurcase ile duzenledim o zaman burada set'e gonderip yaptigim degisiklikle
                               // gelmesini sagliyorum
        this.kimlikNo = kimlikNo;

        setYas(yas); //
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if (yas<0){
            this.yas*= yas;
        }else
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';

        // BU CLASS'TAN BIR OBJE URETTIGIMIZDE AD SOYAD KIMLIK NO YAS ISTEYECEK
        //ONA GORE OBJE OLUSTURACAK
    }
}
