/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Io
 *  OM
 *  eN
 *  po
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class po_3
extends GeneratedMessageLite.Builder<eN, po>
implements v {
    @Override
    public List<Io> getActionsList() {
        po_3 a2;
        return Collections.unmodifiableList(((eN)a2.instance).getActionsList());
    }

    /*
     * WARNING - void declaration
     */
    public po addActions(int n2, OM oM2) {
        void b2;
        po_3 a2;
        po_3 c2 = oM2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.f((eN)((eN)po_32.instance), (int)b2, (Io)((Io)c2.build()));
        return a2;
    }

    @Override
    public Io getActions(int n2) {
        int b2 = n2;
        po_3 a2 = this;
        return ((eN)a2.instance).getActions(b2);
    }

    @Override
    public int getActionsCount() {
        po_3 a2;
        return ((eN)a2.instance).getActionsCount();
    }

    public po removeActions(int n2) {
        po_3 a2;
        int b2 = n2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ po_3(AN aN2) {
        po_3 b2 = aN2;
        po_3 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public po setActions(int n2, Io io2) {
        void b2;
        po_3 a2;
        po_3 c2 = io2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance), (int)b2, (Io)c2);
        return a2;
    }

    public po addActions(OM oM2) {
        po_3 a2;
        po_3 b2 = oM2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance), (Io)((Io)b2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public po addActions(int n2, Io io2) {
        void b2;
        po_3 a2;
        po_3 c2 = io2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.f((eN)((eN)po_32.instance), (int)b2, (Io)c2);
        return a2;
    }

    public po clearActions() {
        po_3 a2;
        po_3 po_32 = a2;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public po setActions(int n2, OM oM2) {
        void b2;
        po_3 a2;
        po_3 c2 = oM2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance), (int)b2, (Io)((Io)c2.build()));
        return a2;
    }

    public po addActions(Io io2) {
        po_3 a2;
        po_3 b2 = io2;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance), (Io)b2);
        return a2;
    }

    public po addAllActions(Iterable<? extends Io> iterable) {
        po_3 a2;
        Iterable<? extends Io> b2 = iterable;
        po_3 po_32 = a2 = this;
        po_32.copyOnWrite();
        eN.J((eN)((eN)po_32.instance), (Iterable)b2);
        return a2;
    }

    private po_3() {
        super(eN.f());
        po_3 a2;
    }
}

