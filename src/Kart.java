
import javax.swing.ImageIcon;

public class Kart {

  private final int no;
  private final int deger;
  private final String seri;
  private final String isim;
  private final ImageIcon resim;

  /*
    public Kart() {
        this.deger = 0;
        this.seri = "";
        this.isim = "";
        this.resim = new ImageIcon(getClass().getResource("bosKart.png"));
    }
   */
  public Kart(int no, int deger, String seri, String isim, ImageIcon resim) {
    this.no = no;
    this.deger = deger;
    this.seri = seri;
    this.isim = isim;
    this.resim = resim;
  }

  public int getNo() {
    return no;
  }

  public int getDeger() {
    return deger;
  }

  public String getSeri() {
    return seri;
  }

  public String getIsim() {
    return isim;
  }

  public ImageIcon getResim() {
    return resim;
  }

  public String kartBilgisi() {
    return this.seri + " " + this.isim + "\nDeğeri = " + this.deger;
  }
}
