/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pY
 */
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sAa
implements lb {
    private final String I;

    @Override
    public kBa J() {
        return kBa.INTEGER;
    }

    @Override
    public String J() {
        sAa a2;
        return a2.I;
    }

    @Override
    public int J(List<Sx> list) {
        List<Sx> b2 = list;
        sAa a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public sAa(String string, pY pY2) {
        void b2;
        sAa c2 = pY2;
        sAa a2 = this;
        sAa sAa2 = a2;
        sAa2.I = (String)b2 + c2.getFriendlyName();
        lb.A.put(a2.I, a2);
    }

    @Override
    public boolean J() {
        return uSa.E != 0;
    }
}

