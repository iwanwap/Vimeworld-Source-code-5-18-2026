/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gl
 *  Yaa
 *  Yfa
 *  Zta
 *  aQa
 *  bFa
 *  gFa
 *  uga
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uga_3
extends gFa {
    private Yfa k;
    private Gl j;
    private final Predicate<vL> J;
    private static final Logger A = LogManager.getLogger();
    private final Gga I;

    public uga_3(Yfa yfa2) {
        uga_3 b2 = yfa2;
        uga_3 a2 = this;
        a2.k = b2;
        if (a2.k instanceof bga) {
            A.warn(aQa.Ka);
        }
        a2.J = new eha((uga)a2);
        uga_3 uga_32 = a2;
        a2.I = new Gga((vL)b2);
    }

    public double J() {
        uga_3 uga_32 = this;
        bA a2 = uga_32.k.J(Kha.I);
        if (a2 == null) {
            return Zta.ba;
        }
        return a2.f();
    }

    public boolean l() {
        double d2;
        uga_3 uga_32 = this;
        uga_3 a2 = uga_32.k.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!a2.K()) {
            return uSa.E != 0;
        }
        if (a2 instanceof Sx && ((Sx)((Object)a2)).h.M) {
            return uSa.E != 0;
        }
        Yaa yaa2 = uga_32.k.J();
        Yaa yaa3 = a2.J();
        if (yaa2 != null && yaa3 == yaa2) {
            return uSa.E != 0;
        }
        uga_3 uga_33 = uga_32;
        double d3 = d2 = uga_33.J();
        if (uga_33.k.J((vL)a2) > d3 * d3) {
            return uSa.E != 0;
        }
        if (!(a2 instanceof bFa) || !((bFa)a2).s.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Yfa J(uga a2) {
        return a2.k;
    }

    public boolean f() {
        double d2;
        uga_3 a2;
        uga_3 uga_32 = a2;
        double d3 = d2 = uga_32.J();
        List list = uga_32.k.j.J(Sx.class, a2.k.J().f(d3, FPa.T, d3), a2.J);
        Collections.sort(list, a2.I);
        if (list.isEmpty()) {
            return uSa.E != 0;
        }
        a2.j = (Gl)list.get(uSa.E);
        return vRa.d != 0;
    }

    public void J() {
        uga_3 a2;
        a2.k.C((Gl)null);
        super.l();
    }

    public void l() {
        uga_3 a2;
        uga_3 uga_32 = a2;
        a2.k.C(uga_32.j);
        super.l();
    }
}

