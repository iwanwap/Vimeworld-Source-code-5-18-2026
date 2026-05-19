/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RPa
 *  aPa
 *  uKa
 *  vRa
 *  zh
 */
import java.util.ArrayDeque;

public final class cI_1 {
    private static boolean J;
    private static int A;
    private static final ArrayDeque<zh> I;

    public cI_1() {
        cI_1 a2;
    }

    public static void J(Runnable runnable, boolean bl) {
        boolean b2 = bl;
        Runnable a2 = runnable;
        if (A == 0) {
            uKa.q();
            uKa.e((int)osa.Ja);
            J = uKa.J() && uKa.l() ? vRa.d : uSa.E;
        }
        I.addLast(new zh(a2, b2));
        uKa.f((int)ATa.o, (int)LRa.c, (int)LRa.c);
        uKa.J((int)Jqa.e, (int)((A += vRa.d) - vRa.d), (int)osa.Ja);
        uKa.J(uSa.E != 0, uSa.E != 0, uSa.E != 0, uSa.E != 0);
        if (J) {
            uKa.J(uSa.E != 0);
        }
        a2.run();
        if (J) {
            uKa.J(vRa.d != 0);
        }
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        uKa.J((int)(b2 ? Jqa.e : aPa.Ha), (int)A, (int)osa.Ja);
        uKa.f((int)ATa.o, (int)ATa.o, (int)ATa.o);
    }

    public static void f() {
        A = uSa.E;
        J = uSa.E;
        I.clear();
    }

    public static void J() {
        zh zh2 = I.removeLast();
        uKa.f((int)ATa.o, (int)RPa.r, (int)RPa.r);
        uKa.J((int)Jqa.e, (int)((A -= vRa.d) + vRa.d), (int)osa.Ja);
        uKa.J(uSa.E != 0, uSa.E != 0, uSa.E != 0, uSa.E != 0);
        if (J) {
            uKa.J(uSa.E != 0);
        }
        zh2.J().run();
        if (J) {
            uKa.J(vRa.d != 0);
        }
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        uKa.f((int)ATa.o, (int)ATa.o, (int)ATa.o);
        uKa.J((int)Jqa.e, (int)A, (int)osa.Ja);
        if (A == 0) {
            uKa.g();
        }
    }

    public static void J(Runnable a2) {
        cI_1.J(a2, vRa.d != 0);
    }

    static {
        A = uSa.E;
        J = uSa.E;
        I = new ArrayDeque();
    }
}

