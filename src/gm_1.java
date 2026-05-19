/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ko
 *  VN
 *  Vn
 *  gm
 *  yN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class gm_1
extends GeneratedMessageLite.Builder<VN, gm>
implements Na {
    @Override
    public int getTextureResource() {
        gm_1 a2;
        return ((VN)a2.instance).getTextureResource();
    }

    @Override
    public String getTexturePath() {
        gm_1 a2;
        return ((VN)a2.instance).getTexturePath();
    }

    @Override
    public int getAllowedPerspectives(int n2) {
        int b2 = n2;
        gm_1 a2 = this;
        return ((VN)a2.instance).getAllowedPerspectives(b2);
    }

    public gm clearAlwaysRender() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.M((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm setTextureResource(int n2) {
        gm_1 a2;
        int b2 = n2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.l((VN)((VN)gm_12.instance), (int)b2);
        return a2;
    }

    public gm clearModelPath() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.D((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public boolean hasHeight() {
        gm_1 a2;
        return ((VN)a2.instance).hasHeight();
    }

    public gm clearModelOffset() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm addAllAllowedPerspectives(Iterable<? extends Integer> iterable) {
        gm_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (Iterable)b2);
        return a2;
    }

    public gm setModelPath(String string) {
        gm_1 a2;
        String b2 = string;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (String)b2);
        return a2;
    }

    @Override
    public do getModelOffset() {
        gm_1 a2;
        return ((VN)a2.instance).getModelOffset();
    }

    @Override
    public yN getTextureCase() {
        gm_1 a2;
        return ((VN)a2.instance).getTextureCase();
    }

    @Override
    public boolean hasTextureResource() {
        gm_1 a2;
        return ((VN)a2.instance).hasTextureResource();
    }

    @Override
    public boolean hasModelResource() {
        gm_1 a2;
        return ((VN)a2.instance).hasModelResource();
    }

    public gm clearTextureResource() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.I((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm clearTexture() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.d((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public int getColor() {
        gm_1 a2;
        return ((VN)a2.instance).getColor();
    }

    @Override
    public boolean hasDisableRender() {
        gm_1 a2;
        return ((VN)a2.instance).hasDisableRender();
    }

    public gm setTexturePath(String string) {
        gm_1 a2;
        String b2 = string;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance), (String)b2);
        return a2;
    }

    public gm clearModelResource() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.k((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public boolean hasModelOffset() {
        gm_1 a2;
        return ((VN)a2.instance).hasModelOffset();
    }

    public gm clearDisableRender() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.j((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm mergeModelOffset(do do_) {
        gm_1 a2;
        MessageLiteOrBuilder b2 = do_;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance), (do)b2);
        return a2;
    }

    public gm clearModel() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.G((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public boolean hasWidth() {
        gm_1 a2;
        return ((VN)a2.instance).hasWidth();
    }

    @Override
    public float getWidth() {
        gm_1 a2;
        return ((VN)a2.instance).getWidth();
    }

    @Override
    public boolean hasHurtDeathAnimationDisabled() {
        gm_1 a2;
        return ((VN)a2.instance).hasHurtDeathAnimationDisabled();
    }

    public gm setHeight(float f2) {
        gm_1 a2;
        float b2 = f2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.l((VN)((VN)gm_12.instance), (float)b2);
        return a2;
    }

    private gm_1() {
        super(VN.J());
        gm_1 a2;
    }

    public gm setHurtDeathAnimationDisabled(boolean bl) {
        gm_1 a2;
        boolean b2 = bl;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.l((VN)((VN)gm_12.instance), (boolean)b2);
        return a2;
    }

    public gm setAlwaysRender(boolean bl) {
        gm_1 a2;
        boolean b2 = bl;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (boolean)b2);
        return a2;
    }

    @Override
    public ByteString getModelPathBytes() {
        gm_1 a2;
        return ((VN)a2.instance).getModelPathBytes();
    }

    @Override
    public List<Integer> getAllowedPerspectivesList() {
        gm_1 a2;
        return Collections.unmodifiableList(((VN)a2.instance).getAllowedPerspectivesList());
    }

    @Override
    public String getModelPath() {
        gm_1 a2;
        return ((VN)a2.instance).getModelPath();
    }

    public gm setModelPathBytes(ByteString byteString) {
        gm_1 a2;
        ByteString b2 = byteString;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (ByteString)b2);
        return a2;
    }

    public gm clearScale() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.C((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm addAllowedPerspectives(int n2) {
        gm_1 a2;
        int b2 = n2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasColor() {
        gm_1 a2;
        return ((VN)a2.instance).hasColor();
    }

    @Override
    public int getModelResource() {
        gm_1 a2;
        return ((VN)a2.instance).getModelResource();
    }

    public gm setWidth(float f2) {
        gm_1 a2;
        float b2 = f2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (float)b2);
        return a2;
    }

    public gm clearHurtDeathAnimationDisabled() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public boolean hasModelPath() {
        gm_1 a2;
        return ((VN)a2.instance).hasModelPath();
    }

    @Override
    public boolean getHurtDeathAnimationDisabled() {
        gm_1 a2;
        return ((VN)a2.instance).getHurtDeathAnimationDisabled();
    }

    public gm setModelOffset(do do_) {
        gm_1 a2;
        MessageLiteOrBuilder b2 = do_;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (do)b2);
        return a2;
    }

    @Override
    public boolean getAlwaysRender() {
        gm_1 a2;
        return ((VN)a2.instance).getAlwaysRender();
    }

    public gm setModelOffset(Vn vn2) {
        gm_1 a2;
        gm_1 b2 = vn2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (do)((do)b2.build()));
        return a2;
    }

    @Override
    public boolean hasTexturePath() {
        gm_1 a2;
        return ((VN)a2.instance).hasTexturePath();
    }

    public gm clearColor() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.F((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public ByteString getTexturePathBytes() {
        gm_1 a2;
        return ((VN)a2.instance).getTexturePathBytes();
    }

    @Override
    public int getAllowedPerspectivesCount() {
        gm_1 a2;
        return ((VN)a2.instance).getAllowedPerspectivesCount();
    }

    public gm setDisableRender(boolean bl) {
        gm_1 a2;
        boolean b2 = bl;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean hasAlwaysRender() {
        gm_1 a2;
        return ((VN)a2.instance).hasAlwaysRender();
    }

    public gm clearTexturePath() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.e((VN)((VN)gm_12.instance));
        return a2;
    }

    @Override
    public float getHeight() {
        gm_1 a2;
        return ((VN)a2.instance).getHeight();
    }

    public gm setModelResource(int n2) {
        gm_1 a2;
        int b2 = n2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance), (int)b2);
        return a2;
    }

    @Override
    public Ko getModelCase() {
        gm_1 a2;
        return ((VN)a2.instance).getModelCase();
    }

    public gm clearHeight() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.A((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm setColor(int n2) {
        gm_1 a2;
        int b2 = n2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.C((VN)((VN)gm_12.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasScale() {
        gm_1 a2;
        return ((VN)a2.instance).hasScale();
    }

    @Override
    public boolean getDisableRender() {
        gm_1 a2;
        return ((VN)a2.instance).getDisableRender();
    }

    public gm clearAllowedPerspectives() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.i((VN)((VN)gm_12.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gm setAllowedPerspectives(int n2, int n3) {
        void b2;
        gm_1 a2;
        int c2 = n3;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.J((VN)((VN)gm_12.instance), (int)b2, (int)c2);
        return a2;
    }

    @Override
    public float getScale() {
        gm_1 a2;
        return ((VN)a2.instance).getScale();
    }

    public /* synthetic */ gm_1(AN aN2) {
        gm_1 b2 = aN2;
        gm_1 a2 = this;
        a2();
    }

    public gm clearWidth() {
        gm_1 a2;
        gm_1 gm_12 = a2;
        gm_12.copyOnWrite();
        VN.l((VN)((VN)gm_12.instance));
        return a2;
    }

    public gm setTexturePathBytes(ByteString byteString) {
        gm_1 a2;
        ByteString b2 = byteString;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance), (ByteString)b2);
        return a2;
    }

    public gm setScale(float f2) {
        gm_1 a2;
        float b2 = f2;
        gm_1 gm_12 = a2 = this;
        gm_12.copyOnWrite();
        VN.f((VN)((VN)gm_12.instance), (float)b2);
        return a2;
    }
}

