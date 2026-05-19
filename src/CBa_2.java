/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ada
 *  NCa
 *  waa
 *  yca
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public final class CBa_2
extends Ada {
    public List<Ada> I;

    public CBa_2(String string) {
        Object b2 = string;
        CBa_2 a2 = this;
        a2.I = Lists.newArrayList();
        a2.I = b2;
    }

    public NCa J() throws yca {
        CBa_2 cBa_2 = this;
        waa waa2 = new waa();
        Iterator<Ada> a2 = cBa_2.I.iterator();
        Object object = a2;
        while (object.hasNext()) {
            Ada ada2 = (Ada)a2.next();
            object = a2;
            waa2.J(ada2.J());
        }
        return waa2;
    }
}

