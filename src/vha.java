/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  I
 *  LIa
 *  Xsa
 *  YSa
 *  Yfa
 *  kqa
 *  pua
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vha
extends LIa {
    private int A;
    private int I;

    public void f() {
        vha vha2;
        vha vha3 = vha2 = this;
        super.f();
        if (vha3.j.J().nextInt(kTa.j) == 0) {
            vha2.j.j.f(Xsa.C, vha2.k, uSa.E);
        }
        vha vha4 = vha2;
        vha4.I += vRa.d;
        int a2 = (int)((float)vha4.I / xra.Ga * FRa.Ga);
        if (a2 != vha2.A) {
            vha2.j.j.J(vha2.j.M(), vha2.k, a2);
            vha2.A = a2;
        }
        if (vha2.I == YSa.c && vha2.j.j.J() == sZ.HARD) {
            vha2.j.j.G(vha2.k);
            vha vha5 = vha2;
            vha2.j.j.f(FPa.s, vha5.k, uSa.E);
            vha vha6 = vha2;
            vha5.j.j.f(zta.Z, vha6.k, Block.J(vha6.M));
        }
    }

    public vha(Yfa yfa) {
        vha b2 = yfa;
        vha a2 = this;
        super((Yfa)b2);
        a2.A = pua.o;
    }

    public void l() {
        vha a2;
        super.l();
        a2.I = uSa.E;
    }

    public boolean f() {
        vha a2;
        if (!super.f()) {
            return uSa.E != 0;
        }
        if (!a2.j.j.J().f(kqa.N)) {
            return uSa.E != 0;
        }
        vha vha2 = a2;
        BlockDoor cfr_ignored_0 = vha2.M;
        if (!BlockDoor.f((I)vha2.j.j, a2.k)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        vha a2;
        vha vha2 = a2;
        double d2 = a2.j.J(vha2.k);
        if (vha2.I <= YSa.c) {
            vha vha3 = a2;
            BlockDoor cfr_ignored_0 = vha3.M;
            if (!BlockDoor.f((I)vha3.j.j, a2.k) && d2 < FPa.T) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void J() {
        vha a2;
        vha vha2 = a2;
        super.J();
        vha2.j.j.J(a2.j.M(), a2.k, pua.o);
    }
}

