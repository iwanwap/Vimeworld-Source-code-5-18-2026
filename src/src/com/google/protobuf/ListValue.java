/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValueOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Value;
import com.google.protobuf.ValueOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ListValue
extends GeneratedMessageLite<ListValue, Builder>
implements ListValueOrBuilder {
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = ListValue.emptyProtobufList();
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser<ListValue> PARSER;

    private ListValue() {
    }

    @Override
    public List<Value> getValuesList() {
        return this.values_;
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override
    public Value getValues(int index) {
        return (Value)this.values_.get(index);
    }

    public ValueOrBuilder getValuesOrBuilder(int index) {
        return (ValueOrBuilder)this.values_.get(index);
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Value> tmp = this.values_;
        if (!tmp.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setValues(int index, Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.set(index, value);
    }

    private void addValues(Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(value);
    }

    private void addValues(int index, Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(index, value);
    }

    private void addAllValues(Iterable<? extends Value> values) {
        this.ensureValuesIsMutable();
        AbstractMessageLite.addAll(values, this.values_);
    }

    private void clearValues() {
        this.values_ = ListValue.emptyProtobufList();
    }

    private void removeValues(int index) {
        this.ensureValuesIsMutable();
        this.values_.remove(index);
    }

    public static ListValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ListValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ListValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ListValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ListValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ListValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ListValue parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ListValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ListValue parseDelimitedFrom(InputStream input) throws IOException {
        return ListValue.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static ListValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return ListValue.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ListValue parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ListValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListValue prototype) {
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
                return new ListValue();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"values_", Value.class};
                String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return ListValue.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<ListValue> parser = PARSER;
                if (parser != null) return parser;
                Class<ListValue> clazz = ListValue.class;
                synchronized (ListValue.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<ListValue>(DEFAULT_INSTANCE);
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

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        ListValue defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new ListValue();
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListValue, Builder>
    implements ListValueOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ListValue)this.instance).getValuesList());
        }

        @Override
        public int getValuesCount() {
            return ((ListValue)this.instance).getValuesCount();
        }

        @Override
        public Value getValues(int index) {
            return ((ListValue)this.instance).getValues(index);
        }

        public Builder setValues(int index, Value value) {
            this.copyOnWrite();
            ((ListValue)this.instance).setValues(index, value);
            return this;
        }

        public Builder setValues(int index, Value.Builder builderForValue) {
            this.copyOnWrite();
            ((ListValue)this.instance).setValues(index, (Value)builderForValue.build());
            return this;
        }

        public Builder addValues(Value value) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(value);
            return this;
        }

        public Builder addValues(int index, Value value) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(index, value);
            return this;
        }

        public Builder addValues(Value.Builder builderForValue) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues((Value)builderForValue.build());
            return this;
        }

        public Builder addValues(int index, Value.Builder builderForValue) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(index, (Value)builderForValue.build());
            return this;
        }

        public Builder addAllValues(Iterable<? extends Value> values) {
            this.copyOnWrite();
            ((ListValue)this.instance).addAllValues(values);
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((ListValue)this.instance).clearValues();
            return this;
        }

        public Builder removeValues(int index) {
            this.copyOnWrite();
            ((ListValue)this.instance).removeValues(index);
            return this;
        }
    }
}

