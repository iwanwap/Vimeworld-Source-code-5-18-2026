/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ro
 *  vn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ia
extends MessageLiteOrBuilder {
    public Ro getAction();

    public boolean hasMessage();

    public ByteString getUrlBytes();

    public ByteString getCallback();

    public String getMessage();

    public boolean hasUrl();

    public int getActionValue();

    public boolean hasCallback();

    public vn getDataCase();

    public String getUrl();

    public ByteString getMessageBytes();
}

