/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  gFa
 *  gda
 *  vGa
 *  vRa
 *  xga
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class xga_1 {
    private final gda M;
    private List<vGa> k;
    private int j;
    private int J;
    private static final Logger A = LogManager.getLogger();
    private List<vGa> I;

    /*
     * WARNING - void declaration
     */
    public void J(gFa gFa2) {
        xga_1 xga_12 = this;
        Iterator<vGa> b2 = xga_12.I.iterator();
        while (b2.hasNext()) {
            void a2;
            vGa vGa2 = (vGa)b2.next();
            gFa gFa3 = vGa2.A;
            if (gFa3 != a2) continue;
            if (xga_12.k.contains(vGa2)) {
                gFa3.J();
                xga_12.k.remove(vGa2);
            }
            b2.remove();
        }
    }

    public void J() {
        Iterator<vGa> iterator;
        xga_1 xga_12;
        xga_1 xga_13 = xga_12 = this;
        xga_13.M.J(Bpa.L);
        int n2 = xga_13.j;
        xga_13.j = n2 + vRa.d;
        if (n2 % xga_12.J == 0) {
            for (vGa a22 : xga_12.I) {
                xga_1 xga_14;
                if (!xga_12.k.contains(a22)) {
                    xga_14 = xga_12;
                } else {
                    if (xga_12.f(a22) && xga_12.J(a22)) continue;
                    a22.A.J();
                    xga_1 xga_15 = xga_12;
                    xga_14 = xga_15;
                    xga_15.k.remove(a22);
                }
                if (!xga_14.f(a22) || !a22.A.f()) continue;
                a22.A.l();
                xga_12.k.add(a22);
            }
        } else {
            iterator = xga_12.k.iterator();
            while (iterator.hasNext()) {
                vGa a22 = iterator.next();
                if (xga_12.J(a22)) continue;
                a22.A.J();
                iterator.remove();
            }
        }
        xga_1 xga_16 = xga_12;
        xga_16.M.f();
        xga_16.M.J(vsa.y);
        iterator = xga_16.k.iterator();
        Iterator<vGa> iterator2 = iterator;
        while (iterator2.hasNext()) {
            vGa a22 = iterator.next();
            iterator2 = iterator;
            a22.A.f();
        }
        xga_12.M.f();
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(vGa vGa2) {
        xga_1 xga_12 = this;
        for (vGa b2 : xga_12.I) {
            void a2;
            if (b2 == a2 || !(a2.J >= b2.J ? !xga_12.J((vGa)a2, b2) && xga_12.k.contains(b2) : !b2.A.J() && xga_12.k.contains(b2))) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private boolean J(vGa vGa2) {
        xga_1 b2 = vGa2;
        xga_1 a2 = this;
        return ((vGa)b2).A.l();
    }

    public xga_1(gda gda2) {
        xga_1 a2;
        xga_1 b2 = gda2;
        xga_1 xga_12 = a2 = this;
        a2.I = Lists.newArrayList();
        xga_12.k = Lists.newArrayList();
        xga_12.J = yRa.d;
        xga_12.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(vGa vGa2, vGa vGa3) {
        void b2;
        xga_1 c2 = vGa3;
        xga_1 a2 = this;
        if ((b2.A.J() & ((vGa)c2).A.J()) == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, gFa gFa2) {
        void b2;
        xga_1 c2 = gFa2;
        xga_1 a2 = this;
        a2.I.add(new vGa((xga)a2, (int)b2, (gFa)c2));
    }
}

