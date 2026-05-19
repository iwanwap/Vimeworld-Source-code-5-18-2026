/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MixinOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Mixin
extends GeneratedMessageLite<Mixin, Builder>
implements MixinOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_ = "";
    public static final int ROOT_FIELD_NUMBER = 2;
    private String root_ = "";
    private static final Mixin DEFAULT_INSTANCE;
    private static volatile Parser<Mixin> PARSER;

    private Mixin() {
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
        this.name_ = Mixin.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Mixin.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override
    public String getRoot() {
        return this.root_;
    }

    @Override
    public ByteString getRootBytes() {
        return ByteString.copyFromUtf8(this.root_);
    }

    private void setRoot(String value) {
        value.getClass();
        this.root_ = value;
    }

    private void clearRoot() {
        this.root_ = Mixin.getDefaultInstance().getRoot();
    }

    private void setRootBytes(ByteString value) {
        Mixin.checkByteStringIsUtf8(value);
        this.root_ = value.toStringUtf8();
    }

    public static Mixin parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Mixin parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Mixin parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Mixin parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Mixin parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Mixin parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Mixin parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Mixin parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Mixin parseDelimitedFrom(InputStream input) throws IOException {
        return Mixin.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Mixin parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Mixin.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Mixin parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Mixin parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Mixin prototype) {
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
                return new Mixin();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"name_", "root_"};
                String info = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208";
                return Mixin.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Mixin> parser = PARSER;
                if (parser != null) return parser;
                Class<Mixin> clazz = Mixin.class;
                synchronized (Mixin.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Mixin>(DEFAULT_INSTANCE);
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

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Mixin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Mixin defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Mixin();
        GeneratedMessageLite.registerDefaultInstance(Mixin.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Mixin, Builder>
    implements MixinOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getName() {
            return ((Mixin)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Mixin)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Mixin)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Mixin)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Mixin)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public String getRoot() {
            return ((Mixin)this.instance).getRoot();
        }

        @Override
        public ByteString getRootBytes() {
            return ((Mixin)this.instance).getRootBytes();
        }

        public Builder setRoot(String value) {
            this.copyOnWrite();
            ((Mixin)this.instance).setRoot(value);
            return this;
        }

        public Builder clearRoot() {
            this.copyOnWrite();
            ((Mixin)this.instance).clearRoot();
            return this;
        }

        public Builder setRootBytes(ByteString value) {
            this.copyOnWrite();
            ((Mixin)this.instance).setRootBytes(value);
            return this;
        }
    }
}

