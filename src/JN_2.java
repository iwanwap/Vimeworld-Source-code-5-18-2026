/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JN
 *  Jo
 *  XM
 *  Za
 *  Zo
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class JN_2
extends GeneratedMessageLite.Builder<rm, JN>
implements Za {
    public JN clearMaskImageResource() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.l((rm)jN_2.instance);
        return a2;
    }

    public boolean hasFixIterateHover() {
        JN_2 a2;
        return ((rm)a2.instance).hasFixIterateHover();
    }

    public JN clearScrollSpeedMultiplier() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.D((rm)jN_2.instance);
        return a2;
    }

    public JN clearScrollbar() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance);
        return a2;
    }

    public JN setScrollbar(Zo zo2) {
        JN_2 a2;
        JN_2 b2 = zo2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, (Zo)b2);
        return a2;
    }

    public /* synthetic */ JN_2(AN aN2) {
        JN_2 b2 = aN2;
        JN_2 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public JN setElements(int n2, Jo jo2) {
        void b2;
        JN_2 a2;
        JN_2 c2 = jo2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.f((rm)jN_2.instance, (int)b2, (XM)c2.build());
        return a2;
    }

    public boolean hasScrollbarBackground() {
        JN_2 a2;
        return ((rm)a2.instance).hasScrollbarBackground();
    }

    public JN clearElements() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.e((rm)jN_2.instance);
        return a2;
    }

    public JN setScrollbarValue(int n2) {
        JN_2 a2;
        int b2 = n2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.f((rm)jN_2.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public JN addElements(int n2, Jo jo2) {
        void b2;
        JN_2 a2;
        JN_2 c2 = jo2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, (int)b2, (XM)c2.build());
        return a2;
    }

    public JN clearFixIterateHover() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.C((rm)jN_2.instance);
        return a2;
    }

    private JN_2() {
        super(rm.f());
        JN_2 a2;
    }

    public JN setMaskImagePathBytes(ByteString byteString) {
        JN_2 a2;
        ByteString b2 = byteString;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, b2);
        return a2;
    }

    public JN addElements(XM xM2) {
        JN_2 a2;
        JN_2 b2 = xM2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.l((rm)jN_2.instance, (XM)b2);
        return a2;
    }

    public int getElementsCount() {
        JN_2 a2;
        return ((rm)a2.instance).getElementsCount();
    }

    public JN clearMaskImage() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.i((rm)jN_2.instance);
        return a2;
    }

    public boolean getOverflow() {
        JN_2 a2;
        return ((rm)a2.instance).getOverflow();
    }

    public ByteString getMaskImagePathBytes() {
        JN_2 a2;
        return ((rm)a2.instance).getMaskImagePathBytes();
    }

    public JN setMaskImageResource(int n2) {
        JN_2 a2;
        int b2 = n2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.C((rm)jN_2.instance, b2);
        return a2;
    }

    public boolean hasMaskImageResource() {
        JN_2 a2;
        return ((rm)a2.instance).hasMaskImageResource();
    }

    public XM getElements(int n2) {
        int b2 = n2;
        JN_2 a2 = this;
        return ((rm)a2.instance).getElements(b2);
    }

    public JN setMaskElement(XM xM2) {
        JN_2 a2;
        JN_2 b2 = xM2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, (XM)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public JN addElements(int n2, XM xM2) {
        void b2;
        JN_2 a2;
        JN_2 c2 = xM2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, (int)b2, (XM)c2);
        return a2;
    }

    public int getMaskImageResource() {
        JN_2 a2;
        return ((rm)a2.instance).getMaskImageResource();
    }

    public JN clearMaskElement() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.M((rm)jN_2.instance);
        return a2;
    }

    public int getScrollbarColor() {
        JN_2 a2;
        return ((rm)a2.instance).getScrollbarColor();
    }

    public JN setScrollSpeedMultiplier(float f2) {
        JN_2 a2;
        float b2 = f2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, b2);
        return a2;
    }

    public JN removeElements(int n2) {
        JN_2 a2;
        int b2 = n2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, b2);
        return a2;
    }

    public String getMaskImagePath() {
        JN_2 a2;
        return ((rm)a2.instance).getMaskImagePath();
    }

    public boolean hasScrollbarColor() {
        JN_2 a2;
        return ((rm)a2.instance).hasScrollbarColor();
    }

    public JN addElements(Jo jo2) {
        JN_2 a2;
        JN_2 b2 = jo2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.l((rm)jN_2.instance, (XM)b2.build());
        return a2;
    }

    public List<XM> getElementsList() {
        JN_2 a2;
        return Collections.unmodifiableList(((rm)a2.instance).getElementsList());
    }

    public JN clearScrollbarBackground() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.d((rm)jN_2.instance);
        return a2;
    }

    public PO getMaskImageCase() {
        JN_2 a2;
        return ((rm)a2.instance).getMaskImageCase();
    }

    /*
     * WARNING - void declaration
     */
    public JN setElements(int n2, XM xM2) {
        void b2;
        JN_2 a2;
        JN_2 c2 = xM2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.f((rm)jN_2.instance, (int)b2, (XM)c2);
        return a2;
    }

    public boolean hasMaskElement() {
        JN_2 a2;
        return ((rm)a2.instance).hasMaskElement();
    }

    public JN clearScrollbarColor() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.f((rm)jN_2.instance);
        return a2;
    }

    public int getScrollbarValue() {
        JN_2 a2;
        return ((rm)a2.instance).getScrollbarValue();
    }

    public boolean hasOverflow() {
        JN_2 a2;
        return ((rm)a2.instance).hasOverflow();
    }

    public float getScrollSpeedMultiplier() {
        JN_2 a2;
        return ((rm)a2.instance).getScrollSpeedMultiplier();
    }

    public JN setFixIterateHover(boolean bl) {
        JN_2 a2;
        boolean b2 = bl;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, b2);
        return a2;
    }

    public boolean hasScrollSpeedMultiplier() {
        JN_2 a2;
        return ((rm)a2.instance).hasScrollSpeedMultiplier();
    }

    public JN setOverflow(boolean bl) {
        JN_2 a2;
        boolean b2 = bl;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.f((rm)jN_2.instance, b2);
        return a2;
    }

    public boolean hasMaskImagePath() {
        JN_2 a2;
        return ((rm)a2.instance).hasMaskImagePath();
    }

    public JN setScrollbarColor(int n2) {
        JN_2 a2;
        int b2 = n2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.d((rm)jN_2.instance, b2);
        return a2;
    }

    public JN clearMaskImagePath() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.A((rm)jN_2.instance);
        return a2;
    }

    public JN setMaskElement(Jo jo2) {
        JN_2 a2;
        JN_2 b2 = jo2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, (XM)b2.build());
        return a2;
    }

    public int getScrollbarBackground() {
        JN_2 a2;
        return ((rm)a2.instance).getScrollbarBackground();
    }

    public JN setMaskImagePath(String string) {
        JN_2 a2;
        String b2 = string;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, b2);
        return a2;
    }

    public Zo getScrollbar() {
        JN_2 a2;
        return ((rm)a2.instance).getScrollbar();
    }

    public JN clearOverflow() {
        JN_2 a2;
        JN_2 jN_2 = a2;
        jN_2.copyOnWrite();
        rm.G((rm)jN_2.instance);
        return a2;
    }

    public XM getMaskElement() {
        JN_2 a2;
        return ((rm)a2.instance).getMaskElement();
    }

    public boolean hasScrollbar() {
        JN_2 a2;
        return ((rm)a2.instance).hasScrollbar();
    }

    public JN setScrollbarBackground(int n2) {
        JN_2 a2;
        int b2 = n2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.l((rm)jN_2.instance, b2);
        return a2;
    }

    public boolean getFixIterateHover() {
        JN_2 a2;
        return ((rm)a2.instance).getFixIterateHover();
    }

    public JN addAllElements(Iterable<? extends XM> iterable) {
        JN_2 a2;
        Iterable<? extends XM> b2 = iterable;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.J((rm)jN_2.instance, b2);
        return a2;
    }

    public JN mergeMaskElement(XM xM2) {
        JN_2 a2;
        JN_2 b2 = xM2;
        JN_2 jN_2 = a2 = this;
        jN_2.copyOnWrite();
        rm.f((rm)jN_2.instance, (XM)b2);
        return a2;
    }
}

