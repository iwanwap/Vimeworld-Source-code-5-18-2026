/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Sm
 *  nc
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class QN
extends GeneratedMessageLite.Builder<zN, QN>
implements nc {
    public QN setTextColorAnim(int n2) {
        QN a2;
        int b2 = n2;
        QN qN2 = a2 = this;
        qN2.copyOnWrite();
        zN.C((zN)qN2.instance, b2);
        return a2;
    }

    public QN clearTextColor() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.f((zN)qN2.instance);
        return a2;
    }

    private QN() {
        super(zN.J());
        QN a2;
    }

    public QN clearTextColorVal() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.J((zN)qN2.instance);
        return a2;
    }

    public QN setTextBytes(ByteString byteString) {
        QN a2;
        ByteString b2 = byteString;
        QN qN2 = a2 = this;
        qN2.copyOnWrite();
        zN.J((zN)qN2.instance, b2);
        return a2;
    }

    public QN setText(String string) {
        QN a2;
        String b2 = string;
        QN qN2 = a2 = this;
        qN2.copyOnWrite();
        zN.J((zN)qN2.instance, b2);
        return a2;
    }

    public int getTextColorAnim() {
        QN a2;
        return ((zN)a2.instance).getTextColorAnim();
    }

    public wN getHoverColorValCase() {
        QN a2;
        return ((zN)a2.instance).getHoverColorValCase();
    }

    public ByteString getTextBytes() {
        QN a2;
        return ((zN)a2.instance).getTextBytes();
    }

    public QN setHoverColor(int n2) {
        QN a2;
        int b2 = n2;
        QN qN2 = a2 = this;
        qN2.copyOnWrite();
        zN.J((zN)qN2.instance, b2);
        return a2;
    }

    public Sm getTextColorValCase() {
        QN a2;
        return ((zN)a2.instance).getTextColorValCase();
    }

    public boolean hasTextColorAnim() {
        QN a2;
        return ((zN)a2.instance).hasTextColorAnim();
    }

    public String getText() {
        QN a2;
        return ((zN)a2.instance).getText();
    }

    public QN clearTextColorAnim() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.l((zN)qN2.instance);
        return a2;
    }

    public QN clearHoverColorAnim() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.e((zN)qN2.instance);
        return a2;
    }

    public int getHoverColor() {
        QN a2;
        return ((zN)a2.instance).getHoverColor();
    }

    public QN clearText() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.M((zN)qN2.instance);
        return a2;
    }

    public boolean hasText() {
        QN a2;
        return ((zN)a2.instance).hasText();
    }

    public int getHoverColorAnim() {
        QN a2;
        return ((zN)a2.instance).getHoverColorAnim();
    }

    public /* synthetic */ QN(AN aN2) {
        QN b2 = aN2;
        QN a2 = this;
        a2();
    }

    public QN clearHoverColorVal() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.C((zN)qN2.instance);
        return a2;
    }

    public QN clearHoverColor() {
        QN a2;
        QN qN2 = a2;
        qN2.copyOnWrite();
        zN.d((zN)qN2.instance);
        return a2;
    }

    public boolean hasTextColor() {
        QN a2;
        return ((zN)a2.instance).hasTextColor();
    }

    public QN setTextColor(int n2) {
        QN a2;
        int b2 = n2;
        QN qN2 = a2 = this;
        qN2.copyOnWrite();
        zN.f((zN)qN2.instance, b2);
        return a2;
    }

    public QN setHoverColorAnim(int n2) {
        QN a2;
        int b2 = n2;
        QN qN2 = a2 = this;
        qN2.copyOnWrite();
        zN.l((zN)qN2.instance, b2);
        return a2;
    }

    public boolean hasHoverColorAnim() {
        QN a2;
        return ((zN)a2.instance).hasHoverColorAnim();
    }

    public int getTextColor() {
        QN a2;
        return ((zN)a2.instance).getTextColor();
    }

    public boolean hasHoverColor() {
        QN a2;
        return ((zN)a2.instance).hasHoverColor();
    }
}

