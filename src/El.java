
public class El {

  private Kart kartlar[];
  private int toplamKartSayisi;
  private int eldekiKartSayisi;
  private int kartIndeks;

  public El(int kartSayisi) {
    this.toplamKartSayisi = kartSayisi;
    this.kartIndeks = 0;
    this.eldekiKartSayisi = 0;
    kartlar = new Kart[this.toplamKartSayisi];
  }

  public void kartEkle(Kart kart) {
    if (kartIndeks == toplamKartSayisi) {
      System.out.println("Kart eklenemez");
    } else {
      kartlar[kartIndeks] = kart;
      kartIndeks++;
      eldekiKartSayisi++;
    }
  }

  public void kartSil(int id) {
    kartlar[id] = null;
    eldekiKartSayisi--;
  }

  public Kart kartGoster(int id) {
    return kartlar[id];
  }

  public int getEldekiKartSayisi() {
    return this.eldekiKartSayisi;
  }

  public void seriyeDiz() {
    for (int k = 0; k < eldekiKartSayisi - 1; k++) {
      for (int x = 1; x < eldekiKartSayisi; x++) {
        if (kartlar[k].getNo() > kartlar[x].getNo()) {
          Kart temp = kartlar[k];
          kartlar[k] = kartlar[x];
          kartlar[x] = temp;
        }
      }
    }
  }
}
