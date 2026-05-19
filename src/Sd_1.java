/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface Sd_1
extends MessageLiteOrBuilder {
    public long getSequenceNumber();

    public String getPlayer();

    public ByteString getData();

    public ByteString getPlayerBytes();

    public int getAudioSession();
}

