/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  vM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class kN
extends GeneratedMessageLite.Builder<vM, kN>
implements sc {
    @Override
    public ByteString getActionBytes() {
        kN a2;
        return ((vM)a2.instance).getActionBytes();
    }

    public kN clearInfo() {
        kN a2;
        kN kN2 = a2;
        kN2.copyOnWrite();
        vM.f((vM)((vM)kN2.instance));
        return a2;
    }

    public /* synthetic */ kN(AN aN) {
        kN b2 = aN;
        kN a2 = this;
        a2();
    }

    private kN() {
        super(vM.f());
        kN a2;
    }

    @Override
    public String getAction() {
        kN a2;
        return ((vM)a2.instance).getAction();
    }

    public kN setActionBytes(ByteString byteString) {
        kN a2;
        ByteString b2 = byteString;
        kN kN2 = a2 = this;
        kN2.copyOnWrite();
        vM.f((vM)((vM)kN2.instance), (ByteString)b2);
        return a2;
    }

    public kN setInfoBytes(ByteString byteString) {
        kN a2;
        ByteString b2 = byteString;
        kN kN2 = a2 = this;
        kN2.copyOnWrite();
        vM.J((vM)((vM)kN2.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public ByteString getInfoBytes() {
        kN a2;
        return ((vM)a2.instance).getInfoBytes();
    }

    public kN setAction(String string) {
        kN a2;
        String b2 = string;
        kN kN2 = a2 = this;
        kN2.copyOnWrite();
        vM.f((vM)((vM)kN2.instance), (String)b2);
        return a2;
    }

    public kN clearAction() {
        kN a2;
        kN kN2 = a2;
        kN2.copyOnWrite();
        vM.J((vM)((vM)kN2.instance));
        return a2;
    }

    @Override
    public String getInfo() {
        kN a2;
        return ((vM)a2.instance).getInfo();
    }

    public kN setInfo(String string) {
        kN a2;
        String b2 = string;
        kN kN2 = a2 = this;
        kN2.copyOnWrite();
        vM.J((vM)((vM)kN2.instance), (String)b2);
        return a2;
    }
}

