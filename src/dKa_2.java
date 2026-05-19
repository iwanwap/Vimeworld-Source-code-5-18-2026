/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  kea
 *  ld
 *  yDa
 *  zC
 */
import com.google.common.collect.Maps;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dKa_2
extends yDa
implements zC {
    private Map<Integer, Integer> A;
    private String I;

    public int J(int n2) {
        int b2 = n2;
        dKa_2 a2 = this;
        if (a2.A.containsKey(b2)) {
            return a2.A.get(b2);
        }
        return uSa.E;
    }

    public String f() {
        dKa_2 a2;
        return a2.I;
    }

    public void J(Iaa object) {
        Object b2 = object;
        object = this;
    }

    public int J() {
        dKa_2 a2;
        return a2.A.size();
    }

    /*
     * WARNING - void declaration
     */
    public dKa_2(String string, ld ld2, int n2) {
        void c2;
        void b2;
        int d2 = n2;
        dKa_2 a2 = this;
        super((ld)b2, d2);
        a2.A = Maps.newHashMap();
        a2.I = c2;
    }

    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        dKa_2 a2 = this;
        a2.A.put((int)b2, c2);
    }

    public Iaa J() {
        return Iaa.A;
    }

    public Ega J(kea kea2, Sx sx2) {
        Object c2 = sx2;
        dKa_2 a2 = this;
        throw new UnsupportedOperationException();
    }
}

