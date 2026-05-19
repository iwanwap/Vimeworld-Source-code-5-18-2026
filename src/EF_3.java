/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bc
 *  Cra
 *  DQa
 *  EF
 *  FPa
 *  JPa
 *  Kpa
 *  Lra
 *  NTa
 *  aSa
 *  if
 *  pqa
 *  uKa
 *  vB
 *  vRa
 */
import java.awt.Color;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.util.ResourceLocation;

public final class EF_3
extends vB {
    private static final ResourceLocation M;
    private static EF k;
    private final vC j;
    private final float J;
    private final RF A;
    private final Consumer<Float> I;

    public void J(int n2, int n3) {
        int b2;
        EF_3 eF_3;
        int c2 = n3;
        EF_3 a2 = this;
        if (a2.A == null) {
            EF_3 eF_32 = a2;
            eF_3 = eF_32;
            eF_32.J(zta.n);
        } else if (WF.l()) {
            EF_3 eF_33 = a2;
            eF_3 = eF_33;
            eF_33.J(Lra.p);
        } else {
            EF_3 eF_34 = a2;
            eF_3 = eF_34;
            eF_34.J(nua.j);
        }
        eF_3.j.J();
        if (k == a2 && a2.j.f()) {
            EF_3 eF_35 = a2;
            eF_35.d(Math.max(aSa.V, Math.min((double)eF_35.J, ((double)b2 - a2.I) / a2.k * (double)a2.J)));
        }
        EF_3 eF_36 = a2;
        eF_36.f(b2, c2);
        EF_3 eF_37 = a2;
        b2 = (int)Math.max(aSa.V, Math.min((double)eF_37.k, (double)(a2.k * a2.j.l() / (double)a2.J)));
        c2 = (int)(eF_37.J + DQa.S - FPa.T);
        EF_3 eF_38 = a2;
        if (eF_36.J <= pqa.r) {
            if.f(eF_38.I, (double)(c2 + AQa.P), (double)a2.k, (double)oua.i, (Color)Bc.Ga.transparent(WF.J()));
        } else {
            Object object = ((double)eF_38.J - oua.i) / (double)a2.J;
            EF_3 eF_39 = a2;
            reference var5_6 = eF_39.k * object;
            object = eF_39.k * (oua.i - object);
            if.f(eF_39.I, (double)(c2 + AQa.P), (double)object, (double)oua.i, (Color)Bc.Ga.transparent(WF.J()));
            if.f((double)(eF_39.I + object), (double)(c2 + AQa.P), (double)var5_6, (double)oua.i, (Color)Bc.Oa.transparent(WF.J()));
        }
        uKa.B();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)WF.J());
        Kpa.J().J().J(M);
        if.J((double)(a2.I + (double)b2 - FPa.T), (double)c2, (double)Wqa.Z, (double)Wqa.Z);
    }

    public static EF J() {
        return k;
    }

    public static void J(EF eF2) {
        EF eF3 = eF2;
        EF a2 = k;
        k = eF3;
        if (k != null && eF3.A != null) {
            eF3.A.J(vRa.d != 0).f();
            return;
        }
        if (a2 != null && a2.A != null) {
            a2.A.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        boolean bl3 = bl2;
        EF_3 a2 = this;
        if (b2 == false && e2 != false) {
            EF_3.J((EF)a2);
        }
    }

    public void d(double a2) {
        EF_3 b2;
        if (b2.A != null) {
            b2.A.e(a2);
        }
        if (b2.I != null) {
            b2.I.accept(Float.valueOf((float)a2));
        }
        b2.j.f(a2, BRa.Y);
    }

    /*
     * WARNING - void declaration
     */
    public EF_3(RF rF2, Supplier<Float> supplier, Consumer<Float> consumer) {
        void b2;
        void c2;
        Object d2 = consumer;
        EF_3 a2 = this;
        a2((RF)c2, (Supplier<Float>)b2, (Consumer<Float>)d2, pqa.r);
    }

    static {
        k = null;
        M = new ResourceLocation(Cra.V, NSa.M);
    }

    /*
     * WARNING - void declaration
     */
    public EF_3(RF rF2, Supplier<Float> supplier, Consumer<Float> consumer, float f2) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f3 = f2;
        EF_3 a2 = this;
        super(uSa.E, uSa.E, JPa.ga, NTa.C, null, null);
        a2.A = d2;
        EF_3 eF_3 = a2;
        a2.j = new vC(((Float)c2.get()).floatValue());
        EF_3 eF_32 = a2;
        eF_32.I = b2;
        eF_32.J = e2;
    }
}

