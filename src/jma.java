/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bma
 *  KA
 *  Kpa
 *  cb
 *  cra
 *  pQa
 *  psa
 *  pua
 *  uRa
 *  vRa
 *  yia
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public final class jma
extends cb {
    private final Map<String, yia> J;
    private final List<String> A;
    public final /* synthetic */ Bma I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void f2;
        jma d2;
        int g = n4;
        jma jma2 = d2 = this;
        jma2.I.L.J(vRa.d != 0);
        KA.J((String)jma2.J.get(d2.A.get((int)f2)).toString(), (int)(d2.E / uqa.g), (int)(g + vRa.d), (int)pua.o);
        d2.I.L.J(Bma.J((Bma)d2.I).J().isBidirectional());
    }

    public void l() {
        jma a2;
        a2.I.i();
    }

    public int e() {
        jma a2;
        return a2.A.size();
    }

    public jma(Bma bma2, Kpa kpa2) {
        yia a2;
        jma b2;
        Object c2 = bma2;
        jma jma2 = b2 = this;
        b2.I = c2;
        super((Kpa)a2, ((Bma)c2).A, ((Bma)c2).I, fPa.i, ((Bma)c2).I - fPa.ga + AQa.P, yOa.B);
        jma2.A = Lists.newArrayList();
        jma2.J = Maps.newHashMap();
        c2 = Bma.J((Bma)c2).J().iterator();
        Object object = c2;
        while (object.hasNext()) {
            a2 = (yia)c2.next();
            if (!(a2.getLanguageCode().equalsIgnoreCase(pQa.S) || a2.getLanguageCode().equalsIgnoreCase(uRa.R) || a2.getLanguageCode().equalsIgnoreCase(psa.Z))) {
                object = c2;
                continue;
            }
            b2.J.put(a2.getLanguageCode(), a2);
            b2.A.add(a2.getLanguageCode());
            object = c2;
        }
    }

    public boolean f(int n2) {
        int b2 = n2;
        jma a2 = this;
        return a2.A.get(b2).equals(Bma.J((Bma)a2.I).J().getLanguageCode());
    }

    public int C() {
        jma a2;
        return a2.e() * yOa.B;
    }

    public void J(int n2, boolean bl, int n3, int n4) {
        jma d2;
        int e22 = n2;
        jma jma2 = d2 = this;
        yia e22 = jma2.J.get(jma2.A.get(e22));
        jma jma3 = d2;
        Bma.J((Bma)jma3.I).J(e22);
        Bma.J((Bma)jma3.I).pb = e22.getLanguageCode();
        jma3.B.i();
        jma3.I.L.f((Bma.J((Bma)d2.I).J() || Bma.J((Bma)d2.I).Lc ? vRa.d : uSa.E) != 0);
        d2.I.L.J(Bma.J((Bma)d2.I).f());
        Bma.J((Bma)d2.I).i = oha.J(cra.g, new Object[uSa.E]);
        jma jma4 = d2;
        Bma.f((Bma)d2.I).i = Bma.J((Bma)jma4.I).J(Fha.FORCE_UNICODE_FONT);
        Bma.J((Bma)jma4.I).d();
    }
}

