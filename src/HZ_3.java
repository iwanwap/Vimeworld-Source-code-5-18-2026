/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Mha
 *  Nb
 *  Qc
 *  Rha
 *  Tpa
 *  WSa
 *  XTa
 *  Zpa
 *  eHa
 *  fTa
 *  fia
 *  ld
 *  oGa
 *  pPa
 *  pY
 *  pua
 *  vL
 *  vRa
 *  zTa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HZ_3
implements Nb {
    private final Set<Qc> J;
    private final Map<String, Qc> A = Maps.newHashMap();
    private static final Logger I = LogManager.getLogger();

    public HZ_3() {
        HZ_3 a2;
        a2.J = Sets.newHashSet();
    }

    public int J(u u2, String string) {
        u u3;
        int n2;
        block3: {
            u c2;
            block6: {
                block4: {
                    String string2;
                    String[] stringArray;
                    String a2;
                    HZ_3 b2;
                    block5: {
                        int n3;
                        block2: {
                            c2 = u2;
                            b2 = this;
                            if ((a2 = a2.trim()).startsWith(WSa.f)) {
                                a2 = a2.substring(vRa.d);
                            }
                            stringArray = a2.split(Tpa.E);
                            string2 = stringArray[uSa.E];
                            stringArray = HZ_3.J(stringArray);
                            String string3 = string2 = b2.A.get(string2);
                            n3 = b2.J((Qc)string3, stringArray);
                            n2 = uSa.E;
                            if (string3 != null) break block2;
                            CZ cZ2 = new CZ(Zpa.r, new Object[uSa.E]);
                            u u4 = c2;
                            cZ2.J().J(pY.RED);
                            u3 = u4;
                            u4.J((ld)cZ2);
                            break block3;
                        }
                        if (!string2.canCommandSenderUseCommand(c2)) break block4;
                        if (n3 <= pua.o) break block5;
                        u u5 = c2;
                        List list = fia.J((u)u5, (String)stringArray[n3], vL.class);
                        String string4 = stringArray[n3];
                        u5.J(Rha.AFFECTED_ENTITIES, list.size());
                        for (vL vL2 : list) {
                            stringArray[n3] = vL2.J().toString();
                            if (!b2.J(c2, stringArray, (Qc)string2, a2)) continue;
                            ++n2;
                        }
                        stringArray[n3] = string4;
                        u3 = c2;
                        break block3;
                    }
                    c2.J(Rha.AFFECTED_ENTITIES, vRa.d);
                    if (!b2.J(c2, stringArray, (Qc)string2, a2)) break block6;
                    u3 = c2;
                    ++n2;
                    break block3;
                }
                CZ cZ3 = new CZ(Tqa.o, new Object[uSa.E]);
                cZ3.J().J(pY.RED);
                c2.J((ld)cZ3);
            }
            u3 = c2;
        }
        u3.J(Rha.SUCCESS_COUNT, n2);
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private int J(Qc qc2, String[] stringArray) {
        void a2;
        int c2;
        void b2;
        HZ_3 hZ_3 = this;
        if (b2 == null) {
            return pua.o;
        }
        int n2 = c2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (b2.isUsernameIndex((String[])a2, c2) && fia.f((String)a2[c2])) {
                return c2;
            }
            n2 = ++c2;
        }
        return pua.o;
    }

    private static String[] J(String[] stringArray) {
        String[] stringArray2 = stringArray;
        String[] a2 = new String[stringArray2.length - vRa.d];
        System.arraycopy(stringArray2, vRa.d, a2, uSa.E, stringArray2.length - vRa.d);
        return a2;
    }

    public Map<String, Qc> J() {
        HZ_3 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> J(u u2, String string, XF xF2) {
        void c2;
        Object d2;
        String[] b2;
        HZ_3 hZ_3 = this;
        b2 = b2.split(Tpa.E, pua.o);
        String string2 = b2[uSa.E];
        if (b2.length == vRa.d) {
            d2 = Lists.newArrayList();
            for (Map.Entry<String, Qc> entry : hZ_3.A.entrySet()) {
                if (!Mha.doesStringStartWith((String)string2, (String)entry.getKey()) || !entry.getValue().canCommandSenderUseCommand((u)c2)) continue;
                d2.add(entry.getKey());
            }
            return d2;
        }
        if (b2.length > vRa.d && (d2 = hZ_3.A.get(string2)) != null && d2.canCommandSenderUseCommand((u)c2)) {
            void a2;
            return d2.addTabCompletionOptions((u)c2, HZ_3.J(b2), (XF)a2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public List<Qc> J(u u2) {
        HZ_3 hZ_3 = this;
        ArrayList<Qc> arrayList = Lists.newArrayList();
        for (Qc qc2 : hZ_3.J) {
            void a2;
            if (!qc2.canCommandSenderUseCommand((u)a2)) continue;
            arrayList.add(qc2);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(u u2, String[] stringArray, Qc qc2, String string) {
        void d2;
        CZ b2;
        String[] e22 = stringArray;
        String[] c2 = this;
        try {
            b2.processCommand((u)d2, e22);
            return vRa.d != 0;
        }
        catch (eHa e22) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new CZ(e22.getMessage(), e22.getErrorObjects());
            b2 = new CZ(zTa.e, objectArray);
            b2.J().J(pY.RED);
            d2.J((ld)b2);
        }
        catch (oGa e22) {
            b2 = new CZ(e22.getMessage(), e22.getErrorObjects());
            b2.J().J(pY.RED);
            d2.J((ld)b2);
        }
        catch (Throwable e22) {
            void a2;
            b2 = new CZ(pPa.r, new Object[uSa.E]);
            b2.J().J(pY.RED);
            d2.J((ld)b2);
            I.warn(new StringBuilder().insert(3 ^ 3, fTa.k).append((String)a2).append(XTa.Z).toString());
        }
        return uSa.E != 0;
    }

    public Qc J(Qc qc2) {
        HZ_3 b2 = qc2;
        HZ_3 a2 = this;
        a2.A.put(b2.getCommandName(), (Qc)b2);
        a2.J.add((Qc)b2);
        Iterator iterator = b2.getCommandAliases().iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Qc qc3 = a2.A.get(string);
            if (qc3 != null && qc3.getCommandName().equals(string)) continue;
            a2.A.put(string, (Qc)b2);
        }
        return b2;
    }
}

