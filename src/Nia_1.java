/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Nia
 *  SOa
 *  Waa
 *  YDa
 *  Yfa
 *  vL
 *  vRa
 *  xy
 *  yra
 */
import net.minecraft.block.BlockFence;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Nia_1
extends YDa {
    public float l() {
        return Mqa.b;
    }

    public boolean J(Waa waa2) {
        Nia_1 b2 = waa2;
        Nia_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Sx sx2) {
        double d2;
        void a2;
        Nia_1 nia_1 = this;
        Mda mda2 = a2.J();
        int n2 = uSa.E;
        if (mda2 != null && mda2.J() == Gea.i && !nia_1.j.e) {
            d2 = hpa.y;
            for (Yfa yfa : nia_1.j.J(Yfa.class, new xy(nia_1.la - d2, nia_1.Z - d2, nia_1.A - d2, nia_1.la + d2, nia_1.Z + d2, nia_1.A + d2))) {
                if (!yfa.S() || yfa.l() != a2) continue;
                yfa.J((vL)nia_1, vRa.d != 0);
                n2 = vRa.d;
            }
        }
        if (!nia_1.j.e && n2 == 0) {
            nia_1.k();
            if (a2.h.f()) {
                d2 = hpa.y;
                for (Yfa yfa : nia_1.j.J(Yfa.class, new xy(nia_1.la - d2, nia_1.Z - d2, nia_1.A - d2, nia_1.la + d2, nia_1.Z + d2, nia_1.A + d2))) {
                    if (!yfa.S() || yfa.l() != nia_1) continue;
                    yfa.J(vRa.d != 0, uSa.E != 0);
                }
            }
        }
        return vRa.d != 0;
    }

    public void J(Waa object) {
        Nia_1 b2 = object;
        object = this;
    }

    public void f(Waa object) {
        Nia_1 b2 = object;
        object = this;
    }

    public int f() {
        return WOa.fa;
    }

    /*
     * WARNING - void declaration
     */
    public Nia_1(Gg gg2, XF xF) {
        void b2;
        Nia_1 a2;
        Object c2 = xF;
        Nia_1 nia_1 = a2 = this;
        super((Gg)b2, (XF)((Object)c2));
        nia_1.l((double)c2.getX() + kTa.B, (double)c2.getY() + kTa.B, (double)c2.getZ() + kTa.B);
        Nia_1 nia_12 = a2;
        nia_1.J(new xy(a2.la - SOa.J, a2.Z - VPa.W + fqa.ca, a2.A - SOa.J, a2.la + SOa.J, a2.Z + VPa.W + fqa.ca, a2.A + SOa.J));
    }

    public static Nia f(Gg gg2, XF xF) {
        Object b2 = xF;
        Gg a2 = gg2;
        Object object = b2 = new Nia_1(a2, (XF)((Object)b2));
        object.k = vRa.d;
        a2.f((vL)object);
        return object;
    }

    public void J(DZ object) {
        Object b2 = object;
        object = this;
    }

    public int J() {
        return WOa.fa;
    }

    public boolean J(double a2) {
        if (a2 < yra.Y) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Nia_1(Gg gg2) {
        Nia_1 b2 = gg2;
        Nia_1 a2 = this;
        super((Gg)b2);
    }

    public boolean l() {
        Nia_1 a2;
        Nia_1 nia_1 = a2;
        return nia_1.j.J(nia_1.J).J() instanceof BlockFence;
    }

    public void J() {
        Nia_1 a2;
        super.J();
    }

    public void e(vL object) {
        Nia_1 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public static Nia J(Gg gg2, XF xF) {
        void a2;
        Gg gg3 = gg2;
        void v0 = a2;
        int b2 = v0.getX();
        int n2 = v0.getY();
        int n3 = v0.getZ();
        for (Nia_1 nia_1 : gg3.J(Nia_1.class, new xy((double)b2 - oua.i, (double)n2 - oua.i, (double)n3 - oua.i, (double)b2 + oua.i, (double)n2 + oua.i, (double)n3 + oua.i))) {
            if (!nia_1.f().equals(a2)) continue;
            return nia_1;
        }
        return null;
    }
}

