/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ga
 *  Rn
 *  aN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Rn_2
extends GeneratedMessageLite.Builder<aN, Rn>
implements Ga {
    public float getOffsetX() {
        Rn_2 a2;
        return ((aN)a2.instance).getOffsetX();
    }

    public Rn clearOffsetX() {
        Rn_2 a2;
        Rn_2 rn_2 = a2;
        rn_2.copyOnWrite();
        aN.e((aN)((aN)rn_2.instance));
        return a2;
    }

    public Rn clearOffsetZ() {
        Rn_2 a2;
        Rn_2 rn_2 = a2;
        rn_2.copyOnWrite();
        aN.l((aN)((aN)rn_2.instance));
        return a2;
    }

    public Rn setOffsetX(float f2) {
        Rn_2 a2;
        float b2 = f2;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.C((aN)((aN)rn_2.instance), (float)b2);
        return a2;
    }

    public float getOffsetY() {
        Rn_2 a2;
        return ((aN)a2.instance).getOffsetY();
    }

    public Rn clearOffsetY() {
        Rn_2 a2;
        Rn_2 rn_2 = a2;
        rn_2.copyOnWrite();
        aN.d((aN)((aN)rn_2.instance));
        return a2;
    }

    public Rn setScale(float f2) {
        Rn_2 a2;
        float b2 = f2;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.f((aN)((aN)rn_2.instance), (float)b2);
        return a2;
    }

    public Rn setAnimationId(String string) {
        Rn_2 a2;
        String b2 = string;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.J((aN)((aN)rn_2.instance), (String)b2);
        return a2;
    }

    private Rn_2() {
        super(aN.f());
        Rn_2 a2;
    }

    public Rn setAnimationIdBytes(ByteString byteString) {
        Rn_2 a2;
        ByteString b2 = byteString;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.J((aN)((aN)rn_2.instance), (ByteString)b2);
        return a2;
    }

    public float getOffsetZ() {
        Rn_2 a2;
        return ((aN)a2.instance).getOffsetZ();
    }

    public int getResource() {
        Rn_2 a2;
        return ((aN)a2.instance).getResource();
    }

    public boolean hasAnimationId() {
        Rn_2 a2;
        return ((aN)a2.instance).hasAnimationId();
    }

    public Rn clearAnimationId() {
        Rn_2 a2;
        Rn_2 rn_2 = a2;
        rn_2.copyOnWrite();
        aN.f((aN)((aN)rn_2.instance));
        return a2;
    }

    public ByteString getAnimationIdBytes() {
        Rn_2 a2;
        return ((aN)a2.instance).getAnimationIdBytes();
    }

    public boolean hasOffsetX() {
        Rn_2 a2;
        return ((aN)a2.instance).hasOffsetX();
    }

    public boolean hasOffsetY() {
        Rn_2 a2;
        return ((aN)a2.instance).hasOffsetY();
    }

    public Rn clearScale() {
        Rn_2 a2;
        Rn_2 rn_2 = a2;
        rn_2.copyOnWrite();
        aN.J((aN)((aN)rn_2.instance));
        return a2;
    }

    public Rn setOffsetZ(float f2) {
        Rn_2 a2;
        float b2 = f2;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.J((aN)((aN)rn_2.instance), (float)b2);
        return a2;
    }

    public Rn setOffsetY(float f2) {
        Rn_2 a2;
        float b2 = f2;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.l((aN)((aN)rn_2.instance), (float)b2);
        return a2;
    }

    public boolean hasOffsetZ() {
        Rn_2 a2;
        return ((aN)a2.instance).hasOffsetZ();
    }

    public /* synthetic */ Rn_2(AN aN2) {
        Rn_2 b2 = aN2;
        Rn_2 a2 = this;
        a2();
    }

    public float getScale() {
        Rn_2 a2;
        return ((aN)a2.instance).getScale();
    }

    public Rn clearResource() {
        Rn_2 a2;
        Rn_2 rn_2 = a2;
        rn_2.copyOnWrite();
        aN.C((aN)((aN)rn_2.instance));
        return a2;
    }

    public String getAnimationId() {
        Rn_2 a2;
        return ((aN)a2.instance).getAnimationId();
    }

    public Rn setResource(int n2) {
        Rn_2 a2;
        int b2 = n2;
        Rn_2 rn_2 = a2 = this;
        rn_2.copyOnWrite();
        aN.J((aN)((aN)rn_2.instance), (int)b2);
        return a2;
    }

    public boolean hasScale() {
        Rn_2 a2;
        return ((aN)a2.instance).hasScale();
    }
}

