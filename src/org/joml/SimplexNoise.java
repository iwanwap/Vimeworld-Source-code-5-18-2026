/*
 * Decompiled with CFR 0.152.
 */
package org.joml;

public class SimplexNoise {
    private static final Vector3b[] grad3 = new Vector3b[]{new Vector3b(1, 1, 0), new Vector3b(-1, 1, 0), new Vector3b(1, -1, 0), new Vector3b(-1, -1, 0), new Vector3b(1, 0, 1), new Vector3b(-1, 0, 1), new Vector3b(1, 0, -1), new Vector3b(-1, 0, -1), new Vector3b(0, 1, 1), new Vector3b(0, -1, 1), new Vector3b(0, 1, -1), new Vector3b(0, -1, -1)};
    private static final Vector4b[] grad4 = new Vector4b[]{new Vector4b(0, 1, 1, 1), new Vector4b(0, 1, 1, -1), new Vector4b(0, 1, -1, 1), new Vector4b(0, 1, -1, -1), new Vector4b(0, -1, 1, 1), new Vector4b(0, -1, 1, -1), new Vector4b(0, -1, -1, 1), new Vector4b(0, -1, -1, -1), new Vector4b(1, 0, 1, 1), new Vector4b(1, 0, 1, -1), new Vector4b(1, 0, -1, 1), new Vector4b(1, 0, -1, -1), new Vector4b(-1, 0, 1, 1), new Vector4b(-1, 0, 1, -1), new Vector4b(-1, 0, -1, 1), new Vector4b(-1, 0, -1, -1), new Vector4b(1, 1, 0, 1), new Vector4b(1, 1, 0, -1), new Vector4b(1, -1, 0, 1), new Vector4b(1, -1, 0, -1), new Vector4b(-1, 1, 0, 1), new Vector4b(-1, 1, 0, -1), new Vector4b(-1, -1, 0, 1), new Vector4b(-1, -1, 0, -1), new Vector4b(1, 1, 1, 0), new Vector4b(1, 1, -1, 0), new Vector4b(1, -1, 1, 0), new Vector4b(1, -1, -1, 0), new Vector4b(-1, 1, 1, 0), new Vector4b(-1, 1, -1, 0), new Vector4b(-1, -1, 1, 0), new Vector4b(-1, -1, -1, 0)};
    private static final byte[] p = new byte[]{-105, -96, -119, 91, 90, 15, -125, 13, -55, 95, 96, 53, -62, -23, 7, -31, -116, 36, 103, 30, 69, -114, 8, 99, 37, -16, 21, 10, 23, -66, 6, -108, -9, 120, -22, 75, 0, 26, -59, 62, 94, -4, -37, -53, 117, 35, 11, 32, 57, -79, 33, 88, -19, -107, 56, 87, -82, 20, 125, -120, -85, -88, 68, -81, 74, -91, 71, -122, -117, 48, 27, -90, 77, -110, -98, -25, 83, 111, -27, 122, 60, -45, -123, -26, -36, 105, 92, 41, 55, 46, -11, 40, -12, 102, -113, 54, 65, 25, 63, -95, 1, -40, 80, 73, -47, 76, -124, -69, -48, 89, 18, -87, -56, -60, -121, -126, 116, -68, -97, 86, -92, 100, 109, -58, -83, -70, 3, 64, 52, -39, -30, -6, 124, 123, 5, -54, 38, -109, 118, 126, -1, 82, 85, -44, -49, -50, 59, -29, 47, 16, 58, 17, -74, -67, 28, 42, -33, -73, -86, -43, 119, -8, -104, 2, 44, -102, -93, 70, -35, -103, 101, -101, -89, 43, -84, 9, -127, 22, 39, -3, 19, 98, 108, 110, 79, 113, -32, -24, -78, -71, 112, 104, -38, -10, 97, -28, -5, 34, -14, -63, -18, -46, -112, 12, -65, -77, -94, -15, 81, 51, -111, -21, -7, 14, -17, 107, 49, -64, -42, 31, -75, -57, 106, -99, -72, 84, -52, -80, 115, 121, 50, 45, 127, 4, -106, -2, -118, -20, -51, 93, -34, 114, 67, 29, 24, 72, -13, -115, -128, -61, 78, 66, -41, 61, -100, -76};
    private static final byte[] perm = new byte[512];
    private static final byte[] permMod12 = new byte[512];
    private static final float F2 = 0.36602542f;
    private static final float G2 = 0.21132487f;
    private static final float F3 = 0.33333334f;
    private static final float G3 = 0.16666667f;
    private static final float F4 = 0.309017f;
    private static final float G4 = 0.1381966f;

    private static int fastfloor(float x2) {
        int xi2 = (int)x2;
        return x2 < (float)xi2 ? xi2 - 1 : xi2;
    }

