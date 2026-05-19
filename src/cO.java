/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Jo
 *  ON
 *  XM
 *  nk
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class cO
extends GeneratedMessageLite.Builder<ON, cO>
implements Ib {
    @Override
    public int getElementsCount() {
        cO a2;
        return ((ON)a2.instance).getElementsCount();
    }

    @Override
    public yl getVisibility() {
        cO a2;
        return ((ON)a2.instance).getVisibility();
    }

    /*
     * WARNING - void declaration
     */
    public cO addElements(int n2, Jo jo) {
        void b2;
        cO a2;
        cO c2 = jo;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (int)b2, (XM)((XM)c2.build()));
        return a2;
    }

    public cO removeElements(int n2) {
        cO a2;
        int b2 = n2;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public cO setElements(int n2, XM xM) {
        void b2;
        cO a2;
        cO c2 = xM;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.f((ON)((ON)cO2.instance), (int)b2, (XM)c2);
        return a2;
    }

    public cO addElements(XM xM) {
        cO a2;
        cO b2 = xM;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (XM)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public cO setElements(int n2, Jo jo) {
        void b2;
        cO a2;
        cO c2 = jo;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.f((ON)((ON)cO2.instance), (int)b2, (XM)((XM)c2.build()));
        return a2;
    }

    @Override
    public XM getElements(int n2) {
        int b2 = n2;
        cO a2 = this;
        return ((ON)a2.instance).getElements(b2);
    }

    public cO addAllElements(Iterable<? extends XM> iterable) {
        cO a2;
        Iterable<? extends XM> b2 = iterable;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (Iterable)b2);
        return a2;
    }

    @Override
    public boolean hasVisibility() {
        cO a2;
        return ((ON)a2.instance).hasVisibility();
    }

    private cO() {
        super(ON.J());
        cO a2;
    }

    public cO clearElements() {
        cO a2;
        cO cO2 = a2;
        cO2.copyOnWrite();
        ON.f((ON)((ON)cO2.instance));
        return a2;
    }

    public /* synthetic */ cO(AN aN) {
        cO b2 = aN;
        cO a2 = this;
        a2();
    }

    public cO addElements(Jo jo) {
        cO a2;
        cO b2 = jo;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (XM)((XM)b2.build()));
        return a2;
    }

    public cO mergeVisibility(yl yl2) {
        cO a2;
        MessageLiteOrBuilder b2 = yl2;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (yl)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public cO addElements(int n2, XM xM) {
        void b2;
        cO a2;
        cO c2 = xM;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance), (int)b2, (XM)c2);
        return a2;
    }

    public cO setVisibility(yl yl2) {
        cO a2;
        MessageLiteOrBuilder b2 = yl2;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.f((ON)((ON)cO2.instance), (yl)b2);
        return a2;
    }

    @Override
    public List<XM> getElementsList() {
        cO a2;
        return Collections.unmodifiableList(((ON)a2.instance).getElementsList());
    }

    public cO clearVisibility() {
        cO a2;
        cO cO2 = a2;
        cO2.copyOnWrite();
        ON.J((ON)((ON)cO2.instance));
        return a2;
    }

    public cO setVisibility(nk nk2) {
        cO a2;
        cO b2 = nk2;
        cO cO2 = a2 = this;
        cO2.copyOnWrite();
        ON.f((ON)((ON)cO2.instance), (yl)((yl)b2.build()));
        return a2;
    }
}

