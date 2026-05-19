/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ListValue;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;

public interface ValueOrBuilder
extends MessageLiteOrBuilder {
    public boolean hasNullValue();

    public int getNullValueValue();

    public NullValue getNullValue();

    public boolean hasNumberValue();

    public double getNumberValue();

    public boolean hasStringValue();

    public String getStringValue();

    public ByteString getStringValueBytes();

    public boolean hasBoolValue();

    public boolean getBoolValue();

    public boolean hasStructValue();

    public Struct getStructValue();

    public boolean hasListValue();

    public ListValue getListValue();

    public Value.KindCase getKindCase();
}

