package JavaProjects.P04_okulYönetimi.notHesap;

public class Ogretmen extends Kisi{

  private String bolum;
  private String sicilNo;

  public Ogretmen(){

  }

    public Ogretmen(String bolum) {
        this.bolum = bolum;
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        /*
         Burada ogretmen classini Kisi classina extends ettigim icin
         yukarda sadece bolum ve sicilNo
         yazmama ragmen ad soyad kimlik no da geldi
         */

        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
    }
}
