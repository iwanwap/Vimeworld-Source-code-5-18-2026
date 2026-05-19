/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  VY
 *  qY
 */
import java.util.Iterator;

public final class qY_1
implements Iterable<XF> {
    public final /* synthetic */ XF A;
    public final /* synthetic */ XF I;

    public qY_1(XF xF, XF object) {
        Object a2 = object;
        object = this;
        ((qY_1)object).A = xF;
        ((qY_1)object).I = a2;
    }

    @Override
    public Iterator<XF> iterator() {
        qY_1 a2;
        return new VY((qY)a2);
    }
}

