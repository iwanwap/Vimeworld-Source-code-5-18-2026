/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  Pd
 *  Xba
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xba_1
implements KC<Pd> {
    private List<XF> C;
    private double i;
    private float M;
    private float k;
    private float j;
    private double J;
    private double A;
    private float I;

    /*
     * WARNING - void declaration
     */
    public Xba_1(double d2, double d3, double d4, float f2, List<XF> list, Lz lz2) {
        Xba_1 g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        Xba_1 a2;
        Xba_1 xba_1 = xba_12;
        Xba_1 xba_12 = lz2;
        Xba_1 xba_13 = a2 = xba_1;
        Xba_1 xba_14 = a2;
        a2.A = f3;
        xba_14.i = e2;
        xba_14.J = d5;
        xba_13.I = c2;
        xba_13.C = Lists.newArrayList(b2);
        if (g2 != null) {
            Xba_1 xba_15 = a2;
            Xba_1 xba_16 = g2;
            a2.j = (float)((Lz)xba_16).A;
            xba_15.k = (float)((Lz)xba_16).j;
            xba_15.M = (float)((Lz)g2).J;
        }
    }

    public double l() {
        Xba_1 a2;
        return a2.i;
    }

    public float C() {
        Xba_1 a2;
        return a2.M;
    }

    public float l() {
        Xba_1 a2;
        return a2.I;
    }

    public double f() {
        Xba_1 a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        Xba_1 b2 = pd2;
        Xba_1 a2 = this;
        b2.J((Xba)a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Xba_1 a2 = this;
        b2.writeFloat((float)a2.A);
        b2.writeFloat((float)a2.i);
        b2.writeFloat((float)a2.J);
        b2.writeFloat(a2.I);
        b2.writeInt(a2.C.size());
        Xba_1 xba_1 = a2;
        int n2 = (int)xba_1.A;
        int n3 = (int)xba_1.i;
        int n4 = (int)xba_1.J;
        Iterator<XF> iterator = xba_1.C.iterator();
        Iterator<XF> iterator2 = iterator;
        while (iterator2.hasNext()) {
            XF xF = iterator.next();
            iterator2 = iterator;
            XF xF2 = xF;
            int n5 = xF2.getX() - n2;
            int n6 = xF2.getY() - n3;
            int n7 = xF2.getZ() - n4;
            b2.writeByte(n5);
            b2.writeByte(n6);
            b2.writeByte(n7);
        }
        b2.writeFloat(a2.j);
        b2.writeFloat(a2.k);
        b2.writeFloat(a2.M);
    }

    public List<XF> J() {
        Xba_1 a2;
        return a2.C;
    }

    public float f() {
        Xba_1 a2;
        return a2.k;
    }

    public double J() {
        Xba_1 a2;
        return a2.J;
    }

    public Xba_1() {
        Xba_1 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        Xba_1 a2;
        Lca b2 = lca;
        Xba_1 xba_1 = a2 = this;
        Object object = b2;
        Xba_1 xba_12 = a2;
        xba_12.A = b2.readFloat();
        xba_12.i = b2.readFloat();
        a2.J = ((Lca)object).readFloat();
        a2.I = ((Lca)object).readFloat();
        int n3 = b2.readInt();
        xba_1.C = Lists.newArrayListWithCapacity(n3);
        int n4 = (int)a2.A;
        int n5 = (int)xba_1.i;
        int n6 = (int)xba_1.J;
        int n7 = n2 = uSa.E;
        while (n7 < n3) {
            Object object2 = b2;
            int n8 = ((Lca)object2).readByte() + n4;
            int n9 = ((Lca)object2).readByte() + n5;
            int n10 = ((Lca)object2).readByte() + n6;
            a2.C.add(new XF(n8, n9, n10));
            n7 = ++n2;
        }
        Xba_1 xba_13 = a2;
        Lca lca2 = b2;
        a2.j = b2.readFloat();
        xba_13.k = lca2.readFloat();
        xba_13.M = lca2.readFloat();
    }

    public float J() {
        Xba_1 a2;
        return a2.j;
    }
}

