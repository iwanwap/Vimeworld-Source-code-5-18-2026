/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  nM
 *  uB
 *  um
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class nM_2
extends GeneratedMessageLite.Builder<um, nM>
implements uB {
    public nM setTextBytes(ByteString byteString) {
        nM_2 a2;
        ByteString b2 = byteString;
        nM_2 nM_22 = a2 = this;
        nM_22.copyOnWrite();
        um.J((um)((um)nM_22.instance), (ByteString)b2);
        return a2;
    }

    private nM_2() {
        super(um.J());
        nM_2 a2;
    }

    public nM clearText() {
        nM_2 a2;
        nM_2 nM_22 = a2;
        nM_22.copyOnWrite();
        um.J((um)((um)nM_22.instance));
        return a2;
    }

    public String getText() {
        nM_2 a2;
        return ((um)a2.instance).getText();
    }

    public /* synthetic */ nM_2(AN aN2) {
        nM_2 b2 = aN2;
        nM_2 a2 = this;
        a2();
    }

    public nM setText(String string) {
        nM_2 a2;
        String b2 = string;
        nM_2 nM_22 = a2 = this;
        nM_22.copyOnWrite();
        um.J((um)((um)nM_22.instance), (String)b2);
        return a2;
    }

    public ByteString getTextBytes() {
        nM_2 a2;
        return ((um)a2.instance).getTextBytes();
    }
}