    private static float dot(Vector3b g2, float x2, float y2) {
        return (float)g2.x * x2 + (float)g2.y * y2;
    }

    private static float dot(Vector3b g2, float x2, float y2, float z2) {
        return (float)g2.x * x2 + (float)g2.y * y2 + (float)g2.z * z2;
    }

    private static float dot(Vector4b g2, float x2, float y2, float z2, float w2) {
        return (float)g2.x * x2 + (float)g2.y * y2 + (float)g2.z * z2 + (float)g2.w * w2;
    }

    public static float noise(float x2, float y2) {
        float n2;
        float n1;
        float n0;
        int j1;
        int i1;
        float Y0;
        float y0;
        int j2;
        float t2;
        float s2 = (x2 + y2) * 0.36602542f;
        int i2 = SimplexNoise.fastfloor(x2 + s2);
        float X0 = (float)i2 - (t2 = (float)(i2 + (j2 = SimplexNoise.fastfloor(y2 + s2))) * 0.21132487f);
        float x0 = x2 - X0;
        if (x0 > (y0 = y2 - (Y0 = (float)j2 - t2))) {
            i1 = 1;
            j1 = 0;
        } else {
            i1 = 0;
            j1 = 1;
        }
        float x1 = x0 - (float)i1 + 0.21132487f;
        float y1 = y0 - (float)j1 + 0.21132487f;
        float x22 = x0 - 1.0f + 0.42264974f;
        float y22 = y0 - 1.0f + 0.42264974f;
        int ii2 = i2 & 0xFF;
        int jj2 = j2 & 0xFF;
        int gi0 = permMod12[ii2 + perm[jj2] & 0xFF] & 0xFF;
        int gi1 = permMod12[ii2 + i1 + perm[jj2 + j1] & 0xFF] & 0xFF;
        int gi2 = permMod12[ii2 + 1 + perm[jj2 + 1] & 0xFF] & 0xFF;
        float t0 = 0.5f - x0 * x0 - y0 * y0;
        if (t0 < 0.0f) {
            n0 = 0.0f;
        } else {
            t0 *= t0;
            n0 = t0 * t0 * SimplexNoise.dot(grad3[gi0], x0, y0);
        }
        float t1 = 0.5f - x1 * x1 - y1 * y1;
        if (t1 < 0.0f) {
            n1 = 0.0f;
        } else {
            t1 *= t1;
            n1 = t1 * t1 * SimplexNoise.dot(grad3[gi1], x1, y1);
        }
        float t22 = 0.5f - x22 * x22 - y22 * y22;
        if (t22 < 0.0f) {
            n2 = 0.0f;
        } else {
            t22 *= t22;
            n2 = t22 * t22 * SimplexNoise.dot(grad3[gi2], x22, y22);
        }
        return 70.0f * (n0 + n1 + n2);
    }

