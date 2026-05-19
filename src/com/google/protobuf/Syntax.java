/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;

public enum Syntax implements Internal.EnumLite
{
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final int SYNTAX_EDITIONS_VALUE = 2;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap;
    private final int value;

    @Override
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static Syntax valueOf(int value) {
        return Syntax.forNumber(value);
    }

    public static Syntax forNumber(int value) {
        switch (value) {
            case 0: {
                return SYNTAX_PROTO2;
            }
            case 1: {
                return SYNTAX_PROTO3;
            }
            case 2: {
                return SYNTAX_EDITIONS;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SyntaxVerifier.INSTANCE;
    }

    private Syntax(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<Syntax>(){

            @Override
            public Syntax findValueByNumber(int number) {
                return Syntax.forNumber(number);
            }
        };
    }

    private static final class SyntaxVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override
        public boolean isInRange(int number) {
            return Syntax.forNumber(number) != null;
        }
    }
}

