/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oi
 */
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

public final class hh_1
extends Oi {
    public Set<gh> I;

    public void l(gh gh2) {
        gh b2 = gh2;
        hh_1 a2 = this;
        gh gh3 = b2;
        super.l(gh3);
        if (gh3.C()) {
            a2.I.add(b2);
            return;
        }
        a2.I.remove(b2);
    }

    public void f(gh gh2) {
        gh b2 = gh2;
        hh_1 a2 = this;
        gh gh3 = b2;
        super.f(gh3);
        if (gh3.C()) {
            a2.I.add(b2);
        }
    }

    public void J(gh gh2) {
        gh b2 = gh2;
        hh_1 a2 = this;
        gh gh3 = b2;
        super.J(gh3);
        if (gh3.C()) {
            a2.I.remove(b2);
        }
    }

    public hh_1() {
        hh_1 a2;
        hh_1 hh_12 = a2;
        hh_12.I = Collections.newSetFromMap(new LinkedHashMap());
    }

    public void f() {
        hh_1 a2;
        hh_1 hh_12 = a2;
        super.f();
        hh_12.I.clear();
    }
}

