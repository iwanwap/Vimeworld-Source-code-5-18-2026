/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Field;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.TypeOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Type
extends GeneratedMessageLite<Type, Builder>
implements TypeOrBuilder {
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_ = "";
    public static final int FIELDS_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Field> fields_ = Type.emptyProtobufList();
    public static final int ONEOFS_FIELD_NUMBER = 3;
    private Internal.ProtobufList<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private Internal.ProtobufList<Option> options_ = Type.emptyProtobufList();
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int syntax_;
    public static final int EDITION_FIELD_NUMBER = 7;
    private String edition_ = "";
    private static final Type DEFAULT_INSTANCE;
    private static volatile Parser<Type> PARSER;

    private Type() {
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
        this.name_ = Type.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Type.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override
    public Field getFields(int index) {
        return (Field)this.fields_.get(index);
    }

    public FieldOrBuilder getFieldsOrBuilder(int index) {
        return (FieldOrBuilder)this.fields_.get(index);
    }

    private void ensureFieldsIsMutable() {
        Internal.ProtobufList<Field> tmp = this.fields_;
        if (!tmp.isModifiable()) {
            this.fields_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setFields(int index, Field value) {
        value.getClass();
        this.ensureFieldsIsMutable();
        this.fields_.set(index, value);
    }

    private void addFields(Field value) {
        value.getClass();
        this.ensureFieldsIsMutable();
        this.fields_.add(value);
    }

    private void addFields(int index, Field value) {
        value.getClass();
        this.ensureFieldsIsMutable();
        this.fields_.add(index, value);
    }

    private void addAllFields(Iterable<? extends Field> values) {
        this.ensureFieldsIsMutable();
        AbstractMessageLite.addAll(values, this.fields_);
    }

    private void clearFields() {
        this.fields_ = Type.emptyProtobufList();
    }

    private void removeFields(int index) {
        this.ensureFieldsIsMutable();
        this.fields_.remove(index);
    }

    @Override
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override
    public String getOneofs(int index) {
        return (String)this.oneofs_.get(index);
    }

    @Override
    public ByteString getOneofsBytes(int index) {
        return ByteString.copyFromUtf8((String)this.oneofs_.get(index));
    }

    private void ensureOneofsIsMutable() {
        Internal.ProtobufList<String> tmp = this.oneofs_;
        if (!tmp.isModifiable()) {
            this.oneofs_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setOneofs(int index, String value) {
        value.getClass();
        this.ensureOneofsIsMutable();
        this.oneofs_.set(index, value);
    }

    private void addOneofs(String value) {
        value.getClass();
        this.ensureOneofsIsMutable();
        this.oneofs_.add(value);
    }

    private void addAllOneofs(Iterable<String> values) {
        this.ensureOneofsIsMutable();
        AbstractMessageLite.addAll(values, this.oneofs_);
    }

    private void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void addOneofsBytes(ByteString value) {
        Type.checkByteStringIsUtf8(value);
        this.ensureOneofsIsMutable();
        this.oneofs_.add(value.toStringUtf8());
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
        this.options_ = Type.emptyProtobufList();
    }

    private void removeOptions(int index) {
        this.ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    @Override
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
    }

    private void setSourceContext(SourceContext value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    private void mergeSourceContext(SourceContext value) {
        value.getClass();
        this.sourceContext_ = this.sourceContext_ != null && this.sourceContext_ != SourceContext.getDefaultInstance() ? (SourceContext)((SourceContext.Builder)SourceContext.newBuilder(this.sourceContext_).mergeFrom(value)).buildPartial() : value;
        this.bitField0_ |= 1;
    }

    private void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= 0xFFFFFFFE;
    }

    @Override
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override
    public Syntax getSyntax() {
        Syntax result = Syntax.forNumber(this.syntax_);
        return result == null ? Syntax.UNRECOGNIZED : result;
    }

    private void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    private void setSyntax(Syntax value) {
        this.syntax_ = value.getNumber();
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    @Override
    public String getEdition() {
        return this.edition_;
    }

    @Override
    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    private void setEdition(String value) {
        value.getClass();
        this.edition_ = value;
    }

    private void clearEdition() {
        this.edition_ = Type.getDefaultInstance().getEdition();
    }

    private void setEditionBytes(ByteString value) {
        Type.checkByteStringIsUtf8(value);
        this.edition_ = value.toStringUtf8();
    }

    public static Type parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Type parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Type parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Type parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Type parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Type parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Type parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Type parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Type parseDelimitedFrom(InputStream input) throws IOException {
        return Type.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Type parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Type.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Type parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Type parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Type prototype) {
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
                return new Type();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_", "name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_", "edition_"};
                String info = "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0208\u0002\u001b\u0003\u021a\u0004\u001b\u0005\u1009\u0000\u0006\f\u0007\u0208";
                return Type.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Type> parser = PARSER;
                if (parser != null) return parser;
                Class<Type> clazz = Type.class;
                synchronized (Type.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Type>(DEFAULT_INSTANCE);
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

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Type defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Type();
        GeneratedMessageLite.registerDefaultInstance(Type.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Type, Builder>
    implements TypeOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getName() {
            return ((Type)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Type)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Type)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Type)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Type)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((Type)this.instance).getFieldsList());
        }

        @Override
        public int getFieldsCount() {
            return ((Type)this.instance).getFieldsCount();
        }

        @Override
        public Field getFields(int index) {
            return ((Type)this.instance).getFields(index);
        }

        public Builder setFields(int index, Field value) {
            this.copyOnWrite();
            ((Type)this.instance).setFields(index, value);
            return this;
        }

        public Builder setFields(int index, Field.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).setFields(index, (Field)builderForValue.build());
            return this;
        }

        public Builder addFields(Field value) {
            this.copyOnWrite();
            ((Type)this.instance).addFields(value);
            return this;
        }

        public Builder addFields(int index, Field value) {
            this.copyOnWrite();
            ((Type)this.instance).addFields(index, value);
            return this;
        }

        public Builder addFields(Field.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).addFields((Field)builderForValue.build());
            return this;
        }

        public Builder addFields(int index, Field.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).addFields(index, (Field)builderForValue.build());
            return this;
        }

        public Builder addAllFields(Iterable<? extends Field> values) {
            this.copyOnWrite();
            ((Type)this.instance).addAllFields(values);
            return this;
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((Type)this.instance).clearFields();
            return this;
        }

        public Builder removeFields(int index) {
            this.copyOnWrite();
            ((Type)this.instance).removeFields(index);
            return this;
        }

        @Override
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((Type)this.instance).getOneofsList());
        }

        @Override
        public int getOneofsCount() {
            return ((Type)this.instance).getOneofsCount();
        }

        @Override
        public String getOneofs(int index) {
            return ((Type)this.instance).getOneofs(index);
        }

        @Override
        public ByteString getOneofsBytes(int index) {
            return ((Type)this.instance).getOneofsBytes(index);
        }

        public Builder setOneofs(int index, String value) {
            this.copyOnWrite();
            ((Type)this.instance).setOneofs(index, value);
            return this;
        }

        public Builder addOneofs(String value) {
            this.copyOnWrite();
            ((Type)this.instance).addOneofs(value);
            return this;
        }

        public Builder addAllOneofs(Iterable<String> values) {
            this.copyOnWrite();
            ((Type)this.instance).addAllOneofs(values);
            return this;
        }

        public Builder clearOneofs() {
            this.copyOnWrite();
            ((Type)this.instance).clearOneofs();
            return this;
        }

        public Builder addOneofsBytes(ByteString value) {
            this.copyOnWrite();
            ((Type)this.instance).addOneofsBytes(value);
            return this;
        }

        @Override
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Type)this.instance).getOptionsList());
        }

        @Override
        public int getOptionsCount() {
            return ((Type)this.instance).getOptionsCount();
        }

        @Override
        public Option getOptions(int index) {
            return ((Type)this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            this.copyOnWrite();
            ((Type)this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).setOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            this.copyOnWrite();
            ((Type)this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            this.copyOnWrite();
            ((Type)this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).addOptions((Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).addOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            this.copyOnWrite();
            ((Type)this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((Type)this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            this.copyOnWrite();
            ((Type)this.instance).removeOptions(index);
            return this;
        }

        @Override
        public boolean hasSourceContext() {
            return ((Type)this.instance).hasSourceContext();
        }

        @Override
        public SourceContext getSourceContext() {
            return ((Type)this.instance).getSourceContext();
        }

        public Builder setSourceContext(SourceContext value) {
            this.copyOnWrite();
            ((Type)this.instance).setSourceContext(value);
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builderForValue) {
            this.copyOnWrite();
            ((Type)this.instance).setSourceContext((SourceContext)builderForValue.build());
            return this;
        }

        public Builder mergeSourceContext(SourceContext value) {
            this.copyOnWrite();
            ((Type)this.instance).mergeSourceContext(value);
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            ((Type)this.instance).clearSourceContext();
            return this;
        }

        @Override
        public int getSyntaxValue() {
            return ((Type)this.instance).getSyntaxValue();
        }

        public Builder setSyntaxValue(int value) {
            this.copyOnWrite();
            ((Type)this.instance).setSyntaxValue(value);
            return this;
        }

        @Override
        public Syntax getSyntax() {
            return ((Type)this.instance).getSyntax();
        }

        public Builder setSyntax(Syntax value) {
            this.copyOnWrite();
            ((Type)this.instance).setSyntax(value);
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            ((Type)this.instance).clearSyntax();
            return this;
        }

        @Override
        public String getEdition() {
            return ((Type)this.instance).getEdition();
        }

        @Override
        public ByteString getEditionBytes() {
            return ((Type)this.instance).getEditionBytes();
        }

        public Builder setEdition(String value) {
            this.copyOnWrite();
            ((Type)this.instance).setEdition(value);
            return this;
        }

        public Builder clearEdition() {
            this.copyOnWrite();
            ((Type)this.instance).clearEdition();
            return this;
        }

        public Builder setEditionBytes(ByteString value) {
            this.copyOnWrite();
            ((Type)this.instance).setEditionBytes(value);
            return this;
        }
    }
}

