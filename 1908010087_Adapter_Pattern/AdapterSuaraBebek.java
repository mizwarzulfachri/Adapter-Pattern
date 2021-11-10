import javax.management.BadBinaryOpValueExpException;

public class AdapterSuaraBebek implements Kucing {

    suara Suara;

    public AdapterSuaraBebek(suara suaraBaru) {
        Suara = suaraBaru;
    }

    @Override
    public void suara() {
        Suara.suaraBinatang();
    }
}
