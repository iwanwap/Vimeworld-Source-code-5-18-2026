/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  VJ
 *  uj
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class VJ_3
extends GeneratedMessageLite.Builder<uj, VJ>
implements Q {
    @Override
    public int getBackground() {
        VJ_3 a2;
        return ((uj)a2.instance).getBackground();
    }

    public VJ setWidthExprBytes(ByteString byteString) {
        VJ_3 a2;
        ByteString b2 = byteString;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance), (ByteString)b2);
        return a2;
    }

    public VJ clearText() {
        VJ_3 a2;
        VJ_3 vJ_3 = a2;
        vJ_3.copyOnWrite();
        uj.e((uj)((uj)vJ_3.instance));
        return a2;
    }

    @Override
    public String getText(int n2) {
        int b2 = n2;
        VJ_3 a2 = this;
        return ((uj)a2.instance).getText(b2);
    }

    public VJ clearWidthExpr() {
        VJ_3 a2;
        VJ_3 vJ_3 = a2;
        vJ_3.copyOnWrite();
        uj.l((uj)((uj)vJ_3.instance));
        return a2;
    }

    @Override
    public String getWidthExpr() {
        VJ_3 a2;
        return ((uj)a2.instance).getWidthExpr();
    }

    public VJ addAllText(Iterable<String> iterable) {
        VJ_3 a2;
        Iterable<String> b2 = iterable;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance), (Iterable)b2);
        return a2;
    }

    @Override
    public int getWidth() {
        VJ_3 a2;
        return ((uj)a2.instance).getWidth();
    }

    public VJ clearHoverBackground() {
        VJ_3 a2;
        VJ_3 vJ_3 = a2;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance));
        return a2;
    }

    public VJ setWidth(int n2) {
        VJ_3 a2;
        int b2 = n2;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.l((uj)((uj)vJ_3.instance), (int)b2);
        return a2;
    }

    public VJ setWidthExpr(String string) {
        VJ_3 a2;
        String b2 = string;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.f((uj)((uj)vJ_3.instance), (String)b2);
        return a2;
    }

    public VJ clearShadow() {
        VJ_3 a2;
        VJ_3 vJ_3 = a2;
        vJ_3.copyOnWrite();
        uj.d((uj)((uj)vJ_3.instance));
        return a2;
    }

    @Override
    public int getHoverBackground() {
        VJ_3 a2;
        return ((uj)a2.instance).getHoverBackground();
    }

    @Override
    public ByteString getTextBytes(int n2) {
        int b2 = n2;
        VJ_3 a2 = this;
        return ((uj)a2.instance).getTextBytes(b2);
    }

    public VJ addTextBytes(ByteString byteString) {
        VJ_3 a2;
        ByteString b2 = byteString;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.f((uj)((uj)vJ_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public List<String> getTextList() {
        VJ_3 a2;
        return Collections.unmodifiableList(((uj)a2.instance).getTextList());
    }

    public VJ clearBackground() {
        VJ_3 a2;
        VJ_3 vJ_3 = a2;
        vJ_3.copyOnWrite();
        uj.C((uj)((uj)vJ_3.instance));
        return a2;
    }

    public /* synthetic */ VJ_3(AN aN2) {
        VJ_3 b2 = aN2;
        VJ_3 a2 = this;
        a2();
    }

    @Override
    public boolean hasWidth() {
        VJ_3 a2;
        return ((uj)a2.instance).hasWidth();
    }

    /*
     * WARNING - void declaration
     */
    public VJ setText(int n2, String string) {
        void b2;
        VJ_3 a2;
        String c2 = string;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance), (int)b2, (String)c2);
        return a2;
    }

    @Override
    public int getTextCount() {
        VJ_3 a2;
        return ((uj)a2.instance).getTextCount();
    }

    public VJ clearWidth() {
        VJ_3 a2;
        VJ_3 vJ_3 = a2;
        vJ_3.copyOnWrite();
        uj.f((uj)((uj)vJ_3.instance));
        return a2;
    }

    @Override
    public boolean hasBackground() {
        VJ_3 a2;
        return ((uj)a2.instance).hasBackground();
    }

    public VJ setShadow(boolean bl2) {
        VJ_3 a2;
        boolean b2 = bl2;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean hasWidthExpr() {
        VJ_3 a2;
        return ((uj)a2.instance).hasWidthExpr();
    }

    private VJ_3() {
        super(uj.J());
        VJ_3 a2;
    }

    @Override
    public ByteString getWidthExprBytes() {
        VJ_3 a2;
        return ((uj)a2.instance).getWidthExprBytes();
    }

    @Override
    public boolean hasShadow() {
        VJ_3 a2;
        return ((uj)a2.instance).hasShadow();
    }

    public VJ setBackground(int n2) {
        VJ_3 a2;
        int b2 = n2;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance), (int)b2);
        return a2;
    }

    public VJ addText(String string) {
        VJ_3 a2;
        String b2 = string;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.J((uj)((uj)vJ_3.instance), (String)b2);
        return a2;
    }

    @Override
    public boolean getShadow() {
        VJ_3 a2;
        return ((uj)a2.instance).getShadow();
    }

    public VJ setHoverBackground(int n2) {
        VJ_3 a2;
        int b2 = n2;
        VJ_3 vJ_3 = a2 = this;
        vJ_3.copyOnWrite();
        uj.f((uj)((uj)vJ_3.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasHoverBackground() {
        VJ_3 a2;
        return ((uj)a2.instance).hasHoverBackground();
    }
}

