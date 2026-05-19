/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Option
extends GeneratedMessageLite<Option, Builder>
implements OptionOrBuilder {
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_ = "";
    public static final int VALUE_FIELD_NUMBER = 2;
    private Any value_;
    private static final Option DEFAULT_INSTANCE;
    private static volatile Parser<Option> PARSER;

    private Option() {
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    private void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    private void clearName() {
        this.name_ = Option.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Option.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Any getValue() {
        return this.value_ == null ? Any.getDefaultInstance() : this.value_;
    }

    private void setValue(Any value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    private void mergeValue(Any value) {
        value.getClass();
        this.value_ = this.value_ != null && this.value_ != Any.getDefaultInstance() ? (Any)((Any.Builder)Any.newBuilder(this.value_).mergeFrom(value)).buildPartial() : value;
        this.bitField0_ |= 1;
    }

    private void clearValue() {
        this.value_ = null;
        this.bitField0_ &= 0xFFFFFFFE;
    }

    public static Option parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Option parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Option parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Option parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Option parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Option parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Option parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Option parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Option parseDelimitedFrom(InputStream input) throws IOException {
        return Option.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Option parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Option.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Option parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Option parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Option prototype) {
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
                return new Option();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_", "name_", "value_"};
                String info = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000";
                return Option.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Option> parser = PARSER;
                if (parser != null) return parser;
                Class<Option> clazz = Option.class;
                synchronized (Option.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Option>(DEFAULT_INSTANCE);
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

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Option defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Option();
        GeneratedMessageLite.registerDefaultInstance(Option.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Option, Builder>
    implements OptionOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getName() {
            return ((Option)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Option)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Option)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Option)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Option)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public boolean hasValue() {
            return ((Option)this.instance).hasValue();
        }

        @Override
        public Any getValue() {
            return ((Option)this.instance).getValue();
        }

        public Builder setValue(Any value) {
            this.copyOnWrite();
            ((Option)this.instance).setValue(value);
            return this;
        }

        public Builder setValue(Any.Builder builderForValue) {
            this.copyOnWrite();
            ((Option)this.instance).setValue((Any)builderForValue.build());
            return this;
        }

        public Builder mergeValue(Any value) {
            this.copyOnWrite();
            ((Option)this.instance).mergeValue(value);
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((Option)this.instance).clearValue();
            return this;
        }
    }
}