    public static float noise(float x2, float y2, float z2) {
        float n3;
        float n2;
        float n1;
        float n0;
        int k2;
        int j2;
        int i2;
        int k1;
        int j1;
        int i1;
        float s2 = (x2 + y2 + z2) * 0.33333334f;
        int i3 = SimplexNoise.fastfloor(x2 + s2);
        int j3 = SimplexNoise.fastfloor(y2 + s2);
        int k3 = SimplexNoise.fastfloor(z2 + s2);
        float t2 = (float)(i3 + j3 + k3) * 0.16666667f;
        float X0 = (float)i3 - t2;
        float Y0 = (float)j3 - t2;
        float Z0 = (float)k3 - t2;
        float x0 = x2 - X0;
        float y0 = y2 - Y0;
        float z0 = z2 - Z0;
        if (x0 >= y0) {
            if (y0 >= z0) {
                i1 = 1;
                j1 = 0;
                k1 = 0;
                i2 = 1;
                j2 = 1;
                k2 = 0;
            } else if (x0 >= z0) {
                i1 = 1;
                j1 = 0;
                k1 = 0;
                i2 = 1;
                j2 = 0;
                k2 = 1;
            } else {
                i1 = 0;
                j1 = 0;
                k1 = 1;
                i2 = 1;
                j2 = 0;
                k2 = 1;
            }
        } else if (y0 < z0) {
            i1 = 0;
            j1 = 0;
            k1 = 1;
            i2 = 0;
            j2 = 1;
            k2 = 1;
        } else if (x0 < z0) {
            i1 = 0;
            j1 = 1;
            k1 = 0;
            i2 = 0;
            j2 = 1;
            k2 = 1;
        } else {
            i1 = 0;
            j1 = 1;
            k1 = 0;
            i2 = 1;
            j2 = 1;
            k2 = 0;
        }
        float x1 = x0 - (float)i1 + 0.16666667f;
        float y1 = y0 - (float)j1 + 0.16666667f;
        float z1 = z0 - (float)k1 + 0.16666667f;
        float x22 = x0 - (float)i2 + 0.33333334f;
        float y22 = y0 - (float)j2 + 0.33333334f;
        float z22 = z0 - (float)k2 + 0.33333334f;
        float x3 = x0 - 1.0f + 0.5f;
        float y3 = y0 - 1.0f + 0.5f;
        float z3 = z0 - 1.0f + 0.5f;
        int ii2 = i3 & 0xFF;
        int jj2 = j3 & 0xFF;
        int kk2 = k3 & 0xFF;
        int gi0 = permMod12[ii2 + perm[jj2 + perm[kk2] & 0xFF] & 0xFF] & 0xFF;
        int gi1 = permMod12[ii2 + i1 + perm[jj2 + j1 + perm[kk2 + k1] & 0xFF] & 0xFF] & 0xFF;
        int gi2 = permMod12[ii2 + i2 + perm[jj2 + j2 + perm[kk2 + k2] & 0xFF] & 0xFF] & 0xFF;
        int gi3 = permMod12[ii2 + 1 + perm[jj2 + 1 + perm[kk2 + 1] & 0xFF] & 0xFF] & 0xFF;
        float t0 = 0.6f - x0 * x0 - y0 * y0 - z0 * z0;
        if (t0 < 0.0f) {
            n0 = 0.0f;
        } else {
            t0 *= t0;
            n0 = t0 * t0 * SimplexNoise.dot(grad3[gi0], x0, y0, z0);
        }
        float t1 = 0.6f - x1 * x1 - y1 * y1 - z1 * z1;
        if (t1 < 0.0f) {
            n1 = 0.0f;
        } else {
            t1 *= t1;
            n1 = t1 * t1 * SimplexNoise.dot(grad3[gi1], x1, y1, z1);
        }
        float t22 = 0.6f - x22 * x22 - y22 * y22 - z22 * z22;
        if (t22 < 0.0f) {
            n2 = 0.0f;
        } else {
            t22 *= t22;
            n2 = t22 * t22 * SimplexNoise.dot(grad3[gi2], x22, y22, z22);
        }
        float t3 = 0.6f - x3 * x3 - y3 * y3 - z3 * z3;
        if (t3 < 0.0f) {
            n3 = 0.0f;
        } else {
            t3 *= t3;
            n3 = t3 * t3 * SimplexNoise.dot(grad3[gi3], x3, y3, z3);
        }
        return 32.0f * (n0 + n1 + n2 + n3);
    }

