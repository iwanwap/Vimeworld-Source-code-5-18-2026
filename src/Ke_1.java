/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  E
 *  EC
 *  F
 *  Kpa
 *  ad
 *  sMa
 *  vRa
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ke_1
extends EC {
    public boolean J;
    public sMa A;
    public List<E> I;

    public sMa J() {
        Ke_1 a2;
        return a2.A;
    }

    public ad J() {
        int n2;
        Ke_1 ke_1 = this;
        int n3 = n2 = ke_1.I.size();
        while (n3 > 0) {
            Ke_1 a2 = ke_1.I.get(n2 - vRa.d);
            if ((a2 instanceof F || a2 instanceof ad) && (a2 = (ad)a2).f()) {
                ad ad2;
                if (a2 instanceof eF && (ad2 = ((eF)((Object)a2)).J()) != null) {
                    return ad2;
                }
                return a2;
            }
            n3 = --n2;
        }
        return null;
    }

    public void f() {
        Ke_1 a2;
        Ke_1 ke_1 = a2;
        Ke_1 ke_12 = a2;
        ke_1.A = new sMa(a2.g);
        ke_12.A = (sMa)Kpa.J().t;
        ke_1.I = (List<E>)Kpa.J().k;
    }

    public Ke_1() {
        Ke_1 a2;
        Ke_1 ke_1 = a2;
        a2.I = new ArrayList<E>();
        ke_1.J = uSa.E;
    }

    public void A() {
        Ke_1 a2;
        Ke_1 ke_1 = a2;
        ke_1.f();
        if (!ke_1.J) {
            a2.J = vRa.d;
            a2.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        Ke_1 ke_1 = this;
        Ke_1 d2 = ke_1.J();
        if (d2 == null) {
            return;
        }
        ((F)d2).J((int)c2, (int)b2, (int)a2, uSa.E != 0);
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void a2;
        void b2;
        void c2;
        Ke_1 ke_1 = this;
        Ke_1 d2 = ke_1.J();
        if (d2 == null) {
            return;
        }
        ((F)d2).J((int)c2, (int)b2, (int)a2, vRa.d != 0);
    }

    public void M() {
        Ke_1 a2;
        a2.J = uSa.E;
        super.M();
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        Ke_1 ke_1 = this;
        Iterator<E> c2 = ke_1.I.iterator();
        Object object = c2;
        while (object.hasNext()) {
            void a2;
            void b2;
            ((E)c2.next()).J((int)b2, (int)a2);
            object = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void c2;
        int d2 = n3;
        Ke_1 b2 = this;
        b2.J((int)c2, d2);
    }
}

