/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  FM
 *  an
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class FM_2
extends GeneratedMessageLite.Builder<jn, FM>
implements NB {
    public FM setTargetBytes(ByteString byteString) {
        FM_2 a2;
        ByteString b2 = byteString;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.J((jn)fM_2.instance, b2);
        return a2;
    }

    @Override
    public ByteString getTargetBytes() {
        FM_2 a2;
        return ((jn)a2.instance).getTargetBytes();
    }

    @Override
    public boolean hasOrientation() {
        FM_2 a2;
        return ((jn)a2.instance).hasOrientation();
    }

    public FM clearRemoveWhenParentRemove() {
        FM_2 a2;
        FM_2 fM_2 = a2;
        fM_2.copyOnWrite();
        jn.l((jn)fM_2.instance);
        return a2;
    }

    @Override
    public int getOrientationValue() {
        FM_2 a2;
        return ((jn)a2.instance).getOrientationValue();
    }

    public FM clearLocation() {
        FM_2 a2;
        FM_2 fM_2 = a2;
        fM_2.copyOnWrite();
        jn.J((jn)fM_2.instance);
        return a2;
    }

    public FM setTarget(String string) {
        FM_2 a2;
        String b2 = string;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.J((jn)fM_2.instance, b2);
        return a2;
    }

    public /* synthetic */ FM_2(AN aN2) {
        FM_2 b2 = aN2;
        FM_2 a2 = this;
        a2();
    }

    @Override
    public boolean hasRemoveWhenParentRemove() {
        FM_2 a2;
        return ((jn)a2.instance).hasRemoveWhenParentRemove();
    }

    public FM clearOrientation() {
        FM_2 a2;
        FM_2 fM_2 = a2;
        fM_2.copyOnWrite();
        jn.C((jn)fM_2.instance);
        return a2;
    }

    @Override
    public an getOrientation() {
        FM_2 a2;
        return ((jn)a2.instance).getOrientation();
    }

    public FM setRemoveWhenParentRemove(boolean bl) {
        FM_2 a2;
        boolean b2 = bl;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.J((jn)fM_2.instance, b2);
        return a2;
    }

    public FM setOrientationValue(int n2) {
        FM_2 a2;
        int b2 = n2;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.J((jn)fM_2.instance, b2);
        return a2;
    }

    @Override
    public an getLocation() {
        FM_2 a2;
        return ((jn)a2.instance).getLocation();
    }

    @Override
    public int getLocationValue() {
        FM_2 a2;
        return ((jn)a2.instance).getLocationValue();
    }

    public FM setOrientation(an an2) {
        FM_2 a2;
        FM_2 b2 = an2;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.J((jn)fM_2.instance, (an)b2);
        return a2;
    }

    @Override
    public boolean getRemoveWhenParentRemove() {
        FM_2 a2;
        return ((jn)a2.instance).getRemoveWhenParentRemove();
    }

    public FM setLocationValue(int n2) {
        FM_2 a2;
        int b2 = n2;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.f((jn)fM_2.instance, b2);
        return a2;
    }

    private FM_2() {
        super(jn.f());
        FM_2 a2;
    }

    @Override
    public String getTarget() {
        FM_2 a2;
        return ((jn)a2.instance).getTarget();
    }

    public FM setLocation(an an2) {
        FM_2 a2;
        FM_2 b2 = an2;
        FM_2 fM_2 = a2 = this;
        fM_2.copyOnWrite();
        jn.f((jn)fM_2.instance, (an)b2);
        return a2;
    }

    public FM clearTarget() {
        FM_2 a2;
        FM_2 fM_2 = a2;
        fM_2.copyOnWrite();
        jn.f((jn)fM_2.instance);
        return a2;
    }
}

