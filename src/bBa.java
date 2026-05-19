/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zaa
 *  bAa
 *  pua
 *  qAa
 *  vRa
 */
import java.util.Comparator;

public final class bBa
implements Comparator<UB> {
    public final /* synthetic */ bAa I;

    /*
     * WARNING - void declaration
     */
    public int J(UB uB, UB uB2) {
        void b2;
        UB c2 = uB2;
        bBa a2 = this;
        if (b2 instanceof qAa && c2 instanceof Zaa) {
            return vRa.d;
        }
        if (c2 instanceof qAa && b2 instanceof Zaa) {
            return pua.o;
        }
        if (c2.J() < b2.J()) {
            return pua.o;
        }
        if (c2.J() > b2.J()) {
            return vRa.d;
        }
        return uSa.E;
    }

    public bBa(bAa bAa2) {
        bBa b2 = bAa2;
        bBa a2 = this;
        a2.I = b2;
    }
}

