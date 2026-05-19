/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qoa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qoa_3 {
    private final ResourceLocation j;
    private double J;
    private double A;
    private final boolean I;

    /*
     * WARNING - void declaration
     */
    public qoa_3(ResourceLocation resourceLocation, double d2, double d3, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d4;
        qoa_3 a2;
        boolean bl2 = bl;
        qoa_3 qoa_32 = a2 = this;
        qoa_3 qoa_33 = a2;
        qoa_33.j = d4;
        qoa_33.J = c2;
        qoa_32.A = b2;
        qoa_32.I = e2;
    }

    public void f(double a2) {
        b.J = a2;
    }

    public void J(double a2) {
        b.A = a2;
    }

    public qoa_3(qoa qoa2) {
        qoa_3 a2;
        qoa_3 b2 = qoa2;
        qoa_3 qoa_32 = a2 = this;
        qoa_3 qoa_33 = b2;
        a2.j = b2.j;
        a2.J = qoa_33.J;
        qoa_32.A = qoa_33.A;
        qoa_32.I = b2.I;
    }

    public boolean J() {
        qoa_3 a2;
        return a2.I;
    }

    public double f() {
        qoa_3 a2;
        return a2.J;
    }

    public double J() {
        qoa_3 a2;
        return a2.A;
    }

    public ResourceLocation J() {
        qoa_3 a2;
        return a2.j;
    }
}

