/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Cra
 *  Cz
 *  DQa
 *  Dha
 *  Dy
 *  Gg
 *  ISa
 *  Iy
 *  JTa
 *  Ny
 *  Paa
 *  Pqa
 *  QFa
 *  SY
 *  Sz
 *  Waa
 *  Xsa
 *  Xz
 *  aZ
 *  aaa
 *  dz
 *  fy
 *  kZ
 *  kpa
 *  kta
 *  mra
 *  nZ
 *  pua
 *  qX
 *  sX
 *  tZ
 *  uOa
 *  uQa
 *  uY
 *  vRa
 *  wPa
 *  yra
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukebox$TileEntityJukebox;
import net.minecraft.block.state.IBlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class uY_1 {
    public boolean tileEntityInvalid;
    public Block blockType;
    private static Map<Class<? extends uY>, String> classToNameMap;
    private int blockMetadata;
    private static final Logger logger;
    public XF pos = XF.ORIGIN;
    public Gg worldObj;
    private static Map<String, Class<? extends uY>> nameToClassMap;

    public void e() {
        uY_1 a2;
        uY_1 uY_12 = a2;
        uY_12.blockType = null;
        uY_12.blockMetadata = pua.o;
    }

    public static /* synthetic */ Map J() {
        return classToNameMap;
    }

    public boolean d() {
        uY_1 a2;
        return a2.tileEntityInvalid;
    }

    private static void J(Class<? extends uY> clazz, String string) {
        String b2 = string;
        Class<? extends uY> a2 = clazz;
        if (nameToClassMap.containsKey(b2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, nOa.O).append(b2).toString());
        }
        nameToClassMap.put(b2, a2);
        classToNameMap.put(a2, b2);
    }

    public int C() {
        uY_1 uY_12 = this;
        if (uY_12.blockMetadata == pua.o) {
            IBlockState a2 = uY_12.worldObj.J(uY_12.pos);
            uY_12.blockMetadata = a2.J().f(a2);
        }
        return uY_12.blockMetadata;
    }

    public void f() {
        uY_1 uY_12 = this;
        if (uY_12.worldObj != null) {
            uY_1 uY_13 = uY_12;
            uY_1 uY_14 = uY_12;
            IBlockState a2 = uY_13.worldObj.J(uY_14.pos);
            uY_13.blockMetadata = a2.J().f(a2);
            uY_14.worldObj.J(uY_12.pos, (uY)uY_12);
            if (uY_13.J() != QFa.HF) {
                uY_1 uY_15 = uY_12;
                uY_15.worldObj.J(uY_15.pos, uY_12.J());
            }
        }
    }

    public void d() {
        a.tileEntityInvalid = vRa.d;
    }

    public void C() {
        a.tileEntityInvalid = uSa.E;
    }

    public void J(Gg gg2) {
        uY_1 b2 = gg2;
        uY_1 a2 = this;
        a2.worldObj = b2;
    }

    public XF J() {
        uY_1 a2;
        return a2.pos;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        uY_1 a2 = this;
        return uSa.E != 0;
    }

    public KC J() {
        return null;
    }

    public double J(double c2, double b2, double a2) {
        uY_1 d2;
        uY_1 uY_12 = d2;
        c2 = (double)uY_12.pos.getX() + kTa.B - c2;
        b2 = (double)uY_12.pos.getY() + kTa.B - b2;
        a2 = (double)uY_12.pos.getZ() + kTa.B - a2;
        double d3 = c2;
        double d4 = b2;
        double d5 = a2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public void J(XF xF2) {
        Object b2 = xF2;
        uY_1 a2 = this;
        a2.pos = b2;
    }

    public double C() {
        return Psa.t;
    }

    public Block J() {
        uY_1 a2;
        if (a2.blockType == null) {
            a2.blockType = a2.worldObj.J(a2.pos).J();
        }
        return a2.blockType;
    }

    public Gg f() {
        uY_1 a2;
        return a2.worldObj;
    }

    public void J(Dha dha) {
        uY_1 b2 = dha;
        uY_1 a2 = this;
        b2.J(DQa.N, (Callable)new SY((uY)a2));
        if (a2.worldObj != null) {
            uY_1 uY_12 = b2;
            Dha.J((Dha)uY_12, (XF)a2.pos, (Block)a2.J(), (int)a2.C());
            uY_12.J(PQa.J, (Callable)new sX((uY)a2));
            uY_12.J(Jta.I, (Callable)new Dy((uY)a2));
        }
    }

    static {
        logger = LogManager.getLogger();
        nameToClassMap = Maps.newHashMap();
        classToNameMap = Maps.newHashMap();
        uY_1.J(jX.class, MTa.T);
        uY_1.J(Fz.class, wPa.fa);
        uY_1.J(Paa.class, Cra.W);
        uY_1.J(BlockJukebox$TileEntityJukebox.class, fta.S);
        uY_1.J(dz.class, dqa.Y);
        uY_1.J(Ny.class, yra.s);
        uY_1.J(aaa.class, zpa.s);
        uY_1.J(Caa.class, uQa.O);
        uY_1.J(Gz.class, kpa.Aa);
        uY_1.J(nZ.class, rRa.U);
        uY_1.J(Xz.class, Xsa.X);
        uY_1.J(aZ.class, fPa.o);
        uY_1.J(jY.class, Ata.u);
        uY_1.J(kz.class, ISa.L);
        uY_1.J(Cz.class, lTa.j);
        uY_1.J(fy.class, WRa.M);
        uY_1.J(Iy.class, kta.F);
        uY_1.J(qX.class, wsa.o);
        uY_1.J(kZ.class, POa.ha);
        uY_1.J(Sz.class, Pqa.g);
        uY_1.J(tZ.class, mra.c);
    }

    public void f(Waa waa2) {
        uY_1 a2;
        uY_1 b2 = waa2;
        uY_1 uY_12 = a2 = this;
        uY_12.pos = new XF(b2.J(rRa.X), b2.J(uOa.Ja), b2.J(oua.v));
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        void a2;
        Object object = this;
        String b2 = classToNameMap.get(object.getClass());
        if (b2 == null) {
            throw new RuntimeException(object.getClass() + JTa.U);
        }
        void v0 = a2;
        v0.J(QTa.O, b2);
        v0.J(rRa.X, ((uY_1)object).pos.getX());
        v0.J(uOa.Ja, ((uY_1)object).pos.getY());
        v0.J(oua.v, ((uY_1)object).pos.getZ());
    }

    public uY_1() {
        uY_1 a2;
        a2.blockMetadata = pua.o;
    }

    public static uY J(Waa waa2) {
        Waa waa3 = waa2;
        Object a2 = null;
        try {
            Class<? extends uY> clazz = nameToClassMap.get(waa3.J(QTa.O));
            if (clazz != null) {
                a2 = (uY_1)clazz.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (a2 != null) {
            Waa waa4 = a2;
            waa4.f(waa3);
            return waa4;
        }
        logger.warn(new StringBuilder().insert(3 & 4, Fua.C).append(waa3.J(QTa.O)).toString());
        return a2;
    }

    public boolean C() {
        return uSa.E != 0;
    }

    public boolean f() {
        uY_1 a2;
        if (a2.worldObj != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

