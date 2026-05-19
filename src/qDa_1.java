/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  QFa
 *  aSa
 *  gFa
 *  kqa
 *  vRa
 *  vea
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qDa_1
extends gFa {
    private vea I;

    public qDa_1(vea vea2) {
        qDa_1 b2 = vea2;
        qDa_1 a2 = this;
        a2.I = b2;
    }

    public void f() {
        qDa_1 qDa_12;
        qDa_1 qDa_13 = qDa_12 = this;
        Random a322 = qDa_13.I.J();
        Gg gg2 = qDa_13.I.j;
        int n2 = Oz.f((double)(qDa_13.I.la - oua.i + a322.nextDouble() * KPa.y));
        int n3 = Oz.f((double)(qDa_13.I.Z + a322.nextDouble() * KPa.y));
        int a322 = Oz.f((double)(qDa_13.I.A - oua.i + a322.nextDouble() * KPa.y));
        XF a322 = new XF(n2, n3, a322);
        Gg gg3 = gg2;
        Block block = gg3.J(a322).J();
        Block block2 = gg3.J(a322.down()).J();
        if (qDa_13.J(gg3, a322, qDa_12.I.J().J(), block, block2)) {
            gg2.J(a322, qDa_12.I.J(), yRa.d);
            qDa_12.I.J(QFa.HF.J());
        }
    }

    public boolean f() {
        qDa_1 a2;
        if (!a2.I.j.J().f(kqa.N)) {
            return uSa.E != 0;
        }
        if (a2.I.J().J().J() == Material.air) {
            return uSa.E != 0;
        }
        if (a2.I.J().nextInt(aSa.k) == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF, Block block, Block block2, Block block3) {
        Block f2;
        void b2;
        void d2;
        void e2;
        void c2;
        qDa_1 qDa_12 = block4;
        Block block4 = block3;
        qDa_1 a2 = qDa_12;
        if (!c2.J((Gg)e2, (XF)d2)) {
            return uSa.E != 0;
        }
        if (b2.J() != Material.air) {
            return uSa.E != 0;
        }
        if (f2.J() == Material.air) {
            return uSa.E != 0;
        }
        return f2.l();
    }
}

