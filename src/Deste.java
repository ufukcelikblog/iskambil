import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Deste {
    private final String[] seri = {"Kupa", "Sinek", "Karo", "Maça"};
    private final String[] isim = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private int kartSayisi;
    private Kart[] kartlar;

    public Deste() {
        kartlar = new Kart[52];
        kartSayisi = 0;
        for (int s = 0; s < seri.length; s++) {
            for (int i = 0; i < isim.length; i++) {
                int deger = i > 9 ? 10 : i + 1;
                kartlar[kartSayisi] = new Kart(kartSayisi, deger, seri[s], isim[i],
                    new ImageIcon(getClass().getResource("/resimler/"+seri[s]+"_"+isim[i]+".png")));
                kartSayisi++;
            }
        }
    }
    public static void main(String[] args) {
        Deste d1 = new Deste();
        for(int k=0; k<d1.kartlar.length; k++) {
            String kartTanim = d1.kartlar[k].getSeri() + "\n" + d1.kartlar[k].getIsim() + "\n" + d1.kartlar[k].getDeger();
            JOptionPane.showMessageDialog(null, kartTanim, "Kart", 1, d1.kartlar[k].getResim());
        }
    }

}
