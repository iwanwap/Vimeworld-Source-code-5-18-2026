/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  mC
 *  qN
 *  tO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class qN_3
extends GeneratedMessageLite.Builder<tO, qN>
implements mC {
    public qN clearAnimationId() {
        qN_3 a2;
        qN_3 qN_32 = a2;
        qN_32.copyOnWrite();
        tO.f((tO)((tO)qN_32.instance));
        return a2;
    }

    public qN setAnimationId(String string) {
        qN_3 a2;
        String b2 = string;
        qN_3 qN_32 = a2 = this;
        qN_32.copyOnWrite();
        tO.J((tO)((tO)qN_32.instance), (String)b2);
        return a2;
    }

    public /* synthetic */ qN_3(AN aN2) {
        qN_3 b2 = aN2;
        qN_3 a2 = this;
        a2();
    }

    public boolean hasSpeed() {
        qN_3 a2;
        return ((tO)a2.instance).hasSpeed();
    }

    public boolean getForce() {
        qN_3 a2;
        return ((tO)a2.instance).getForce();
    }

    public qN setLooped(boolean bl2) {
        qN_3 a2;
        boolean b2 = bl2;
        qN_3 qN_32 = a2 = this;
        qN_32.copyOnWrite();
        tO.J((tO)((tO)qN_32.instance), (boolean)b2);
        return a2;
    }

    public qN clearSpeed() {
        qN_3 a2;
        qN_3 qN_32 = a2;
        qN_32.copyOnWrite();
        tO.J((tO)((tO)qN_32.instance));
        return a2;
    }

    private qN_3() {
        super(tO.J());
        qN_3 a2;
    }

    public String getAnimationId() {
        qN_3 a2;
        return ((tO)a2.instance).getAnimationId();
    }

    public qN setForce(boolean bl2) {
        qN_3 a2;
        boolean b2 = bl2;
        qN_3 qN_32 = a2 = this;
        qN_32.copyOnWrite();
        tO.f((tO)((tO)qN_32.instance), (boolean)b2);
        return a2;
    }

    public boolean hasForce() {
        qN_3 a2;
        return ((tO)a2.instance).hasForce();
    }

    public ByteString getAnimationIdBytes() {
        qN_3 a2;
        return ((tO)a2.instance).getAnimationIdBytes();
    }

    public boolean getLooped() {
        qN_3 a2;
        return ((tO)a2.instance).getLooped();
    }

    public qN setAnimationIdBytes(ByteString byteString) {
        qN_3 a2;
        ByteString b2 = byteString;
        qN_3 qN_32 = a2 = this;
        qN_32.copyOnWrite();
        tO.J((tO)((tO)qN_32.instance), (ByteString)b2);
        return a2;
    }

    public qN clearForce() {
        qN_3 a2;
        qN_3 qN_32 = a2;
        qN_32.copyOnWrite();
        tO.C((tO)((tO)qN_32.instance));
        return a2;
    }

    public boolean hasLooped() {
        qN_3 a2;
        return ((tO)a2.instance).hasLooped();
    }

    public qN clearLooped() {
        qN_3 a2;
        qN_3 qN_32 = a2;
        qN_32.copyOnWrite();
        tO.l((tO)((tO)qN_32.instance));
        return a2;
    }

    public qN setSpeed(float f2) {
        qN_3 a2;
        float b2 = f2;
        qN_3 qN_32 = a2 = this;
        qN_32.copyOnWrite();
        tO.J((tO)((tO)qN_32.instance), (float)b2);
        return a2;
    }

    public float getSpeed() {
        qN_3 a2;
        return ((tO)a2.instance).getSpeed();
    }
}

