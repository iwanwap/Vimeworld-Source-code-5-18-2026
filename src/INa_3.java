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
 *  Qma
 *  Vna
 *  joa
 *  kNa
 *  ld
 *  psa
 *  vRa
 *  wC
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class INa_3
implements wC,
PB {
    private final List<PB> A;
    private static final Ordering<Vna> I = Ordering.from(new joa());

    @Override
    public void J(float f2, int n2) {
        int c2 = n2;
        INa_3 a2 = this;
        Kpa.J().J().J(mna.k);
        KA.J((int)uSa.E, (int)uSa.E, (float)JPa.N, (float)JPa.N, (int)ERa.C, (int)ERa.C, (float)Fpa.q, (float)Fpa.q);
    }

    public INa_3() {
        a2(I.sortedCopy(Kpa.J().J().J()));
        INa_3 a2;
    }

    public List<PB> J() {
        INa_3 a2;
        return a2.A;
    }

    public ld f() {
        return new CY(psa.h);
    }

    @Override
    public void J(kNa kNa2) {
        INa_3 b2 = kNa2;
        INa_3 a2 = this;
        b2.J(a2);
    }

    public INa_3(Collection<Vna> collection) {
        Iterator b2 = collection;
        INa_3 a2 = this;
        a2.A = Lists.newArrayList();
        for (Vna vna2 : I.sortedCopy(b2)) {
            if (vna2.J() == Daa.SPECTATOR) continue;
            a2.A.add((PB)new Qma(vna2.J()));
        }
    }

    @Override
    public ld J() {
        return new CY(kTa.I);
    }

    @Override
    public boolean J() {
        INa_3 a2;
        if (!a2.A.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

