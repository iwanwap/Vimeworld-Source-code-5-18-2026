/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.ValueOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value
extends GeneratedMessageLite<Value, Builder>
implements ValueOrBuilder {
    private int kindCase_ = 0;
    private Object kind_;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    private static final Value DEFAULT_INSTANCE;
    private static volatile Parser<Value> PARSER;

    private Value() {
    }

    @Override
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    private void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    @Override
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return (Integer)this.kind_;
        }
        return 0;
    }

    @Override
    public NullValue getNullValue() {
        if (this.kindCase_ == 1) {
            NullValue result = NullValue.forNumber((Integer)this.kind_);
            return result == null ? NullValue.UNRECOGNIZED : result;
        }
        return NullValue.NULL_VALUE;
    }

    private void setNullValueValue(int value) {
        this.kindCase_ = 1;
        this.kind_ = value;
    }

    private void setNullValue(NullValue value) {
        this.kind_ = value.getNumber();
        this.kindCase_ = 1;
    }

    private void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return (Double)this.kind_;
        }
        return 0.0;
    }

    private void setNumberValue(double value) {
        this.kindCase_ = 2;
        this.kind_ = value;
    }

    private void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override
    public String getStringValue() {
        String ref = "";
        if (this.kindCase_ == 3) {
            ref = (String)this.kind_;
        }
        return ref;
    }

    @Override
    public ByteString getStringValueBytes() {
        String ref = "";
        if (this.kindCase_ == 3) {
            ref = (String)this.kind_;
        }
        return ByteString.copyFromUtf8(ref);
    }

    private void setStringValue(String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    private void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void setStringValueBytes(ByteString value) {
        Value.checkByteStringIsUtf8(value);
        this.kind_ = value.toStringUtf8();
        this.kindCase_ = 3;
    }

    @Override
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return (Boolean)this.kind_;
        }
        return false;
    }

    private void setBoolValue(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = value;
    }

    private void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override
    public Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct)this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    private void setStructValue(Struct value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    private void mergeStructValue(Struct value) {
        value.getClass();
        this.kind_ = this.kindCase_ == 5 && this.kind_ != Struct.getDefaultInstance() ? ((Struct.Builder)Struct.newBuilder((Struct)this.kind_).mergeFrom(value)).buildPartial() : value;
        this.kindCase_ = 5;
    }

    private void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override
    public ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue)this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    private void setListValue(ListValue value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    private void mergeListValue(ListValue value) {
        value.getClass();
        this.kind_ = this.kindCase_ == 6 && this.kind_ != ListValue.getDefaultInstance() ? ((ListValue.Builder)ListValue.newBuilder((ListValue)this.kind_).mergeFrom(value)).buildPartial() : value;
        this.kindCase_ = 6;
    }

    private void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Value parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Value parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Value parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Value parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Value parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Value parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Value parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Value parseDelimitedFrom(InputStream input) throws IOException {
        return Value.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Value parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Value.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Value parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Value parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Value prototype) {
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
                return new Value();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class};
                String info = "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003\u023b\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000";
                return Value.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Value> parser = PARSER;
                if (parser != null) return parser;
                Class<Value> clazz = Value.class;
                synchronized (Value.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Value>(DEFAULT_INSTANCE);
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

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Value defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Value();
        GeneratedMessageLite.registerDefaultInstance(Value.class, defaultInstance);
    }

    public static enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        private KindCase(int value) {
            this.value = value;
        }

        @Deprecated
        public static KindCase valueOf(int value) {
            return KindCase.forNumber(value);
        }

        public static KindCase forNumber(int value) {
            switch (value) {
                case 1: {
                    return NULL_VALUE;
                }
                case 2: {
                    return NUMBER_VALUE;
                }
                case 3: {
                    return STRING_VALUE;
                }
                case 4: {
                    return BOOL_VALUE;
                }
                case 5: {
                    return STRUCT_VALUE;
                }
                case 6: {
                    return LIST_VALUE;
                }
                case 0: {
                    return KIND_NOT_SET;
                }
            }
            return null;
        }

        public int getNumber() {
            return this.value;
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Value, Builder>
    implements ValueOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public KindCase getKindCase() {
            return ((Value)this.instance).getKindCase();
        }

        public Builder clearKind() {
            this.copyOnWrite();
            ((Value)this.instance).clearKind();
            return this;
        }

        @Override
        public boolean hasNullValue() {
            return ((Value)this.instance).hasNullValue();
        }

        @Override
        public int getNullValueValue() {
            return ((Value)this.instance).getNullValueValue();
        }

        public Builder setNullValueValue(int value) {
            this.copyOnWrite();
            ((Value)this.instance).setNullValueValue(value);
            return this;
        }

        @Override
        public NullValue getNullValue() {
            return ((Value)this.instance).getNullValue();
        }

        public Builder setNullValue(NullValue value) {
            this.copyOnWrite();
            ((Value)this.instance).setNullValue(value);
            return this;
        }

        public Builder clearNullValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearNullValue();
            return this;
        }

        @Override
        public boolean hasNumberValue() {
            return ((Value)this.instance).hasNumberValue();
        }

        @Override
        public double getNumberValue() {
            return ((Value)this.instance).getNumberValue();
        }

        public Builder setNumberValue(double value) {
            this.copyOnWrite();
            ((Value)this.instance).setNumberValue(value);
            return this;
        }

        public Builder clearNumberValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearNumberValue();
            return this;
        }

        @Override
        public boolean hasStringValue() {
            return ((Value)this.instance).hasStringValue();
        }

        @Override
        public String getStringValue() {
            return ((Value)this.instance).getStringValue();
        }

        @Override
        public ByteString getStringValueBytes() {
            return ((Value)this.instance).getStringValueBytes();
        }

        public Builder setStringValue(String value) {
            this.copyOnWrite();
            ((Value)this.instance).setStringValue(value);
            return this;
        }

        public Builder clearStringValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearStringValue();
            return this;
        }

        public Builder setStringValueBytes(ByteString value) {
            this.copyOnWrite();
            ((Value)this.instance).setStringValueBytes(value);
            return this;
        }

        @Override
        public boolean hasBoolValue() {
            return ((Value)this.instance).hasBoolValue();
        }

        @Override
        public boolean getBoolValue() {
            return ((Value)this.instance).getBoolValue();
        }

        public Builder setBoolValue(boolean value) {
            this.copyOnWrite();
            ((Value)this.instance).setBoolValue(value);
            return this;
        }

        public Builder clearBoolValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearBoolValue();
            return this;
        }

        @Override
        public boolean hasStructValue() {
            return ((Value)this.instance).hasStructValue();
        }

        @Override
        public Struct getStructValue() {
            return ((Value)this.instance).getStructValue();
        }

        public Builder setStructValue(Struct value) {
            this.copyOnWrite();
            ((Value)this.instance).setStructValue(value);
            return this;
        }

        public Builder setStructValue(Struct.Builder builderForValue) {
            this.copyOnWrite();
            ((Value)this.instance).setStructValue((Struct)builderForValue.build());
            return this;
        }

        public Builder mergeStructValue(Struct value) {
            this.copyOnWrite();
            ((Value)this.instance).mergeStructValue(value);
            return this;
        }

        public Builder clearStructValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearStructValue();
            return this;
        }

        @Override
        public boolean hasListValue() {
            return ((Value)this.instance).hasListValue();
        }

        @Override
        public ListValue getListValue() {
            return ((Value)this.instance).getListValue();
        }

        public Builder setListValue(ListValue value) {
            this.copyOnWrite();
            ((Value)this.instance).setListValue(value);
            return this;
        }

        public Builder setListValue(ListValue.Builder builderForValue) {
            this.copyOnWrite();
            ((Value)this.instance).setListValue((ListValue)builderForValue.build());
            return this;
        }

        public Builder mergeListValue(ListValue value) {
            this.copyOnWrite();
            ((Value)this.instance).mergeListValue(value);
            return this;
        }

        public Builder clearListValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearListValue();
            return this;
        }
    }
}

