/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface aB_1
extends MessageLiteOrBuilder {
    public hn getValueCase();

    public String getStringVal();

    public boolean getNullVal();

    public float getFloatVal();

    public boolean hasNullVal();

    public boolean hasBoolVal();

    public boolean hasFloatVal();

    public boolean hasStringVal();

    public ByteString getNameBytes();

    public boolean getBoolVal();

    public String getName();

    public ByteString getStringValBytes();

    public long getLongVal();

    public boolean hasLongVal();
}

