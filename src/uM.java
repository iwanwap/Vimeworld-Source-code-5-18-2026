/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  QM
 *  bm
 *  co
 *  jO
 *  ka
 *  pO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class uM
extends GeneratedMessageLite.Builder<co, uM>
implements ka {
    public uM setStyleValue(int n2) {
        uM a2;
        int b2 = n2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.C((co)((co)uM2.instance), (int)b2);
        return a2;
    }

    public uM clearScale() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.l((co)((co)uM2.instance));
        return a2;
    }

    public uM clearTexturePath() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.d((co)((co)uM2.instance));
        return a2;
    }

    public uM mergeAttachment(QM qM) {
        uM a2;
        uM b2 = qM;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (QM)b2);
        return a2;
    }

    public uM clearStacks() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.k((co)((co)uM2.instance));
        return a2;
    }

    private uM() {
        super(co.f());
        uM a2;
    }

    public List<Float> getLocList() {
        uM a2;
        return Collections.unmodifiableList(((co)a2.instance).getLocList());
    }

    public float getAngleRotationZ() {
        uM a2;
        return ((co)a2.instance).getAngleRotationZ();
    }

    public uM setTexturePathBytes(ByteString byteString) {
        uM a2;
        ByteString b2 = byteString;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (ByteString)b2);
        return a2;
    }

    public boolean hasStyle() {
        uM a2;
        return ((co)a2.instance).hasStyle();
    }

    public uM clearStyle() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.D((co)((co)uM2.instance));
        return a2;
    }

    public int getTextureResource() {
        uM a2;
        return ((co)a2.instance).getTextureResource();
    }

    public float getAngleZ() {
        uM a2;
        return ((co)a2.instance).getAngleZ();
    }

    public uM clearTexture() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.A((co)((co)uM2.instance));
        return a2;
    }

    public boolean hasAngleRotationY() {
        uM a2;
        return ((co)a2.instance).hasAngleRotationY();
    }

    public int getColor() {
        uM a2;
        return ((co)a2.instance).getColor();
    }

    public float getAngleRotationX() {
        uM a2;
        return ((co)a2.instance).getAngleRotationX();
    }

    public boolean hasAngleZ() {
        uM a2;
        return ((co)a2.instance).hasAngleZ();
    }

    public uM clearSlices() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.i((co)((co)uM2.instance));
        return a2;
    }

    public uM setAngleRotationY(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.e((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public boolean hasColor() {
        uM a2;
        return ((co)a2.instance).hasColor();
    }

    public uM clearAngleRotationY() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.M((co)((co)uM2.instance));
        return a2;
    }

    public uM setTexturePath(String string) {
        uM a2;
        String b2 = string;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (String)b2);
        return a2;
    }

    public boolean getCulling() {
        uM a2;
        return ((co)a2.instance).getCulling();
    }

    public int getStacks() {
        uM a2;
        return ((co)a2.instance).getStacks();
    }

    public uM setAttachment(QM qM) {
        uM a2;
        uM b2 = qM;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance), (QM)b2);
        return a2;
    }

    public boolean hasTextureResource() {
        uM a2;
        return ((co)a2.instance).hasTextureResource();
    }

    public boolean hasRadius() {
        uM a2;
        return ((co)a2.instance).hasRadius();
    }

    public uM addScale(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public boolean hasAngleRotationZ() {
        uM a2;
        return ((co)a2.instance).hasAngleRotationZ();
    }

    public uM setSlices(int n2) {
        uM a2;
        int b2 = n2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.l((co)((co)uM2.instance), (int)b2);
        return a2;
    }

    public boolean hasSlices() {
        uM a2;
        return ((co)a2.instance).hasSlices();
    }

    public String getTexturePath() {
        uM a2;
        return ((co)a2.instance).getTexturePath();
    }

    public float getLoc(int n2) {
        int b2 = n2;
        uM a2 = this;
        return ((co)a2.instance).getLoc(b2);
    }

    public uM addLoc(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.l((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public boolean hasAngleY() {
        uM a2;
        return ((co)a2.instance).hasAngleY();
    }

    public QM getAttachment() {
        uM a2;
        return ((co)a2.instance).getAttachment();
    }

    public uM setAttachment(pO pO2) {
        uM a2;
        uM b2 = pO2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance), (QM)((QM)b2.build()));
        return a2;
    }

    public float getAngleX() {
        uM a2;
        return ((co)a2.instance).getAngleX();
    }

    public int getStyleValue() {
        uM a2;
        return ((co)a2.instance).getStyleValue();
    }

    public uM clearAngleX() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.e((co)((co)uM2.instance));
        return a2;
    }

    public uM addAllLoc(Iterable<? extends Float> iterable) {
        uM a2;
        Iterable<? extends Float> b2 = iterable;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (Iterable)b2);
        return a2;
    }

    public uM clearAngleZ() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.j((co)((co)uM2.instance));
        return a2;
    }

    public uM addAllScale(Iterable<? extends Float> iterable) {
        uM a2;
        Iterable<? extends Float> b2 = iterable;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance), (Iterable)b2);
        return a2;
    }

    public boolean hasAttachment() {
        uM a2;
        return ((co)a2.instance).hasAttachment();
    }

    public boolean hasStacks() {
        uM a2;
        return ((co)a2.instance).hasStacks();
    }

    public /* synthetic */ uM(AN aN2) {
        uM b2 = aN2;
        uM a2 = this;
        a2();
    }

    public uM setAngleRotationX(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.d((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public uM setRadius(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.M((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public float getScale(int n2) {
        int b2 = n2;
        uM a2 = this;
        return ((co)a2.instance).getScale(b2);
    }

    public uM setStacks(int n2) {
        uM a2;
        int b2 = n2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance), (int)b2);
        return a2;
    }

    public boolean hasCulling() {
        uM a2;
        return ((co)a2.instance).hasCulling();
    }

    public uM setAngleX(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.A((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public jO getStyle() {
        uM a2;
        return ((co)a2.instance).getStyle();
    }

    public int getScaleCount() {
        uM a2;
        return ((co)a2.instance).getScaleCount();
    }

    public uM clearAngleY() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.a((co)((co)uM2.instance));
        return a2;
    }

    public uM setColor(int n2) {
        uM a2;
        int b2 = n2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (int)b2);
        return a2;
    }

    public uM clearAngleRotationX() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.C((co)((co)uM2.instance));
        return a2;
    }

    public uM setStyle(jO jO2) {
        uM a2;
        uM b2 = jO2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (jO)b2);
        return a2;
    }

    public int getLocCount() {
        uM a2;
        return ((co)a2.instance).getLocCount();
    }

    public int getSlices() {
        uM a2;
        return ((co)a2.instance).getSlices();
    }

    public uM clearColor() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance));
        return a2;
    }

    public uM clearAngleRotationZ() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.G((co)((co)uM2.instance));
        return a2;
    }

    public float getRadius() {
        uM a2;
        return ((co)a2.instance).getRadius();
    }

    public uM clearRadius() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance));
        return a2;
    }

    public boolean hasAngleX() {
        uM a2;
        return ((co)a2.instance).hasAngleX();
    }

    public boolean hasTexturePath() {
        uM a2;
        return ((co)a2.instance).hasTexturePath();
    }

    /*
     * WARNING - void declaration
     */
    public uM setLoc(int n2, float f2) {
        void b2;
        uM a2;
        float c2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance), (int)b2, (float)c2);
        return a2;
    }

    public List<Float> getScaleList() {
        uM a2;
        return Collections.unmodifiableList(((co)a2.instance).getScaleList());
    }

    public ByteString getTexturePathBytes() {
        uM a2;
        return ((co)a2.instance).getTexturePathBytes();
    }

    public uM setTextureResource(int n2) {
        uM a2;
        int b2 = n2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.d((co)((co)uM2.instance), (int)b2);
        return a2;
    }

    public boolean hasAngleRotationX() {
        uM a2;
        return ((co)a2.instance).hasAngleRotationX();
    }

    public float getAngleRotationY() {
        uM a2;
        return ((co)a2.instance).getAngleRotationY();
    }

    public uM clearAttachment() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.F((co)((co)uM2.instance));
        return a2;
    }

    public float getAngleY() {
        uM a2;
        return ((co)a2.instance).getAngleY();
    }

    public uM setAngleZ(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.C((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public uM setAngleY(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.i((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public uM clearCulling() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.g((co)((co)uM2.instance));
        return a2;
    }

    public uM setCulling(boolean bl) {
        uM a2;
        boolean b2 = bl;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (boolean)b2);
        return a2;
    }

    public uM setAngleRotationZ(float f2) {
        uM a2;
        float b2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.f((co)((co)uM2.instance), (float)b2);
        return a2;
    }

    public uM clearLoc() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.H((co)((co)uM2.instance));
        return a2;
    }

    public bm getTextureCase() {
        uM a2;
        return ((co)a2.instance).getTextureCase();
    }

    /*
     * WARNING - void declaration
     */
    public uM setScale(int n2, float f2) {
        void b2;
        uM a2;
        float c2 = f2;
        uM uM2 = a2 = this;
        uM2.copyOnWrite();
        co.J((co)((co)uM2.instance), (int)b2, (float)c2);
        return a2;
    }

    public uM clearTextureResource() {
        uM a2;
        uM uM2 = a2;
        uM2.copyOnWrite();
        co.I((co)((co)uM2.instance));
        return a2;
    }
}

