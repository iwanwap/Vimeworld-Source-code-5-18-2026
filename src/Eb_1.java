/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface Eb_1
extends MessageLiteOrBuilder {
    public boolean hasResource();

    public long getDuration();

    public boolean hasPath();

    public int getResource();

    public String getPath();

    public ByteString getPathBytes();

    public boolean hasDuration();
}

