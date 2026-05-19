/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface T_1
extends MessageLiteOrBuilder {
    public ByteString getEnterCallback();

    public boolean hasChangeCallback();

    public boolean hasPlaceholderColor();

    public boolean hasPassword();

    public ByteString getPlaceholderBytes();

    public boolean getMultiline();

    public int getPlaceholderColor();

    public boolean hasPlaceholder();

    public boolean hasAllowRegexp();

    public boolean hasMaxLength();

    public String getAllowRegexp();

    public boolean hasMultiline();

    public ByteString getAllowRegexpBytes();

    public boolean getPassword();

    public String getPlaceholder();

    public int getMaxLength();

    public boolean hasEnterCallback();

    public ByteString getChangeCallback();
}

