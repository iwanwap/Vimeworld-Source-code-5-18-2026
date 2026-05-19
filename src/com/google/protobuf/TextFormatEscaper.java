/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;

final class TextFormatEscaper {
    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence input) {
        StringBuilder builder = new StringBuilder(input.size());
        block12: for (int i2 = 0; i2 < input.size(); ++i2) {
            byte b2 = input.byteAt(i2);
            switch (b2) {
                case 7: {
                    builder.append("\\a");
                    continue block12;
                }
                case 8: {
                    builder.append("\\b");
                    continue block12;
                }
                case 12: {
                    builder.append("\\f");
                    continue block12;
                }
                case 10: {
                    builder.append("\\n");
                    continue block12;
                }
                case 13: {
                    builder.append("\\r");
                    continue block12;
                }
                case 9: {
                    builder.append("\\t");
                    continue block12;
                }
                case 11: {
                    builder.append("\\v");
                    continue block12;
                }
                case 92: {
                    builder.append("\\\\");
                    continue block12;
                }
                case 39: {
                    builder.append("\\'");
                    continue block12;
                }
                case 34: {
                    builder.append("\\\"");
                    continue block12;
                }
                default: {
                    if (b2 >= 32 && b2 <= 126) {
                        builder.append((char)b2);
                        continue block12;
                    }
                    builder.append('\\');
                    builder.append((char)(48 + (b2 >>> 6 & 3)));
                    builder.append((char)(48 + (b2 >>> 3 & 7)));
                    builder.append((char)(48 + (b2 & 7)));
                }
            }
        }
        return builder.toString();
    }

    static String escapeBytes(final ByteString input) {
        return TextFormatEscaper.escapeBytes(new ByteSequence(){

            @Override
            public int size() {
                return input.size();
            }

            @Override
            public byte byteAt(int offset) {
                return input.byteAt(offset);
            }
        });
    }

    static String escapeBytes(final byte[] input) {
        return TextFormatEscaper.escapeBytes(new ByteSequence(){

            @Override
            public int size() {
                return input.length;
            }

            @Override
            public byte byteAt(int offset) {
                return input[offset];
            }
        });
    }

    static String escapeText(String input) {
        return TextFormatEscaper.escapeBytes(ByteString.copyFromUtf8(input));
    }

    static String escapeDoubleQuotesAndBackslashes(String input) {
        return input.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private static interface ByteSequence {
        public int size();

        public byte byteAt(int var1);
    }
}

