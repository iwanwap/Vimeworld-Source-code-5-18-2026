/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ada
 *  NCa
 *  Waa
 *  yca
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public final class uAa
extends Ada {
    public List<Ada> I;

    public uAa(String string) {
        Object b2 = string;
        uAa a2 = this;
        a2.I = Lists.newArrayList();
        a2.I = b2;
    }

    public NCa J() throws yca {
        Iterator<Ada> iterator;
        uAa uAa2 = this;
        Waa waa2 = new Waa();
        Iterator<Ada> iterator2 = iterator = uAa2.I.iterator();
        while (iterator2.hasNext()) {
            uAa a2 = iterator.next();
            iterator2 = iterator;
            waa2.J(((Ada)a2).I, a2.J());
        }
        return waa2;
    }
}

