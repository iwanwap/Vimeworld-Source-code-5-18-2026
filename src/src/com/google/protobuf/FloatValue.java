/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FloatValue
extends GeneratedMessageLite<FloatValue, Builder>
implements FloatValueOrBuilder {
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile Parser<FloatValue> PARSER;

    private FloatValue() {
    }

    @Override
    public float getValue() {
        return this.value_;
    }

    private void setValue(float value) {
        this.value_ = value;
    }

    private void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FloatValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FloatValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FloatValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FloatValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FloatValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FloatValue parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FloatValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FloatValue parseDelimitedFrom(InputStream input) throws IOException {
        return FloatValue.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static FloatValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return FloatValue.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FloatValue parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FloatValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(FloatValue prototype) {
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
                return new FloatValue();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"value_"};
                String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001";
                return FloatValue.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<FloatValue> parser = PARSER;
                if (parser != null) return parser;
                Class<FloatValue> clazz = FloatValue.class;
                synchronized (FloatValue.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FloatValue>(DEFAULT_INSTANCE);
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

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static FloatValue of(float value) {
        return (FloatValue)FloatValue.newBuilder().setValue(value).build();
    }

    public static Parser<FloatValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        FloatValue defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new FloatValue();
        GeneratedMessageLite.registerDefaultInstance(FloatValue.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<FloatValue, Builder>
    implements FloatValueOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public float getValue() {
            return ((FloatValue)this.instance).getValue();
        }

        public Builder setValue(float value) {
            this.copyOnWrite();
            ((FloatValue)this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((FloatValue)this.instance).clearValue();
            return this;
        }
    }
}

