/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Sd
 *  spa
 *  vra
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class spa_2
extends GeneratedMessageLite.Builder<Dra, spa>
implements Sd {
    public ByteString getData() {
        spa_2 a2;
        return ((Dra)a2.instance).getData();
    }

    public spa setAudioSession(int n2) {
        spa_2 a2;
        int b2 = n2;
        spa_2 spa_22 = a2 = this;
        spa_22.copyOnWrite();
        Dra.J((Dra)spa_22.instance, b2);
        return a2;
    }

    public spa clearPlayer() {
        spa_2 a2;
        spa_2 spa_22 = a2;
        spa_22.copyOnWrite();
        Dra.l((Dra)spa_22.instance);
        return a2;
    }

    public ByteString getPlayerBytes() {
        spa_2 a2;
        return ((Dra)a2.instance).getPlayerBytes();
    }

    public spa clearData() {
        spa_2 a2;
        spa_2 spa_22 = a2;
        spa_22.copyOnWrite();
        Dra.J((Dra)spa_22.instance);
        return a2;
    }

    public int getAudioSession() {
        spa_2 a2;
        return ((Dra)a2.instance).getAudioSession();
    }

    public spa setData(ByteString byteString) {
        spa_2 a2;
        ByteString b2 = byteString;
        spa_2 spa_22 = a2 = this;
        spa_22.copyOnWrite();
        Dra.J((Dra)spa_22.instance, b2);
        return a2;
    }

    public spa clearSequenceNumber() {
        spa_2 a2;
        spa_2 spa_22 = a2;
        spa_22.copyOnWrite();
        Dra.f((Dra)spa_22.instance);
        return a2;
    }

    public long getSequenceNumber() {
        spa_2 a2;
        return ((Dra)a2.instance).getSequenceNumber();
    }

    public spa clearAudioSession() {
        spa_2 a2;
        spa_2 spa_22 = a2;
        spa_22.copyOnWrite();
        Dra.C((Dra)spa_22.instance);
        return a2;
    }

    public String getPlayer() {
        spa_2 a2;
        return ((Dra)a2.instance).getPlayer();
    }

    private spa_2() {
        super(Dra.f());
        spa_2 a2;
    }

    public spa setSequenceNumber(long a2) {
        spa_2 b2;
        spa_2 spa_22 = b2;
        spa_22.copyOnWrite();
        Dra.J((Dra)spa_22.instance, a2);
        return b2;
    }

    public /* synthetic */ spa_2(vra vra2) {
        spa_2 b2 = vra2;
        spa_2 a2 = this;
        a2();
    }

    public spa setPlayerBytes(ByteString byteString) {
        spa_2 a2;
        ByteString b2 = byteString;
        spa_2 spa_22 = a2 = this;
        spa_22.copyOnWrite();
        Dra.f((Dra)spa_22.instance, b2);
        return a2;
    }

    public spa setPlayer(String string) {
        spa_2 a2;
        String b2 = string;
        spa_2 spa_22 = a2 = this;
        spa_22.copyOnWrite();
        Dra.J((Dra)spa_22.instance, b2);
        return a2;
    }
}

