/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qY
 */
import com.google.common.collect.AbstractIterator;

public final class VY_3
extends AbstractIterator<XF> {
    public final /* synthetic */ qY A;
    private XF I;

    public XF J() {
        VY_3 vY_3;
        VY_3 vY_32 = this;
        if (vY_32.I == null) {
            VY_3 vY_33 = vY_32;
            vY_33.I = vY_33.A.A;
            return vY_33.I;
        }
        VY_3 vY_34 = vY_32;
        if (vY_34.I.equals((Object)vY_34.A.I)) {
            return (XF)((Object)vY_32.endOfData());
        }
        VY_3 vY_35 = vY_32;
        int a2 = vY_35.I.getX();
        int n2 = vY_35.I.getY();
        int n3 = vY_35.I.getZ();
        if (a2 < vY_32.A.I.getX()) {
            vY_3 = vY_32;
            ++a2;
        } else if (n2 < vY_32.A.I.getY()) {
            VY_3 vY_36 = vY_32;
            vY_3 = vY_36;
            ++n2;
            a2 = vY_36.A.A.getX();
        } else {
            if (n3 < vY_32.A.I.getZ()) {
                VY_3 vY_37 = vY_32;
                a2 = vY_37.A.A.getX();
                ++n3;
                n2 = vY_37.A.A.getY();
            }
            vY_3 = vY_32;
        }
        vY_3.I = new XF(a2, n2, n3);
        return vY_32.I;
    }

    public VY_3(qY qY2) {
        VY_3 b2 = qY2;
        VY_3 a2 = this;
        a2.A = b2;
        a2.I = null;
    }
}

