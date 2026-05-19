/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kh
 *  Lqa
 *  aSa
 *  k
 *  kPa
 *  tq
 *  vRa
 */
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public final class tq_2
extends Bp {
    private final P k;
    public String j;
    private final float J;
    public Consumer<Boolean> A;
    public BooleanSupplier I;

    public tq J(String ... stringArray) {
        String[] b2 = stringArray;
        String[] a2 = this;
        a2.f = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public tq_2(k k2, String string, BooleanSupplier booleanSupplier, Consumer<Boolean> consumer) {
        void a2;
        void b2;
        void d2;
        tq_2 c2;
        String e2 = string;
        tq_2 tq_22 = c2 = this;
        super((k)d2, e2);
        c2.j = e2;
        tq_22.I = b2;
        tq_22.A = a2;
        c2.j = (String)vRa.d;
        tq_2 tq_23 = c2;
        tq_23.k = new Eh();
        c2.J = c2.k.f(new StringBuilder().insert(5 >> 3, nqa.t).append(e2).toString());
    }

    @Override
    public float e() {
        tq_2 a2;
        return a2.J;
    }

    @Override
    public float d() {
        return kPa.S;
    }

    @Override
    public boolean J(int n2, int n3, int n4) {
        tq_2 a2;
        int d2 = n4;
        tq_2 tq_22 = a2 = this;
        tq_22.A.accept((!tq_22.I.getAsBoolean() ? vRa.d : uSa.E) != 0);
        return vRa.d != 0;
    }

    @Override
    public void J(long a22) {
        tq_2 b2;
        if (b2.e) {
            Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)Lqa.I);
        }
        String a22 = (b2.I.getAsBoolean() ? nqa.t : cPa.G) + b2.j;
        b2.k.J(a22, uSa.E, uSa.E, b2.x.J(), uSa.E != 0);
    }
}

