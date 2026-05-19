/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Method;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.Mixin;
import com.google.protobuf.MixinOrBuilder;
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

public final class Api
extends GeneratedMessageLite<Api, Builder>
implements ApiOrBuilder {
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_ = "";
    public static final int METHODS_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Method> methods_ = Api.emptyProtobufList();
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private Internal.ProtobufList<Option> options_ = Api.emptyProtobufList();
    public static final int VERSION_FIELD_NUMBER = 4;
    private String version_ = "";
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    public static final int MIXINS_FIELD_NUMBER = 6;
    private Internal.ProtobufList<Mixin> mixins_ = Api.emptyProtobufList();
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private int syntax_;
    private static final Api DEFAULT_INSTANCE;
    private static volatile Parser<Api> PARSER;

    private Api() {
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
        this.name_ = Api.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Api.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override
    public Method getMethods(int index) {
        return (Method)this.methods_.get(index);
    }

    public MethodOrBuilder getMethodsOrBuilder(int index) {
        return (MethodOrBuilder)this.methods_.get(index);
    }

    private void ensureMethodsIsMutable() {
        Internal.ProtobufList<Method> tmp = this.methods_;
        if (!tmp.isModifiable()) {
            this.methods_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setMethods(int index, Method value) {
        value.getClass();
        this.ensureMethodsIsMutable();
        this.methods_.set(index, value);
    }

    private void addMethods(Method value) {
        value.getClass();
        this.ensureMethodsIsMutable();
        this.methods_.add(value);
    }

    private void addMethods(int index, Method value) {
        value.getClass();
        this.ensureMethodsIsMutable();
        this.methods_.add(index, value);
    }

    private void addAllMethods(Iterable<? extends Method> values) {
        this.ensureMethodsIsMutable();
        AbstractMessageLite.addAll(values, this.methods_);
    }

    private void clearMethods() {
        this.methods_ = Api.emptyProtobufList();
    }

    private void removeMethods(int index) {
        this.ensureMethodsIsMutable();
        this.methods_.remove(index);
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
        this.options_ = Api.emptyProtobufList();
    }

    private void removeOptions(int index) {
        this.ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    @Override
    public String getVersion() {
        return this.version_;
    }

    @Override
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    private void setVersion(String value) {
        value.getClass();
        this.version_ = value;
    }

    private void clearVersion() {
        this.version_ = Api.getDefaultInstance().getVersion();
    }

    private void setVersionBytes(ByteString value) {
        Api.checkByteStringIsUtf8(value);
        this.version_ = value.toStringUtf8();
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
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override
    public Mixin getMixins(int index) {
        return (Mixin)this.mixins_.get(index);
    }

    public MixinOrBuilder getMixinsOrBuilder(int index) {
        return (MixinOrBuilder)this.mixins_.get(index);
    }

    private void ensureMixinsIsMutable() {
        Internal.ProtobufList<Mixin> tmp = this.mixins_;
        if (!tmp.isModifiable()) {
            this.mixins_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    private void setMixins(int index, Mixin value) {
        value.getClass();
        this.ensureMixinsIsMutable();
        this.mixins_.set(index, value);
    }

    private void addMixins(Mixin value) {
        value.getClass();
        this.ensureMixinsIsMutable();
        this.mixins_.add(value);
    }

    private void addMixins(int index, Mixin value) {
        value.getClass();
        this.ensureMixinsIsMutable();
        this.mixins_.add(index, value);
    }

    private void addAllMixins(Iterable<? extends Mixin> values) {
        this.ensureMixinsIsMutable();
        AbstractMessageLite.addAll(values, this.mixins_);
    }

    private void clearMixins() {
        this.mixins_ = Api.emptyProtobufList();
    }

    private void removeMixins(int index) {
        this.ensureMixinsIsMutable();
        this.mixins_.remove(index);
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

    public static Api parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Api parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Api parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Api parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Api parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Api parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Api parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Api parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Api parseDelimitedFrom(InputStream input) throws IOException {
        return Api.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Api parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Api.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Api parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Api parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Api prototype) {
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
                return new Api();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_", "name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"};
                String info = "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0208\u0002\u001b\u0003\u001b\u0004\u0208\u0005\u1009\u0000\u0006\u001b\u0007\f";
                return Api.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Api> parser = PARSER;
                if (parser != null) return parser;
                Class<Api> clazz = Api.class;
                synchronized (Api.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Api>(DEFAULT_INSTANCE);
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

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Api defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Api();
        GeneratedMessageLite.registerDefaultInstance(Api.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Api, Builder>
    implements ApiOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getName() {
            return ((Api)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Api)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Api)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Api)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Api)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public List<Method> getMethodsList() {
            return Collections.unmodifiableList(((Api)this.instance).getMethodsList());
        }

        @Override
        public int getMethodsCount() {
            return ((Api)this.instance).getMethodsCount();
        }

        @Override
        public Method getMethods(int index) {
            return ((Api)this.instance).getMethods(index);
        }

        public Builder setMethods(int index, Method value) {
            this.copyOnWrite();
            ((Api)this.instance).setMethods(index, value);
            return this;
        }

        public Builder setMethods(int index, Method.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).setMethods(index, (Method)builderForValue.build());
            return this;
        }

        public Builder addMethods(Method value) {
            this.copyOnWrite();
            ((Api)this.instance).addMethods(value);
            return this;
        }

        public Builder addMethods(int index, Method value) {
            this.copyOnWrite();
            ((Api)this.instance).addMethods(index, value);
            return this;
        }

        public Builder addMethods(Method.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).addMethods((Method)builderForValue.build());
            return this;
        }

        public Builder addMethods(int index, Method.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).addMethods(index, (Method)builderForValue.build());
            return this;
        }

        public Builder addAllMethods(Iterable<? extends Method> values) {
            this.copyOnWrite();
            ((Api)this.instance).addAllMethods(values);
            return this;
        }

        public Builder clearMethods() {
            this.copyOnWrite();
            ((Api)this.instance).clearMethods();
            return this;
        }

        public Builder removeMethods(int index) {
            this.copyOnWrite();
            ((Api)this.instance).removeMethods(index);
            return this;
        }

        @Override
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Api)this.instance).getOptionsList());
        }

        @Override
        public int getOptionsCount() {
            return ((Api)this.instance).getOptionsCount();
        }

        @Override
        public Option getOptions(int index) {
            return ((Api)this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            this.copyOnWrite();
            ((Api)this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).setOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            this.copyOnWrite();
            ((Api)this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            this.copyOnWrite();
            ((Api)this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).addOptions((Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).addOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            this.copyOnWrite();
            ((Api)this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((Api)this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            this.copyOnWrite();
            ((Api)this.instance).removeOptions(index);
            return this;
        }

        @Override
        public String getVersion() {
            return ((Api)this.instance).getVersion();
        }

        @Override
        public ByteString getVersionBytes() {
            return ((Api)this.instance).getVersionBytes();
        }

        public Builder setVersion(String value) {
            this.copyOnWrite();
            ((Api)this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            this.copyOnWrite();
            ((Api)this.instance).clearVersion();
            return this;
        }

        public Builder setVersionBytes(ByteString value) {
            this.copyOnWrite();
            ((Api)this.instance).setVersionBytes(value);
            return this;
        }

        @Override
        public boolean hasSourceContext() {
            return ((Api)this.instance).hasSourceContext();
        }

        @Override
        public SourceContext getSourceContext() {
            return ((Api)this.instance).getSourceContext();
        }

        public Builder setSourceContext(SourceContext value) {
            this.copyOnWrite();
            ((Api)this.instance).setSourceContext(value);
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).setSourceContext((SourceContext)builderForValue.build());
            return this;
        }

        public Builder mergeSourceContext(SourceContext value) {
            this.copyOnWrite();
            ((Api)this.instance).mergeSourceContext(value);
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            ((Api)this.instance).clearSourceContext();
            return this;
        }

        @Override
        public List<Mixin> getMixinsList() {
            return Collections.unmodifiableList(((Api)this.instance).getMixinsList());
        }

        @Override
        public int getMixinsCount() {
            return ((Api)this.instance).getMixinsCount();
        }

        @Override
        public Mixin getMixins(int index) {
            return ((Api)this.instance).getMixins(index);
        }

        public Builder setMixins(int index, Mixin value) {
            this.copyOnWrite();
            ((Api)this.instance).setMixins(index, value);
            return this;
        }

        public Builder setMixins(int index, Mixin.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).setMixins(index, (Mixin)builderForValue.build());
            return this;
        }

        public Builder addMixins(Mixin value) {
            this.copyOnWrite();
            ((Api)this.instance).addMixins(value);
            return this;
        }

        public Builder addMixins(int index, Mixin value) {
            this.copyOnWrite();
            ((Api)this.instance).addMixins(index, value);
            return this;
        }

        public Builder addMixins(Mixin.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).addMixins((Mixin)builderForValue.build());
            return this;
        }

        public Builder addMixins(int index, Mixin.Builder builderForValue) {
            this.copyOnWrite();
            ((Api)this.instance).addMixins(index, (Mixin)builderForValue.build());
            return this;
        }

        public Builder addAllMixins(Iterable<? extends Mixin> values) {
            this.copyOnWrite();
            ((Api)this.instance).addAllMixins(values);
            return this;
        }

        public Builder clearMixins() {
            this.copyOnWrite();
            ((Api)this.instance).clearMixins();
            return this;
        }

        public Builder removeMixins(int index) {
            this.copyOnWrite();
            ((Api)this.instance).removeMixins(index);
            return this;
        }

        @Override
        public int getSyntaxValue() {
            return ((Api)this.instance).getSyntaxValue();
        }

        public Builder setSyntaxValue(int value) {
            this.copyOnWrite();
            ((Api)this.instance).setSyntaxValue(value);
            return this;
        }

        @Override
        public Syntax getSyntax() {
            return ((Api)this.instance).getSyntax();
        }

        public Builder setSyntax(Syntax value) {
            this.copyOnWrite();
            ((Api)this.instance).setSyntax(value);
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            ((Api)this.instance).clearSyntax();
            return this;
        }
    }
}

