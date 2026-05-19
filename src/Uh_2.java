/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Oi
 *  pqa
 *  xy
 */
import java.util.HashSet;
import java.util.Set;

public final class Uh_2
extends Oi {
    public Uh_2() {
        Uh_2 a2;
    }

    public Set<gh> J(int n2) {
        int b22 = n2;
        Uh_2 a2 = this;
        HashSet<gh> b22 = new HashSet<gh>(a2.J.size() + tTa.h + b22, pqa.r);
        xy xy2 = Kpa.J().c.J().f(GPa.g, GPa.g, GPa.g);
        HashSet<gh> hashSet = b22;
        a2.J(xy2, hashSet);
        hashSet.addAll(a2.J);
        return hashSet;
    }
}

