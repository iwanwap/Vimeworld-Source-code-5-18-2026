/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  Jy
 *  My
 *  OCa
 *  YLa
 *  lY
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class My_3 {
    private final Ay j;
    private YLa J;
    private List<lY> A;
    private long I;

    /*
     * WARNING - void declaration
     */
    public Jy J(int n2, int n3, Jy jy2) {
        void b2;
        My_3 c2 = this;
        int d22 = n2;
        Jy d22 = c2.J(d22, (int)b2).J(d22, (int)b2);
        if (d22 == null) {
            void a2;
            return a2;
        }
        return d22;
    }

    public static /* synthetic */ Ay J(My a2) {
        return a2.j;
    }

    public My_3(Ay ay2) {
        My_3 a2;
        My_3 b2 = ay2;
        My_3 my_3 = a2 = this;
        My_3 my_32 = a2;
        my_3.J = new YLa();
        my_3.A = Lists.newArrayList();
        my_3.j = b2;
    }

    public void J() {
        My_3 my_3 = this;
        long l2 = OCa.J();
        long l3 = l2 - my_3.I;
        if (l3 > Asa.o || l3 < nqa.i) {
            int n2;
            my_3.I = l2;
            int n3 = n2 = uSa.E;
            while (n3 < my_3.A.size()) {
                My_3 a2 = my_3.A.get(n2);
                l3 = l2 - ((lY)a2).J;
                if (l3 > rpa.t || l3 < nqa.i) {
                    my_3.A.remove(n2);
                    --n2;
                    l3 = (long)((lY)a2).j & vRa.C | ((long)((lY)a2).I & vRa.C) << fPa.i;
                    my_3.J.f(l3);
                }
                n3 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public lY J(int n2, int n3) {
        My_3 my_3 = this;
        long l2 = (long)(b2 >>= AQa.P) & vRa.C | ((long)(a2 >>= AQa.P) & vRa.C) << fPa.i;
        My_3 c2 = (lY)my_3.J.J(l2);
        if (c2 == null) {
            void a2;
            void b2;
            c2 = new lY((My)my_3, (int)b2, (int)a2);
            My_3 my_32 = my_3;
            my_32.J.J(l2, (Object)c2);
            my_32.A.add((lY)c2);
        }
        ((lY)c2).J = OCa.J();
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] J(int n2, int n3) {
        void b2;
        int c2 = n3;
        My_3 a2 = this;
        return a2.J((int)b2, (int)c2).M;
    }
}

