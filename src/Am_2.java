/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Aa
 *  Am
 *  Um
 *  en
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Am_2
extends GeneratedMessageLite.Builder<en, Am>
implements Aa {
    public Am clearDistance() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.d((en)((en)am_2.instance));
        return a2;
    }

    public Am clearY() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.j((en)((en)am_2.instance));
        return a2;
    }

    public Am clearStreaming() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.F((en)((en)am_2.instance));
        return a2;
    }

    public Am setRepeatDelay(int n2) {
        Am_2 a2;
        int b2 = n2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance), (int)b2);
        return a2;
    }

    public Am clearRepeat() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.l((en)((en)am_2.instance));
        return a2;
    }

    public Am setY(float f2) {
        Am_2 a2;
        float b2 = f2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.d((en)((en)am_2.instance), (float)b2);
        return a2;
    }

    public boolean getStreaming() {
        Am_2 a2;
        return ((en)a2.instance).getStreaming();
    }

    public boolean hasResource() {
        Am_2 a2;
        return ((en)a2.instance).hasResource();
    }

    public boolean hasPitch() {
        Am_2 a2;
        return ((en)a2.instance).hasPitch();
    }

    public Am setX(float f2) {
        Am_2 a2;
        float b2 = f2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.e((en)((en)am_2.instance), (float)b2);
        return a2;
    }

    public ByteString getIdBytes() {
        Am_2 a2;
        return ((en)a2.instance).getIdBytes();
    }

    public Am clearResource() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance));
        return a2;
    }

    public Am clearPitch() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.M((en)((en)am_2.instance));
        return a2;
    }

    public float getDistance() {
        Am_2 a2;
        return ((en)a2.instance).getDistance();
    }

    public String getPath() {
        Am_2 a2;
        return ((en)a2.instance).getPath();
    }

    public boolean hasStreaming() {
        Am_2 a2;
        return ((en)a2.instance).hasStreaming();
    }

    public /* synthetic */ Am_2(AN aN2) {
        Am_2 b2 = aN2;
        Am_2 a2 = this;
        a2();
    }

    public Am setPath(String string) {
        Am_2 a2;
        String b2 = string;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.f((en)((en)am_2.instance), (String)b2);
        return a2;
    }

    private Am_2() {
        super(en.f());
        Am_2 a2;
    }

    public boolean hasPath() {
        Am_2 a2;
        return ((en)a2.instance).hasPath();
    }

    public Am setPathBytes(ByteString byteString) {
        Am_2 a2;
        ByteString b2 = byteString;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance), (ByteString)b2);
        return a2;
    }

    public Am clearCategory() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.i((en)((en)am_2.instance));
        return a2;
    }

    public Am clearRepeatDelay() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.C((en)((en)am_2.instance));
        return a2;
    }

    public float getVolume() {
        Am_2 a2;
        return ((en)a2.instance).getVolume();
    }

    public int getCategoryValue() {
        Am_2 a2;
        return ((en)a2.instance).getCategoryValue();
    }

    public Am clearVolume() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.G((en)((en)am_2.instance));
        return a2;
    }

    public boolean hasZ() {
        Am_2 a2;
        return ((en)a2.instance).hasZ();
    }

    public Am setCategory(Um um2) {
        Am_2 a2;
        Am_2 b2 = um2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance), (Um)b2);
        return a2;
    }

    public float getPitch() {
        Am_2 a2;
        return ((en)a2.instance).getPitch();
    }

    public String getId() {
        Am_2 a2;
        return ((en)a2.instance).getId();
    }

    public Am setPitch(float f2) {
        Am_2 a2;
        float b2 = f2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.C((en)((en)am_2.instance), (float)b2);
        return a2;
    }

    public Am clearSound() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.D((en)((en)am_2.instance));
        return a2;
    }

    public boolean hasY() {
        Am_2 a2;
        return ((en)a2.instance).hasY();
    }

    public Um getCategory() {
        Am_2 a2;
        return ((en)a2.instance).getCategory();
    }

    public ByteString getPathBytes() {
        Am_2 a2;
        return ((en)a2.instance).getPathBytes();
    }

    public Am setRepeat(boolean bl) {
        Am_2 a2;
        boolean b2 = bl;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance), (boolean)b2);
        return a2;
    }

    public Am setDistance(float f2) {
        Am_2 a2;
        float b2 = f2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.l((en)((en)am_2.instance), (float)b2);
        return a2;
    }

    public float getZ() {
        Am_2 a2;
        return ((en)a2.instance).getZ();
    }

    public Am setCategoryValue(int n2) {
        Am_2 a2;
        int b2 = n2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.l((en)((en)am_2.instance), (int)b2);
        return a2;
    }

    public boolean hasRepeatDelay() {
        Am_2 a2;
        return ((en)a2.instance).hasRepeatDelay();
    }

    public Am clearZ() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.k((en)((en)am_2.instance));
        return a2;
    }

    public Am clearPath() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.A((en)((en)am_2.instance));
        return a2;
    }

    public int getRepeatDelay() {
        Am_2 a2;
        return ((en)a2.instance).getRepeatDelay();
    }

    public boolean hasCategory() {
        Am_2 a2;
        return ((en)a2.instance).hasCategory();
    }

    public Am setResource(int n2) {
        Am_2 a2;
        int b2 = n2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.f((en)((en)am_2.instance), (int)b2);
        return a2;
    }

    public boolean getRepeat() {
        Am_2 a2;
        return ((en)a2.instance).getRepeat();
    }

    public Am setVolume(float f2) {
        Am_2 a2;
        float b2 = f2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.f((en)((en)am_2.instance), (float)b2);
        return a2;
    }

    public boolean hasVolume() {
        Am_2 a2;
        return ((en)a2.instance).hasVolume();
    }

    public boolean hasRepeat() {
        Am_2 a2;
        return ((en)a2.instance).hasRepeat();
    }

    public float getX() {
        Am_2 a2;
        return ((en)a2.instance).getX();
    }

    public Am clearId() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.e((en)((en)am_2.instance));
        return a2;
    }

    public Am setStreaming(boolean bl) {
        Am_2 a2;
        boolean b2 = bl;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.f((en)((en)am_2.instance), (boolean)b2);
        return a2;
    }

    public boolean hasX() {
        Am_2 a2;
        return ((en)a2.instance).hasX();
    }

    public float getY() {
        Am_2 a2;
        return ((en)a2.instance).getY();
    }

    public Am setZ(float f2) {
        Am_2 a2;
        float b2 = f2;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance), (float)b2);
        return a2;
    }

    public boolean hasDistance() {
        Am_2 a2;
        return ((en)a2.instance).hasDistance();
    }

    public boolean hasId() {
        Am_2 a2;
        return ((en)a2.instance).hasId();
    }

    public tN getSoundCase() {
        Am_2 a2;
        return ((en)a2.instance).getSoundCase();
    }

    public int getResource() {
        Am_2 a2;
        return ((en)a2.instance).getResource();
    }

    public Am setIdBytes(ByteString byteString) {
        Am_2 a2;
        ByteString b2 = byteString;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.f((en)((en)am_2.instance), (ByteString)b2);
        return a2;
    }

    public Am clearX() {
        Am_2 a2;
        Am_2 am_2 = a2;
        am_2.copyOnWrite();
        en.f((en)((en)am_2.instance));
        return a2;
    }

    public Am setId(String string) {
        Am_2 a2;
        String b2 = string;
        Am_2 am_2 = a2 = this;
        am_2.copyOnWrite();
        en.J((en)((en)am_2.instance), (String)b2);
        return a2;
    }
}

