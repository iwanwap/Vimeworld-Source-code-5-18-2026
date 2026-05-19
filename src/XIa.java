/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  Dga
 *  GDa
 *  HFa
 *  Iea
 *  MEa
 *  ODa
 *  Rea
 *  TDa
 *  UEa
 *  Yda
 *  ZFa
 *  aea
 *  cfa
 *  cga
 *  ega
 *  lEa
 *  mEa
 *  mFa
 *  nFa
 *  nda
 *  pDa
 *  uda
 *  vea
 *  xfa
 *  zda
 *  zfa
 */
import com.google.common.collect.Maps;
import java.util.HashMap;

public final class XIa {
    private static final HashMap<Class, eIa> I = Maps.newHashMap();

    public XIa() {
        XIa a2;
    }

    public static eIa J(Class a2) {
        return I.get(a2);
    }

    static {
        I.put(mEa.class, eIa.ON_GROUND);
        I.put(aEa.class, eIa.ON_GROUND);
        I.put(aDa.class, eIa.ON_GROUND);
        I.put(Rea.class, eIa.ON_GROUND);
        I.put(TDa.class, eIa.ON_GROUND);
        I.put(ODa.class, eIa.ON_GROUND);
        I.put(zda.class, eIa.ON_GROUND);
        I.put(cfa.class, eIa.ON_GROUND);
        I.put(ZFa.class, eIa.ON_GROUND);
        I.put(Iea.class, eIa.ON_GROUND);
        I.put(HFa.class, eIa.IN_WATER);
        I.put(DDa.class, eIa.ON_GROUND);
        I.put(xfa.class, eIa.ON_GROUND);
        I.put(mFa.class, eIa.ON_GROUND);
        I.put(pDa.class, eIa.ON_GROUND);
        I.put(IDa.class, eIa.ON_GROUND);
        I.put(Zfa.class, eIa.ON_GROUND);
        I.put(aea.class, eIa.ON_GROUND);
        I.put(zfa.class, eIa.ON_GROUND);
        I.put(vea.class, eIa.ON_GROUND);
        I.put(uda.class, eIa.ON_GROUND);
        I.put(Yda.class, eIa.ON_GROUND);
        I.put(UEa.class, eIa.ON_GROUND);
        I.put(GDa.class, eIa.IN_WATER);
        I.put(ega.class, eIa.ON_GROUND);
        I.put(MEa.class, eIa.ON_GROUND);
        I.put(qda.class, eIa.ON_GROUND);
        I.put(lEa.class, eIa.ON_GROUND);
        I.put(cga.class, eIa.ON_GROUND);
        I.put(Dga.class, eIa.ON_GROUND);
        I.put(nFa.class, eIa.ON_GROUND);
        I.put(nda.class, eIa.ON_GROUND);
    }
}

