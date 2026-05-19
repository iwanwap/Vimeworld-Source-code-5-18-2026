/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Az
 *  DFa
 *  Ifa
 *  RC
 *  Sda
 *  lea
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Aga_1
extends Ifa {
    private final Set<bA> J = Sets.newHashSet();
    public final Map<String, bA> A;

    public bA J(RC rC) {
        Aga_1 b2 = rC;
        Aga_1 a2 = this;
        bA bA2 = super.J((RC)b2);
        if (b2 instanceof Sda && ((Sda)b2).f() != null) {
            a2.A.put(((Sda)b2).f(), bA2);
        }
        return bA2;
    }

    public Set<bA> J() {
        Aga_1 a2;
        return a2.J;
    }

    public lea J(RC rC) {
        Aga_1 b2 = rC;
        Aga_1 a2 = this;
        return (lea)super.f((RC)b2);
    }

    public Collection<bA> f() {
        Aga_1 aga_1 = this;
        HashSet<bA> hashSet = Sets.newHashSet();
        for (bA bA2 : aga_1.J()) {
            if (!bA2.J().J()) continue;
            hashSet.add(bA2);
        }
        return hashSet;
    }

    public bA l(RC rC) {
        Aga_1 b2 = rC;
        Aga_1 a2 = this;
        if (((Object)((Object)b2)).equals(Kha.j)) {
            return new DFa((Ifa)a2, (RC)b2);
        }
        return new lea((Ifa)a2, (RC)b2);
    }

    /*
     * WARNING - void declaration
     */
    public lea J(String string) {
        void a2;
        Aga_1 aga_1 = this;
        Object b2 = super.J((String)a2);
        if (b2 == null) {
            b2 = aga_1.A.get(a2);
        }
        return (lea)b2;
    }

    public void J(bA bA2) {
        bA b2 = bA2;
        Aga_1 a2 = this;
        if (b2.J().J()) {
            a2.J.add(b2);
        }
        for (RC rC : a2.A.get((String)b2.J())) {
            if ((rC = a2.J(rC)) == null) continue;
            rC.f();
        }
    }

    public Aga_1() {
        Aga_1 a2;
        Aga_1 aga_1 = a2;
        aga_1.A = new Az();
    }
}

