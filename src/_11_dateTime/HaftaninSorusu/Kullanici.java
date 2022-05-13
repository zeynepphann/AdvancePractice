package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;
    public Kullanici(){//p'siz cons... yapmazsak bu klastan
                       // sadece alttaki cons'dan yararlanilir
                       //bos cons istersek yapamayiz

    }

    public Kullanici(String name, LocalDateTime kayitZamani) { //obj uretmek icin bu ozelliklerde bana obj uret demek
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
