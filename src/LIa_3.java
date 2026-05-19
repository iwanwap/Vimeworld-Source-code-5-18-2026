/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hba
 *  JPa
 *  MQa
 *  Yfa
 *  aAa
 *  fpa
 *  gFa
 *  vL
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class LIa_3
extends gFa {
    public BlockDoor M;
    public XF k;
    public Yfa j;
    public boolean J;
    public float A;
    public float I;

    public void f() {
        LIa_3 lIa_3;
        LIa_3 lIa_32 = lIa_3 = this;
        float f2 = (float)((double)((float)lIa_32.k.getX() + MQa.L) - lIa_3.j.la);
        LIa_3 lIa_33 = lIa_3;
        float a2 = (float)((double)((float)lIa_32.k.getZ() + MQa.L) - lIa_33.j.A);
        if (lIa_33.I * f2 + lIa_3.A * a2 < JPa.N) {
            lIa_3.J = vRa.d;
        }
    }

    private BlockDoor J(XF xF2) {
        Object b2 = xF2;
        LIa_3 a2 = this;
        if ((b2 = a2.j.j.J((XF)((Object)b2)).J()) instanceof BlockDoor && ((Block)b2).J() == Material.wood) {
            return (BlockDoor)b2;
        }
        return null;
    }

    public void l() {
        LIa_3 a2;
        LIa_3 lIa_3 = a2;
        lIa_3.J = uSa.E;
        a2.I = (float)((double)((float)lIa_3.k.getX() + MQa.L) - a2.j.la);
        lIa_3.A = (float)((double)((float)lIa_3.k.getZ() + MQa.L) - a2.j.A);
    }

    public LIa_3(Yfa yfa) {
        LIa_3 b2 = yfa;
        LIa_3 a2 = this;
        a2.k = XF.ORIGIN;
        a2.j = b2;
        if (!(a2.j.J() instanceof Hba)) {
            throw new IllegalArgumentException(Jpa.p);
        }
    }

    public boolean f() {
        LIa_3 lIa_3 = this;
        if (!lIa_3.j.ca) {
            return uSa.E != 0;
        }
        Hba hba2 = (Hba)lIa_3.j.J();
        LIa_3 a2 = hba2.J();
        if (a2 != null && !a2.J() && hba2.d()) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < Math.min(a2.f() + uqa.g, a2.J())) {
                LIa_3 lIa_32;
                aAa aAa2 = a2.J(n2);
                aAa aAa3 = aAa2;
                lIa_3.k = new XF(aAa3.I, aAa3.C + vRa.d, aAa2.k);
                if (lIa_32.j.f((double)lIa_3.k.getX(), lIa_3.j.Z, (double)lIa_3.k.getZ()) <= fpa.o) {
                    LIa_3 lIa_33 = lIa_3;
                    lIa_33.M = lIa_33.J(lIa_33.k);
                    if (lIa_33.M != null) {
                        return vRa.d != 0;
                    }
                }
                n3 = ++n2;
            }
            LIa_3 lIa_34 = lIa_3;
            lIa_3.k = new XF((vL)lIa_3.j).up();
            lIa_34.M = lIa_34.J(lIa_34.k);
            if (lIa_34.M != null) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        LIa_3 a2;
        if (!a2.J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

