/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Any
extends GeneratedMessageLite<Any, Builder>
implements AnyOrBuilder {
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private String typeUrl_ = "";
    public static final int VALUE_FIELD_NUMBER = 2;
    private ByteString value_ = ByteString.EMPTY;
    private static final Any DEFAULT_INSTANCE;
    private static volatile Parser<Any> PARSER;

    private Any() {
    }

    @Override
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    private void setTypeUrl(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    private void clearTypeUrl() {
        this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
    }

    private void setTypeUrlBytes(ByteString value) {
        Any.checkByteStringIsUtf8(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    @Override
    public ByteString getValue() {
        return this.value_;
    }

    private void setValue(ByteString value) {
        Class<?> valueClass = value.getClass();
        this.value_ = value;
    }

    private void clearValue() {
        this.value_ = Any.getDefaultInstance().getValue();
    }

    public static Any parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Any parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Any parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Any parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Any parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Any parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Any parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Any parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Any parseDelimitedFrom(InputStream input) throws IOException {
        return Any.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Any parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Any.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Any parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Any parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Any prototype) {
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
                return new Any();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"typeUrl_", "value_"};
                String info = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\n";
                return Any.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Any> parser = PARSER;
                if (parser != null) return parser;
                Class<Any> clazz = Any.class;
                synchronized (Any.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Any>(DEFAULT_INSTANCE);
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

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Any> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Any defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Any();
        GeneratedMessageLite.registerDefaultInstance(Any.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Any, Builder>
    implements AnyOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getTypeUrl() {
            return ((Any)this.instance).getTypeUrl();
        }

        @Override
        public ByteString getTypeUrlBytes() {
            return ((Any)this.instance).getTypeUrlBytes();
        }

        public Builder setTypeUrl(String value) {
            this.copyOnWrite();
            ((Any)this.instance).setTypeUrl(value);
            return this;
        }

        public Builder clearTypeUrl() {
            this.copyOnWrite();
            ((Any)this.instance).clearTypeUrl();
            return this;
        }

        public Builder setTypeUrlBytes(ByteString value) {
            this.copyOnWrite();
            ((Any)this.instance).setTypeUrlBytes(value);
            return this;
        }

        @Override
        public ByteString getValue() {
            return ((Any)this.instance).getValue();
        }

        public Builder setValue(ByteString value) {
            this.copyOnWrite();
            ((Any)this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((Any)this.instance).clearValue();
            return this;
        }
    }
}

