/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Field
extends GeneratedMessageLite<Field, Builder>
implements FieldOrBuilder {
    public static final int KIND_FIELD_NUMBER = 1;
    private int kind_;
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private int cardinality_;
    public static final int NUMBER_FIELD_NUMBER = 3;
    private int number_;
    public static final int NAME_FIELD_NUMBER = 4;
    private String name_ = "";
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private String typeUrl_ = "";
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    private int oneofIndex_;
    public static final int PACKED_FIELD_NUMBER = 8;
    private boolean packed_;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    private Internal.ProtobufList<Option> options_ = Field.emptyProtobufList();
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    private String jsonName_ = "";
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    private String defaultValue_ = "";
    private static final Field DEFAULT_INSTANCE;
    private static volatile Parser<Field> PARSER;

    private Field() {
    }

    @Override
    public int getKindValue() {
        return this.kind_;
    }

    @Override
    public Kind getKind() {
        Kind result = Kind.forNumber(this.kind_);
        return result == null ? Kind.UNRECOGNIZED : result;
    }

    private void setKindValue(int value) {
        this.kind_ = value;
    }

    private void setKind(Kind value) {
        this.kind_ = value.getNumber();
    }

    private void clearKind() {
        this.kind_ = 0;
    }

    @Override
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override
    public Cardinality getCardinality() {
        Cardinality result = Cardinality.forNumber(this.cardinality_);
        return result == null ? Cardinality.UNRECOGNIZED : result;
    }

    private void setCardinalityValue(int value) {
        this.cardinality_ = value;
    }

    private void setCardinality(Cardinality value) {
        this.cardinality_ = value.getNumber();
    }

    private void clearCardinality() {
        this.cardinality_ = 0;
    }

    @Override
    public int getNumber() {
        return this.number_;
    }

    private void setNumber(int value) {
        this.number_ = value;
    }

    private void clearNumber() {
        this.number_ = 0;
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
        this.name_ = Field.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Field.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
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
        this.typeUrl_ = Field.getDefaultInstance().getTypeUrl();
    }

    private void setTypeUrlBytes(ByteString value) {
        Field.checkByteStringIsUtf8(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    @Override
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    private void setOneofIndex(int value) {
        this.oneofIndex_ = value;
    }

    private void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    @Override
    public boolean getPacked() {
        return this.packed_;
    }

    private void setPacked(boolean value) {
        this.packed_ = value;
    }

    private void clearPacked() {
        this.packed_ = false;
    }

    @Override
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override
    public Option getOptions(int index) {
        return (Option)this.options_.get(index);
    }

    public OptionOrBuilder getOptionsOrBuilder(int index) {
        return (OptionOrBuilder)this.options_.get(index);
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> tmp = this.options_;
        if (!tmp.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setOptions(int index, Option value) {
        value.getClass();
        this.ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    private void addOptions(Option value) {
        value.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(value);
    }

    private void addOptions(int index, Option value) {
        value.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    private void addAllOptions(Iterable<? extends Option> values) {
        this.ensureOptionsIsMutable();
        AbstractMessageLite.addAll(values, this.options_);
    }

    private void clearOptions() {
        this.options_ = Field.emptyProtobufList();
    }

    private void removeOptions(int index) {
        this.ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    @Override
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override
    public ByteString getJsonNameBytes() {
        return ByteString.copyFromUtf8(this.jsonName_);
    }

    private void setJsonName(String value) {
        value.getClass();
        this.jsonName_ = value;
    }

    private void clearJsonName() {
        this.jsonName_ = Field.getDefaultInstance().getJsonName();
    }

    private void setJsonNameBytes(ByteString value) {
        Field.checkByteStringIsUtf8(value);
        this.jsonName_ = value.toStringUtf8();
    }

    @Override
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override
    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
    }

    private void setDefaultValue(String value) {
        value.getClass();
        this.defaultValue_ = value;
    }

    private void clearDefaultValue() {
        this.defaultValue_ = Field.getDefaultInstance().getDefaultValue();
    }

    private void setDefaultValueBytes(ByteString value) {
        Field.checkByteStringIsUtf8(value);
        this.defaultValue_ = value.toStringUtf8();
    }

    public static Field parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Field parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Field parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Field parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Field parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Field parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Field parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Field parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Field parseDelimitedFrom(InputStream input) throws IOException {
        return Field.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Field parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Field.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Field parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Field parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Field prototype) {
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
                return new Field();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"};
                String info = "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004\u0208\u0006\u0208\u0007\u0004\b\u0007\t\u001b\n\u0208\u000b\u0208";
                return Field.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Field> parser = PARSER;
                if (parser != null) return parser;
                Class<Field> clazz = Field.class;
                synchronized (Field.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Field>(DEFAULT_INSTANCE);
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

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Field defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Field();
        GeneratedMessageLite.registerDefaultInstance(Field.class, defaultInstance);
    }

    public static enum Cardinality implements Internal.EnumLite
    {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        private static final Internal.EnumLiteMap<Cardinality> internalValueMap;
        private final int value;

        @Override
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Cardinality valueOf(int value) {
            return Cardinality.forNumber(value);
        }

        public static Cardinality forNumber(int value) {
            switch (value) {
                case 0: {
                    return CARDINALITY_UNKNOWN;
                }
                case 1: {
                    return CARDINALITY_OPTIONAL;
                }
                case 2: {
                    return CARDINALITY_REQUIRED;
                }
                case 3: {
                    return CARDINALITY_REPEATED;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return CardinalityVerifier.INSTANCE;
        }

        private Cardinality(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Cardinality>(){

                @Override
                public Cardinality findValueByNumber(int number) {
                    return Cardinality.forNumber(number);
                }
            };
        }

        private static final class CardinalityVerifier
        implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new CardinalityVerifier();

            private CardinalityVerifier() {
            }

            @Override
            public boolean isInRange(int number) {
                return Cardinality.forNumber(number) != null;
            }
        }
    }

    public static enum Kind implements Internal.EnumLite
    {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_UNKNOWN_VALUE = 0;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        private static final Internal.EnumLiteMap<Kind> internalValueMap;
        private final int value;

        @Override
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Kind valueOf(int value) {
            return Kind.forNumber(value);
        }

        public static Kind forNumber(int value) {
            switch (value) {
                case 0: {
                    return TYPE_UNKNOWN;
                }
                case 1: {
                    return TYPE_DOUBLE;
                }
                case 2: {
                    return TYPE_FLOAT;
                }
                case 3: {
                    return TYPE_INT64;
                }
                case 4: {
                    return TYPE_UINT64;
                }
                case 5: {
                    return TYPE_INT32;
                }
                case 6: {
                    return TYPE_FIXED64;
                }
                case 7: {
                    return TYPE_FIXED32;
                }
                case 8: {
                    return TYPE_BOOL;
                }
                case 9: {
                    return TYPE_STRING;
                }
                case 10: {
                    return TYPE_GROUP;
                }
                case 11: {
                    return TYPE_MESSAGE;
                }
                case 12: {
                    return TYPE_BYTES;
                }
                case 13: {
                    return TYPE_UINT32;
                }
                case 14: {
                    return TYPE_ENUM;
                }
                case 15: {
                    return TYPE_SFIXED32;
                }
                case 16: {
                    return TYPE_SFIXED64;
                }
                case 17: {
                    return TYPE_SINT32;
                }
                case 18: {
                    return TYPE_SINT64;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return KindVerifier.INSTANCE;
        }

        private Kind(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Kind>(){

                @Override
                public Kind findValueByNumber(int number) {
                    return Kind.forNumber(number);
                }
            };
        }

        private static final class KindVerifier
        implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new KindVerifier();

            private KindVerifier() {
            }

            @Override
            public boolean isInRange(int number) {
                return Kind.forNumber(number) != null;
            }
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Field, Builder>
    implements FieldOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public int getKindValue() {
            return ((Field)this.instance).getKindValue();
        }

        public Builder setKindValue(int value) {
            this.copyOnWrite();
            ((Field)this.instance).setKindValue(value);
            return this;
        }

        @Override
        public Kind getKind() {
            return ((Field)this.instance).getKind();
        }

        public Builder setKind(Kind value) {
            this.copyOnWrite();
            ((Field)this.instance).setKind(value);
            return this;
        }

        public Builder clearKind() {
            this.copyOnWrite();
            ((Field)this.instance).clearKind();
            return this;
        }

        @Override
        public int getCardinalityValue() {
            return ((Field)this.instance).getCardinalityValue();
        }

        public Builder setCardinalityValue(int value) {
            this.copyOnWrite();
            ((Field)this.instance).setCardinalityValue(value);
            return this;
        }

        @Override
        public Cardinality getCardinality() {
            return ((Field)this.instance).getCardinality();
        }

        public Builder setCardinality(Cardinality value) {
            this.copyOnWrite();
            ((Field)this.instance).setCardinality(value);
            return this;
        }

        public Builder clearCardinality() {
            this.copyOnWrite();
            ((Field)this.instance).clearCardinality();
            return this;
        }

        @Override
        public int getNumber() {
            return ((Field)this.instance).getNumber();
        }

        public Builder setNumber(int value) {
            this.copyOnWrite();
            ((Field)this.instance).setNumber(value);
            return this;
        }

        public Builder clearNumber() {
            this.copyOnWrite();
            ((Field)this.instance).clearNumber();
            return this;
        }

        @Override
        public String getName() {
            return ((Field)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Field)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Field)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Field)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Field)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public String getTypeUrl() {
            return ((Field)this.instance).getTypeUrl();
        }

        @Override
        public ByteString getTypeUrlBytes() {
            return ((Field)this.instance).getTypeUrlBytes();
        }

        public Builder setTypeUrl(String value) {
            this.copyOnWrite();
            ((Field)this.instance).setTypeUrl(value);
            return this;
        }

        public Builder clearTypeUrl() {
            this.copyOnWrite();
            ((Field)this.instance).clearTypeUrl();
            return this;
        }

        public Builder setTypeUrlBytes(ByteString value) {
            this.copyOnWrite();
            ((Field)this.instance).setTypeUrlBytes(value);
            return this;
        }

        @Override
        public int getOneofIndex() {
            return ((Field)this.instance).getOneofIndex();
        }

        public Builder setOneofIndex(int value) {
            this.copyOnWrite();
            ((Field)this.instance).setOneofIndex(value);
            return this;
        }

        public Builder clearOneofIndex() {
            this.copyOnWrite();
            ((Field)this.instance).clearOneofIndex();
            return this;
        }

        @Override
        public boolean getPacked() {
            return ((Field)this.instance).getPacked();
        }

        public Builder setPacked(boolean value) {
            this.copyOnWrite();
            ((Field)this.instance).setPacked(value);
            return this;
        }

        public Builder clearPacked() {
            this.copyOnWrite();
            ((Field)this.instance).clearPacked();
            return this;
        }

        @Override
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Field)this.instance).getOptionsList());
        }

        @Override
        public int getOptionsCount() {
            return ((Field)this.instance).getOptionsCount();
        }

        @Override
        public Option getOptions(int index) {
            return ((Field)this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            this.copyOnWrite();
            ((Field)this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Field)this.instance).setOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            this.copyOnWrite();
            ((Field)this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            this.copyOnWrite();
            ((Field)this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Field)this.instance).addOptions((Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Field)this.instance).addOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            this.copyOnWrite();
            ((Field)this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((Field)this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            this.copyOnWrite();
            ((Field)this.instance).removeOptions(index);
            return this;
        }

        @Override
        public String getJsonName() {
            return ((Field)this.instance).getJsonName();
        }

        @Override
        public ByteString getJsonNameBytes() {
            return ((Field)this.instance).getJsonNameBytes();
        }

        public Builder setJsonName(String value) {
            this.copyOnWrite();
            ((Field)this.instance).setJsonName(value);
            return this;
        }

        public Builder clearJsonName() {
            this.copyOnWrite();
            ((Field)this.instance).clearJsonName();
            return this;
        }

        public Builder setJsonNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Field)this.instance).setJsonNameBytes(value);
            return this;
        }

        @Override
        public String getDefaultValue() {
            return ((Field)this.instance).getDefaultValue();
        }

        @Override
        public ByteString getDefaultValueBytes() {
            return ((Field)this.instance).getDefaultValueBytes();
        }

        public Builder setDefaultValue(String value) {
            this.copyOnWrite();
            ((Field)this.instance).setDefaultValue(value);
            return this;
        }

        public Builder clearDefaultValue() {
            this.copyOnWrite();
            ((Field)this.instance).clearDefaultValue();
            return this;
        }

        public Builder setDefaultValueBytes(ByteString value) {
            this.copyOnWrite();
            ((Field)this.instance).setDefaultValueBytes(value);
            return this;
        }
    }
}

