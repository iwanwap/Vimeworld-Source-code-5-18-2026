/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HKa
 *  ISa
 *  JPa
 *  Kpa
 *  MQa
 *  Ola
 *  RQa
 *  SQa
 *  Tpa
 *  UIa
 *  WQa
 *  XTa
 *  YSa
 *  Yra
 *  aPa
 *  fy
 *  kta
 *  pqa
 *  uKa
 *  wPa
 *  ysa
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.UUID;
import net.minecraft.client.model.ModelHumanoidHead;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.util.ResourceLocation;

public final class Mka
extends Ola<fy> {
    private final ModelSkeletonHead i;
    private static final ResourceLocation M = new ResourceLocation(Ira.H);
    private static final ResourceLocation k;
    private static final ResourceLocation j;
    private final ModelSkeletonHead J;
    public static Mka A;
    private static final ResourceLocation I;

    static {
        I = new ResourceLocation(sqa.k);
        j = new ResourceLocation(Tpa.O);
        k = new ResourceLocation(WQa.U);
    }

    /*
     * WARNING - void declaration
     */
    public void J(fy fy2, double d2, double d3, double d4, float f2, int n2) {
        void a2;
        void c2;
        void d5;
        void e2;
        Mka g = fy2;
        Mka f3 = this;
        DZ b2 = DZ.getFront(g.C() & XTa.W);
        f3.J((float)e2, (float)d5, (float)c2, b2, (float)(g.J() * aPa.Y) / Yra.i, g.f(), g.J(), (int)a2);
    }

    public void J(RKa rKa) {
        Mka a2;
        Object b2 = rKa;
        Mka mka2 = a2 = this;
        super.J((RKa)b2);
        A = mka2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void J(float var1_2, float var2_3, float var3_4, DZ var4_5, float var5_6, int var6_7, GameProfile var7_9, int var8_10) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        var10_11 = this /* !! */ ;
                        var9_12 = var10_11.J;
                        if (a < 0) break block16;
                        var10_11.J((ResourceLocation)Mka.A[a]);
                        uKa.G((int)RQa.j);
                        uKa.e();
                        uKa.l((float)YSa.G, (float)kta.v, (float)pqa.r);
                        uKa.J((float)rRa.T, (float)rRa.T, (float)rRa.T);
                        uKa.G((int)SQa.ca);
                        break block17;
                    }
                    switch (c) {
                        default: {
                            var10_11.J(Mka.M);
                            break;
                        }
lbl16:
                        // 2 sources

                        case 1: {
                            if (false) ** GOTO lbl16
                            var10_11.J(Mka.I);
                            break;
                        }
                        case 2: {
                            v0 = var10_11;
                            v0.J(Mka.j);
                            var9_12 = v0.i;
                            break;
                        }
                        case 3: {
                            var9_12 = var10_11.i;
                            i /* !! */  = UIa.J();
                            if (b == null) ** GOTO lbl36
                            c = Kpa.J();
                            var11_13 = c.J().J((GameProfile)b);
                            if (var11_13.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
                                i /* !! */  = c.J().J(var11_13.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                                v1 = var10_11;
                            } else {
                                i /* !! */  = UIa.J((UUID)Sx.J((GameProfile)b));
lbl36:
                                // 2 sources

                                v1 = var10_11;
                            }
                            v1.J((ResourceLocation)i /* !! */ );
                            break;
                        }
                        case 4: {
                            var10_11.J(Mka.k);
                        }
                    }
                }
                uKa.e();
                uKa.m();
                if (e == DZ.UP) break block18;
                switch (HKa.I[e.ordinal()]) lbl-1000:
                // 2 sources

                {
                    case 1: {
                        if (false) ** GOTO lbl-1000
                        uKa.J((float)(h + MQa.L), (float)(g + rta.o), (float)(f + wPa.D));
                        break;
                    }
                    case 2: {
                        uKa.J((float)(h + MQa.L), (float)(g + rta.o), (float)(f + Jta.w));
                        d = Hra.Ga;
                        break;
                    }
                    case 3: {
                        uKa.J((float)(h + wPa.D), (float)(g + rta.o), (float)(f + MQa.L));
                        d = zta.B;
                        break;
                    }
                    default: {
                        uKa.J((float)(h + Jta.w), (float)(g + rta.o), (float)(f + MQa.L));
                        d = ISa.a;
                        break;
                    }
                }
                break block19;
            }
            uKa.J((float)(h + MQa.L), (float)g, (float)(f + MQa.L));
        }
        i = rRa.T;
        uKa.o();
        uKa.l((float)vqa.T, (float)vqa.T, (float)pqa.r);
        uKa.K();
        var9_12.J(null, JPa.N, JPa.N, JPa.N, d, JPa.N, i);
        uKa.D();
        if (a >= 0) {
            uKa.G((int)RQa.j);
            uKa.D();
            uKa.G((int)SQa.ca);
        }
    }

    public Mka() {
        Mka a2;
        Mka mka2 = a2;
        a2.J = new ModelSkeletonHead(uSa.E, uSa.E, ysa.s, fPa.i);
        mka2.i = new ModelHumanoidHead();
    }
}

