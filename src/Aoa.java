/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  We
 *  ac
 *  hra
 *  noa
 *  vRa
 *  zf
 */
import com.google.common.collect.Lists;
import java.util.List;

public final class Aoa
extends qMa {
    private final List<noa> I;

    public int M() {
        Aoa a2;
        return super.M() + fPa.i;
    }

    /*
     * WARNING - void declaration
     */
    private ac J(Kpa kpa2, int n2, int n3, Fha fha) {
        void d2;
        void b2;
        void c2;
        Fha e2;
        Aoa aoa = fha2;
        Fha fha2 = fha;
        Aoa a2 = aoa;
        if (e2 == null) {
            return null;
        }
        Fha fha3 = e2;
        int n4 = fha3.returnEnumOrdinal();
        if (fha3.getEnumFloat()) {
            return new We(n4, (int)c2, (int)b2, e2);
        }
        Object object = e2;
        return new zf(n4, (int)c2, (int)b2, (Fha)((Object)object), d2.z.J((Fha)((Object)object)));
    }

    public noa J(int n2) {
        int b2 = n2;
        Aoa a2 = this;
        return a2.I.get(b2);
    }

    public int e() {
        Aoa a2;
        return a2.I.size();
    }

    public int l() {
        return hra.i;
    }

    /*
     * WARNING - void declaration
     */
    public Aoa(Kpa kpa2, int n2, int n3, int n4, int n5, int n6, Fha ... fhaArray) {
        void a2;
        void b2;
        void c22;
        void d22;
        void f2;
        void g;
        int h = n3;
        Aoa e2 = this;
        super((Kpa)g, (int)f2, h, (int)d22, (int)c22, (int)b2);
        e2.I = Lists.newArrayList();
        e2.b = uSa.E;
        int n7 = h = uSa.E;
        while (n7 < ((void)a2).length) {
            ac d22 = a2[h];
            ac c22 = h < ((void)a2).length - vRa.d ? a2[h + vRa.d] : null;
            Aoa aoa = e2;
            d22 = aoa.J((Kpa)g, (int)(f2 / uqa.g - BQa.Q), uSa.E, (Fha)d22);
            c22 = aoa.J((Kpa)g, (int)(f2 / uqa.g - BQa.Q + rRa.f), uSa.E, (Fha)c22);
            aoa.I.add(new noa(d22, c22));
            n7 = h += 2;
        }
    }
}

