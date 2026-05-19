/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

class Arrays {
    Arrays() {
    }

    static int[][] InitTwoDimensionalArrayInt(int x2, int y2) {
        return new int[x2][y2];
    }

    static float[][] InitTwoDimensionalArrayFloat(int x2, int y2) {
        return new float[x2][y2];
    }

    static short[][] InitTwoDimensionalArrayShort(int x2, int y2) {
        return new short[x2][y2];
    }

    static byte[][] InitTwoDimensionalArrayByte(int x2, int y2) {
        return new byte[x2][y2];
    }

    static byte[][][] InitThreeDimensionalArrayByte(int x2, int y2, int z2) {
        return new byte[x2][y2][z2];
    }

    static void MemSet(byte[] array, byte value) {
        java.util.Arrays.fill(array, value);
    }

    static void MemSet(short[] array, short value) {
        java.util.Arrays.fill(array, value);
    }

    static void MemSet(int[] array, int value) {
        java.util.Arrays.fill(array, value);
    }

    static void MemSet(float[] array, float value) {
        java.util.Arrays.fill(array, value);
    }

    static void MemSet(byte[] array, byte value, int length) {
        java.util.Arrays.fill(array, 0, length, value);
    }

    static void MemSet(short[] array, short value, int length) {
        java.util.Arrays.fill(array, 0, length, value);
    }

    static void MemSet(int[] array, int value, int length) {
        java.util.Arrays.fill(array, 0, length, value);
    }

    static void MemSet(float[] array, float value, int length) {
        java.util.Arrays.fill(array, 0, length, value);
    }

    static void MemSetWithOffset(byte[] array, byte value, int offset, int length) {
        java.util.Arrays.fill(array, offset, offset + length, value);
    }

    static void MemSetWithOffset(short[] array, short value, int offset, int length) {
        java.util.Arrays.fill(array, offset, offset + length, value);
    }

    static void MemSetWithOffset(int[] array, int value, int offset, int length) {
        java.util.Arrays.fill(array, offset, offset + length, value);
    }

    static void MemMove(byte[] array, int src_idx, int dst_idx, int length) {
        System.arraycopy(array, src_idx, array, dst_idx, length);
    }

    static void MemMove(short[] array, int src_idx, int dst_idx, int length) {
        System.arraycopy(array, src_idx, array, dst_idx, length);
    }

    static void MemMove(int[] array, int src_idx, int dst_idx, int length) {
        System.arraycopy(array, src_idx, array, dst_idx, length);
    }
}

