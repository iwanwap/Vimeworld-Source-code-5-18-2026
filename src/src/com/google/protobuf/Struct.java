/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.Value;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class Struct
extends GeneratedMessageLite<Struct, Builder>
implements StructOrBuilder {
    public static final int FIELDS_FIELD_NUMBER = 1;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();
    private static final Struct DEFAULT_INSTANCE;
    private static volatile Parser<Struct> PARSER;

    private Struct() {
    }

    private MapFieldLite<String, Value> internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    @Override
    public int getFieldsCount() {
        return this.internalGetFields().size();
    }

    @Override
    public boolean containsFields(String key) {
        Class<?> keyClass = key.getClass();
        return this.internalGetFields().containsKey(key);
    }

    @Override
    @Deprecated
    public Map<String, Value> getFields() {
        return this.getFieldsMap();
    }

    @Override
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(this.internalGetFields());
    }

    @Override
    public Value getFieldsOrDefault(String key, Value defaultValue) {
        Class<?> keyClass = key.getClass();
        MapFieldLite<String, Value> map = this.internalGetFields();
        return map.containsKey(key) ? (Value)map.get(key) : defaultValue;
    }

    @Override
    public Value getFieldsOrThrow(String key) {
        Class<?> keyClass = key.getClass();
        MapFieldLite<String, Value> map = this.internalGetFields();
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return (Value)map.get(key);
    }

    private Map<String, Value> getMutableFieldsMap() {
        return this.internalGetMutableFields();
    }

    public static Struct parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Struct parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Struct parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Struct parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Struct parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Struct parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Struct parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Struct parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Struct parseDelimitedFrom(InputStream input) throws IOException {
        return Struct.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Struct parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Struct.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Struct parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Struct parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Struct prototype) {
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
                return new Struct();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"fields_", FieldsDefaultEntryHolder.defaultEntry};
                String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012";
                return Struct.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Struct> parser = PARSER;
                if (parser != null) return parser;
                Class<Struct> clazz = Struct.class;
                synchronized (Struct.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Struct>(DEFAULT_INSTANCE);
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

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Struct defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Struct();
        GeneratedMessageLite.registerDefaultInstance(Struct.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Struct, Builder>
    implements StructOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public int getFieldsCount() {
            return ((Struct)this.instance).getFieldsMap().size();
        }

        @Override
        public boolean containsFields(String key) {
            Class<?> keyClass = key.getClass();
            return ((Struct)this.instance).getFieldsMap().containsKey(key);
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public Builder removeFields(String key) {
            Class<?> keyClass = key.getClass();
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().remove(key);
            return this;
        }

        @Override
        @Deprecated
        public Map<String, Value> getFields() {
            return this.getFieldsMap();
        }

        @Override
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Struct)this.instance).getFieldsMap());
        }

        @Override
        public Value getFieldsOrDefault(String key, Value defaultValue) {
            Class<?> keyClass = key.getClass();
            Map<String, Value> map = ((Struct)this.instance).getFieldsMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }

        @Override
        public Value getFieldsOrThrow(String key) {
            Class<?> keyClass = key.getClass();
            Map<String, Value> map = ((Struct)this.instance).getFieldsMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }

        public Builder putFields(String key, Value value) {
            Class<?> keyClass = key.getClass();
            Class<?> valueClass = value.getClass();
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().put(key, value);
            return this;
        }

        public Builder putAllFields(Map<String, Value> values) {
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().putAll(values);
            return this;
        }
    }

    private static final class FieldsDefaultEntryHolder {
        static final MapEntryLite<String, Value> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }
}

