/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  SOa
 *  Woa
 *  ZOa
 *  ac
 *  lma
 *  lqa
 *  pua
 *  vRa
 *  ysa
 */
import java.io.IOException;
import org.lwjgl.input.Keyboard;

public final class Gma_3
extends EC {
    private final lma J;
    private final EC A;
    private Woa I;

    public void J(ac ac2) throws IOException {
        Gma_3 b2 = ac2;
        Gma_3 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == vRa.d) {
                a2.A.J(uSa.E != 0, uSa.E);
                return;
            }
            if (((ac)b2).C == 0) {
                Gma_3 gma_3 = a2;
                a2.J.serverIP = gma_3.I.f();
                gma_3.A.J(vRa.d != 0, uSa.E);
            }
        }
    }

    public void l() {
        Gma_3 a2;
        a2.I.C();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Gma_3 a2 = this;
        a2.i();
        Gma_3.J((String)oha.J(iSa.Aa, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)kTa.j, (int)pua.o);
        Gma_3.f((String)oha.J(wua.e, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)ySa.T, (int)xra.R);
        Gma_3 gma_3 = a2;
        gma_3.I.J();
        super.J((int)c2, (int)b2, d2);
    }

    public void A() {
        Gma_3 a2;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        Gma_3 gma_3 = a2;
        gma_3.E.clear();
        gma_3.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / AQa.P + zua.m + lqa.s), oha.J(ysa.a, new Object[uSa.E])));
        a2.E.add(new ac(vRa.d, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / AQa.P + sOa.D + lqa.s), oha.J(SOa.l, new Object[uSa.E])));
        Gma_3 gma_32 = a2;
        Gma_3 gma_33 = a2;
        gma_32.I = new Woa(uqa.g, gma_33.L, (int)(gma_33.A / uqa.g - ySa.T), rQa.s, ZOa.x, kTa.j);
        a2.I.M(XOa.h);
        gma_32.I.l(vRa.d != 0);
        gma_32.I.f(a2.g.z.d);
        ((ac)a2.E.get((int)uSa.E)).J = a2.I.f().length() > 0 && a2.I.f().split(Era.Aa).length > 0 ? vRa.d : uSa.E;
    }

    public void M() {
        Gma_3 a2;
        Keyboard.enableRepeatEvents(uSa.E != 0);
        Gma_3 gma_3 = a2;
        a2.g.z.d = gma_3.I.f();
        gma_3.g.z.d();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        Gma_3 a2;
        int d2 = n4;
        Gma_3 gma_3 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        gma_3.I.J((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public Gma_3(EC eC2, lma lma2) {
        void b2;
        Gma_3 a2;
        Gma_3 c2 = lma2;
        Gma_3 gma_3 = a2 = this;
        gma_3.A = b2;
        gma_3.J = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        Gma_3 a2 = this;
        if (a2.I.J((char)b2, c3)) {
            ((ac)a2.E.get((int)uSa.E)).J = a2.I.f().length() > 0 && a2.I.f().split(Era.Aa).length > 0 ? vRa.d : uSa.E;
            return;
        }
        if (c3 == EPa.O || c3 == yRa.r) {
            Gma_3 gma_3 = a2;
            gma_3.J((ac)gma_3.E.get(uSa.E));
        }
    }
}

