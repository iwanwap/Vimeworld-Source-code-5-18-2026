/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yfa
 *  vL
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

public final class oea_3 {
    public List<vL> J;
    public Yfa A;
    public List<vL> I;

    public boolean J(vL vL2) {
        oea_3 b2 = vL2;
        oea_3 a2 = this;
        if (a2.I.contains(b2)) {
            return vRa.d != 0;
        }
        if (a2.J.contains(b2)) {
            return uSa.E != 0;
        }
        oea_3 oea_32 = a2;
        oea_32.A.j.H.J(Bra.z);
        boolean bl = oea_32.A.l((vL)b2);
        oea_32.A.j.H.f();
        oea_3 oea_33 = a2;
        if (bl) {
            oea_33.I.add((vL)b2);
            return bl;
        }
        oea_33.J.add((vL)b2);
        return bl;
    }

    public void J() {
        oea_3 a2;
        oea_3 oea_32 = a2;
        oea_32.I.clear();
        oea_32.J.clear();
    }

    public oea_3(Yfa yfa) {
        oea_3 a2;
        oea_3 b2 = yfa;
        oea_3 oea_32 = a2 = this;
        oea_32.I = Lists.newArrayList();
        oea_32.J = Lists.newArrayList();
        oea_32.A = b2;
    }
}

