/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  LGa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class JFa_3
implements Predicate<vL> {
    public JFa_3() {
        JFa_3 a2;
    }

    public boolean J(vL vL2) {
        JFa_3 b2 = vL2;
        JFa_3 a2 = this;
        if (b2 instanceof Gl && ((Gl)b2).J() != LGa.UNDEAD) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

