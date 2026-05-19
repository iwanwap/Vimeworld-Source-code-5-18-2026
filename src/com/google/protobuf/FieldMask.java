/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldMaskOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class FieldMask
extends GeneratedMessageLite<FieldMask, Builder>
implements FieldMaskOrBuilder {
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_ = GeneratedMessageLite.emptyProtobufList();
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser<FieldMask> PARSER;

    private FieldMask() {
    }

    @Override
    public List<String> getPathsList() {
        return this.paths_;
    }

    @Override
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override
    public String getPaths(int index) {
        return (String)this.paths_.get(index);
    }

    @Override
    public ByteString getPathsBytes(int index) {
        return ByteString.copyFromUtf8((String)this.paths_.get(index));
    }

    private void ensurePathsIsMutable() {
        Internal.ProtobufList<String> tmp = this.paths_;
        if (!tmp.isModifiable()) {
            this.paths_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setPaths(int index, String value) {
        value.getClass();
        this.ensurePathsIsMutable();
        this.paths_.set(index, value);
    }

    private void addPaths(String value) {
        value.getClass();
        this.ensurePathsIsMutable();
        this.paths_.add(value);
    }

    private void addAllPaths(Iterable<String> values) {
        this.ensurePathsIsMutable();
        AbstractMessageLite.addAll(values, this.paths_);
    }

    private void clearPaths() {
        this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void addPathsBytes(ByteString value) {
        FieldMask.checkByteStringIsUtf8(value);
        this.ensurePathsIsMutable();
        this.paths_.add(value.toStringUtf8());
    }

    public static FieldMask parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FieldMask parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FieldMask parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FieldMask parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FieldMask parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FieldMask parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FieldMask parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FieldMask parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FieldMask parseDelimitedFrom(InputStream input) throws IOException {
        return FieldMask.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static FieldMask parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return FieldMask.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FieldMask parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FieldMask parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(FieldMask prototype) {
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
                return new FieldMask();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"paths_"};
                String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a";
                return FieldMask.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<FieldMask> parser = PARSER;
                if (parser != null) return parser;
                Class<FieldMask> clazz = FieldMask.class;
                synchronized (FieldMask.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FieldMask>(DEFAULT_INSTANCE);
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

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        FieldMask defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new FieldMask();
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<FieldMask, Builder>
    implements FieldMaskOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((FieldMask)this.instance).getPathsList());
        }

        @Override
        public int getPathsCount() {
            return ((FieldMask)this.instance).getPathsCount();
        }

        @Override
        public String getPaths(int index) {
            return ((FieldMask)this.instance).getPaths(index);
        }

        @Override
        public ByteString getPathsBytes(int index) {
            return ((FieldMask)this.instance).getPathsBytes(index);
        }

        public Builder setPaths(int index, String value) {
            this.copyOnWrite();
            ((FieldMask)this.instance).setPaths(index, value);
            return this;
        }

        public Builder addPaths(String value) {
            this.copyOnWrite();
            ((FieldMask)this.instance).addPaths(value);
            return this;
        }

        public Builder addAllPaths(Iterable<String> values) {
            this.copyOnWrite();
            ((FieldMask)this.instance).addAllPaths(values);
            return this;
        }

        public Builder clearPaths() {
            this.copyOnWrite();
            ((FieldMask)this.instance).clearPaths();
            return this;
        }

        public Builder addPathsBytes(ByteString value) {
            this.copyOnWrite();
            ((FieldMask)this.instance).addPathsBytes(value);
            return this;
        }
    }
}

