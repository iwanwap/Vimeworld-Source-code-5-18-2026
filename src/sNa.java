/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  EC
 *  ISa
 *  JPa
 *  KBa
 *  Pqa
 *  QFa
 *  Yra
 *  ZOa
 *  aPa
 *  aaa
 *  ac
 *  cX
 *  cra
 *  kPa
 *  pqa
 *  pua
 *  uKa
 *  uY
 *  vRa
 *  wra
 */
import java.io.IOException;
import org.lwjgl.input.Keyboard;

public final class sNa
extends EC {
    private int k;
    private ac j;
    private int J;
    private aaa I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        sNa sNa2;
        sNa sNa3 = this;
        sNa3.i();
        sNa.J((String)oha.J(PQa.v, new Object[uSa.E]), (int)(sNa3.A / uqa.g), (int)wra.P, (int)pua.o);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.e();
        sNa sNa4 = sNa3;
        uKa.J((float)(sNa4.A / uqa.g), (float)JPa.N, (float)SPa.b);
        float d22 = kPa.d;
        uKa.l((float)(-d22), (float)(-d22), (float)(-d22));
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        if (sNa4.I.J() == QFa.Nd) {
            sNa sNa5 = sNa3;
            sNa2 = sNa5;
            d22 = (float)(sNa5.I.C() * aPa.Y) / Yra.i;
            uKa.J((float)d22, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)JPa.N, (float)hpa.S, (float)JPa.N);
        } else {
            int d22 = sNa3.I.C();
            float f3 = JPa.N;
            if (d22 == uqa.g) {
                f3 = Hra.Ga;
            }
            if (d22 == AQa.P) {
                f3 = ISa.a;
            }
            if (d22 == tTa.h) {
                f3 = kPa.Ha;
            }
            uKa.J((float)f3, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)JPa.N, (float)hpa.S, (float)JPa.N);
            sNa2 = sNa3;
        }
        if (sNa2.k / uua.p % uqa.g == 0) {
            sNa3.I.k = sNa3.J;
        }
        RKa.E.J((uY)sNa3.I, KPa.I, pua.f, KPa.I, JPa.N);
        sNa3.I.k = pua.o;
        uKa.D();
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void A() {
        sNa a2;
        sNa sNa2 = a2;
        sNa2.E.clear();
        Keyboard.enableRepeatEvents(vRa.d != 0);
        a2.j = new ac(uSa.E, a2.A / uqa.g - ySa.T, (int)(a2.I / AQa.P + sOa.D), oha.J(cra.g, new Object[uSa.E]));
        sNa2.E.add(a2.j);
        a2.I.J(uSa.E != 0);
    }

    public sNa(aaa aaa2) {
        sNa b2 = aaa2;
        sNa a2 = this;
        a2.I = b2;
    }

    public void l() {
        a.k += vRa.d;
    }

    public void M() {
        sNa sNa2 = this;
        Keyboard.enableRepeatEvents(uSa.E != 0);
        sNa a2 = sNa2.g.J();
        if (a2 != null) {
            a2.J((KC)new KBa(sNa2.I.J(), sNa2.I.J));
        }
        sNa2.I.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        void a2;
        sNa sNa2 = this;
        if (a2 == ZOa.x) {
            sNa2.J = sNa2.J - vRa.d & yRa.d;
        }
        if (a2 == Pqa.i || a2 == EPa.O || a2 == yRa.r) {
            sNa2.J = sNa2.J + vRa.d & yRa.d;
        }
        Object c3 = sNa2.I.J[sNa2.J].f();
        if (a2 == hpa.Z && ((String)c3).length() > 0) {
            Object object = c3;
            c3 = ((String)object).substring(uSa.E, ((String)object).length() - vRa.d);
        }
        if (cX.J((char)b2) && sNa2.L.J(new StringBuilder().insert(2 & 5, (String)c3).append((char)b2).toString()) <= Jsa.ha) {
            c3 = new StringBuilder().insert(3 & 4, (String)c3).append((char)b2).toString();
        }
        sNa2.I.J[sNa2.J] = new CY((String)c3);
        if (a2 == vRa.d) {
            sNa sNa3 = sNa2;
            sNa3.J(sNa3.j);
        }
    }

    public void J(ac ac2) throws IOException {
        sNa b2 = ac2;
        sNa a2 = this;
        if (((ac)b2).J && ((ac)b2).C == 0) {
            sNa sNa2 = a2;
            sNa2.I.f();
            sNa2.g.J((EC)null);
        }
    }
}

