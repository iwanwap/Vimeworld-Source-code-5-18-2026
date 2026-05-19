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
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos {
    private DescriptorProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class GeneratedCodeInfo
    extends GeneratedMessageLite<GeneratedCodeInfo, Builder>
    implements GeneratedCodeInfoOrBuilder {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Annotation> annotation_ = GeneratedCodeInfo.emptyProtobufList();
        private static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile Parser<GeneratedCodeInfo> PARSER;

        private GeneratedCodeInfo() {
        }

        @Override
        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public List<? extends AnnotationOrBuilder> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        @Override
        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        @Override
        public Annotation getAnnotation(int index) {
            return (Annotation)this.annotation_.get(index);
        }

        public AnnotationOrBuilder getAnnotationOrBuilder(int index) {
            return (AnnotationOrBuilder)this.annotation_.get(index);
        }

        private void ensureAnnotationIsMutable() {
            Internal.ProtobufList<Annotation> tmp = this.annotation_;
            if (!tmp.isModifiable()) {
                this.annotation_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setAnnotation(int index, Annotation value) {
            value.getClass();
            this.ensureAnnotationIsMutable();
            this.annotation_.set(index, value);
        }

        private void addAnnotation(Annotation value) {
            value.getClass();
            this.ensureAnnotationIsMutable();
            this.annotation_.add(value);
        }

        private void addAnnotation(int index, Annotation value) {
            value.getClass();
            this.ensureAnnotationIsMutable();
            this.annotation_.add(index, value);
        }

        private void addAllAnnotation(Iterable<? extends Annotation> values) {
            this.ensureAnnotationIsMutable();
            AbstractMessageLite.addAll(values, this.annotation_);
        }

        private void clearAnnotation() {
            this.annotation_ = GeneratedCodeInfo.emptyProtobufList();
        }

        private void removeAnnotation(int index) {
            this.ensureAnnotationIsMutable();
            this.annotation_.remove(index);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GeneratedCodeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GeneratedCodeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GeneratedCodeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GeneratedCodeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GeneratedCodeInfo parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GeneratedCodeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream input) throws IOException {
            return GeneratedCodeInfo.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedCodeInfo.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(GeneratedCodeInfo prototype) {
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
                    return new GeneratedCodeInfo();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"annotation_", Annotation.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return GeneratedCodeInfo.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<GeneratedCodeInfo> parser = PARSER;
                    if (parser != null) return parser;
                    Class<GeneratedCodeInfo> clazz = GeneratedCodeInfo.class;
                    synchronized (GeneratedCodeInfo.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<GeneratedCodeInfo>(DEFAULT_INSTANCE);
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

        public static GeneratedCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<GeneratedCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            GeneratedCodeInfo defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new GeneratedCodeInfo();
            GeneratedMessageLite.registerDefaultInstance(GeneratedCodeInfo.class, defaultInstance);
        }

        public static final class Annotation
        extends GeneratedMessageLite<Annotation, Builder>
        implements AnnotationOrBuilder {
            private int bitField0_;
            public static final int PATH_FIELD_NUMBER = 1;
            private Internal.IntList path_ = Annotation.emptyIntList();
            private int pathMemoizedSerializedSize = -1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private String sourceFile_ = "";
            public static final int BEGIN_FIELD_NUMBER = 3;
            private int begin_;
            public static final int END_FIELD_NUMBER = 4;
            private int end_;
            public static final int SEMANTIC_FIELD_NUMBER = 5;
            private int semantic_;
            private static final Annotation DEFAULT_INSTANCE;
            private static volatile Parser<Annotation> PARSER;

            private Annotation() {
            }

            @Override
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override
            public int getPathCount() {
                return this.path_.size();
            }

            @Override
            public int getPath(int index) {
                return this.path_.getInt(index);
            }

            private void ensurePathIsMutable() {
                Internal.IntList tmp = this.path_;
                if (!tmp.isModifiable()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(tmp);
                }
            }

            private void setPath(int index, int value) {
                this.ensurePathIsMutable();
                this.path_.setInt(index, value);
            }

            private void addPath(int value) {
                this.ensurePathIsMutable();
                this.path_.addInt(value);
            }

            private void addAllPath(Iterable<? extends Integer> values) {
                this.ensurePathIsMutable();
                AbstractMessageLite.addAll(values, this.path_);
            }

            private void clearPath() {
                this.path_ = Annotation.emptyIntList();
            }

            @Override
            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public String getSourceFile() {
                return this.sourceFile_;
            }

            @Override
            public ByteString getSourceFileBytes() {
                return ByteString.copyFromUtf8(this.sourceFile_);
            }

            private void setSourceFile(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = value;
            }

            private void clearSourceFile() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.sourceFile_ = Annotation.getDefaultInstance().getSourceFile();
            }

            private void setSourceFileBytes(ByteString value) {
                this.sourceFile_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override
            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public int getBegin() {
                return this.begin_;
            }

            private void setBegin(int value) {
                this.bitField0_ |= 2;
                this.begin_ = value;
            }

            private void clearBegin() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.begin_ = 0;
            }

            @Override
            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override
            public int getEnd() {
                return this.end_;
            }

            private void setEnd(int value) {
                this.bitField0_ |= 4;
                this.end_ = value;
            }

            private void clearEnd() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.end_ = 0;
            }

            @Override
            public boolean hasSemantic() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override
            public Semantic getSemantic() {
                Semantic result = Semantic.forNumber(this.semantic_);
                return result == null ? Semantic.NONE : result;
            }

            private void setSemantic(Semantic value) {
                this.semantic_ = value.getNumber();
                this.bitField0_ |= 8;
            }

            private void clearSemantic() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.semantic_ = 0;
            }

            public static Annotation parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Annotation parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Annotation parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Annotation parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Annotation parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Annotation parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Annotation parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Annotation parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Annotation parseDelimitedFrom(InputStream input) throws IOException {
                return Annotation.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Annotation parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return Annotation.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Annotation parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Annotation parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Annotation prototype) {
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
                        return new Annotation();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", Semantic.internalGetVerifier()};
                        String info = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002\u1008\u0000\u0003\u1004\u0001\u0004\u1004\u0002\u0005\u180c\u0003";
                        return Annotation.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<Annotation> parser = PARSER;
                        if (parser != null) return parser;
                        Class<Annotation> clazz = Annotation.class;
                        synchronized (Annotation.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Annotation>(DEFAULT_INSTANCE);
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

            public static Annotation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Annotation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Annotation defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new Annotation();
                GeneratedMessageLite.registerDefaultInstance(Annotation.class, defaultInstance);
            }

            public static enum Semantic implements Internal.EnumLite
            {
                NONE(0),
                SET(1),
                ALIAS(2);

                public static final int NONE_VALUE = 0;
                public static final int SET_VALUE = 1;
                public static final int ALIAS_VALUE = 2;
                private static final Internal.EnumLiteMap<Semantic> internalValueMap;
                private final int value;

                @Override
                public final int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static Semantic valueOf(int value) {
                    return Semantic.forNumber(value);
                }

                public static Semantic forNumber(int value) {
                    switch (value) {
                        case 0: {
                            return NONE;
                        }
                        case 1: {
                            return SET;
                        }
                        case 2: {
                            return ALIAS;
                        }
                    }
                    return null;
                }

                public static Internal.EnumLiteMap<Semantic> internalGetValueMap() {
                    return internalValueMap;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return SemanticVerifier.INSTANCE;
                }

                private Semantic(int value) {
                    this.value = value;
                }

                static {
                    internalValueMap = new Internal.EnumLiteMap<Semantic>(){

                        @Override
                        public Semantic findValueByNumber(int number) {
                            return Semantic.forNumber(number);
                        }
                    };
                }

                private static final class SemanticVerifier
                implements Internal.EnumVerifier {
                    static final Internal.EnumVerifier INSTANCE = new SemanticVerifier();

                    private SemanticVerifier() {
                    }

                    @Override
                    public boolean isInRange(int number) {
                        return Semantic.forNumber(number) != null;
                    }
                }
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Annotation, Builder>
            implements AnnotationOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Annotation)this.instance).getPathList());
                }

                @Override
                public int getPathCount() {
                    return ((Annotation)this.instance).getPathCount();
                }

                @Override
                public int getPath(int index) {
                    return ((Annotation)this.instance).getPath(index);
                }

                public Builder setPath(int index, int value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setPath(index, value);
                    return this;
                }

                public Builder addPath(int value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).addPath(value);
                    return this;
                }

                public Builder addAllPath(Iterable<? extends Integer> values) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).addAllPath(values);
                    return this;
                }

                public Builder clearPath() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearPath();
                    return this;
                }

                @Override
                public boolean hasSourceFile() {
                    return ((Annotation)this.instance).hasSourceFile();
                }

                @Override
                public String getSourceFile() {
                    return ((Annotation)this.instance).getSourceFile();
                }

                @Override
                public ByteString getSourceFileBytes() {
                    return ((Annotation)this.instance).getSourceFileBytes();
                }

                public Builder setSourceFile(String value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setSourceFile(value);
                    return this;
                }

                public Builder clearSourceFile() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearSourceFile();
                    return this;
                }

                public Builder setSourceFileBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setSourceFileBytes(value);
                    return this;
                }

                @Override
                public boolean hasBegin() {
                    return ((Annotation)this.instance).hasBegin();
                }

                @Override
                public int getBegin() {
                    return ((Annotation)this.instance).getBegin();
                }

                public Builder setBegin(int value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setBegin(value);
                    return this;
                }

                public Builder clearBegin() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearBegin();
                    return this;
                }

                @Override
                public boolean hasEnd() {
                    return ((Annotation)this.instance).hasEnd();
                }

                @Override
                public int getEnd() {
                    return ((Annotation)this.instance).getEnd();
                }

                public Builder setEnd(int value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setEnd(value);
                    return this;
                }

                public Builder clearEnd() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearEnd();
                    return this;
                }

                @Override
                public boolean hasSemantic() {
                    return ((Annotation)this.instance).hasSemantic();
                }

                @Override
                public Semantic getSemantic() {
                    return ((Annotation)this.instance).getSemantic();
                }

                public Builder setSemantic(Semantic value) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setSemantic(value);
                    return this;
                }

                public Builder clearSemantic() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearSemantic();
                    return this;
                }
            }
        }

        public static interface AnnotationOrBuilder
        extends MessageLiteOrBuilder {
            public List<Integer> getPathList();

            public int getPathCount();

            public int getPath(int var1);

            public boolean hasSourceFile();

            public String getSourceFile();

            public ByteString getSourceFileBytes();

            public boolean hasBegin();

            public int getBegin();

            public boolean hasEnd();

            public int getEnd();

            public boolean hasSemantic();

            public Annotation.Semantic getSemantic();
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<GeneratedCodeInfo, Builder>
        implements GeneratedCodeInfoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public List<Annotation> getAnnotationList() {
                return Collections.unmodifiableList(((GeneratedCodeInfo)this.instance).getAnnotationList());
            }

            @Override
            public int getAnnotationCount() {
                return ((GeneratedCodeInfo)this.instance).getAnnotationCount();
            }

            @Override
            public Annotation getAnnotation(int index) {
                return ((GeneratedCodeInfo)this.instance).getAnnotation(index);
            }

            public Builder setAnnotation(int index, Annotation value) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).setAnnotation(index, value);
                return this;
            }

            public Builder setAnnotation(int index, Annotation.Builder builderForValue) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).setAnnotation(index, (Annotation)builderForValue.build());
                return this;
            }

            public Builder addAnnotation(Annotation value) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(value);
                return this;
            }

            public Builder addAnnotation(int index, Annotation value) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(index, value);
                return this;
            }

            public Builder addAnnotation(Annotation.Builder builderForValue) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation((Annotation)builderForValue.build());
                return this;
            }

            public Builder addAnnotation(int index, Annotation.Builder builderForValue) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(index, (Annotation)builderForValue.build());
                return this;
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> values) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAllAnnotation(values);
                return this;
            }

            public Builder clearAnnotation() {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).clearAnnotation();
                return this;
            }

            public Builder removeAnnotation(int index) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).removeAnnotation(index);
                return this;
            }
        }
    }

    public static interface GeneratedCodeInfoOrBuilder
    extends MessageLiteOrBuilder {
        public List<GeneratedCodeInfo.Annotation> getAnnotationList();

        public GeneratedCodeInfo.Annotation getAnnotation(int var1);

        public int getAnnotationCount();
    }

    public static final class SourceCodeInfo
    extends GeneratedMessageLite.ExtendableMessage<SourceCodeInfo, Builder>
    implements SourceCodeInfoOrBuilder {
        public static final int LOCATION_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Location> location_;
        private byte memoizedIsInitialized = (byte)2;
        private static final SourceCodeInfo DEFAULT_INSTANCE;
        private static volatile Parser<SourceCodeInfo> PARSER;

        private SourceCodeInfo() {
            this.location_ = SourceCodeInfo.emptyProtobufList();
        }

        @Override
        public List<Location> getLocationList() {
            return this.location_;
        }

        public List<? extends LocationOrBuilder> getLocationOrBuilderList() {
            return this.location_;
        }

        @Override
        public int getLocationCount() {
            return this.location_.size();
        }

        @Override
        public Location getLocation(int index) {
            return (Location)this.location_.get(index);
        }

        public LocationOrBuilder getLocationOrBuilder(int index) {
            return (LocationOrBuilder)this.location_.get(index);
        }

        private void ensureLocationIsMutable() {
            Internal.ProtobufList<Location> tmp = this.location_;
            if (!tmp.isModifiable()) {
                this.location_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setLocation(int index, Location value) {
            value.getClass();
            this.ensureLocationIsMutable();
            this.location_.set(index, value);
        }

        private void addLocation(Location value) {
            value.getClass();
            this.ensureLocationIsMutable();
            this.location_.add(value);
        }

        private void addLocation(int index, Location value) {
            value.getClass();
            this.ensureLocationIsMutable();
            this.location_.add(index, value);
        }

        private void addAllLocation(Iterable<? extends Location> values) {
            this.ensureLocationIsMutable();
            AbstractMessageLite.addAll(values, this.location_);
        }

        private void clearLocation() {
            this.location_ = SourceCodeInfo.emptyProtobufList();
        }

        private void removeLocation(int index) {
            this.ensureLocationIsMutable();
            this.location_.remove(index);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SourceCodeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SourceCodeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SourceCodeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SourceCodeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SourceCodeInfo parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SourceCodeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream input) throws IOException {
            return SourceCodeInfo.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return SourceCodeInfo.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SourceCodeInfo prototype) {
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
                    return new SourceCodeInfo();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"location_", Location.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return SourceCodeInfo.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<SourceCodeInfo> parser = PARSER;
                    if (parser != null) return parser;
                    Class<SourceCodeInfo> clazz = SourceCodeInfo.class;
                    synchronized (SourceCodeInfo.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<SourceCodeInfo>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SourceCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            SourceCodeInfo defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new SourceCodeInfo();
            GeneratedMessageLite.registerDefaultInstance(SourceCodeInfo.class, defaultInstance);
        }

        public static final class Location
        extends GeneratedMessageLite<Location, Builder>
        implements LocationOrBuilder {
            private int bitField0_;
            public static final int PATH_FIELD_NUMBER = 1;
            private Internal.IntList path_ = Location.emptyIntList();
            private int pathMemoizedSerializedSize = -1;
            public static final int SPAN_FIELD_NUMBER = 2;
            private Internal.IntList span_ = Location.emptyIntList();
            private int spanMemoizedSerializedSize = -1;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            private String leadingComments_ = "";
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private String trailingComments_ = "";
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private Internal.ProtobufList<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            private static final Location DEFAULT_INSTANCE;
            private static volatile Parser<Location> PARSER;

            private Location() {
            }

            @Override
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override
            public int getPathCount() {
                return this.path_.size();
            }

            @Override
            public int getPath(int index) {
                return this.path_.getInt(index);
            }

            private void ensurePathIsMutable() {
                Internal.IntList tmp = this.path_;
                if (!tmp.isModifiable()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(tmp);
                }
            }

            private void setPath(int index, int value) {
                this.ensurePathIsMutable();
                this.path_.setInt(index, value);
            }

            private void addPath(int value) {
                this.ensurePathIsMutable();
                this.path_.addInt(value);
            }

            private void addAllPath(Iterable<? extends Integer> values) {
                this.ensurePathIsMutable();
                AbstractMessageLite.addAll(values, this.path_);
            }

            private void clearPath() {
                this.path_ = Location.emptyIntList();
            }

            @Override
            public List<Integer> getSpanList() {
                return this.span_;
            }

            @Override
            public int getSpanCount() {
                return this.span_.size();
            }

            @Override
            public int getSpan(int index) {
                return this.span_.getInt(index);
            }

            private void ensureSpanIsMutable() {
                Internal.IntList tmp = this.span_;
                if (!tmp.isModifiable()) {
                    this.span_ = GeneratedMessageLite.mutableCopy(tmp);
                }
            }

            private void setSpan(int index, int value) {
                this.ensureSpanIsMutable();
                this.span_.setInt(index, value);
            }

            private void addSpan(int value) {
                this.ensureSpanIsMutable();
                this.span_.addInt(value);
            }

            private void addAllSpan(Iterable<? extends Integer> values) {
                this.ensureSpanIsMutable();
                AbstractMessageLite.addAll(values, this.span_);
            }

            private void clearSpan() {
                this.span_ = Location.emptyIntList();
            }

            @Override
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public String getLeadingComments() {
                return this.leadingComments_;
            }

            @Override
            public ByteString getLeadingCommentsBytes() {
                return ByteString.copyFromUtf8(this.leadingComments_);
            }

            private void setLeadingComments(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = value;
            }

            private void clearLeadingComments() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.leadingComments_ = Location.getDefaultInstance().getLeadingComments();
            }

            private void setLeadingCommentsBytes(ByteString value) {
                this.leadingComments_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public String getTrailingComments() {
                return this.trailingComments_;
            }

            @Override
            public ByteString getTrailingCommentsBytes() {
                return ByteString.copyFromUtf8(this.trailingComments_);
            }

            private void setTrailingComments(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = value;
            }

            private void clearTrailingComments() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.trailingComments_ = Location.getDefaultInstance().getTrailingComments();
            }

            private void setTrailingCommentsBytes(ByteString value) {
                this.trailingComments_ = value.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override
            public List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override
            public String getLeadingDetachedComments(int index) {
                return (String)this.leadingDetachedComments_.get(index);
            }

            @Override
            public ByteString getLeadingDetachedCommentsBytes(int index) {
                return ByteString.copyFromUtf8((String)this.leadingDetachedComments_.get(index));
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                Internal.ProtobufList<String> tmp = this.leadingDetachedComments_;
                if (!tmp.isModifiable()) {
                    this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(tmp);
                }
            }

            private void setLeadingDetachedComments(int index, String value) {
                value.getClass();
                this.ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(index, value);
            }

            private void addLeadingDetachedComments(String value) {
                value.getClass();
                this.ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(value);
            }

            private void addAllLeadingDetachedComments(Iterable<String> values) {
                this.ensureLeadingDetachedCommentsIsMutable();
                AbstractMessageLite.addAll(values, this.leadingDetachedComments_);
            }

            private void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void addLeadingDetachedCommentsBytes(ByteString value) {
                this.ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(value.toStringUtf8());
            }

            public static Location parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Location parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Location parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Location parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Location parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Location parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Location parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Location parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Location parseDelimitedFrom(InputStream input) throws IOException {
                return Location.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Location parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return Location.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Location parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Location parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Location prototype) {
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
                        return new Location();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"};
                        String info = "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003\u1008\u0000\u0004\u1008\u0001\u0006\u001a";
                        return Location.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<Location> parser = PARSER;
                        if (parser != null) return parser;
                        Class<Location> clazz = Location.class;
                        synchronized (Location.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Location>(DEFAULT_INSTANCE);
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

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Location> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Location defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new Location();
                GeneratedMessageLite.registerDefaultInstance(Location.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Location, Builder>
            implements LocationOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Location)this.instance).getPathList());
                }

                @Override
                public int getPathCount() {
                    return ((Location)this.instance).getPathCount();
                }

                @Override
                public int getPath(int index) {
                    return ((Location)this.instance).getPath(index);
                }

                public Builder setPath(int index, int value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setPath(index, value);
                    return this;
                }

                public Builder addPath(int value) {
                    this.copyOnWrite();
                    ((Location)this.instance).addPath(value);
                    return this;
                }

                public Builder addAllPath(Iterable<? extends Integer> values) {
                    this.copyOnWrite();
                    ((Location)this.instance).addAllPath(values);
                    return this;
                }

                public Builder clearPath() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearPath();
                    return this;
                }

                @Override
                public List<Integer> getSpanList() {
                    return Collections.unmodifiableList(((Location)this.instance).getSpanList());
                }

                @Override
                public int getSpanCount() {
                    return ((Location)this.instance).getSpanCount();
                }

                @Override
                public int getSpan(int index) {
                    return ((Location)this.instance).getSpan(index);
                }

                public Builder setSpan(int index, int value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setSpan(index, value);
                    return this;
                }

                public Builder addSpan(int value) {
                    this.copyOnWrite();
                    ((Location)this.instance).addSpan(value);
                    return this;
                }

                public Builder addAllSpan(Iterable<? extends Integer> values) {
                    this.copyOnWrite();
                    ((Location)this.instance).addAllSpan(values);
                    return this;
                }

                public Builder clearSpan() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearSpan();
                    return this;
                }

                @Override
                public boolean hasLeadingComments() {
                    return ((Location)this.instance).hasLeadingComments();
                }

                @Override
                public String getLeadingComments() {
                    return ((Location)this.instance).getLeadingComments();
                }

                @Override
                public ByteString getLeadingCommentsBytes() {
                    return ((Location)this.instance).getLeadingCommentsBytes();
                }

                public Builder setLeadingComments(String value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setLeadingComments(value);
                    return this;
                }

                public Builder clearLeadingComments() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearLeadingComments();
                    return this;
                }

                public Builder setLeadingCommentsBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setLeadingCommentsBytes(value);
                    return this;
                }

                @Override
                public boolean hasTrailingComments() {
                    return ((Location)this.instance).hasTrailingComments();
                }

                @Override
                public String getTrailingComments() {
                    return ((Location)this.instance).getTrailingComments();
                }

                @Override
                public ByteString getTrailingCommentsBytes() {
                    return ((Location)this.instance).getTrailingCommentsBytes();
                }

                public Builder setTrailingComments(String value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setTrailingComments(value);
                    return this;
                }

                public Builder clearTrailingComments() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearTrailingComments();
                    return this;
                }

                public Builder setTrailingCommentsBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setTrailingCommentsBytes(value);
                    return this;
                }

                @Override
                public List<String> getLeadingDetachedCommentsList() {
                    return Collections.unmodifiableList(((Location)this.instance).getLeadingDetachedCommentsList());
                }

                @Override
                public int getLeadingDetachedCommentsCount() {
                    return ((Location)this.instance).getLeadingDetachedCommentsCount();
                }

                @Override
                public String getLeadingDetachedComments(int index) {
                    return ((Location)this.instance).getLeadingDetachedComments(index);
                }

                @Override
                public ByteString getLeadingDetachedCommentsBytes(int index) {
                    return ((Location)this.instance).getLeadingDetachedCommentsBytes(index);
                }

                public Builder setLeadingDetachedComments(int index, String value) {
                    this.copyOnWrite();
                    ((Location)this.instance).setLeadingDetachedComments(index, value);
                    return this;
                }

                public Builder addLeadingDetachedComments(String value) {
                    this.copyOnWrite();
                    ((Location)this.instance).addLeadingDetachedComments(value);
                    return this;
                }

                public Builder addAllLeadingDetachedComments(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Location)this.instance).addAllLeadingDetachedComments(values);
                    return this;
                }

                public Builder clearLeadingDetachedComments() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearLeadingDetachedComments();
                    return this;
                }

                public Builder addLeadingDetachedCommentsBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Location)this.instance).addLeadingDetachedCommentsBytes(value);
                    return this;
                }
            }
        }

        public static interface LocationOrBuilder
        extends MessageLiteOrBuilder {
            public List<Integer> getPathList();

            public int getPathCount();

            public int getPath(int var1);

            public List<Integer> getSpanList();

            public int getSpanCount();

            public int getSpan(int var1);

            public boolean hasLeadingComments();

            public String getLeadingComments();

            public ByteString getLeadingCommentsBytes();

            public boolean hasTrailingComments();

            public String getTrailingComments();

            public ByteString getTrailingCommentsBytes();

            public List<String> getLeadingDetachedCommentsList();

            public int getLeadingDetachedCommentsCount();

            public String getLeadingDetachedComments(int var1);

            public ByteString getLeadingDetachedCommentsBytes(int var1);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<SourceCodeInfo, Builder>
        implements SourceCodeInfoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public List<Location> getLocationList() {
                return Collections.unmodifiableList(((SourceCodeInfo)this.instance).getLocationList());
            }

            @Override
            public int getLocationCount() {
                return ((SourceCodeInfo)this.instance).getLocationCount();
            }

            @Override
            public Location getLocation(int index) {
                return ((SourceCodeInfo)this.instance).getLocation(index);
            }

            public Builder setLocation(int index, Location value) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).setLocation(index, value);
                return this;
            }

            public Builder setLocation(int index, Location.Builder builderForValue) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).setLocation(index, (Location)builderForValue.build());
                return this;
            }

            public Builder addLocation(Location value) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(value);
                return this;
            }

            public Builder addLocation(int index, Location value) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(index, value);
                return this;
            }

            public Builder addLocation(Location.Builder builderForValue) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation((Location)builderForValue.build());
                return this;
            }

            public Builder addLocation(int index, Location.Builder builderForValue) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(index, (Location)builderForValue.build());
                return this;
            }

            public Builder addAllLocation(Iterable<? extends Location> values) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addAllLocation(values);
                return this;
            }

            public Builder clearLocation() {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).clearLocation();
                return this;
            }

            public Builder removeLocation(int index) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).removeLocation(index);
                return this;
            }
        }
    }

    public static interface SourceCodeInfoOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<SourceCodeInfo, SourceCodeInfo.Builder> {
        public List<SourceCodeInfo.Location> getLocationList();

        public SourceCodeInfo.Location getLocation(int var1);

        public int getLocationCount();
    }

    public static final class FeatureSetDefaults
    extends GeneratedMessageLite<FeatureSetDefaults, Builder>
    implements FeatureSetDefaultsOrBuilder {
        private int bitField0_;
        public static final int DEFAULTS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<FeatureSetEditionDefault> defaults_;
        public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
        private int minimumEdition_;
        public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
        private int maximumEdition_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FeatureSetDefaults DEFAULT_INSTANCE;
        private static volatile Parser<FeatureSetDefaults> PARSER;

        private FeatureSetDefaults() {
            this.defaults_ = FeatureSetDefaults.emptyProtobufList();
        }

        @Override
        public List<FeatureSetEditionDefault> getDefaultsList() {
            return this.defaults_;
        }

        public List<? extends FeatureSetEditionDefaultOrBuilder> getDefaultsOrBuilderList() {
            return this.defaults_;
        }

        @Override
        public int getDefaultsCount() {
            return this.defaults_.size();
        }

        @Override
        public FeatureSetEditionDefault getDefaults(int index) {
            return (FeatureSetEditionDefault)this.defaults_.get(index);
        }

        public FeatureSetEditionDefaultOrBuilder getDefaultsOrBuilder(int index) {
            return (FeatureSetEditionDefaultOrBuilder)this.defaults_.get(index);
        }

        private void ensureDefaultsIsMutable() {
            Internal.ProtobufList<FeatureSetEditionDefault> tmp = this.defaults_;
            if (!tmp.isModifiable()) {
                this.defaults_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setDefaults(int index, FeatureSetEditionDefault value) {
            value.getClass();
            this.ensureDefaultsIsMutable();
            this.defaults_.set(index, value);
        }

        private void addDefaults(FeatureSetEditionDefault value) {
            value.getClass();
            this.ensureDefaultsIsMutable();
            this.defaults_.add(value);
        }

        private void addDefaults(int index, FeatureSetEditionDefault value) {
            value.getClass();
            this.ensureDefaultsIsMutable();
            this.defaults_.add(index, value);
        }

        private void addAllDefaults(Iterable<? extends FeatureSetEditionDefault> values) {
            this.ensureDefaultsIsMutable();
            AbstractMessageLite.addAll(values, this.defaults_);
        }

        private void clearDefaults() {
            this.defaults_ = FeatureSetDefaults.emptyProtobufList();
        }

        private void removeDefaults(int index) {
            this.ensureDefaultsIsMutable();
            this.defaults_.remove(index);
        }

        @Override
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public Edition getMinimumEdition() {
            Edition result = Edition.forNumber(this.minimumEdition_);
            return result == null ? Edition.EDITION_UNKNOWN : result;
        }

        private void setMinimumEdition(Edition value) {
            this.minimumEdition_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        private void clearMinimumEdition() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.minimumEdition_ = 0;
        }

        @Override
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public Edition getMaximumEdition() {
            Edition result = Edition.forNumber(this.maximumEdition_);
            return result == null ? Edition.EDITION_UNKNOWN : result;
        }

        private void setMaximumEdition(Edition value) {
            this.maximumEdition_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        private void clearMaximumEdition() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.maximumEdition_ = 0;
        }

        public static FeatureSetDefaults parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureSetDefaults parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureSetDefaults parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureSetDefaults parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureSetDefaults parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureSetDefaults parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureSetDefaults parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureSetDefaults parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FeatureSetDefaults parseDelimitedFrom(InputStream input) throws IOException {
            return FeatureSetDefaults.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureSetDefaults parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FeatureSetDefaults.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FeatureSetDefaults parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureSetDefaults parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FeatureSetDefaults prototype) {
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
                    return new FeatureSetDefaults();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "defaults_", FeatureSetEditionDefault.class, "minimumEdition_", Edition.internalGetVerifier(), "maximumEdition_", Edition.internalGetVerifier()};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u041b\u0004\u180c\u0000\u0005\u180c\u0001";
                    return FeatureSetDefaults.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FeatureSetDefaults> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FeatureSetDefaults> clazz = FeatureSetDefaults.class;
                    synchronized (FeatureSetDefaults.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FeatureSetDefaults>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FeatureSetDefaults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FeatureSetDefaults> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FeatureSetDefaults defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new FeatureSetDefaults();
            GeneratedMessageLite.registerDefaultInstance(FeatureSetDefaults.class, defaultInstance);
        }

        public static final class FeatureSetEditionDefault
        extends GeneratedMessageLite<FeatureSetEditionDefault, Builder>
        implements FeatureSetEditionDefaultOrBuilder {
            private int bitField0_;
            public static final int EDITION_FIELD_NUMBER = 3;
            private int edition_;
            public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
            private FeatureSet overridableFeatures_;
            public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
            private FeatureSet fixedFeatures_;
            private byte memoizedIsInitialized = (byte)2;
            private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
            private static volatile Parser<FeatureSetEditionDefault> PARSER;

            private FeatureSetEditionDefault() {
            }

            @Override
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public Edition getEdition() {
                Edition result = Edition.forNumber(this.edition_);
                return result == null ? Edition.EDITION_UNKNOWN : result;
            }

            private void setEdition(Edition value) {
                this.edition_ = value.getNumber();
                this.bitField0_ |= 1;
            }

            private void clearEdition() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.edition_ = 0;
            }

            @Override
            public boolean hasOverridableFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public FeatureSet getOverridableFeatures() {
                return this.overridableFeatures_ == null ? FeatureSet.getDefaultInstance() : this.overridableFeatures_;
            }

            private void setOverridableFeatures(FeatureSet value) {
                value.getClass();
                this.overridableFeatures_ = value;
                this.bitField0_ |= 2;
            }

            private void mergeOverridableFeatures(FeatureSet value) {
                value.getClass();
                this.overridableFeatures_ = this.overridableFeatures_ != null && this.overridableFeatures_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.overridableFeatures_).mergeFrom(value)).buildPartial() : value;
                this.bitField0_ |= 2;
            }

            private void clearOverridableFeatures() {
                this.overridableFeatures_ = null;
                this.bitField0_ &= 0xFFFFFFFD;
            }

            @Override
            public boolean hasFixedFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override
            public FeatureSet getFixedFeatures() {
                return this.fixedFeatures_ == null ? FeatureSet.getDefaultInstance() : this.fixedFeatures_;
            }

            private void setFixedFeatures(FeatureSet value) {
                value.getClass();
                this.fixedFeatures_ = value;
                this.bitField0_ |= 4;
            }

            private void mergeFixedFeatures(FeatureSet value) {
                value.getClass();
                this.fixedFeatures_ = this.fixedFeatures_ != null && this.fixedFeatures_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.fixedFeatures_).mergeFrom(value)).buildPartial() : value;
                this.bitField0_ |= 4;
            }

            private void clearFixedFeatures() {
                this.fixedFeatures_ = null;
                this.bitField0_ &= 0xFFFFFFFB;
            }

            public static FeatureSetEditionDefault parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FeatureSetEditionDefault parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FeatureSetEditionDefault parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FeatureSetEditionDefault parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FeatureSetEditionDefault parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FeatureSetEditionDefault parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FeatureSetEditionDefault parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FeatureSetEditionDefault parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FeatureSetEditionDefault parseDelimitedFrom(InputStream input) throws IOException {
                return FeatureSetEditionDefault.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static FeatureSetEditionDefault parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return FeatureSetEditionDefault.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FeatureSetEditionDefault parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FeatureSetEditionDefault parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(FeatureSetEditionDefault prototype) {
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
                        return new FeatureSetEditionDefault();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "edition_", Edition.internalGetVerifier(), "overridableFeatures_", "fixedFeatures_"};
                        String info = "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003\u180c\u0000\u0004\u1409\u0001\u0005\u1409\u0002";
                        return FeatureSetEditionDefault.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<FeatureSetEditionDefault> parser = PARSER;
                        if (parser != null) return parser;
                        Class<FeatureSetEditionDefault> clazz = FeatureSetEditionDefault.class;
                        synchronized (FeatureSetEditionDefault.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FeatureSetEditionDefault>(DEFAULT_INSTANCE);
                            // ** MonitorExit[var5_7] (shouldn't be in output)
                            return parser;
                        }
                    }
                    case GET_MEMOIZED_IS_INITIALIZED: {
                        return this.memoizedIsInitialized;
                    }
                    case SET_MEMOIZED_IS_INITIALIZED: {
                        this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                        return null;
                    }
                }
                throw new UnsupportedOperationException();
            }

            public static FeatureSetEditionDefault getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<FeatureSetEditionDefault> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                FeatureSetEditionDefault defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new FeatureSetEditionDefault();
                GeneratedMessageLite.registerDefaultInstance(FeatureSetEditionDefault.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<FeatureSetEditionDefault, Builder>
            implements FeatureSetEditionDefaultOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasEdition() {
                    return ((FeatureSetEditionDefault)this.instance).hasEdition();
                }

                @Override
                public Edition getEdition() {
                    return ((FeatureSetEditionDefault)this.instance).getEdition();
                }

                public Builder setEdition(Edition value) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).setEdition(value);
                    return this;
                }

                public Builder clearEdition() {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).clearEdition();
                    return this;
                }

                @Override
                public boolean hasOverridableFeatures() {
                    return ((FeatureSetEditionDefault)this.instance).hasOverridableFeatures();
                }

                @Override
                public FeatureSet getOverridableFeatures() {
                    return ((FeatureSetEditionDefault)this.instance).getOverridableFeatures();
                }

                public Builder setOverridableFeatures(FeatureSet value) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).setOverridableFeatures(value);
                    return this;
                }

                public Builder setOverridableFeatures(FeatureSet.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).setOverridableFeatures((FeatureSet)builderForValue.build());
                    return this;
                }

                public Builder mergeOverridableFeatures(FeatureSet value) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).mergeOverridableFeatures(value);
                    return this;
                }

                public Builder clearOverridableFeatures() {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).clearOverridableFeatures();
                    return this;
                }

                @Override
                public boolean hasFixedFeatures() {
                    return ((FeatureSetEditionDefault)this.instance).hasFixedFeatures();
                }

                @Override
                public FeatureSet getFixedFeatures() {
                    return ((FeatureSetEditionDefault)this.instance).getFixedFeatures();
                }

                public Builder setFixedFeatures(FeatureSet value) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).setFixedFeatures(value);
                    return this;
                }

                public Builder setFixedFeatures(FeatureSet.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).setFixedFeatures((FeatureSet)builderForValue.build());
                    return this;
                }

                public Builder mergeFixedFeatures(FeatureSet value) {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).mergeFixedFeatures(value);
                    return this;
                }

                public Builder clearFixedFeatures() {
                    this.copyOnWrite();
                    ((FeatureSetEditionDefault)this.instance).clearFixedFeatures();
                    return this;
                }
            }
        }

        public static interface FeatureSetEditionDefaultOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasEdition();

            public Edition getEdition();

            public boolean hasOverridableFeatures();

            public FeatureSet getOverridableFeatures();

            public boolean hasFixedFeatures();

            public FeatureSet getFixedFeatures();
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FeatureSetDefaults, Builder>
        implements FeatureSetDefaultsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public List<FeatureSetEditionDefault> getDefaultsList() {
                return Collections.unmodifiableList(((FeatureSetDefaults)this.instance).getDefaultsList());
            }

            @Override
            public int getDefaultsCount() {
                return ((FeatureSetDefaults)this.instance).getDefaultsCount();
            }

            @Override
            public FeatureSetEditionDefault getDefaults(int index) {
                return ((FeatureSetDefaults)this.instance).getDefaults(index);
            }

            public Builder setDefaults(int index, FeatureSetEditionDefault value) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).setDefaults(index, value);
                return this;
            }

            public Builder setDefaults(int index, FeatureSetEditionDefault.Builder builderForValue) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).setDefaults(index, (FeatureSetEditionDefault)builderForValue.build());
                return this;
            }

            public Builder addDefaults(FeatureSetEditionDefault value) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).addDefaults(value);
                return this;
            }

            public Builder addDefaults(int index, FeatureSetEditionDefault value) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).addDefaults(index, value);
                return this;
            }

            public Builder addDefaults(FeatureSetEditionDefault.Builder builderForValue) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).addDefaults((FeatureSetEditionDefault)builderForValue.build());
                return this;
            }

            public Builder addDefaults(int index, FeatureSetEditionDefault.Builder builderForValue) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).addDefaults(index, (FeatureSetEditionDefault)builderForValue.build());
                return this;
            }

            public Builder addAllDefaults(Iterable<? extends FeatureSetEditionDefault> values) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).addAllDefaults(values);
                return this;
            }

            public Builder clearDefaults() {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).clearDefaults();
                return this;
            }

            public Builder removeDefaults(int index) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).removeDefaults(index);
                return this;
            }

            @Override
            public boolean hasMinimumEdition() {
                return ((FeatureSetDefaults)this.instance).hasMinimumEdition();
            }

            @Override
            public Edition getMinimumEdition() {
                return ((FeatureSetDefaults)this.instance).getMinimumEdition();
            }

            public Builder setMinimumEdition(Edition value) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).setMinimumEdition(value);
                return this;
            }

            public Builder clearMinimumEdition() {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).clearMinimumEdition();
                return this;
            }

            @Override
            public boolean hasMaximumEdition() {
                return ((FeatureSetDefaults)this.instance).hasMaximumEdition();
            }

            @Override
            public Edition getMaximumEdition() {
                return ((FeatureSetDefaults)this.instance).getMaximumEdition();
            }

            public Builder setMaximumEdition(Edition value) {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).setMaximumEdition(value);
                return this;
            }

            public Builder clearMaximumEdition() {
                this.copyOnWrite();
                ((FeatureSetDefaults)this.instance).clearMaximumEdition();
                return this;
            }
        }
    }

    public static interface FeatureSetDefaultsOrBuilder
    extends MessageLiteOrBuilder {
        public List<FeatureSetDefaults.FeatureSetEditionDefault> getDefaultsList();

        public FeatureSetDefaults.FeatureSetEditionDefault getDefaults(int var1);

        public int getDefaultsCount();

        public boolean hasMinimumEdition();

        public Edition getMinimumEdition();

        public boolean hasMaximumEdition();

        public Edition getMaximumEdition();
    }

    public static final class FeatureSet
    extends GeneratedMessageLite.ExtendableMessage<FeatureSet, Builder>
    implements FeatureSetOrBuilder {
        private int bitField0_;
        public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
        private int fieldPresence_;
        public static final int ENUM_TYPE_FIELD_NUMBER = 2;
        private int enumType_;
        public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
        private int repeatedFieldEncoding_;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
        private int utf8Validation_;
        public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
        private int messageEncoding_;
        public static final int JSON_FORMAT_FIELD_NUMBER = 6;
        private int jsonFormat_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FeatureSet DEFAULT_INSTANCE;
        private static volatile Parser<FeatureSet> PARSER;

        private FeatureSet() {
        }

        @Override
        public boolean hasFieldPresence() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public FieldPresence getFieldPresence() {
            FieldPresence result = FieldPresence.forNumber(this.fieldPresence_);
            return result == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : result;
        }

        private void setFieldPresence(FieldPresence value) {
            this.fieldPresence_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        private void clearFieldPresence() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.fieldPresence_ = 0;
        }

        @Override
        public boolean hasEnumType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public EnumType getEnumType() {
            EnumType result = EnumType.forNumber(this.enumType_);
            return result == null ? EnumType.ENUM_TYPE_UNKNOWN : result;
        }

        private void setEnumType(EnumType value) {
            this.enumType_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        private void clearEnumType() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.enumType_ = 0;
        }

        @Override
        public boolean hasRepeatedFieldEncoding() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            RepeatedFieldEncoding result = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
            return result == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : result;
        }

        private void setRepeatedFieldEncoding(RepeatedFieldEncoding value) {
            this.repeatedFieldEncoding_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        private void clearRepeatedFieldEncoding() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.repeatedFieldEncoding_ = 0;
        }

        @Override
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public Utf8Validation getUtf8Validation() {
            Utf8Validation result = Utf8Validation.forNumber(this.utf8Validation_);
            return result == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : result;
        }

        private void setUtf8Validation(Utf8Validation value) {
            this.utf8Validation_ = value.getNumber();
            this.bitField0_ |= 8;
        }

        private void clearUtf8Validation() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.utf8Validation_ = 0;
        }

        @Override
        public boolean hasMessageEncoding() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public MessageEncoding getMessageEncoding() {
            MessageEncoding result = MessageEncoding.forNumber(this.messageEncoding_);
            return result == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : result;
        }

        private void setMessageEncoding(MessageEncoding value) {
            this.messageEncoding_ = value.getNumber();
            this.bitField0_ |= 0x10;
        }

        private void clearMessageEncoding() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.messageEncoding_ = 0;
        }

        @Override
        public boolean hasJsonFormat() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public JsonFormat getJsonFormat() {
            JsonFormat result = JsonFormat.forNumber(this.jsonFormat_);
            return result == null ? JsonFormat.JSON_FORMAT_UNKNOWN : result;
        }

        private void setJsonFormat(JsonFormat value) {
            this.jsonFormat_ = value.getNumber();
            this.bitField0_ |= 0x20;
        }

        private void clearJsonFormat() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.jsonFormat_ = 0;
        }

        public static FeatureSet parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureSet parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureSet parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureSet parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureSet parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureSet parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureSet parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureSet parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FeatureSet parseDelimitedFrom(InputStream input) throws IOException {
            return FeatureSet.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureSet parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FeatureSet.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FeatureSet parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureSet parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FeatureSet prototype) {
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
                    return new FeatureSet();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "fieldPresence_", FieldPresence.internalGetVerifier(), "enumType_", EnumType.internalGetVerifier(), "repeatedFieldEncoding_", RepeatedFieldEncoding.internalGetVerifier(), "utf8Validation_", Utf8Validation.internalGetVerifier(), "messageEncoding_", MessageEncoding.internalGetVerifier(), "jsonFormat_", JsonFormat.internalGetVerifier()};
                    String info = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005";
                    return FeatureSet.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FeatureSet> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FeatureSet> clazz = FeatureSet.class;
                    synchronized (FeatureSet.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FeatureSet>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FeatureSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FeatureSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FeatureSet defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new FeatureSet();
            GeneratedMessageLite.registerDefaultInstance(FeatureSet.class, defaultInstance);
        }

        public static enum JsonFormat implements Internal.EnumLite
        {
            JSON_FORMAT_UNKNOWN(0),
            ALLOW(1),
            LEGACY_BEST_EFFORT(2);

            public static final int JSON_FORMAT_UNKNOWN_VALUE = 0;
            public static final int ALLOW_VALUE = 1;
            public static final int LEGACY_BEST_EFFORT_VALUE = 2;
            private static final Internal.EnumLiteMap<JsonFormat> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static JsonFormat valueOf(int value) {
                return JsonFormat.forNumber(value);
            }

            public static JsonFormat forNumber(int value) {
                switch (value) {
                    case 0: {
                        return JSON_FORMAT_UNKNOWN;
                    }
                    case 1: {
                        return ALLOW;
                    }
                    case 2: {
                        return LEGACY_BEST_EFFORT;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<JsonFormat> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return JsonFormatVerifier.INSTANCE;
            }

            private JsonFormat(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<JsonFormat>(){

                    @Override
                    public JsonFormat findValueByNumber(int number) {
                        return JsonFormat.forNumber(number);
                    }
                };
            }

            private static final class JsonFormatVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new JsonFormatVerifier();

                private JsonFormatVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return JsonFormat.forNumber(number) != null;
                }
            }
        }

        public static enum MessageEncoding implements Internal.EnumLite
        {
            MESSAGE_ENCODING_UNKNOWN(0),
            LENGTH_PREFIXED(1),
            DELIMITED(2);

            public static final int MESSAGE_ENCODING_UNKNOWN_VALUE = 0;
            public static final int LENGTH_PREFIXED_VALUE = 1;
            public static final int DELIMITED_VALUE = 2;
            private static final Internal.EnumLiteMap<MessageEncoding> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageEncoding valueOf(int value) {
                return MessageEncoding.forNumber(value);
            }

            public static MessageEncoding forNumber(int value) {
                switch (value) {
                    case 0: {
                        return MESSAGE_ENCODING_UNKNOWN;
                    }
                    case 1: {
                        return LENGTH_PREFIXED;
                    }
                    case 2: {
                        return DELIMITED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<MessageEncoding> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return MessageEncodingVerifier.INSTANCE;
            }

            private MessageEncoding(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<MessageEncoding>(){

                    @Override
                    public MessageEncoding findValueByNumber(int number) {
                        return MessageEncoding.forNumber(number);
                    }
                };
            }

            private static final class MessageEncodingVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new MessageEncodingVerifier();

                private MessageEncodingVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return MessageEncoding.forNumber(number) != null;
                }
            }
        }

        public static enum Utf8Validation implements Internal.EnumLite
        {
            UTF8_VALIDATION_UNKNOWN(0),
            VERIFY(2),
            NONE(3);

            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            public static final int VERIFY_VALUE = 2;
            public static final int NONE_VALUE = 3;
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
                    case 2: {
                        return VERIFY;
                    }
                    case 3: {
                        return NONE;
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

        public static enum RepeatedFieldEncoding implements Internal.EnumLite
        {
            REPEATED_FIELD_ENCODING_UNKNOWN(0),
            PACKED(1),
            EXPANDED(2);

            public static final int REPEATED_FIELD_ENCODING_UNKNOWN_VALUE = 0;
            public static final int PACKED_VALUE = 1;
            public static final int EXPANDED_VALUE = 2;
            private static final Internal.EnumLiteMap<RepeatedFieldEncoding> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static RepeatedFieldEncoding valueOf(int value) {
                return RepeatedFieldEncoding.forNumber(value);
            }

            public static RepeatedFieldEncoding forNumber(int value) {
                switch (value) {
                    case 0: {
                        return REPEATED_FIELD_ENCODING_UNKNOWN;
                    }
                    case 1: {
                        return PACKED;
                    }
                    case 2: {
                        return EXPANDED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<RepeatedFieldEncoding> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return RepeatedFieldEncodingVerifier.INSTANCE;
            }

            private RepeatedFieldEncoding(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<RepeatedFieldEncoding>(){

                    @Override
                    public RepeatedFieldEncoding findValueByNumber(int number) {
                        return RepeatedFieldEncoding.forNumber(number);
                    }
                };
            }

            private static final class RepeatedFieldEncodingVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new RepeatedFieldEncodingVerifier();

                private RepeatedFieldEncodingVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return RepeatedFieldEncoding.forNumber(number) != null;
                }
            }
        }

        public static enum EnumType implements Internal.EnumLite
        {
            ENUM_TYPE_UNKNOWN(0),
            OPEN(1),
            CLOSED(2);

            public static final int ENUM_TYPE_UNKNOWN_VALUE = 0;
            public static final int OPEN_VALUE = 1;
            public static final int CLOSED_VALUE = 2;
            private static final Internal.EnumLiteMap<EnumType> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static EnumType valueOf(int value) {
                return EnumType.forNumber(value);
            }

            public static EnumType forNumber(int value) {
                switch (value) {
                    case 0: {
                        return ENUM_TYPE_UNKNOWN;
                    }
                    case 1: {
                        return OPEN;
                    }
                    case 2: {
                        return CLOSED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<EnumType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EnumTypeVerifier.INSTANCE;
            }

            private EnumType(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<EnumType>(){

                    @Override
                    public EnumType findValueByNumber(int number) {
                        return EnumType.forNumber(number);
                    }
                };
            }

            private static final class EnumTypeVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EnumTypeVerifier();

                private EnumTypeVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return EnumType.forNumber(number) != null;
                }
            }
        }

        public static enum FieldPresence implements Internal.EnumLite
        {
            FIELD_PRESENCE_UNKNOWN(0),
            EXPLICIT(1),
            IMPLICIT(2),
            LEGACY_REQUIRED(3);

            public static final int FIELD_PRESENCE_UNKNOWN_VALUE = 0;
            public static final int EXPLICIT_VALUE = 1;
            public static final int IMPLICIT_VALUE = 2;
            public static final int LEGACY_REQUIRED_VALUE = 3;
            private static final Internal.EnumLiteMap<FieldPresence> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static FieldPresence valueOf(int value) {
                return FieldPresence.forNumber(value);
            }

            public static FieldPresence forNumber(int value) {
                switch (value) {
                    case 0: {
                        return FIELD_PRESENCE_UNKNOWN;
                    }
                    case 1: {
                        return EXPLICIT;
                    }
                    case 2: {
                        return IMPLICIT;
                    }
                    case 3: {
                        return LEGACY_REQUIRED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<FieldPresence> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return FieldPresenceVerifier.INSTANCE;
            }

            private FieldPresence(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<FieldPresence>(){

                    @Override
                    public FieldPresence findValueByNumber(int number) {
                        return FieldPresence.forNumber(number);
                    }
                };
            }

            private static final class FieldPresenceVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new FieldPresenceVerifier();

                private FieldPresenceVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return FieldPresence.forNumber(number) != null;
                }
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<FeatureSet, Builder>
        implements FeatureSetOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasFieldPresence() {
                return ((FeatureSet)this.instance).hasFieldPresence();
            }

            @Override
            public FieldPresence getFieldPresence() {
                return ((FeatureSet)this.instance).getFieldPresence();
            }

            public Builder setFieldPresence(FieldPresence value) {
                this.copyOnWrite();
                ((FeatureSet)this.instance).setFieldPresence(value);
                return this;
            }

            public Builder clearFieldPresence() {
                this.copyOnWrite();
                ((FeatureSet)this.instance).clearFieldPresence();
                return this;
            }

            @Override
            public boolean hasEnumType() {
                return ((FeatureSet)this.instance).hasEnumType();
            }

            @Override
            public EnumType getEnumType() {
                return ((FeatureSet)this.instance).getEnumType();
            }

            public Builder setEnumType(EnumType value) {
                this.copyOnWrite();
                ((FeatureSet)this.instance).setEnumType(value);
                return this;
            }

            public Builder clearEnumType() {
                this.copyOnWrite();
                ((FeatureSet)this.instance).clearEnumType();
                return this;
            }

            @Override
            public boolean hasRepeatedFieldEncoding() {
                return ((FeatureSet)this.instance).hasRepeatedFieldEncoding();
            }

            @Override
            public RepeatedFieldEncoding getRepeatedFieldEncoding() {
                return ((FeatureSet)this.instance).getRepeatedFieldEncoding();
            }

            public Builder setRepeatedFieldEncoding(RepeatedFieldEncoding value) {
                this.copyOnWrite();
                ((FeatureSet)this.instance).setRepeatedFieldEncoding(value);
                return this;
            }

            public Builder clearRepeatedFieldEncoding() {
                this.copyOnWrite();
                ((FeatureSet)this.instance).clearRepeatedFieldEncoding();
                return this;
            }

            @Override
            public boolean hasUtf8Validation() {
                return ((FeatureSet)this.instance).hasUtf8Validation();
            }

            @Override
            public Utf8Validation getUtf8Validation() {
                return ((FeatureSet)this.instance).getUtf8Validation();
            }

            public Builder setUtf8Validation(Utf8Validation value) {
                this.copyOnWrite();
                ((FeatureSet)this.instance).setUtf8Validation(value);
                return this;
            }

            public Builder clearUtf8Validation() {
                this.copyOnWrite();
                ((FeatureSet)this.instance).clearUtf8Validation();
                return this;
            }

            @Override
            public boolean hasMessageEncoding() {
                return ((FeatureSet)this.instance).hasMessageEncoding();
            }

            @Override
            public MessageEncoding getMessageEncoding() {
                return ((FeatureSet)this.instance).getMessageEncoding();
            }

            public Builder setMessageEncoding(MessageEncoding value) {
                this.copyOnWrite();
                ((FeatureSet)this.instance).setMessageEncoding(value);
                return this;
            }

            public Builder clearMessageEncoding() {
                this.copyOnWrite();
                ((FeatureSet)this.instance).clearMessageEncoding();
                return this;
            }

            @Override
            public boolean hasJsonFormat() {
                return ((FeatureSet)this.instance).hasJsonFormat();
            }

            @Override
            public JsonFormat getJsonFormat() {
                return ((FeatureSet)this.instance).getJsonFormat();
            }

            public Builder setJsonFormat(JsonFormat value) {
                this.copyOnWrite();
                ((FeatureSet)this.instance).setJsonFormat(value);
                return this;
            }

            public Builder clearJsonFormat() {
                this.copyOnWrite();
                ((FeatureSet)this.instance).clearJsonFormat();
                return this;
            }
        }
    }

    public static interface FeatureSetOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<FeatureSet, FeatureSet.Builder> {
        public boolean hasFieldPresence();

        public FeatureSet.FieldPresence getFieldPresence();

        public boolean hasEnumType();

        public FeatureSet.EnumType getEnumType();

        public boolean hasRepeatedFieldEncoding();

        public FeatureSet.RepeatedFieldEncoding getRepeatedFieldEncoding();

        public boolean hasUtf8Validation();

        public FeatureSet.Utf8Validation getUtf8Validation();

        public boolean hasMessageEncoding();

        public FeatureSet.MessageEncoding getMessageEncoding();

        public boolean hasJsonFormat();

        public FeatureSet.JsonFormat getJsonFormat();
    }

    public static final class UninterpretedOption
    extends GeneratedMessageLite<UninterpretedOption, Builder>
    implements UninterpretedOptionOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 2;
        private Internal.ProtobufList<NamePart> name_;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        private String identifierValue_ = "";
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        private long positiveIntValue_;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private long negativeIntValue_;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        private double doubleValue_;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private ByteString stringValue_;
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private String aggregateValue_ = "";
        private byte memoizedIsInitialized = (byte)2;
        private static final UninterpretedOption DEFAULT_INSTANCE;
        private static volatile Parser<UninterpretedOption> PARSER;

        private UninterpretedOption() {
            this.name_ = UninterpretedOption.emptyProtobufList();
            this.stringValue_ = ByteString.EMPTY;
        }

        @Override
        public List<NamePart> getNameList() {
            return this.name_;
        }

        public List<? extends NamePartOrBuilder> getNameOrBuilderList() {
            return this.name_;
        }

        @Override
        public int getNameCount() {
            return this.name_.size();
        }

        @Override
        public NamePart getName(int index) {
            return (NamePart)this.name_.get(index);
        }

        public NamePartOrBuilder getNameOrBuilder(int index) {
            return (NamePartOrBuilder)this.name_.get(index);
        }

        private void ensureNameIsMutable() {
            Internal.ProtobufList<NamePart> tmp = this.name_;
            if (!tmp.isModifiable()) {
                this.name_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setName(int index, NamePart value) {
            value.getClass();
            this.ensureNameIsMutable();
            this.name_.set(index, value);
        }

        private void addName(NamePart value) {
            value.getClass();
            this.ensureNameIsMutable();
            this.name_.add(value);
        }

        private void addName(int index, NamePart value) {
            value.getClass();
            this.ensureNameIsMutable();
            this.name_.add(index, value);
        }

        private void addAllName(Iterable<? extends NamePart> values) {
            this.ensureNameIsMutable();
            AbstractMessageLite.addAll(values, this.name_);
        }

        private void clearName() {
            this.name_ = UninterpretedOption.emptyProtobufList();
        }

        private void removeName(int index) {
            this.ensureNameIsMutable();
            this.name_.remove(index);
        }

        @Override
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        @Override
        public ByteString getIdentifierValueBytes() {
            return ByteString.copyFromUtf8(this.identifierValue_);
        }

        private void setIdentifierValue(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = value;
        }

        private void clearIdentifierValue() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.identifierValue_ = UninterpretedOption.getDefaultInstance().getIdentifierValue();
        }

        private void setIdentifierValueBytes(ByteString value) {
            this.identifierValue_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        private void setPositiveIntValue(long value) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = value;
        }

        private void clearPositiveIntValue() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.positiveIntValue_ = 0L;
        }

        @Override
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        private void setNegativeIntValue(long value) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = value;
        }

        private void clearNegativeIntValue() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.negativeIntValue_ = 0L;
        }

        @Override
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        private void setDoubleValue(double value) {
            this.bitField0_ |= 8;
            this.doubleValue_ = value;
        }

        private void clearDoubleValue() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.doubleValue_ = 0.0;
        }

        @Override
        public boolean hasStringValue() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public ByteString getStringValue() {
            return this.stringValue_;
        }

        private void setStringValue(ByteString value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 0x10;
            this.stringValue_ = value;
        }

        private void clearStringValue() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.stringValue_ = UninterpretedOption.getDefaultInstance().getStringValue();
        }

        @Override
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        @Override
        public ByteString getAggregateValueBytes() {
            return ByteString.copyFromUtf8(this.aggregateValue_);
        }

        private void setAggregateValue(String value) {
            value.getClass();
            this.bitField0_ |= 0x20;
            this.aggregateValue_ = value;
        }

        private void clearAggregateValue() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.aggregateValue_ = UninterpretedOption.getDefaultInstance().getAggregateValue();
        }

        private void setAggregateValueBytes(ByteString value) {
            this.aggregateValue_ = value.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        public static UninterpretedOption parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UninterpretedOption parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UninterpretedOption parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UninterpretedOption parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UninterpretedOption parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UninterpretedOption parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UninterpretedOption parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UninterpretedOption parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream input) throws IOException {
            return UninterpretedOption.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return UninterpretedOption.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UninterpretedOption parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UninterpretedOption parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UninterpretedOption prototype) {
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
                    return new UninterpretedOption();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"};
                    String info = "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002\u041b\u0003\u1008\u0000\u0004\u1003\u0001\u0005\u1002\u0002\u0006\u1000\u0003\u0007\u100a\u0004\b\u1008\u0005";
                    return UninterpretedOption.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<UninterpretedOption> parser = PARSER;
                    if (parser != null) return parser;
                    Class<UninterpretedOption> clazz = UninterpretedOption.class;
                    synchronized (UninterpretedOption.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<UninterpretedOption>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<UninterpretedOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            UninterpretedOption defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new UninterpretedOption();
            GeneratedMessageLite.registerDefaultInstance(UninterpretedOption.class, defaultInstance);
        }

        public static final class NamePart
        extends GeneratedMessageLite<NamePart, Builder>
        implements NamePartOrBuilder {
            private int bitField0_;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private String namePart_ = "";
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            private boolean isExtension_;
            private byte memoizedIsInitialized = (byte)2;
            private static final NamePart DEFAULT_INSTANCE;
            private static volatile Parser<NamePart> PARSER;

            private NamePart() {
            }

            @Override
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public String getNamePart() {
                return this.namePart_;
            }

            @Override
            public ByteString getNamePartBytes() {
                return ByteString.copyFromUtf8(this.namePart_);
            }

            private void setNamePart(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = value;
            }

            private void clearNamePart() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.namePart_ = NamePart.getDefaultInstance().getNamePart();
            }

            private void setNamePartBytes(ByteString value) {
                this.namePart_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            private void setIsExtension(boolean value) {
                this.bitField0_ |= 2;
                this.isExtension_ = value;
            }

            private void clearIsExtension() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.isExtension_ = false;
            }

            public static NamePart parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static NamePart parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static NamePart parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static NamePart parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static NamePart parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static NamePart parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static NamePart parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static NamePart parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static NamePart parseDelimitedFrom(InputStream input) throws IOException {
                return NamePart.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static NamePart parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return NamePart.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static NamePart parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static NamePart parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(NamePart prototype) {
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
                        return new NamePart();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "namePart_", "isExtension_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1507\u0001";
                        return NamePart.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<NamePart> parser = PARSER;
                        if (parser != null) return parser;
                        Class<NamePart> clazz = NamePart.class;
                        synchronized (NamePart.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<NamePart>(DEFAULT_INSTANCE);
                            // ** MonitorExit[var5_7] (shouldn't be in output)
                            return parser;
                        }
                    }
                    case GET_MEMOIZED_IS_INITIALIZED: {
                        return this.memoizedIsInitialized;
                    }
                    case SET_MEMOIZED_IS_INITIALIZED: {
                        this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                        return null;
                    }
                }
                throw new UnsupportedOperationException();
            }

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<NamePart> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                NamePart defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new NamePart();
                GeneratedMessageLite.registerDefaultInstance(NamePart.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<NamePart, Builder>
            implements NamePartOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasNamePart() {
                    return ((NamePart)this.instance).hasNamePart();
                }

                @Override
                public String getNamePart() {
                    return ((NamePart)this.instance).getNamePart();
                }

                @Override
                public ByteString getNamePartBytes() {
                    return ((NamePart)this.instance).getNamePartBytes();
                }

                public Builder setNamePart(String value) {
                    this.copyOnWrite();
                    ((NamePart)this.instance).setNamePart(value);
                    return this;
                }

                public Builder clearNamePart() {
                    this.copyOnWrite();
                    ((NamePart)this.instance).clearNamePart();
                    return this;
                }

                public Builder setNamePartBytes(ByteString value) {
                    this.copyOnWrite();
                    ((NamePart)this.instance).setNamePartBytes(value);
                    return this;
                }

                @Override
                public boolean hasIsExtension() {
                    return ((NamePart)this.instance).hasIsExtension();
                }

                @Override
                public boolean getIsExtension() {
                    return ((NamePart)this.instance).getIsExtension();
                }

                public Builder setIsExtension(boolean value) {
                    this.copyOnWrite();
                    ((NamePart)this.instance).setIsExtension(value);
                    return this;
                }

                public Builder clearIsExtension() {
                    this.copyOnWrite();
                    ((NamePart)this.instance).clearIsExtension();
                    return this;
                }
            }
        }

        public static interface NamePartOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasNamePart();

            public String getNamePart();

            public ByteString getNamePartBytes();

            public boolean hasIsExtension();

            public boolean getIsExtension();
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<UninterpretedOption, Builder>
        implements UninterpretedOptionOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public List<NamePart> getNameList() {
                return Collections.unmodifiableList(((UninterpretedOption)this.instance).getNameList());
            }

            @Override
            public int getNameCount() {
                return ((UninterpretedOption)this.instance).getNameCount();
            }

            @Override
            public NamePart getName(int index) {
                return ((UninterpretedOption)this.instance).getName(index);
            }

            public Builder setName(int index, NamePart value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setName(index, value);
                return this;
            }

            public Builder setName(int index, NamePart.Builder builderForValue) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setName(index, (NamePart)builderForValue.build());
                return this;
            }

            public Builder addName(NamePart value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(value);
                return this;
            }

            public Builder addName(int index, NamePart value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(index, value);
                return this;
            }

            public Builder addName(NamePart.Builder builderForValue) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName((NamePart)builderForValue.build());
                return this;
            }

            public Builder addName(int index, NamePart.Builder builderForValue) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(index, (NamePart)builderForValue.build());
                return this;
            }

            public Builder addAllName(Iterable<? extends NamePart> values) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addAllName(values);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearName();
                return this;
            }

            public Builder removeName(int index) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).removeName(index);
                return this;
            }

            @Override
            public boolean hasIdentifierValue() {
                return ((UninterpretedOption)this.instance).hasIdentifierValue();
            }

            @Override
            public String getIdentifierValue() {
                return ((UninterpretedOption)this.instance).getIdentifierValue();
            }

            @Override
            public ByteString getIdentifierValueBytes() {
                return ((UninterpretedOption)this.instance).getIdentifierValueBytes();
            }

            public Builder setIdentifierValue(String value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setIdentifierValue(value);
                return this;
            }

            public Builder clearIdentifierValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearIdentifierValue();
                return this;
            }

            public Builder setIdentifierValueBytes(ByteString value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setIdentifierValueBytes(value);
                return this;
            }

            @Override
            public boolean hasPositiveIntValue() {
                return ((UninterpretedOption)this.instance).hasPositiveIntValue();
            }

            @Override
            public long getPositiveIntValue() {
                return ((UninterpretedOption)this.instance).getPositiveIntValue();
            }

            public Builder setPositiveIntValue(long value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setPositiveIntValue(value);
                return this;
            }

            public Builder clearPositiveIntValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearPositiveIntValue();
                return this;
            }

            @Override
            public boolean hasNegativeIntValue() {
                return ((UninterpretedOption)this.instance).hasNegativeIntValue();
            }

            @Override
            public long getNegativeIntValue() {
                return ((UninterpretedOption)this.instance).getNegativeIntValue();
            }

            public Builder setNegativeIntValue(long value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setNegativeIntValue(value);
                return this;
            }

            public Builder clearNegativeIntValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearNegativeIntValue();
                return this;
            }

            @Override
            public boolean hasDoubleValue() {
                return ((UninterpretedOption)this.instance).hasDoubleValue();
            }

            @Override
            public double getDoubleValue() {
                return ((UninterpretedOption)this.instance).getDoubleValue();
            }

            public Builder setDoubleValue(double value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setDoubleValue(value);
                return this;
            }

            public Builder clearDoubleValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearDoubleValue();
                return this;
            }

            @Override
            public boolean hasStringValue() {
                return ((UninterpretedOption)this.instance).hasStringValue();
            }

            @Override
            public ByteString getStringValue() {
                return ((UninterpretedOption)this.instance).getStringValue();
            }

            public Builder setStringValue(ByteString value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setStringValue(value);
                return this;
            }

            public Builder clearStringValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearStringValue();
                return this;
            }

            @Override
            public boolean hasAggregateValue() {
                return ((UninterpretedOption)this.instance).hasAggregateValue();
            }

            @Override
            public String getAggregateValue() {
                return ((UninterpretedOption)this.instance).getAggregateValue();
            }

            @Override
            public ByteString getAggregateValueBytes() {
                return ((UninterpretedOption)this.instance).getAggregateValueBytes();
            }

            public Builder setAggregateValue(String value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setAggregateValue(value);
                return this;
            }

            public Builder clearAggregateValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearAggregateValue();
                return this;
            }

            public Builder setAggregateValueBytes(ByteString value) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setAggregateValueBytes(value);
                return this;
            }
        }
    }

    public static interface UninterpretedOptionOrBuilder
    extends MessageLiteOrBuilder {
        public List<UninterpretedOption.NamePart> getNameList();

        public UninterpretedOption.NamePart getName(int var1);

        public int getNameCount();

        public boolean hasIdentifierValue();

        public String getIdentifierValue();

        public ByteString getIdentifierValueBytes();

        public boolean hasPositiveIntValue();

        public long getPositiveIntValue();

        public boolean hasNegativeIntValue();

        public long getNegativeIntValue();

        public boolean hasDoubleValue();

        public double getDoubleValue();

        public boolean hasStringValue();

        public ByteString getStringValue();

        public boolean hasAggregateValue();

        public String getAggregateValue();

        public ByteString getAggregateValueBytes();
    }

    public static final class MethodOptions
    extends GeneratedMessageLite.ExtendableMessage<MethodOptions, Builder>
    implements MethodOptionsOrBuilder {
        private int bitField0_;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private boolean deprecated_;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private int idempotencyLevel_;
        public static final int FEATURES_FIELD_NUMBER = 35;
        private FeatureSet features_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final MethodOptions DEFAULT_INSTANCE;
        private static volatile Parser<MethodOptions> PARSER;

        private MethodOptions() {
            this.uninterpretedOption_ = MethodOptions.emptyProtobufList();
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 1;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.deprecated_ = false;
        }

        @Override
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel result = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            return result == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : result;
        }

        private void setIdempotencyLevel(IdempotencyLevel value) {
            this.idempotencyLevel_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        private void clearIdempotencyLevel() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.idempotencyLevel_ = 0;
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 4;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 4;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFFB;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = MethodOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static MethodOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MethodOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MethodOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MethodOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MethodOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MethodOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MethodOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MethodOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MethodOptions parseDelimitedFrom(InputStream input) throws IOException {
            return MethodOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MethodOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return MethodOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MethodOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MethodOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MethodOptions prototype) {
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
                    return new MethodOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.internalGetVerifier(), "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0004\u0000\u0001!\u03e7\u0004\u0000\u0001\u0002!\u1007\u0000\"\u180c\u0001#\u1409\u0002\u03e7\u041b";
                    return MethodOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<MethodOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<MethodOptions> clazz = MethodOptions.class;
                    synchronized (MethodOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<MethodOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MethodOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            MethodOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new MethodOptions();
            GeneratedMessageLite.registerDefaultInstance(MethodOptions.class, defaultInstance);
        }

        public static enum IdempotencyLevel implements Internal.EnumLite
        {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            public static final int IDEMPOTENT_VALUE = 2;
            private static final Internal.EnumLiteMap<IdempotencyLevel> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int value) {
                return IdempotencyLevel.forNumber(value);
            }

            public static IdempotencyLevel forNumber(int value) {
                switch (value) {
                    case 0: {
                        return IDEMPOTENCY_UNKNOWN;
                    }
                    case 1: {
                        return NO_SIDE_EFFECTS;
                    }
                    case 2: {
                        return IDEMPOTENT;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<IdempotencyLevel> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return IdempotencyLevelVerifier.INSTANCE;
            }

            private IdempotencyLevel(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<IdempotencyLevel>(){

                    @Override
                    public IdempotencyLevel findValueByNumber(int number) {
                        return IdempotencyLevel.forNumber(number);
                    }
                };
            }

            private static final class IdempotencyLevelVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new IdempotencyLevelVerifier();

                private IdempotencyLevelVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return IdempotencyLevel.forNumber(number) != null;
                }
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<MethodOptions, Builder>
        implements MethodOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasDeprecated() {
                return ((MethodOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((MethodOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            public boolean hasIdempotencyLevel() {
                return ((MethodOptions)this.instance).hasIdempotencyLevel();
            }

            @Override
            public IdempotencyLevel getIdempotencyLevel() {
                return ((MethodOptions)this.instance).getIdempotencyLevel();
            }

            public Builder setIdempotencyLevel(IdempotencyLevel value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setIdempotencyLevel(value);
                return this;
            }

            public Builder clearIdempotencyLevel() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearIdempotencyLevel();
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((MethodOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((MethodOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MethodOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((MethodOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((MethodOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface MethodOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<MethodOptions, MethodOptions.Builder> {
        public boolean hasDeprecated();

        public boolean getDeprecated();

        public boolean hasIdempotencyLevel();

        public MethodOptions.IdempotencyLevel getIdempotencyLevel();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class ServiceOptions
    extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, Builder>
    implements ServiceOptionsOrBuilder {
        private int bitField0_;
        public static final int FEATURES_FIELD_NUMBER = 34;
        private FeatureSet features_;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private boolean deprecated_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final ServiceOptions DEFAULT_INSTANCE;
        private static volatile Parser<ServiceOptions> PARSER;

        private ServiceOptions() {
            this.uninterpretedOption_ = ServiceOptions.emptyProtobufList();
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 1;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 2;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.deprecated_ = false;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = ServiceOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static ServiceOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ServiceOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ServiceOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ServiceOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ServiceOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ServiceOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ServiceOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ServiceOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream input) throws IOException {
            return ServiceOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return ServiceOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ServiceOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ServiceOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ServiceOptions prototype) {
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
                    return new ServiceOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "deprecated_", "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0003\u0000\u0001!\u03e7\u0003\u0000\u0001\u0002!\u1007\u0001\"\u1409\u0000\u03e7\u041b";
                    return ServiceOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<ServiceOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<ServiceOptions> clazz = ServiceOptions.class;
                    synchronized (ServiceOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<ServiceOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ServiceOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ServiceOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new ServiceOptions();
            GeneratedMessageLite.registerDefaultInstance(ServiceOptions.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<ServiceOptions, Builder>
        implements ServiceOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasFeatures() {
                return ((ServiceOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((ServiceOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public boolean hasDeprecated() {
                return ((ServiceOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((ServiceOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ServiceOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((ServiceOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((ServiceOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface ServiceOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<ServiceOptions, ServiceOptions.Builder> {
        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public boolean hasDeprecated();

        public boolean getDeprecated();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class EnumValueOptions
    extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, Builder>
    implements EnumValueOptionsOrBuilder {
        private int bitField0_;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private boolean deprecated_;
        public static final int FEATURES_FIELD_NUMBER = 2;
        private FeatureSet features_;
        public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
        private boolean debugRedact_;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
        private FieldOptions.FeatureSupport featureSupport_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final EnumValueOptions DEFAULT_INSTANCE;
        private static volatile Parser<EnumValueOptions> PARSER;

        private EnumValueOptions() {
            this.uninterpretedOption_ = EnumValueOptions.emptyProtobufList();
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 1;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.deprecated_ = false;
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 2;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        @Override
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        private void setDebugRedact(boolean value) {
            this.bitField0_ |= 4;
            this.debugRedact_ = value;
        }

        private void clearDebugRedact() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.debugRedact_ = false;
        }

        @Override
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public FieldOptions.FeatureSupport getFeatureSupport() {
            return this.featureSupport_ == null ? FieldOptions.FeatureSupport.getDefaultInstance() : this.featureSupport_;
        }

        private void setFeatureSupport(FieldOptions.FeatureSupport value) {
            value.getClass();
            this.featureSupport_ = value;
            this.bitField0_ |= 8;
        }

        private void mergeFeatureSupport(FieldOptions.FeatureSupport value) {
            value.getClass();
            this.featureSupport_ = this.featureSupport_ != null && this.featureSupport_ != FieldOptions.FeatureSupport.getDefaultInstance() ? (FieldOptions.FeatureSupport)((FieldOptions.FeatureSupport.Builder)FieldOptions.FeatureSupport.newBuilder(this.featureSupport_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 8;
        }

        private void clearFeatureSupport() {
            this.featureSupport_ = null;
            this.bitField0_ &= 0xFFFFFFF7;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = EnumValueOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static EnumValueOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumValueOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumValueOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumValueOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumValueOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumValueOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumValueOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumValueOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream input) throws IOException {
            return EnumValueOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return EnumValueOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumValueOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumValueOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EnumValueOptions prototype) {
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
                    return new EnumValueOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u03e7\u041b";
                    return EnumValueOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<EnumValueOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<EnumValueOptions> clazz = EnumValueOptions.class;
                    synchronized (EnumValueOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<EnumValueOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EnumValueOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            EnumValueOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new EnumValueOptions();
            GeneratedMessageLite.registerDefaultInstance(EnumValueOptions.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<EnumValueOptions, Builder>
        implements EnumValueOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasDeprecated() {
                return ((EnumValueOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((EnumValueOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((EnumValueOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((EnumValueOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public boolean hasDebugRedact() {
                return ((EnumValueOptions)this.instance).hasDebugRedact();
            }

            @Override
            public boolean getDebugRedact() {
                return ((EnumValueOptions)this.instance).getDebugRedact();
            }

            public Builder setDebugRedact(boolean value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setDebugRedact(value);
                return this;
            }

            public Builder clearDebugRedact() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearDebugRedact();
                return this;
            }

            @Override
            public boolean hasFeatureSupport() {
                return ((EnumValueOptions)this.instance).hasFeatureSupport();
            }

            @Override
            public FieldOptions.FeatureSupport getFeatureSupport() {
                return ((EnumValueOptions)this.instance).getFeatureSupport();
            }

            public Builder setFeatureSupport(FieldOptions.FeatureSupport value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setFeatureSupport(value);
                return this;
            }

            public Builder setFeatureSupport(FieldOptions.FeatureSupport.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setFeatureSupport((FieldOptions.FeatureSupport)builderForValue.build());
                return this;
            }

            public Builder mergeFeatureSupport(FieldOptions.FeatureSupport value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).mergeFeatureSupport(value);
                return this;
            }

            public Builder clearFeatureSupport() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearFeatureSupport();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumValueOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((EnumValueOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((EnumValueOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface EnumValueOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumValueOptions, EnumValueOptions.Builder> {
        public boolean hasDeprecated();

        public boolean getDeprecated();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public boolean hasDebugRedact();

        public boolean getDebugRedact();

        public boolean hasFeatureSupport();

        public FieldOptions.FeatureSupport getFeatureSupport();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class EnumOptions
    extends GeneratedMessageLite.ExtendableMessage<EnumOptions, Builder>
    implements EnumOptionsOrBuilder {
        private int bitField0_;
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private boolean allowAlias_;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private boolean deprecated_;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        public static final int FEATURES_FIELD_NUMBER = 7;
        private FeatureSet features_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final EnumOptions DEFAULT_INSTANCE;
        private static volatile Parser<EnumOptions> PARSER;

        private EnumOptions() {
            this.uninterpretedOption_ = EnumOptions.emptyProtobufList();
        }

        @Override
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        private void setAllowAlias(boolean value) {
            this.bitField0_ |= 1;
            this.allowAlias_ = value;
        }

        private void clearAllowAlias() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.allowAlias_ = false;
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 2;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.deprecated_ = false;
        }

        @Override
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        private void setDeprecatedLegacyJsonFieldConflicts(boolean value) {
            this.bitField0_ |= 4;
            this.deprecatedLegacyJsonFieldConflicts_ = value;
        }

        private void clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 8;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 8;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFF7;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = EnumOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static EnumOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumOptions parseDelimitedFrom(InputStream input) throws IOException {
            return EnumOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return EnumOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EnumOptions prototype) {
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
                    return new EnumOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0005\u0000\u0001\u0002\u03e7\u0005\u0000\u0001\u0002\u0002\u1007\u0000\u0003\u1007\u0001\u0006\u1007\u0002\u0007\u1409\u0003\u03e7\u041b";
                    return EnumOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<EnumOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<EnumOptions> clazz = EnumOptions.class;
                    synchronized (EnumOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<EnumOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EnumOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            EnumOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new EnumOptions();
            GeneratedMessageLite.registerDefaultInstance(EnumOptions.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<EnumOptions, Builder>
        implements EnumOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasAllowAlias() {
                return ((EnumOptions)this.instance).hasAllowAlias();
            }

            @Override
            public boolean getAllowAlias() {
                return ((EnumOptions)this.instance).getAllowAlias();
            }

            public Builder setAllowAlias(boolean value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setAllowAlias(value);
                return this;
            }

            public Builder clearAllowAlias() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearAllowAlias();
                return this;
            }

            @Override
            public boolean hasDeprecated() {
                return ((EnumOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((EnumOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            @Deprecated
            public boolean hasDeprecatedLegacyJsonFieldConflicts() {
                return ((EnumOptions)this.instance).hasDeprecatedLegacyJsonFieldConflicts();
            }

            @Override
            @Deprecated
            public boolean getDeprecatedLegacyJsonFieldConflicts() {
                return ((EnumOptions)this.instance).getDeprecatedLegacyJsonFieldConflicts();
            }

            @Deprecated
            public Builder setDeprecatedLegacyJsonFieldConflicts(boolean value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setDeprecatedLegacyJsonFieldConflicts(value);
                return this;
            }

            @Deprecated
            public Builder clearDeprecatedLegacyJsonFieldConflicts() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearDeprecatedLegacyJsonFieldConflicts();
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((EnumOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((EnumOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((EnumOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((EnumOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface EnumOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumOptions, EnumOptions.Builder> {
        public boolean hasAllowAlias();

        public boolean getAllowAlias();

        public boolean hasDeprecated();

        public boolean getDeprecated();

        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts();

        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class OneofOptions
    extends GeneratedMessageLite.ExtendableMessage<OneofOptions, Builder>
    implements OneofOptionsOrBuilder {
        private int bitField0_;
        public static final int FEATURES_FIELD_NUMBER = 1;
        private FeatureSet features_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final OneofOptions DEFAULT_INSTANCE;
        private static volatile Parser<OneofOptions> PARSER;

        private OneofOptions() {
            this.uninterpretedOption_ = OneofOptions.emptyProtobufList();
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 1;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = OneofOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static OneofOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OneofOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OneofOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OneofOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OneofOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OneofOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OneofOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OneofOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OneofOptions parseDelimitedFrom(InputStream input) throws IOException {
            return OneofOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static OneofOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return OneofOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OneofOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OneofOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OneofOptions prototype) {
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
                    return new OneofOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0002\u0000\u0001\u0001\u03e7\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u03e7\u041b";
                    return OneofOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<OneofOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<OneofOptions> clazz = OneofOptions.class;
                    synchronized (OneofOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<OneofOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<OneofOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            OneofOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new OneofOptions();
            GeneratedMessageLite.registerDefaultInstance(OneofOptions.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<OneofOptions, Builder>
        implements OneofOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasFeatures() {
                return ((OneofOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((OneofOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((OneofOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((OneofOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((OneofOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((OneofOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((OneofOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface OneofOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<OneofOptions, OneofOptions.Builder> {
        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class FieldOptions
    extends GeneratedMessageLite.ExtendableMessage<FieldOptions, Builder>
    implements FieldOptionsOrBuilder {
        private int bitField0_;
        public static final int CTYPE_FIELD_NUMBER = 1;
        private int ctype_;
        public static final int PACKED_FIELD_NUMBER = 2;
        private boolean packed_;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        private int jstype_;
        public static final int LAZY_FIELD_NUMBER = 5;
        private boolean lazy_;
        public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
        private boolean unverifiedLazy_;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private boolean deprecated_;
        public static final int WEAK_FIELD_NUMBER = 10;
        private boolean weak_;
        public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
        private boolean debugRedact_;
        public static final int RETENTION_FIELD_NUMBER = 17;
        private int retention_;
        public static final int TARGETS_FIELD_NUMBER = 19;
        private Internal.IntList targets_;
        private static final Internal.IntListAdapter.IntConverter<OptionTargetType> targets_converter_;
        public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
        private Internal.ProtobufList<EditionDefault> editionDefaults_;
        public static final int FEATURES_FIELD_NUMBER = 21;
        private FeatureSet features_;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
        private FeatureSupport featureSupport_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FieldOptions DEFAULT_INSTANCE;
        private static volatile Parser<FieldOptions> PARSER;

        private FieldOptions() {
            this.targets_ = FieldOptions.emptyIntList();
            this.editionDefaults_ = FieldOptions.emptyProtobufList();
            this.uninterpretedOption_ = FieldOptions.emptyProtobufList();
        }

        @Override
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public CType getCtype() {
            CType result = CType.forNumber(this.ctype_);
            return result == null ? CType.STRING : result;
        }

        private void setCtype(CType value) {
            this.ctype_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        private void clearCtype() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.ctype_ = 0;
        }

        @Override
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public boolean getPacked() {
            return this.packed_;
        }

        private void setPacked(boolean value) {
            this.bitField0_ |= 2;
            this.packed_ = value;
        }

        private void clearPacked() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.packed_ = false;
        }

        @Override
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public JSType getJstype() {
            JSType result = JSType.forNumber(this.jstype_);
            return result == null ? JSType.JS_NORMAL : result;
        }

        private void setJstype(JSType value) {
            this.jstype_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        private void clearJstype() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.jstype_ = 0;
        }

        @Override
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public boolean getLazy() {
            return this.lazy_;
        }

        private void setLazy(boolean value) {
            this.bitField0_ |= 8;
            this.lazy_ = value;
        }

        private void clearLazy() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.lazy_ = false;
        }

        @Override
        public boolean hasUnverifiedLazy() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        private void setUnverifiedLazy(boolean value) {
            this.bitField0_ |= 0x10;
            this.unverifiedLazy_ = value;
        }

        private void clearUnverifiedLazy() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.unverifiedLazy_ = false;
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 0x20;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.deprecated_ = false;
        }

        @Override
        public boolean hasWeak() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override
        public boolean getWeak() {
            return this.weak_;
        }

        private void setWeak(boolean value) {
            this.bitField0_ |= 0x40;
            this.weak_ = value;
        }

        private void clearWeak() {
            this.bitField0_ &= 0xFFFFFFBF;
            this.weak_ = false;
        }

        @Override
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        private void setDebugRedact(boolean value) {
            this.bitField0_ |= 0x80;
            this.debugRedact_ = value;
        }

        private void clearDebugRedact() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.debugRedact_ = false;
        }

        @Override
        public boolean hasRetention() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override
        public OptionRetention getRetention() {
            OptionRetention result = OptionRetention.forNumber(this.retention_);
            return result == null ? OptionRetention.RETENTION_UNKNOWN : result;
        }

        private void setRetention(OptionRetention value) {
            this.retention_ = value.getNumber();
            this.bitField0_ |= 0x100;
        }

        private void clearRetention() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.retention_ = 0;
        }

        @Override
        public List<OptionTargetType> getTargetsList() {
            return new Internal.IntListAdapter<OptionTargetType>(this.targets_, targets_converter_);
        }

        @Override
        public int getTargetsCount() {
            return this.targets_.size();
        }

        @Override
        public OptionTargetType getTargets(int index) {
            OptionTargetType result = OptionTargetType.forNumber(this.targets_.getInt(index));
            return result == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : result;
        }

        private void ensureTargetsIsMutable() {
            Internal.IntList tmp = this.targets_;
            if (!tmp.isModifiable()) {
                this.targets_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setTargets(int index, OptionTargetType value) {
            value.getClass();
            this.ensureTargetsIsMutable();
            this.targets_.setInt(index, value.getNumber());
        }

        private void addTargets(OptionTargetType value) {
            value.getClass();
            this.ensureTargetsIsMutable();
            this.targets_.addInt(value.getNumber());
        }

        private void addAllTargets(Iterable<? extends OptionTargetType> values) {
            this.ensureTargetsIsMutable();
            for (OptionTargetType optionTargetType : values) {
                this.targets_.addInt(optionTargetType.getNumber());
            }
        }

        private void clearTargets() {
            this.targets_ = FieldOptions.emptyIntList();
        }

        @Override
        public List<EditionDefault> getEditionDefaultsList() {
            return this.editionDefaults_;
        }

        public List<? extends EditionDefaultOrBuilder> getEditionDefaultsOrBuilderList() {
            return this.editionDefaults_;
        }

        @Override
        public int getEditionDefaultsCount() {
            return this.editionDefaults_.size();
        }

        @Override
        public EditionDefault getEditionDefaults(int index) {
            return (EditionDefault)this.editionDefaults_.get(index);
        }

        public EditionDefaultOrBuilder getEditionDefaultsOrBuilder(int index) {
            return (EditionDefaultOrBuilder)this.editionDefaults_.get(index);
        }

        private void ensureEditionDefaultsIsMutable() {
            Internal.ProtobufList<EditionDefault> tmp = this.editionDefaults_;
            if (!tmp.isModifiable()) {
                this.editionDefaults_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setEditionDefaults(int index, EditionDefault value) {
            value.getClass();
            this.ensureEditionDefaultsIsMutable();
            this.editionDefaults_.set(index, value);
        }

        private void addEditionDefaults(EditionDefault value) {
            value.getClass();
            this.ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(value);
        }

        private void addEditionDefaults(int index, EditionDefault value) {
            value.getClass();
            this.ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(index, value);
        }

        private void addAllEditionDefaults(Iterable<? extends EditionDefault> values) {
            this.ensureEditionDefaultsIsMutable();
            AbstractMessageLite.addAll(values, this.editionDefaults_);
        }

        private void clearEditionDefaults() {
            this.editionDefaults_ = FieldOptions.emptyProtobufList();
        }

        private void removeEditionDefaults(int index) {
            this.ensureEditionDefaultsIsMutable();
            this.editionDefaults_.remove(index);
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 0x200;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 0x200;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFDFF;
        }

        @Override
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override
        public FeatureSupport getFeatureSupport() {
            return this.featureSupport_ == null ? FeatureSupport.getDefaultInstance() : this.featureSupport_;
        }

        private void setFeatureSupport(FeatureSupport value) {
            value.getClass();
            this.featureSupport_ = value;
            this.bitField0_ |= 0x400;
        }

        private void mergeFeatureSupport(FeatureSupport value) {
            value.getClass();
            this.featureSupport_ = this.featureSupport_ != null && this.featureSupport_ != FeatureSupport.getDefaultInstance() ? (FeatureSupport)((FeatureSupport.Builder)FeatureSupport.newBuilder(this.featureSupport_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 0x400;
        }

        private void clearFeatureSupport() {
            this.featureSupport_ = null;
            this.bitField0_ &= 0xFFFFFBFF;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = FieldOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static FieldOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FieldOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FieldOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FieldOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FieldOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FieldOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FieldOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FieldOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FieldOptions parseDelimitedFrom(InputStream input) throws IOException {
            return FieldOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FieldOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FieldOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FieldOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FieldOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FieldOptions prototype) {
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
                    return new FieldOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "ctype_", CType.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", JSType.internalGetVerifier(), "weak_", "unverifiedLazy_", "debugRedact_", "retention_", OptionRetention.internalGetVerifier(), "targets_", OptionTargetType.internalGetVerifier(), "editionDefaults_", EditionDefault.class, "features_", "featureSupport_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u000e\u0000\u0001\u0001\u03e7\u000e\u0000\u0003\u0002\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1007\u0005\u0005\u1007\u0003\u0006\u180c\u0002\n\u1007\u0006\u000f\u1007\u0004\u0010\u1007\u0007\u0011\u180c\b\u0013\u081e\u0014\u001b\u0015\u1409\t\u0016\u1009\n\u03e7\u041b";
                    return FieldOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FieldOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FieldOptions> clazz = FieldOptions.class;
                    synchronized (FieldOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FieldOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FieldOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FieldOptions defaultInstance;
            targets_converter_ = new Internal.IntListAdapter.IntConverter<OptionTargetType>(){

                @Override
                public OptionTargetType convert(int from) {
                    OptionTargetType result = OptionTargetType.forNumber(from);
                    return result == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : result;
                }
            };
            DEFAULT_INSTANCE = defaultInstance = new FieldOptions();
            GeneratedMessageLite.registerDefaultInstance(FieldOptions.class, defaultInstance);
        }

        public static final class FeatureSupport
        extends GeneratedMessageLite<FeatureSupport, Builder>
        implements FeatureSupportOrBuilder {
            private int bitField0_;
            public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
            private int editionIntroduced_;
            public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
            private int editionDeprecated_;
            public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
            private String deprecationWarning_ = "";
            public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
            private int editionRemoved_;
            private static final FeatureSupport DEFAULT_INSTANCE;
            private static volatile Parser<FeatureSupport> PARSER;

            private FeatureSupport() {
            }

            @Override
            public boolean hasEditionIntroduced() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public Edition getEditionIntroduced() {
                Edition result = Edition.forNumber(this.editionIntroduced_);
                return result == null ? Edition.EDITION_UNKNOWN : result;
            }

            private void setEditionIntroduced(Edition value) {
                this.editionIntroduced_ = value.getNumber();
                this.bitField0_ |= 1;
            }

            private void clearEditionIntroduced() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.editionIntroduced_ = 0;
            }

            @Override
            public boolean hasEditionDeprecated() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public Edition getEditionDeprecated() {
                Edition result = Edition.forNumber(this.editionDeprecated_);
                return result == null ? Edition.EDITION_UNKNOWN : result;
            }

            private void setEditionDeprecated(Edition value) {
                this.editionDeprecated_ = value.getNumber();
                this.bitField0_ |= 2;
            }

            private void clearEditionDeprecated() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.editionDeprecated_ = 0;
            }

            @Override
            public boolean hasDeprecationWarning() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override
            public String getDeprecationWarning() {
                return this.deprecationWarning_;
            }

            @Override
            public ByteString getDeprecationWarningBytes() {
                return ByteString.copyFromUtf8(this.deprecationWarning_);
            }

            private void setDeprecationWarning(String value) {
                value.getClass();
                this.bitField0_ |= 4;
                this.deprecationWarning_ = value;
            }

            private void clearDeprecationWarning() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.deprecationWarning_ = FeatureSupport.getDefaultInstance().getDeprecationWarning();
            }

            private void setDeprecationWarningBytes(ByteString value) {
                this.deprecationWarning_ = value.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override
            public boolean hasEditionRemoved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override
            public Edition getEditionRemoved() {
                Edition result = Edition.forNumber(this.editionRemoved_);
                return result == null ? Edition.EDITION_UNKNOWN : result;
            }

            private void setEditionRemoved(Edition value) {
                this.editionRemoved_ = value.getNumber();
                this.bitField0_ |= 8;
            }

            private void clearEditionRemoved() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.editionRemoved_ = 0;
            }

            public static FeatureSupport parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FeatureSupport parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FeatureSupport parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FeatureSupport parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FeatureSupport parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FeatureSupport parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FeatureSupport parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FeatureSupport parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FeatureSupport parseDelimitedFrom(InputStream input) throws IOException {
                return FeatureSupport.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static FeatureSupport parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return FeatureSupport.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FeatureSupport parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FeatureSupport parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(FeatureSupport prototype) {
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
                        return new FeatureSupport();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "editionIntroduced_", Edition.internalGetVerifier(), "editionDeprecated_", Edition.internalGetVerifier(), "deprecationWarning_", "editionRemoved_", Edition.internalGetVerifier()};
                        String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u1008\u0002\u0004\u180c\u0003";
                        return FeatureSupport.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<FeatureSupport> parser = PARSER;
                        if (parser != null) return parser;
                        Class<FeatureSupport> clazz = FeatureSupport.class;
                        synchronized (FeatureSupport.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FeatureSupport>(DEFAULT_INSTANCE);
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

            public static FeatureSupport getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<FeatureSupport> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                FeatureSupport defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new FeatureSupport();
                GeneratedMessageLite.registerDefaultInstance(FeatureSupport.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<FeatureSupport, Builder>
            implements FeatureSupportOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasEditionIntroduced() {
                    return ((FeatureSupport)this.instance).hasEditionIntroduced();
                }

                @Override
                public Edition getEditionIntroduced() {
                    return ((FeatureSupport)this.instance).getEditionIntroduced();
                }

                public Builder setEditionIntroduced(Edition value) {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).setEditionIntroduced(value);
                    return this;
                }

                public Builder clearEditionIntroduced() {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).clearEditionIntroduced();
                    return this;
                }

                @Override
                public boolean hasEditionDeprecated() {
                    return ((FeatureSupport)this.instance).hasEditionDeprecated();
                }

                @Override
                public Edition getEditionDeprecated() {
                    return ((FeatureSupport)this.instance).getEditionDeprecated();
                }

                public Builder setEditionDeprecated(Edition value) {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).setEditionDeprecated(value);
                    return this;
                }

                public Builder clearEditionDeprecated() {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).clearEditionDeprecated();
                    return this;
                }

                @Override
                public boolean hasDeprecationWarning() {
                    return ((FeatureSupport)this.instance).hasDeprecationWarning();
                }

                @Override
                public String getDeprecationWarning() {
                    return ((FeatureSupport)this.instance).getDeprecationWarning();
                }

                @Override
                public ByteString getDeprecationWarningBytes() {
                    return ((FeatureSupport)this.instance).getDeprecationWarningBytes();
                }

                public Builder setDeprecationWarning(String value) {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).setDeprecationWarning(value);
                    return this;
                }

                public Builder clearDeprecationWarning() {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).clearDeprecationWarning();
                    return this;
                }

                public Builder setDeprecationWarningBytes(ByteString value) {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).setDeprecationWarningBytes(value);
                    return this;
                }

                @Override
                public boolean hasEditionRemoved() {
                    return ((FeatureSupport)this.instance).hasEditionRemoved();
                }

                @Override
                public Edition getEditionRemoved() {
                    return ((FeatureSupport)this.instance).getEditionRemoved();
                }

                public Builder setEditionRemoved(Edition value) {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).setEditionRemoved(value);
                    return this;
                }

                public Builder clearEditionRemoved() {
                    this.copyOnWrite();
                    ((FeatureSupport)this.instance).clearEditionRemoved();
                    return this;
                }
            }
        }

        public static final class EditionDefault
        extends GeneratedMessageLite<EditionDefault, Builder>
        implements EditionDefaultOrBuilder {
            private int bitField0_;
            public static final int EDITION_FIELD_NUMBER = 3;
            private int edition_;
            public static final int VALUE_FIELD_NUMBER = 2;
            private String value_ = "";
            private static final EditionDefault DEFAULT_INSTANCE;
            private static volatile Parser<EditionDefault> PARSER;

            private EditionDefault() {
            }

            @Override
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public Edition getEdition() {
                Edition result = Edition.forNumber(this.edition_);
                return result == null ? Edition.EDITION_UNKNOWN : result;
            }

            private void setEdition(Edition value) {
                this.edition_ = value.getNumber();
                this.bitField0_ |= 1;
            }

            private void clearEdition() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.edition_ = 0;
            }

            @Override
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public String getValue() {
                return this.value_;
            }

            @Override
            public ByteString getValueBytes() {
                return ByteString.copyFromUtf8(this.value_);
            }

            private void setValue(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.value_ = value;
            }

            private void clearValue() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.value_ = EditionDefault.getDefaultInstance().getValue();
            }

            private void setValueBytes(ByteString value) {
                this.value_ = value.toStringUtf8();
                this.bitField0_ |= 2;
            }

            public static EditionDefault parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static EditionDefault parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static EditionDefault parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static EditionDefault parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static EditionDefault parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static EditionDefault parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static EditionDefault parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static EditionDefault parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static EditionDefault parseDelimitedFrom(InputStream input) throws IOException {
                return EditionDefault.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static EditionDefault parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return EditionDefault.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static EditionDefault parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static EditionDefault parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(EditionDefault prototype) {
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
                        return new EditionDefault();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "value_", "edition_", Edition.internalGetVerifier()};
                        String info = "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u180c\u0000";
                        return EditionDefault.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<EditionDefault> parser = PARSER;
                        if (parser != null) return parser;
                        Class<EditionDefault> clazz = EditionDefault.class;
                        synchronized (EditionDefault.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<EditionDefault>(DEFAULT_INSTANCE);
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

            public static EditionDefault getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<EditionDefault> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                EditionDefault defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new EditionDefault();
                GeneratedMessageLite.registerDefaultInstance(EditionDefault.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<EditionDefault, Builder>
            implements EditionDefaultOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasEdition() {
                    return ((EditionDefault)this.instance).hasEdition();
                }

                @Override
                public Edition getEdition() {
                    return ((EditionDefault)this.instance).getEdition();
                }

                public Builder setEdition(Edition value) {
                    this.copyOnWrite();
                    ((EditionDefault)this.instance).setEdition(value);
                    return this;
                }

                public Builder clearEdition() {
                    this.copyOnWrite();
                    ((EditionDefault)this.instance).clearEdition();
                    return this;
                }

                @Override
                public boolean hasValue() {
                    return ((EditionDefault)this.instance).hasValue();
                }

                @Override
                public String getValue() {
                    return ((EditionDefault)this.instance).getValue();
                }

                @Override
                public ByteString getValueBytes() {
                    return ((EditionDefault)this.instance).getValueBytes();
                }

                public Builder setValue(String value) {
                    this.copyOnWrite();
                    ((EditionDefault)this.instance).setValue(value);
                    return this;
                }

                public Builder clearValue() {
                    this.copyOnWrite();
                    ((EditionDefault)this.instance).clearValue();
                    return this;
                }

                public Builder setValueBytes(ByteString value) {
                    this.copyOnWrite();
                    ((EditionDefault)this.instance).setValueBytes(value);
                    return this;
                }
            }
        }

        public static enum OptionTargetType implements Internal.EnumLite
        {
            TARGET_TYPE_UNKNOWN(0),
            TARGET_TYPE_FILE(1),
            TARGET_TYPE_EXTENSION_RANGE(2),
            TARGET_TYPE_MESSAGE(3),
            TARGET_TYPE_FIELD(4),
            TARGET_TYPE_ONEOF(5),
            TARGET_TYPE_ENUM(6),
            TARGET_TYPE_ENUM_ENTRY(7),
            TARGET_TYPE_SERVICE(8),
            TARGET_TYPE_METHOD(9);

            public static final int TARGET_TYPE_UNKNOWN_VALUE = 0;
            public static final int TARGET_TYPE_FILE_VALUE = 1;
            public static final int TARGET_TYPE_EXTENSION_RANGE_VALUE = 2;
            public static final int TARGET_TYPE_MESSAGE_VALUE = 3;
            public static final int TARGET_TYPE_FIELD_VALUE = 4;
            public static final int TARGET_TYPE_ONEOF_VALUE = 5;
            public static final int TARGET_TYPE_ENUM_VALUE = 6;
            public static final int TARGET_TYPE_ENUM_ENTRY_VALUE = 7;
            public static final int TARGET_TYPE_SERVICE_VALUE = 8;
            public static final int TARGET_TYPE_METHOD_VALUE = 9;
            private static final Internal.EnumLiteMap<OptionTargetType> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptionTargetType valueOf(int value) {
                return OptionTargetType.forNumber(value);
            }

            public static OptionTargetType forNumber(int value) {
                switch (value) {
                    case 0: {
                        return TARGET_TYPE_UNKNOWN;
                    }
                    case 1: {
                        return TARGET_TYPE_FILE;
                    }
                    case 2: {
                        return TARGET_TYPE_EXTENSION_RANGE;
                    }
                    case 3: {
                        return TARGET_TYPE_MESSAGE;
                    }
                    case 4: {
                        return TARGET_TYPE_FIELD;
                    }
                    case 5: {
                        return TARGET_TYPE_ONEOF;
                    }
                    case 6: {
                        return TARGET_TYPE_ENUM;
                    }
                    case 7: {
                        return TARGET_TYPE_ENUM_ENTRY;
                    }
                    case 8: {
                        return TARGET_TYPE_SERVICE;
                    }
                    case 9: {
                        return TARGET_TYPE_METHOD;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<OptionTargetType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptionTargetTypeVerifier.INSTANCE;
            }

            private OptionTargetType(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<OptionTargetType>(){

                    @Override
                    public OptionTargetType findValueByNumber(int number) {
                        return OptionTargetType.forNumber(number);
                    }
                };
            }

            private static final class OptionTargetTypeVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptionTargetTypeVerifier();

                private OptionTargetTypeVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return OptionTargetType.forNumber(number) != null;
                }
            }
        }

        public static enum OptionRetention implements Internal.EnumLite
        {
            RETENTION_UNKNOWN(0),
            RETENTION_RUNTIME(1),
            RETENTION_SOURCE(2);

            public static final int RETENTION_UNKNOWN_VALUE = 0;
            public static final int RETENTION_RUNTIME_VALUE = 1;
            public static final int RETENTION_SOURCE_VALUE = 2;
            private static final Internal.EnumLiteMap<OptionRetention> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptionRetention valueOf(int value) {
                return OptionRetention.forNumber(value);
            }

            public static OptionRetention forNumber(int value) {
                switch (value) {
                    case 0: {
                        return RETENTION_UNKNOWN;
                    }
                    case 1: {
                        return RETENTION_RUNTIME;
                    }
                    case 2: {
                        return RETENTION_SOURCE;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<OptionRetention> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptionRetentionVerifier.INSTANCE;
            }

            private OptionRetention(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<OptionRetention>(){

                    @Override
                    public OptionRetention findValueByNumber(int number) {
                        return OptionRetention.forNumber(number);
                    }
                };
            }

            private static final class OptionRetentionVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptionRetentionVerifier();

                private OptionRetentionVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return OptionRetention.forNumber(number) != null;
                }
            }
        }

        public static enum JSType implements Internal.EnumLite
        {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public static final int JS_NORMAL_VALUE = 0;
            public static final int JS_STRING_VALUE = 1;
            public static final int JS_NUMBER_VALUE = 2;
            private static final Internal.EnumLiteMap<JSType> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static JSType valueOf(int value) {
                return JSType.forNumber(value);
            }

            public static JSType forNumber(int value) {
                switch (value) {
                    case 0: {
                        return JS_NORMAL;
                    }
                    case 1: {
                        return JS_STRING;
                    }
                    case 2: {
                        return JS_NUMBER;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<JSType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return JSTypeVerifier.INSTANCE;
            }

            private JSType(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<JSType>(){

                    @Override
                    public JSType findValueByNumber(int number) {
                        return JSType.forNumber(number);
                    }
                };
            }

            private static final class JSTypeVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new JSTypeVerifier();

                private JSTypeVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return JSType.forNumber(number) != null;
                }
            }
        }

        public static enum CType implements Internal.EnumLite
        {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public static final int STRING_VALUE = 0;
            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            private static final Internal.EnumLiteMap<CType> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CType valueOf(int value) {
                return CType.forNumber(value);
            }

            public static CType forNumber(int value) {
                switch (value) {
                    case 0: {
                        return STRING;
                    }
                    case 1: {
                        return CORD;
                    }
                    case 2: {
                        return STRING_PIECE;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<CType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return CTypeVerifier.INSTANCE;
            }

            private CType(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<CType>(){

                    @Override
                    public CType findValueByNumber(int number) {
                        return CType.forNumber(number);
                    }
                };
            }

            private static final class CTypeVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new CTypeVerifier();

                private CTypeVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return CType.forNumber(number) != null;
                }
            }
        }

        public static interface EditionDefaultOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasEdition();

            public Edition getEdition();

            public boolean hasValue();

            public String getValue();

            public ByteString getValueBytes();
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<FieldOptions, Builder>
        implements FieldOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasCtype() {
                return ((FieldOptions)this.instance).hasCtype();
            }

            @Override
            public CType getCtype() {
                return ((FieldOptions)this.instance).getCtype();
            }

            public Builder setCtype(CType value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setCtype(value);
                return this;
            }

            public Builder clearCtype() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearCtype();
                return this;
            }

            @Override
            public boolean hasPacked() {
                return ((FieldOptions)this.instance).hasPacked();
            }

            @Override
            public boolean getPacked() {
                return ((FieldOptions)this.instance).getPacked();
            }

            public Builder setPacked(boolean value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setPacked(value);
                return this;
            }

            public Builder clearPacked() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearPacked();
                return this;
            }

            @Override
            public boolean hasJstype() {
                return ((FieldOptions)this.instance).hasJstype();
            }

            @Override
            public JSType getJstype() {
                return ((FieldOptions)this.instance).getJstype();
            }

            public Builder setJstype(JSType value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setJstype(value);
                return this;
            }

            public Builder clearJstype() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearJstype();
                return this;
            }

            @Override
            public boolean hasLazy() {
                return ((FieldOptions)this.instance).hasLazy();
            }

            @Override
            public boolean getLazy() {
                return ((FieldOptions)this.instance).getLazy();
            }

            public Builder setLazy(boolean value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setLazy(value);
                return this;
            }

            public Builder clearLazy() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearLazy();
                return this;
            }

            @Override
            public boolean hasUnverifiedLazy() {
                return ((FieldOptions)this.instance).hasUnverifiedLazy();
            }

            @Override
            public boolean getUnverifiedLazy() {
                return ((FieldOptions)this.instance).getUnverifiedLazy();
            }

            public Builder setUnverifiedLazy(boolean value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setUnverifiedLazy(value);
                return this;
            }

            public Builder clearUnverifiedLazy() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearUnverifiedLazy();
                return this;
            }

            @Override
            public boolean hasDeprecated() {
                return ((FieldOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((FieldOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            public boolean hasWeak() {
                return ((FieldOptions)this.instance).hasWeak();
            }

            @Override
            public boolean getWeak() {
                return ((FieldOptions)this.instance).getWeak();
            }

            public Builder setWeak(boolean value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setWeak(value);
                return this;
            }

            public Builder clearWeak() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearWeak();
                return this;
            }

            @Override
            public boolean hasDebugRedact() {
                return ((FieldOptions)this.instance).hasDebugRedact();
            }

            @Override
            public boolean getDebugRedact() {
                return ((FieldOptions)this.instance).getDebugRedact();
            }

            public Builder setDebugRedact(boolean value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setDebugRedact(value);
                return this;
            }

            public Builder clearDebugRedact() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearDebugRedact();
                return this;
            }

            @Override
            public boolean hasRetention() {
                return ((FieldOptions)this.instance).hasRetention();
            }

            @Override
            public OptionRetention getRetention() {
                return ((FieldOptions)this.instance).getRetention();
            }

            public Builder setRetention(OptionRetention value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setRetention(value);
                return this;
            }

            public Builder clearRetention() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearRetention();
                return this;
            }

            @Override
            public List<OptionTargetType> getTargetsList() {
                return ((FieldOptions)this.instance).getTargetsList();
            }

            @Override
            public int getTargetsCount() {
                return ((FieldOptions)this.instance).getTargetsCount();
            }

            @Override
            public OptionTargetType getTargets(int index) {
                return ((FieldOptions)this.instance).getTargets(index);
            }

            public Builder setTargets(int index, OptionTargetType value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setTargets(index, value);
                return this;
            }

            public Builder addTargets(OptionTargetType value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addTargets(value);
                return this;
            }

            public Builder addAllTargets(Iterable<? extends OptionTargetType> values) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addAllTargets(values);
                return this;
            }

            public Builder clearTargets() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearTargets();
                return this;
            }

            @Override
            public List<EditionDefault> getEditionDefaultsList() {
                return Collections.unmodifiableList(((FieldOptions)this.instance).getEditionDefaultsList());
            }

            @Override
            public int getEditionDefaultsCount() {
                return ((FieldOptions)this.instance).getEditionDefaultsCount();
            }

            @Override
            public EditionDefault getEditionDefaults(int index) {
                return ((FieldOptions)this.instance).getEditionDefaults(index);
            }

            public Builder setEditionDefaults(int index, EditionDefault value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setEditionDefaults(index, value);
                return this;
            }

            public Builder setEditionDefaults(int index, EditionDefault.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setEditionDefaults(index, (EditionDefault)builderForValue.build());
                return this;
            }

            public Builder addEditionDefaults(EditionDefault value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addEditionDefaults(value);
                return this;
            }

            public Builder addEditionDefaults(int index, EditionDefault value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addEditionDefaults(index, value);
                return this;
            }

            public Builder addEditionDefaults(EditionDefault.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addEditionDefaults((EditionDefault)builderForValue.build());
                return this;
            }

            public Builder addEditionDefaults(int index, EditionDefault.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addEditionDefaults(index, (EditionDefault)builderForValue.build());
                return this;
            }

            public Builder addAllEditionDefaults(Iterable<? extends EditionDefault> values) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addAllEditionDefaults(values);
                return this;
            }

            public Builder clearEditionDefaults() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearEditionDefaults();
                return this;
            }

            public Builder removeEditionDefaults(int index) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).removeEditionDefaults(index);
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((FieldOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((FieldOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public boolean hasFeatureSupport() {
                return ((FieldOptions)this.instance).hasFeatureSupport();
            }

            @Override
            public FeatureSupport getFeatureSupport() {
                return ((FieldOptions)this.instance).getFeatureSupport();
            }

            public Builder setFeatureSupport(FeatureSupport value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setFeatureSupport(value);
                return this;
            }

            public Builder setFeatureSupport(FeatureSupport.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setFeatureSupport((FeatureSupport)builderForValue.build());
                return this;
            }

            public Builder mergeFeatureSupport(FeatureSupport value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).mergeFeatureSupport(value);
                return this;
            }

            public Builder clearFeatureSupport() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearFeatureSupport();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FieldOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((FieldOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((FieldOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }

        public static interface FeatureSupportOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasEditionIntroduced();

            public Edition getEditionIntroduced();

            public boolean hasEditionDeprecated();

            public Edition getEditionDeprecated();

            public boolean hasDeprecationWarning();

            public String getDeprecationWarning();

            public ByteString getDeprecationWarningBytes();

            public boolean hasEditionRemoved();

            public Edition getEditionRemoved();
        }
    }

    public static interface FieldOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<FieldOptions, FieldOptions.Builder> {
        public boolean hasCtype();

        public FieldOptions.CType getCtype();

        public boolean hasPacked();

        public boolean getPacked();

        public boolean hasJstype();

        public FieldOptions.JSType getJstype();

        public boolean hasLazy();

        public boolean getLazy();

        public boolean hasUnverifiedLazy();

        public boolean getUnverifiedLazy();

        public boolean hasDeprecated();

        public boolean getDeprecated();

        public boolean hasWeak();

        public boolean getWeak();

        public boolean hasDebugRedact();

        public boolean getDebugRedact();

        public boolean hasRetention();

        public FieldOptions.OptionRetention getRetention();

        public List<FieldOptions.OptionTargetType> getTargetsList();

        public int getTargetsCount();

        public FieldOptions.OptionTargetType getTargets(int var1);

        public List<FieldOptions.EditionDefault> getEditionDefaultsList();

        public FieldOptions.EditionDefault getEditionDefaults(int var1);

        public int getEditionDefaultsCount();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public boolean hasFeatureSupport();

        public FieldOptions.FeatureSupport getFeatureSupport();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class MessageOptions
    extends GeneratedMessageLite.ExtendableMessage<MessageOptions, Builder>
    implements MessageOptionsOrBuilder {
        private int bitField0_;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        private boolean messageSetWireFormat_;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private boolean noStandardDescriptorAccessor_;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private boolean deprecated_;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        private boolean mapEntry_;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        public static final int FEATURES_FIELD_NUMBER = 12;
        private FeatureSet features_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final MessageOptions DEFAULT_INSTANCE;
        private static volatile Parser<MessageOptions> PARSER;

        private MessageOptions() {
            this.uninterpretedOption_ = MessageOptions.emptyProtobufList();
        }

        @Override
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        private void setMessageSetWireFormat(boolean value) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = value;
        }

        private void clearMessageSetWireFormat() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.messageSetWireFormat_ = false;
        }

        @Override
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        private void setNoStandardDescriptorAccessor(boolean value) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = value;
        }

        private void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.noStandardDescriptorAccessor_ = false;
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 4;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.deprecated_ = false;
        }

        @Override
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        private void setMapEntry(boolean value) {
            this.bitField0_ |= 8;
            this.mapEntry_ = value;
        }

        private void clearMapEntry() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.mapEntry_ = false;
        }

        @Override
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        private void setDeprecatedLegacyJsonFieldConflicts(boolean value) {
            this.bitField0_ |= 0x10;
            this.deprecatedLegacyJsonFieldConflicts_ = value;
        }

        private void clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 0x20;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 0x20;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFDF;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = MessageOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static MessageOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MessageOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MessageOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MessageOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MessageOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MessageOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MessageOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MessageOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MessageOptions parseDelimitedFrom(InputStream input) throws IOException {
            return MessageOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MessageOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return MessageOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MessageOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MessageOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MessageOptions prototype) {
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
                    return new MessageOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0007\u0000\u0001\u0001\u03e7\u0007\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0007\u1007\u0003\u000b\u1007\u0004\f\u1409\u0005\u03e7\u041b";
                    return MessageOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<MessageOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<MessageOptions> clazz = MessageOptions.class;
                    synchronized (MessageOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<MessageOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MessageOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            MessageOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new MessageOptions();
            GeneratedMessageLite.registerDefaultInstance(MessageOptions.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<MessageOptions, Builder>
        implements MessageOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasMessageSetWireFormat() {
                return ((MessageOptions)this.instance).hasMessageSetWireFormat();
            }

            @Override
            public boolean getMessageSetWireFormat() {
                return ((MessageOptions)this.instance).getMessageSetWireFormat();
            }

            public Builder setMessageSetWireFormat(boolean value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setMessageSetWireFormat(value);
                return this;
            }

            public Builder clearMessageSetWireFormat() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearMessageSetWireFormat();
                return this;
            }

            @Override
            public boolean hasNoStandardDescriptorAccessor() {
                return ((MessageOptions)this.instance).hasNoStandardDescriptorAccessor();
            }

            @Override
            public boolean getNoStandardDescriptorAccessor() {
                return ((MessageOptions)this.instance).getNoStandardDescriptorAccessor();
            }

            public Builder setNoStandardDescriptorAccessor(boolean value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setNoStandardDescriptorAccessor(value);
                return this;
            }

            public Builder clearNoStandardDescriptorAccessor() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearNoStandardDescriptorAccessor();
                return this;
            }

            @Override
            public boolean hasDeprecated() {
                return ((MessageOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((MessageOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            public boolean hasMapEntry() {
                return ((MessageOptions)this.instance).hasMapEntry();
            }

            @Override
            public boolean getMapEntry() {
                return ((MessageOptions)this.instance).getMapEntry();
            }

            public Builder setMapEntry(boolean value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setMapEntry(value);
                return this;
            }

            public Builder clearMapEntry() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearMapEntry();
                return this;
            }

            @Override
            @Deprecated
            public boolean hasDeprecatedLegacyJsonFieldConflicts() {
                return ((MessageOptions)this.instance).hasDeprecatedLegacyJsonFieldConflicts();
            }

            @Override
            @Deprecated
            public boolean getDeprecatedLegacyJsonFieldConflicts() {
                return ((MessageOptions)this.instance).getDeprecatedLegacyJsonFieldConflicts();
            }

            @Deprecated
            public Builder setDeprecatedLegacyJsonFieldConflicts(boolean value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setDeprecatedLegacyJsonFieldConflicts(value);
                return this;
            }

            @Deprecated
            public Builder clearDeprecatedLegacyJsonFieldConflicts() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearDeprecatedLegacyJsonFieldConflicts();
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((MessageOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((MessageOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MessageOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((MessageOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((MessageOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface MessageOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<MessageOptions, MessageOptions.Builder> {
        public boolean hasMessageSetWireFormat();

        public boolean getMessageSetWireFormat();

        public boolean hasNoStandardDescriptorAccessor();

        public boolean getNoStandardDescriptorAccessor();

        public boolean hasDeprecated();

        public boolean getDeprecated();

        public boolean hasMapEntry();

        public boolean getMapEntry();

        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts();

        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class FileOptions
    extends GeneratedMessageLite.ExtendableMessage<FileOptions, Builder>
    implements FileOptionsOrBuilder {
        private int bitField0_;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        private String javaPackage_ = "";
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        private String javaOuterClassname_ = "";
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        private boolean javaMultipleFiles_;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        private boolean javaGenerateEqualsAndHash_;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        private boolean javaStringCheckUtf8_;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private int optimizeFor_ = 1;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        private String goPackage_ = "";
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        private boolean ccGenericServices_;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        private boolean javaGenericServices_;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        private boolean pyGenericServices_;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        private boolean deprecated_;
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        private boolean ccEnableArenas_ = true;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        private String objcClassPrefix_ = "";
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private String csharpNamespace_ = "";
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        private String swiftPrefix_ = "";
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        private String phpClassPrefix_ = "";
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        private String phpNamespace_ = "";
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        private String phpMetadataNamespace_ = "";
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        private String rubyPackage_ = "";
        public static final int FEATURES_FIELD_NUMBER = 50;
        private FeatureSet features_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FileOptions DEFAULT_INSTANCE;
        private static volatile Parser<FileOptions> PARSER;

        private FileOptions() {
            this.uninterpretedOption_ = FileOptions.emptyProtobufList();
        }

        @Override
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public String getJavaPackage() {
            return this.javaPackage_;
        }

        @Override
        public ByteString getJavaPackageBytes() {
            return ByteString.copyFromUtf8(this.javaPackage_);
        }

        private void setJavaPackage(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = value;
        }

        private void clearJavaPackage() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.javaPackage_ = FileOptions.getDefaultInstance().getJavaPackage();
        }

        private void setJavaPackageBytes(ByteString value) {
            this.javaPackage_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        @Override
        public ByteString getJavaOuterClassnameBytes() {
            return ByteString.copyFromUtf8(this.javaOuterClassname_);
        }

        private void setJavaOuterClassname(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = value;
        }

        private void clearJavaOuterClassname() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.javaOuterClassname_ = FileOptions.getDefaultInstance().getJavaOuterClassname();
        }

        private void setJavaOuterClassnameBytes(ByteString value) {
            this.javaOuterClassname_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        private void setJavaMultipleFiles(boolean value) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = value;
        }

        private void clearJavaMultipleFiles() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.javaMultipleFiles_ = false;
        }

        @Override
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        private void setJavaGenerateEqualsAndHash(boolean value) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = value;
        }

        private void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.javaGenerateEqualsAndHash_ = false;
        }

        @Override
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        private void setJavaStringCheckUtf8(boolean value) {
            this.bitField0_ |= 0x10;
            this.javaStringCheckUtf8_ = value;
        }

        private void clearJavaStringCheckUtf8() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.javaStringCheckUtf8_ = false;
        }

        @Override
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public OptimizeMode getOptimizeFor() {
            OptimizeMode result = OptimizeMode.forNumber(this.optimizeFor_);
            return result == null ? OptimizeMode.SPEED : result;
        }

        private void setOptimizeFor(OptimizeMode value) {
            this.optimizeFor_ = value.getNumber();
            this.bitField0_ |= 0x20;
        }

        private void clearOptimizeFor() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.optimizeFor_ = 1;
        }

        @Override
        public boolean hasGoPackage() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override
        public String getGoPackage() {
            return this.goPackage_;
        }

        @Override
        public ByteString getGoPackageBytes() {
            return ByteString.copyFromUtf8(this.goPackage_);
        }

        private void setGoPackage(String value) {
            value.getClass();
            this.bitField0_ |= 0x40;
            this.goPackage_ = value;
        }

        private void clearGoPackage() {
            this.bitField0_ &= 0xFFFFFFBF;
            this.goPackage_ = FileOptions.getDefaultInstance().getGoPackage();
        }

        private void setGoPackageBytes(ByteString value) {
            this.goPackage_ = value.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        @Override
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        private void setCcGenericServices(boolean value) {
            this.bitField0_ |= 0x80;
            this.ccGenericServices_ = value;
        }

        private void clearCcGenericServices() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.ccGenericServices_ = false;
        }

        @Override
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        private void setJavaGenericServices(boolean value) {
            this.bitField0_ |= 0x100;
            this.javaGenericServices_ = value;
        }

        private void clearJavaGenericServices() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.javaGenericServices_ = false;
        }

        @Override
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        private void setPyGenericServices(boolean value) {
            this.bitField0_ |= 0x200;
            this.pyGenericServices_ = value;
        }

        private void clearPyGenericServices() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.pyGenericServices_ = false;
        }

        @Override
        public boolean hasDeprecated() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        private void setDeprecated(boolean value) {
            this.bitField0_ |= 0x400;
            this.deprecated_ = value;
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.deprecated_ = false;
        }

        @Override
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        private void setCcEnableArenas(boolean value) {
            this.bitField0_ |= 0x800;
            this.ccEnableArenas_ = value;
        }

        private void clearCcEnableArenas() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.ccEnableArenas_ = true;
        }

        @Override
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 0x1000) != 0;
        }

        @Override
        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        @Override
        public ByteString getObjcClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.objcClassPrefix_);
        }

        private void setObjcClassPrefix(String value) {
            value.getClass();
            this.bitField0_ |= 0x1000;
            this.objcClassPrefix_ = value;
        }

        private void clearObjcClassPrefix() {
            this.bitField0_ &= 0xFFFFEFFF;
            this.objcClassPrefix_ = FileOptions.getDefaultInstance().getObjcClassPrefix();
        }

        private void setObjcClassPrefixBytes(ByteString value) {
            this.objcClassPrefix_ = value.toStringUtf8();
            this.bitField0_ |= 0x1000;
        }

        @Override
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 0x2000) != 0;
        }

        @Override
        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        @Override
        public ByteString getCsharpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.csharpNamespace_);
        }

        private void setCsharpNamespace(String value) {
            value.getClass();
            this.bitField0_ |= 0x2000;
            this.csharpNamespace_ = value;
        }

        private void clearCsharpNamespace() {
            this.bitField0_ &= 0xFFFFDFFF;
            this.csharpNamespace_ = FileOptions.getDefaultInstance().getCsharpNamespace();
        }

        private void setCsharpNamespaceBytes(ByteString value) {
            this.csharpNamespace_ = value.toStringUtf8();
            this.bitField0_ |= 0x2000;
        }

        @Override
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 0x4000) != 0;
        }

        @Override
        public String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        @Override
        public ByteString getSwiftPrefixBytes() {
            return ByteString.copyFromUtf8(this.swiftPrefix_);
        }

        private void setSwiftPrefix(String value) {
            value.getClass();
            this.bitField0_ |= 0x4000;
            this.swiftPrefix_ = value;
        }

        private void clearSwiftPrefix() {
            this.bitField0_ &= 0xFFFFBFFF;
            this.swiftPrefix_ = FileOptions.getDefaultInstance().getSwiftPrefix();
        }

        private void setSwiftPrefixBytes(ByteString value) {
            this.swiftPrefix_ = value.toStringUtf8();
            this.bitField0_ |= 0x4000;
        }

        @Override
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 0x8000) != 0;
        }

        @Override
        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        @Override
        public ByteString getPhpClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.phpClassPrefix_);
        }

        private void setPhpClassPrefix(String value) {
            value.getClass();
            this.bitField0_ |= 0x8000;
            this.phpClassPrefix_ = value;
        }

        private void clearPhpClassPrefix() {
            this.bitField0_ &= 0xFFFF7FFF;
            this.phpClassPrefix_ = FileOptions.getDefaultInstance().getPhpClassPrefix();
        }

        private void setPhpClassPrefixBytes(ByteString value) {
            this.phpClassPrefix_ = value.toStringUtf8();
            this.bitField0_ |= 0x8000;
        }

        @Override
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 0x10000) != 0;
        }

        @Override
        public String getPhpNamespace() {
            return this.phpNamespace_;
        }

        @Override
        public ByteString getPhpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpNamespace_);
        }

        private void setPhpNamespace(String value) {
            value.getClass();
            this.bitField0_ |= 0x10000;
            this.phpNamespace_ = value;
        }

        private void clearPhpNamespace() {
            this.bitField0_ &= 0xFFFEFFFF;
            this.phpNamespace_ = FileOptions.getDefaultInstance().getPhpNamespace();
        }

        private void setPhpNamespaceBytes(ByteString value) {
            this.phpNamespace_ = value.toStringUtf8();
            this.bitField0_ |= 0x10000;
        }

        @Override
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 0x20000) != 0;
        }

        @Override
        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        @Override
        public ByteString getPhpMetadataNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpMetadataNamespace_);
        }

        private void setPhpMetadataNamespace(String value) {
            value.getClass();
            this.bitField0_ |= 0x20000;
            this.phpMetadataNamespace_ = value;
        }

        private void clearPhpMetadataNamespace() {
            this.bitField0_ &= 0xFFFDFFFF;
            this.phpMetadataNamespace_ = FileOptions.getDefaultInstance().getPhpMetadataNamespace();
        }

        private void setPhpMetadataNamespaceBytes(ByteString value) {
            this.phpMetadataNamespace_ = value.toStringUtf8();
            this.bitField0_ |= 0x20000;
        }

        @Override
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 0x40000) != 0;
        }

        @Override
        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        @Override
        public ByteString getRubyPackageBytes() {
            return ByteString.copyFromUtf8(this.rubyPackage_);
        }

        private void setRubyPackage(String value) {
            value.getClass();
            this.bitField0_ |= 0x40000;
            this.rubyPackage_ = value;
        }

        private void clearRubyPackage() {
            this.bitField0_ &= 0xFFFBFFFF;
            this.rubyPackage_ = FileOptions.getDefaultInstance().getRubyPackage();
        }

        private void setRubyPackageBytes(ByteString value) {
            this.rubyPackage_ = value.toStringUtf8();
            this.bitField0_ |= 0x40000;
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 0x80000) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 0x80000;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 0x80000;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFF7FFFF;
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = FileOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        public static FileOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileOptions parseDelimitedFrom(InputStream input) throws IOException {
            return FileOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FileOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FileOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FileOptions prototype) {
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
                    return new FileOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0015\u0000\u0001\u0001\u03e7\u0015\u0000\u0001\u0002\u0001\u1008\u0000\b\u1008\u0001\t\u180c\u0005\n\u1007\u0002\u000b\u1008\u0006\u0010\u1007\u0007\u0011\u1007\b\u0012\u1007\t\u0014\u1007\u0003\u0017\u1007\n\u001b\u1007\u0004\u001f\u1007\u000b$\u1008\f%\u1008\r'\u1008\u000e(\u1008\u000f)\u1008\u0010,\u1008\u0011-\u1008\u00122\u1409\u0013\u03e7\u041b";
                    return FileOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FileOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FileOptions> clazz = FileOptions.class;
                    synchronized (FileOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FileOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FileOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FileOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new FileOptions();
            GeneratedMessageLite.registerDefaultInstance(FileOptions.class, defaultInstance);
        }

        public static enum OptimizeMode implements Internal.EnumLite
        {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public static final int SPEED_VALUE = 1;
            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            private static final Internal.EnumLiteMap<OptimizeMode> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptimizeMode valueOf(int value) {
                return OptimizeMode.forNumber(value);
            }

            public static OptimizeMode forNumber(int value) {
                switch (value) {
                    case 1: {
                        return SPEED;
                    }
                    case 2: {
                        return CODE_SIZE;
                    }
                    case 3: {
                        return LITE_RUNTIME;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<OptimizeMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptimizeModeVerifier.INSTANCE;
            }

            private OptimizeMode(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<OptimizeMode>(){

                    @Override
                    public OptimizeMode findValueByNumber(int number) {
                        return OptimizeMode.forNumber(number);
                    }
                };
            }

            private static final class OptimizeModeVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptimizeModeVerifier();

                private OptimizeModeVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return OptimizeMode.forNumber(number) != null;
                }
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<FileOptions, Builder>
        implements FileOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasJavaPackage() {
                return ((FileOptions)this.instance).hasJavaPackage();
            }

            @Override
            public String getJavaPackage() {
                return ((FileOptions)this.instance).getJavaPackage();
            }

            @Override
            public ByteString getJavaPackageBytes() {
                return ((FileOptions)this.instance).getJavaPackageBytes();
            }

            public Builder setJavaPackage(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaPackage(value);
                return this;
            }

            public Builder clearJavaPackage() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaPackage();
                return this;
            }

            public Builder setJavaPackageBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaPackageBytes(value);
                return this;
            }

            @Override
            public boolean hasJavaOuterClassname() {
                return ((FileOptions)this.instance).hasJavaOuterClassname();
            }

            @Override
            public String getJavaOuterClassname() {
                return ((FileOptions)this.instance).getJavaOuterClassname();
            }

            @Override
            public ByteString getJavaOuterClassnameBytes() {
                return ((FileOptions)this.instance).getJavaOuterClassnameBytes();
            }

            public Builder setJavaOuterClassname(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaOuterClassname(value);
                return this;
            }

            public Builder clearJavaOuterClassname() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaOuterClassname();
                return this;
            }

            public Builder setJavaOuterClassnameBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaOuterClassnameBytes(value);
                return this;
            }

            @Override
            public boolean hasJavaMultipleFiles() {
                return ((FileOptions)this.instance).hasJavaMultipleFiles();
            }

            @Override
            public boolean getJavaMultipleFiles() {
                return ((FileOptions)this.instance).getJavaMultipleFiles();
            }

            public Builder setJavaMultipleFiles(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaMultipleFiles(value);
                return this;
            }

            public Builder clearJavaMultipleFiles() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaMultipleFiles();
                return this;
            }

            @Override
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((FileOptions)this.instance).hasJavaGenerateEqualsAndHash();
            }

            @Override
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((FileOptions)this.instance).getJavaGenerateEqualsAndHash();
            }

            @Deprecated
            public Builder setJavaGenerateEqualsAndHash(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaGenerateEqualsAndHash(value);
                return this;
            }

            @Deprecated
            public Builder clearJavaGenerateEqualsAndHash() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaGenerateEqualsAndHash();
                return this;
            }

            @Override
            public boolean hasJavaStringCheckUtf8() {
                return ((FileOptions)this.instance).hasJavaStringCheckUtf8();
            }

            @Override
            public boolean getJavaStringCheckUtf8() {
                return ((FileOptions)this.instance).getJavaStringCheckUtf8();
            }

            public Builder setJavaStringCheckUtf8(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaStringCheckUtf8(value);
                return this;
            }

            public Builder clearJavaStringCheckUtf8() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaStringCheckUtf8();
                return this;
            }

            @Override
            public boolean hasOptimizeFor() {
                return ((FileOptions)this.instance).hasOptimizeFor();
            }

            @Override
            public OptimizeMode getOptimizeFor() {
                return ((FileOptions)this.instance).getOptimizeFor();
            }

            public Builder setOptimizeFor(OptimizeMode value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setOptimizeFor(value);
                return this;
            }

            public Builder clearOptimizeFor() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearOptimizeFor();
                return this;
            }

            @Override
            public boolean hasGoPackage() {
                return ((FileOptions)this.instance).hasGoPackage();
            }

            @Override
            public String getGoPackage() {
                return ((FileOptions)this.instance).getGoPackage();
            }

            @Override
            public ByteString getGoPackageBytes() {
                return ((FileOptions)this.instance).getGoPackageBytes();
            }

            public Builder setGoPackage(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setGoPackage(value);
                return this;
            }

            public Builder clearGoPackage() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearGoPackage();
                return this;
            }

            public Builder setGoPackageBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setGoPackageBytes(value);
                return this;
            }

            @Override
            public boolean hasCcGenericServices() {
                return ((FileOptions)this.instance).hasCcGenericServices();
            }

            @Override
            public boolean getCcGenericServices() {
                return ((FileOptions)this.instance).getCcGenericServices();
            }

            public Builder setCcGenericServices(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCcGenericServices(value);
                return this;
            }

            public Builder clearCcGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearCcGenericServices();
                return this;
            }

            @Override
            public boolean hasJavaGenericServices() {
                return ((FileOptions)this.instance).hasJavaGenericServices();
            }

            @Override
            public boolean getJavaGenericServices() {
                return ((FileOptions)this.instance).getJavaGenericServices();
            }

            public Builder setJavaGenericServices(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaGenericServices(value);
                return this;
            }

            public Builder clearJavaGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaGenericServices();
                return this;
            }

            @Override
            public boolean hasPyGenericServices() {
                return ((FileOptions)this.instance).hasPyGenericServices();
            }

            @Override
            public boolean getPyGenericServices() {
                return ((FileOptions)this.instance).getPyGenericServices();
            }

            public Builder setPyGenericServices(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPyGenericServices(value);
                return this;
            }

            public Builder clearPyGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPyGenericServices();
                return this;
            }

            @Override
            public boolean hasDeprecated() {
                return ((FileOptions)this.instance).hasDeprecated();
            }

            @Override
            public boolean getDeprecated() {
                return ((FileOptions)this.instance).getDeprecated();
            }

            public Builder setDeprecated(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setDeprecated(value);
                return this;
            }

            public Builder clearDeprecated() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearDeprecated();
                return this;
            }

            @Override
            public boolean hasCcEnableArenas() {
                return ((FileOptions)this.instance).hasCcEnableArenas();
            }

            @Override
            public boolean getCcEnableArenas() {
                return ((FileOptions)this.instance).getCcEnableArenas();
            }

            public Builder setCcEnableArenas(boolean value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCcEnableArenas(value);
                return this;
            }

            public Builder clearCcEnableArenas() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearCcEnableArenas();
                return this;
            }

            @Override
            public boolean hasObjcClassPrefix() {
                return ((FileOptions)this.instance).hasObjcClassPrefix();
            }

            @Override
            public String getObjcClassPrefix() {
                return ((FileOptions)this.instance).getObjcClassPrefix();
            }

            @Override
            public ByteString getObjcClassPrefixBytes() {
                return ((FileOptions)this.instance).getObjcClassPrefixBytes();
            }

            public Builder setObjcClassPrefix(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setObjcClassPrefix(value);
                return this;
            }

            public Builder clearObjcClassPrefix() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearObjcClassPrefix();
                return this;
            }

            public Builder setObjcClassPrefixBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setObjcClassPrefixBytes(value);
                return this;
            }

            @Override
            public boolean hasCsharpNamespace() {
                return ((FileOptions)this.instance).hasCsharpNamespace();
            }

            @Override
            public String getCsharpNamespace() {
                return ((FileOptions)this.instance).getCsharpNamespace();
            }

            @Override
            public ByteString getCsharpNamespaceBytes() {
                return ((FileOptions)this.instance).getCsharpNamespaceBytes();
            }

            public Builder setCsharpNamespace(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCsharpNamespace(value);
                return this;
            }

            public Builder clearCsharpNamespace() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearCsharpNamespace();
                return this;
            }

            public Builder setCsharpNamespaceBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCsharpNamespaceBytes(value);
                return this;
            }

            @Override
            public boolean hasSwiftPrefix() {
                return ((FileOptions)this.instance).hasSwiftPrefix();
            }

            @Override
            public String getSwiftPrefix() {
                return ((FileOptions)this.instance).getSwiftPrefix();
            }

            @Override
            public ByteString getSwiftPrefixBytes() {
                return ((FileOptions)this.instance).getSwiftPrefixBytes();
            }

            public Builder setSwiftPrefix(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setSwiftPrefix(value);
                return this;
            }

            public Builder clearSwiftPrefix() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearSwiftPrefix();
                return this;
            }

            public Builder setSwiftPrefixBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setSwiftPrefixBytes(value);
                return this;
            }

            @Override
            public boolean hasPhpClassPrefix() {
                return ((FileOptions)this.instance).hasPhpClassPrefix();
            }

            @Override
            public String getPhpClassPrefix() {
                return ((FileOptions)this.instance).getPhpClassPrefix();
            }

            @Override
            public ByteString getPhpClassPrefixBytes() {
                return ((FileOptions)this.instance).getPhpClassPrefixBytes();
            }

            public Builder setPhpClassPrefix(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpClassPrefix(value);
                return this;
            }

            public Builder clearPhpClassPrefix() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpClassPrefix();
                return this;
            }

            public Builder setPhpClassPrefixBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpClassPrefixBytes(value);
                return this;
            }

            @Override
            public boolean hasPhpNamespace() {
                return ((FileOptions)this.instance).hasPhpNamespace();
            }

            @Override
            public String getPhpNamespace() {
                return ((FileOptions)this.instance).getPhpNamespace();
            }

            @Override
            public ByteString getPhpNamespaceBytes() {
                return ((FileOptions)this.instance).getPhpNamespaceBytes();
            }

            public Builder setPhpNamespace(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpNamespace(value);
                return this;
            }

            public Builder clearPhpNamespace() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpNamespace();
                return this;
            }

            public Builder setPhpNamespaceBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpNamespaceBytes(value);
                return this;
            }

            @Override
            public boolean hasPhpMetadataNamespace() {
                return ((FileOptions)this.instance).hasPhpMetadataNamespace();
            }

            @Override
            public String getPhpMetadataNamespace() {
                return ((FileOptions)this.instance).getPhpMetadataNamespace();
            }

            @Override
            public ByteString getPhpMetadataNamespaceBytes() {
                return ((FileOptions)this.instance).getPhpMetadataNamespaceBytes();
            }

            public Builder setPhpMetadataNamespace(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpMetadataNamespace(value);
                return this;
            }

            public Builder clearPhpMetadataNamespace() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpMetadataNamespace();
                return this;
            }

            public Builder setPhpMetadataNamespaceBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpMetadataNamespaceBytes(value);
                return this;
            }

            @Override
            public boolean hasRubyPackage() {
                return ((FileOptions)this.instance).hasRubyPackage();
            }

            @Override
            public String getRubyPackage() {
                return ((FileOptions)this.instance).getRubyPackage();
            }

            @Override
            public ByteString getRubyPackageBytes() {
                return ((FileOptions)this.instance).getRubyPackageBytes();
            }

            public Builder setRubyPackage(String value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setRubyPackage(value);
                return this;
            }

            public Builder clearRubyPackage() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearRubyPackage();
                return this;
            }

            public Builder setRubyPackageBytes(ByteString value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setRubyPackageBytes(value);
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((FileOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((FileOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FileOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((FileOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((FileOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((FileOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }
        }
    }

    public static interface FileOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileOptions, FileOptions.Builder> {
        public boolean hasJavaPackage();

        public String getJavaPackage();

        public ByteString getJavaPackageBytes();

        public boolean hasJavaOuterClassname();

        public String getJavaOuterClassname();

        public ByteString getJavaOuterClassnameBytes();

        public boolean hasJavaMultipleFiles();

        public boolean getJavaMultipleFiles();

        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash();

        @Deprecated
        public boolean getJavaGenerateEqualsAndHash();

        public boolean hasJavaStringCheckUtf8();

        public boolean getJavaStringCheckUtf8();

        public boolean hasOptimizeFor();

        public FileOptions.OptimizeMode getOptimizeFor();

        public boolean hasGoPackage();

        public String getGoPackage();

        public ByteString getGoPackageBytes();

        public boolean hasCcGenericServices();

        public boolean getCcGenericServices();

        public boolean hasJavaGenericServices();

        public boolean getJavaGenericServices();

        public boolean hasPyGenericServices();

        public boolean getPyGenericServices();

        public boolean hasDeprecated();

        public boolean getDeprecated();

        public boolean hasCcEnableArenas();

        public boolean getCcEnableArenas();

        public boolean hasObjcClassPrefix();

        public String getObjcClassPrefix();

        public ByteString getObjcClassPrefixBytes();

        public boolean hasCsharpNamespace();

        public String getCsharpNamespace();

        public ByteString getCsharpNamespaceBytes();

        public boolean hasSwiftPrefix();

        public String getSwiftPrefix();

        public ByteString getSwiftPrefixBytes();

        public boolean hasPhpClassPrefix();

        public String getPhpClassPrefix();

        public ByteString getPhpClassPrefixBytes();

        public boolean hasPhpNamespace();

        public String getPhpNamespace();

        public ByteString getPhpNamespaceBytes();

        public boolean hasPhpMetadataNamespace();

        public String getPhpMetadataNamespace();

        public ByteString getPhpMetadataNamespaceBytes();

        public boolean hasRubyPackage();

        public String getRubyPackage();

        public ByteString getRubyPackageBytes();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();
    }

    public static final class MethodDescriptorProto
    extends GeneratedMessageLite<MethodDescriptorProto, Builder>
    implements MethodDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        private String inputType_ = "";
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private String outputType_ = "";
        public static final int OPTIONS_FIELD_NUMBER = 4;
        private MethodOptions options_;
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private boolean clientStreaming_;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = (byte)2;
        private static final MethodDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<MethodDescriptorProto> PARSER;

        private MethodDescriptorProto() {
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = MethodDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getInputType() {
            return this.inputType_;
        }

        @Override
        public ByteString getInputTypeBytes() {
            return ByteString.copyFromUtf8(this.inputType_);
        }

        private void setInputType(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = value;
        }

        private void clearInputType() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.inputType_ = MethodDescriptorProto.getDefaultInstance().getInputType();
        }

        private void setInputTypeBytes(ByteString value) {
            this.inputType_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public String getOutputType() {
            return this.outputType_;
        }

        @Override
        public ByteString getOutputTypeBytes() {
            return ByteString.copyFromUtf8(this.outputType_);
        }

        private void setOutputType(String value) {
            value.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = value;
        }

        private void clearOutputType() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.outputType_ = MethodDescriptorProto.getDefaultInstance().getOutputType();
        }

        private void setOutputTypeBytes(ByteString value) {
            this.outputType_ = value.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public MethodOptions getOptions() {
            return this.options_ == null ? MethodOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(MethodOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 8;
        }

        private void mergeOptions(MethodOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != MethodOptions.getDefaultInstance() ? (MethodOptions)((MethodOptions.Builder)MethodOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 8;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFF7;
        }

        @Override
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        private void setClientStreaming(boolean value) {
            this.bitField0_ |= 0x10;
            this.clientStreaming_ = value;
        }

        private void clearClientStreaming() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.clientStreaming_ = false;
        }

        @Override
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        private void setServerStreaming(boolean value) {
            this.bitField0_ |= 0x20;
            this.serverStreaming_ = value;
        }

        private void clearServerStreaming() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.serverStreaming_ = false;
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MethodDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MethodDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MethodDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MethodDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MethodDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MethodDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return MethodDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return MethodDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MethodDescriptorProto prototype) {
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
                    return new MethodDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"};
                    String info = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0005\u1007\u0004\u0006\u1007\u0005";
                    return MethodDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<MethodDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<MethodDescriptorProto> clazz = MethodDescriptorProto.class;
                    synchronized (MethodDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<MethodDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MethodDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            MethodDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new MethodDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(MethodDescriptorProto.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<MethodDescriptorProto, Builder>
        implements MethodDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((MethodDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((MethodDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((MethodDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public boolean hasInputType() {
                return ((MethodDescriptorProto)this.instance).hasInputType();
            }

            @Override
            public String getInputType() {
                return ((MethodDescriptorProto)this.instance).getInputType();
            }

            @Override
            public ByteString getInputTypeBytes() {
                return ((MethodDescriptorProto)this.instance).getInputTypeBytes();
            }

            public Builder setInputType(String value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setInputType(value);
                return this;
            }

            public Builder clearInputType() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearInputType();
                return this;
            }

            public Builder setInputTypeBytes(ByteString value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setInputTypeBytes(value);
                return this;
            }

            @Override
            public boolean hasOutputType() {
                return ((MethodDescriptorProto)this.instance).hasOutputType();
            }

            @Override
            public String getOutputType() {
                return ((MethodDescriptorProto)this.instance).getOutputType();
            }

            @Override
            public ByteString getOutputTypeBytes() {
                return ((MethodDescriptorProto)this.instance).getOutputTypeBytes();
            }

            public Builder setOutputType(String value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOutputType(value);
                return this;
            }

            public Builder clearOutputType() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearOutputType();
                return this;
            }

            public Builder setOutputTypeBytes(ByteString value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOutputTypeBytes(value);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((MethodDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public MethodOptions getOptions() {
                return ((MethodDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(MethodOptions value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MethodOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOptions((MethodOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MethodOptions value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override
            public boolean hasClientStreaming() {
                return ((MethodDescriptorProto)this.instance).hasClientStreaming();
            }

            @Override
            public boolean getClientStreaming() {
                return ((MethodDescriptorProto)this.instance).getClientStreaming();
            }

            public Builder setClientStreaming(boolean value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setClientStreaming(value);
                return this;
            }

            public Builder clearClientStreaming() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearClientStreaming();
                return this;
            }

            @Override
            public boolean hasServerStreaming() {
                return ((MethodDescriptorProto)this.instance).hasServerStreaming();
            }

            @Override
            public boolean getServerStreaming() {
                return ((MethodDescriptorProto)this.instance).getServerStreaming();
            }

            public Builder setServerStreaming(boolean value) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setServerStreaming(value);
                return this;
            }

            public Builder clearServerStreaming() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearServerStreaming();
                return this;
            }
        }
    }

    public static interface MethodDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public boolean hasInputType();

        public String getInputType();

        public ByteString getInputTypeBytes();

        public boolean hasOutputType();

        public String getOutputType();

        public ByteString getOutputTypeBytes();

        public boolean hasOptions();

        public MethodOptions getOptions();

        public boolean hasClientStreaming();

        public boolean getClientStreaming();

        public boolean hasServerStreaming();

        public boolean getServerStreaming();
    }

    public static final class ServiceDescriptorProto
    extends GeneratedMessageLite<ServiceDescriptorProto, Builder>
    implements ServiceDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int METHOD_FIELD_NUMBER = 2;
        private Internal.ProtobufList<MethodDescriptorProto> method_;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private ServiceOptions options_;
        private byte memoizedIsInitialized = (byte)2;
        private static final ServiceDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<ServiceDescriptorProto> PARSER;

        private ServiceDescriptorProto() {
            this.method_ = ServiceDescriptorProto.emptyProtobufList();
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = ServiceDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
            return this.method_;
        }

        @Override
        public int getMethodCount() {
            return this.method_.size();
        }

        @Override
        public MethodDescriptorProto getMethod(int index) {
            return (MethodDescriptorProto)this.method_.get(index);
        }

        public MethodDescriptorProtoOrBuilder getMethodOrBuilder(int index) {
            return (MethodDescriptorProtoOrBuilder)this.method_.get(index);
        }

        private void ensureMethodIsMutable() {
            Internal.ProtobufList<MethodDescriptorProto> tmp = this.method_;
            if (!tmp.isModifiable()) {
                this.method_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setMethod(int index, MethodDescriptorProto value) {
            value.getClass();
            this.ensureMethodIsMutable();
            this.method_.set(index, value);
        }

        private void addMethod(MethodDescriptorProto value) {
            value.getClass();
            this.ensureMethodIsMutable();
            this.method_.add(value);
        }

        private void addMethod(int index, MethodDescriptorProto value) {
            value.getClass();
            this.ensureMethodIsMutable();
            this.method_.add(index, value);
        }

        private void addAllMethod(Iterable<? extends MethodDescriptorProto> values) {
            this.ensureMethodIsMutable();
            AbstractMessageLite.addAll(values, this.method_);
        }

        private void clearMethod() {
            this.method_ = ServiceDescriptorProto.emptyProtobufList();
        }

        private void removeMethod(int index) {
            this.ensureMethodIsMutable();
            this.method_.remove(index);
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public ServiceOptions getOptions() {
            return this.options_ == null ? ServiceOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(ServiceOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(ServiceOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != ServiceOptions.getDefaultInstance() ? (ServiceOptions)((ServiceOptions.Builder)ServiceOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ServiceDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ServiceDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ServiceDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ServiceDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ServiceDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ServiceDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return ServiceDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return ServiceDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ServiceDescriptorProto prototype) {
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
                    return new ServiceDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001";
                    return ServiceDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<ServiceDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<ServiceDescriptorProto> clazz = ServiceDescriptorProto.class;
                    synchronized (ServiceDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<ServiceDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ServiceDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ServiceDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new ServiceDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(ServiceDescriptorProto.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<ServiceDescriptorProto, Builder>
        implements ServiceDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((ServiceDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((ServiceDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((ServiceDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public List<MethodDescriptorProto> getMethodList() {
                return Collections.unmodifiableList(((ServiceDescriptorProto)this.instance).getMethodList());
            }

            @Override
            public int getMethodCount() {
                return ((ServiceDescriptorProto)this.instance).getMethodCount();
            }

            @Override
            public MethodDescriptorProto getMethod(int index) {
                return ((ServiceDescriptorProto)this.instance).getMethod(index);
            }

            public Builder setMethod(int index, MethodDescriptorProto value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setMethod(index, value);
                return this;
            }

            public Builder setMethod(int index, MethodDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setMethod(index, (MethodDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addMethod(MethodDescriptorProto value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(value);
                return this;
            }

            public Builder addMethod(int index, MethodDescriptorProto value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(index, value);
                return this;
            }

            public Builder addMethod(MethodDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod((MethodDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addMethod(int index, MethodDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(index, (MethodDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllMethod(Iterable<? extends MethodDescriptorProto> values) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addAllMethod(values);
                return this;
            }

            public Builder clearMethod() {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).clearMethod();
                return this;
            }

            public Builder removeMethod(int index) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).removeMethod(index);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((ServiceDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public ServiceOptions getOptions() {
                return ((ServiceDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(ServiceOptions value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(ServiceOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setOptions((ServiceOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(ServiceOptions value) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).clearOptions();
                return this;
            }
        }
    }

    public static interface ServiceDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public List<MethodDescriptorProto> getMethodList();

        public MethodDescriptorProto getMethod(int var1);

        public int getMethodCount();

        public boolean hasOptions();

        public ServiceOptions getOptions();
    }

    public static final class EnumValueDescriptorProto
    extends GeneratedMessageLite<EnumValueDescriptorProto, Builder>
    implements EnumValueDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int NUMBER_FIELD_NUMBER = 2;
        private int number_;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private EnumValueOptions options_;
        private byte memoizedIsInitialized = (byte)2;
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<EnumValueDescriptorProto> PARSER;

        private EnumValueDescriptorProto() {
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = EnumValueDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public int getNumber() {
            return this.number_;
        }

        private void setNumber(int value) {
            this.bitField0_ |= 2;
            this.number_ = value;
        }

        private void clearNumber() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.number_ = 0;
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public EnumValueOptions getOptions() {
            return this.options_ == null ? EnumValueOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(EnumValueOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 4;
        }

        private void mergeOptions(EnumValueOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != EnumValueOptions.getDefaultInstance() ? (EnumValueOptions)((EnumValueOptions.Builder)EnumValueOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 4;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFFB;
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return EnumValueDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return EnumValueDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EnumValueDescriptorProto prototype) {
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
                    return new EnumValueDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "number_", "options_"};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1409\u0002";
                    return EnumValueDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<EnumValueDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<EnumValueDescriptorProto> clazz = EnumValueDescriptorProto.class;
                    synchronized (EnumValueDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<EnumValueDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EnumValueDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            EnumValueDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new EnumValueDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(EnumValueDescriptorProto.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<EnumValueDescriptorProto, Builder>
        implements EnumValueDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((EnumValueDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((EnumValueDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((EnumValueDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public boolean hasNumber() {
                return ((EnumValueDescriptorProto)this.instance).hasNumber();
            }

            @Override
            public int getNumber() {
                return ((EnumValueDescriptorProto)this.instance).getNumber();
            }

            public Builder setNumber(int value) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setNumber(value);
                return this;
            }

            public Builder clearNumber() {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).clearNumber();
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((EnumValueDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public EnumValueOptions getOptions() {
                return ((EnumValueDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(EnumValueOptions value) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(EnumValueOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setOptions((EnumValueOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(EnumValueOptions value) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).clearOptions();
                return this;
            }
        }
    }

    public static interface EnumValueDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public boolean hasNumber();

        public int getNumber();

        public boolean hasOptions();

        public EnumValueOptions getOptions();
    }

    public static final class EnumDescriptorProto
    extends GeneratedMessageLite<EnumDescriptorProto, Builder>
    implements EnumDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int VALUE_FIELD_NUMBER = 2;
        private Internal.ProtobufList<EnumValueDescriptorProto> value_;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private EnumOptions options_;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        private Internal.ProtobufList<EnumReservedRange> reservedRange_;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        private Internal.ProtobufList<String> reservedName_;
        private byte memoizedIsInitialized = (byte)2;
        private static final EnumDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<EnumDescriptorProto> PARSER;

        private EnumDescriptorProto() {
            this.value_ = EnumDescriptorProto.emptyProtobufList();
            this.reservedRange_ = EnumDescriptorProto.emptyProtobufList();
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = EnumDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
            return this.value_;
        }

        @Override
        public int getValueCount() {
            return this.value_.size();
        }

        @Override
        public EnumValueDescriptorProto getValue(int index) {
            return (EnumValueDescriptorProto)this.value_.get(index);
        }

        public EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int index) {
            return (EnumValueDescriptorProtoOrBuilder)this.value_.get(index);
        }

        private void ensureValueIsMutable() {
            Internal.ProtobufList<EnumValueDescriptorProto> tmp = this.value_;
            if (!tmp.isModifiable()) {
                this.value_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setValue(int index, EnumValueDescriptorProto value) {
            value.getClass();
            this.ensureValueIsMutable();
            this.value_.set(index, value);
        }

        private void addValue(EnumValueDescriptorProto value) {
            value.getClass();
            this.ensureValueIsMutable();
            this.value_.add(value);
        }

        private void addValue(int index, EnumValueDescriptorProto value) {
            value.getClass();
            this.ensureValueIsMutable();
            this.value_.add(index, value);
        }

        private void addAllValue(Iterable<? extends EnumValueDescriptorProto> values) {
            this.ensureValueIsMutable();
            AbstractMessageLite.addAll(values, this.value_);
        }

        private void clearValue() {
            this.value_ = EnumDescriptorProto.emptyProtobufList();
        }

        private void removeValue(int index) {
            this.ensureValueIsMutable();
            this.value_.remove(index);
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public EnumOptions getOptions() {
            return this.options_ == null ? EnumOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(EnumOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(EnumOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != EnumOptions.getDefaultInstance() ? (EnumOptions)((EnumOptions.Builder)EnumOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        @Override
        public List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public List<? extends EnumReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override
        public EnumReservedRange getReservedRange(int index) {
            return (EnumReservedRange)this.reservedRange_.get(index);
        }

        public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int index) {
            return (EnumReservedRangeOrBuilder)this.reservedRange_.get(index);
        }

        private void ensureReservedRangeIsMutable() {
            Internal.ProtobufList<EnumReservedRange> tmp = this.reservedRange_;
            if (!tmp.isModifiable()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setReservedRange(int index, EnumReservedRange value) {
            value.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.set(index, value);
        }

        private void addReservedRange(EnumReservedRange value) {
            value.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(value);
        }

        private void addReservedRange(int index, EnumReservedRange value) {
            value.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(index, value);
        }

        private void addAllReservedRange(Iterable<? extends EnumReservedRange> values) {
            this.ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll(values, this.reservedRange_);
        }

        private void clearReservedRange() {
            this.reservedRange_ = EnumDescriptorProto.emptyProtobufList();
        }

        private void removeReservedRange(int index) {
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.remove(index);
        }

        @Override
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override
        public String getReservedName(int index) {
            return (String)this.reservedName_.get(index);
        }

        @Override
        public ByteString getReservedNameBytes(int index) {
            return ByteString.copyFromUtf8((String)this.reservedName_.get(index));
        }

        private void ensureReservedNameIsMutable() {
            Internal.ProtobufList<String> tmp = this.reservedName_;
            if (!tmp.isModifiable()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setReservedName(int index, String value) {
            value.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.set(index, value);
        }

        private void addReservedName(String value) {
            value.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(value);
        }

        private void addAllReservedName(Iterable<String> values) {
            this.ensureReservedNameIsMutable();
            AbstractMessageLite.addAll(values, this.reservedName_);
        }

        private void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addReservedNameBytes(ByteString value) {
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(value.toStringUtf8());
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EnumDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EnumDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return EnumDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return EnumDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EnumDescriptorProto prototype) {
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
                    return new EnumDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"};
                    String info = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u001b\u0005\u001a";
                    return EnumDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<EnumDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<EnumDescriptorProto> clazz = EnumDescriptorProto.class;
                    synchronized (EnumDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<EnumDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EnumDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            EnumDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new EnumDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(EnumDescriptorProto.class, defaultInstance);
        }

        public static final class EnumReservedRange
        extends GeneratedMessageLite<EnumReservedRange, Builder>
        implements EnumReservedRangeOrBuilder {
            private int bitField0_;
            public static final int START_FIELD_NUMBER = 1;
            private int start_;
            public static final int END_FIELD_NUMBER = 2;
            private int end_;
            private static final EnumReservedRange DEFAULT_INSTANCE;
            private static volatile Parser<EnumReservedRange> PARSER;

            private EnumReservedRange() {
            }

            @Override
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public int getStart() {
                return this.start_;
            }

            private void setStart(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            private void clearStart() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.start_ = 0;
            }

            @Override
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public int getEnd() {
                return this.end_;
            }

            private void setEnd(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            private void clearEnd() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.end_ = 0;
            }

            public static EnumReservedRange parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static EnumReservedRange parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static EnumReservedRange parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static EnumReservedRange parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static EnumReservedRange parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static EnumReservedRange parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static EnumReservedRange parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static EnumReservedRange parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream input) throws IOException {
                return EnumReservedRange.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return EnumReservedRange.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static EnumReservedRange parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static EnumReservedRange parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(EnumReservedRange prototype) {
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
                        return new EnumReservedRange();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "start_", "end_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001";
                        return EnumReservedRange.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<EnumReservedRange> parser = PARSER;
                        if (parser != null) return parser;
                        Class<EnumReservedRange> clazz = EnumReservedRange.class;
                        synchronized (EnumReservedRange.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<EnumReservedRange>(DEFAULT_INSTANCE);
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

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<EnumReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                EnumReservedRange defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new EnumReservedRange();
                GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<EnumReservedRange, Builder>
            implements EnumReservedRangeOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasStart() {
                    return ((EnumReservedRange)this.instance).hasStart();
                }

                @Override
                public int getStart() {
                    return ((EnumReservedRange)this.instance).getStart();
                }

                public Builder setStart(int value) {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).setStart(value);
                    return this;
                }

                public Builder clearStart() {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).clearStart();
                    return this;
                }

                @Override
                public boolean hasEnd() {
                    return ((EnumReservedRange)this.instance).hasEnd();
                }

                @Override
                public int getEnd() {
                    return ((EnumReservedRange)this.instance).getEnd();
                }

                public Builder setEnd(int value) {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).setEnd(value);
                    return this;
                }

                public Builder clearEnd() {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).clearEnd();
                    return this;
                }
            }
        }

        public static interface EnumReservedRangeOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasStart();

            public int getStart();

            public boolean hasEnd();

            public int getEnd();
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<EnumDescriptorProto, Builder>
        implements EnumDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((EnumDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((EnumDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((EnumDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public List<EnumValueDescriptorProto> getValueList() {
                return Collections.unmodifiableList(((EnumDescriptorProto)this.instance).getValueList());
            }

            @Override
            public int getValueCount() {
                return ((EnumDescriptorProto)this.instance).getValueCount();
            }

            @Override
            public EnumValueDescriptorProto getValue(int index) {
                return ((EnumDescriptorProto)this.instance).getValue(index);
            }

            public Builder setValue(int index, EnumValueDescriptorProto value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setValue(index, value);
                return this;
            }

            public Builder setValue(int index, EnumValueDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setValue(index, (EnumValueDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addValue(EnumValueDescriptorProto value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(value);
                return this;
            }

            public Builder addValue(int index, EnumValueDescriptorProto value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(index, value);
                return this;
            }

            public Builder addValue(EnumValueDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue((EnumValueDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addValue(int index, EnumValueDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(index, (EnumValueDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllValue(Iterable<? extends EnumValueDescriptorProto> values) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addAllValue(values);
                return this;
            }

            public Builder clearValue() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearValue();
                return this;
            }

            public Builder removeValue(int index) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).removeValue(index);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((EnumDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public EnumOptions getOptions() {
                return ((EnumDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(EnumOptions value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(EnumOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setOptions((EnumOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(EnumOptions value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override
            public List<EnumReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((EnumDescriptorProto)this.instance).getReservedRangeList());
            }

            @Override
            public int getReservedRangeCount() {
                return ((EnumDescriptorProto)this.instance).getReservedRangeCount();
            }

            @Override
            public EnumReservedRange getReservedRange(int index) {
                return ((EnumDescriptorProto)this.instance).getReservedRange(index);
            }

            public Builder setReservedRange(int index, EnumReservedRange value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setReservedRange(index, value);
                return this;
            }

            public Builder setReservedRange(int index, EnumReservedRange.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setReservedRange(index, (EnumReservedRange)builderForValue.build());
                return this;
            }

            public Builder addReservedRange(EnumReservedRange value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(value);
                return this;
            }

            public Builder addReservedRange(int index, EnumReservedRange value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(index, value);
                return this;
            }

            public Builder addReservedRange(EnumReservedRange.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange((EnumReservedRange)builderForValue.build());
                return this;
            }

            public Builder addReservedRange(int index, EnumReservedRange.Builder builderForValue) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(index, (EnumReservedRange)builderForValue.build());
                return this;
            }

            public Builder addAllReservedRange(Iterable<? extends EnumReservedRange> values) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addAllReservedRange(values);
                return this;
            }

            public Builder clearReservedRange() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearReservedRange();
                return this;
            }

            public Builder removeReservedRange(int index) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).removeReservedRange(index);
                return this;
            }

            @Override
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((EnumDescriptorProto)this.instance).getReservedNameList());
            }

            @Override
            public int getReservedNameCount() {
                return ((EnumDescriptorProto)this.instance).getReservedNameCount();
            }

            @Override
            public String getReservedName(int index) {
                return ((EnumDescriptorProto)this.instance).getReservedName(index);
            }

            @Override
            public ByteString getReservedNameBytes(int index) {
                return ((EnumDescriptorProto)this.instance).getReservedNameBytes(index);
            }

            public Builder setReservedName(int index, String value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setReservedName(index, value);
                return this;
            }

            public Builder addReservedName(String value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedName(value);
                return this;
            }

            public Builder addAllReservedName(Iterable<String> values) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addAllReservedName(values);
                return this;
            }

            public Builder clearReservedName() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearReservedName();
                return this;
            }

            public Builder addReservedNameBytes(ByteString value) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedNameBytes(value);
                return this;
            }
        }
    }

    public static interface EnumDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public List<EnumValueDescriptorProto> getValueList();

        public EnumValueDescriptorProto getValue(int var1);

        public int getValueCount();

        public boolean hasOptions();

        public EnumOptions getOptions();

        public List<EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

        public EnumDescriptorProto.EnumReservedRange getReservedRange(int var1);

        public int getReservedRangeCount();

        public List<String> getReservedNameList();

        public int getReservedNameCount();

        public String getReservedName(int var1);

        public ByteString getReservedNameBytes(int var1);
    }

    public static final class OneofDescriptorProto
    extends GeneratedMessageLite<OneofDescriptorProto, Builder>
    implements OneofDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private OneofOptions options_;
        private byte memoizedIsInitialized = (byte)2;
        private static final OneofDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<OneofDescriptorProto> PARSER;

        private OneofDescriptorProto() {
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = OneofDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public OneofOptions getOptions() {
            return this.options_ == null ? OneofOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(OneofOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(OneofOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != OneofOptions.getDefaultInstance() ? (OneofOptions)((OneofOptions.Builder)OneofOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OneofDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OneofDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OneofDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OneofDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OneofDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OneofDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return OneofDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return OneofDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OneofDescriptorProto prototype) {
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
                    return new OneofDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "options_"};
                    String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001";
                    return OneofDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<OneofDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<OneofDescriptorProto> clazz = OneofDescriptorProto.class;
                    synchronized (OneofDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<OneofDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<OneofDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            OneofDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new OneofDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(OneofDescriptorProto.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<OneofDescriptorProto, Builder>
        implements OneofDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((OneofDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((OneofDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((OneofDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((OneofDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public OneofOptions getOptions() {
                return ((OneofDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(OneofOptions value) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(OneofOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setOptions((OneofOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(OneofOptions value) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).clearOptions();
                return this;
            }
        }
    }

    public static interface OneofDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public boolean hasOptions();

        public OneofOptions getOptions();
    }

    public static final class FieldDescriptorProto
    extends GeneratedMessageLite<FieldDescriptorProto, Builder>
    implements FieldDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int NUMBER_FIELD_NUMBER = 3;
        private int number_;
        public static final int LABEL_FIELD_NUMBER = 4;
        private int label_ = 1;
        public static final int TYPE_FIELD_NUMBER = 5;
        private int type_ = 1;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private String typeName_ = "";
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        private String extendee_ = "";
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        private String defaultValue_ = "";
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        private int oneofIndex_;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        private String jsonName_ = "";
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private FieldOptions options_;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FieldDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<FieldDescriptorProto> PARSER;

        private FieldDescriptorProto() {
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = FieldDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public int getNumber() {
            return this.number_;
        }

        private void setNumber(int value) {
            this.bitField0_ |= 2;
            this.number_ = value;
        }

        private void clearNumber() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.number_ = 0;
        }

        @Override
        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public Label getLabel() {
            Label result = Label.forNumber(this.label_);
            return result == null ? Label.LABEL_OPTIONAL : result;
        }

        private void setLabel(Label value) {
            this.label_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        private void clearLabel() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.label_ = 1;
        }

        @Override
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public Type getType() {
            Type result = Type.forNumber(this.type_);
            return result == null ? Type.TYPE_DOUBLE : result;
        }

        private void setType(Type value) {
            this.type_ = value.getNumber();
            this.bitField0_ |= 8;
        }

        private void clearType() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.type_ = 1;
        }

        @Override
        public boolean hasTypeName() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public String getTypeName() {
            return this.typeName_;
        }

        @Override
        public ByteString getTypeNameBytes() {
            return ByteString.copyFromUtf8(this.typeName_);
        }

        private void setTypeName(String value) {
            value.getClass();
            this.bitField0_ |= 0x10;
            this.typeName_ = value;
        }

        private void clearTypeName() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.typeName_ = FieldDescriptorProto.getDefaultInstance().getTypeName();
        }

        private void setTypeNameBytes(ByteString value) {
            this.typeName_ = value.toStringUtf8();
            this.bitField0_ |= 0x10;
        }

        @Override
        public boolean hasExtendee() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public String getExtendee() {
            return this.extendee_;
        }

        @Override
        public ByteString getExtendeeBytes() {
            return ByteString.copyFromUtf8(this.extendee_);
        }

        private void setExtendee(String value) {
            value.getClass();
            this.bitField0_ |= 0x20;
            this.extendee_ = value;
        }

        private void clearExtendee() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.extendee_ = FieldDescriptorProto.getDefaultInstance().getExtendee();
        }

        private void setExtendeeBytes(ByteString value) {
            this.extendee_ = value.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        @Override
        public boolean hasDefaultValue() {
            return (this.bitField0_ & 0x40) != 0;
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
            this.bitField0_ |= 0x40;
            this.defaultValue_ = value;
        }

        private void clearDefaultValue() {
            this.bitField0_ &= 0xFFFFFFBF;
            this.defaultValue_ = FieldDescriptorProto.getDefaultInstance().getDefaultValue();
        }

        private void setDefaultValueBytes(ByteString value) {
            this.defaultValue_ = value.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        @Override
        public boolean hasOneofIndex() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        private void setOneofIndex(int value) {
            this.bitField0_ |= 0x80;
            this.oneofIndex_ = value;
        }

        private void clearOneofIndex() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.oneofIndex_ = 0;
        }

        @Override
        public boolean hasJsonName() {
            return (this.bitField0_ & 0x100) != 0;
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
            this.bitField0_ |= 0x100;
            this.jsonName_ = value;
        }

        private void clearJsonName() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.jsonName_ = FieldDescriptorProto.getDefaultInstance().getJsonName();
        }

        private void setJsonNameBytes(ByteString value) {
            this.jsonName_ = value.toStringUtf8();
            this.bitField0_ |= 0x100;
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override
        public FieldOptions getOptions() {
            return this.options_ == null ? FieldOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(FieldOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 0x200;
        }

        private void mergeOptions(FieldOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != FieldOptions.getDefaultInstance() ? (FieldOptions)((FieldOptions.Builder)FieldOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 0x200;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFDFF;
        }

        @Override
        public boolean hasProto3Optional() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        private void setProto3Optional(boolean value) {
            this.bitField0_ |= 0x400;
            this.proto3Optional_ = value;
        }

        private void clearProto3Optional() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.proto3Optional_ = false;
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FieldDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FieldDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FieldDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FieldDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FieldDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FieldDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return FieldDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FieldDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FieldDescriptorProto prototype) {
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
                    return new FieldDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.internalGetVerifier(), "type_", Type.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"};
                    String info = "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0005\u0003\u1004\u0001\u0004\u180c\u0002\u0005\u180c\u0003\u0006\u1008\u0004\u0007\u1008\u0006\b\u1409\t\t\u1004\u0007\n\u1008\b\u0011\u1007\n";
                    return FieldDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FieldDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FieldDescriptorProto> clazz = FieldDescriptorProto.class;
                    synchronized (FieldDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FieldDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FieldDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FieldDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new FieldDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(FieldDescriptorProto.class, defaultInstance);
        }

        public static enum Type implements Internal.EnumLite
        {
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
            TYPE_SINT64(18);

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
            private static final Internal.EnumLiteMap<Type> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int value) {
                return Type.forNumber(value);
            }

            public static Type forNumber(int value) {
                switch (value) {
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

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            private Type(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<Type>(){

                    @Override
                    public Type findValueByNumber(int number) {
                        return Type.forNumber(number);
                    }
                };
            }

            private static final class TypeVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return Type.forNumber(number) != null;
                }
            }
        }

        public static enum Label implements Internal.EnumLite
        {
            LABEL_OPTIONAL(1),
            LABEL_REPEATED(3),
            LABEL_REQUIRED(2);

            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private static final Internal.EnumLiteMap<Label> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Label valueOf(int value) {
                return Label.forNumber(value);
            }

            public static Label forNumber(int value) {
                switch (value) {
                    case 1: {
                        return LABEL_OPTIONAL;
                    }
                    case 3: {
                        return LABEL_REPEATED;
                    }
                    case 2: {
                        return LABEL_REQUIRED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<Label> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return LabelVerifier.INSTANCE;
            }

            private Label(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<Label>(){

                    @Override
                    public Label findValueByNumber(int number) {
                        return Label.forNumber(number);
                    }
                };
            }

            private static final class LabelVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new LabelVerifier();

                private LabelVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return Label.forNumber(number) != null;
                }
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldDescriptorProto, Builder>
        implements FieldDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((FieldDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((FieldDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((FieldDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public boolean hasNumber() {
                return ((FieldDescriptorProto)this.instance).hasNumber();
            }

            @Override
            public int getNumber() {
                return ((FieldDescriptorProto)this.instance).getNumber();
            }

            public Builder setNumber(int value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setNumber(value);
                return this;
            }

            public Builder clearNumber() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearNumber();
                return this;
            }

            @Override
            public boolean hasLabel() {
                return ((FieldDescriptorProto)this.instance).hasLabel();
            }

            @Override
            public Label getLabel() {
                return ((FieldDescriptorProto)this.instance).getLabel();
            }

            public Builder setLabel(Label value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setLabel(value);
                return this;
            }

            public Builder clearLabel() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearLabel();
                return this;
            }

            @Override
            public boolean hasType() {
                return ((FieldDescriptorProto)this.instance).hasType();
            }

            @Override
            public Type getType() {
                return ((FieldDescriptorProto)this.instance).getType();
            }

            public Builder setType(Type value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setType(value);
                return this;
            }

            public Builder clearType() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearType();
                return this;
            }

            @Override
            public boolean hasTypeName() {
                return ((FieldDescriptorProto)this.instance).hasTypeName();
            }

            @Override
            public String getTypeName() {
                return ((FieldDescriptorProto)this.instance).getTypeName();
            }

            @Override
            public ByteString getTypeNameBytes() {
                return ((FieldDescriptorProto)this.instance).getTypeNameBytes();
            }

            public Builder setTypeName(String value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setTypeName(value);
                return this;
            }

            public Builder clearTypeName() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearTypeName();
                return this;
            }

            public Builder setTypeNameBytes(ByteString value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setTypeNameBytes(value);
                return this;
            }

            @Override
            public boolean hasExtendee() {
                return ((FieldDescriptorProto)this.instance).hasExtendee();
            }

            @Override
            public String getExtendee() {
                return ((FieldDescriptorProto)this.instance).getExtendee();
            }

            @Override
            public ByteString getExtendeeBytes() {
                return ((FieldDescriptorProto)this.instance).getExtendeeBytes();
            }

            public Builder setExtendee(String value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setExtendee(value);
                return this;
            }

            public Builder clearExtendee() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearExtendee();
                return this;
            }

            public Builder setExtendeeBytes(ByteString value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setExtendeeBytes(value);
                return this;
            }

            @Override
            public boolean hasDefaultValue() {
                return ((FieldDescriptorProto)this.instance).hasDefaultValue();
            }

            @Override
            public String getDefaultValue() {
                return ((FieldDescriptorProto)this.instance).getDefaultValue();
            }

            @Override
            public ByteString getDefaultValueBytes() {
                return ((FieldDescriptorProto)this.instance).getDefaultValueBytes();
            }

            public Builder setDefaultValue(String value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setDefaultValue(value);
                return this;
            }

            public Builder clearDefaultValue() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearDefaultValue();
                return this;
            }

            public Builder setDefaultValueBytes(ByteString value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setDefaultValueBytes(value);
                return this;
            }

            @Override
            public boolean hasOneofIndex() {
                return ((FieldDescriptorProto)this.instance).hasOneofIndex();
            }

            @Override
            public int getOneofIndex() {
                return ((FieldDescriptorProto)this.instance).getOneofIndex();
            }

            public Builder setOneofIndex(int value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setOneofIndex(value);
                return this;
            }

            public Builder clearOneofIndex() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearOneofIndex();
                return this;
            }

            @Override
            public boolean hasJsonName() {
                return ((FieldDescriptorProto)this.instance).hasJsonName();
            }

            @Override
            public String getJsonName() {
                return ((FieldDescriptorProto)this.instance).getJsonName();
            }

            @Override
            public ByteString getJsonNameBytes() {
                return ((FieldDescriptorProto)this.instance).getJsonNameBytes();
            }

            public Builder setJsonName(String value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setJsonName(value);
                return this;
            }

            public Builder clearJsonName() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearJsonName();
                return this;
            }

            public Builder setJsonNameBytes(ByteString value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setJsonNameBytes(value);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((FieldDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public FieldOptions getOptions() {
                return ((FieldDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(FieldOptions value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(FieldOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setOptions((FieldOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(FieldOptions value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override
            public boolean hasProto3Optional() {
                return ((FieldDescriptorProto)this.instance).hasProto3Optional();
            }

            @Override
            public boolean getProto3Optional() {
                return ((FieldDescriptorProto)this.instance).getProto3Optional();
            }

            public Builder setProto3Optional(boolean value) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setProto3Optional(value);
                return this;
            }

            public Builder clearProto3Optional() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearProto3Optional();
                return this;
            }
        }
    }

    public static interface FieldDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public boolean hasNumber();

        public int getNumber();

        public boolean hasLabel();

        public FieldDescriptorProto.Label getLabel();

        public boolean hasType();

        public FieldDescriptorProto.Type getType();

        public boolean hasTypeName();

        public String getTypeName();

        public ByteString getTypeNameBytes();

        public boolean hasExtendee();

        public String getExtendee();

        public ByteString getExtendeeBytes();

        public boolean hasDefaultValue();

        public String getDefaultValue();

        public ByteString getDefaultValueBytes();

        public boolean hasOneofIndex();

        public int getOneofIndex();

        public boolean hasJsonName();

        public String getJsonName();

        public ByteString getJsonNameBytes();

        public boolean hasOptions();

        public FieldOptions getOptions();

        public boolean hasProto3Optional();

        public boolean getProto3Optional();
    }

    public static final class ExtensionRangeOptions
    extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, Builder>
    implements ExtensionRangeOptionsOrBuilder {
        private int bitField0_;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        public static final int DECLARATION_FIELD_NUMBER = 2;
        private Internal.ProtobufList<Declaration> declaration_;
        public static final int FEATURES_FIELD_NUMBER = 50;
        private FeatureSet features_;
        public static final int VERIFICATION_FIELD_NUMBER = 3;
        private int verification_ = 1;
        private byte memoizedIsInitialized = (byte)2;
        private static final ExtensionRangeOptions DEFAULT_INSTANCE;
        private static volatile Parser<ExtensionRangeOptions> PARSER;

        private ExtensionRangeOptions() {
            this.uninterpretedOption_ = ExtensionRangeOptions.emptyProtobufList();
            this.declaration_ = ExtensionRangeOptions.emptyProtobufList();
        }

        @Override
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override
        public UninterpretedOption getUninterpretedOption(int index) {
            return (UninterpretedOption)this.uninterpretedOption_.get(index);
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int index) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(index);
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> tmp = this.uninterpretedOption_;
            if (!tmp.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        private void addUninterpretedOption(UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        private void addUninterpretedOption(int index, UninterpretedOption value) {
            value.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(values, this.uninterpretedOption_);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = ExtensionRangeOptions.emptyProtobufList();
        }

        private void removeUninterpretedOption(int index) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        @Override
        public List<Declaration> getDeclarationList() {
            return this.declaration_;
        }

        public List<? extends DeclarationOrBuilder> getDeclarationOrBuilderList() {
            return this.declaration_;
        }

        @Override
        public int getDeclarationCount() {
            return this.declaration_.size();
        }

        @Override
        public Declaration getDeclaration(int index) {
            return (Declaration)this.declaration_.get(index);
        }

        public DeclarationOrBuilder getDeclarationOrBuilder(int index) {
            return (DeclarationOrBuilder)this.declaration_.get(index);
        }

        private void ensureDeclarationIsMutable() {
            Internal.ProtobufList<Declaration> tmp = this.declaration_;
            if (!tmp.isModifiable()) {
                this.declaration_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setDeclaration(int index, Declaration value) {
            value.getClass();
            this.ensureDeclarationIsMutable();
            this.declaration_.set(index, value);
        }

        private void addDeclaration(Declaration value) {
            value.getClass();
            this.ensureDeclarationIsMutable();
            this.declaration_.add(value);
        }

        private void addDeclaration(int index, Declaration value) {
            value.getClass();
            this.ensureDeclarationIsMutable();
            this.declaration_.add(index, value);
        }

        private void addAllDeclaration(Iterable<? extends Declaration> values) {
            this.ensureDeclarationIsMutable();
            AbstractMessageLite.addAll(values, this.declaration_);
        }

        private void clearDeclaration() {
            this.declaration_ = ExtensionRangeOptions.emptyProtobufList();
        }

        private void removeDeclaration(int index) {
            this.ensureDeclarationIsMutable();
            this.declaration_.remove(index);
        }

        @Override
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public FeatureSet getFeatures() {
            return this.features_ == null ? FeatureSet.getDefaultInstance() : this.features_;
        }

        private void setFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        private void mergeFeatures(FeatureSet value) {
            value.getClass();
            this.features_ = this.features_ != null && this.features_ != FeatureSet.getDefaultInstance() ? (FeatureSet)((FeatureSet.Builder)FeatureSet.newBuilder(this.features_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 1;
        }

        private void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        @Override
        public boolean hasVerification() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public VerificationState getVerification() {
            VerificationState result = VerificationState.forNumber(this.verification_);
            return result == null ? VerificationState.UNVERIFIED : result;
        }

        private void setVerification(VerificationState value) {
            this.verification_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        private void clearVerification() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.verification_ = 1;
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ExtensionRangeOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ExtensionRangeOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ExtensionRangeOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ExtensionRangeOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ExtensionRangeOptions parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ExtensionRangeOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream input) throws IOException {
            return ExtensionRangeOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return ExtensionRangeOptions.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExtensionRangeOptions prototype) {
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
                    return new ExtensionRangeOptions();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "declaration_", Declaration.class, "verification_", VerificationState.internalGetVerifier(), "features_", "uninterpretedOption_", UninterpretedOption.class};
                    String info = "\u0001\u0004\u0000\u0001\u0002\u03e7\u0004\u0000\u0002\u0002\u0002\u001b\u0003\u180c\u00012\u1409\u0000\u03e7\u041b";
                    return ExtensionRangeOptions.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<ExtensionRangeOptions> parser = PARSER;
                    if (parser != null) return parser;
                    Class<ExtensionRangeOptions> clazz = ExtensionRangeOptions.class;
                    synchronized (ExtensionRangeOptions.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<ExtensionRangeOptions>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ExtensionRangeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ExtensionRangeOptions defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new ExtensionRangeOptions();
            GeneratedMessageLite.registerDefaultInstance(ExtensionRangeOptions.class, defaultInstance);
        }

        public static enum VerificationState implements Internal.EnumLite
        {
            DECLARATION(0),
            UNVERIFIED(1);

            public static final int DECLARATION_VALUE = 0;
            public static final int UNVERIFIED_VALUE = 1;
            private static final Internal.EnumLiteMap<VerificationState> internalValueMap;
            private final int value;

            @Override
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static VerificationState valueOf(int value) {
                return VerificationState.forNumber(value);
            }

            public static VerificationState forNumber(int value) {
                switch (value) {
                    case 0: {
                        return DECLARATION;
                    }
                    case 1: {
                        return UNVERIFIED;
                    }
                }
                return null;
            }

            public static Internal.EnumLiteMap<VerificationState> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return VerificationStateVerifier.INSTANCE;
            }

            private VerificationState(int value) {
                this.value = value;
            }

            static {
                internalValueMap = new Internal.EnumLiteMap<VerificationState>(){

                    @Override
                    public VerificationState findValueByNumber(int number) {
                        return VerificationState.forNumber(number);
                    }
                };
            }

            private static final class VerificationStateVerifier
            implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new VerificationStateVerifier();

                private VerificationStateVerifier() {
                }

                @Override
                public boolean isInRange(int number) {
                    return VerificationState.forNumber(number) != null;
                }
            }
        }

        public static final class Declaration
        extends GeneratedMessageLite<Declaration, Builder>
        implements DeclarationOrBuilder {
            private int bitField0_;
            public static final int NUMBER_FIELD_NUMBER = 1;
            private int number_;
            public static final int FULL_NAME_FIELD_NUMBER = 2;
            private String fullName_ = "";
            public static final int TYPE_FIELD_NUMBER = 3;
            private String type_ = "";
            public static final int RESERVED_FIELD_NUMBER = 5;
            private boolean reserved_;
            public static final int REPEATED_FIELD_NUMBER = 6;
            private boolean repeated_;
            private static final Declaration DEFAULT_INSTANCE;
            private static volatile Parser<Declaration> PARSER;

            private Declaration() {
            }

            @Override
            public boolean hasNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public int getNumber() {
                return this.number_;
            }

            private void setNumber(int value) {
                this.bitField0_ |= 1;
                this.number_ = value;
            }

            private void clearNumber() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.number_ = 0;
            }

            @Override
            public boolean hasFullName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public String getFullName() {
                return this.fullName_;
            }

            @Override
            public ByteString getFullNameBytes() {
                return ByteString.copyFromUtf8(this.fullName_);
            }

            private void setFullName(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.fullName_ = value;
            }

            private void clearFullName() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.fullName_ = Declaration.getDefaultInstance().getFullName();
            }

            private void setFullNameBytes(ByteString value) {
                this.fullName_ = value.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override
            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override
            public String getType() {
                return this.type_;
            }

            @Override
            public ByteString getTypeBytes() {
                return ByteString.copyFromUtf8(this.type_);
            }

            private void setType(String value) {
                value.getClass();
                this.bitField0_ |= 4;
                this.type_ = value;
            }

            private void clearType() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.type_ = Declaration.getDefaultInstance().getType();
            }

            private void setTypeBytes(ByteString value) {
                this.type_ = value.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override
            public boolean hasReserved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override
            public boolean getReserved() {
                return this.reserved_;
            }

            private void setReserved(boolean value) {
                this.bitField0_ |= 8;
                this.reserved_ = value;
            }

            private void clearReserved() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.reserved_ = false;
            }

            @Override
            public boolean hasRepeated() {
                return (this.bitField0_ & 0x10) != 0;
            }

            @Override
            public boolean getRepeated() {
                return this.repeated_;
            }

            private void setRepeated(boolean value) {
                this.bitField0_ |= 0x10;
                this.repeated_ = value;
            }

            private void clearRepeated() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.repeated_ = false;
            }

            public static Declaration parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Declaration parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Declaration parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Declaration parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Declaration parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Declaration parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Declaration parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Declaration parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Declaration parseDelimitedFrom(InputStream input) throws IOException {
                return Declaration.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Declaration parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return Declaration.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Declaration parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Declaration parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Declaration prototype) {
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
                        return new Declaration();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"};
                        String info = "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1007\u0003\u0006\u1007\u0004";
                        return Declaration.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<Declaration> parser = PARSER;
                        if (parser != null) return parser;
                        Class<Declaration> clazz = Declaration.class;
                        synchronized (Declaration.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<Declaration>(DEFAULT_INSTANCE);
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

            public static Declaration getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Declaration> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Declaration defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new Declaration();
                GeneratedMessageLite.registerDefaultInstance(Declaration.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Declaration, Builder>
            implements DeclarationOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasNumber() {
                    return ((Declaration)this.instance).hasNumber();
                }

                @Override
                public int getNumber() {
                    return ((Declaration)this.instance).getNumber();
                }

                public Builder setNumber(int value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setNumber(value);
                    return this;
                }

                public Builder clearNumber() {
                    this.copyOnWrite();
                    ((Declaration)this.instance).clearNumber();
                    return this;
                }

                @Override
                public boolean hasFullName() {
                    return ((Declaration)this.instance).hasFullName();
                }

                @Override
                public String getFullName() {
                    return ((Declaration)this.instance).getFullName();
                }

                @Override
                public ByteString getFullNameBytes() {
                    return ((Declaration)this.instance).getFullNameBytes();
                }

                public Builder setFullName(String value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setFullName(value);
                    return this;
                }

                public Builder clearFullName() {
                    this.copyOnWrite();
                    ((Declaration)this.instance).clearFullName();
                    return this;
                }

                public Builder setFullNameBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setFullNameBytes(value);
                    return this;
                }

                @Override
                public boolean hasType() {
                    return ((Declaration)this.instance).hasType();
                }

                @Override
                public String getType() {
                    return ((Declaration)this.instance).getType();
                }

                @Override
                public ByteString getTypeBytes() {
                    return ((Declaration)this.instance).getTypeBytes();
                }

                public Builder setType(String value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setType(value);
                    return this;
                }

                public Builder clearType() {
                    this.copyOnWrite();
                    ((Declaration)this.instance).clearType();
                    return this;
                }

                public Builder setTypeBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setTypeBytes(value);
                    return this;
                }

                @Override
                public boolean hasReserved() {
                    return ((Declaration)this.instance).hasReserved();
                }

                @Override
                public boolean getReserved() {
                    return ((Declaration)this.instance).getReserved();
                }

                public Builder setReserved(boolean value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setReserved(value);
                    return this;
                }

                public Builder clearReserved() {
                    this.copyOnWrite();
                    ((Declaration)this.instance).clearReserved();
                    return this;
                }

                @Override
                public boolean hasRepeated() {
                    return ((Declaration)this.instance).hasRepeated();
                }

                @Override
                public boolean getRepeated() {
                    return ((Declaration)this.instance).getRepeated();
                }

                public Builder setRepeated(boolean value) {
                    this.copyOnWrite();
                    ((Declaration)this.instance).setRepeated(value);
                    return this;
                }

                public Builder clearRepeated() {
                    this.copyOnWrite();
                    ((Declaration)this.instance).clearRepeated();
                    return this;
                }
            }
        }

        public static interface DeclarationOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasNumber();

            public int getNumber();

            public boolean hasFullName();

            public String getFullName();

            public ByteString getFullNameBytes();

            public boolean hasType();

            public String getType();

            public ByteString getTypeBytes();

            public boolean hasReserved();

            public boolean getReserved();

            public boolean hasRepeated();

            public boolean getRepeated();
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<ExtensionRangeOptions, Builder>
        implements ExtensionRangeOptionsOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ExtensionRangeOptions)this.instance).getUninterpretedOptionList());
            }

            @Override
            public int getUninterpretedOptionCount() {
                return ((ExtensionRangeOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override
            public UninterpretedOption getUninterpretedOption(int index) {
                return ((ExtensionRangeOptions)this.instance).getUninterpretedOption(index);
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setUninterpretedOption(index, value);
                return this;
            }

            public Builder setUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(value);
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(index, value);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption((UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addUninterpretedOption(int index, UninterpretedOption.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(index, (UninterpretedOption)builderForValue.build());
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> values) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addAllUninterpretedOption(values);
                return this;
            }

            public Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder removeUninterpretedOption(int index) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).removeUninterpretedOption(index);
                return this;
            }

            @Override
            public List<Declaration> getDeclarationList() {
                return Collections.unmodifiableList(((ExtensionRangeOptions)this.instance).getDeclarationList());
            }

            @Override
            public int getDeclarationCount() {
                return ((ExtensionRangeOptions)this.instance).getDeclarationCount();
            }

            @Override
            public Declaration getDeclaration(int index) {
                return ((ExtensionRangeOptions)this.instance).getDeclaration(index);
            }

            public Builder setDeclaration(int index, Declaration value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setDeclaration(index, value);
                return this;
            }

            public Builder setDeclaration(int index, Declaration.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setDeclaration(index, (Declaration)builderForValue.build());
                return this;
            }

            public Builder addDeclaration(Declaration value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addDeclaration(value);
                return this;
            }

            public Builder addDeclaration(int index, Declaration value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addDeclaration(index, value);
                return this;
            }

            public Builder addDeclaration(Declaration.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addDeclaration((Declaration)builderForValue.build());
                return this;
            }

            public Builder addDeclaration(int index, Declaration.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addDeclaration(index, (Declaration)builderForValue.build());
                return this;
            }

            public Builder addAllDeclaration(Iterable<? extends Declaration> values) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addAllDeclaration(values);
                return this;
            }

            public Builder clearDeclaration() {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).clearDeclaration();
                return this;
            }

            public Builder removeDeclaration(int index) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).removeDeclaration(index);
                return this;
            }

            @Override
            public boolean hasFeatures() {
                return ((ExtensionRangeOptions)this.instance).hasFeatures();
            }

            @Override
            public FeatureSet getFeatures() {
                return ((ExtensionRangeOptions)this.instance).getFeatures();
            }

            public Builder setFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setFeatures(value);
                return this;
            }

            public Builder setFeatures(FeatureSet.Builder builderForValue) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setFeatures((FeatureSet)builderForValue.build());
                return this;
            }

            public Builder mergeFeatures(FeatureSet value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).mergeFeatures(value);
                return this;
            }

            public Builder clearFeatures() {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).clearFeatures();
                return this;
            }

            @Override
            public boolean hasVerification() {
                return ((ExtensionRangeOptions)this.instance).hasVerification();
            }

            @Override
            public VerificationState getVerification() {
                return ((ExtensionRangeOptions)this.instance).getVerification();
            }

            public Builder setVerification(VerificationState value) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setVerification(value);
                return this;
            }

            public Builder clearVerification() {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).clearVerification();
                return this;
            }
        }
    }

    public static interface ExtensionRangeOptionsOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<ExtensionRangeOptions, ExtensionRangeOptions.Builder> {
        public List<UninterpretedOption> getUninterpretedOptionList();

        public UninterpretedOption getUninterpretedOption(int var1);

        public int getUninterpretedOptionCount();

        public List<ExtensionRangeOptions.Declaration> getDeclarationList();

        public ExtensionRangeOptions.Declaration getDeclaration(int var1);

        public int getDeclarationCount();

        public boolean hasFeatures();

        public FeatureSet getFeatures();

        public boolean hasVerification();

        public ExtensionRangeOptions.VerificationState getVerification();
    }

    public static final class DescriptorProto
    extends GeneratedMessageLite<DescriptorProto, Builder>
    implements DescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int FIELD_FIELD_NUMBER = 2;
        private Internal.ProtobufList<FieldDescriptorProto> field_;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        private Internal.ProtobufList<FieldDescriptorProto> extension_;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        private Internal.ProtobufList<DescriptorProto> nestedType_;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        private Internal.ProtobufList<EnumDescriptorProto> enumType_;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        private Internal.ProtobufList<ExtensionRange> extensionRange_;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        private Internal.ProtobufList<OneofDescriptorProto> oneofDecl_;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private MessageOptions options_;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private Internal.ProtobufList<ReservedRange> reservedRange_;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        private Internal.ProtobufList<String> reservedName_;
        private byte memoizedIsInitialized = (byte)2;
        private static final DescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<DescriptorProto> PARSER;

        private DescriptorProto() {
            this.field_ = DescriptorProto.emptyProtobufList();
            this.extension_ = DescriptorProto.emptyProtobufList();
            this.nestedType_ = DescriptorProto.emptyProtobufList();
            this.enumType_ = DescriptorProto.emptyProtobufList();
            this.extensionRange_ = DescriptorProto.emptyProtobufList();
            this.oneofDecl_ = DescriptorProto.emptyProtobufList();
            this.reservedRange_ = DescriptorProto.emptyProtobufList();
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = DescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
            return this.field_;
        }

        @Override
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override
        public FieldDescriptorProto getField(int index) {
            return (FieldDescriptorProto)this.field_.get(index);
        }

        public FieldDescriptorProtoOrBuilder getFieldOrBuilder(int index) {
            return (FieldDescriptorProtoOrBuilder)this.field_.get(index);
        }

        private void ensureFieldIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> tmp = this.field_;
            if (!tmp.isModifiable()) {
                this.field_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setField(int index, FieldDescriptorProto value) {
            value.getClass();
            this.ensureFieldIsMutable();
            this.field_.set(index, value);
        }

        private void addField(FieldDescriptorProto value) {
            value.getClass();
            this.ensureFieldIsMutable();
            this.field_.add(value);
        }

        private void addField(int index, FieldDescriptorProto value) {
            value.getClass();
            this.ensureFieldIsMutable();
            this.field_.add(index, value);
        }

        private void addAllField(Iterable<? extends FieldDescriptorProto> values) {
            this.ensureFieldIsMutable();
            AbstractMessageLite.addAll(values, this.field_);
        }

        private void clearField() {
            this.field_ = DescriptorProto.emptyProtobufList();
        }

        private void removeField(int index) {
            this.ensureFieldIsMutable();
            this.field_.remove(index);
        }

        @Override
        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override
        public FieldDescriptorProto getExtension(int index) {
            return (FieldDescriptorProto)this.extension_.get(index);
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int index) {
            return (FieldDescriptorProtoOrBuilder)this.extension_.get(index);
        }

        private void ensureExtensionIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> tmp = this.extension_;
            if (!tmp.isModifiable()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setExtension(int index, FieldDescriptorProto value) {
            value.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.set(index, value);
        }

        private void addExtension(FieldDescriptorProto value) {
            value.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(value);
        }

        private void addExtension(int index, FieldDescriptorProto value) {
            value.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(index, value);
        }

        private void addAllExtension(Iterable<? extends FieldDescriptorProto> values) {
            this.ensureExtensionIsMutable();
            AbstractMessageLite.addAll(values, this.extension_);
        }

        private void clearExtension() {
            this.extension_ = DescriptorProto.emptyProtobufList();
        }

        private void removeExtension(int index) {
            this.ensureExtensionIsMutable();
            this.extension_.remove(index);
        }

        @Override
        public List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        @Override
        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        @Override
        public DescriptorProto getNestedType(int index) {
            return (DescriptorProto)this.nestedType_.get(index);
        }

        public DescriptorProtoOrBuilder getNestedTypeOrBuilder(int index) {
            return (DescriptorProtoOrBuilder)this.nestedType_.get(index);
        }

        private void ensureNestedTypeIsMutable() {
            Internal.ProtobufList<DescriptorProto> tmp = this.nestedType_;
            if (!tmp.isModifiable()) {
                this.nestedType_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setNestedType(int index, DescriptorProto value) {
            value.getClass();
            this.ensureNestedTypeIsMutable();
            this.nestedType_.set(index, value);
        }

        private void addNestedType(DescriptorProto value) {
            value.getClass();
            this.ensureNestedTypeIsMutable();
            this.nestedType_.add(value);
        }

        private void addNestedType(int index, DescriptorProto value) {
            value.getClass();
            this.ensureNestedTypeIsMutable();
            this.nestedType_.add(index, value);
        }

        private void addAllNestedType(Iterable<? extends DescriptorProto> values) {
            this.ensureNestedTypeIsMutable();
            AbstractMessageLite.addAll(values, this.nestedType_);
        }

        private void clearNestedType() {
            this.nestedType_ = DescriptorProto.emptyProtobufList();
        }

        private void removeNestedType(int index) {
            this.ensureNestedTypeIsMutable();
            this.nestedType_.remove(index);
        }

        @Override
        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override
        public EnumDescriptorProto getEnumType(int index) {
            return (EnumDescriptorProto)this.enumType_.get(index);
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int index) {
            return (EnumDescriptorProtoOrBuilder)this.enumType_.get(index);
        }

        private void ensureEnumTypeIsMutable() {
            Internal.ProtobufList<EnumDescriptorProto> tmp = this.enumType_;
            if (!tmp.isModifiable()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setEnumType(int index, EnumDescriptorProto value) {
            value.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.set(index, value);
        }

        private void addEnumType(EnumDescriptorProto value) {
            value.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(value);
        }

        private void addEnumType(int index, EnumDescriptorProto value) {
            value.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(index, value);
        }

        private void addAllEnumType(Iterable<? extends EnumDescriptorProto> values) {
            this.ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll(values, this.enumType_);
        }

        private void clearEnumType() {
            this.enumType_ = DescriptorProto.emptyProtobufList();
        }

        private void removeEnumType(int index) {
            this.ensureEnumTypeIsMutable();
            this.enumType_.remove(index);
        }

        @Override
        public List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        @Override
        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        @Override
        public ExtensionRange getExtensionRange(int index) {
            return (ExtensionRange)this.extensionRange_.get(index);
        }

        public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int index) {
            return (ExtensionRangeOrBuilder)this.extensionRange_.get(index);
        }

        private void ensureExtensionRangeIsMutable() {
            Internal.ProtobufList<ExtensionRange> tmp = this.extensionRange_;
            if (!tmp.isModifiable()) {
                this.extensionRange_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setExtensionRange(int index, ExtensionRange value) {
            value.getClass();
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.set(index, value);
        }

        private void addExtensionRange(ExtensionRange value) {
            value.getClass();
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.add(value);
        }

        private void addExtensionRange(int index, ExtensionRange value) {
            value.getClass();
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.add(index, value);
        }

        private void addAllExtensionRange(Iterable<? extends ExtensionRange> values) {
            this.ensureExtensionRangeIsMutable();
            AbstractMessageLite.addAll(values, this.extensionRange_);
        }

        private void clearExtensionRange() {
            this.extensionRange_ = DescriptorProto.emptyProtobufList();
        }

        private void removeExtensionRange(int index) {
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(index);
        }

        @Override
        public List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        @Override
        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        @Override
        public OneofDescriptorProto getOneofDecl(int index) {
            return (OneofDescriptorProto)this.oneofDecl_.get(index);
        }

        public OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int index) {
            return (OneofDescriptorProtoOrBuilder)this.oneofDecl_.get(index);
        }

        private void ensureOneofDeclIsMutable() {
            Internal.ProtobufList<OneofDescriptorProto> tmp = this.oneofDecl_;
            if (!tmp.isModifiable()) {
                this.oneofDecl_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setOneofDecl(int index, OneofDescriptorProto value) {
            value.getClass();
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.set(index, value);
        }

        private void addOneofDecl(OneofDescriptorProto value) {
            value.getClass();
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.add(value);
        }

        private void addOneofDecl(int index, OneofDescriptorProto value) {
            value.getClass();
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.add(index, value);
        }

        private void addAllOneofDecl(Iterable<? extends OneofDescriptorProto> values) {
            this.ensureOneofDeclIsMutable();
            AbstractMessageLite.addAll(values, this.oneofDecl_);
        }

        private void clearOneofDecl() {
            this.oneofDecl_ = DescriptorProto.emptyProtobufList();
        }

        private void removeOneofDecl(int index) {
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(index);
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MessageOptions getOptions() {
            return this.options_ == null ? MessageOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(MessageOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(MessageOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != MessageOptions.getDefaultInstance() ? (MessageOptions)((MessageOptions.Builder)MessageOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        @Override
        public List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public List<? extends ReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override
        public ReservedRange getReservedRange(int index) {
            return (ReservedRange)this.reservedRange_.get(index);
        }

        public ReservedRangeOrBuilder getReservedRangeOrBuilder(int index) {
            return (ReservedRangeOrBuilder)this.reservedRange_.get(index);
        }

        private void ensureReservedRangeIsMutable() {
            Internal.ProtobufList<ReservedRange> tmp = this.reservedRange_;
            if (!tmp.isModifiable()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setReservedRange(int index, ReservedRange value) {
            value.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.set(index, value);
        }

        private void addReservedRange(ReservedRange value) {
            value.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(value);
        }

        private void addReservedRange(int index, ReservedRange value) {
            value.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(index, value);
        }

        private void addAllReservedRange(Iterable<? extends ReservedRange> values) {
            this.ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll(values, this.reservedRange_);
        }

        private void clearReservedRange() {
            this.reservedRange_ = DescriptorProto.emptyProtobufList();
        }

        private void removeReservedRange(int index) {
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.remove(index);
        }

        @Override
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override
        public String getReservedName(int index) {
            return (String)this.reservedName_.get(index);
        }

        @Override
        public ByteString getReservedNameBytes(int index) {
            return ByteString.copyFromUtf8((String)this.reservedName_.get(index));
        }

        private void ensureReservedNameIsMutable() {
            Internal.ProtobufList<String> tmp = this.reservedName_;
            if (!tmp.isModifiable()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setReservedName(int index, String value) {
            value.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.set(index, value);
        }

        private void addReservedName(String value) {
            value.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(value);
        }

        private void addAllReservedName(Iterable<String> values) {
            this.ensureReservedNameIsMutable();
            AbstractMessageLite.addAll(values, this.reservedName_);
        }

        private void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addReservedNameBytes(ByteString value) {
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(value.toStringUtf8());
        }

        public static DescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return DescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return DescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DescriptorProto prototype) {
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
                    return new DescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"};
                    String info = "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001\u1008\u0000\u0002\u041b\u0003\u041b\u0004\u041b\u0005\u041b\u0006\u041b\u0007\u1409\u0001\b\u041b\t\u001b\n\u001a";
                    return DescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<DescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<DescriptorProto> clazz = DescriptorProto.class;
                    synchronized (DescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<DescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            DescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new DescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(DescriptorProto.class, defaultInstance);
        }

        public static final class ReservedRange
        extends GeneratedMessageLite<ReservedRange, Builder>
        implements ReservedRangeOrBuilder {
            private int bitField0_;
            public static final int START_FIELD_NUMBER = 1;
            private int start_;
            public static final int END_FIELD_NUMBER = 2;
            private int end_;
            private static final ReservedRange DEFAULT_INSTANCE;
            private static volatile Parser<ReservedRange> PARSER;

            private ReservedRange() {
            }

            @Override
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public int getStart() {
                return this.start_;
            }

            private void setStart(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            private void clearStart() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.start_ = 0;
            }

            @Override
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public int getEnd() {
                return this.end_;
            }

            private void setEnd(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            private void clearEnd() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.end_ = 0;
            }

            public static ReservedRange parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ReservedRange parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ReservedRange parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ReservedRange parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ReservedRange parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ReservedRange parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ReservedRange parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static ReservedRange parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static ReservedRange parseDelimitedFrom(InputStream input) throws IOException {
                return ReservedRange.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static ReservedRange parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return ReservedRange.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static ReservedRange parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static ReservedRange parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(ReservedRange prototype) {
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
                        return new ReservedRange();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "start_", "end_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001";
                        return ReservedRange.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<ReservedRange> parser = PARSER;
                        if (parser != null) return parser;
                        Class<ReservedRange> clazz = ReservedRange.class;
                        synchronized (ReservedRange.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<ReservedRange>(DEFAULT_INSTANCE);
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

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<ReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                ReservedRange defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new ReservedRange();
                GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<ReservedRange, Builder>
            implements ReservedRangeOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasStart() {
                    return ((ReservedRange)this.instance).hasStart();
                }

                @Override
                public int getStart() {
                    return ((ReservedRange)this.instance).getStart();
                }

                public Builder setStart(int value) {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).setStart(value);
                    return this;
                }

                public Builder clearStart() {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).clearStart();
                    return this;
                }

                @Override
                public boolean hasEnd() {
                    return ((ReservedRange)this.instance).hasEnd();
                }

                @Override
                public int getEnd() {
                    return ((ReservedRange)this.instance).getEnd();
                }

                public Builder setEnd(int value) {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).setEnd(value);
                    return this;
                }

                public Builder clearEnd() {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).clearEnd();
                    return this;
                }
            }
        }

        public static final class ExtensionRange
        extends GeneratedMessageLite<ExtensionRange, Builder>
        implements ExtensionRangeOrBuilder {
            private int bitField0_;
            public static final int START_FIELD_NUMBER = 1;
            private int start_;
            public static final int END_FIELD_NUMBER = 2;
            private int end_;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private ExtensionRangeOptions options_;
            private byte memoizedIsInitialized = (byte)2;
            private static final ExtensionRange DEFAULT_INSTANCE;
            private static volatile Parser<ExtensionRange> PARSER;

            private ExtensionRange() {
            }

            @Override
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public int getStart() {
                return this.start_;
            }

            private void setStart(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            private void clearStart() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.start_ = 0;
            }

            @Override
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public int getEnd() {
                return this.end_;
            }

            private void setEnd(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            private void clearEnd() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.end_ = 0;
            }

            @Override
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override
            public ExtensionRangeOptions getOptions() {
                return this.options_ == null ? ExtensionRangeOptions.getDefaultInstance() : this.options_;
            }

            private void setOptions(ExtensionRangeOptions value) {
                value.getClass();
                this.options_ = value;
                this.bitField0_ |= 4;
            }

            private void mergeOptions(ExtensionRangeOptions value) {
                value.getClass();
                this.options_ = this.options_ != null && this.options_ != ExtensionRangeOptions.getDefaultInstance() ? (ExtensionRangeOptions)((ExtensionRangeOptions.Builder)ExtensionRangeOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
                this.bitField0_ |= 4;
            }

            private void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= 0xFFFFFFFB;
            }

            public static ExtensionRange parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ExtensionRange parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ExtensionRange parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ExtensionRange parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ExtensionRange parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ExtensionRange parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ExtensionRange parseFrom(InputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static ExtensionRange parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream input) throws IOException {
                return ExtensionRange.parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return ExtensionRange.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static ExtensionRange parseFrom(CodedInputStream input) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static ExtensionRange parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(ExtensionRange prototype) {
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
                        return new ExtensionRange();
                    }
                    case NEW_BUILDER: {
                        return new Builder();
                    }
                    case BUILD_MESSAGE_INFO: {
                        Object[] objects = new Object[]{"bitField0_", "start_", "end_", "options_"};
                        String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002";
                        return ExtensionRange.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    }
                    case GET_DEFAULT_INSTANCE: {
                        return DEFAULT_INSTANCE;
                    }
                    case GET_PARSER: {
                        Parser<ExtensionRange> parser = PARSER;
                        if (parser != null) return parser;
                        Class<ExtensionRange> clazz = ExtensionRange.class;
                        synchronized (ExtensionRange.class) {
                            parser = PARSER;
                            if (parser != null) return parser;
                            PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<ExtensionRange>(DEFAULT_INSTANCE);
                            // ** MonitorExit[var5_7] (shouldn't be in output)
                            return parser;
                        }
                    }
                    case GET_MEMOIZED_IS_INITIALIZED: {
                        return this.memoizedIsInitialized;
                    }
                    case SET_MEMOIZED_IS_INITIALIZED: {
                        this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                        return null;
                    }
                }
                throw new UnsupportedOperationException();
            }

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<ExtensionRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                ExtensionRange defaultInstance;
                DEFAULT_INSTANCE = defaultInstance = new ExtensionRange();
                GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, defaultInstance);
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<ExtensionRange, Builder>
            implements ExtensionRangeOrBuilder {
                private Builder() {
                    super(DEFAULT_INSTANCE);
                }

                @Override
                public boolean hasStart() {
                    return ((ExtensionRange)this.instance).hasStart();
                }

                @Override
                public int getStart() {
                    return ((ExtensionRange)this.instance).getStart();
                }

                public Builder setStart(int value) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setStart(value);
                    return this;
                }

                public Builder clearStart() {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).clearStart();
                    return this;
                }

                @Override
                public boolean hasEnd() {
                    return ((ExtensionRange)this.instance).hasEnd();
                }

                @Override
                public int getEnd() {
                    return ((ExtensionRange)this.instance).getEnd();
                }

                public Builder setEnd(int value) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setEnd(value);
                    return this;
                }

                public Builder clearEnd() {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).clearEnd();
                    return this;
                }

                @Override
                public boolean hasOptions() {
                    return ((ExtensionRange)this.instance).hasOptions();
                }

                @Override
                public ExtensionRangeOptions getOptions() {
                    return ((ExtensionRange)this.instance).getOptions();
                }

                public Builder setOptions(ExtensionRangeOptions value) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setOptions(value);
                    return this;
                }

                public Builder setOptions(ExtensionRangeOptions.Builder builderForValue) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setOptions((ExtensionRangeOptions)builderForValue.build());
                    return this;
                }

                public Builder mergeOptions(ExtensionRangeOptions value) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).mergeOptions(value);
                    return this;
                }

                public Builder clearOptions() {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).clearOptions();
                    return this;
                }
            }
        }

        public static interface ExtensionRangeOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasStart();

            public int getStart();

            public boolean hasEnd();

            public int getEnd();

            public boolean hasOptions();

            public ExtensionRangeOptions getOptions();
        }

        public static interface ReservedRangeOrBuilder
        extends MessageLiteOrBuilder {
            public boolean hasStart();

            public int getStart();

            public boolean hasEnd();

            public int getEnd();
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<DescriptorProto, Builder>
        implements DescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((DescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((DescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((DescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public List<FieldDescriptorProto> getFieldList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getFieldList());
            }

            @Override
            public int getFieldCount() {
                return ((DescriptorProto)this.instance).getFieldCount();
            }

            @Override
            public FieldDescriptorProto getField(int index) {
                return ((DescriptorProto)this.instance).getField(index);
            }

            public Builder setField(int index, FieldDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setField(index, value);
                return this;
            }

            public Builder setField(int index, FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setField(index, (FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addField(FieldDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(value);
                return this;
            }

            public Builder addField(int index, FieldDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(index, value);
                return this;
            }

            public Builder addField(FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField((FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addField(int index, FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(index, (FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllField(Iterable<? extends FieldDescriptorProto> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllField(values);
                return this;
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearField();
                return this;
            }

            public Builder removeField(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeField(index);
                return this;
            }

            @Override
            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getExtensionList());
            }

            @Override
            public int getExtensionCount() {
                return ((DescriptorProto)this.instance).getExtensionCount();
            }

            @Override
            public FieldDescriptorProto getExtension(int index) {
                return ((DescriptorProto)this.instance).getExtension(index);
            }

            public Builder setExtension(int index, FieldDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtension(index, value);
                return this;
            }

            public Builder setExtension(int index, FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtension(index, (FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addExtension(FieldDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(value);
                return this;
            }

            public Builder addExtension(int index, FieldDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(index, value);
                return this;
            }

            public Builder addExtension(FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension((FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addExtension(int index, FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(index, (FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllExtension(values);
                return this;
            }

            public Builder clearExtension() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearExtension();
                return this;
            }

            public Builder removeExtension(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeExtension(index);
                return this;
            }

            @Override
            public List<DescriptorProto> getNestedTypeList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getNestedTypeList());
            }

            @Override
            public int getNestedTypeCount() {
                return ((DescriptorProto)this.instance).getNestedTypeCount();
            }

            @Override
            public DescriptorProto getNestedType(int index) {
                return ((DescriptorProto)this.instance).getNestedType(index);
            }

            public Builder setNestedType(int index, DescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setNestedType(index, value);
                return this;
            }

            public Builder setNestedType(int index, Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setNestedType(index, (DescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addNestedType(DescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(value);
                return this;
            }

            public Builder addNestedType(int index, DescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(index, value);
                return this;
            }

            public Builder addNestedType(Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType((DescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addNestedType(int index, Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(index, (DescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllNestedType(Iterable<? extends DescriptorProto> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllNestedType(values);
                return this;
            }

            public Builder clearNestedType() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearNestedType();
                return this;
            }

            public Builder removeNestedType(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeNestedType(index);
                return this;
            }

            @Override
            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getEnumTypeList());
            }

            @Override
            public int getEnumTypeCount() {
                return ((DescriptorProto)this.instance).getEnumTypeCount();
            }

            @Override
            public EnumDescriptorProto getEnumType(int index) {
                return ((DescriptorProto)this.instance).getEnumType(index);
            }

            public Builder setEnumType(int index, EnumDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setEnumType(index, value);
                return this;
            }

            public Builder setEnumType(int index, EnumDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setEnumType(index, (EnumDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(value);
                return this;
            }

            public Builder addEnumType(int index, EnumDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(index, value);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType((EnumDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addEnumType(int index, EnumDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(index, (EnumDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllEnumType(values);
                return this;
            }

            public Builder clearEnumType() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearEnumType();
                return this;
            }

            public Builder removeEnumType(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeEnumType(index);
                return this;
            }

            @Override
            public List<ExtensionRange> getExtensionRangeList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getExtensionRangeList());
            }

            @Override
            public int getExtensionRangeCount() {
                return ((DescriptorProto)this.instance).getExtensionRangeCount();
            }

            @Override
            public ExtensionRange getExtensionRange(int index) {
                return ((DescriptorProto)this.instance).getExtensionRange(index);
            }

            public Builder setExtensionRange(int index, ExtensionRange value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtensionRange(index, value);
                return this;
            }

            public Builder setExtensionRange(int index, ExtensionRange.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtensionRange(index, (ExtensionRange)builderForValue.build());
                return this;
            }

            public Builder addExtensionRange(ExtensionRange value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(value);
                return this;
            }

            public Builder addExtensionRange(int index, ExtensionRange value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(index, value);
                return this;
            }

            public Builder addExtensionRange(ExtensionRange.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange((ExtensionRange)builderForValue.build());
                return this;
            }

            public Builder addExtensionRange(int index, ExtensionRange.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(index, (ExtensionRange)builderForValue.build());
                return this;
            }

            public Builder addAllExtensionRange(Iterable<? extends ExtensionRange> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllExtensionRange(values);
                return this;
            }

            public Builder clearExtensionRange() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearExtensionRange();
                return this;
            }

            public Builder removeExtensionRange(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeExtensionRange(index);
                return this;
            }

            @Override
            public List<OneofDescriptorProto> getOneofDeclList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getOneofDeclList());
            }

            @Override
            public int getOneofDeclCount() {
                return ((DescriptorProto)this.instance).getOneofDeclCount();
            }

            @Override
            public OneofDescriptorProto getOneofDecl(int index) {
                return ((DescriptorProto)this.instance).getOneofDecl(index);
            }

            public Builder setOneofDecl(int index, OneofDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOneofDecl(index, value);
                return this;
            }

            public Builder setOneofDecl(int index, OneofDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOneofDecl(index, (OneofDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(value);
                return this;
            }

            public Builder addOneofDecl(int index, OneofDescriptorProto value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(index, value);
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl((OneofDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addOneofDecl(int index, OneofDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(index, (OneofDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllOneofDecl(Iterable<? extends OneofDescriptorProto> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllOneofDecl(values);
                return this;
            }

            public Builder clearOneofDecl() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearOneofDecl();
                return this;
            }

            public Builder removeOneofDecl(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeOneofDecl(index);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((DescriptorProto)this.instance).hasOptions();
            }

            @Override
            public MessageOptions getOptions() {
                return ((DescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(MessageOptions value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MessageOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOptions((MessageOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MessageOptions value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override
            public List<ReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getReservedRangeList());
            }

            @Override
            public int getReservedRangeCount() {
                return ((DescriptorProto)this.instance).getReservedRangeCount();
            }

            @Override
            public ReservedRange getReservedRange(int index) {
                return ((DescriptorProto)this.instance).getReservedRange(index);
            }

            public Builder setReservedRange(int index, ReservedRange value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setReservedRange(index, value);
                return this;
            }

            public Builder setReservedRange(int index, ReservedRange.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setReservedRange(index, (ReservedRange)builderForValue.build());
                return this;
            }

            public Builder addReservedRange(ReservedRange value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(value);
                return this;
            }

            public Builder addReservedRange(int index, ReservedRange value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(index, value);
                return this;
            }

            public Builder addReservedRange(ReservedRange.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange((ReservedRange)builderForValue.build());
                return this;
            }

            public Builder addReservedRange(int index, ReservedRange.Builder builderForValue) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(index, (ReservedRange)builderForValue.build());
                return this;
            }

            public Builder addAllReservedRange(Iterable<? extends ReservedRange> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllReservedRange(values);
                return this;
            }

            public Builder clearReservedRange() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearReservedRange();
                return this;
            }

            public Builder removeReservedRange(int index) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeReservedRange(index);
                return this;
            }

            @Override
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((DescriptorProto)this.instance).getReservedNameList());
            }

            @Override
            public int getReservedNameCount() {
                return ((DescriptorProto)this.instance).getReservedNameCount();
            }

            @Override
            public String getReservedName(int index) {
                return ((DescriptorProto)this.instance).getReservedName(index);
            }

            @Override
            public ByteString getReservedNameBytes(int index) {
                return ((DescriptorProto)this.instance).getReservedNameBytes(index);
            }

            public Builder setReservedName(int index, String value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setReservedName(index, value);
                return this;
            }

            public Builder addReservedName(String value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedName(value);
                return this;
            }

            public Builder addAllReservedName(Iterable<String> values) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllReservedName(values);
                return this;
            }

            public Builder clearReservedName() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearReservedName();
                return this;
            }

            public Builder addReservedNameBytes(ByteString value) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedNameBytes(value);
                return this;
            }
        }
    }

    public static interface DescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public List<FieldDescriptorProto> getFieldList();

        public FieldDescriptorProto getField(int var1);

        public int getFieldCount();

        public List<FieldDescriptorProto> getExtensionList();

        public FieldDescriptorProto getExtension(int var1);

        public int getExtensionCount();

        public List<DescriptorProto> getNestedTypeList();

        public DescriptorProto getNestedType(int var1);

        public int getNestedTypeCount();

        public List<EnumDescriptorProto> getEnumTypeList();

        public EnumDescriptorProto getEnumType(int var1);

        public int getEnumTypeCount();

        public List<DescriptorProto.ExtensionRange> getExtensionRangeList();

        public DescriptorProto.ExtensionRange getExtensionRange(int var1);

        public int getExtensionRangeCount();

        public List<OneofDescriptorProto> getOneofDeclList();

        public OneofDescriptorProto getOneofDecl(int var1);

        public int getOneofDeclCount();

        public boolean hasOptions();

        public MessageOptions getOptions();

        public List<DescriptorProto.ReservedRange> getReservedRangeList();

        public DescriptorProto.ReservedRange getReservedRange(int var1);

        public int getReservedRangeCount();

        public List<String> getReservedNameList();

        public int getReservedNameCount();

        public String getReservedName(int var1);

        public ByteString getReservedNameBytes(int var1);
    }

    public static final class FileDescriptorProto
    extends GeneratedMessageLite<FileDescriptorProto, Builder>
    implements FileDescriptorProtoOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private String package_ = "";
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        private Internal.ProtobufList<String> dependency_;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        private Internal.IntList publicDependency_;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private Internal.IntList weakDependency_;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        private Internal.ProtobufList<DescriptorProto> messageType_;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        private Internal.ProtobufList<EnumDescriptorProto> enumType_;
        public static final int SERVICE_FIELD_NUMBER = 6;
        private Internal.ProtobufList<ServiceDescriptorProto> service_;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        private Internal.ProtobufList<FieldDescriptorProto> extension_;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private FileOptions options_;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        private SourceCodeInfo sourceCodeInfo_;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        private String syntax_ = "";
        public static final int EDITION_FIELD_NUMBER = 14;
        private int edition_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FileDescriptorProto DEFAULT_INSTANCE;
        private static volatile Parser<FileDescriptorProto> PARSER;

        private FileDescriptorProto() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
            this.publicDependency_ = FileDescriptorProto.emptyIntList();
            this.weakDependency_ = FileDescriptorProto.emptyIntList();
            this.messageType_ = FileDescriptorProto.emptyProtobufList();
            this.enumType_ = FileDescriptorProto.emptyProtobufList();
            this.service_ = FileDescriptorProto.emptyProtobufList();
            this.extension_ = FileDescriptorProto.emptyProtobufList();
        }

        @Override
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
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
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.name_ = FileDescriptorProto.getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getPackage() {
            return this.package_;
        }

        @Override
        public ByteString getPackageBytes() {
            return ByteString.copyFromUtf8(this.package_);
        }

        private void setPackage(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.package_ = value;
        }

        private void clearPackage() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.package_ = FileDescriptorProto.getDefaultInstance().getPackage();
        }

        private void setPackageBytes(ByteString value) {
            this.package_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override
        public List<String> getDependencyList() {
            return this.dependency_;
        }

        @Override
        public int getDependencyCount() {
            return this.dependency_.size();
        }

        @Override
        public String getDependency(int index) {
            return (String)this.dependency_.get(index);
        }

        @Override
        public ByteString getDependencyBytes(int index) {
            return ByteString.copyFromUtf8((String)this.dependency_.get(index));
        }

        private void ensureDependencyIsMutable() {
            Internal.ProtobufList<String> tmp = this.dependency_;
            if (!tmp.isModifiable()) {
                this.dependency_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setDependency(int index, String value) {
            value.getClass();
            this.ensureDependencyIsMutable();
            this.dependency_.set(index, value);
        }

        private void addDependency(String value) {
            value.getClass();
            this.ensureDependencyIsMutable();
            this.dependency_.add(value);
        }

        private void addAllDependency(Iterable<String> values) {
            this.ensureDependencyIsMutable();
            AbstractMessageLite.addAll(values, this.dependency_);
        }

        private void clearDependency() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addDependencyBytes(ByteString value) {
            this.ensureDependencyIsMutable();
            this.dependency_.add(value.toStringUtf8());
        }

        @Override
        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override
        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        @Override
        public int getPublicDependency(int index) {
            return this.publicDependency_.getInt(index);
        }

        private void ensurePublicDependencyIsMutable() {
            Internal.IntList tmp = this.publicDependency_;
            if (!tmp.isModifiable()) {
                this.publicDependency_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setPublicDependency(int index, int value) {
            this.ensurePublicDependencyIsMutable();
            this.publicDependency_.setInt(index, value);
        }

        private void addPublicDependency(int value) {
            this.ensurePublicDependencyIsMutable();
            this.publicDependency_.addInt(value);
        }

        private void addAllPublicDependency(Iterable<? extends Integer> values) {
            this.ensurePublicDependencyIsMutable();
            AbstractMessageLite.addAll(values, this.publicDependency_);
        }

        private void clearPublicDependency() {
            this.publicDependency_ = FileDescriptorProto.emptyIntList();
        }

        @Override
        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        @Override
        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        @Override
        public int getWeakDependency(int index) {
            return this.weakDependency_.getInt(index);
        }

        private void ensureWeakDependencyIsMutable() {
            Internal.IntList tmp = this.weakDependency_;
            if (!tmp.isModifiable()) {
                this.weakDependency_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setWeakDependency(int index, int value) {
            this.ensureWeakDependencyIsMutable();
            this.weakDependency_.setInt(index, value);
        }

        private void addWeakDependency(int value) {
            this.ensureWeakDependencyIsMutable();
            this.weakDependency_.addInt(value);
        }

        private void addAllWeakDependency(Iterable<? extends Integer> values) {
            this.ensureWeakDependencyIsMutable();
            AbstractMessageLite.addAll(values, this.weakDependency_);
        }

        private void clearWeakDependency() {
            this.weakDependency_ = FileDescriptorProto.emptyIntList();
        }

        @Override
        public List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        @Override
        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        @Override
        public DescriptorProto getMessageType(int index) {
            return (DescriptorProto)this.messageType_.get(index);
        }

        public DescriptorProtoOrBuilder getMessageTypeOrBuilder(int index) {
            return (DescriptorProtoOrBuilder)this.messageType_.get(index);
        }

        private void ensureMessageTypeIsMutable() {
            Internal.ProtobufList<DescriptorProto> tmp = this.messageType_;
            if (!tmp.isModifiable()) {
                this.messageType_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setMessageType(int index, DescriptorProto value) {
            value.getClass();
            this.ensureMessageTypeIsMutable();
            this.messageType_.set(index, value);
        }

        private void addMessageType(DescriptorProto value) {
            value.getClass();
            this.ensureMessageTypeIsMutable();
            this.messageType_.add(value);
        }

        private void addMessageType(int index, DescriptorProto value) {
            value.getClass();
            this.ensureMessageTypeIsMutable();
            this.messageType_.add(index, value);
        }

        private void addAllMessageType(Iterable<? extends DescriptorProto> values) {
            this.ensureMessageTypeIsMutable();
            AbstractMessageLite.addAll(values, this.messageType_);
        }

        private void clearMessageType() {
            this.messageType_ = FileDescriptorProto.emptyProtobufList();
        }

        private void removeMessageType(int index) {
            this.ensureMessageTypeIsMutable();
            this.messageType_.remove(index);
        }

        @Override
        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override
        public EnumDescriptorProto getEnumType(int index) {
            return (EnumDescriptorProto)this.enumType_.get(index);
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int index) {
            return (EnumDescriptorProtoOrBuilder)this.enumType_.get(index);
        }

        private void ensureEnumTypeIsMutable() {
            Internal.ProtobufList<EnumDescriptorProto> tmp = this.enumType_;
            if (!tmp.isModifiable()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setEnumType(int index, EnumDescriptorProto value) {
            value.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.set(index, value);
        }

        private void addEnumType(EnumDescriptorProto value) {
            value.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(value);
        }

        private void addEnumType(int index, EnumDescriptorProto value) {
            value.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(index, value);
        }

        private void addAllEnumType(Iterable<? extends EnumDescriptorProto> values) {
            this.ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll(values, this.enumType_);
        }

        private void clearEnumType() {
            this.enumType_ = FileDescriptorProto.emptyProtobufList();
        }

        private void removeEnumType(int index) {
            this.ensureEnumTypeIsMutable();
            this.enumType_.remove(index);
        }

        @Override
        public List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
            return this.service_;
        }

        @Override
        public int getServiceCount() {
            return this.service_.size();
        }

        @Override
        public ServiceDescriptorProto getService(int index) {
            return (ServiceDescriptorProto)this.service_.get(index);
        }

        public ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int index) {
            return (ServiceDescriptorProtoOrBuilder)this.service_.get(index);
        }

        private void ensureServiceIsMutable() {
            Internal.ProtobufList<ServiceDescriptorProto> tmp = this.service_;
            if (!tmp.isModifiable()) {
                this.service_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setService(int index, ServiceDescriptorProto value) {
            value.getClass();
            this.ensureServiceIsMutable();
            this.service_.set(index, value);
        }

        private void addService(ServiceDescriptorProto value) {
            value.getClass();
            this.ensureServiceIsMutable();
            this.service_.add(value);
        }

        private void addService(int index, ServiceDescriptorProto value) {
            value.getClass();
            this.ensureServiceIsMutable();
            this.service_.add(index, value);
        }

        private void addAllService(Iterable<? extends ServiceDescriptorProto> values) {
            this.ensureServiceIsMutable();
            AbstractMessageLite.addAll(values, this.service_);
        }

        private void clearService() {
            this.service_ = FileDescriptorProto.emptyProtobufList();
        }

        private void removeService(int index) {
            this.ensureServiceIsMutable();
            this.service_.remove(index);
        }

        @Override
        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override
        public FieldDescriptorProto getExtension(int index) {
            return (FieldDescriptorProto)this.extension_.get(index);
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int index) {
            return (FieldDescriptorProtoOrBuilder)this.extension_.get(index);
        }

        private void ensureExtensionIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> tmp = this.extension_;
            if (!tmp.isModifiable()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setExtension(int index, FieldDescriptorProto value) {
            value.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.set(index, value);
        }

        private void addExtension(FieldDescriptorProto value) {
            value.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(value);
        }

        private void addExtension(int index, FieldDescriptorProto value) {
            value.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(index, value);
        }

        private void addAllExtension(Iterable<? extends FieldDescriptorProto> values) {
            this.ensureExtensionIsMutable();
            AbstractMessageLite.addAll(values, this.extension_);
        }

        private void clearExtension() {
            this.extension_ = FileDescriptorProto.emptyProtobufList();
        }

        private void removeExtension(int index) {
            this.ensureExtensionIsMutable();
            this.extension_.remove(index);
        }

        @Override
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public FileOptions getOptions() {
            return this.options_ == null ? FileOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(FileOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 4;
        }

        private void mergeOptions(FileOptions value) {
            value.getClass();
            this.options_ = this.options_ != null && this.options_ != FileOptions.getDefaultInstance() ? (FileOptions)((FileOptions.Builder)FileOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 4;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFFFB;
        }

        @Override
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public SourceCodeInfo getSourceCodeInfo() {
            return this.sourceCodeInfo_ == null ? SourceCodeInfo.getDefaultInstance() : this.sourceCodeInfo_;
        }

        private void setSourceCodeInfo(SourceCodeInfo value) {
            value.getClass();
            this.sourceCodeInfo_ = value;
            this.bitField0_ |= 8;
        }

        private void mergeSourceCodeInfo(SourceCodeInfo value) {
            value.getClass();
            this.sourceCodeInfo_ = this.sourceCodeInfo_ != null && this.sourceCodeInfo_ != SourceCodeInfo.getDefaultInstance() ? (SourceCodeInfo)((SourceCodeInfo.Builder)SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom(value)).buildPartial() : value;
            this.bitField0_ |= 8;
        }

        private void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= 0xFFFFFFF7;
        }

        @Override
        public boolean hasSyntax() {
            return (this.bitField0_ & 0x10) != 0;
        }

        @Override
        public String getSyntax() {
            return this.syntax_;
        }

        @Override
        public ByteString getSyntaxBytes() {
            return ByteString.copyFromUtf8(this.syntax_);
        }

        private void setSyntax(String value) {
            value.getClass();
            this.bitField0_ |= 0x10;
            this.syntax_ = value;
        }

        private void clearSyntax() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.syntax_ = FileDescriptorProto.getDefaultInstance().getSyntax();
        }

        private void setSyntaxBytes(ByteString value) {
            this.syntax_ = value.toStringUtf8();
            this.bitField0_ |= 0x10;
        }

        @Override
        public boolean hasEdition() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override
        public Edition getEdition() {
            Edition result = Edition.forNumber(this.edition_);
            return result == null ? Edition.EDITION_UNKNOWN : result;
        }

        private void setEdition(Edition value) {
            this.edition_ = value.getNumber();
            this.bitField0_ |= 0x20;
        }

        private void clearEdition() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.edition_ = 0;
        }

        public static FileDescriptorProto parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileDescriptorProto parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileDescriptorProto parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileDescriptorProto parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileDescriptorProto parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileDescriptorProto parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileDescriptorProto parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream input) throws IOException {
            return FileDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FileDescriptorProto.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FileDescriptorProto prototype) {
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
                    return new FileDescriptorProto();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", Edition.internalGetVerifier()};
                    String info = "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0007\u0006\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001a\u0004\u041b\u0005\u041b\u0006\u041b\u0007\u041b\b\u1409\u0002\t\u1409\u0003\n\u0016\u000b\u0016\f\u1008\u0004\u000e\u180c\u0005";
                    return FileDescriptorProto.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FileDescriptorProto> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FileDescriptorProto> clazz = FileDescriptorProto.class;
                    synchronized (FileDescriptorProto.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FileDescriptorProto>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FileDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FileDescriptorProto defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new FileDescriptorProto();
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorProto.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FileDescriptorProto, Builder>
        implements FileDescriptorProtoOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public boolean hasName() {
                return ((FileDescriptorProto)this.instance).hasName();
            }

            @Override
            public String getName() {
                return ((FileDescriptorProto)this.instance).getName();
            }

            @Override
            public ByteString getNameBytes() {
                return ((FileDescriptorProto)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setNameBytes(value);
                return this;
            }

            @Override
            public boolean hasPackage() {
                return ((FileDescriptorProto)this.instance).hasPackage();
            }

            @Override
            public String getPackage() {
                return ((FileDescriptorProto)this.instance).getPackage();
            }

            @Override
            public ByteString getPackageBytes() {
                return ((FileDescriptorProto)this.instance).getPackageBytes();
            }

            public Builder setPackage(String value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setPackage(value);
                return this;
            }

            public Builder clearPackage() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearPackage();
                return this;
            }

            public Builder setPackageBytes(ByteString value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setPackageBytes(value);
                return this;
            }

            @Override
            public List<String> getDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getDependencyList());
            }

            @Override
            public int getDependencyCount() {
                return ((FileDescriptorProto)this.instance).getDependencyCount();
            }

            @Override
            public String getDependency(int index) {
                return ((FileDescriptorProto)this.instance).getDependency(index);
            }

            @Override
            public ByteString getDependencyBytes(int index) {
                return ((FileDescriptorProto)this.instance).getDependencyBytes(index);
            }

            public Builder setDependency(int index, String value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setDependency(index, value);
                return this;
            }

            public Builder addDependency(String value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addDependency(value);
                return this;
            }

            public Builder addAllDependency(Iterable<String> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllDependency(values);
                return this;
            }

            public Builder clearDependency() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearDependency();
                return this;
            }

            public Builder addDependencyBytes(ByteString value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addDependencyBytes(value);
                return this;
            }

            @Override
            public List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getPublicDependencyList());
            }

            @Override
            public int getPublicDependencyCount() {
                return ((FileDescriptorProto)this.instance).getPublicDependencyCount();
            }

            @Override
            public int getPublicDependency(int index) {
                return ((FileDescriptorProto)this.instance).getPublicDependency(index);
            }

            public Builder setPublicDependency(int index, int value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setPublicDependency(index, value);
                return this;
            }

            public Builder addPublicDependency(int value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addPublicDependency(value);
                return this;
            }

            public Builder addAllPublicDependency(Iterable<? extends Integer> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllPublicDependency(values);
                return this;
            }

            public Builder clearPublicDependency() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearPublicDependency();
                return this;
            }

            @Override
            public List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getWeakDependencyList());
            }

            @Override
            public int getWeakDependencyCount() {
                return ((FileDescriptorProto)this.instance).getWeakDependencyCount();
            }

            @Override
            public int getWeakDependency(int index) {
                return ((FileDescriptorProto)this.instance).getWeakDependency(index);
            }

            public Builder setWeakDependency(int index, int value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setWeakDependency(index, value);
                return this;
            }

            public Builder addWeakDependency(int value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addWeakDependency(value);
                return this;
            }

            public Builder addAllWeakDependency(Iterable<? extends Integer> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllWeakDependency(values);
                return this;
            }

            public Builder clearWeakDependency() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearWeakDependency();
                return this;
            }

            @Override
            public List<DescriptorProto> getMessageTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getMessageTypeList());
            }

            @Override
            public int getMessageTypeCount() {
                return ((FileDescriptorProto)this.instance).getMessageTypeCount();
            }

            @Override
            public DescriptorProto getMessageType(int index) {
                return ((FileDescriptorProto)this.instance).getMessageType(index);
            }

            public Builder setMessageType(int index, DescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setMessageType(index, value);
                return this;
            }

            public Builder setMessageType(int index, DescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setMessageType(index, (DescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addMessageType(DescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(value);
                return this;
            }

            public Builder addMessageType(int index, DescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(index, value);
                return this;
            }

            public Builder addMessageType(DescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType((DescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addMessageType(int index, DescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(index, (DescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllMessageType(Iterable<? extends DescriptorProto> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllMessageType(values);
                return this;
            }

            public Builder clearMessageType() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearMessageType();
                return this;
            }

            public Builder removeMessageType(int index) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeMessageType(index);
                return this;
            }

            @Override
            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getEnumTypeList());
            }

            @Override
            public int getEnumTypeCount() {
                return ((FileDescriptorProto)this.instance).getEnumTypeCount();
            }

            @Override
            public EnumDescriptorProto getEnumType(int index) {
                return ((FileDescriptorProto)this.instance).getEnumType(index);
            }

            public Builder setEnumType(int index, EnumDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setEnumType(index, value);
                return this;
            }

            public Builder setEnumType(int index, EnumDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setEnumType(index, (EnumDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(value);
                return this;
            }

            public Builder addEnumType(int index, EnumDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(index, value);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType((EnumDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addEnumType(int index, EnumDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(index, (EnumDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllEnumType(values);
                return this;
            }

            public Builder clearEnumType() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearEnumType();
                return this;
            }

            public Builder removeEnumType(int index) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeEnumType(index);
                return this;
            }

            @Override
            public List<ServiceDescriptorProto> getServiceList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getServiceList());
            }

            @Override
            public int getServiceCount() {
                return ((FileDescriptorProto)this.instance).getServiceCount();
            }

            @Override
            public ServiceDescriptorProto getService(int index) {
                return ((FileDescriptorProto)this.instance).getService(index);
            }

            public Builder setService(int index, ServiceDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setService(index, value);
                return this;
            }

            public Builder setService(int index, ServiceDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setService(index, (ServiceDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addService(ServiceDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(value);
                return this;
            }

            public Builder addService(int index, ServiceDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(index, value);
                return this;
            }

            public Builder addService(ServiceDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService((ServiceDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addService(int index, ServiceDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(index, (ServiceDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllService(Iterable<? extends ServiceDescriptorProto> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllService(values);
                return this;
            }

            public Builder clearService() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearService();
                return this;
            }

            public Builder removeService(int index) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeService(index);
                return this;
            }

            @Override
            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((FileDescriptorProto)this.instance).getExtensionList());
            }

            @Override
            public int getExtensionCount() {
                return ((FileDescriptorProto)this.instance).getExtensionCount();
            }

            @Override
            public FieldDescriptorProto getExtension(int index) {
                return ((FileDescriptorProto)this.instance).getExtension(index);
            }

            public Builder setExtension(int index, FieldDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setExtension(index, value);
                return this;
            }

            public Builder setExtension(int index, FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setExtension(index, (FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addExtension(FieldDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(value);
                return this;
            }

            public Builder addExtension(int index, FieldDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(index, value);
                return this;
            }

            public Builder addExtension(FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension((FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addExtension(int index, FieldDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(index, (FieldDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> values) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllExtension(values);
                return this;
            }

            public Builder clearExtension() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearExtension();
                return this;
            }

            public Builder removeExtension(int index) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeExtension(index);
                return this;
            }

            @Override
            public boolean hasOptions() {
                return ((FileDescriptorProto)this.instance).hasOptions();
            }

            @Override
            public FileOptions getOptions() {
                return ((FileDescriptorProto)this.instance).getOptions();
            }

            public Builder setOptions(FileOptions value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(FileOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setOptions((FileOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(FileOptions value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override
            public boolean hasSourceCodeInfo() {
                return ((FileDescriptorProto)this.instance).hasSourceCodeInfo();
            }

            @Override
            public SourceCodeInfo getSourceCodeInfo() {
                return ((FileDescriptorProto)this.instance).getSourceCodeInfo();
            }

            public Builder setSourceCodeInfo(SourceCodeInfo value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSourceCodeInfo(value);
                return this;
            }

            public Builder setSourceCodeInfo(SourceCodeInfo.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSourceCodeInfo((SourceCodeInfo)builderForValue.build());
                return this;
            }

            public Builder mergeSourceCodeInfo(SourceCodeInfo value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).mergeSourceCodeInfo(value);
                return this;
            }

            public Builder clearSourceCodeInfo() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearSourceCodeInfo();
                return this;
            }

            @Override
            public boolean hasSyntax() {
                return ((FileDescriptorProto)this.instance).hasSyntax();
            }

            @Override
            public String getSyntax() {
                return ((FileDescriptorProto)this.instance).getSyntax();
            }

            @Override
            public ByteString getSyntaxBytes() {
                return ((FileDescriptorProto)this.instance).getSyntaxBytes();
            }

            public Builder setSyntax(String value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSyntax(value);
                return this;
            }

            public Builder clearSyntax() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearSyntax();
                return this;
            }

            public Builder setSyntaxBytes(ByteString value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSyntaxBytes(value);
                return this;
            }

            @Override
            public boolean hasEdition() {
                return ((FileDescriptorProto)this.instance).hasEdition();
            }

            @Override
            public Edition getEdition() {
                return ((FileDescriptorProto)this.instance).getEdition();
            }

            public Builder setEdition(Edition value) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setEdition(value);
                return this;
            }

            public Builder clearEdition() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearEdition();
                return this;
            }
        }
    }

    public static interface FileDescriptorProtoOrBuilder
    extends MessageLiteOrBuilder {
        public boolean hasName();

        public String getName();

        public ByteString getNameBytes();

        public boolean hasPackage();

        public String getPackage();

        public ByteString getPackageBytes();

        public List<String> getDependencyList();

        public int getDependencyCount();

        public String getDependency(int var1);

        public ByteString getDependencyBytes(int var1);

        public List<Integer> getPublicDependencyList();

        public int getPublicDependencyCount();

        public int getPublicDependency(int var1);

        public List<Integer> getWeakDependencyList();

        public int getWeakDependencyCount();

        public int getWeakDependency(int var1);

        public List<DescriptorProto> getMessageTypeList();

        public DescriptorProto getMessageType(int var1);

        public int getMessageTypeCount();

        public List<EnumDescriptorProto> getEnumTypeList();

        public EnumDescriptorProto getEnumType(int var1);

        public int getEnumTypeCount();

        public List<ServiceDescriptorProto> getServiceList();

        public ServiceDescriptorProto getService(int var1);

        public int getServiceCount();

        public List<FieldDescriptorProto> getExtensionList();

        public FieldDescriptorProto getExtension(int var1);

        public int getExtensionCount();

        public boolean hasOptions();

        public FileOptions getOptions();

        public boolean hasSourceCodeInfo();

        public SourceCodeInfo getSourceCodeInfo();

        public boolean hasSyntax();

        public String getSyntax();

        public ByteString getSyntaxBytes();

        public boolean hasEdition();

        public Edition getEdition();
    }

    public static final class FileDescriptorSet
    extends GeneratedMessageLite.ExtendableMessage<FileDescriptorSet, Builder>
    implements FileDescriptorSetOrBuilder {
        public static final int FILE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<FileDescriptorProto> file_;
        private byte memoizedIsInitialized = (byte)2;
        private static final FileDescriptorSet DEFAULT_INSTANCE;
        private static volatile Parser<FileDescriptorSet> PARSER;

        private FileDescriptorSet() {
            this.file_ = FileDescriptorSet.emptyProtobufList();
        }

        @Override
        public List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        @Override
        public int getFileCount() {
            return this.file_.size();
        }

        @Override
        public FileDescriptorProto getFile(int index) {
            return (FileDescriptorProto)this.file_.get(index);
        }

        public FileDescriptorProtoOrBuilder getFileOrBuilder(int index) {
            return (FileDescriptorProtoOrBuilder)this.file_.get(index);
        }

        private void ensureFileIsMutable() {
            Internal.ProtobufList<FileDescriptorProto> tmp = this.file_;
            if (!tmp.isModifiable()) {
                this.file_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        private void setFile(int index, FileDescriptorProto value) {
            value.getClass();
            this.ensureFileIsMutable();
            this.file_.set(index, value);
        }

        private void addFile(FileDescriptorProto value) {
            value.getClass();
            this.ensureFileIsMutable();
            this.file_.add(value);
        }

        private void addFile(int index, FileDescriptorProto value) {
            value.getClass();
            this.ensureFileIsMutable();
            this.file_.add(index, value);
        }

        private void addAllFile(Iterable<? extends FileDescriptorProto> values) {
            this.ensureFileIsMutable();
            AbstractMessageLite.addAll(values, this.file_);
        }

        private void clearFile() {
            this.file_ = FileDescriptorSet.emptyProtobufList();
        }

        private void removeFile(int index) {
            this.ensureFileIsMutable();
            this.file_.remove(index);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileDescriptorSet parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileDescriptorSet parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileDescriptorSet parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileDescriptorSet parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileDescriptorSet parseFrom(InputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileDescriptorSet parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream input) throws IOException {
            return FileDescriptorSet.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return FileDescriptorSet.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FileDescriptorSet prototype) {
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
                    return new FileDescriptorSet();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects = new Object[]{"file_", FileDescriptorProto.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b";
                    return FileDescriptorSet.newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    Parser<FileDescriptorSet> parser = PARSER;
                    if (parser != null) return parser;
                    Class<FileDescriptorSet> clazz = FileDescriptorSet.class;
                    synchronized (FileDescriptorSet.class) {
                        parser = PARSER;
                        if (parser != null) return parser;
                        PARSER = parser = new GeneratedMessageLite.DefaultInstanceBasedParser<FileDescriptorSet>(DEFAULT_INSTANCE);
                        // ** MonitorExit[var5_7] (shouldn't be in output)
                        return parser;
                    }
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return this.memoizedIsInitialized;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    this.memoizedIsInitialized = (byte)(arg0 != null ? 1 : 0);
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        public static FileDescriptorSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FileDescriptorSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            FileDescriptorSet defaultInstance;
            DEFAULT_INSTANCE = defaultInstance = new FileDescriptorSet();
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorSet.class, defaultInstance);
        }

        public static final class Builder
        extends GeneratedMessageLite.ExtendableBuilder<FileDescriptorSet, Builder>
        implements FileDescriptorSetOrBuilder {
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            @Override
            public List<FileDescriptorProto> getFileList() {
                return Collections.unmodifiableList(((FileDescriptorSet)this.instance).getFileList());
            }

            @Override
            public int getFileCount() {
                return ((FileDescriptorSet)this.instance).getFileCount();
            }

            @Override
            public FileDescriptorProto getFile(int index) {
                return ((FileDescriptorSet)this.instance).getFile(index);
            }

            public Builder setFile(int index, FileDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).setFile(index, value);
                return this;
            }

            public Builder setFile(int index, FileDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).setFile(index, (FileDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addFile(FileDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(value);
                return this;
            }

            public Builder addFile(int index, FileDescriptorProto value) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(index, value);
                return this;
            }

            public Builder addFile(FileDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile((FileDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addFile(int index, FileDescriptorProto.Builder builderForValue) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(index, (FileDescriptorProto)builderForValue.build());
                return this;
            }

            public Builder addAllFile(Iterable<? extends FileDescriptorProto> values) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addAllFile(values);
                return this;
            }

            public Builder clearFile() {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).clearFile();
                return this;
            }

            public Builder removeFile(int index) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).removeFile(index);
                return this;
            }
        }
    }

    public static interface FileDescriptorSetOrBuilder
    extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileDescriptorSet, FileDescriptorSet.Builder> {
        public List<FileDescriptorProto> getFileList();

        public FileDescriptorProto getFile(int var1);

        public int getFileCount();
    }

    public static enum Edition implements Internal.EnumLite
    {
        EDITION_UNKNOWN(0),
        EDITION_LEGACY(900),
        EDITION_PROTO2(998),
        EDITION_PROTO3(999),
        EDITION_2023(1000),
        EDITION_2024(1001),
        EDITION_1_TEST_ONLY(1),
        EDITION_2_TEST_ONLY(2),
        EDITION_99997_TEST_ONLY(99997),
        EDITION_99998_TEST_ONLY(99998),
        EDITION_99999_TEST_ONLY(99999),
        EDITION_MAX(Integer.MAX_VALUE);

        public static final int EDITION_UNKNOWN_VALUE = 0;
        public static final int EDITION_LEGACY_VALUE = 900;
        public static final int EDITION_PROTO2_VALUE = 998;
        public static final int EDITION_PROTO3_VALUE = 999;
        public static final int EDITION_2023_VALUE = 1000;
        public static final int EDITION_2024_VALUE = 1001;
        public static final int EDITION_1_TEST_ONLY_VALUE = 1;
        public static final int EDITION_2_TEST_ONLY_VALUE = 2;
        public static final int EDITION_99997_TEST_ONLY_VALUE = 99997;
        public static final int EDITION_99998_TEST_ONLY_VALUE = 99998;
        public static final int EDITION_99999_TEST_ONLY_VALUE = 99999;
        public static final int EDITION_MAX_VALUE = Integer.MAX_VALUE;
        private static final Internal.EnumLiteMap<Edition> internalValueMap;
        private final int value;

        @Override
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Edition valueOf(int value) {
            return Edition.forNumber(value);
        }

        public static Edition forNumber(int value) {
            switch (value) {
                case 0: {
                    return EDITION_UNKNOWN;
                }
                case 900: {
                    return EDITION_LEGACY;
                }
                case 998: {
                    return EDITION_PROTO2;
                }
                case 999: {
                    return EDITION_PROTO3;
                }
                case 1000: {
                    return EDITION_2023;
                }
                case 1001: {
                    return EDITION_2024;
                }
                case 1: {
                    return EDITION_1_TEST_ONLY;
                }
                case 2: {
                    return EDITION_2_TEST_ONLY;
                }
                case 99997: {
                    return EDITION_99997_TEST_ONLY;
                }
                case 99998: {
                    return EDITION_99998_TEST_ONLY;
                }
                case 99999: {
                    return EDITION_99999_TEST_ONLY;
                }
                case 0x7FFFFFFF: {
                    return EDITION_MAX;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Edition> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return EditionVerifier.INSTANCE;
        }

        private Edition(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Edition>(){

                @Override
                public Edition findValueByNumber(int number) {
                    return Edition.forNumber(number);
                }
            };
        }

        private static final class EditionVerifier
        implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new EditionVerifier();

            private EditionVerifier() {
            }

            @Override
            public boolean isInRange(int number) {
                return Edition.forNumber(number) != null;
            }
        }
    }
}

