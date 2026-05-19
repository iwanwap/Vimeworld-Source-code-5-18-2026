/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  C
 *  Dha
 *  Jja
 *  MZ
 *  NQa
 *  RIa
 *  Rd
 *  Se
 *  U
 *  VJa
 *  Vua
 *  Yja
 *  aJa
 *  fLa
 *  h
 *  j
 *  kta
 *  vRa
 *  xb
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aJa_3
implements h,
j {
    private final Map M;
    private final List k;
    private static final String j = "CL_00001064";
    private U J;
    private static final Logger A = LogManager.getLogger();
    private final Map I;

    public void J() {
        aJa_3 aJa_32 = this;
        for (Map.Entry a22 : aJa_32.M.entrySet()) {
            ResourceLocation resourceLocation = (ResourceLocation)a22.getKey();
            H a22 = (H)a22.getValue();
            if (!(a22 instanceof fLa)) continue;
            aJa_32.J(resourceLocation, a22);
        }
    }

    public H J(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        aJa_3 a2 = this;
        return (H)a2.M.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(ResourceLocation resourceLocation) {
        void a2;
        Object object = this;
        H b2 = ((aJa_3)object).J((ResourceLocation)a2);
        if (b2 != null) {
            ((aJa_3)object).M.remove(a2);
            gLa.J(b2.J());
        }
    }

    public void f() {
        Object a2;
        aJa_3 aJa_32 = this;
        Object object = a2 = aJa_32.k.iterator();
        while (object.hasNext()) {
            ((h)a2.next()).f();
            object = a2;
        }
    }

    public aJa_3(U u2) {
        aJa_3 a2;
        aJa_3 b2 = u2;
        aJa_3 aJa_32 = a2 = this;
        a2.M = Maps.newHashMap();
        aJa_32.k = Lists.newArrayList();
        aJa_32.I = Maps.newHashMap();
        aJa_32.J = b2;
    }

    public void J(ResourceLocation resourceLocation) {
        Object b2;
        ResourceLocation a2;
        aJa_3 aJa_32 = this;
        if (Config.Q()) {
            a2 = Se.J((ResourceLocation)a2);
        }
        if ((b2 = (H)aJa_32.M.get(a2)) == null) {
            b2 = new Jja(a2);
            aJa_32.J(a2, (H)b2);
        }
        if (Config.h()) {
            xb.J((H)((H)b2));
            return;
        }
        gLa.f(((H)b2).J());
    }

    public void J(U u2) {
        Object b2;
        Object object;
        aJa_3 aJa_32 = this;
        Config.f(Vua.ja);
        Config.e(new StringBuilder().insert(2 & 5, yOa.e).append(Config.l()).toString());
        Iterator a2 = aJa_32.M.keySet().iterator();
        while (a2.hasNext()) {
            object = (ResourceLocation)a2.next();
            b2 = ((ResourceLocation)object).J();
            if (!((String)b2).startsWith(ITa.T) && !((String)b2).startsWith(xua.g)) continue;
            H h2 = (H)aJa_32.M.get(object);
            if (h2 instanceof Rd) {
                ((Rd)h2).l();
            }
            a2.remove();
        }
        Object object2 = object = aJa_32.M.entrySet().iterator();
        while (object2.hasNext()) {
            b2 = object.next();
            aJa_32.J((ResourceLocation)((Map.Entry)b2).getKey(), (H)((Map.Entry)b2).getValue());
            object2 = object;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ResourceLocation resourceLocation, H h2) {
        void b2;
        H c2 = h2;
        aJa_3 a2 = this;
        a2.M.put(b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(ResourceLocation resourceLocation, H h2) {
        void b2;
        aJa_3 aJa_32;
        void a2;
        aJa_3 aJa_33 = this;
        int n2 = vRa.d;
        VJa vJa2 = a2;
        try {
            a2.J(aJa_33.J);
            aJa_32 = aJa_33;
        }
        catch (IOException c22) {
            A.warn(new StringBuilder().insert(3 & 4, kta.p).append(b2).toString(), (Throwable)c22);
            vJa2 = gLa.J;
            aJa_3 aJa_34 = aJa_33;
            aJa_32 = aJa_34;
            aJa_34.M.put(b2, vJa2);
            n2 = uSa.E;
        }
        catch (Throwable c22) {
            RIa c22 = RIa.J((Throwable)c22, (String)tua.O);
            Dha dha = c22.J(ITa.fa);
            dha.J(xSa.x, (Object)b2);
            dha.J(Era.Fa, (Callable)new Yja((aJa)aJa_33, (H)a2));
            throw new MZ(c22);
        }
        aJa_32.M.put(b2, vJa2);
        return n2 != 0;
    }

    public void J(C c2) {
        aJa_3 b2 = c2;
        aJa_3 a2 = this;
        a2.k.add(b2);
    }

    public ResourceLocation J(String string, VJa vJa2) {
        aJa_3 aJa_32;
        Object c2;
        VJa a2;
        ResourceLocation b2;
        aJa_3 aJa_33 = this;
        if (((String)((Object)b2)).equals(Fsa.k)) {
            a2 = Config.J(a2);
        }
        if ((c2 = (Integer)aJa_33.I.get(b2)) == null) {
            c2 = vRa.d;
            aJa_32 = aJa_33;
        } else {
            c2 = (Integer)c2 + vRa.d;
            aJa_32 = aJa_33;
        }
        aJa_32.I.put(b2, c2);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2;
        objectArray[vRa.d] = c2;
        ResourceLocation resourceLocation = b2 = new ResourceLocation(String.format(NQa.W, objectArray));
        aJa_33.J(resourceLocation, (H)a2);
        return resourceLocation;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(ResourceLocation resourceLocation, C c2) {
        void b2;
        aJa_3 a2 = this;
        aJa_3 c3 = c2;
        if (a2.J((ResourceLocation)b2, (H)((Object)c3))) {
            a2.k.add(c3);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

