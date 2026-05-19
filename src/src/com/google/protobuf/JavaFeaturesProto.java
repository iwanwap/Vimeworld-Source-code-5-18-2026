/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class JavaFeaturesProto {
    public static final int JAVA_FIELD_NUMBER = 1001;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FeatureSet, JavaFeatures> java_ = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.FeatureSet.getDefaultInstance(), JavaFeatures.getDefaultInstance(), JavaFeatures.getDefaultInstance(), null, 1001, WireFormat.FieldType.MESSAGE, JavaFeatures.class);

    private JavaFeaturesProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
        registry.add(java_);
    }

    public static final class JavaFeatures
    extends GeneratedMessageLite<JavaFeatures, Builder>
    implements JavaFeaturesOrBuilder {
        private int bitField0_;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private boolean legacyClosedEnum_;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int utf8Validation_;
        private static final JavaFeatures DEFAULT_INSTANCE;
        private static volatile Parser<JavaFeatures> PARSER;

        private JavaFeatures() {
        }

        @Override
        public boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        private void setLegacyClosedEnum(boolean value) {
            this.bitField0_ |= 1;
            this.legacyClosedEnum_ = value;
        }

        private void clearLegacyClosedEnum() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.legacyClosedEnum_ = false;
        }

        @Override
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public Utf8Validation getUtf8Validation() {
            Utf8Validation result = Utf8Validation.forNumber(this.utf8Validation_);
            return result == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : result;
        }

        private void setUtf8Validation(Utf8Validation value) {
            this.utf8Validation_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        private void clearUtf8Validation() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.utf8Validation_ = 0;
        }

        public static JavaFeatures parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static JavaFeatures parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static JavaFeatures parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static JavaFeatures parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static JavaFeatures parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static JavaFeatures parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static JavaFeatures parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static JavaFeatures parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static JavaFeatures parseDelimitedFrom(InputStream input) throws IOException {
            return JavaFeatures.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static JavaFeatures parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return JavaFeatures.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static JavaFeatures parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static JavaFeatures parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(JavaFeatures prototype) {
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
                    return new JavaFeatures();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", Utf8Validation.internalGetVerifier()};
                    String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u180c\u0001";
                    return JavaFeatures.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<JavaFeatures> parser = PARSER;
                    if (parser != null) return parser;
                    Class<JavaFeatures> clazz = JavaFeatures.class;
                    synchronized (JavaFeatures.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<JavaFeatures>(DEFAULT_INSTANCE);
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

        public static JavaFeatures getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<JavaFeatures> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            JavaFeatures defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new JavaFeatures();
            GeneratedMessageLite.registerDefaultInstance(JavaFeatures.class, defaultInstance);
        }

        public static enum Utf8Validation implements Internal.EnumLite
        {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);

            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            public static final int DEFAULT_VALUE = 1;
            public static final int VERIFY_VALUE = 2;
            private static final Internal.EnumLiteMap<Utf8Validation> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Utf8Validation valueOf(int value) {
                return Utf8Validation.forNumber(value);
            }

            public static Utf8Validation forNumber(int value) {
                switch (value) {
                    case 0: {
                        return UTF8_VALIDATION_UNKNOWN;
                    }
                    case 1: {
                        return DEFAULT;
                    }
                    case 2: {
                        return VERIFY;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<Utf8Validation> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return Utf8ValidationVerifier.INSTANCE;
            }

            private Utf8Validation(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<Utf8Validation>(){

                    @Override
                    public Utf8Validation findValueByNumber(int number) {
                        return Utf8Validation.forNumber(number);
                    }
                };
            }

            private static final class Utf8ValidationVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new Utf8ValidationVerifier();

                private Utf8ValidationVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return Utf8Validation.forNumber(number) != null;
                }
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<JavaFeatures, Builder>
        implements JavaFeaturesOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasLegacyClosedEnum() {
                return ((JavaFeatures)this.instance).hasLegacyClosedEnum();
            }

            @Override
            public boolean getLegacyClosedEnum() {
                return ((JavaFeatures)this.instance).getLegacyClosedEnum();
            }

            public Builder setLegacyClosedEnum(boolean value) {
                this.copyOnWrite();
                ((JavaFeatures)this.instance).setLegacyClosedEnum(value);
                return this;
            }

            public Builder clearLegacyClosedEnum() {
                this.copyOnWrite();
                ((JavaFeatures)this.instance).clearLegacyClosedEnum();
                return this;
            }

            @Override
            public boolean hasUtf8Validation() {
                return ((JavaFeatures)this.instance).hasUtf8Validation();
            }

            @Override
            public Utf8Validation getUtf8Validation() {
                return ((JavaFeatures)this.instance).getUtf8Validation();
            }

            public Builder setUtf8Validation(Utf8Validation value) {
                this.copyOnWrite();
                ((JavaFeatures)this.instance).setUtf8Validation(value);
                return this;
            }

            public Builder clearUtf8Validation() {
                this.copyOnWrite();
                ((JavaFeatures)this.instance).clearUtf8Validation();
                return this;
            }
        }
    }

    public static interface JavaFeaturesOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasLegacyClosedEnum();

        public boolean getLegacyClosedEnum();

        public boolean hasUtf8Validation();

        public JavaFeatures.Utf8Validation getUtf8Validation();
    }
}

