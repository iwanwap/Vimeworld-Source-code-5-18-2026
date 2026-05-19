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
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Syntax;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Method
extends GeneratedMessageLite<Method, Builder>
implements MethodOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_ = "";
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    private String requestTypeUrl_ = "";
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    private boolean requestStreaming_;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    private String responseTypeUrl_ = "";
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    private boolean responseStreaming_;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private Internal.ProtobufList<Option> options_ = Method.emptyProtobufList();
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private int syntax_;
    private static final Method DEFAULT_INSTANCE;
    private static volatile Parser<Method> PARSER;

    private Method() {
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
        this.name_ = Method.getDefaultInstance().getName();
    }

    private void setNameBytes(ByteString value) {
        Method.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override
    public ByteString getRequestTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    private void setRequestTypeUrl(String value) {
        value.getClass();
        this.requestTypeUrl_ = value;
    }

    private void clearRequestTypeUrl() {
        this.requestTypeUrl_ = Method.getDefaultInstance().getRequestTypeUrl();
    }

    private void setRequestTypeUrlBytes(ByteString value) {
        Method.checkByteStringIsUtf8(value);
        this.requestTypeUrl_ = value.toStringUtf8();
    }

    @Override
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    private void setRequestStreaming(boolean value) {
        this.requestStreaming_ = value;
    }

    private void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    @Override
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override
    public ByteString getResponseTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    private void setResponseTypeUrl(String value) {
        value.getClass();
        this.responseTypeUrl_ = value;
    }

    private void clearResponseTypeUrl() {
        this.responseTypeUrl_ = Method.getDefaultInstance().getResponseTypeUrl();
    }

    private void setResponseTypeUrlBytes(ByteString value) {
        Method.checkByteStringIsUtf8(value);
        this.responseTypeUrl_ = value.toStringUtf8();
    }

    @Override
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    private void setResponseStreaming(boolean value) {
        this.responseStreaming_ = value;
    }

    private void clearResponseStreaming() {
        this.responseStreaming_ = false;
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
        this.options_ = Method.emptyProtobufList();
    }

    private void removeOptions(int index) {
        this.ensureOptionsIsMutable();
        this.options_.remove(index);
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

    public static Method parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Method parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Method parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Method parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Method parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Method parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Method parseFrom(InputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Method parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Method parseDelimitedFrom(InputStream input) throws IOException {
        return Method.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Method parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return Method.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Method parseFrom(CodedInputStream input) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Method parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Method prototype) {
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
                return new Method();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"};
                String info = "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004\u0208\u0005\u0007\u0006\u001b\u0007\f";
                return Method.newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Method> parser = PARSER;
                if (parser != null) return parser;
                Class<Method> clazz = Method.class;
                synchronized (Method.class) {
                    parser = PARSER;
                    if (parser != null) return parser;
                    PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Method>(DEFAULT_INSTANCE);
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

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        Method defaultInstance;
        DEFAULT_INSTANCE = defaultInstance = new Method();
        GeneratedMessageLite.registerDefaultInstance(Method.class, defaultInstance);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Method, Builder>
    implements MethodOrBuilder {
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public String getName() {
            return ((Method)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Method)this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            this.copyOnWrite();
            ((Method)this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Method)this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            this.copyOnWrite();
            ((Method)this.instance).setNameBytes(value);
            return this;
        }

        @Override
        public String getRequestTypeUrl() {
            return ((Method)this.instance).getRequestTypeUrl();
        }

        @Override
        public ByteString getRequestTypeUrlBytes() {
            return ((Method)this.instance).getRequestTypeUrlBytes();
        }

        public Builder setRequestTypeUrl(String value) {
            this.copyOnWrite();
            ((Method)this.instance).setRequestTypeUrl(value);
            return this;
        }

        public Builder clearRequestTypeUrl() {
            this.copyOnWrite();
            ((Method)this.instance).clearRequestTypeUrl();
            return this;
        }

        public Builder setRequestTypeUrlBytes(ByteString value) {
            this.copyOnWrite();
            ((Method)this.instance).setRequestTypeUrlBytes(value);
            return this;
        }

        @Override
        public boolean getRequestStreaming() {
            return ((Method)this.instance).getRequestStreaming();
        }

        public Builder setRequestStreaming(boolean value) {
            this.copyOnWrite();
            ((Method)this.instance).setRequestStreaming(value);
            return this;
        }

        public Builder clearRequestStreaming() {
            this.copyOnWrite();
            ((Method)this.instance).clearRequestStreaming();
            return this;
        }

        @Override
        public String getResponseTypeUrl() {
            return ((Method)this.instance).getResponseTypeUrl();
        }

        @Override
        public ByteString getResponseTypeUrlBytes() {
            return ((Method)this.instance).getResponseTypeUrlBytes();
        }

        public Builder setResponseTypeUrl(String value) {
            this.copyOnWrite();
            ((Method)this.instance).setResponseTypeUrl(value);
            return this;
        }

        public Builder clearResponseTypeUrl() {
            this.copyOnWrite();
            ((Method)this.instance).clearResponseTypeUrl();
            return this;
        }

        public Builder setResponseTypeUrlBytes(ByteString value) {
            this.copyOnWrite();
            ((Method)this.instance).setResponseTypeUrlBytes(value);
            return this;
        }

        @Override
        public boolean getResponseStreaming() {
            return ((Method)this.instance).getResponseStreaming();
        }

        public Builder setResponseStreaming(boolean value) {
            this.copyOnWrite();
            ((Method)this.instance).setResponseStreaming(value);
            return this;
        }

        public Builder clearResponseStreaming() {
            this.copyOnWrite();
            ((Method)this.instance).clearResponseStreaming();
            return this;
        }

        @Override
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Method)this.instance).getOptionsList());
        }

        @Override
        public int getOptionsCount() {
            return ((Method)this.instance).getOptionsCount();
        }

        @Override
        public Option getOptions(int index) {
            return ((Method)this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            this.copyOnWrite();
            ((Method)this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Method)this.instance).setOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            this.copyOnWrite();
            ((Method)this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            this.copyOnWrite();
            ((Method)this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Method)this.instance).addOptions((Option)builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            this.copyOnWrite();
            ((Method)this.instance).addOptions(index, (Option)builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            this.copyOnWrite();
            ((Method)this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((Method)this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            this.copyOnWrite();
            ((Method)this.instance).removeOptions(index);
            return this;
        }

        @Override
        public int getSyntaxValue() {
            return ((Method)this.instance).getSyntaxValue();
        }

        public Builder setSyntaxValue(int value) {
            this.copyOnWrite();
            ((Method)this.instance).setSyntaxValue(value);
            return this;
        }

        @Override
        public Syntax getSyntax() {
            return ((Method)this.instance).getSyntax();
        }

        public Builder setSyntax(Syntax value) {
            this.copyOnWrite();
            ((Method)this.instance).setSyntax(value);
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            ((Method)this.instance).clearSyntax();
            return this;
        }
    }
}

