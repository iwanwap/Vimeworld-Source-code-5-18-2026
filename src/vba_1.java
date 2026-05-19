/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  ERa
 *  JTa
 *  NCa
 *  NTa
 *  Qsa
 *  Uta
 *  VQa
 *  Vx
 *  Waa
 *  asa
 *  fpa
 *  hTa
 *  ica
 *  kta
 *  mca
 *  pY
 *  qca
 *  tca
 *  vRa
 *  wOa
 *  waa
 *  wra
 *  xBa
 */
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class vba_1
extends Vx {
    private Waa J;
    private qca A;
    private static final Logger I = LogManager.getLogger();

    public vba_1() {
        a2(fpa.ha);
        vba_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void l(waa waa2) {
        void a2;
        int n2;
        vba_1 vba_12 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.J()) {
            vba_1 b2 = a2.J(n2);
            lb lb2 = lb.A.get(b2.J(JTa.V));
            if (lb2 != null) {
                String string = b2.J(DQa.N);
                if (string.length() > ERa.C) {
                    string = string.substring(uSa.E, ERa.C);
                }
                lb lb3 = lb2 = vba_12.A.J(string, lb2);
                lb3.J(b2.J(Qsa.ha));
                lb3.J(kBa.func_178795_a(b2.J(EPa.z)));
            }
            n3 = ++n2;
        }
    }

    public void f(Waa waa2) {
        vba_1 b2 = waa2;
        vba_1 a2 = this;
        if (a2.A == null) {
            I.warn(Uta.ca);
            return;
        }
        vba_1 vba_12 = b2;
        vba_12.J(kra.Z, (NCa)a2.l());
        vba_12.J(eua.x, (NCa)a2.J());
        vba_12.J(hTa.f, (NCa)a2.f());
        a2.C((Waa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(waa waa2) {
        void a2;
        int n2;
        vba_1 vba_12 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.J()) {
            vba_1 b2 = a2.J(n2);
            String string = b2.J(DQa.N);
            if (string.length() > ERa.C) {
                string = string.substring(uSa.E, ERa.C);
            }
            string = vba_12.A.f(string);
            String string2 = b2.J(Qsa.ha);
            if (string2.length() > fPa.i) {
                string2 = string2.substring(uSa.E, fPa.i);
            }
            string.f(string2);
            if (b2.J(asa.V, Yqa.i)) {
                string.J(pY.getValueByName((String)b2.J(asa.V)));
            }
            String string3 = string;
            vba_1 vba_13 = b2;
            string3.l(vba_13.J(VQa.o));
            string3.J(vba_13.J(eta.ja));
            if (b2.J(lTa.F, zOa.v)) {
                string.J(b2.f(lTa.F));
            }
            if (b2.J(xqa.Aa, zOa.v)) {
                string.f(b2.f(xqa.Aa));
            }
            if (b2.J(oQa.n, Yqa.i) && (string2 = xBa.func_178824_a((String)b2.J(oQa.n))) != null) {
                string.J((xBa)string2);
            }
            if (b2.J(mSa.C, Yqa.i) && (string2 = xBa.func_178824_a((String)b2.J(mSa.C))) != null) {
                string.f((xBa)string2);
            }
            vba_12.J((mca)string, b2.J(kta.e, Yqa.i));
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(waa waa2) {
        void a2;
        int n2;
        vba_1 vba_12 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.J()) {
            vba_1 b2 = a2.J(n2);
            ica ica2 = vba_12.A.J(b2.J(wua.W));
            String string = b2.J(DQa.N);
            if (string.length() > wra.P) {
                string = string.substring(uSa.E, wra.P);
            }
            ica2 = vba_12.A.J(string, ica2);
            vba_1 vba_13 = b2;
            ica2.J(vba_13.J(vRa.fa));
            if (vba_13.J(hQa.X)) {
                ica2.J(b2.f(hQa.X));
            }
            n3 = ++n2;
        }
    }

    public void J(Waa waa2) {
        vba_1 b2 = waa2;
        vba_1 a2 = this;
        if (a2.A == null) {
            a2.J = b2;
            return;
        }
        vba_1 vba_12 = a2;
        vba_1 vba_13 = b2;
        vba_12.l(vba_13.J(kra.Z, NTa.C));
        vba_12.J(vba_13.J(eua.x, NTa.C));
        if (b2.J(uqa.q, NTa.C)) {
            a2.l(b2.J(uqa.q));
        }
        if (b2.J(hTa.f, WOa.fa)) {
            a2.f(b2.J(hTa.f, NTa.C));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void C(Waa waa2) {
        int b2;
        vba_1 vba_12 = this;
        Waa waa3 = new Waa();
        int n2 = uSa.E;
        int n3 = b2 = uSa.E;
        while (n3 < wOa.t) {
            ica ica2 = vba_12.A.J(b2);
            if (ica2 != null) {
                waa3.J(GPa.o + b2, ica2.J());
                n2 = vRa.d;
            }
            n3 = ++b2;
        }
        if (n2 != 0) {
            void a2;
            a2.J(uqa.q, (NCa)waa3);
        }
    }

    public void J(qca qca2) {
        vba_1 b2 = qca2;
        vba_1 a2 = this;
        a2.A = b2;
        if (a2.J != null) {
            vba_1 vba_12 = a2;
            vba_12.J(vba_12.J);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(mca mca2, waa waa2) {
        void a2;
        int c2;
        vba_1 vba_12 = this;
        int n2 = c2 = uSa.E;
        while (n2 < a2.J()) {
            void b2;
            String string = a2.J(c2);
            vba_12.A.J(string, b2.J());
            n2 = ++c2;
        }
    }

    public vba_1(String string) {
        Object b2 = string;
        vba_1 a2 = this;
        super((String)b2);
    }

    public waa l() {
        vba_1 vba_12 = this;
        waa waa2 = new waa();
        for (vba_1 a2 : vba_12.A.d()) {
            Waa waa3;
            if (a2.J() == null) continue;
            Waa waa4 = waa3 = new Waa();
            waa4.J(DQa.N, a2.J());
            waa4.J(JTa.V, a2.J().J());
            waa4.J(Qsa.ha, a2.f());
            waa4.J(EPa.z, a2.J().func_178796_a());
            waa2.J((NCa)waa4);
        }
        return waa2;
    }

    public waa f() {
        Iterator iterator;
        vba_1 vba_12 = this;
        waa waa2 = new waa();
        Iterator iterator2 = iterator = vba_12.A.l().iterator();
        while (iterator2.hasNext()) {
            Object a2 = (mca)iterator.next();
            Waa waa3 = new Waa();
            waa3.J(DQa.N, a2.J());
            vba_1 vba_13 = a2;
            waa3.J(Qsa.ha, vba_13.C());
            if (vba_13.J().getColorIndex() >= 0) {
                waa3.J(asa.V, a2.J().getFriendlyName());
            }
            Waa waa4 = waa3;
            waa4.J(VQa.o, a2.l());
            waa4.J(eta.ja, a2.f());
            waa4.J(lTa.F, a2.f());
            waa4.J(xqa.Aa, a2.J());
            waa4.J(oQa.n, a2.J().field_178830_e);
            waa4.J(mSa.C, a2.f().field_178830_e);
            waa waa5 = new waa();
            a2 = a2.J().iterator();
            Object object = a2;
            while (object.hasNext()) {
                String string = (String)a2.next();
                object = a2;
                waa5.J((NCa)new tca(string));
            }
            waa3.J(kta.e, (NCa)waa5);
            iterator2 = iterator;
            waa2.J((NCa)waa3);
        }
        return waa2;
    }

    public waa J() {
        vba_1 vba_12 = this;
        waa waa2 = new waa();
        for (vba_1 a2 : vba_12.A.f()) {
            Waa waa3;
            if (a2.J() == null) continue;
            Waa waa4 = waa3 = new Waa();
            waa4.J(DQa.N, a2.J());
            waa4.J(wua.W, a2.J().J());
            waa4.J(vRa.fa, a2.J());
            waa4.J(hQa.X, a2.J());
            waa2.J((NCa)waa4);
        }
        return waa2;
    }

    /*
     * WARNING - void declaration
     */
    public void l(Waa waa2) {
        int b2;
        vba_1 vba_12 = this;
        int n2 = b2 = uSa.E;
        while (n2 < wOa.t) {
            void a2;
            if (a2.J(GPa.o + b2, Yqa.i)) {
                String string = a2.J(new StringBuilder().insert(5 >> 3, GPa.o).append(b2).toString());
                vba_1 vba_13 = vba_12;
                string = vba_13.A.J(string);
                vba_13.A.J(b2, (ica)string);
            }
            n2 = ++b2;
        }
    }
}

