/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  rP
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mr {
    private int A;
    private final List<rP> I = new ArrayList<rP>(ERa.C);

    public rP J() {
        mr a2;
        mr mr2 = a2;
        return mr2.I.get(mr2.A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Quaternionfc quaternionfc, float f2, float f3, float f4) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f5 = f4;
        mr a2 = this;
        a2.J().J((Quaternionfc)d2, (float)c2, (float)b2, (float)e2);
    }

    public void C() {
        mr mr2;
        mr mr3 = mr2 = this;
        mr a2 = mr3.J();
        mr3.A += vRa.d;
        if (mr3.A >= mr2.I.size()) {
            mr2.I.add(a2.J());
            return;
        }
        mr mr4 = mr2;
        mr4.I.get(mr4.A).J((rP)a2);
    }

    public mr() {
        mr a2;
        a2.I.add(new rP());
    }

    public void J(Quaternionfc quaternionfc) {
        Quaternionfc b2 = quaternionfc;
        mr a2 = this;
        a2.J().J(b2);
    }

    public void l() {
        mr a2;
        a2.A = uSa.E;
        a2.J();
    }

    public void J(Matrix4fc matrix4fc) {
        Matrix4fc b2 = matrix4fc;
        mr a2 = this;
        a2.J().J(b2);
    }

    public void J(double c2, double b2, double a2) {
        mr d2;
        d2.J((float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        mr a2 = this;
        a2.J().J((float)c2, (float)b2, d2);
    }

    public void f() {
        mr a2;
        if (a2.A == 0) {
            throw new NoSuchElementException();
        }
        a2.A -= vRa.d;
    }

    public void J() {
        mr a2;
        a2.J().J();
    }

    public boolean J() {
        mr a2;
        if (a2.A == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        mr a2 = this;
        a2.J().J((float)c2, (float)b2, d2);
    }
}

