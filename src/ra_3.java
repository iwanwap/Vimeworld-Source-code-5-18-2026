/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ra_3
extends MessageLiteOrBuilder {
    public boolean hasResource();

    public ByteString getUuid();

    public String getPath();

    public int getEntityId();

    public int getResource();

    public boolean hasPath();

    public ByteString getPathBytes();
}

