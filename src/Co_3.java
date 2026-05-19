/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Co
 *  Gn
 *  Po
 *  ZM
 *  mm
 *  yo
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Co_3
extends GeneratedMessageLite.Builder<mm, Co>
implements Nd {
    public Co mergeScreenShakeAnimation(Po po2) {
        Co_3 a2;
        Co_3 b2 = po2;
        Co_3 co_3 = a2 = this;
        co_3.copyOnWrite();
        mm.f((mm)((mm)co_3.instance), (Po)b2);
        return a2;
    }

    public Co mergeCameraPath(ZM zM2) {
        Co_3 a2;
        Co_3 b2 = zM2;
        Co_3 co_3 = a2 = this;
        co_3.copyOnWrite();
        mm.J((mm)((mm)co_3.instance), (ZM)b2);
        return a2;
    }

    @Override
    public Po getScreenShakeAnimation() {
        Co_3 a2;
        return ((mm)a2.instance).getScreenShakeAnimation();
    }

    @Override
    public ZM getCameraPath() {
        Co_3 a2;
        return ((mm)a2.instance).getCameraPath();
    }

    public Co setCameraPath(dm dm2) {
        Co_3 a2;
        GeneratedMessageLite.Builder b2 = dm2;
        Co_3 co_3 = a2 = this;
        co_3.copyOnWrite();
        mm.f((mm)((mm)co_3.instance), (ZM)((ZM)b2.build()));
        return a2;
    }

    public Co setScreenShakeAnimation(Po po2) {
        Co_3 a2;
        Co_3 b2 = po2;
        Co_3 co_3 = a2 = this;
        co_3.copyOnWrite();
        mm.J((mm)((mm)co_3.instance), (Po)b2);
        return a2;
    }

    @Override
    public boolean hasScreenShakeAnimation() {
        Co_3 a2;
        return ((mm)a2.instance).hasScreenShakeAnimation();
    }

    public Co clearAnimation() {
        Co_3 a2;
        Co_3 co_3 = a2;
        co_3.copyOnWrite();
        mm.f((mm)((mm)co_3.instance));
        return a2;
    }

    public /* synthetic */ Co_3(AN aN2) {
        Co_3 b2 = aN2;
        Co_3 a2 = this;
        a2();
    }

    public Co clearScreenShakeAnimation() {
        Co_3 a2;
        Co_3 co_3 = a2;
        co_3.copyOnWrite();
        mm.l((mm)((mm)co_3.instance));
        return a2;
    }

    private Co_3() {
        super(mm.J());
        Co_3 a2;
    }

    @Override
    public Gn getAnimationCase() {
        Co_3 a2;
        return ((mm)a2.instance).getAnimationCase();
    }

    public Co setScreenShakeAnimation(yo yo2) {
        Co_3 a2;
        Co_3 b2 = yo2;
        Co_3 co_3 = a2 = this;
        co_3.copyOnWrite();
        mm.J((mm)((mm)co_3.instance), (Po)((Po)b2.build()));
        return a2;
    }

    public Co setCameraPath(ZM zM2) {
        Co_3 a2;
        Co_3 b2 = zM2;
        Co_3 co_3 = a2 = this;
        co_3.copyOnWrite();
        mm.f((mm)((mm)co_3.instance), (ZM)b2);
        return a2;
    }

    @Override
    public boolean hasCameraPath() {
        Co_3 a2;
        return ((mm)a2.instance).hasCameraPath();
    }

    public Co clearCameraPath() {
        Co_3 a2;
        Co_3 co_3 = a2;
        co_3.copyOnWrite();
        mm.J((mm)((mm)co_3.instance));
        return a2;
    }
}

