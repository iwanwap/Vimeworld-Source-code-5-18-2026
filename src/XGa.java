/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ica
 *  Lz
 *  Mha
 *  NQa
 *  NTa
 *  PIa
 *  Qc
 *  SOa
 *  Waa
 *  Yfa
 *  cEa
 *  eHa
 *  hra
 *  oA
 *  oGa
 *  pQa
 *  vL
 *  vRa
 *  yca
 */
import java.util.Collection;
import java.util.List;

public final class XGa
extends Mha {
    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return XGa.getListOfStringsMatchingLastWord((String[])d2, (Collection)PIa.J());
        }
        if (d2.length > vRa.d && d2.length <= AQa.P) {
            void a2;
            return XGa.func_175771_a((String[])d2, (int)vRa.d, (XF)a2);
        }
        return null;
    }

    public XGa() {
        XGa a2;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        XF xF;
        XGa c2;
        Gg gg2;
        void b2;
        XF a2;
        XGa xGa = this;
        if (((void)a2).length < vRa.d) {
            throw new eHa(pQa.D, new Object[uSa.E]);
        }
        void v0 = a2;
        vL vL2 = v0[uSa.E];
        void v1 = b2;
        XF xF2 = v1.J();
        Lz lz2 = v1.J();
        double d2 = lz2.A;
        double d3 = lz2.j;
        double d4 = lz2.J;
        if (((void)v0).length >= AQa.P) {
            d2 = XGa.parseDouble((double)d2, (String)a2[vRa.d], vRa.d != 0);
            d3 = XGa.parseDouble((double)d3, (String)a2[uqa.g], uSa.E != 0);
            d4 = XGa.parseDouble((double)d4, (String)a2[yRa.d], vRa.d != 0);
            xF2 = new XF(d2, d3, d4);
        }
        if (!(gg2 = b2.J()).F(xF2)) {
            throw new oGa(FRa.F, new Object[uSa.E]);
        }
        if (NQa.U.equals(vL2)) {
            Gg gg3 = gg2;
            Gg gg4 = gg2;
            gg4.J((vL)new cEa(gg4, d2, d3, d4));
            XGa.notifyOperators((u)b2, (Qc)xGa, (String)Nta.C, (Object[])new Object[uSa.E]);
            return;
        }
        xF2 = new Waa();
        int n2 = uSa.E;
        if (((void)a2).length >= tTa.h) {
            c2 = XGa.getChatComponentFromNthArg((u)b2, (String[])a2, (int)AQa.P);
            try {
                xF2 = Ica.J((String)c2.f());
                n2 = vRa.d;
                xF = xF2;
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(KPa.X, objectArray);
            }
        } else {
            xF = xF2;
        }
        xF.J(QTa.O, (String)vL2);
        try {
            c2 = PIa.J((Waa)xF2, (Gg)gg2);
        }
        catch (RuntimeException runtimeException) {
            throw new oGa(rSa.y, new Object[uSa.E]);
        }
        if (c2 == null) {
            throw new oGa(rSa.y, new Object[uSa.E]);
        }
        XGa xGa2 = c2;
        c2.f(d2, d3, d4, ((vL)xGa2).X, ((vL)xGa2).d);
        if (n2 == 0 && c2 instanceof Yfa) {
            ((Yfa)c2).J(gg2.J(new XF((vL)c2)), (oA)null);
        }
        gg2.f((vL)c2);
        XGa xGa3 = c2;
        a2 = xF2;
        XGa xGa4 = xGa3;
        while (xGa4 != null && a2.J(SOa.Ga, NTa.C)) {
            vL2 = PIa.J((Waa)a2.J(SOa.Ga), (Gg)gg2);
            if (vL2 != null) {
                vL vL3 = vL2;
                vL vL4 = vL2;
                vL3.f(d2, d3, d4, vL4.X, vL4.d);
                gg2.f(vL3);
                xGa3.l(vL2);
            }
            xGa3 = vL2;
            a2 = a2.J(SOa.Ga);
            xGa4 = xGa3;
        }
        XGa.notifyOperators((u)b2, (Qc)xGa, (String)Nta.C, (Object[])new Object[uSa.E]);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        XGa a2 = this;
        return pQa.D;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return hra.G;
    }
}

