/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oqa
 *  Zta
 *  ad
 *  cu
 *  pua
 *  rt
 *  uR
 *  vRa
 */
import java.util.Map;
import java.util.TreeSet;

public final class JT
extends eF {
    private final nu A;
    private final rt I;

    public static /* synthetic */ int J(Map.Entry entry, Map.Entry entry2) {
        Map.Entry b2 = entry2;
        Map.Entry a2 = entry;
        if (((Rt)a2.getValue()).getName().equals(BQa.la)) {
            return pua.o;
        }
        if (((Rt)b2.getValue()).getName().equals(BQa.la)) {
            return vRa.d;
        }
        return ((String)a2.getKey()).compareTo((String)b2.getKey());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        JT a2;
        int c2 = n3;
        JT jT = a2 = this;
        jT.k = jT.A.l() - Zta.ba;
        super.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public JT(nu nu2) {
        void a2;
        JT jT = this;
        super(Oqa.COLUMN, uua.p, vRa.d != 0);
        jT.A = a2;
        jT.I = nu.J((nu)a2).J();
        Object b2 = jT.I.J();
        Object object = new TreeSet(cu.J());
        object.addAll(b2.J().entrySet());
        b2 = object.iterator();
        Object object2 = b2;
        while (object2.hasNext()) {
            object = (Map.Entry)b2.next();
            jT.f((ad)new uR((Rt)object.getValue(), (nu)a2));
            object2 = b2;
        }
    }
}

