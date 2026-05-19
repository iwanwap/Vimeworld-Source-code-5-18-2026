/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kb
 *  aX
 *  gY
 *  vRa
 *  xz
 */
import com.google.common.collect.Maps;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Laa {
    public final Map<aX, xz> I = Maps.newConcurrentMap();

    public int J(gY gY2) {
        Laa a2 = this;
        Laa b2 = gY2;
        if (a2.f((gY)b2)) {
            return uSa.E;
        }
        int n2 = uSa.E;
        b2 = ((gY)b2).parentAchievement;
        Object object = b2;
        while (object != null && !a2.f((gY)b2)) {
            ++n2;
            b2 = ((gY)b2).parentAchievement;
            object = b2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Sx sx2, aX aX2, int n2) {
        void a2;
        void b2;
        Object d2 = sx2;
        Laa c2 = this;
        d2 = c2.I.get(b2);
        if (d2 == null) {
            d2 = new xz();
            c2.I.put((aX)b2, (xz)d2);
        }
        d2.J((int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, aX aX2, int n2) {
        Laa d2 = aX2;
        Laa b2 = this;
        if (!d2.J() || b2.J((gY)d2)) {
            void a2;
            void c2;
            Laa laa = d2;
            b2.f((Sx)c2, (aX)laa, b2.J((aX)laa) + a2);
        }
    }

    public <T extends Kb> T J(aX aX2) {
        Laa b2 = aX2;
        Laa a2 = this;
        if ((b2 = a2.I.get(b2)) != null) {
            return (T)b2.J();
        }
        return null;
    }

    public Laa() {
        Laa a2;
    }

    public boolean f(gY gY2) {
        Laa a2 = this;
        Laa b2 = gY2;
        if (a2.J((aX)b2) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(gY gY2) {
        Laa b2 = gY2;
        Laa a2 = this;
        if (((gY)b2).parentAchievement == null || a2.f(((gY)b2).parentAchievement)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends Kb> T J(aX aX2, T t2) {
        void a2;
        void b2;
        Laa laa = this;
        Laa c2 = laa.I.get(b2);
        if (c2 == null) {
            c2 = new xz();
            laa.I.put((aX)b2, (xz)c2);
        }
        c2.J((Kb)a2);
        return a2;
    }

    public int J(aX aX2) {
        Laa b2 = aX2;
        Laa a2 = this;
        if ((b2 = a2.I.get(b2)) == null) {
            return uSa.E;
        }
        return b2.J();
    }
}

