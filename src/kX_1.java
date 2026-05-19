/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  I
 *  OA
 *  Uqa
 *  gX
 *  pua
 *  vRa
 */
import java.util.Iterator;

public final class kX_1 {
    private static final OA J;
    private static final OA A;
    private static final OA I;

    public static int l(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        return kX_1.J(a2, (XF)((Object)b2), A);
    }

    /*
     * WARNING - void declaration
     */
    private static int J(I i2, XF xF2, OA oA2) {
        Iterator<zz> b2;
        I i3 = i2;
        int n2 = uSa.E;
        int n3 = uSa.E;
        int n4 = uSa.E;
        Iterator<zz> iterator = b2 = XF.getAllInBoxMutable(((XF)((Object)b2)).add(pua.o, uSa.E, pua.o), ((XF)((Object)b2)).add(vRa.d, uSa.E, vRa.d)).iterator();
        while (iterator.hasNext()) {
            void a2;
            Object c22 = b2.next();
            iterator = b2;
            int c22 = a2.J(i3.J((XF)((Object)c22)), (XF)((Object)c22));
            n2 += (c22 & Zqa.E) >> ERa.C;
            n3 += (c22 & Uqa.Q) >> Yqa.i;
            n4 += c22 & osa.Ja;
        }
        return (n2 / WOa.fa & osa.Ja) << ERa.C | (n3 / WOa.fa & osa.Ja) << Yqa.i | n4 / WOa.fa & osa.Ja;
    }

    public static int f(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        return kX_1.J(a2, (XF)((Object)b2), J);
    }

    public static int J(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        return kX_1.J(a2, (XF)((Object)b2), I);
    }

    static {
        I = new gX();
        A = new tz();
        J = new eaa();
    }

    public kX_1() {
        kX_1 a2;
    }
}

