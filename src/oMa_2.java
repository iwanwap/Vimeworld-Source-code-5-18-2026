/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Baa
 *  Faa
 *  Gg
 *  Saa
 *  WSa
 *  YLa
 *  Yra
 *  eNa
 *  gc
 *  hd
 *  oMa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oMa_2
implements hd {
    private List<Faa> M;
    private YLa k;
    private Faa j;
    private static final Logger J = LogManager.getLogger();
    private Gg A;
    private Faa I;

    public String J() {
        oMa_2 a2;
        return new StringBuilder().insert(3 & 4, wua.J).append(a2.k.J()).append(TOa.n).append(a2.M.size()).toString();
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        void a2;
        int c22 = n2;
        oMa_2 b2 = this;
        Faa c22 = (Faa)b2.k.J(Baa.J((int)c22, (int)a2));
        if (c22 == null) {
            return b2.I;
        }
        return c22;
    }

    public void J(Faa faa2, int n2, int n3) {
        int d2 = n3;
        oMa_2 oMa_22 = this;
    }

    public List<AZ> J(VIa vIa, XF xF2) {
        Object c2 = xF2;
        oMa_2 a2 = this;
        return null;
    }

    public int J() {
        oMa_2 a2;
        return a2.M.size();
    }

    public static /* synthetic */ Faa J(oMa oMa2, Faa faa2) {
        oMa b2 = faa2;
        oMa a2 = oMa2;
        a2.j = b2;
        return a2.j;
    }

    public XF J(Gg gg2, String string, XF xF2) {
        Object d2 = xF2;
        oMa_2 a2 = this;
        return null;
    }

    public boolean J(boolean bl, gc gc2) {
        oMa_2 c2 = gc2;
        oMa_2 a2 = this;
        return vRa.d != 0;
    }

    public oMa_2(Gg gg2) {
        oMa_2 a2;
        oMa_2 b2 = gg2;
        oMa_2 oMa_22 = a2 = this;
        a2.j = null;
        oMa_2 oMa_23 = a2;
        a2.k = new eNa((oMa)a2);
        oMa_22.M = Lists.newArrayList();
        oMa_22.I = new Saa((Gg)b2, uSa.E, uSa.E);
        oMa_22.A = b2;
    }

    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        int n4 = n3;
        oMa_2 a2 = this;
        return uSa.E != 0;
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        oMa_2 oMa_22 = this;
        oMa_2 c2 = oMa_22.J((int)b2, (int)a2);
        if (!c2.f()) {
            c2.M();
        }
        oMa_22.k.f(Baa.J((int)b2, (int)a2));
        oMa_22.M.remove(c2);
    }

    /*
     * WARNING - void declaration
     */
    public Faa f(int n2, int n3) {
        void a2;
        void b2;
        oMa_2 oMa_22 = this;
        oMa_2 c2 = new Faa(oMa_22.A, (int)b2, (int)a2);
        oMa_2 oMa_23 = oMa_22;
        oMa_23.k.J(Baa.J((int)b2, (int)a2), (Object)c2);
        oMa_2 oMa_24 = c2;
        oMa_23.M.add((Faa)c2);
        oMa_24.M(vRa.d != 0);
        return oMa_24;
    }

    public boolean f() {
        return uSa.E != 0;
    }

    public boolean J() {
        Object a2;
        oMa_2 oMa_22 = this;
        long l2 = System.currentTimeMillis();
        Object object = a2 = oMa_22.M.iterator();
        while (object.hasNext()) {
            ((Faa)a2.next()).l((System.currentTimeMillis() - l2 > Yra.t ? vRa.d : uSa.E) != 0);
            object = a2;
        }
        if (System.currentTimeMillis() - l2 > WSa.Ia) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = System.currentTimeMillis() - l2;
            J.info(mSa.o, objectArray);
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Faa J(oMa a2) {
        return a2.j;
    }

    public void J(hd hd2, int n2, int n3) {
        int d2 = n3;
        oMa_2 oMa_22 = this;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        oMa_2 a2 = this;
        return vRa.d != 0;
    }

    public Faa J(XF xF2) {
        Object b2 = xF2;
        oMa_2 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }
}

