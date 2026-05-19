/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  Oz
 *  aAa
 *  kta
 *  pua
 *  vL
 */
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dv_3
extends Ex {
    @Override
    public aAa J(vL vL2) {
        dv_3 b2 = vL2;
        dv_3 a2 = this;
        return a2.J(Oz.f((double)b2.J().J), Oz.f((double)(b2.J().j + kTa.B)), Oz.f((double)b2.J().I));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(aAa[] aAaArray, vL vL2, aAa aAa2, aAa aAa3, float f2) {
        int n2;
        dv_3 dv_32 = this;
        int n3 = uSa.E;
        DZ[] dZArray = DZ.values();
        int n4 = dZArray.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            void a2;
            void b2;
            void c2;
            void d2;
            Object f3 = dZArray[n2];
            if ((f3 = dv_32.J((vL)d2, c2.I + ((DZ)((Object)f3)).getFrontOffsetX(), c2.C + ((DZ)((Object)f3)).getFrontOffsetY(), c2.k + ((DZ)((Object)f3)).getFrontOffsetZ())) != null && !((aAa)f3).A && f3.J((aAa)b2) < a2) {
                e[n3++] = f3;
            }
            n5 = ++n2;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    private int J(vL vL2, int n2, int n3, int n4) {
        void c2;
        void var5_7;
        dv_3 dv_32 = this;
        zz d2 = new zz();
        void v0 = var5_7 = c2;
        while (v0 < c2 + dv_32.k) {
            void b2;
            void v1 = b2;
            while (v1 < b2 + dv_32.J) {
                void var6_8;
                void a2;
                void v2 = a2;
                while (v2 < a2 + dv_32.I) {
                    void e2;
                    if (dv_32.j.J((XF)d2.func_181079_c((int)var5_7, (int)var6_8, (int)e2)).J().J() != Material.water) {
                        return uSa.E;
                    }
                    v2 = ++e2;
                }
                v1 = ++var6_8;
            }
            v0 = ++var5_7;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    private aAa J(vL vL2, int n2, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        dv_3 a2 = this;
        if (a2.J((vL)d2, (int)c2, (int)b2, (int)e2) == pua.o) {
            return a2.J((int)c2, (int)b2, (int)e2);
        }
        return null;
    }

    public dv_3() {
        dv_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public aAa J(vL vL2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        dv_3 e2 = vL2;
        dv_3 d5 = this;
        return d5.J(Oz.f((double)(c2 - (double)(((vL)e2).F / kta.v))), Oz.f((double)(b2 + kTa.B)), Oz.f((double)(a2 - (double)(((vL)e2).F / kta.v))));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, vL vL2) {
        void b2;
        dv_3 c2 = vL2;
        dv_3 a2 = this;
        super.J((I)b2, (vL)c2);
    }

    @Override
    public void J() {
        dv_3 a2;
        super.J();
    }
}

