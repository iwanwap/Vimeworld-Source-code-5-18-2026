/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  BN
 *  Dm
 *  Zm
 *  sn
 *  ta
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Dm_2
extends GeneratedMessageLite.Builder<BN, Dm>
implements ta {
    public /* synthetic */ Dm_2(AN aN2) {
        Dm_2 b2 = aN2;
        Dm_2 a2 = this;
        a2();
    }

    public Dm clearCallback() {
        Dm_2 a2;
        Dm_2 dm_2 = a2;
        dm_2.copyOnWrite();
        BN.J((BN)((BN)dm_2.instance));
        return a2;
    }

    private Dm_2() {
        super(BN.f());
        Dm_2 a2;
    }

    public Dm mergeUnbind(Zm zm2) {
        Dm_2 a2;
        Dm_2 b2 = zm2;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.J((BN)((BN)dm_2.instance), (Zm)b2);
        return a2;
    }

    public Dm setUnbind(Zm zm2) {
        Dm_2 a2;
        Dm_2 b2 = zm2;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.f((BN)((BN)dm_2.instance), (Zm)b2);
        return a2;
    }

    public int getKindValue() {
        Dm_2 a2;
        return ((BN)a2.instance).getKindValue();
    }

    public boolean hasMessage() {
        Dm_2 a2;
        return ((BN)a2.instance).hasMessage();
    }

    public Dm setElementId2DBytes(ByteString byteString) {
        Dm_2 a2;
        ByteString b2 = byteString;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.l((BN)((BN)dm_2.instance), (ByteString)b2);
        return a2;
    }

    public Zm getUnbind() {
        Dm_2 a2;
        return ((BN)a2.instance).getUnbind();
    }

    public ByteString getMessageBytes() {
        Dm_2 a2;
        return ((BN)a2.instance).getMessageBytes();
    }

    public Dm setKindValue(int n2) {
        Dm_2 a2;
        int b2 = n2;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.J((BN)((BN)dm_2.instance), (int)b2);
        return a2;
    }

    public Dm setKind(sn sn2) {
        Dm_2 a2;
        Dm_2 b2 = sn2;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.J((BN)((BN)dm_2.instance), (sn)b2);
        return a2;
    }

    public boolean hasCallback() {
        Dm_2 a2;
        return ((BN)a2.instance).hasCallback();
    }

    public Dm setMessageBytes(ByteString byteString) {
        Dm_2 a2;
        ByteString b2 = byteString;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.J((BN)((BN)dm_2.instance), (ByteString)b2);
        return a2;
    }

    public Dm clearKind() {
        Dm_2 a2;
        Dm_2 dm_2 = a2;
        dm_2.copyOnWrite();
        BN.f((BN)((BN)dm_2.instance));
        return a2;
    }

    public ByteString getCallback() {
        Dm_2 a2;
        return ((BN)a2.instance).getCallback();
    }

    public sn getKind() {
        Dm_2 a2;
        return ((BN)a2.instance).getKind();
    }

    public boolean hasUnbind() {
        Dm_2 a2;
        return ((BN)a2.instance).hasUnbind();
    }

    public Dm clearElementId2D() {
        Dm_2 a2;
        Dm_2 dm_2 = a2;
        dm_2.copyOnWrite();
        BN.l((BN)((BN)dm_2.instance));
        return a2;
    }

    public Dm setUnbind(lm lm2) {
        Dm_2 a2;
        GeneratedMessageLite.Builder b2 = lm2;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.f((BN)((BN)dm_2.instance), (Zm)((Zm)b2.build()));
        return a2;
    }

    public GM getDataCase() {
        Dm_2 a2;
        return ((BN)a2.instance).getDataCase();
    }

    public boolean hasElementId2D() {
        Dm_2 a2;
        return ((BN)a2.instance).hasElementId2D();
    }

    public Dm setElementId2D(String string) {
        Dm_2 a2;
        String b2 = string;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.J((BN)((BN)dm_2.instance), (String)b2);
        return a2;
    }

    public Dm setCallback(ByteString byteString) {
        Dm_2 a2;
        ByteString b2 = byteString;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.f((BN)((BN)dm_2.instance), (ByteString)b2);
        return a2;
    }

    public Dm clearUnbind() {
        Dm_2 a2;
        Dm_2 dm_2 = a2;
        dm_2.copyOnWrite();
        BN.C((BN)((BN)dm_2.instance));
        return a2;
    }

    public Dm clearData() {
        Dm_2 a2;
        Dm_2 dm_2 = a2;
        dm_2.copyOnWrite();
        BN.e((BN)((BN)dm_2.instance));
        return a2;
    }

    public Dm clearMessage() {
        Dm_2 a2;
        Dm_2 dm_2 = a2;
        dm_2.copyOnWrite();
        BN.d((BN)((BN)dm_2.instance));
        return a2;
    }

    public ByteString getElementId2DBytes() {
        Dm_2 a2;
        return ((BN)a2.instance).getElementId2DBytes();
    }

    public String getMessage() {
        Dm_2 a2;
        return ((BN)a2.instance).getMessage();
    }

    public Dm setMessage(String string) {
        Dm_2 a2;
        String b2 = string;
        Dm_2 dm_2 = a2 = this;
        dm_2.copyOnWrite();
        BN.f((BN)((BN)dm_2.instance), (String)b2);
        return a2;
    }

    public String getElementId2D() {
        Dm_2 a2;
        return ((BN)a2.instance).getElementId2D();
    }
}

