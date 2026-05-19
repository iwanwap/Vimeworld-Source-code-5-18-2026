/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DR
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hQ {
    private final float J;
    private final String A;
    private final List<DR> I;

    public String J() {
        hQ a2;
        return a2.A;
    }

    public float J() {
        hQ a2;
        return a2.J;
    }

    public void J(DR dR2) {
        hQ b2 = dR2;
        hQ a2 = this;
        a2.I.add((DR)b2);
    }

    public List<DR> J() {
        hQ a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public hQ(String string, float f2) {
        void b2;
        hQ a2;
        float c2 = f2;
        hQ hQ2 = a2 = this;
        hQ hQ3 = a2;
        hQ3.I = new ArrayList<DR>();
        hQ2.A = b2;
        hQ2.J = c2;
    }
}

