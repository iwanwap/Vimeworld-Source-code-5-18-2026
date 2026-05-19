/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lqa
 *  Waa
 *  eAa
 *  fda
 *  uY
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sz_2
extends uY {
    private int A;
    private eAa I;

    public eAa J() {
        Sz_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Sz_2(eAa eAa2, int n2) {
        void b2;
        Sz_2 a2;
        int c2 = n2;
        Sz_2 sz_2 = a2 = this;
        sz_2.I = b2;
        sz_2.A = c2;
    }

    public int J() {
        Sz_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        void a2;
        Sz_2 sz_2 = this;
        super.J((Waa)a2);
        ResourceLocation b2 = (ResourceLocation)eAa.C.f((Object)sz_2.I);
        a2.J(zOa.Ha, b2 == null ? Mqa.y : b2.toString());
        a2.J(Lqa.o, sz_2.A);
    }

    public Sz_2() {
        Sz_2 a2;
    }

    public void f(Waa waa2) {
        Sz_2 sz_2;
        Sz_2 b2 = waa2;
        Sz_2 a2 = this;
        Sz_2 sz_22 = b2;
        super.f((Waa)sz_22);
        if (sz_22.J(zOa.Ha, Yqa.i)) {
            sz_2 = a2;
            a2.I = eAa.l((String)b2.J(zOa.Ha));
        } else {
            sz_2 = a2;
            a2.I = eAa.l((int)b2.J(zOa.Ha));
        }
        sz_2.A = b2.J(Lqa.o);
    }

    public KC J() {
        Sz_2 a2;
        Sz_2 sz_2 = this;
        Sz_2 sz_22 = a2 = new Waa();
        sz_2.J((Waa)sz_22);
        sz_22.J(zOa.Ha);
        sz_22.J(zOa.Ha, eAa.J((eAa)sz_2.I));
        return new fda(sz_2.pos, tTa.h, (Waa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, int n2) {
        void b2;
        Sz_2 a2;
        int c2 = n2;
        Sz_2 sz_2 = a2 = this;
        sz_2.I = b2;
        sz_2.A = c2;
    }
}

