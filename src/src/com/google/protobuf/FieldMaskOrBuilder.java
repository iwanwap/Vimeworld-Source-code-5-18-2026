/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface FieldMaskOrBuilder
extends MessageLiteOrBuilder {
    public List<String> getPathsList();

    public int getPathsCount();

    public String getPaths(int var1);

    public ByteString getPathsBytes(int var1);
}

