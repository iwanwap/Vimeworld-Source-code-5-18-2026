/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gfa
 *  Nda
 *  PDa
 *  QFa
 *  REa
 *  RFa
 *  Tea
 *  Tz
 *  Uta
 *  bb
 *  cDa
 *  eAa
 *  hfa
 *  iDa
 *  jDa
 *  tfa
 *  vRa
 */
import java.io.PrintStream;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockFire;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class TEa_3 {
    private static boolean J;
    private static final Logger A;
    private static final PrintStream I;

    public static void J(String a2) {
        I.println(a2);
    }

    public TEa_3() {
        TEa_3 a2;
    }

    private static void l() {
        System.setErr(new zY(pta.g, System.err));
        System.setOut(new zY(Uta.K, I));
    }

    public static void f() {
        if (!J) {
            J = vRa.d;
            if (A.isDebugEnabled()) {
                TEa_3.l();
            }
            Block.J();
            BlockFire.l();
            eAa.J();
            Tz.l();
            TEa_3.J();
        }
    }

    static {
        I = System.out;
        J = uSa.E;
        A = LogManager.getLogger();
    }

    public static boolean J() {
        return J;
    }

    public static void J() {
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Ma, (bb)new eFa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.C, (bb)new REa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Pd, (bb)new VDa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Tb, (bb)new tfa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.aa, new gDa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.SB, (bb)new Nda());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Wa, (bb)new vEa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.j, (bb)new jDa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.ba, (bb)new Tea());
        iDa iDa2 = new iDa();
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.eb, (bb)iDa2);
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Ba, (bb)iDa2);
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Ca, (bb)new SFa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.S, (bb)new PDa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.Q, (bb)new RFa());
        BlockDispenser.dispenseBehaviorRegistry.J(eAa.J((Block)QFa.Lc), (bb)new Gfa());
        BlockDispenser.dispenseBehaviorRegistry.J(Gea.GB, (bb)new hfa());
        BlockDispenser.dispenseBehaviorRegistry.J(eAa.J((Block)QFa.s), (bb)new cDa());
    }
}

