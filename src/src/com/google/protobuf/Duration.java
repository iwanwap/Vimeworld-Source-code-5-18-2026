/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Duration
extends GeneratedMessageLite<Duration, Builder>
implements DurationOrBuilder {
    public static final int SECONDS_FIELD_NUMBER = 1;
    private long seconds_;
    public static final int NANOS_FIELD_NUMBER = 2;
    private int nanos_;
    private static final Duration DEFAULT_INSTANCE;
    private static volatile Parser<Duration> PARSER;

    private Duration() {
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

    public static Duration parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Duration parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Duration parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Duration parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Duration parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Duration parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Duration parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Duration parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Duration parseDelimitedFrom(InputStream input) throws IOException {
        return Duration.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Duration parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Duration.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Duration parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Duration parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Duration prototype) {
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
                return new Duration();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"seconds_", "nanos_"};
                String info = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004";
                return Duration.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Duration> parser = PARSER;
                if (parser != null) return parser;
                Class<Duration> clazz = Duration.class;
                synchronized (Duration.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Duration>(DEFAULT_INSTANCE);
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

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Duration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Duration defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Duration();
        GeneratedMessageLite.registerDefaultInstance(Duration.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Duration, Builder>
    implements DurationOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public long getSeconds() {
            return ((Duration)this.instance).getSeconds();
        }

        public Builder setSeconds(long value) {
            this.copyOnWrite();
            ((Duration)this.instance).setSeconds(value);
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            ((Duration)this.instance).clearSeconds();
            return this;
        }

        @Override
        public int getNanos() {
            return ((Duration)this.instance).getNanos();
        }

        public Builder setNanos(int value) {
            this.copyOnWrite();
            ((Duration)this.instance).setNanos(value);
            return this;
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((Duration)this.instance).clearNanos();
            return this;
        }
    }
}

