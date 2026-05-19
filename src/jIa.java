/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Cta
 *  EQa
 *  Eia
 *  Epa
 *  FPa
 *  JQa
 *  JTa
 *  KTa
 *  Lra
 *  MQa
 *  NPa
 *  NTa
 *  Qsa
 *  RHa
 *  SQa
 *  SRa
 *  Ssa
 *  TQa
 *  URa
 *  Uqa
 *  Usa
 *  WQa
 *  WSa
 *  XTa
 *  Xsa
 *  Zpa
 *  aPa
 *  aSa
 *  bSa
 *  bua
 *  cQa
 *  cRa
 *  fsa
 *  iPa
 *  jsa
 *  kqa
 *  mra
 *  nQa
 *  pqa
 *  pua
 *  tJa
 *  uOa
 *  uQa
 *  vQa
 *  vRa
 *  wOa
 *  yQa
 *  ysa
 *  zTa
 */
import net.minecraft.block.BlockCustomSlab$Double;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.state.IBlockState;

public final class jIa {
    public static tJa J(IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        if (iBlockState2 == null) {
            return null;
        }
        CustomBlock customBlock = iBlockState2.J().J();
        if (customBlock == null) {
            return null;
        }
        if (customBlock.J() == null) {
            return null;
        }
        String a2 = customBlock.f();
        switch (Eia.I[customBlock.J().ordinal()]) {
            case 1: {
                while (false) {
                }
                return jIa.J(a2).J(AQa.t, mra.f, AGa.X0_Y0).J();
            }
            case 2: {
                return jIa.J(a2).J(XTa.z, tSa.n, AGa.X0_Y0, uSa.E != 0).J(ysa.B, tSa.n, AGa.X0_Y180, uSa.E != 0).J(cQa.A, tSa.n, AGa.X0_Y270, uSa.E != 0).J(bua.l, tSa.n, AGa.X0_Y90, uSa.E != 0).J();
            }
            case 3: {
                return jIa.J(a2).J(XTa.z, APa.b, AGa.X0_Y270).J(ysa.B, APa.b, AGa.X0_Y90).J(cQa.A, APa.b, AGa.X0_Y180).J(bua.l, APa.b, AGa.X0_Y0).J();
            }
            case 4: {
                return jIa.J(a2).J(Lra.H, rSa.O, AGa.X0_Y0, uSa.E != 0).J(EPa.x, rSa.O, AGa.X90_Y0, uSa.E != 0).J(vRa.D, rSa.O, AGa.X90_Y90, uSa.E != 0).J(JQa.Ja, rSa.O, AGa.X0_Y0, uSa.E != 0).J();
            }
            case 5: {
                return jIa.J(a2).J(AQa.t, wua.h, AGa.X0_Y0).J();
            }
            case 6: {
                return jIa.J(a2).J(Cra.d, NPa.I, AGa.X0_Y0).J(POa.y, NPa.I, AGa.X0_Y180).J(Xpa.n, NPa.I, AGa.X0_Y90).J(SPa.p, NPa.I, AGa.X0_Y270).J(dua.t, hQa.b, AGa.X0_Y0).J(Epa.U, hQa.b, AGa.X0_Y180).J(qQa.I, hQa.b, AGa.X0_Y90).J(WSa.a, hQa.b, AGa.X0_Y270).J(xqa.T, hQa.b, AGa.X0_Y270).J(EQa.s, hQa.b, AGa.X0_Y90).J(kqa.E, hQa.b, AGa.X0_Y0).J(nQa.fa, hQa.b, AGa.X0_Y180).J(bua.A, vqa.ja, AGa.X0_Y0).J(eua.K, vqa.ja, AGa.X0_Y180).J(uQa.d, vqa.ja, AGa.X0_Y90).J(wOa.v, vqa.ja, AGa.X0_Y270).J(lQa.t, vqa.ja, AGa.X0_Y270).J(wta.W, vqa.ja, AGa.X0_Y90).J(uSa.B, vqa.ja, AGa.X0_Y0).J(uOa.c, vqa.ja, AGa.X0_Y180).J(Ssa.V, NPa.I, AGa.X180_Y0).J(xqa.R, NPa.I, AGa.X180_Y180).J(MRa.k, NPa.I, AGa.X180_Y90).J(TQa.M, NPa.I, AGa.X180_Y270).J(zua.F, hQa.b, AGa.X180_Y0).J(vRa.g, hQa.b, AGa.X180_Y180).J(QTa.q, hQa.b, AGa.X180_Y90).J(fPa.F, hQa.b, AGa.X180_Y270).J(iPa.Ia, hQa.b, AGa.X180_Y90).J(Wqa.s, hQa.b, AGa.X180_Y270).J(uQa.u, hQa.b, AGa.X180_Y180).J(KPa.la, hQa.b, AGa.X180_Y0).J(vRa.Da, vqa.ja, AGa.X180_Y0).J(aPa.p, vqa.ja, AGa.X180_Y180).J(EPa.h, vqa.ja, AGa.X180_Y90).J(JTa.R, vqa.ja, AGa.X180_Y270).J(qsa.a, vqa.ja, AGa.X180_Y90).J(jsa.F, vqa.ja, AGa.X180_Y270).J(bSa.H, vqa.ja, AGa.X180_Y180).J(cTa.L, vqa.ja, AGa.X180_Y0).J();
            }
            case 7: {
                if (iBlockState2.J() instanceof BlockCustomSlab.Double) {
                    return jIa.J(a2).J(dua.R, mra.f, AGa.X0_Y0).J();
                }
                return jIa.J(a2).J(Cta.R, NTa.R, AGa.X0_Y0).J(Xsa.Da, Jra.Ka, AGa.X0_Y0).J();
            }
            case 8: {
                return jIa.J(a2).J(SQa.u, KTa.u, AGa.X0_Y0).J(zta.y, fsa.Aa, AGa.X0_Y0).J(Era.y, fsa.Aa, AGa.X0_Y90).J(Uqa.fa, fsa.Aa, AGa.X0_Y180).J(uSa.r, fsa.Aa, AGa.X0_Y270).J(Qpa.R, Wqa.M, AGa.X0_Y0).J(zTa.E, Wqa.M, AGa.X0_Y90).J(uOa.Da, Wqa.M, AGa.X0_Y180).J(rua.r, Wqa.M, AGa.X0_Y270).J(pqa.F, Qra.c, AGa.X0_Y0).J(Zpa.H, Qra.c, AGa.X0_Y90).J(eta.G, fPa.W, AGa.X0_Y0).J(STa.c, fPa.W, AGa.X0_Y90).J(uOa.i, fPa.W, AGa.X0_Y180).J(Usa.B, fPa.W, AGa.X0_Y270).J(pua.l, pua.q, AGa.X0_Y0).J(lQa.ca, KTa.u, AGa.X0_Y0).J(aSa.y, fsa.Aa, AGa.X0_Y0).J(Xsa.L, fsa.Aa, AGa.X0_Y90).J(tpa.q, fsa.Aa, AGa.X0_Y180).J(Mqa.Z, fsa.Aa, AGa.X0_Y270).J(tTa.y, Wqa.M, AGa.X0_Y0).J(FPa.Ka, Wqa.M, AGa.X0_Y90).J(Zra.Ka, Wqa.M, AGa.X0_Y180).J(dsa.R, Wqa.M, AGa.X0_Y270).J(yQa.X, aSa.h, AGa.X0_Y0).J(NSa.u, aSa.h, AGa.X0_Y90).J(MQa.C, fPa.W, AGa.X0_Y0).J(BPa.A, fPa.W, AGa.X0_Y90).J(iSa.S, fPa.W, AGa.X0_Y180).J(cRa.Ma, fPa.W, AGa.X0_Y270).J(QTa.A, pua.q, AGa.X0_Y0).J();
            }
            case 9: {
                return jIa.J(a2).J(hQa.D, NPa.R, AGa.X0_Y0).J(cTa.l, cTa.Aa, AGa.X0_Y0).J(mra.l, cTa.Aa, AGa.X0_Y90).J(SRa.e, cTa.Aa, AGa.X0_Y180).J(cTa.s, cTa.Aa, AGa.X0_Y270).J(UTa.P, ypa.fa, AGa.X0_Y0).J(eta.Ja, ypa.fa, AGa.X0_Y90).J(gsa.m, ypa.fa, AGa.X0_Y180).J(Epa.P, ypa.fa, AGa.X0_Y270).J(WQa.M, Qsa.Ia, AGa.X0_Y0).J(sOa.Da, Qsa.Ia, AGa.X0_Y90).J(kqa.h, vQa.Ka, AGa.X0_Y0).J(osa.j, vQa.Ka, AGa.X0_Y90).J(Bta.s, vQa.Ka, AGa.X0_Y180).J(Nta.t, vQa.Ka, AGa.X0_Y270).J(wOa.n, URa.X, AGa.X0_Y0).J();
            }
            case 10: {
                break;
            }
            case 11: {
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    public static RHa J(String a2) {
        return new RHa(a2);
    }

    public jIa() {
        jIa a2;
    }
}

