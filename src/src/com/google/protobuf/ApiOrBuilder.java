/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import java.util.List;

public interface ApiOrBuilder
extends MessageLiteOrBuilder {
    public String getName();

    public ByteString getNameBytes();

    public List<Method> getMethodsList();

    public Method getMethods(int var1);

    public int getMethodsCount();

    public List<Option> getOptionsList();

    public Option getOptions(int var1);

    public int getOptionsCount();

    public String getVersion();

    public ByteString getVersionBytes();

    public boolean hasSourceContext();

    public SourceContext getSourceContext();

    public List<Mixin> getMixinsList();

    public Mixin getMixins(int var1);

    public int getMixinsCount();

    public int getSyntaxValue();

    public Syntax getSyntax();
}

