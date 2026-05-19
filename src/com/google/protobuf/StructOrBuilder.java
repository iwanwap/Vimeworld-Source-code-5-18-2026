/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Value;
import java.util.Map;

public interface StructOrBuilder
extends MessageLiteOrBuilder {
    public int getFieldsCount();

    public boolean containsFields(String var1);

    @Deprecated
    public Map<String, Value> getFields();

    public Map<String, Value> getFieldsMap();

    public Value getFieldsOrDefault(String var1, Value var2);

    public Value getFieldsOrThrow(String var1);
}

