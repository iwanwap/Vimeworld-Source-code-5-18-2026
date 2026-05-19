/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EIa
 *  FPa
 *  Gl
 *  Yfa
 *  Zta
 *  aQa
 *  bFa
 *  gFa
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
public final class JGa
extends gFa {
    private Gl M;
    private Class<? extends Gl> k;
    private final Gga j;
    private static final Logger J = LogManager.getLogger();
    private Yfa A;
    private final Predicate<Gl> I;

    public void J() {
        JGa a2;
        a2.A.C((Gl)null);
        super.l();
    }

    public boolean f() {
        JGa a2;
        JGa jGa2 = a2;
        double d2 = jGa2.J();
        JGa jGa3 = a2;
        double d3 = d2;
        List list = jGa2.A.j.J(jGa3.k, jGa3.A.J().f(d3, FPa.T, d3), a2.I);
        Collections.sort(list, a2.j);
        if (list.isEmpty()) {
            return uSa.E != 0;
        }
        a2.M = (Gl)list.get(uSa.E);
        return vRa.d != 0;
    }

    public static /* synthetic */ Yfa J(JGa a2) {
        return a2.A;
    }

    public void l() {
        JGa a2;
        JGa jGa2 = a2;
        a2.A.C(jGa2.M);
        super.l();
    }

    public boolean l() {
        double d2;
        JGa jGa2 = this;
        JGa a2 = jGa2.A.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!a2.K()) {
            return uSa.E != 0;
        }
        JGa jGa3 = jGa2;
        double d3 = d2 = jGa3.J();
        if (jGa3.A.J((vL)a2) > d3 * d3) {
            return uSa.E != 0;
        }
        if (!(a2 instanceof bFa) || !((bFa)a2).s.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public JGa(Yfa yfa, Class<? extends Gl> clazz) {
        void a2;
        JGa b2;
        JGa c2 = yfa;
        JGa jGa2 = b2 = this;
        jGa2.A = c2;
        jGa2.k = a2;
        if (c2 instanceof bga) {
            J.warn(aQa.Ka);
        }
        b2.I = new EIa(b2);
        JGa jGa3 = b2;
        b2.j = new Gga((vL)c2);
    }

    public double J() {
        JGa jGa2 = this;
        bA a2 = jGa2.A.J(Kha.I);
        if (a2 == null) {
            return Zta.ba;
        }
        return a2.f();
    }
}

