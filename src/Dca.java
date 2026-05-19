/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  QSa
 *  mca
 *  pua
 *  wra
 *  xBa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dca
implements KC<Pd> {
    private String m;
    private int C;
    private String i;
    private Collection<String> M;
    private String k;
    private int j;
    private int J;
    private String A;
    private String I;

    public int l() {
        Dca a2;
        return a2.J;
    }

    public Dca() {
        Dca a2;
        a2.A = Mqa.y;
        a2.i = Mqa.y;
        a2.I = Mqa.y;
        a2.k = Mqa.y;
        a2.m = xBa.ALWAYS.field_178830_e;
        a2.J = pua.o;
        a2.M = Lists.newArrayList();
    }

    public String d() {
        Dca a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public Dca(mca mca2, Collection<String> collection, int n2) {
        void b2;
        int d2 = n2;
        Dca a2 = this;
        a2.A = Mqa.y;
        a2.i = Mqa.y;
        a2.I = Mqa.y;
        a2.k = Mqa.y;
        a2.m = xBa.ALWAYS.field_178830_e;
        a2.J = pua.o;
        a2.M = Lists.newArrayList();
        if (d2 != yRa.d && d2 != AQa.P) {
            throw new IllegalArgumentException(lQa.z);
        }
        if (b2 != null && !b2.isEmpty()) {
            void c2;
            a2.j = d2;
            a2.A = c2.J();
            a2.M.addAll((Collection<String>)b2);
            return;
        }
        throw new IllegalArgumentException(ysa.i);
    }

    public String C() {
        Dca a2;
        return a2.i;
    }

    public String l() {
        Dca a2;
        return a2.I;
    }

    public Collection<String> J() {
        Dca a2;
        return a2.M;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Dca a2 = this;
        a2.A = b2.readStringFromBuffer(fPa.i);
        a2.j = b2.readByte();
        if (a2.j == 0 || a2.j == uqa.g) {
            Dca dca = a2;
            Object object = b2;
            Dca dca2 = a2;
            Object object2 = b2;
            a2.i = b2.readStringFromBuffer(QSa.p);
            a2.I = ((Lca)object2).readStringFromBuffer(fPa.i);
            dca2.k = ((Lca)object2).readStringFromBuffer(fPa.i);
            dca2.C = b2.readByte();
            dca.m = ((Lca)object).readStringFromBuffer(QSa.p);
            dca.J = ((Lca)object).readByte();
        }
        if (a2.j == 0 || a2.j == yRa.d || a2.j == AQa.P) {
            int n2;
            int n3 = b2.readVarIntFromBuffer();
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                a2.M.add(b2.readStringFromBuffer(wra.P));
                n4 = ++n2;
            }
        }
    }

    @Override
    public void f(Lca lca) throws IOException {
        Dca a2;
        Lca b2 = lca;
        Dca dca = a2 = this;
        b2.writeString(a2.A);
        b2.writeByte(dca.j);
        if (dca.j == 0 || a2.j == uqa.g) {
            b2.writeString(a2.i);
            b2.writeString(a2.I);
            b2.writeString(a2.k);
            b2.writeByte(a2.C);
            b2.writeString(a2.m);
            b2.writeByte(a2.J);
        }
        if (a2.j == 0 || a2.j == yRa.d || a2.j == AQa.P) {
            Iterator<String> iterator;
            b2.writeVarIntToBuffer(a2.M.size());
            Iterator<String> iterator2 = iterator = a2.M.iterator();
            while (iterator2.hasNext()) {
                String string = iterator.next();
                iterator2 = iterator;
                b2.writeString(string);
            }
        }
    }

    public String f() {
        Dca a2;
        return a2.A;
    }

    public String J() {
        Dca a2;
        return a2.m;
    }

    public int f() {
        Dca a2;
        return a2.j;
    }

    public int J() {
        Dca a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public Dca(mca mca2, int n2) {
        void a2;
        Dca b2;
        Dca c2 = mca2;
        Dca dca = b2 = this;
        b2.A = Mqa.y;
        b2.i = Mqa.y;
        b2.I = Mqa.y;
        b2.k = Mqa.y;
        b2.m = xBa.ALWAYS.field_178830_e;
        dca.J = pua.o;
        dca.M = Lists.newArrayList();
        dca.A = c2.J();
        b2.j = a2;
        if (b2.j == 0 || a2 == uqa.g) {
            Dca dca2 = b2;
            Dca dca3 = c2;
            Dca dca4 = b2;
            Dca dca5 = c2;
            b2.i = c2.C();
            b2.I = dca5.l();
            dca4.k = dca5.f();
            dca4.C = c2.J();
            dca2.m = dca3.J().field_178830_e;
            dca2.J = dca3.J().getColorIndex();
        }
        if (a2 == false) {
            b2.M.addAll(c2.J());
        }
    }

    @Override
    public void J(Pd pd2) {
        Dca b2 = pd2;
        Dca a2 = this;
        b2.J(a2);
    }
}

