/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Enum
extends GeneratedMessageLite<Enum, Builder>
implements EnumOrBuilder {
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_ = "";
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<EnumValue> enumvalue_ = Enum.emptyProtobufList();
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private Internal.ProtobufList<Option> options_ = Enum.emptyProtobufList();
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int syntax_;
    public static final int EDITION_FIELD_NUMBER = 6;
    private String edition_ = "";
    private static final Enum DEFAULT_INSTANCE;
    private static volatile Parser<Enum> PARSER;

    private Enum() {
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
        this.name_ = Enum.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Enum.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override
    public EnumValue getEnumvalue(int index) {
        return (EnumValue)this.enumvalue_.get(index);
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int index) {
        return (EnumValueOrBuilder)this.enumvalue_.get(index);
    }

    private void ensureEnumvalueIsMutable() {
        Internal.ProtobufList<EnumValue> tmp = this.enumvalue_;
        if (!tmp.isModifiable()) {
            this.enumvalue_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setEnumvalue(int index, EnumValue value) {
        value.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.set(index, value);
    }

    private void addEnumvalue(EnumValue value) {
        value.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.add(value);
    }

    private void addEnumvalue(int index, EnumValue value) {
        value.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.add(index, value);
    }

    private void addAllEnumvalue(Iterable<? extends EnumValue> values) {
        this.ensureEnumvalueIsMutable();
        AbstractMessageLite.addAll(values, this.enumvalue_);
    }

    private void clearEnumvalue() {
        this.enumvalue_ = Enum.emptyProtobufList();
    }

    private void removeEnumvalue(int index) {
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.remove(index);
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
        this.options_ = Enum.emptyProtobufList();
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
        this.edition_ = Enum.getDefaultInstance().getEdition();
    }

    private void setEditionBytes(ByteString value) {
        Enum.checkByteStringIsUtf8(value);
        this.edition_ = value.toStringUtf8();
    }

    public static Enum parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Enum parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Enum parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Enum parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Enum parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Enum parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Enum parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Enum parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Enum parseDelimitedFrom(InputStream input) throws IOException {
        return Enum.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Enum parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Enum.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Enum parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Enum parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Enum prototype) {
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
                return new Enum();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_", "name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_", "edition_"};
                String info = "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0208\u0002\u001b\u0003\u001b\u0004\u1009\u0000\u0005\f\u0006\u0208";
                return Enum.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Enum> parser = PARSER;
                if (parser != null) return parser;
                Class<Enum> clazz = Enum.class;
                synchronized (Enum.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Enum>(DEFAULT_INSTANCE);
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

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Enum defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Enum();
        GeneratedMessageLite.registerDefaultInstance(Enum.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Enum, Builder>
    implements EnumOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getName() {
            return ((Enum)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Enum)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Enum)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Enum)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Enum)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public List<EnumValue> getEnumvalueList() {
            return Collections.unmodifiableList(((Enum)this.instance).getEnumvalueList());
        }

        @Override
        public int getEnumvalueCount() {
            return ((Enum)this.instance).getEnumvalueCount();
        }

        @Override
        public EnumValue getEnumvalue(int index) {
            return ((Enum)this.instance).getEnumvalue(index);
        }

        public Builder setEnumvalue(int index, EnumValue value) {
            this.copyOnWrite();
            ((Enum)this.instance).setEnumvalue(index, value);
            return this;
        }

        public Builder setEnumvalue(int index, EnumValue.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).setEnumvalue(index, (EnumValue)builderForValue.build());
            return this;
        }

        public Builder addEnumvalue(EnumValue value) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(value);
            return this;
        }

        public Builder addEnumvalue(int index, EnumValue value) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(index, value);
            return this;
        }

        public Builder addEnumvalue(EnumValue.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue((EnumValue)builderForValue.build());
            return this;
        }

        public Builder addEnumvalue(int index, EnumValue.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(index, (EnumValue)builderForValue.build());
            return this;
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> values) {
            this.copyOnWrite();
            ((Enum)this.instance).addAllEnumvalue(values);
            return this;
        }

        public Builder clearEnumvalue() {
            this.copyOnWrite();
            ((Enum)this.instance).clearEnumvalue();
            return this;
        }

        public Builder removeEnumvalue(int index) {
            this.copyOnWrite();
            ((Enum)this.instance).removeEnumvalue(index);
            return this;
        }

        @Override
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Enum)this.instance).getOptionsList());
        }

        @Override
        public int getOptionsCount() {
            return ((Enum)this.instance).getOptionsCount();
        }

        @Override
        public Option getOptions(int index) {
            return ((Enum)this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            this.copyOnWrite();
            ((Enum)this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).setOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions((Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            this.copyOnWrite();
            ((Enum)this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((Enum)this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            this.copyOnWrite();
            ((Enum)this.instance).removeOptions(index);
            return this;
        }

        @Override
        public boolean hasSourceContext() {
            return ((Enum)this.instance).hasSourceContext();
        }

        @Override
        public SourceContext getSourceContext() {
            return ((Enum)this.instance).getSourceContext();
        }

        public Builder setSourceContext(SourceContext value) {
            this.copyOnWrite();
            ((Enum)this.instance).setSourceContext(value);
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builderForValue) {
            this.copyOnWrite();
            ((Enum)this.instance).setSourceContext((SourceContext)builderForValue.build());
            return this;
        }

        public Builder mergeSourceContext(SourceContext value) {
            this.copyOnWrite();
            ((Enum)this.instance).mergeSourceContext(value);
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            ((Enum)this.instance).clearSourceContext();
            return this;
        }

        @Override
        public int getSyntaxValue() {
            return ((Enum)this.instance).getSyntaxValue();
        }

        public Builder setSyntaxValue(int value) {
            this.copyOnWrite();
            ((Enum)this.instance).setSyntaxValue(value);
            return this;
        }

        @Override
        public Syntax getSyntax() {
            return ((Enum)this.instance).getSyntax();
        }

        public Builder setSyntax(Syntax value) {
            this.copyOnWrite();
            ((Enum)this.instance).setSyntax(value);
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            ((Enum)this.instance).clearSyntax();
            return this;
        }

        @Override
        public String getEdition() {
            return ((Enum)this.instance).getEdition();
        }

        @Override
        public ByteString getEditionBytes() {
            return ((Enum)this.instance).getEditionBytes();
        }

        public Builder setEdition(String value) {
            this.copyOnWrite();
            ((Enum)this.instance).setEdition(value);
            return this;
        }

        public Builder clearEdition() {
            this.copyOnWrite();
            ((Enum)this.instance).clearEdition();
            return this;
        }

        public Builder setEditionBytes(ByteString value) {
            this.copyOnWrite();
            ((Enum)this.instance).setEditionBytes(value);
            return this;
        }
    }
}

