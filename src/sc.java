/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface sc
extends MessageLiteOrBuilder {
    public ByteString getActionBytes();

    public ByteString getInfoBytes();

    public String getAction();

    public String getInfo();
}

