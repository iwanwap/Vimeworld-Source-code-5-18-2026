/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  DQa
 *  FPa
 *  HE
 *  Kpa
 *  Mha
 *  NTa
 *  OCa
 *  Oz
 *  Qc
 *  TQa
 *  Tpa
 *  VQa
 *  WIa
 *  WSa
 *  XTa
 *  eHa
 *  fsa
 *  gEa
 *  jia
 *  ld
 *  nra
 *  oGa
 *  pY
 *  pua
 *  qF
 *  tQa
 *  uA
 *  vRa
 *  xOa
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class jia_2
extends Mha {
    private QOa audio;
    private boolean vol;
    private static final Logger logger = LogManager.getLogger();
    private tQa out;

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        Object c22;
        Qc a2;
        jia_2 jia_22;
        block11: {
            jia_22 = this;
            if (((void)a2).length == 0 || !a2[uSa.E].equals(pta.o)) break block11;
            c22 = new ArrayList<String>(WF.e);
            c22.remove(b2.J());
            if (c22.size() > yRa.d) {
                c22.clear();
            }
            c22.add(new StringBuilder().insert(3 >> 2, xOa.l).append(c22.size()).toString());
            Kpa.J().J(rIa.J((u)b2, (List)c22));
            return;
        }
        try {
            if (((void)a2).length != 0 && a2[uSa.E].equals(tTa.k)) {
                c22 = nra.J((uA)new CGa((jia)jia_22), (String)dua.T, (String)FPa.v, (int)fsa.R, (byte[])new byte[fPa.i], (byte[])new byte[Yqa.i]);
                c22.J();
                c22.J(vRa.d != 0, vRa.d != 0, Duration.ofSeconds(Bra.I));
                b2.J((ld)new CY(VQa.R));
                return;
            }
        }
        catch (Throwable c22) {
            logger.warn(lQa.e, c22);
        }
        c22 = jia_22.getSortedPossibleCommands((u)b2);
        int n2 = (c22.size() - vRa.d) / XTa.W;
        int n3 = uSa.E;
        try {
            n3 = ((void)a2).length == 0 ? uSa.E : jia_2.parseInt((String)a2[uSa.E], (int)vRa.d, (int)(n2 + vRa.d)) - vRa.d;
        }
        catch (WIa wIa) {
            Map<String, Qc> map = jia_22.getCommands();
            Qc qc2 = map.get(a2[uSa.E]);
            if (qc2 != null) {
                throw new eHa(qc2.getCommandUsage((u)b2), new Object[uSa.E]);
            }
            if (Oz.J((String)a2[uSa.E], (int)pua.o) != pua.o) {
                throw wIa;
            }
            throw new zia();
        }
        int n4 = Math.min((n3 + vRa.d) * XTa.W, c22.size());
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = n3 + vRa.d;
        objectArray[vRa.d] = n2 + vRa.d;
        CZ cZ2 = new CZ(DQa.H, objectArray);
        cZ2.J().J(pY.DARK_GREEN);
        b2.J((ld)cZ2);
        int n5 = n3 * XTa.W;
        int n6 = n5;
        while (n6 < n4) {
            a2 = (Qc)c22.get(n5);
            CZ cZ3 = new CZ(a2.getCommandUsage((u)b2), new Object[uSa.E]);
            cZ3.J().J(new PEa(gEa.SUGGEST_COMMAND, new StringBuilder().insert(2 & 5, WSa.f).append(a2.getCommandName()).append(Tpa.E).toString()));
            b2.J((ld)cZ3);
            n6 = ++n5;
        }
        if (n3 == 0 && b2 instanceof Sx) {
            CZ cZ4 = new CZ(zta.i, new Object[uSa.E]);
            cZ4.J().J(pY.GREEN);
            b2.J((ld)cZ4);
        }
    }

    public int getRequiredPermissionLevel() {
        return uSa.E;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        jia_2 a2 = this;
        return nOa.b;
    }

    public Map<String, Qc> getCommands() {
        return OCa.J().J().J();
    }

    public static /* synthetic */ void lambda$processCommand$0(u u2, List list) {
        List b2 = list;
        u a2 = u2;
        WF.J(a2.J(), b2, HE.OFF, NTa.C, new ArrayList<qF>());
    }

    public List<Qc> getSortedPossibleCommands(u u2) {
        Object b2 = u2;
        jia_2 a2 = this;
        List list = OCa.J().J().J((u)b2);
        Collections.sort(list);
        return list;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            Set<String> c2;
            Set<String> set = c2 = b2.getCommands().keySet();
            return jia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])set.toArray(new String[set.size()]));
        }
        return null;
    }

    public jia_2() {
        jia_2 a2;
        jia_2 jia_22 = a2;
        jia_22.out = null;
        jia_22.audio = null;
        jia_22.vol = uSa.E;
    }

    public List<String> getCommandAliases() {
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = vRa.A;
        return Arrays.asList(stringArray);
    }

    public static /* synthetic */ Logger access$000() {
        return logger;
    }

    public String getCommandName() {
        return TQa.S;
    }
}

