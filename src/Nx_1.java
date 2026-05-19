/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  Fpa
 *  Gg
 *  JTa
 *  NCa
 *  NTa
 *  Nx
 *  Waa
 *  Xv
 *  mra
 *  vRa
 *  waa
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Nx_1 {
    private int chunkPosZ;
    private int chunkPosX;
    public LinkedList<uU> components;
    public Xv boundingBox;

    public boolean J(Baa baa2) {
        Nx_1 b2 = baa2;
        Nx_1 a2 = this;
        return vRa.d != 0;
    }

    public int f() {
        Nx_1 a2;
        return a2.chunkPosZ;
    }

    public void f(Waa object) {
        Nx_1 b2 = object;
        object = this;
    }

    public void J() {
        Object a2;
        Nx_1 nx_1 = this;
        nx_1.boundingBox = Xv.J();
        Object object = a2 = nx_1.components.iterator();
        while (object.hasNext()) {
            uU uU2 = (uU)a2.next();
            object = a2;
            nx_1.boundingBox.J(uU2.J());
        }
    }

    public int J() {
        Nx_1 a2;
        return a2.chunkPosX;
    }

    public LinkedList<uU> J() {
        Nx_1 a2;
        return a2.components;
    }

    public void J(Baa object) {
        Nx_1 b2 = object;
        object = this;
    }

    public void J(Waa object) {
        Nx_1 b2 = object;
        object = this;
    }

    public Xv J() {
        Nx_1 a2;
        return a2.boundingBox;
    }

    /*
     * WARNING - void declaration
     */
    public Nx_1(int n2, int n3) {
        void b2;
        Nx_1 a2;
        int c2 = n3;
        Nx_1 nx_1 = a2 = this;
        Nx_1 nx_12 = a2;
        nx_12.components = new LinkedList();
        nx_1.chunkPosX = b2;
        nx_1.chunkPosZ = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Waa waa2) {
        int n2;
        Nx_1 c2 = waa2;
        Nx_1 a2 = this;
        Nx_1 nx_1 = c2;
        a2.chunkPosX = c2.J(JTa.O);
        a2.chunkPosZ = nx_1.J(mra.n);
        if (nx_1.J(Fpa.e)) {
            Nx_1 nx_12 = a2;
            nx_12.boundingBox = new Xv(c2.J(Fpa.e));
        }
        waa waa3 = c2.J(Ira.g, NTa.C);
        int n3 = n2 = uSa.E;
        while (n3 < waa3.J()) {
            void b2;
            Waa waa4 = waa3.J(n2);
            a2.components.add(uv.J(waa4, (Gg)b2));
            n3 = ++n2;
        }
        a2.f((Waa)c2);
    }

    public boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Waa J(int n2, int n3) {
        void b22;
        int c2 = n3;
        Nx_1 a2 = this;
        Waa waa2 = new Waa();
        waa2.J(QTa.O, uv.J((Nx)a2));
        waa2.J(JTa.O, (int)b22);
        waa2.J(mra.n, c2);
        waa2.J(Fpa.e, (NCa)a2.boundingBox.J());
        waa b22 = new waa();
        Iterator iterator = c2 = a2.components.iterator();
        while (iterator.hasNext()) {
            uU uU2 = (uU)c2.next();
            iterator = c2;
            b22.J((NCa)uU2.J());
        }
        Waa waa3 = waa2;
        waa3.J(Ira.g, (NCa)b22);
        a2.J(waa3);
        return waa2;
    }

    public void J(Gg gg2, Random random, int n2) {
        Iterator b2;
        int a2;
        Nx_1 d22 = gg2;
        Nx_1 c2 = this;
        int d22 = d22.M() - a2;
        a2 = c2.boundingBox.f() + vRa.d;
        if (a2 < d22) {
            int n3 = a2;
            a2 = n3 + ((Random)((Object)b2)).nextInt(d22 - n3);
        }
        d22 = a2 - c2.boundingBox.maxY;
        Nx_1 nx_1 = c2;
        nx_1.boundingBox.J(uSa.E, d22, uSa.E);
        Iterator iterator = b2 = nx_1.components.iterator();
        while (iterator.hasNext()) {
            ((uU)b2.next()).J(uSa.E, d22, uSa.E);
            iterator = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, int n2, int n3) {
        Iterator c2;
        void b2;
        void a2;
        Nx_1 e22 = gg2;
        Nx_1 d2 = this;
        void e22 = a2 - b2 + vRa.d - d2.boundingBox.f();
        e22 = (e22 > vRa.d ? b2 + ((Random)((Object)c2)).nextInt((int)e22) : b2) - d2.boundingBox.minY;
        Nx_1 nx_1 = d2;
        nx_1.boundingBox.J(uSa.E, (int)e22, uSa.E);
        Iterator iterator = c2 = nx_1.components.iterator();
        while (iterator.hasNext()) {
            ((uU)c2.next()).J(uSa.E, (int)e22, uSa.E);
            iterator = c2;
        }
    }

    public Nx_1() {
        Nx_1 a2;
        Nx_1 nx_1 = a2;
        nx_1.components = new LinkedList();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, Xv xv2) {
        Nx_1 nx_1 = this;
        Iterator d2 = nx_1.components.iterator();
        while (d2.hasNext()) {
            void b2;
            void c2;
            void a2;
            uU uU2 = (uU)d2.next();
            if (!uU2.J().J((Xv)a2) || uU2.J((Gg)c2, (Random)b2, (Xv)a2)) continue;
            d2.remove();
        }
    }
}

