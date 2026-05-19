/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Km
 *  pa
 *  uN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Wm
extends GeneratedMessageLite.Builder<Km, Wm>
implements pa {
    public boolean hasHttpCache() {
        Wm a2;
        return ((Km)a2.instance).hasHttpCache();
    }

    public boolean hasGifStreaming() {
        Wm a2;
        return ((Km)a2.instance).hasGifStreaming();
    }

    public int getHttpCacheDuration() {
        Wm a2;
        return ((Km)a2.instance).getHttpCacheDuration();
    }

    public Wm clearMemCache() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.M((Km)((Km)wm.instance));
        return a2;
    }

    public Wm setResource(int n2) {
        Wm a2;
        int b2 = n2;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.f((Km)((Km)wm.instance), (int)b2);
        return a2;
    }

    public Wm clearRenderHint() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.e((Km)((Km)wm.instance));
        return a2;
    }

    public boolean hasHttpCacheDuration() {
        Wm a2;
        return ((Km)a2.instance).hasHttpCacheDuration();
    }

    public ByteString getImageData() {
        Wm a2;
        return ((Km)a2.instance).getImageData();
    }

    public Wm clearGifSpeed() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.l((Km)((Km)wm.instance));
        return a2;
    }

    public uN getRenderHint() {
        Wm a2;
        return ((Km)a2.instance).getRenderHint();
    }

    public Wm setPath(String string) {
        Wm a2;
        String b2 = string;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance), (String)b2);
        return a2;
    }

    public Wm clearLoadingColor() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.D((Km)((Km)wm.instance));
        return a2;
    }

    public Wm setHttpCacheDuration(int n2) {
        Wm a2;
        int b2 = n2;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.l((Km)((Km)wm.instance), (int)b2);
        return a2;
    }

    public boolean hasGifSpeed() {
        Wm a2;
        return ((Km)a2.instance).hasGifSpeed();
    }

    public boolean hasMemCache() {
        Wm a2;
        return ((Km)a2.instance).hasMemCache();
    }

    public boolean getHttpCache() {
        Wm a2;
        return ((Km)a2.instance).getHttpCache();
    }

    public Wm setPathBytes(ByteString byteString) {
        Wm a2;
        ByteString b2 = byteString;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance), (ByteString)b2);
        return a2;
    }

    public /* synthetic */ Wm(AN aN2) {
        Wm b2 = aN2;
        Wm a2 = this;
        a2();
    }

    private Wm() {
        super(Km.J());
        Wm a2;
    }

    public Wm setGifSpeed(float f2) {
        Wm a2;
        float b2 = f2;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance), (float)b2);
        return a2;
    }

    public int getLoadingColor() {
        Wm a2;
        return ((Km)a2.instance).getLoadingColor();
    }

    public boolean hasLoadingColor() {
        Wm a2;
        return ((Km)a2.instance).hasLoadingColor();
    }

    public Wm setMemCache(boolean bl) {
        Wm a2;
        boolean b2 = bl;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.l((Km)((Km)wm.instance), (boolean)b2);
        return a2;
    }

    public Wm clearResource() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.i((Km)((Km)wm.instance));
        return a2;
    }

    public Wm setImageData(ByteString byteString) {
        Wm a2;
        ByteString b2 = byteString;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.f((Km)((Km)wm.instance), (ByteString)b2);
        return a2;
    }

    public Wm clearGifStreaming() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.d((Km)((Km)wm.instance));
        return a2;
    }

    public Wm clearImage() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.C((Km)((Km)wm.instance));
        return a2;
    }

    public boolean hasImageData() {
        Wm a2;
        return ((Km)a2.instance).hasImageData();
    }

    public Wm setHttpCache(boolean bl) {
        Wm a2;
        boolean b2 = bl;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.f((Km)((Km)wm.instance), (boolean)b2);
        return a2;
    }

    public Wm clearHttpCache() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.A((Km)((Km)wm.instance));
        return a2;
    }

    public boolean hasPath() {
        Wm a2;
        return ((Km)a2.instance).hasPath();
    }

    public ByteString getPathBytes() {
        Wm a2;
        return ((Km)a2.instance).getPathBytes();
    }

    public Wm clearPath() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.f((Km)((Km)wm.instance));
        return a2;
    }

    public Wm setRenderHint(uN uN2) {
        Wm a2;
        Wm b2 = uN2;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance), (uN)b2);
        return a2;
    }

    public boolean hasRenderHint() {
        Wm a2;
        return ((Km)a2.instance).hasRenderHint();
    }

    public nn getImageCase() {
        Wm a2;
        return ((Km)a2.instance).getImageCase();
    }

    public Wm setRenderHintValue(int n2) {
        Wm a2;
        int b2 = n2;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.C((Km)((Km)wm.instance), (int)b2);
        return a2;
    }

    public boolean hasResource() {
        Wm a2;
        return ((Km)a2.instance).hasResource();
    }

    public Wm clearHttpCacheDuration() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance));
        return a2;
    }

    public String getPath() {
        Wm a2;
        return ((Km)a2.instance).getPath();
    }

    public int getRenderHintValue() {
        Wm a2;
        return ((Km)a2.instance).getRenderHintValue();
    }

    public boolean getMemCache() {
        Wm a2;
        return ((Km)a2.instance).getMemCache();
    }

    public Wm setLoadingColor(int n2) {
        Wm a2;
        int b2 = n2;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance), (int)b2);
        return a2;
    }

    public boolean getGifStreaming() {
        Wm a2;
        return ((Km)a2.instance).getGifStreaming();
    }

    public float getGifSpeed() {
        Wm a2;
        return ((Km)a2.instance).getGifSpeed();
    }

    public Wm setGifStreaming(boolean bl) {
        Wm a2;
        boolean b2 = bl;
        Wm wm = a2 = this;
        wm.copyOnWrite();
        Km.J((Km)((Km)wm.instance), (boolean)b2);
        return a2;
    }

    public int getResource() {
        Wm a2;
        return ((Km)a2.instance).getResource();
    }

    public Wm clearImageData() {
        Wm a2;
        Wm wm = a2;
        wm.copyOnWrite();
        Km.G((Km)((Km)wm.instance));
        return a2;
    }
}

