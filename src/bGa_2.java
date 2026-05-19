/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HY
 *  JTa
 *  Mha
 *  OCa
 *  QSa
 *  Qc
 *  aba
 *  bFa
 *  eHa
 *  ld
 *  nQa
 *  ny
 *  oGa
 *  vL
 *  vRa
 */
import com.google.gson.JsonParseException;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class bGa_2
extends Mha {
    private static final Logger LOGGER = LogManager.getLogger();

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length < uqa.g) {
            throw new eHa(eta.Ia, new Object[uSa.E]);
        }
        if (c2.length < yRa.d) {
            if (xqa.U.equals(c2[vRa.d]) || rSa.J.equals(c2[vRa.d])) {
                throw new eHa(ppa.Ja, new Object[uSa.E]);
            }
            if (QSa.E.equals(c2[vRa.d])) {
                throw new eHa(nQa.m, new Object[uSa.E]);
            }
        }
        bFa bFa2 = bGa_2.getPlayer((u)b2, (String)c2[uSa.E]);
        aba aba2 = aba.byName((String)c2[vRa.d]);
        if (aba2 != aba.CLEAR && aba2 != aba.RESET) {
            ld ld2;
            if (aba2 == aba.TIMES) {
                if (c2.length != tTa.h) {
                    throw new eHa(eta.Ia, new Object[uSa.E]);
                }
                int n2 = bGa_2.parseInt((String)c2[uqa.g]);
                int n3 = bGa_2.parseInt((String)c2[yRa.d]);
                int n4 = bGa_2.parseInt((String)c2[AQa.P]);
                Gca gca = new Gca(n2, n3, n4);
                bFa2.I.J(gca);
                bGa_2.notifyOperators((u)b2, (Qc)a2, (String)oQa.Ja, (Object[])new Object[uSa.E]);
                return;
            }
            if (c2.length < yRa.d) {
                throw new eHa(eta.Ia, new Object[uSa.E]);
            }
            String string = bGa_2.buildString((String[])c2, (int)uqa.g);
            try {
                ld2 = HY.J((String)string);
            }
            catch (JsonParseException jsonParseException) {
                Throwable throwable = ExceptionUtils.getRootCause(jsonParseException);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = throwable == null ? Mqa.y : throwable.getMessage();
                throw new lha(JTa.f, objectArray);
            }
            Gca gca = new Gca(aba2, ny.J((u)b2, (ld)ld2, (vL)bFa2));
            bFa2.I.J(gca);
            bGa_2.notifyOperators((u)b2, (Qc)a2, (String)oQa.Ja, (Object[])new Object[uSa.E]);
            return;
        }
        if (c2.length != uqa.g) {
            throw new eHa(eta.Ia, new Object[uSa.E]);
        }
        Gca gca = new Gca(aba2, null);
        bFa2.I.J(gca);
        bGa_2.notifyOperators((u)b2, (Qc)a2, (String)oQa.Ja, (Object[])new Object[uSa.E]);
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return bGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        if (d2.length == uqa.g) {
            return bGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])aba.getNames());
        }
        return null;
    }

    public bGa_2() {
        bGa_2 a2;
    }

    public String getCommandName() {
        return xqa.U;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        bGa_2 a2 = this;
        return eta.Ia;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        bGa_2 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

