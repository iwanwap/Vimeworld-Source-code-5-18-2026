/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32ValueOrBuilder;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int32Value
extends GeneratedMessageLite<Int32Value, Builder>
implements Int32ValueOrBuilder {
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;
    private static final Int32Value DEFAULT_INSTANCE;
    private static volatile Parser<Int32Value> PARSER;

    private Int32Value() {
    }

    @Override
    public int getValue() {
        return this.value_;
    }

    private void setValue(int value) {
        this.value_ = value;
    }

    private void clearValue() {
        this.value_ = 0;
    }

    public static Int32Value parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Int32Value parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Int32Value parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Int32Value parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Int32Value parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Int32Value parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Int32Value parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Int32Value parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Int32Value parseDelimitedFrom(InputStream input) throws IOException {
        return Int32Value.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Int32Value parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Int32Value.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Int32Value parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Int32Value parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Int32Value prototype) {
        return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Int32Value();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"value_"};
                String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004";
                return Int32Value.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Int32Value> parser = PARSER;
                if (parser != null) return parser;
                Class<Int32Value> clazz = Int32Value.class;
                synchronized (Int32Value.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Int32Value>(DEFAULT_INSTANCE);
                    // ** MonitorExit[var5_7] (shouldn't be in output)
                    return parser;
                }
            }
            case GET_MEMOIZED_IS_INITIALIZED: {
                return (byte)1;
            }
            case SET_MEMOIZED_IS_INITIALIZED: {
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Int32Value of(int value) {
        return (Int32Value)Int32Value.newBuilder().setValue(value).build();
    }

    public static Parser<Int32Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Int32Value defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Int32Value();
        GeneratedMessageLite.registerDefaultInstance(Int32Value.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Int32Value, Builder>
    implements Int32ValueOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public int getValue() {
            return ((Int32Value)this.instance).getValue();
        }

        public Builder setValue(int value) {
            this.copyOnWrite();
            ((Int32Value)this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((Int32Value)this.instance).clearValue();
            return this;
        }
    }
}

