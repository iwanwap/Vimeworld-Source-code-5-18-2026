/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ea
 *  Pn
 *  dn
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class DN
extends GeneratedMessageLite.Builder<Pn, DN>
implements Ea {
    public dn getKind() {
        DN a2;
        return ((Pn)a2.instance).getKind();
    }

    public DN clearKind() {
        DN a2;
        DN dN2 = a2;
        dN2.copyOnWrite();
        Pn.J((Pn)((Pn)dN2.instance));
        return a2;
    }

    public DN setKind(dn dn2) {
        DN a2;
        DN b2 = dn2;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.J((Pn)((Pn)dN2.instance), (dn)b2);
        return a2;
    }

    public DN setIndex(int n2) {
        DN a2;
        int b2 = n2;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.l((Pn)((Pn)dN2.instance), (int)b2);
        return a2;
    }

    public int getKindValue() {
        DN a2;
        return ((Pn)a2.instance).getKindValue();
    }

    private DN() {
        super(Pn.J());
        DN a2;
    }

    public DN clearIndex() {
        DN a2;
        DN dN2 = a2;
        dN2.copyOnWrite();
        Pn.f((Pn)((Pn)dN2.instance));
        return a2;
    }

    public DN setKindValue(int n2) {
        DN a2;
        int b2 = n2;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.J((Pn)((Pn)dN2.instance), (int)b2);
        return a2;
    }

    public List<Float> getPosList() {
        DN a2;
        return Collections.unmodifiableList(((Pn)a2.instance).getPosList());
    }

    public boolean hasIndex() {
        DN a2;
        return ((Pn)a2.instance).hasIndex();
    }

    public int getColor() {
        DN a2;
        return ((Pn)a2.instance).getColor();
    }

    public DN clearColor() {
        DN a2;
        DN dN2 = a2;
        dN2.copyOnWrite();
        Pn.l((Pn)((Pn)dN2.instance));
        return a2;
    }

    public int getIndex() {
        DN a2;
        return ((Pn)a2.instance).getIndex();
    }

    public /* synthetic */ DN(AN aN2) {
        DN b2 = aN2;
        DN a2 = this;
        a2();
    }

    public DN addPos(float f2) {
        DN a2;
        float b2 = f2;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.J((Pn)((Pn)dN2.instance), (float)b2);
        return a2;
    }

    public DN setColor(int n2) {
        DN a2;
        int b2 = n2;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.f((Pn)((Pn)dN2.instance), (int)b2);
        return a2;
    }

    public int getPosCount() {
        DN a2;
        return ((Pn)a2.instance).getPosCount();
    }

    public float getPos(int n2) {
        int b2 = n2;
        DN a2 = this;
        return ((Pn)a2.instance).getPos(b2);
    }

    /*
     * WARNING - void declaration
     */
    public DN setPos(int n2, float f2) {
        void b2;
        DN a2;
        float c2 = f2;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.J((Pn)((Pn)dN2.instance), (int)b2, (float)c2);
        return a2;
    }

    public DN addAllPos(Iterable<? extends Float> iterable) {
        DN a2;
        Iterable<? extends Float> b2 = iterable;
        DN dN2 = a2 = this;
        dN2.copyOnWrite();
        Pn.J((Pn)((Pn)dN2.instance), (Iterable)b2);
        return a2;
    }

    public DN clearPos() {
        DN a2;
        DN dN2 = a2;
        dN2.copyOnWrite();
        Pn.C((Pn)((Pn)dN2.instance));
        return a2;
    }

    public boolean hasColor() {
        DN a2;
        return ((Pn)a2.instance).hasColor();
    }
}

