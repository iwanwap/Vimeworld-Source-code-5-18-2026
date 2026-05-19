/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  Mf
 */
import com.google.common.collect.AbstractIterator;

public final class lg
extends AbstractIterator {
    private Cf A;
    public final /* synthetic */ Mf I;

    public Cf J() {
        lg lg2;
        lg lg3 = this;
        if (lg3.A == null) {
            lg3.A = new Cf(lg3.I.I.getX(), lg3.I.I.getY(), lg3.I.I.getZ(), yRa.d);
            return lg3.A;
        }
        lg lg4 = lg3;
        if (lg4.A.equals((Object)lg4.I.A)) {
            return (Cf)lg3.endOfData();
        }
        lg lg5 = lg3;
        int a2 = lg5.A.getX();
        int n2 = lg5.A.getY();
        int n3 = lg5.A.getZ();
        if (a2 < lg3.I.A.getX()) {
            lg2 = lg3;
            ++a2;
        } else if (n2 < lg3.I.A.getY()) {
            lg lg6 = lg3;
            lg2 = lg6;
            ++n2;
            a2 = lg6.I.I.getX();
        } else {
            if (n3 < lg3.I.A.getZ()) {
                lg lg7 = lg3;
                a2 = lg7.I.I.getX();
                ++n3;
                n2 = lg7.I.I.getY();
            }
            lg2 = lg3;
        }
        lg2.A.setXyz(a2, n2, n3);
        return lg3.A;
    }

    public lg(Mf mf) {
        lg b2 = mf;
        lg a2 = this;
        a2.I = b2;
        a2.A = null;
    }

    public Object computeNext() {
        lg a2;
        return a2.J();
    }
}