    public static float noise(float x2, float y2, float z2, float w2) {
        float n4;
        float n3;
        float n2;
        float n1;
        float n0;
        float s2 = (x2 + y2 + z2 + w2) * 0.309017f;
        int i2 = SimplexNoise.fastfloor(x2 + s2);
        int j2 = SimplexNoise.fastfloor(y2 + s2);
        int k2 = SimplexNoise.fastfloor(z2 + s2);
        int l2 = SimplexNoise.fastfloor(w2 + s2);
        float t2 = (float)(i2 + j2 + k2 + l2) * 0.1381966f;
        float X0 = (float)i2 - t2;
        float Y0 = (float)j2 - t2;
        float Z0 = (float)k2 - t2;
        float W0 = (float)l2 - t2;
        float x0 = x2 - X0;
        float y0 = y2 - Y0;
        float z0 = z2 - Z0;
        float w0 = w2 - W0;
        int rankx = 0;
        int ranky = 0;
        int rankz = 0;
        int rankw = 0;
        if (x0 > y0) {
            ++rankx;
        } else {
            ++ranky;
        }
        if (x0 > z0) {
            ++rankx;
        } else {
            ++rankz;
        }
        if (x0 > w0) {
            ++rankx;
        } else {
            ++rankw;
        }
        if (y0 > z0) {
            ++ranky;
        } else {
            ++rankz;
        }
        if (y0 > w0) {
            ++ranky;
        } else {
            ++rankw;
        }
        if (z0 > w0) {
            ++rankz;
        } else {
            ++rankw;
        }
        int i1 = rankx >= 3 ? 1 : 0;
        int j1 = ranky >= 3 ? 1 : 0;
        int k1 = rankz >= 3 ? 1 : 0;
        int l1 = rankw >= 3 ? 1 : 0;
        int i22 = rankx >= 2 ? 1 : 0;
        int j22 = ranky >= 2 ? 1 : 0;
        int k22 = rankz >= 2 ? 1 : 0;
        int l22 = rankw >= 2 ? 1 : 0;
        int i3 = rankx >= 1 ? 1 : 0;
        int j3 = ranky >= 1 ? 1 : 0;
        int k3 = rankz >= 1 ? 1 : 0;
        int l3 = rankw >= 1 ? 1 : 0;
        float x1 = x0 - (float)i1 + 0.1381966f;
        float y1 = y0 - (float)j1 + 0.1381966f;
        float z1 = z0 - (float)k1 + 0.1381966f;
        float w1 = w0 - (float)l1 + 0.1381966f;
        float x22 = x0 - (float)i22 + 0.2763932f;
        float y22 = y0 - (float)j22 + 0.2763932f;
        float z22 = z0 - (float)k22 + 0.2763932f;
        float w22 = w0 - (float)l22 + 0.2763932f;
        float x3 = x0 - (float)i3 + 0.41458982f;
        float y3 = y0 - (float)j3 + 0.41458982f;
        float z3 = z0 - (float)k3 + 0.41458982f;
        float w3 = w0 - (float)l3 + 0.41458982f;
        float x4 = x0 - 1.0f + 0.5527864f;
        float y4 = y0 - 1.0f + 0.5527864f;
        float z4 = z0 - 1.0f + 0.5527864f;
        float w4 = w0 - 1.0f + 0.5527864f;
        int ii2 = i2 & 0xFF;
        int jj2 = j2 & 0xFF;
        int kk2 = k2 & 0xFF;
        int ll2 = l2 & 0xFF;
        int gi0 = (perm[ii2 + perm[jj2 + perm[kk2 + perm[ll2] & 0xFF] & 0xFF] & 0xFF] & 0xFF) % 32;
        int gi1 = (perm[ii2 + i1 + perm[jj2 + j1 + perm[kk2 + k1 + perm[ll2 + l1] & 0xFF] & 0xFF] & 0xFF] & 0xFF) % 32;
        int gi2 = (perm[ii2 + i22 + perm[jj2 + j22 + perm[kk2 + k22 + perm[ll2 + l22] & 0xFF] & 0xFF] & 0xFF] & 0xFF) % 32;
        int gi3 = (perm[ii2 + i3 + perm[jj2 + j3 + perm[kk2 + k3 + perm[ll2 + l3] & 0xFF] & 0xFF] & 0xFF] & 0xFF) % 32;
        int gi4 = (perm[ii2 + 1 + perm[jj2 + 1 + perm[kk2 + 1 + perm[ll2 + 1] & 0xFF] & 0xFF] & 0xFF] & 0xFF) % 32;
        float t0 = 0.6f - x0 * x0 - y0 * y0 - z0 * z0 - w0 * w0;
        if (t0 < 0.0f) {
            n0 = 0.0f;
        } else {
            t0 *= t0;
            n0 = t0 * t0 * SimplexNoise.dot(grad4[gi0], x0, y0, z0, w0);
        }
        float t1 = 0.6f - x1 * x1 - y1 * y1 - z1 * z1 - w1 * w1;
        if (t1 < 0.0f) {
            n1 = 0.0f;
        } else {
            t1 *= t1;
            n1 = t1 * t1 * SimplexNoise.dot(grad4[gi1], x1, y1, z1, w1);
        }
        float t22 = 0.6f - x22 * x22 - y22 * y22 - z22 * z22 - w22 * w22;
        if (t22 < 0.0f) {
            n2 = 0.0f;
        } else {
            t22 *= t22;
            n2 = t22 * t22 * SimplexNoise.dot(grad4[gi2], x22, y22, z22, w22);
        }
        float t3 = 0.6f - x3 * x3 - y3 * y3 - z3 * z3 - w3 * w3;
        if (t3 < 0.0f) {
            n3 = 0.0f;
        } else {
            t3 *= t3;
            n3 = t3 * t3 * SimplexNoise.dot(grad4[gi3], x3, y3, z3, w3);
        }
        float t4 = 0.6f - x4 * x4 - y4 * y4 - z4 * z4 - w4 * w4;
        if (t4 < 0.0f) {
            n4 = 0.0f;
        } else {
            t4 *= t4;
            n4 = t4 * t4 * SimplexNoise.dot(grad4[gi4], x4, y4, z4, w4);
        }
        return 27.0f * (n0 + n1 + n2 + n3 + n4);
    }

    static {
        for (int i2 = 0; i2 < 512; ++i2) {
            SimplexNoise.perm[i2] = p[i2 & 0xFF];
            SimplexNoise.permMod12[i2] = (byte)((perm[i2] & 0xFF) % 12);
        }
    }

    private static class Vector4b {
        byte x;
        byte y;
        byte z;
        byte w;

        Vector4b(int x2, int y2, int z2, int w2) {
            this.x = (byte)x2;
            this.y = (byte)y2;
            this.z = (byte)z2;
            this.w = (byte)w2;
        }
    }

    private static class Vector3b {
        byte x;
        byte y;
        byte z;

        Vector3b(int x2, int y2, int z2) {
            this.x = (byte)x2;
            this.y = (byte)y2;
            this.z = (byte)z2;
        }
    }
}

