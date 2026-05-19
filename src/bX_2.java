/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IX
 */
import com.google.common.collect.AbstractIterator;

public final class bX_2
extends AbstractIterator<zz> {
    public final /* synthetic */ IX A;
    private zz I;

    public zz J() {
        bX_2 bX_22;
        bX_2 bX_23 = this;
        if (bX_23.I == null) {
            bX_23.I = new zz(bX_23.A.A.getX(), bX_23.A.A.getY(), bX_23.A.A.getZ());
            return bX_23.I;
        }
        bX_2 bX_24 = bX_23;
        if (bX_24.I.equals((Object)bX_24.A.I)) {
            return (zz)((Object)bX_23.endOfData());
        }
        bX_2 bX_25 = bX_23;
        int a2 = bX_25.I.getX();
        int n2 = bX_25.I.getY();
        int n3 = bX_25.I.getZ();
        if (a2 < bX_23.A.I.getX()) {
            bX_22 = bX_23;
            ++a2;
        } else if (n2 < bX_23.A.I.getY()) {
            bX_2 bX_26 = bX_23;
            bX_22 = bX_26;
            ++n2;
            a2 = bX_26.A.A.getX();
        } else {
            if (n3 < bX_23.A.I.getZ()) {
                bX_2 bX_27 = bX_23;
                a2 = bX_27.A.A.getX();
                ++n3;
                n2 = bX_27.A.A.getY();
            }
            bX_22 = bX_23;
        }
        zz.access$002(bX_22.I, a2);
        zz.access$102(bX_23.I, n2);
        zz.access$202(bX_23.I, n3);
        return bX_23.I;
    }

    public bX_2(IX iX2) {
        bX_2 b2 = iX2;
        bX_2 a2 = this;
        a2.A = b2;
        a2.I = null;
    }
}

