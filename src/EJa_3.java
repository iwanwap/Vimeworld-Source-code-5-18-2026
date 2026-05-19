/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cla
 *  ez
 *  uKa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

public abstract class EJa_3 {
    private double k;
    private double j;
    private double J;
    public boolean A;
    public List<Cla> I = Lists.newArrayListWithCapacity(Hra.e);

    public EJa_3() {
        EJa_3 a2;
    }

    public void J(double c2, double b2, double a2) {
        EJa_3 d2;
        EJa_3 eJa_3 = d2;
        d2.A = vRa.d;
        d2.I.clear();
        d2.J = c2;
        eJa_3.j = b2;
        eJa_3.k = a2;
    }

    public abstract void J(ez var1);

    public void J(Cla cla2) {
        Object b2 = cla2;
        EJa_3 a2 = this;
        b2 = b2.J();
        uKa.J((float)((float)((double)b2.getX() - a2.J)), (float)((float)((double)b2.getY() - a2.j)), (float)((float)((double)b2.getZ() - a2.k)));
    }

    public void J(Cla cla2, ez ez2) {
        EJa_3 c2 = cla2;
        EJa_3 b2 = this;
        b2.I.add((Cla)c2);
    }
}

