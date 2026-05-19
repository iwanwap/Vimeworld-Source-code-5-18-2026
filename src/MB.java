/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface MB
extends MessageLiteOrBuilder {
    public int getTextColor();

    public int getHoverColor();

    public ByteString getTextBytes();

    public String getText();

    public boolean hasTextColor();

    public boolean hasHoverColor();
}

