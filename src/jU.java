/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ES
 *  JPa
 *  QSa
 *  SU
 *  Zw
 *  eC
 *  eS
 *  iS
 *  jsa
 *  kV
 *  mra
 *  nS
 *  nV
 *  rt
 *  sx
 *  vRa
 *  vd
 *  wI
 *  zU
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jU {
    public boolean k;
    public float j;
    public Map<MDModel, nS> J;
    private Map<eS, cw> A;
    private static final MDConfiguration I = ConfigurationService.J(MDConfiguration.class);

    public void f() {
        jU jU2 = this;
        if (zU.M.J() != jU2) {
            return;
        }
        wI wI2 = new wI();
        wI2.put((Object)Wqa.fa, (Object)QSa.la);
        jU jU3 = jU2;
        int[] nArray = new int[jU3.A.size()];
        wI wI3 = new wI();
        int[] nArray2 = new int[jU3.A.size()];
        int n2 = uSa.E;
        Iterator<cw> iterator = jU3.A.values().iterator();
        while (iterator.hasNext()) {
            cw a2 = iterator.next();
            int n3 = n2;
            nArray[n3] = a2.I.id;
            nArray2[n3] = a2.J == eS.PET_RIGHT ? vRa.d : uSa.E;
            ++n2;
            Object object = a2.A;
            if (object == null) continue;
            wI wI4 = new wI();
            object = object.J().values().iterator();
            Iterator<Object> iterator2 = object;
            while (iterator2.hasNext()) {
                eC eC2 = (eC)object.next();
                iterator2 = object;
                wI4.put((Object)eC2.J(), eC2.J());
            }
            wI3.put((Object)(a2.I.id + Mqa.y), (Object)wI4);
        }
        wI2.put((Object)opa.u, (Object)nArray);
        wI2.put((Object)jsa.J, (Object)wI3);
        wI2.put((Object)mra.Ha, (Object)nArray2);
        zU.M.f(wI2);
    }

    public jU() {
        jU a2;
        a2.j = JPa.N;
        jU jU2 = a2;
        jU2.J = new HashMap<MDModel, nS>();
        a2.A = new EnumMap<eS, cw>(eS.class);
    }

    public void J() {
        jU a2;
        a2.A.clear();
        if (zU.M.J() == a2) {
            I.J().J().clear();
        }
        a2.J(nV.J());
    }

    public void J(Map<eS, cw> map) {
        Iterator a2;
        jU jU2;
        jU jU3 = jU2 = this;
        jU3.A.clear();
        jU3.J(kV.J());
        Iterator iterator = a2 = a2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry b2 = a2.next();
            jU2.J((eS)b2.getKey(), ((cw)b2.getValue()).I, ((cw)b2.getValue()).A, uSa.E != 0);
            iterator = a2;
        }
        jU2.f();
    }

    public eS J(eS eS2) {
        jU b2 = eS2;
        jU a2 = this;
        if (b2 != eS.PET) {
            return b2;
        }
        if (!a2.A.containsKey(eS.PET_LEFT)) {
            return eS.PET_LEFT;
        }
        if (!a2.A.containsKey(eS.PET_RIGHT)) {
            return eS.PET_RIGHT;
        }
        return eS.PET_LEFT;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(eS eS2, MiniDotItem miniDotItem, rt rt2, jU jU2) {
        void b2;
        void c2;
        Object d2 = jU2;
        void v0 = c2;
        eS a2 = eS2;
        d2.A.put(a2, new cw((MiniDotItem)v0, v0.type, new rt((rt)b2)));
    }

    public void J(MiniDotItem miniDotItem) {
        Object b2 = miniDotItem;
        jU a2 = this;
        if (b2 == null) {
            return;
        }
        jU jU2 = a2;
        b2 = jU2.J((MiniDotItem)b2);
        jU2.A.remove(b2);
        a2.J(sx.J((eS)b2));
        if (zU.M.J() == a2) {
            I.J().J().remove(b2);
            a2.f();
        }
    }

    public void J(eS eS2) {
        jU b2 = eS2;
        jU a2 = this;
        if (b2 == eS.PET) {
            return;
        }
        jU jU2 = a2;
        jU2.J(jU2.A.get((Object)b2).I);
    }

    public Map<eS, cw> J() {
        jU a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public cw J(MiniDotItem miniDotItem) {
        void a2;
        jU jU2;
        jU jU3 = jU2 = this;
        Object b2 = jU3.J((MiniDotItem)a2);
        if ((b2 = jU3.A.get(b2)) != null && ((cw)b2).I.id == a2.id) {
            return b2;
        }
        return null;
    }

    public boolean J(MiniDotItem miniDotItem) {
        Object a2 = this;
        MiniDotItem b2 = miniDotItem;
        if (((jU)a2).J(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(eS eS2, jU jU2) {
        Object b2 = jU2;
        eS a2 = eS2;
        b2.A.remove(a2);
    }

    public jU(jU jU2) {
        jU b2 = jU2;
        jU a2 = this;
        a2.j = JPa.N;
        jU jU3 = a2;
        jU3.J = new HashMap<MDModel, nS>();
        if (b2 == null) {
            a2.A = new EnumMap<eS, cw>(eS.class);
            return;
        }
        a2.A = new EnumMap<eS, cw>(b2.A);
        a2.j = b2.j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eS eS2, MiniDotItem miniDotItem, rt rt2, boolean bl) {
        void v1;
        void a2;
        void b2;
        void c2;
        jU e2 = eS2;
        jU d2 = this;
        if (c2 == null) {
            return;
        }
        if (zU.M.J() == d2 && !zU.M.f((MiniDotItem)c2)) {
            return;
        }
        cw cw2 = d2.A.get(e2);
        if (cw2 != null && cw2.I.id == c2.id) {
            cw cw3 = cw2;
            cw3.A = new rt((rt)b2);
            if (zU.M.J() == d2) {
                I.J().J().put(e2, new vd(Integer.valueOf(c2.id), new rt((rt)b2)));
            }
            d2.J(Zw.J((eS)e2, (MiniDotItem)c2, (rt)b2));
            v1 = a2;
        } else {
            cw2 = ES.fromType((eS)e2);
            if (cw2 != null) {
                ArrayList<eS> arrayList = new ArrayList<eS>();
                for (eS eS3 : d2.A.keySet()) {
                    ES eS4 = ES.fromType((eS)eS3);
                    if (e2 != eS3 && (cw2 != eS4 || cw2.canCombine((eS)e2, eS3))) continue;
                    arrayList.add(eS3);
                }
                Iterator<Object> iterator = arrayList.iterator();
                Iterator<Object> iterator2 = iterator;
                while (iterator2.hasNext()) {
                    eS eS3;
                    eS3 = (eS)iterator.next();
                    iterator2 = iterator;
                    d2.J(eS3);
                }
            }
            d2.A.put((eS)e2, new cw((MiniDotItem)c2, (eS)e2, new rt((rt)b2)));
            if (zU.M.J() == d2) {
                I.J().J().put(e2, new vd(Integer.valueOf(c2.id), new rt((rt)b2)));
            }
            d2.J(SU.J((eS)e2, (MiniDotItem)c2, (rt)b2));
            v1 = a2;
        }
        if (v1 != false) {
            d2.f();
        }
    }

    public static /* synthetic */ void f(jU a2) {
        a2.A.clear();
    }

    /*
     * WARNING - void declaration
     */
    private void J(Consumer<jU> consumer) {
        jU jU2 = this;
        if (zU.M.J() == jU2) {
            int b2;
            iS[] iSArray = iS.getSynced();
            int n2 = iSArray.length;
            int n3 = b2 = uSa.E;
            while (n3 < n2) {
                void a2;
                iS iS2 = iSArray[b2];
                a2.accept(zU.M.J(iS2));
                n3 = ++b2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(eS eS2, MiniDotItem miniDotItem, rt rt2, jU jU2) {
        void b2;
        void c2;
        Object d2 = jU2;
        eS a2 = eS2;
        d2.A.put(a2, new cw((MiniDotItem)c2, a2, new rt((rt)b2)));
    }

    public MiniDotItem J(eS eS2) {
        Object b2 = eS2;
        jU a2 = this;
        if (b2 == eS.PET) {
            if (a2.A.containsKey(eS.PET_LEFT)) {
                b2 = eS.PET_LEFT;
            }
            if (a2.A.containsKey(eS.PET_RIGHT)) {
                b2 = eS.PET_RIGHT;
            }
        }
        if ((b2 = a2.A.get(b2)) == null) {
            return null;
        }
        return ((cw)b2).I;
    }

    public eS J(MiniDotItem miniDotItem) {
        MiniDotItem b2 = miniDotItem;
        jU a2 = this;
        if (!b2.type.isPet()) {
            return b2.type;
        }
        cw cw2 = a2.A.get(eS.PET_LEFT);
        cw cw3 = a2.A.get(eS.PET_RIGHT);
        if (cw2 != null && cw2.I.id == b2.id) {
            return eS.PET_LEFT;
        }
        if (cw3 != null && cw3.I.id == b2.id) {
            return eS.PET_RIGHT;
        }
        return eS.PET;
    }

    public cw J(eS eS2) {
        jU b2 = eS2;
        jU a2 = this;
        return a2.A.get(b2);
    }

    public static /* synthetic */ void J(jU a2) {
        a2.A.clear();
    }
}

