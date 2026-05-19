/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Fpa
 *  YSa
 *  vRa
 */
import java.util.Properties;
import optifine.Config;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lC_2 {
    private String i;
    private int M;
    private String k;
    private int j;
    private String[] J;
    private String[] A;
    private int[] I;

    public void f() {
        lC_2 a2;
        a2.j = a2.M;
    }

    public int J() {
        lC_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public lC_2(String string, String[] stringArray, String string2, String[] stringArray2, int n2) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        lC_2 a2;
        int n3 = n2;
        lC_2 lC_22 = a2 = this;
        lC_2 lC_23 = a2;
        lC_2 lC_24 = a2;
        lC_2 lC_25 = a2;
        lC_2 lC_26 = a2;
        lC_26.I = null;
        lC_26.M = uSa.E;
        lC_26.i = null;
        lC_25.A = null;
        lC_25.k = null;
        lC_24.J = null;
        lC_24.j = uSa.E;
        lC_24.i = e2;
        lC_23.A = d2;
        lC_23.k = c2;
        lC_22.J = b2;
        lC_22.M = f2;
        if (((void)d2).length != ((void)b2).length) {
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, osa.E).append(((void)d2).length).append(ITa.t).append(((void)b2).length).toString());
        }
        if (f2 >= 0 && f2 < ((void)d2).length) {
            a2.j = f2;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, YSa.z).append((int)f2).toString());
    }

    public String C() {
        lC_2 a2;
        lC_2 lC_22 = a2;
        return lC_22.J[lC_22.j];
    }

    public boolean J(String string) {
        String b2 = string;
        lC_2 a2 = this;
        if (b2 == null) {
            a2.j = a2.M;
            return uSa.E != 0;
        }
        lC_2 lC_22 = a2;
        lC_22.j = ArrayUtils.indexOf(lC_22.A, b2);
        if (lC_22.j >= 0) {
            lC_2 lC_23 = a2;
            if (lC_23.j < lC_23.A.length) {
                return vRa.d != 0;
            }
        }
        a2.j = a2.M;
        return uSa.E != 0;
    }

    public String toString() {
        lC_2 a2;
        return new StringBuilder().insert(5 >> 3, Mqa.y).append(a2.i).append(vTa.S).append(a2.l()).append(Fpa.R).append(Config.J(a2.A)).append(EQa.b).append(a2.j).toString();
    }

    public String l() {
        lC_2 a2;
        lC_2 lC_22 = a2;
        return lC_22.A[lC_22.j];
    }

    public void J(int n2) {
        block3: {
            lC_2 a2;
            block2: {
                int b2 = n2;
                a2 = this;
                a2.j = b2;
                if (a2.j < 0) break block2;
                lC_2 lC_22 = a2;
                if (lC_22.j < lC_22.A.length) break block3;
            }
            a2.j = a2.M;
        }
    }

    public void J(Properties properties) {
        Properties b2 = properties;
        lC_2 a2 = this;
        if (b2 != null) {
            b2.setProperty(a2.f(), a2.l());
        }
    }

    public String f() {
        lC_2 a2;
        return a2.i;
    }

    public void J() {
        block3: {
            block2: {
                lC_2 a2;
                lC_2 lC_22 = a2;
                lC_22.j += vRa.d;
                if (lC_22.j < 0) break block2;
                lC_2 lC_23 = a2;
                if (lC_23.j < lC_23.A.length) break block3;
            }
            a2.j = uSa.E;
        }
    }

    public boolean J(Properties properties) {
        Object b2 = properties;
        lC_2 a2 = this;
        a2.f();
        if (b2 == null) {
            return uSa.E != 0;
        }
        if ((b2 = ((Properties)b2).getProperty(a2.i)) == null) {
            return uSa.E != 0;
        }
        return a2.J((String)b2);
    }

    public String J() {
        lC_2 a2;
        return a2.k;
    }
}

