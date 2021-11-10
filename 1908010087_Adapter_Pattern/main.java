public class main {
    
    public static void main (String[] args) {
        
        Kucing Kitty = new ImposterKucing();
        Bebek Bebe = new Bebek();
        AdapterSuaraBebek imp = new AdapterSuaraBebek(Bebe);
        
        System.out.print("Ini Kucing saya yang bersuara ");
        Kitty.suara();

        System.out.print("\nIni Bebek saya yang bersuara ");
        Bebe.suaraBinatang();
        
        System.out.print("\nNah Saya sudah tunjuk suara binatang peliharaan saya tetapi kucing aneh.\nKenapa Kucing bersuara ");
        imp.suara();
        
    }
    
}
