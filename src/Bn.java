/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  da
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Bn
extends GeneratedMessageLite.Builder<Hm, Bn>
implements da {
    public String getNickname() {
        Bn a2;
        return ((Hm)a2.instance).getNickname();
    }

    public ByteString getLeggingsBytes() {
        Bn a2;
        return ((Hm)a2.instance).getLeggingsBytes();
    }

    public String getItemInHand() {
        Bn a2;
        return ((Hm)a2.instance).getItemInHand();
    }

    public String getBoots() {
        Bn a2;
        return ((Hm)a2.instance).getBoots();
    }

    public boolean hasScale() {
        Bn a2;
        return ((Hm)a2.instance).hasScale();
    }

    public ByteString getHelmetBytes() {
        Bn a2;
        return ((Hm)a2.instance).getHelmetBytes();
    }

    public boolean hasPitch() {
        Bn a2;
        return ((Hm)a2.instance).hasPitch();
    }

    public ByteString getUuid() {
        Bn a2;
        return ((Hm)a2.instance).getUuid();
    }

    public Bn clearItemInHand() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.d((Hm)bn2.instance);
        return a2;
    }

    public String getLeggings() {
        Bn a2;
        return ((Hm)a2.instance).getLeggings();
    }

    public Bn setScale(int n2) {
        Bn a2;
        int b2 = n2;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.J((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn clearFollowMouse() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.e((Hm)bn2.instance);
        return a2;
    }

    public Bn setLeggings(String string) {
        Bn a2;
        String b2 = string;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.C((Hm)bn2.instance, b2);
        return a2;
    }

    public boolean hasBoots() {
        Bn a2;
        return ((Hm)a2.instance).hasBoots();
    }

    public Bn clearScale() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.D((Hm)bn2.instance);
        return a2;
    }

    public ByteString getChestplateBytes() {
        Bn a2;
        return ((Hm)a2.instance).getChestplateBytes();
    }

    public Bn setNicknameBytes(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.C((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn setChestplateBytes(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.f((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn setYaw(float f2) {
        Bn a2;
        float b2 = f2;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.f((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn setLeggingsBytes(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.J((Hm)bn2.instance, b2);
        return a2;
    }

    public boolean hasUuid() {
        Bn a2;
        return ((Hm)a2.instance).hasUuid();
    }

    public String getHelmet() {
        Bn a2;
        return ((Hm)a2.instance).getHelmet();
    }

    public /* synthetic */ Bn(AN aN2) {
        Bn b2 = aN2;
        Bn a2 = this;
        a2();
    }

    public Bn setHelmetBytes(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.l((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn clearYaw() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.l((Hm)bn2.instance);
        return a2;
    }

    public ByteString getItemInHandBytes() {
        Bn a2;
        return ((Hm)a2.instance).getItemInHandBytes();
    }

    public boolean hasItemInHand() {
        Bn a2;
        return ((Hm)a2.instance).hasItemInHand();
    }

    public Bn setBootsBytes(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.M((Hm)bn2.instance, b2);
        return a2;
    }

    public boolean hasYaw() {
        Bn a2;
        return ((Hm)a2.instance).hasYaw();
    }

    public Bn setPitch(float f2) {
        Bn a2;
        float b2 = f2;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.J((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn clearChestplate() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.J((Hm)bn2.instance);
        return a2;
    }

    public Bn setNickname(String string) {
        Bn a2;
        String b2 = string;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.d((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn setUuid(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.d((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn clearUuid() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.f((Hm)bn2.instance);
        return a2;
    }

    public boolean hasLeggings() {
        Bn a2;
        return ((Hm)a2.instance).hasLeggings();
    }

    public Bn setItemInHandBytes(ByteString byteString) {
        Bn a2;
        ByteString b2 = byteString;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.e((Hm)bn2.instance, b2);
        return a2;
    }

    public boolean getFollowMouse() {
        Bn a2;
        return ((Hm)a2.instance).getFollowMouse();
    }

    public Bn setItemInHand(String string) {
        Bn a2;
        String b2 = string;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.l((Hm)bn2.instance, b2);
        return a2;
    }

    public float getYaw() {
        Bn a2;
        return ((Hm)a2.instance).getYaw();
    }

    public ByteString getBootsBytes() {
        Bn a2;
        return ((Hm)a2.instance).getBootsBytes();
    }

    public Bn clearNickname() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.i((Hm)bn2.instance);
        return a2;
    }

    public int getScale() {
        Bn a2;
        return ((Hm)a2.instance).getScale();
    }

    public Bn clearBoots() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.M((Hm)bn2.instance);
        return a2;
    }

    public Bn setHelmet(String string) {
        Bn a2;
        String b2 = string;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.f((Hm)bn2.instance, b2);
        return a2;
    }

    public boolean hasHelmet() {
        Bn a2;
        return ((Hm)a2.instance).hasHelmet();
    }

    public boolean hasFollowMouse() {
        Bn a2;
        return ((Hm)a2.instance).hasFollowMouse();
    }

    public Bn setBoots(String string) {
        Bn a2;
        String b2 = string;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.e((Hm)bn2.instance, b2);
        return a2;
    }

    public Bn clearPitch() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.C((Hm)bn2.instance);
        return a2;
    }

    public Bn setChestplate(String string) {
        Bn a2;
        String b2 = string;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.J((Hm)bn2.instance, b2);
        return a2;
    }

    public float getPitch() {
        Bn a2;
        return ((Hm)a2.instance).getPitch();
    }

    public String getChestplate() {
        Bn a2;
        return ((Hm)a2.instance).getChestplate();
    }

    public Bn clearLeggings() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.G((Hm)bn2.instance);
        return a2;
    }

    private Bn() {
        super(Hm.J());
        Bn a2;
    }

    public boolean hasNickname() {
        Bn a2;
        return ((Hm)a2.instance).hasNickname();
    }

    public Bn clearHelmet() {
        Bn a2;
        Bn bn2 = a2;
        bn2.copyOnWrite();
        Hm.A((Hm)bn2.instance);
        return a2;
    }

    public Bn setFollowMouse(boolean bl) {
        Bn a2;
        boolean b2 = bl;
        Bn bn2 = a2 = this;
        bn2.copyOnWrite();
        Hm.J((Hm)bn2.instance, b2);
        return a2;
    }

    public boolean hasChestplate() {
        Bn a2;
        return ((Hm)a2.instance).hasChestplate();
    }

    public ByteString getNicknameBytes() {
        Bn a2;
        return ((Hm)a2.instance).getNicknameBytes();
    }
}

