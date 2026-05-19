/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;

public enum NullValue implements Internal.EnumLite
{
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap;
    private final int value;

    @Override
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static NullValue valueOf(int value) {
        return NullValue.forNumber(value);
    }

    public static NullValue forNumber(int value) {
        switch (value) {
            case 0: {
                return NULL_VALUE;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    private NullValue(int value) {
        this.value = value;
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<NullValue>(){

            @Override
            public NullValue findValueByNumber(int number) {
                return NullValue.forNumber(number);
            }
        };
    }

    private static final class NullValueVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override
        public boolean isInRange(int number) {
            return NullValue.forNumber(number) != null;
        }
    }
}

