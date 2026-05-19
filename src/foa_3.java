/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  EC
 *  JQa
 *  NTa
 *  SOa
 *  Woa
 *  Ypa
 *  Yra
 *  ZOa
 *  ac
 *  bSa
 *  bpa
 *  doa
 *  foa
 *  lma
 *  poa
 *  pua
 *  vRa
 *  vpa
 */
import com.google.common.base.Predicate;
import java.io.IOException;
import org.lwjgl.input.Keyboard;

public final class foa_3
extends EC {
    private final EC M;
    private Woa k;
    private Predicate<String> j;
    private final lma J;
    private ac A;
    private Woa I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        foa_3 a2;
        int d2 = n4;
        foa_3 foa_32 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        foa_32.k.J((int)c2, (int)b2, d2);
        foa_32.I.J((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        foa_3 a2 = this;
        int n3 = c3;
        a2.I.J((char)b2, n3);
        a2.k.J((char)b2, c3);
        if (n3 == Ypa.A) {
            foa_3 foa_32 = a2;
            foa_32.I.l((!foa_32.I.f() ? vRa.d : uSa.E) != 0);
            foa_3 foa_33 = a2;
            foa_33.k.l((!foa_33.k.f() ? vRa.d : uSa.E) != 0);
        }
        if (c3 == EPa.O || c3 == yRa.r) {
            foa_3 foa_34 = a2;
            foa_34.J((ac)foa_34.E.get(uSa.E));
        }
        ((ac)a2.E.get((int)uSa.E)).J = a2.k.f().length() > 0 && a2.k.f().split(Era.Aa).length > 0 && a2.I.f().length() > 0 ? vRa.d : uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        foa_3 a2 = this;
        a2.i();
        foa_3.J((String)oha.J(vpa.B, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)yta.Ka, (int)pua.o);
        foa_3.f((String)oha.J(bSa.B, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)Bpa.Z, (int)xra.R);
        foa_3.f((String)oha.J(wua.e, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)bpa.I, (int)xra.R);
        foa_3 foa_32 = a2;
        foa_32.I.J();
        foa_32.k.J();
        super.J((int)c2, (int)b2, d2);
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    public void A() {
        foa_3 a2;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        foa_3 foa_32 = a2;
        foa_32.E.clear();
        foa_32.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / AQa.P + zua.m + yOa.B), oha.J(NTa.W, new Object[uSa.E])));
        a2.E.add(new ac(vRa.d, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / AQa.P + sOa.D + yOa.B), oha.J(SOa.l, new Object[uSa.E])));
        a2.A = new ac(uqa.g, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / AQa.P + Eqa.Ka), oha.J(JQa.I, new Object[uSa.E]) + Xpa.E + a2.J.J().getMotd().l());
        a2.E.add(a2.A);
        foa_3 foa_33 = a2;
        foa_3 foa_34 = a2;
        foa_33.I = new Woa(uSa.E, foa_34.L, (int)(foa_34.A / uqa.g - ySa.T), SPa.T, ZOa.x, kTa.j);
        foa_33.I.l(vRa.d != 0);
        foa_33.I.f(a2.J.serverName);
        foa_3 foa_35 = a2;
        foa_33.k = new Woa(vRa.d, foa_35.L, (int)(foa_35.A / uqa.g - ySa.T), Yra.j, ZOa.x, kTa.j);
        foa_33.k.M(XOa.h);
        foa_33.k.f(a2.J.serverIP);
        foa_33.k.J(a2.j);
        ((ac)a2.E.get((int)uSa.E)).J = a2.k.f().length() > 0 && a2.k.f().split(Era.Aa).length > 0 && a2.I.f().length() > 0 ? vRa.d : uSa.E;
    }

    public void J(ac ac2) throws IOException {
        foa_3 b2 = ac2;
        foa_3 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == uqa.g) {
                a2.J.J(poa.values()[(a2.J.J().ordinal() + vRa.d) % poa.values().length]);
                a2.A.i = oha.J(JQa.I, new Object[uSa.E]) + Xpa.E + a2.J.J().getMotd().l();
                return;
            }
            if (((ac)b2).C == vRa.d) {
                a2.M.J(uSa.E != 0, uSa.E);
                return;
            }
            if (((ac)b2).C == 0) {
                foa_3 foa_32 = a2;
                foa_3 foa_33 = a2;
                foa_32.J.serverName = foa_33.I.f();
                foa_32.J.serverIP = a2.k.f();
                foa_33.M.J(vRa.d != 0, uSa.E);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public foa_3(EC eC2, lma lma2) {
        void b2;
        foa_3 a2;
        foa_3 c2 = lma2;
        foa_3 foa_32 = a2 = this;
        foa_3 foa_33 = a2;
        a2.j = new doa((foa)a2);
        foa_32.M = b2;
        foa_32.J = c2;
    }

    public void l() {
        foa_3 a2;
        foa_3 foa_32 = a2;
        foa_32.I.C();
        foa_32.k.C();
    }
}

