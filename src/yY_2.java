/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FZ
 */
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;

public final class yY_2
implements Iterable<S> {
    public final /* synthetic */ Class A;
    public final /* synthetic */ FZ I;

    /*
     * WARNING - void declaration
     */
    public yY_2(FZ fZ, Class object) {
        void a2;
        Object b2 = object;
        object = this;
        ((yY_2)object).I = a2;
        ((yY_2)object).A = b2;
        object();
    }

    @Override
    public Iterator<S> iterator() {
        yY_2 yY_22;
        yY_2 yY_23 = yY_22 = this;
        Iterable a2 = (List)FZ.J((FZ)yY_22.I).get(yY_23.I.J(yY_23.A));
        if (a2 == null) {
            return Iterators.emptyIterator();
        }
        return Iterators.filter(a2.iterator(), yY_22.A);
    }
}

