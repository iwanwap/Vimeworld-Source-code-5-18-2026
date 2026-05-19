/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Ega
 *  FPa
 *  Hda
 *  NTa
 *  QSa
 *  Tpa
 *  Wsa
 *  XTa
 *  ZOa
 *  kba
 *  pqa
 *  pua
 *  uKa
 *  vRa
 */
public abstract class xLa
extends Ama {
    private boolean I;

    public void A() {
        xLa a2;
        xLa xLa2 = a2;
        super.A();
        xLa2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        xLa a2;
        float d2 = f2;
        xLa xLa2 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        if (xLa2.I) {
            a2.f();
        }
    }

    private void f() {
        xLa xLa2;
        xLa xLa3 = xLa2 = this;
        int n2 = xLa3.e - cPa.Ea;
        int n3 = xLa3.v;
        Object object = xLa3.g.c.J();
        if (!object.isEmpty()) {
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.L();
            int n4 = Zqa.G;
            if (object.size() > tTa.h) {
                n4 = gsa.Ja / (object.size() - vRa.d);
            }
            Object object2 = object = xLa2.g.c.J().iterator();
            while (object2.hasNext()) {
                xLa xLa4;
                Object object3 = (kba)object.next();
                Hda hda = Hda.A[object3.f()];
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                xLa xLa5 = xLa2;
                xLa5.g.J().J(G);
                xLa5.f(n2, n3, uSa.E, UTa.R, Bua.v, fPa.i);
                if (hda.f()) {
                    int a2 = hda.f();
                    xLa2.f(n2 + uua.p, n3 + XTa.W, uSa.E + a2 % Yqa.i * yOa.B, FPa.e + a2 / Yqa.i * yOa.B, yOa.B, yOa.B);
                }
                Object a2 = oha.J(hda.J(), new Object[uSa.E]);
                if (object3.J() == vRa.d) {
                    a2 = new StringBuilder().insert(3 >> 2, (String)a2).append(Tpa.E).append(oha.J(Wsa.m, new Object[uSa.E])).toString();
                    xLa4 = xLa2;
                } else if (object3.J() == uqa.g) {
                    a2 = new StringBuilder().insert(3 >> 2, (String)a2).append(Tpa.E).append(oha.J(yta.y, new Object[uSa.E])).toString();
                    xLa4 = xLa2;
                } else {
                    if (object3.J() == yRa.d) {
                        a2 = new StringBuilder().insert(5 >> 3, (String)a2).append(Tpa.E).append(oha.J(CRa.g, new Object[uSa.E])).toString();
                    }
                    xLa4 = xLa2;
                }
                xLa4.L.J((String)a2, (float)(n2 + NTa.C + yOa.B), (float)(n3 + uua.p), pua.o);
                object3 = Hda.J((kba)object3);
                xLa2.L.J((String)object3, (float)(n2 + NTa.C + yOa.B), (float)(n3 + uua.p + NTa.C), QSa.i);
                n3 += n4;
                object2 = object;
            }
        }
    }

    public void J() {
        xLa a2;
        if (!a2.g.c.J().isEmpty()) {
            a2.e = rRa.f + (a2.A - a2.j - ZOa.x) / uqa.g;
            a2.I = vRa.d;
            return;
        }
        a2.e = (a2.A - a2.j) / uqa.g;
        a2.I = uSa.E;
    }

    public xLa(Ega ega) {
        xLa b2 = ega;
        xLa a2 = this;
        super((Ega)b2);
    }
}

