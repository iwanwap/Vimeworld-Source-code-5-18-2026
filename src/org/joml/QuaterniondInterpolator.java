/*
 * Decompiled with CFR 0.152.
 */
package org.joml;

import org.joml.Math;
import org.joml.Matrix3d;
import org.joml.Quaterniond;

public class QuaterniondInterpolator {
    private final SvdDecomposition3d svdDecomposition3d = new SvdDecomposition3d();
    private final double[] m = new double[9];
    private final Matrix3d u = new Matrix3d();
    private final Matrix3d v = new Matrix3d();

    public Quaterniond computeWeightedAverage(Quaterniond[] qs2, double[] weights, int maxSvdIterations, Quaterniond dest) {
        double m00 = 0.0;
        double m01 = 0.0;
        double m02 = 0.0;
        double m10 = 0.0;
        double m11 = 0.0;
        double m12 = 0.0;
        double m20 = 0.0;
        double m21 = 0.0;
        double m22 = 0.0;
        for (int i2 = 0; i2 < qs2.length; ++i2) {
            Quaterniond q2 = qs2[i2];
            double dx2 = q2.x + q2.x;
            double dy2 = q2.y + q2.y;
            double dz2 = q2.z + q2.z;
            double q00 = dx2 * q2.x;
            double q11 = dy2 * q2.y;
            double q22 = dz2 * q2.z;
            double q01 = dx2 * q2.y;
            double q02 = dx2 * q2.z;
            double q03 = dx2 * q2.w;
            double q12 = dy2 * q2.z;
            double q13 = dy2 * q2.w;
            double q23 = dz2 * q2.w;
            m00 += weights[i2] * (1.0 - q11 - q22);
            m01 += weights[i2] * (q01 + q23);
            m02 += weights[i2] * (q02 - q13);
            m10 += weights[i2] * (q01 - q23);
            m11 += weights[i2] * (1.0 - q22 - q00);
            m12 += weights[i2] * (q12 + q03);
            m20 += weights[i2] * (q02 + q13);
            m21 += weights[i2] * (q12 - q03);
            m22 += weights[i2] * (1.0 - q11 - q00);
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
        this.svdDecomposition3d.svd(this.m, maxSvdIterations, this.u, this.v);
        this.u.mul(this.v.transpose());
        return dest.setFromNormalized(this.u).normalize();
    }

    private static class SvdDecomposition3d {
        private final double[] rv1 = new double[3];
        private final double[] w = new double[3];
        private final double[] v = new double[9];

        SvdDecomposition3d() {
        }

        private double SIGN(double a2, double b2) {
            return b2 >= 0.0 ? Math.abs(a2) : -Math.abs(a2);
        }

        void svd(double[] a2, int maxIterations, Matrix3d destU, Matrix3d destV) {
            int j2;
            double h2;
            double f2;
            int k2;
            double s2;
            int i2;
            int l2 = 0;
            int nm2 = 0;
            double anorm = 0.0;
            double g2 = 0.0;
            double scale = 0.0;
            for (i2 = 0; i2 < 3; ++i2) {
                l2 = i2 + 1;
                this.rv1[i2] = scale * g2;
                scale = 0.0;
                s2 = 0.0;
                g2 = 0.0;
                for (k2 = i2; k2 < 3; ++k2) {
                    scale += Math.abs(a2[k2 + 3 * i2]);
                }
                if (scale != 0.0) {
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
                            s2 = 0.0;
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
                scale = 0.0;
                s2 = 0.0;
                g2 = 0.0;
                if (i2 < 3 && i2 != 2) {
                    for (k2 = l2; k2 < 3; ++k2) {
                        scale += Math.abs(a2[i2 + 3 * k2]);
                    }
                    if (scale != 0.0) {
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
                                s2 = 0.0;
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
                    if (g2 != 0.0) {
                        for (j2 = l2; j2 < 3; ++j2) {
                            this.v[j2 + 3 * i2] = a2[i2 + 3 * j2] / a2[i2 + 3 * l2] / g2;
                        }
                        for (j2 = l2; j2 < 3; ++j2) {
                            s2 = 0.0;
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
                        this.v[j2 + 3 * i2] = 0.0;
                        this.v[i2 + 3 * j2] = 0.0;
                    }
                }
                this.v[i2 + 3 * i2] = 1.0;
                g2 = this.rv1[i2];
                l2 = i2--;
            }
            for (i2 = 2; i2 >= 0; --i2) {
                l2 = i2 + 1;
                g2 = this.w[i2];
                if (i2 < 2) {
                    for (j2 = l2; j2 < 3; ++j2) {
                        a2[i2 + 3 * j2] = 0.0;
                    }
                }
                if (g2 != 0.0) {
                    g2 = 1.0 / g2;
                    if (i2 != 2) {
                        for (j2 = l2; j2 < 3; ++j2) {
                            s2 = 0.0;
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
                        a2[j2 + 3 * i2] = 0.0;
                    }
                }
                int n6 = i2 + 3 * i2;
                a2[n6] = a2[n6] + 1.0;
            }
            block27: for (k2 = 2; k2 >= 0; --k2) {
                for (int its = 0; its < maxIterations; ++its) {
                    double z2;
                    double y2;
                    double c2;
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
                        c2 = 0.0;
                        s2 = 1.0;
                        for (i2 = l2; i2 <= k2; ++i2) {
                            f2 = s2 * this.rv1[i2];
                            if (Math.abs(f2) + anorm == anorm) continue;
                            g2 = this.w[i2];
                            this.w[i2] = h2 = SvdDecomposition3d.PYTHAG(f2, g2);
                            h2 = 1.0 / h2;
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
                        if (!(z2 < 0.0)) continue block27;
                        this.w[k2] = -z2;
                        for (j2 = 0; j2 < 3; ++j2) {
                            this.v[j2 + 3 * k2] = -this.v[j2 + 3 * k2];
                        }
                        continue block27;
                    }
                    if (its == maxIterations - 1) {
                        throw new RuntimeException("No convergence after " + maxIterations + " iterations");
                    }
                    double x2 = this.w[l2];
                    nm2 = k2 - 1;
                    y2 = this.w[nm2];
                    g2 = this.rv1[nm2];
                    h2 = this.rv1[k2];
                    f2 = ((y2 - z2) * (y2 + z2) + (g2 - h2) * (g2 + h2)) / (2.0 * h2 * y2);
                    g2 = SvdDecomposition3d.PYTHAG(f2, 1.0);
                    f2 = ((x2 - z2) * (x2 + z2) + h2 * (y2 / (f2 + this.SIGN(g2, f2)) - h2)) / x2;
                    s2 = 1.0;
                    c2 = 1.0;
                    for (j2 = l2; j2 <= nm2; ++j2) {
                        int jj2;
                        i2 = j2 + 1;
                        g2 = this.rv1[i2];
                        y2 = this.w[i2];
                        h2 = s2 * g2;
                        g2 = c2 * g2;
                        this.rv1[j2] = z2 = SvdDecomposition3d.PYTHAG(f2, h2);
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
                        this.w[j2] = z2 = SvdDecomposition3d.PYTHAG(f2, h2);
                        if (z2 != 0.0) {
                            z2 = 1.0 / z2;
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
                    this.rv1[l2] = 0.0;
                    this.rv1[k2] = f2;
                    this.w[k2] = x2;
                }
            }
            destU.set(a2);
            destV.set(this.v);
        }

        private static double PYTHAG(double a2, double b2) {
            double result;
            double bt2;
            double at2 = Math.abs(a2);
            if (at2 > (bt2 = Math.abs(b2))) {
                double ct2 = bt2 / at2;
                result = at2 * Math.sqrt(1.0 + ct2 * ct2);
            } else if (bt2 > 0.0) {
                double ct3 = at2 / bt2;
                result = bt2 * Math.sqrt(1.0 + ct3 * ct3);
            } else {
                result = 0.0;
            }
            return result;
        }
    }
}

