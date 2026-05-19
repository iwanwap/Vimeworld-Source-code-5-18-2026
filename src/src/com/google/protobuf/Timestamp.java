/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.TimestampOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Timestamp
extends GeneratedMessageLite<Timestamp, Builder>
implements TimestampOrBuilder {
    public static final int SECONDS_FIELD_NUMBER = 1;
    private long seconds_;
    public static final int NANOS_FIELD_NUMBER = 2;
    private int nanos_;
    private static final Timestamp DEFAULT_INSTANCE;
    private static volatile Parser<Timestamp> PARSER;

    private Timestamp() {
    }

    @Override
    public long getSeconds() {
        return this.seconds_;
    }

    private void setSeconds(long value) {
        this.seconds_ = value;
    }

    private void clearSeconds() {
        this.seconds_ = 0L;
    }

    @Override
    public int getNanos() {
        return this.nanos_;
    }

    private void setNanos(int value) {
        this.nanos_ = value;
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    public static Timestamp parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Timestamp parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Timestamp parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Timestamp parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Timestamp parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Timestamp parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Timestamp parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Timestamp parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Timestamp parseDelimitedFrom(InputStream input) throws IOException {
        return Timestamp.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Timestamp parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Timestamp.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Timestamp parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Timestamp parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Timestamp prototype) {
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
                return new Timestamp();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"seconds_", "nanos_"};
                String info = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004";
                return Timestamp.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Timestamp> parser = PARSER;
                if (parser != null) return parser;
                Class<Timestamp> clazz = Timestamp.class;
                synchronized (Timestamp.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Timestamp>(DEFAULT_INSTANCE);
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

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Timestamp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Timestamp defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Timestamp();
        GeneratedMessageLite.registerDefaultInstance(Timestamp.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Timestamp, Builder>
    implements TimestampOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public long getSeconds() {
            return ((Timestamp)this.instance).getSeconds();
        }

        public Builder setSeconds(long value) {
            this.copyOnWrite();
            ((Timestamp)this.instance).setSeconds(value);
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            ((Timestamp)this.instance).clearSeconds();
            return this;
        }

        @Override
        public int getNanos() {
            return ((Timestamp)this.instance).getNanos();
        }

        public Builder setNanos(int value) {
            this.copyOnWrite();
            ((Timestamp)this.instance).setNanos(value);
            return this;
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((Timestamp)this.instance).clearNanos();
            return this;
        }
    }
}

