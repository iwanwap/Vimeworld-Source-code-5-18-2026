/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  In
 *  Jo
 *  XM
 *  wA
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class In_1
extends GeneratedMessageLite.Builder<in, In>
implements wA {
    /*
     * WARNING - void declaration
     */
    public In setElement(int n2, Jo jo2) {
        void b2;
        In_1 a2;
        In_1 c2 = jo2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.f((in)in_1.instance, (int)b2, (XM)c2.build());
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public In addElement(int n2, XM xM2) {
        void b2;
        In_1 a2;
        In_1 c2 = xM2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.J((in)in_1.instance, (int)b2, (XM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public In addElement(int n2, Jo jo2) {
        void b2;
        In_1 a2;
        In_1 c2 = jo2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.J((in)in_1.instance, (int)b2, (XM)c2.build());
        return a2;
    }

    public XM getElement(int n2) {
        int b2 = n2;
        In_1 a2 = this;
        return ((in)a2.instance).getElement(b2);
    }

    public /* synthetic */ In_1(AN aN2) {
        In_1 b2 = aN2;
        In_1 a2 = this;
        a2();
    }

    public List<XM> getElementList() {
        In_1 a2;
        return Collections.unmodifiableList(((in)a2.instance).getElementList());
    }

    public In addElement(XM xM2) {
        In_1 a2;
        In_1 b2 = xM2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.J((in)in_1.instance, (XM)b2);
        return a2;
    }

    public In addAllElement(Iterable<? extends XM> iterable) {
        In_1 a2;
        Iterable<? extends XM> b2 = iterable;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.J((in)in_1.instance, b2);
        return a2;
    }

    private In_1() {
        super(in.f());
        In_1 a2;
    }

    public In clearElement() {
        In_1 a2;
        In_1 in_1 = a2;
        in_1.copyOnWrite();
        in.J((in)in_1.instance);
        return a2;
    }

    public In removeElement(int n2) {
        In_1 a2;
        int b2 = n2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.J((in)in_1.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public In setElement(int n2, XM xM2) {
        void b2;
        In_1 a2;
        In_1 c2 = xM2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.f((in)in_1.instance, (int)b2, (XM)c2);
        return a2;
    }

    public In addElement(Jo jo2) {
        In_1 a2;
        In_1 b2 = jo2;
        In_1 in_1 = a2 = this;
        in_1.copyOnWrite();
        in.J((in)in_1.instance, (XM)b2.build());
        return a2;
    }

    public int getElementCount() {
        In_1 a2;
        return ((in)a2.instance).getElementCount();
    }
}

