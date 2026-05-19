/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ica
 *  LQa
 *  Mda
 *  Mha
 *  OCa
 *  Qc
 *  Rha
 *  aPa
 *  eAa
 *  eHa
 *  jFa
 *  kta
 *  oGa
 *  pqa
 *  psa
 *  vL
 *  vRa
 *  yca
 *  ysa
 */
import java.util.Collection;
import java.util.List;

public final class Bha
extends Mha {
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return Bha.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.getPlayers());
        }
        if (d2.length == uqa.g) {
            return Bha.getListOfStringsMatchingLastWord((String[])d2, (Collection)eAa.C.J());
        }
        return null;
    }

    public Bha() {
        Bha a2;
    }

    public String[] getPlayers() {
        return OCa.J().J();
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Bha a2 = this;
        return aPa.I;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        Bha a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        Bha bha;
        void b2;
        void a2;
        Bha bha2 = this;
        if (((void)a2).length < uqa.g) {
            throw new eHa(aPa.I, new Object[uSa.E]);
        }
        void v0 = b2;
        Bha c2 = Bha.getPlayer((u)v0, (String)a2[uSa.E]);
        eAa eAa2 = Bha.getItemByText((u)v0, (String)a2[vRa.d]);
        int n2 = ((void)a2).length >= yRa.d ? Bha.parseInt((String)a2[uqa.g], (int)vRa.d, (int)ysa.s) : vRa.d;
        int n3 = ((void)a2).length >= AQa.P ? Bha.parseInt((String)a2[yRa.d]) : uSa.E;
        eAa2 = new Mda(eAa2, n2, n3);
        if (((void)a2).length >= tTa.h) {
            String string = Bha.getChatComponentFromNthArg((u)b2, (String[])a2, (int)AQa.P).f();
            try {
                eAa2.J(Ica.J((String)string));
                bha = c2;
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(psa.R, objectArray);
            }
        } else {
            bha = c2;
        }
        boolean bl = ((Sx)((Object)bha)).K.f((Mda)eAa2);
        n3 = bl ? 1 : 0;
        if (bl) {
            Bha bha3 = c2;
            ((Sx)((Object)c2)).j.J((vL)bha3, FRa.ba, psa.N, ((c2.J().nextFloat() - c2.J().nextFloat()) * ZSa.q + pqa.r) * kta.v);
            ((Sx)((Object)bha3)).x.J();
        }
        if (n3 != 0 && eAa2.E <= 0) {
            eAa2.E = vRa.d;
            b2.J(Rha.AFFECTED_ITEMS, n2);
            jFa jFa2 = ((Sx)((Object)c2)).J((Mda)eAa2, uSa.E != 0);
            if (jFa2 != null) {
                jFa2.m();
            }
        } else {
            b2.J(Rha.AFFECTED_ITEMS, n2 - eAa2.E);
            jFa jFa3 = ((Sx)((Object)c2)).J((Mda)eAa2, uSa.E != 0);
            if (jFa3 != null) {
                jFa jFa4 = jFa3;
                jFa4.f();
                jFa4.l(((Sx)((Object)c2)).J());
            }
        }
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = eAa2.J();
        objectArray[vRa.d] = n2;
        objectArray[uqa.g] = ((Sx)((Object)c2)).J();
        Bha.notifyOperators((u)b2, (Qc)bha2, (String)LQa.d, (Object[])objectArray);
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return ITa.Ja;
    }
}

