/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Dn
 *  oO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class oO_3
extends GeneratedMessageLite.Builder<Dn, oO>
implements MB {
    @Override
    public int getHoverColor() {
        oO_3 a2;
        return ((Dn)a2.instance).getHoverColor();
    }

    private oO_3() {
        super(Dn.f());
        oO_3 a2;
    }

    public oO setHoverColor(int n2) {
        oO_3 a2;
        int b2 = n2;
        oO_3 oO_32 = a2 = this;
        oO_32.copyOnWrite();
        Dn.J((Dn)((Dn)oO_32.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ oO_3(AN aN2) {
        oO_3 b2 = aN2;
        oO_3 a2 = this;
        a2();
    }

    @Override
    public String getText() {
        oO_3 a2;
        return ((Dn)a2.instance).getText();
    }

    public oO clearHoverColor() {
        oO_3 a2;
        oO_3 oO_32 = a2;
        oO_32.copyOnWrite();
        Dn.J((Dn)((Dn)oO_32.instance));
        return a2;
    }

    @Override
    public boolean hasTextColor() {
        oO_3 a2;
        return ((Dn)a2.instance).hasTextColor();
    }

    public oO setTextColor(int n2) {
        oO_3 a2;
        int b2 = n2;
        oO_3 oO_32 = a2 = this;
        oO_32.copyOnWrite();
        Dn.f((Dn)((Dn)oO_32.instance), (int)b2);
        return a2;
    }

    public oO setTextBytes(ByteString byteString) {
        oO_3 a2;
        ByteString b2 = byteString;
        oO_3 oO_32 = a2 = this;
        oO_32.copyOnWrite();
        Dn.J((Dn)((Dn)oO_32.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public ByteString getTextBytes() {
        oO_3 a2;
        return ((Dn)a2.instance).getTextBytes();
    }

    @Override
    public int getTextColor() {
        oO_3 a2;
        return ((Dn)a2.instance).getTextColor();
    }

    public oO clearTextColor() {
        oO_3 a2;
        oO_3 oO_32 = a2;
        oO_32.copyOnWrite();
        Dn.f((Dn)((Dn)oO_32.instance));
        return a2;
    }

    @Override
    public boolean hasHoverColor() {
        oO_3 a2;
        return ((Dn)a2.instance).hasHoverColor();
    }

    public oO clearText() {
        oO_3 a2;
        oO_3 oO_32 = a2;
        oO_32.copyOnWrite();
        Dn.l((Dn)((Dn)oO_32.instance));
        return a2;
    }

    public oO setText(String string) {
        oO_3 a2;
        String b2 = string;
        oO_3 oO_32 = a2 = this;
        oO_32.copyOnWrite();
        Dn.J((Dn)((Dn)oO_32.instance), (String)b2);
        return a2;
    }
}

