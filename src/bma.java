/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  MQa
 *  SOa
 *  Woa
 *  ZOa
 *  ac
 *  lqa
 *  pua
 *  uOa
 *  vRa
 */
import java.io.IOException;
import org.lwjgl.input.Keyboard;

public final class bma
extends EC {
    private Woa J;
    private EC A;
    private final String I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        bma a2 = this;
        a2.i();
        bma.J((String)oha.J(kua.Q, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)kTa.j, (int)pua.o);
        bma.f((String)oha.J(WPa.Ka, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)uOa.F, (int)xra.R);
        bma bma2 = a2;
        bma2.J.J();
        super.J((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public bma(EC eC2, String string) {
        void b2;
        bma a2;
        Object c2 = string;
        bma bma2 = a2 = this;
        bma2.A = b2;
        bma2.I = c2;
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        bma a2;
        int c3 = n2;
        (a2 = this).J.J((char)b2, c3);
        ((ac)(a2 = this).E.get((int)uSa.E)).J = a2.J.f().trim().length() > 0 ? vRa.d : uSa.E;
        int n3 = ((ac)(a2 = this).E.get((int)uSa.E)).J ? 1 : 0;
        if (c3 == EPa.O || c3 == yRa.r) {
            bma bma2 = a2;
            bma2.J((ac)bma2.E.get(uSa.E));
        }
    }

    public void A() {
        bma bma2 = this;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        bma bma3 = bma2;
        bma3.E.clear();
        bma3.E.add(new ac(uSa.E, (int)(bma2.A / uqa.g - ySa.T), (int)(bma2.I / AQa.P + zua.m + lqa.s), oha.J(MQa.s, new Object[uSa.E])));
        bma2.E.add(new ac(vRa.d, (int)(bma2.A / uqa.g - ySa.T), (int)(bma2.I / AQa.P + sOa.D + lqa.s), oha.J(SOa.l, new Object[uSa.E])));
        bma bma4 = bma2;
        bma bma5 = bma2;
        Object a2 = bma4.g.J().J(bma5.I).f();
        bma bma6 = bma2;
        bma bma7 = bma2;
        bma4.J = new Woa(uqa.g, bma7.L, (int)(bma7.A / uqa.g - ySa.T), Psa.M, ZOa.x, kTa.j);
        bma5.J.l(vRa.d != 0);
        bma4.J.f((String)a2);
    }

    public void l() {
        bma a2;
        a2.J.C();
    }

    public void J(ac ac2) throws IOException {
        bma b2 = ac2;
        bma a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == vRa.d) {
                bma bma2 = a2;
                bma2.g.J(bma2.A);
                return;
            }
            if (((ac)b2).C == 0) {
                bma bma3 = a2;
                a2.g.J().J(a2.I, bma3.J.f().trim());
                bma3.g.J(a2.A);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        bma a2;
        int d2 = n4;
        bma bma2 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        bma2.J.J((int)c2, (int)b2, d2);
    }
}

