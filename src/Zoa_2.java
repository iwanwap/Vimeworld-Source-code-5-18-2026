/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  ERa
 *  Fpa
 *  JPa
 *  KA
 *  Kpa
 *  Yra
 *  Zoa
 *  fMa
 *  kNa
 *  ld
 *  mca
 *  vRa
 *  wC
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Zoa_2
implements wC,
PB {
    private final List<PB> I;

    @Override
    public ld J() {
        return new CY(Gta.r);
    }

    public List<PB> J() {
        Zoa_2 a2;
        return a2.I;
    }

    public ld f() {
        return new CY(SPa.Q);
    }

    @Override
    public void J(kNa kNa2) {
        Zoa_2 b2 = kNa2;
        Zoa_2 a2 = this;
        b2.J(a2);
    }

    @Override
    public boolean J() {
        Zoa_2 zoa_2 = this;
        Iterator<PB> a2 = zoa_2.I.iterator();
        while (a2.hasNext()) {
            if (!((PB)a2.next()).J()) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(float f2, int n2) {
        int c2 = n2;
        Zoa_2 a2 = this;
        Kpa.J().J().J(mna.k);
        KA.J((int)uSa.E, (int)uSa.E, (float)Yra.i, (float)JPa.N, (int)ERa.C, (int)ERa.C, (float)Fpa.q, (float)Fpa.q);
    }

    public Zoa_2() {
        Object a2;
        Zoa_2 zoa_2 = this;
        zoa_2.I = Lists.newArrayList();
        Object object = a2 = Kpa.J().Ta.J().l().iterator();
        while (object.hasNext()) {
            mca mca2 = (mca)a2.next();
            object = a2;
            zoa_2.I.add((PB)new fMa((Zoa)zoa_2, mca2));
        }
    }
}

