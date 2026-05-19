/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RA
 *  jga
 *  oX
 */
import com.google.common.collect.ComparisonChain;

public final class jga_2
extends oX
implements Comparable<jga> {
    public final RA model;

    public int getCountQuads() {
        int n2;
        jga_2 jga_22 = this;
        int a2 = jga_22.model.J().size();
        DZ[] dZArray = DZ.VALUES;
        int n3 = DZ.VALUES.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            DZ dZ2 = dZArray[n2];
            a2 += jga_22.model.J(dZ2).size();
            n4 = ++n2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public jga_2(RA rA2, int n2) {
        void b2;
        int c2 = n2;
        jga_2 a2 = this;
        super(c2);
        a2.model = b2;
    }

    @Override
    public int compareTo(jga jga2) {
        jga_2 b2 = jga2;
        jga_2 a2 = this;
        return ComparisonChain.start().compare(b2.itemWeight, a2.itemWeight).compare(a2.getCountQuads(), b2.getCountQuads()).result();
    }

    public String toString() {
        jga_2 a2;
        return new StringBuilder().insert(2 & 5, Bta.U).append(a2.itemWeight).append(Ora.m).append(a2.model).append((char)ySa.Z).toString();
    }
}

