/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ia
 *  Im
 *  SN
 *  Ym
 *  jN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class zm
extends GeneratedMessageLite.Builder<SN, zm>
implements Ia {
    public Ym getKind() {
        zm a2;
        return ((SN)a2.instance).getKind();
    }

    public int getKindValue() {
        zm a2;
        return ((SN)a2.instance).getKindValue();
    }

    public zm clearAction() {
        zm a2;
        zm zm2 = a2;
        zm2.copyOnWrite();
        SN.C((SN)((SN)zm2.instance));
        return a2;
    }

    public String getId() {
        zm a2;
        return ((SN)a2.instance).getId();
    }

    public zm mergeAction(MN mN) {
        zm a2;
        MessageLiteOrBuilder b2 = mN;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.f((SN)((SN)zm2.instance), (MN)b2);
        return a2;
    }

    public boolean hasAction() {
        zm a2;
        return ((SN)a2.instance).hasAction();
    }

    public boolean hasId() {
        zm a2;
        return ((SN)a2.instance).hasId();
    }

    private zm() {
        super(SN.J());
        zm a2;
    }

    public MN getAction() {
        zm a2;
        return ((SN)a2.instance).getAction();
    }

    public zm setKindValue(int n2) {
        zm a2;
        int b2 = n2;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance), (int)b2);
        return a2;
    }

    public zm setAction(MN mN) {
        zm a2;
        MessageLiteOrBuilder b2 = mN;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance), (MN)b2);
        return a2;
    }

    public zm setId(String string) {
        zm a2;
        String b2 = string;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance), (String)b2);
        return a2;
    }

    public zm clearKind() {
        zm a2;
        zm zm2 = a2;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance));
        return a2;
    }

    public zm setKind(Ym ym) {
        zm a2;
        zm b2 = ym;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance), (Ym)b2);
        return a2;
    }

    public /* synthetic */ zm(AN aN) {
        zm b2 = aN;
        zm a2 = this;
        a2();
    }

    public zm setKey(int n2) {
        zm a2;
        int b2 = n2;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.f((SN)((SN)zm2.instance), (int)b2);
        return a2;
    }

    public zm clearId() {
        zm a2;
        zm zm2 = a2;
        zm2.copyOnWrite();
        SN.l((SN)((SN)zm2.instance));
        return a2;
    }

    public Im getDataCase() {
        zm a2;
        return ((SN)a2.instance).getDataCase();
    }

    public ByteString getIdBytes() {
        zm a2;
        return ((SN)a2.instance).getIdBytes();
    }

    public zm setAction(jN jN2) {
        zm a2;
        zm b2 = jN2;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance), (MN)((MN)b2.build()));
        return a2;
    }

    public zm clearData() {
        zm a2;
        zm zm2 = a2;
        zm2.copyOnWrite();
        SN.d((SN)((SN)zm2.instance));
        return a2;
    }

    public int getKey() {
        zm a2;
        return ((SN)a2.instance).getKey();
    }

    public zm setIdBytes(ByteString byteString) {
        zm a2;
        ByteString b2 = byteString;
        zm zm2 = a2 = this;
        zm2.copyOnWrite();
        SN.J((SN)((SN)zm2.instance), (ByteString)b2);
        return a2;
    }

    public zm clearKey() {
        zm a2;
        zm zm2 = a2;
        zm2.copyOnWrite();
        SN.f((SN)((SN)zm2.instance));
        return a2;
    }
}

