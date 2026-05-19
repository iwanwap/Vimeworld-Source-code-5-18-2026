/*
 * Decompiled with CFR 0.152.
 */
package org.joml;

import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public class QuaternionfInterpolator {
    private final SvdDecomposition3f svdDecomposition3f = new SvdDecomposition3f();
    private final float[] m = new float[9];
    private final Matrix3f u = new Matrix3f();
    private final Matrix3f v = new Matrix3f();

    public Quaternionf computeWeightedAverage(Quaternionfc[] qs2, float[] weights, int maxSvdIterations, Quaternionf dest) {
        float m00 = 0.0f;
        float m01 = 0.0f;
        float m02 = 0.0f;
        float m10 = 0.0f;
        float m11 = 0.0f;
        float m12 = 0.0f;
        float m20 = 0.0f;
        float m21 = 0.0f;
        float m22 = 0.0f;
        for (int i2 = 0; i2 < qs2.length; ++i2) {
            Quaternionfc q2 = qs2[i2];
            float dx2 = q2.x() + q2.x();
            float dy2 = q2.y() + q2.y();
            float dz2 = q2.z() + q2.z();
            float q00 = dx2 * q2.x();
            float q11 = dy2 * q2.y();
            float q22 = dz2 * q2.z();
            float q01 = dx2 * q2.y();
            float q02 = dx2 * q2.z();
            float q03 = dx2 * q2.w();
            float q12 = dy2 * q2.z();
            float q13 = dy2 * q2.w();
            float q23 = dz2 * q2.w();
            m00 += weights[i2] * (1.0f - q11 - q22);
            m01 += weights[i2] * (q01 + q23);
            m02 += weights[i2] * (q02 - q13);
            m10 += weights[i2] * (q01 - q23);
            m11 += weights[i2] * (1.0f - q22 - q00);
            m12 += weights[i2] * (q12 + q03);
            m20 += weights[i2] * (q02 + q13);
            m21 += weights[i2] * (q12 - q03);
            m22 += weights[i2] * (1.0f - q11 - q00);
        }
        this.m[0] = m00;
        this.m[1] = m01;
        this.m[2] = m02;
        this.m[3] = m10;
        this.m[4] = m11;
        this.m[5] = m12;
        this.m[6] = m20;
        this.m[7] = m21;
        this.m[8] = m22;
        this.svdDecomposition3f.svd(this.m, maxSvdIterations, this.u, this.v);
        this.u.mul(this.v.transpose());
        return dest.setFromNormalized(this.u).normalize();
    }

    private static class SvdDecomposition3f {
        private final float[] rv1 = new float[3];
        private final float[] w = new float[3];
        private final float[] v = new float[9];

        SvdDecomposition3f() {
        }

        private float SIGN(float a2, float b2) {
            return (double)b2 >= 0.0 ? Math.abs(a2) : -Math.abs(a2);
        }

        void svd(float[] a2, int maxIterations, Matrix3f destU, Matrix3f destV) {
            int j2;
            float h2;
            float f2;
            int k2;
            float s2;
            int i2;
            int l2 = 0;
            int nm2 = 0;
            float anorm = 0.0f;
            float g2 = 0.0f;
            float scale = 0.0f;
            for (i2 = 0; i2 < 3; ++i2) {
                l2 = i2 + 1;
                this.rv1[i2] = scale * g2;
                scale = 0.0f;
                s2 = 0.0f;
                g2 = 0.0f;
                for (k2 = i2; k2 < 3; ++k2) {
                    scale += Math.abs(a2[k2 + 3 * i2]);
                }
                if (scale != 0.0f) {
                    for (k2 = i2; k2 < 3; ++k2) {
                        a2[k2 + 3 * i2] = a2[k2 + 3 * i2] / scale;
                        s2 += a2[k2 + 3 * i2] * a2[k2 + 3 * i2];
                    }
                    f2 = a2[i2 + 3 * i2];
                    g2 = -this.SIGN(Math.sqrt(s2), f2);
                    h2 = f2 * g2 - s2;
                    a2[i2 + 3 * i2] = f2 - g2;
                    if (i2 != 2) {
                        for (j2 = l2; j2 < 3; ++j2) {
                            s2 = 0.0f;
                            for (k2 = i2; k2 < 3; ++k2) {
                                s2 += a2[k2 + 3 * i2] * a2[k2 + 3 * j2];
                            }
                            f2 = s2 / h2;
                            for (k2 = i2; k2 < 3; ++k2) {
                                int n2 = k2 + 3 * j2;
                                a2[n2] = a2[n2] + f2 * a2[k2 + 3 * i2];
                            }
                        }
                    }
                    for (k2 = i2; k2 < 3; ++k2) {
                        a2[k2 + 3 * i2] = a2[k2 + 3 * i2] * scale;
                    }
                }
                this.w[i2] = scale * g2;
                scale = 0.0f;
                s2 = 0.0f;
                g2 = 0.0f;
                if (i2 < 3 && i2 != 2) {
                    for (k2 = l2; k2 < 3; ++k2) {
                        scale += Math.abs(a2[i2 + 3 * k2]);
                    }
                    if (scale != 0.0f) {
                        for (k2 = l2; k2 < 3; ++k2) {
                            a2[i2 + 3 * k2] = a2[i2 + 3 * k2] / scale;
                            s2 += a2[i2 + 3 * k2] * a2[i2 + 3 * k2];
                        }
                        f2 = a2[i2 + 3 * l2];
                        g2 = -this.SIGN(Math.sqrt(s2), f2);
                        h2 = f2 * g2 - s2;
                        a2[i2 + 3 * l2] = f2 - g2;
                        for (k2 = l2; k2 < 3; ++k2) {
                            this.rv1[k2] = a2[i2 + 3 * k2] / h2;
                        }
                        if (i2 != 2) {
                            for (j2 = l2; j2 < 3; ++j2) {
                                s2 = 0.0f;
                                for (k2 = l2; k2 < 3; ++k2) {
                                    s2 += a2[j2 + 3 * k2] * a2[i2 + 3 * k2];
                                }
                                for (k2 = l2; k2 < 3; ++k2) {
                                    int n3 = j2 + 3 * k2;
                                    a2[n3] = a2[n3] + s2 * this.rv1[k2];
                                }
                            }
                        }
                        for (k2 = l2; k2 < 3; ++k2) {
                            a2[i2 + 3 * k2] = a2[i2 + 3 * k2] * scale;
                        }
                    }
                }
                anorm = Math.max(anorm, Math.abs(this.w[i2]) + Math.abs(this.rv1[i2]));
            }
            i2 = 2;
            while (i2 >= 0) {
                if (i2 < 2) {
                    if (g2 != 0.0f) {
                        for (j2 = l2; j2 < 3; ++j2) {
                            this.v[j2 + 3 * i2] = a2[i2 + 3 * j2] / a2[i2 + 3 * l2] / g2;
                        }
                        for (j2 = l2; j2 < 3; ++j2) {
                            s2 = 0.0f;
                            for (k2 = l2; k2 < 3; ++k2) {
                                s2 += a2[i2 + 3 * k2] * this.v[k2 + 3 * j2];
                            }
                            for (k2 = l2; k2 < 3; ++k2) {
                                int n4 = k2 + 3 * j2;
                                this.v[n4] = this.v[n4] + s2 * this.v[k2 + 3 * i2];
                            }
                        }
                    }
                    for (j2 = l2; j2 < 3; ++j2) {
                        this.v[j2 + 3 * i2] = 0.0f;
                        this.v[i2 + 3 * j2] = 0.0f;
                    }
                }
                this.v[i2 + 3 * i2] = 1.0f;
                g2 = this.rv1[i2];
                l2 = i2--;
            }
            for (i2 = 2; i2 >= 0; --i2) {
                l2 = i2 + 1;
                g2 = this.w[i2];
                if (i2 < 2) {
                    for (j2 = l2; j2 < 3; ++j2) {
                        a2[i2 + 3 * j2] = 0.0f;
                    }
                }
                if (g2 != 0.0f) {
                    g2 = 1.0f / g2;
                    if (i2 != 2) {
                        for (j2 = l2; j2 < 3; ++j2) {
                            s2 = 0.0f;
                            for (k2 = l2; k2 < 3; ++k2) {
                                s2 += a2[k2 + 3 * i2] * a2[k2 + 3 * j2];
                            }
                            f2 = s2 / a2[i2 + 3 * i2] * g2;
                            for (k2 = i2; k2 < 3; ++k2) {
                                int n5 = k2 + 3 * j2;
                                a2[n5] = a2[n5] + f2 * a2[k2 + 3 * i2];
                            }
                        }
                    }
                    for (j2 = i2; j2 < 3; ++j2) {
                        a2[j2 + 3 * i2] = a2[j2 + 3 * i2] * g2;
                    }
                } else {
                    for (j2 = i2; j2 < 3; ++j2) {
                        a2[j2 + 3 * i2] = 0.0f;
                    }
                }
                int n6 = i2 + 3 * i2;
                a2[n6] = a2[n6] + 1.0f;
            }
            block27: for (k2 = 2; k2 >= 0; --k2) {
                for (int its = 0; its < maxIterations; ++its) {
                    float z2;
                    float y2;
                    float c2;
                    boolean flag = true;
                    for (l2 = k2; l2 >= 0; --l2) {
                        nm2 = l2 - 1;
                        if (Math.abs(this.rv1[l2]) + anorm == anorm) {
                            flag = false;
                            break;
                        }
                        if (Math.abs(this.w[nm2]) + anorm == anorm) break;
                    }
                    if (flag) {
                        c2 = 0.0f;
                        s2 = 1.0f;
                        for (i2 = l2; i2 <= k2; ++i2) {
                            f2 = s2 * this.rv1[i2];
                            if (Math.abs(f2) + anorm == anorm) continue;
                            g2 = this.w[i2];
                            this.w[i2] = h2 = SvdDecomposition3f.PYTHAG(f2, g2);
                            h2 = 1.0f / h2;
                            c2 = g2 * h2;
                            s2 = -f2 * h2;
                            for (j2 = 0; j2 < 3; ++j2) {
                                y2 = a2[j2 + 3 * nm2];
                                z2 = a2[j2 + 3 * i2];
                                a2[j2 + 3 * nm2] = y2 * c2 + z2 * s2;
                                a2[j2 + 3 * i2] = z2 * c2 - y2 * s2;
                            }
                        }
                    }
                    z2 = this.w[k2];
                    if (l2 == k2) {
                        if (!(z2 < 0.0f)) continue block27;
                        this.w[k2] = -z2;
                        for (j2 = 0; j2 < 3; ++j2) {
                            this.v[j2 + 3 * k2] = -this.v[j2 + 3 * k2];
                        }
                        continue block27;
                    }
                    if (its == maxIterations - 1) {
                        throw new RuntimeException("No convergence after " + maxIterations + " iterations");
                    }
                    float x2 = this.w[l2];
                    nm2 = k2 - 1;
                    y2 = this.w[nm2];
                    g2 = this.rv1[nm2];
                    h2 = this.rv1[k2];
                    f2 = ((y2 - z2) * (y2 + z2) + (g2 - h2) * (g2 + h2)) / (2.0f * h2 * y2);
                    g2 = SvdDecomposition3f.PYTHAG(f2, 1.0f);
                    f2 = ((x2 - z2) * (x2 + z2) + h2 * (y2 / (f2 + this.SIGN(g2, f2)) - h2)) / x2;
                    s2 = 1.0f;
                    c2 = 1.0f;
                    for (j2 = l2; j2 <= nm2; ++j2) {
                        int jj2;
                        i2 = j2 + 1;
                        g2 = this.rv1[i2];
                        y2 = this.w[i2];
                        h2 = s2 * g2;
                        g2 = c2 * g2;
                        this.rv1[j2] = z2 = SvdDecomposition3f.PYTHAG(f2, h2);
                        c2 = f2 / z2;
                        s2 = h2 / z2;
                        f2 = x2 * c2 + g2 * s2;
                        g2 = g2 * c2 - x2 * s2;
                        h2 = y2 * s2;
                        y2 *= c2;
                        for (jj2 = 0; jj2 < 3; ++jj2) {
                            x2 = this.v[jj2 + 3 * j2];
                            z2 = this.v[jj2 + 3 * i2];
                            this.v[jj2 + 3 * j2] = x2 * c2 + z2 * s2;
                            this.v[jj2 + 3 * i2] = z2 * c2 - x2 * s2;
                        }
                        this.w[j2] = z2 = SvdDecomposition3f.PYTHAG(f2, h2);
                        if (z2 != 0.0f) {
                            z2 = 1.0f / z2;
                            c2 = f2 * z2;
                            s2 = h2 * z2;
                        }
                        f2 = c2 * g2 + s2 * y2;
                        x2 = c2 * y2 - s2 * g2;
                        for (jj2 = 0; jj2 < 3; ++jj2) {
                            y2 = a2[jj2 + 3 * j2];
                            z2 = a2[jj2 + 3 * i2];
                            a2[jj2 + 3 * j2] = y2 * c2 + z2 * s2;
                            a2[jj2 + 3 * i2] = z2 * c2 - y2 * s2;
                        }
                    }
                    this.rv1[l2] = 0.0f;
                    this.rv1[k2] = f2;
                    this.w[k2] = x2;
                }
            }
            destU.set(a2);
            destV.set(this.v);
        }

        private static float PYTHAG(float a2, float b2) {
            float result;
            float bt2;
            float at2 = Math.abs(a2);
            if (at2 > (bt2 = Math.abs(b2))) {
                float ct2 = bt2 / at2;
                result = at2 * (float)Math.sqrt(1.0 + (double)(ct2 * ct2));
            } else if (bt2 > 0.0f) {
                float ct3 = at2 / bt2;
                result = bt2 * (float)Math.sqrt(1.0 + (double)(ct3 * ct3));
            } else {
                result = 0.0f;
            }
            return result;
        }
    }
}

