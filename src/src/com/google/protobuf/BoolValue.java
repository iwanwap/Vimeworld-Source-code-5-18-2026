/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.BoolValueOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BoolValue
extends GeneratedMessageLite<BoolValue, Builder>
implements BoolValueOrBuilder {
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile Parser<BoolValue> PARSER;

    private BoolValue() {
    }

    @Override
    public boolean getValue() {
        return this.value_;
    }

    private void setValue(boolean value) {
        this.value_ = value;
    }

    private void clearValue() {
        this.value_ = false;
    }

    public static BoolValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BoolValue parseDelimitedFrom(InputStream input) throws IOException {
        return BoolValue.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return BoolValue.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BoolValue parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BoolValue prototype) {
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
                return new BoolValue();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"value_"};
                String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007";
                return BoolValue.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<BoolValue> parser = PARSER;
                if (parser != null) return parser;
                Class<BoolValue> clazz = BoolValue.class;
                synchronized (BoolValue.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<BoolValue>(DEFAULT_INSTANCE);
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

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static BoolValue of(boolean value) {
        return (BoolValue)BoolValue.newBuilder().setValue(value).build();
    }

    public static Parser<BoolValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        BoolValue defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new BoolValue();
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BoolValue, Builder>
    implements BoolValueOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public boolean getValue() {
            return ((BoolValue)this.instance).getValue();
        }

        public Builder setValue(boolean value) {
            this.copyOnWrite();
            ((BoolValue)this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((BoolValue)this.instance).clearValue();
            return this;
        }
    }
}

