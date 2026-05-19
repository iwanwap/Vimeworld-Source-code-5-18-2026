/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NQ
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NQ_2 {
    private final NQ i;
    private final UUID M;
    private final float[] k;
    private final float[] j;
    private final List<NQ> J;
    private final List<Fq> A;
    private final String I;

    public Collection<NQ> f() {
        NQ_2 a2;
        return a2.J;
    }

    public void J(Fq fq) {
        Fq b2 = fq;
        NQ_2 a2 = this;
        a2.A.add(b2);
    }

    /*
     * WARNING - void declaration
     */
    public NQ_2(NQ nQ2, UUID uUID, String string, float[] fArray, float[] fArray2) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        NQ_2 a2;
        NQ_2 nQ_2 = object;
        Object object = fArray2;
        NQ_2 nQ_22 = a2 = nQ_2;
        NQ_2 nQ_23 = a2;
        NQ_2 nQ_24 = a2;
        NQ_2 nQ_25 = a2;
        nQ_24.J = new ArrayList<NQ>();
        nQ_24.A = new ArrayList<Fq>();
        nQ_24.i = e2;
        nQ_23.M = d2;
        nQ_23.I = c2;
        nQ_22.j = b2;
        nQ_22.k = (float[])f2;
    }

    public String J() {
        NQ_2 a2;
        return a2.I;
    }

    public Collection<Fq> J() {
        NQ_2 a2;
        return a2.A;
    }

    public float[] f() {
        NQ_2 a2;
        return a2.j;
    }

    public NQ J() {
        NQ_2 a2;
        return a2.i;
    }

    public UUID J() {
        NQ_2 a2;
        return a2.M;
    }

    public float[] J() {
        NQ_2 a2;
        return a2.k;
    }

    public void J(NQ nQ2) {
        NQ_2 b2 = nQ2;
        NQ_2 a2 = this;
        a2.J.add((NQ)b2);
    }
}

