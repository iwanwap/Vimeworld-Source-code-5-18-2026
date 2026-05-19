/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ho
 *  Jo
 *  QM
 *  XM
 *  Xl
 *  kj
 *  pO
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class Xl_1
extends GeneratedMessageLite.Builder<kj, Xl>
implements n {
    public Xl clearScaleY() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.H((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public boolean hasAngleX() {
        Xl_1 a2;
        return ((kj)a2.instance).hasAngleX();
    }

    public Xl clearScale() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public int getElementsCount() {
        Xl_1 a2;
        return ((kj)a2.instance).getElementsCount();
    }

    public Xl clearElements() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.e((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public QM getAttachment() {
        Xl_1 a2;
        return ((kj)a2.instance).getAttachment();
    }

    public Xl removeElements(int n2) {
        Xl_1 a2;
        int b2 = n2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (int)b2);
        return a2;
    }

    @Override
    public Pm getAnimation() {
        Xl_1 a2;
        return ((kj)a2.instance).getAnimation();
    }

    @Override
    public boolean hasAngleZ() {
        Xl_1 a2;
        return ((kj)a2.instance).hasAngleZ();
    }

    public Xl setAdjustableAngle(boolean bl) {
        Xl_1 a2;
        boolean b2 = bl;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.l((kj)((kj)xl_1.instance), (boolean)b2);
        return a2;
    }

    public Xl setScaleX(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.M((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    public Xl mergeAnimation(Pm pm2) {
        Xl_1 a2;
        MessageLiteOrBuilder b2 = pm2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance), (Pm)b2);
        return a2;
    }

    public Xl clearAdjustableAngle() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.j((kj)((kj)xl_1.instance));
        return a2;
    }

    public Xl clearCentered() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public boolean getCentered() {
        Xl_1 a2;
        return ((kj)a2.instance).getCentered();
    }

    @Override
    public boolean hasScale() {
        Xl_1 a2;
        return ((kj)a2.instance).hasScale();
    }

    public Xl setScaleZ(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.d((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    @Override
    public float getY() {
        Xl_1 a2;
        return ((kj)a2.instance).getY();
    }

    public Xl setAngleY(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.e((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    public Xl mergeAttachment(QM qM) {
        Xl_1 a2;
        Xl_1 b2 = qM;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance), (QM)b2);
        return a2;
    }

    @Override
    public boolean hasScaleZ() {
        Xl_1 a2;
        return ((kj)a2.instance).hasScaleZ();
    }

    public Xl clearAngleY() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.l((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public boolean getCulling() {
        Xl_1 a2;
        return ((kj)a2.instance).getCulling();
    }

    public Xl setDepthMask(boolean bl) {
        Xl_1 a2;
        boolean b2 = bl;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (boolean)b2);
        return a2;
    }

    public /* synthetic */ Xl_1(AN aN2) {
        Xl_1 b2 = aN2;
        Xl_1 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public Xl addElements(int n2, XM xM2) {
        void b2;
        Xl_1 a2;
        Xl_1 c2 = xM2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (int)b2, (XM)c2);
        return a2;
    }

    public Xl setZ(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.A((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    public Xl setX(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.C((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    @Override
    public boolean getAdjustableAngle() {
        Xl_1 a2;
        return ((kj)a2.instance).getAdjustableAngle();
    }

    public Xl clearY() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.g((kj)((kj)xl_1.instance));
        return a2;
    }

    private Xl_1() {
        super(kj.f());
        Xl_1 a2;
    }

    public Xl clearScaleZ() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.I((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public boolean hasAttachment() {
        Xl_1 a2;
        return ((kj)a2.instance).hasAttachment();
    }

    @Override
    public float getX() {
        Xl_1 a2;
        return ((kj)a2.instance).getX();
    }

    public Xl setScale(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.l((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    public Xl setAnimation(Ho ho2) {
        Xl_1 a2;
        Xl_1 b2 = ho2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (Pm)((Pm)b2.build()));
        return a2;
    }

    public Xl setAnimation(Pm pm2) {
        Xl_1 a2;
        MessageLiteOrBuilder b2 = pm2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (Pm)b2);
        return a2;
    }

    public Xl setY(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    @Override
    public XM getElements(int n2) {
        int b2 = n2;
        Xl_1 a2 = this;
        return ((kj)a2.instance).getElements(b2);
    }

    public Xl setAttachment(pO pO2) {
        Xl_1 a2;
        Xl_1 b2 = pO2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (QM)((QM)b2.build()));
        return a2;
    }

    public Xl setAttachment(QM qM) {
        Xl_1 a2;
        Xl_1 b2 = qM;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (QM)b2);
        return a2;
    }

    public Xl clearAnimation() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.i((kj)((kj)xl_1.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Xl setElements(int n2, Jo jo2) {
        void b2;
        Xl_1 a2;
        Xl_1 c2 = jo2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance), (int)b2, (XM)((XM)c2.build()));
        return a2;
    }

    @Override
    public boolean hasCentered() {
        Xl_1 a2;
        return ((kj)a2.instance).hasCentered();
    }

    public Xl addAllElements(Iterable<? extends XM> iterable) {
        Xl_1 a2;
        Iterable<? extends XM> b2 = iterable;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (Iterable)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Xl addElements(int n2, Jo jo2) {
        void b2;
        Xl_1 a2;
        Xl_1 c2 = jo2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (int)b2, (XM)((XM)c2.build()));
        return a2;
    }

    public Xl setAngleZ(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.i((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    public Xl setScaleY(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Xl setElements(int n2, XM xM2) {
        void b2;
        Xl_1 a2;
        Xl_1 c2 = xM2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance), (int)b2, (XM)c2);
        return a2;
    }

    @Override
    public boolean hasCulling() {
        Xl_1 a2;
        return ((kj)a2.instance).hasCulling();
    }

    @Override
    public boolean hasScaleY() {
        Xl_1 a2;
        return ((kj)a2.instance).hasScaleY();
    }

    @Override
    public List<XM> getElementsList() {
        Xl_1 a2;
        return Collections.unmodifiableList(((kj)a2.instance).getElementsList());
    }

    @Override
    public boolean hasScaleX() {
        Xl_1 a2;
        return ((kj)a2.instance).hasScaleX();
    }

    @Override
    public boolean hasDepthMask() {
        Xl_1 a2;
        return ((kj)a2.instance).hasDepthMask();
    }

    @Override
    public float getAngleZ() {
        Xl_1 a2;
        return ((kj)a2.instance).getAngleZ();
    }

    @Override
    public float getScaleZ() {
        Xl_1 a2;
        return ((kj)a2.instance).getScaleZ();
    }

    public Xl clearZ() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.C((kj)((kj)xl_1.instance));
        return a2;
    }

    public Xl clearAttachment() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.k((kj)((kj)xl_1.instance));
        return a2;
    }

    public Xl clearAngleX() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.F((kj)((kj)xl_1.instance));
        return a2;
    }

    public Xl addElements(XM xM2) {
        Xl_1 a2;
        Xl_1 b2 = xM2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (XM)b2);
        return a2;
    }

    @Override
    public float getAngleX() {
        Xl_1 a2;
        return ((kj)a2.instance).getAngleX();
    }

    @Override
    public float getScaleY() {
        Xl_1 a2;
        return ((kj)a2.instance).getScaleY();
    }

    @Override
    public float getScaleX() {
        Xl_1 a2;
        return ((kj)a2.instance).getScaleX();
    }

    public Xl clearCulling() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.d((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public float getScale() {
        Xl_1 a2;
        return ((kj)a2.instance).getScale();
    }

    @Override
    public float getAngleY() {
        Xl_1 a2;
        return ((kj)a2.instance).getAngleY();
    }

    public Xl setCentered(boolean bl) {
        Xl_1 a2;
        boolean b2 = bl;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.C((kj)((kj)xl_1.instance), (boolean)b2);
        return a2;
    }

    public Xl clearX() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.G((kj)((kj)xl_1.instance));
        return a2;
    }

    public Xl clearAngleZ() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.D((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public boolean hasAngleY() {
        Xl_1 a2;
        return ((kj)a2.instance).hasAngleY();
    }

    public Xl addElements(Jo jo2) {
        Xl_1 a2;
        Xl_1 b2 = jo2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.J((kj)((kj)xl_1.instance), (XM)((XM)b2.build()));
        return a2;
    }

    public Xl clearScaleX() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.A((kj)((kj)xl_1.instance));
        return a2;
    }

    @Override
    public float getZ() {
        Xl_1 a2;
        return ((kj)a2.instance).getZ();
    }

    @Override
    public boolean hasAdjustableAngle() {
        Xl_1 a2;
        return ((kj)a2.instance).hasAdjustableAngle();
    }

    @Override
    public boolean hasAnimation() {
        Xl_1 a2;
        return ((kj)a2.instance).hasAnimation();
    }

    public Xl setCulling(boolean bl) {
        Xl_1 a2;
        boolean b2 = bl;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.f((kj)((kj)xl_1.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean getDepthMask() {
        Xl_1 a2;
        return ((kj)a2.instance).getDepthMask();
    }

    public Xl clearDepthMask() {
        Xl_1 a2;
        Xl_1 xl_1 = a2;
        xl_1.copyOnWrite();
        kj.M((kj)((kj)xl_1.instance));
        return a2;
    }

    public Xl setAngleX(float f2) {
        Xl_1 a2;
        float b2 = f2;
        Xl_1 xl_1 = a2 = this;
        xl_1.copyOnWrite();
        kj.D((kj)((kj)xl_1.instance), (float)b2);
        return a2;
    }
}

