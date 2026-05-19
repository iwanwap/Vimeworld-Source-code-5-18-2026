/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Jo
 *  SN
 *  Tm
 *  Ua
 *  Vm
 *  XM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class Vm_1
extends GeneratedMessageLite.Builder<ko, Vm>
implements Ua {
    public Vm clearDefaultStartAnimationDuration() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.A((ko)vm_1.instance);
        return a2;
    }

    public Vm setCloseOnEsc(boolean bl) {
        Vm_1 a2;
        boolean b2 = bl;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, b2);
        return a2;
    }

    public ByteString getCloseCallback() {
        Vm_1 a2;
        return ((ko)a2.instance).getCloseCallback();
    }

    /*
     * WARNING - void declaration
     */
    public Vm setKeyBindings(int n2, SN sN2) {
        void b2;
        Vm_1 a2;
        Vm_1 c2 = sN2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (int)b2, (SN)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vm setElements(int n2, Jo jo2) {
        void b2;
        Vm_1 a2;
        Vm_1 c2 = jo2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (int)b2, (XM)c2.build());
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vm addElements(int n2, Jo jo2) {
        void b2;
        Vm_1 a2;
        Vm_1 c2 = jo2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, (int)b2, (XM)c2.build());
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vm addElements(int n2, XM xM2) {
        void b2;
        Vm_1 a2;
        Vm_1 c2 = xM2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, (int)b2, (XM)c2);
        return a2;
    }

    public Vm addElements(Jo jo2) {
        Vm_1 a2;
        Vm_1 b2 = jo2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (XM)b2.build());
        return a2;
    }

    public List<XM> getElementsList() {
        Vm_1 a2;
        return Collections.unmodifiableList(((ko)a2.instance).getElementsList());
    }

    public /* synthetic */ Vm_1(AN aN2) {
        Vm_1 b2 = aN2;
        Vm_1 a2 = this;
        a2();
    }

    public Vm setBehavior(xm xm2) {
        Vm_1 a2;
        MessageLiteOrBuilder b2 = xm2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, (xm)b2);
        return a2;
    }

    public Vm setId(String string) {
        Vm_1 a2;
        String b2 = string;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, b2);
        return a2;
    }

    public int getDefaultStartAnimationDuration() {
        Vm_1 a2;
        return ((ko)a2.instance).getDefaultStartAnimationDuration();
    }

    public boolean hasDefaultFinishAnimationDuration() {
        Vm_1 a2;
        return ((ko)a2.instance).hasDefaultFinishAnimationDuration();
    }

    public boolean getCloseOnEsc() {
        Vm_1 a2;
        return ((ko)a2.instance).getCloseOnEsc();
    }

    public Vm removeElements(int n2) {
        Vm_1 a2;
        int b2 = n2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm setDefaultStartAnimationDuration(int n2) {
        Vm_1 a2;
        int b2 = n2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, b2);
        return a2;
    }

    public xm getBehavior() {
        Vm_1 a2;
        return ((ko)a2.instance).getBehavior();
    }

    private Vm_1() {
        super(ko.f());
        Vm_1 a2;
    }

    public Vm setBehavior(Tm tm) {
        Vm_1 a2;
        Vm_1 b2 = tm;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, (xm)b2.build());
        return a2;
    }

    public SN getKeyBindings(int n2) {
        int b2 = n2;
        Vm_1 a2 = this;
        return ((ko)a2.instance).getKeyBindings(b2);
    }

    public List<SN> getKeyBindingsList() {
        Vm_1 a2;
        return Collections.unmodifiableList(((ko)a2.instance).getKeyBindingsList());
    }

    public Vm setCloseOnInventoryKey(boolean bl) {
        Vm_1 a2;
        boolean b2 = bl;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.l((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm addAllKeyBindings(Iterable<? extends SN> iterable) {
        Vm_1 a2;
        Iterable<? extends SN> b2 = iterable;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm mergeBehavior(xm xm2) {
        Vm_1 a2;
        MessageLiteOrBuilder b2 = xm2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (xm)b2);
        return a2;
    }

    public Vm addKeyBindings(zm zm2) {
        Vm_1 a2;
        GeneratedMessageLite.Builder b2 = zm2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (SN)b2.build());
        return a2;
    }

    public XM getElements(int n2) {
        int b2 = n2;
        Vm_1 a2 = this;
        return ((ko)a2.instance).getElements(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Vm addKeyBindings(int n2, zm zm2) {
        void b2;
        Vm_1 a2;
        GeneratedMessageLite.Builder c2 = zm2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, (int)b2, (SN)c2.build());
        return a2;
    }

    public Vm addKeyBindings(SN sN2) {
        Vm_1 a2;
        Vm_1 b2 = sN2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (SN)b2);
        return a2;
    }

    public Vm addElements(XM xM2) {
        Vm_1 a2;
        Vm_1 b2 = xM2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (XM)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vm setElements(int n2, XM xM2) {
        void b2;
        Vm_1 a2;
        Vm_1 c2 = xM2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (int)b2, (XM)c2);
        return a2;
    }

    public boolean hasCloseOnEsc() {
        Vm_1 a2;
        return ((ko)a2.instance).hasCloseOnEsc();
    }

    public Vm setIdBytes(ByteString byteString) {
        Vm_1 a2;
        ByteString b2 = byteString;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm setDefaultFinishAnimationDuration(int n2) {
        Vm_1 a2;
        int b2 = n2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.C((ko)vm_1.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vm setKeyBindings(int n2, zm zm2) {
        void b2;
        Vm_1 a2;
        GeneratedMessageLite.Builder c2 = zm2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, (int)b2, (SN)c2.build());
        return a2;
    }

    public boolean hasCloseOnInventoryKey() {
        Vm_1 a2;
        return ((ko)a2.instance).hasCloseOnInventoryKey();
    }

    public boolean hasBehavior() {
        Vm_1 a2;
        return ((ko)a2.instance).hasBehavior();
    }

    public Vm clearDefaultBackground() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.i((ko)vm_1.instance);
        return a2;
    }

    public boolean hasDefaultBackground() {
        Vm_1 a2;
        return ((ko)a2.instance).hasDefaultBackground();
    }

    public boolean hasCloseCallback() {
        Vm_1 a2;
        return ((ko)a2.instance).hasCloseCallback();
    }

    public Vm addAllElements(Iterable<? extends XM> iterable) {
        Vm_1 a2;
        Iterable<? extends XM> b2 = iterable;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm clearCloseCallback() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.D((ko)vm_1.instance);
        return a2;
    }

    public Vm clearCloseOnEsc() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.d((ko)vm_1.instance);
        return a2;
    }

    public int getElementsCount() {
        Vm_1 a2;
        return ((ko)a2.instance).getElementsCount();
    }

    public Vm setDefaultBackground(boolean bl) {
        Vm_1 a2;
        boolean b2 = bl;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm removeKeyBindings(int n2) {
        Vm_1 a2;
        int b2 = n2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.l((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm clearId() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance);
        return a2;
    }

    public Vm clearKeyBindings() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.J((ko)vm_1.instance);
        return a2;
    }

    public Vm clearBehavior() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.e((ko)vm_1.instance);
        return a2;
    }

    public boolean getDefaultBackground() {
        Vm_1 a2;
        return ((ko)a2.instance).getDefaultBackground();
    }

    public String getId() {
        Vm_1 a2;
        return ((ko)a2.instance).getId();
    }

    public Vm clearElements() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.M((ko)vm_1.instance);
        return a2;
    }

    public ByteString getIdBytes() {
        Vm_1 a2;
        return ((ko)a2.instance).getIdBytes();
    }

    public int getDefaultFinishAnimationDuration() {
        Vm_1 a2;
        return ((ko)a2.instance).getDefaultFinishAnimationDuration();
    }

    public boolean getCloseOnInventoryKey() {
        Vm_1 a2;
        return ((ko)a2.instance).getCloseOnInventoryKey();
    }

    public Vm clearCloseOnInventoryKey() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.l((ko)vm_1.instance);
        return a2;
    }

    public int getKeyBindingsCount() {
        Vm_1 a2;
        return ((ko)a2.instance).getKeyBindingsCount();
    }

    public boolean hasDefaultStartAnimationDuration() {
        Vm_1 a2;
        return ((ko)a2.instance).hasDefaultStartAnimationDuration();
    }

    public Vm setCloseCallback(ByteString byteString) {
        Vm_1 a2;
        ByteString b2 = byteString;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, b2);
        return a2;
    }

    public Vm clearDefaultFinishAnimationDuration() {
        Vm_1 a2;
        Vm_1 vm_1 = a2;
        vm_1.copyOnWrite();
        ko.C((ko)vm_1.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vm addKeyBindings(int n2, SN sN2) {
        void b2;
        Vm_1 a2;
        Vm_1 c2 = sN2;
        Vm_1 vm_1 = a2 = this;
        vm_1.copyOnWrite();
        ko.f((ko)vm_1.instance, (int)b2, (SN)c2);
        return a2;
    }
}

