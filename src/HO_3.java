/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  HO
 *  Lb
 *  NO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class HO_3
extends GeneratedMessageLite.Builder<NO, HO>
implements Lb {
    public ByteString getUrlBytes() {
        HO_3 a2;
        return ((NO)a2.instance).getUrlBytes();
    }

    public HO clearUrl() {
        HO_3 a2;
        HO_3 hO_3 = a2;
        hO_3.copyOnWrite();
        NO.J((NO)((NO)hO_3.instance));
        return a2;
    }

    public /* synthetic */ HO_3(AN aN2) {
        HO_3 b2 = aN2;
        HO_3 a2 = this;
        a2();
    }

    public HO setUrlBytes(ByteString byteString) {
        HO_3 a2;
        ByteString b2 = byteString;
        HO_3 hO_3 = a2 = this;
        hO_3.copyOnWrite();
        NO.J((NO)((NO)hO_3.instance), (ByteString)b2);
        return a2;
    }

    private HO_3() {
        super(NO.f());
        HO_3 a2;
    }

    public String getUrl() {
        HO_3 a2;
        return ((NO)a2.instance).getUrl();
    }

    public HO setUrl(String string) {
        HO_3 a2;
        String b2 = string;
        HO_3 hO_3 = a2 = this;
        hO_3.copyOnWrite();
        NO.J((NO)((NO)hO_3.instance), (String)b2);
        return a2;
    }
}

