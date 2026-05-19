/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HY
 *  JTa
 *  Mha
 *  OCa
 *  Qsa
 *  TQa
 *  bFa
 *  eHa
 *  ld
 *  ny
 *  oGa
 *  vL
 *  vRa
 */
import com.google.gson.JsonParseException;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

public final class Mia_3
extends Mha {
    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public Mia_3() {
        Mia_3 a2;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        Mia_3 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getCommandName() {
        return TQa.e;
    }

    public void processCommand(u u2, String[] stringArray) throws oGa {
        Throwable b2;
        ld c22 = stringArray;
        String[] a2 = this;
        if (((String[])c22).length < uqa.g) {
            throw new eHa(Qsa.o, new Object[uSa.E]);
        }
        bFa bFa2 = Mia_3.getPlayer((u)((Object)b2), (String)c22[uSa.E]);
        c22 = Mia_3.buildString((String[])c22, (int)vRa.d);
        try {
            c22 = HY.J((String)c22);
            bFa bFa3 = bFa2;
            bFa3.J(ny.J((u)((Object)b2), (ld)c22, (vL)bFa3));
            return;
        }
        catch (JsonParseException c22) {
            b2 = ExceptionUtils.getRootCause(c22);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2 == null ? Mqa.y : b2.getMessage();
            throw new lha(JTa.f, objectArray);
        }
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Mia_3 a2 = this;
        return Qsa.o;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return Mia_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }
}

