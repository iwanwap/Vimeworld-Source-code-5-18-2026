/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mra
 *  UQa
 *  YQa
 *  wB
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class YQa_3
extends GeneratedMessageLite.Builder<Mra, YQa>
implements wB {
    public ByteString getPlayerBytes() {
        YQa_3 a2;
        return ((Mra)a2.instance).getPlayerBytes();
    }

    public YQa setPlayerBytes(ByteString byteString) {
        YQa_3 a2;
        ByteString b2 = byteString;
        YQa_3 yQa_3 = a2 = this;
        yQa_3.copyOnWrite();
        Mra.J((Mra)((Mra)yQa_3.instance), (ByteString)b2);
        return a2;
    }

    private YQa_3() {
        super(Mra.f());
        YQa_3 a2;
    }

    public YQa clearPlayer() {
        YQa_3 a2;
        YQa_3 yQa_3 = a2;
        yQa_3.copyOnWrite();
        Mra.J((Mra)((Mra)yQa_3.instance));
        return a2;
    }

    public YQa clearAudioSession() {
        YQa_3 a2;
        YQa_3 yQa_3 = a2;
        yQa_3.copyOnWrite();
        Mra.f((Mra)((Mra)yQa_3.instance));
        return a2;
    }

    public /* synthetic */ YQa_3(UQa uQa2) {
        YQa_3 b2 = uQa2;
        YQa_3 a2 = this;
        a2();
    }

    public String getPlayer() {
        YQa_3 a2;
        return ((Mra)a2.instance).getPlayer();
    }

    public YQa setAudioSession(int n2) {
        YQa_3 a2;
        int b2 = n2;
        YQa_3 yQa_3 = a2 = this;
        yQa_3.copyOnWrite();
        Mra.J((Mra)((Mra)yQa_3.instance), (int)b2);
        return a2;
    }

    public int getAudioSession() {
        YQa_3 a2;
        return ((Mra)a2.instance).getAudioSession();
    }

    public YQa setPlayer(String string) {
        YQa_3 a2;
        String b2 = string;
        YQa_3 yQa_3 = a2 = this;
        yQa_3.copyOnWrite();
        Mra.J((Mra)((Mra)yQa_3.instance), (String)b2);
        return a2;
    }
}

