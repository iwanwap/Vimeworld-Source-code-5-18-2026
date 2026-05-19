/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Df
 *  Xd
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aE {
    private final String j;
    private final List<Df> J;
    private String A;
    private Xd I;

    public String f() {
        aE a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public aE J(int n2, int n3, int n4) {
        Iterator<Df> iterator;
        aE aE2 = this;
        aE d2 = new aE(aE2.j);
        aE aE3 = aE2;
        d2.A = aE2.A;
        new aE(aE2.j).I = aE3.I;
        Iterator<Df> iterator2 = iterator = aE3.J.iterator();
        while (iterator2.hasNext()) {
            void a2;
            void b2;
            void c2;
            Df df2 = iterator.next();
            iterator2 = iterator;
            d2.J.add(df2.J((int)c2, (int)b2, (int)a2));
        }
        return d2;
    }

    public List<Df> J() {
        aE a2;
        return a2.J;
    }

    public void J(Xd xd) {
        aE b2 = xd;
        aE a2 = this;
        a2.I = b2;
    }

    public aE(String string) {
        String b2 = string;
        aE a2 = this;
        aE aE2 = a2;
        a2.J = new ArrayList<Df>();
        a2.j = b2;
    }

    public Xd J() {
        aE a2;
        return a2.I;
    }

    public String J() {
        aE a2;
        return a2.j;
    }

    public void J(String string) {
        String b2 = string;
        aE a2 = this;
        a2.A = b2;
    }
}

