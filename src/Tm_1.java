/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Tb
 *  Tm
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Tm_1
extends GeneratedMessageLite.Builder<xm, Tm>
implements Tb {
    public ByteString getData() {
        Tm_1 a2;
        return ((xm)a2.instance).getData();
    }

    public boolean hasData() {
        Tm_1 a2;
        return ((xm)a2.instance).hasData();
    }

    public Tm setKind(String string) {
        Tm_1 a2;
        String b2 = string;
        Tm_1 tm_1 = a2 = this;
        tm_1.copyOnWrite();
        xm.J((xm)tm_1.instance, b2);
        return a2;
    }

    public Tm setKindBytes(ByteString byteString) {
        Tm_1 a2;
        ByteString b2 = byteString;
        Tm_1 tm_1 = a2 = this;
        tm_1.copyOnWrite();
        xm.f((xm)tm_1.instance, b2);
        return a2;
    }

    private Tm_1() {
        super(xm.J());
        Tm_1 a2;
    }

    public Tm setData(ByteString byteString) {
        Tm_1 a2;
        ByteString b2 = byteString;
        Tm_1 tm_1 = a2 = this;
        tm_1.copyOnWrite();
        xm.J((xm)tm_1.instance, b2);
        return a2;
    }

    public Tm clearKind() {
        Tm_1 a2;
        Tm_1 tm_1 = a2;
        tm_1.copyOnWrite();
        xm.f((xm)tm_1.instance);
        return a2;
    }

    public Tm clearData() {
        Tm_1 a2;
        Tm_1 tm_1 = a2;
        tm_1.copyOnWrite();
        xm.J((xm)tm_1.instance);
        return a2;
    }

    public /* synthetic */ Tm_1(AN aN2) {
        Tm_1 b2 = aN2;
        Tm_1 a2 = this;
        a2();
    }

    public ByteString getKindBytes() {
        Tm_1 a2;
        return ((xm)a2.instance).getKindBytes();
    }

    public String getKind() {
        Tm_1 a2;
        return ((xm)a2.instance).getKind();
    }
}

