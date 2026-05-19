/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Nj
 *  V
 *  eO
 *  jk
 *  pL
 *  pn
 *  qK
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class qK_3
extends GeneratedMessageLite.Builder<pL, qK>
implements V {
    public qK clearBackground() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.M((pL)((pL)qK_32.instance));
        return a2;
    }

    public qK clearAlign() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.e((pL)((pL)qK_32.instance));
        return a2;
    }

    public int getOverflowValue() {
        qK_3 a2;
        return ((pL)a2.instance).getOverflowValue();
    }

    public List<String> getTextList() {
        qK_3 a2;
        return Collections.unmodifiableList(((pL)a2.instance).getTextList());
    }

    public qK setAlign(jk jk2) {
        qK_3 a2;
        qK_3 b2 = jk2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (jk)b2);
        return a2;
    }

    public boolean hasWordWrap() {
        qK_3 a2;
        return ((pL)a2.instance).hasWordWrap();
    }

    public qK clearLineHeight() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.C((pL)((pL)qK_32.instance));
        return a2;
    }

    public qK setWordWrap(Nj nj2) {
        qK_3 a2;
        qK_3 b2 = nj2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (Nj)b2);
        return a2;
    }

    public qK setOverflow(ZL zL2) {
        qK_3 a2;
        ZL b2 = zL2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (ZL)b2);
        return a2;
    }

    public int getHoverBackground() {
        qK_3 a2;
        return ((pL)a2.instance).getHoverBackground();
    }

    public qK setHoverBackground(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public int getAlignValue() {
        qK_3 a2;
        return ((pL)a2.instance).getAlignValue();
    }

    public boolean hasWidth() {
        qK_3 a2;
        return ((pL)a2.instance).hasWidth();
    }

    public boolean hasLineHeight() {
        qK_3 a2;
        return ((pL)a2.instance).hasLineHeight();
    }

    public qK setAlignValue(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.M((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public boolean hasOverflow() {
        qK_3 a2;
        return ((pL)a2.instance).hasOverflow();
    }

    public qK addTextBytes(ByteString byteString) {
        qK_3 a2;
        ByteString b2 = byteString;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (ByteString)b2);
        return a2;
    }

    public qK addAllText(Iterable<String> iterable) {
        qK_3 a2;
        Iterable<String> b2 = iterable;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (Iterable)b2);
        return a2;
    }

    public qK clearHoverBackground() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance));
        return a2;
    }

    public qK clearWidth() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.i((pL)((pL)qK_32.instance));
        return a2;
    }

    public qK setWidth(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.e((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public boolean hasBackground() {
        qK_3 a2;
        return ((pL)a2.instance).hasBackground();
    }

    public qK clearOverflow() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.f((pL)((pL)qK_32.instance));
        return a2;
    }

    public boolean hasFont() {
        qK_3 a2;
        return ((pL)a2.instance).hasFont();
    }

    public String getWidthExpr() {
        qK_3 a2;
        return ((pL)a2.instance).getWidthExpr();
    }

    public boolean hasShadow() {
        qK_3 a2;
        return ((pL)a2.instance).hasShadow();
    }

    public qK clearShadow() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.k((pL)((pL)qK_32.instance));
        return a2;
    }

    public ByteString getTextBytes(int n2) {
        int b2 = n2;
        qK_3 a2 = this;
        return ((pL)a2.instance).getTextBytes(b2);
    }

    private qK_3() {
        super(pL.f());
        qK_3 a2;
    }

    public boolean hasHoverBackground() {
        qK_3 a2;
        return ((pL)a2.instance).hasHoverBackground();
    }

    public boolean hasLivePrintingDelay() {
        qK_3 a2;
        return ((pL)a2.instance).hasLivePrintingDelay();
    }

    public qK setBackground(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.d((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public qK mergeFont(pn pn2) {
        qK_3 a2;
        qK_3 b2 = pn2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.f((pL)((pL)qK_32.instance), (pn)b2);
        return a2;
    }

    public int getWidth() {
        qK_3 a2;
        return ((pL)a2.instance).getWidth();
    }

    public int getTextCount() {
        qK_3 a2;
        return ((pL)a2.instance).getTextCount();
    }

    public qK setShadow(boolean bl) {
        qK_3 a2;
        boolean b2 = bl;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (boolean)b2);
        return a2;
    }

    public boolean hasWidthExpr() {
        qK_3 a2;
        return ((pL)a2.instance).hasWidthExpr();
    }

    public qK setLivePrintingDelay(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.C((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public qK setWidthExprBytes(ByteString byteString) {
        qK_3 a2;
        ByteString b2 = byteString;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.f((pL)((pL)qK_32.instance), (ByteString)b2);
        return a2;
    }

    public qK clearFont() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.D((pL)((pL)qK_32.instance));
        return a2;
    }

    public jk getAlign() {
        qK_3 a2;
        return ((pL)a2.instance).getAlign();
    }

    public qK clearWidthExpr() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.l((pL)((pL)qK_32.instance));
        return a2;
    }

    public qK setFont(eO eO2) {
        qK_3 a2;
        qK_3 b2 = eO2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (pn)((pn)b2.build()));
        return a2;
    }

    public qK setLineHeight(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.i((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public qK setWidthExpr(String string) {
        qK_3 a2;
        String b2 = string;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.f((pL)((pL)qK_32.instance), (String)b2);
        return a2;
    }

    public qK clearWordWrap() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.A((pL)((pL)qK_32.instance));
        return a2;
    }

    public int getBackground() {
        qK_3 a2;
        return ((pL)a2.instance).getBackground();
    }

    public /* synthetic */ qK_3(AN aN2) {
        qK_3 b2 = aN2;
        qK_3 a2 = this;
        a2();
    }

    public pn getFont() {
        qK_3 a2;
        return ((pL)a2.instance).getFont();
    }

    public boolean hasAlign() {
        qK_3 a2;
        return ((pL)a2.instance).hasAlign();
    }

    public qK clearLivePrintingDelay() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.G((pL)((pL)qK_32.instance));
        return a2;
    }

    public int getLineHeight() {
        qK_3 a2;
        return ((pL)a2.instance).getLineHeight();
    }

    /*
     * WARNING - void declaration
     */
    public qK setText(int n2, String string) {
        void b2;
        qK_3 a2;
        String c2 = string;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (int)b2, (String)c2);
        return a2;
    }

    public String getText(int n2) {
        int b2 = n2;
        qK_3 a2 = this;
        return ((pL)a2.instance).getText(b2);
    }

    public int getWordWrapValue() {
        qK_3 a2;
        return ((pL)a2.instance).getWordWrapValue();
    }

    public int getLivePrintingDelay() {
        qK_3 a2;
        return ((pL)a2.instance).getLivePrintingDelay();
    }

    public boolean getShadow() {
        qK_3 a2;
        return ((pL)a2.instance).getShadow();
    }

    public qK clearText() {
        qK_3 a2;
        qK_3 qK_32 = a2;
        qK_32.copyOnWrite();
        pL.d((pL)((pL)qK_32.instance));
        return a2;
    }

    public qK setOverflowValue(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.l((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public qK addText(String string) {
        qK_3 a2;
        String b2 = string;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (String)b2);
        return a2;
    }

    public qK setWordWrapValue(int n2) {
        qK_3 a2;
        int b2 = n2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.f((pL)((pL)qK_32.instance), (int)b2);
        return a2;
    }

    public ByteString getWidthExprBytes() {
        qK_3 a2;
        return ((pL)a2.instance).getWidthExprBytes();
    }

    public qK setFont(pn pn2) {
        qK_3 a2;
        qK_3 b2 = pn2;
        qK_3 qK_32 = a2 = this;
        qK_32.copyOnWrite();
        pL.J((pL)((pL)qK_32.instance), (pn)b2);
        return a2;
    }

    public ZL getOverflow() {
        qK_3 a2;
        return ((pL)a2.instance).getOverflow();
    }

    public Nj getWordWrap() {
        qK_3 a2;
        return ((pL)a2.instance).getWordWrap();
    }
}

