/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  NCa
 *  NTa
 *  Waa
 *  jpa
 *  lma
 *  tCa
 *  waa
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xoa_2 {
    private static final Logger J = LogManager.getLogger();
    private final List<lma> A;
    private final Kpa I;

    public void J(int n2) {
        int b2 = n2;
        xoa_2 a2 = this;
        a2.A.remove(b2);
    }

    public lma J(int n2) {
        int b2 = n2;
        xoa_2 a2 = this;
        return a2.A.get(b2);
    }

    public int J() {
        xoa_2 a2;
        return a2.A.size();
    }

    public void f(lma lma2) {
        xoa_2 b2 = lma2;
        xoa_2 a2 = this;
        a2.A.add((lma)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        xoa_2 xoa_22;
        xoa_2 xoa_23 = xoa_22 = this;
        xoa_2 c2 = xoa_23.J((int)b2);
        xoa_23.A.set((int)b2, xoa_22.J((int)a2));
        xoa_22.A.set((int)a2, (lma)c2);
        xoa_22.f();
    }

    public xoa_2(Kpa kpa2) {
        xoa_2 b2 = kpa2;
        xoa_2 a2 = this;
        a2.A = Lists.newArrayList();
        a2.I = b2;
        a2.J();
    }

    public static void J(lma lma2) {
        xoa_2 xoa_22;
        block2: {
            int n2;
            lma lma3 = lma2;
            xoa_2 a2 = new xoa_2(Kpa.J());
            a2.J();
            int n3 = n2 = uSa.E;
            while (n3 < a2.J()) {
                lma lma4 = a2.J(n2);
                if (lma4.serverName.equals(lma3.serverName) && lma4.serverIP.equals(lma3.serverIP)) {
                    Object object = a2;
                    xoa_22 = object;
                    ((xoa_2)object).J(n2, lma3);
                    break block2;
                }
                n3 = ++n2;
            }
            xoa_22 = a2;
        }
        xoa_22.f();
    }

    public void f() {
        Object a2;
        waa waa2;
        xoa_2 xoa_22 = this;
        try {
            waa2 = new waa();
            Object object = a2 = xoa_22.A.iterator();
            while (object.hasNext()) {
                lma lma2 = (lma)a2.next();
                object = a2;
                waa2.J((NCa)lma2.J());
            }
        }
        catch (Exception exception) {
            J.error(Psa.h, (Throwable)exception);
            return;
        }
        a2 = new Waa();
        a2.J(jpa.e, (NCa)waa2);
        tCa.f((Waa)a2, (File)new File(xoa_22.I.p, Jta.N));
    }

    public void J() {
        xoa_2 a22;
        xoa_2 xoa_22;
        block4: {
            xoa_22 = this;
            xoa_22.A.clear();
            a22 = tCa.J((File)new File(xoa_22.I.p, Jta.N));
            if (a22 != null) break block4;
            return;
        }
        try {
            waa waa2 = a22.J(jpa.e, NTa.C);
            int n2 = uSa.E;
            while (n2 < waa2.J()) {
                xoa_22.A.add(lma.J((Waa)waa2.J(n2++)));
            }
        }
        catch (Exception a22) {
            J.error(xTa.p, (Throwable)a22);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, lma lma2) {
        void b2;
        xoa_2 c2 = lma2;
        xoa_2 a2 = this;
        a2.A.set((int)b2, (lma)c2);
    }
}

