/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  CZ
 *  Lra
 *  Mha
 *  NPa
 *  NQa
 *  OCa
 *  Oz
 *  Qc
 *  Qqa
 *  Rha
 *  Spa
 *  Usa
 *  Vua
 *  ZRa
 *  aSa
 *  asa
 *  eHa
 *  hTa
 *  jRa
 *  ld
 *  oGa
 *  pPa
 *  vRa
 *  ysa
 *  zsa
 */
import java.util.List;

public final class DGa
extends Mha {
    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return opa.q;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        DGa a2 = this;
        return jRa.A;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[uua.p];
            stringArray2[uSa.E] = pta.G;
            stringArray2[vRa.d] = ITa.F;
            stringArray2[uqa.g] = lQa.I;
            stringArray2[yRa.d] = oQa.o;
            stringArray2[AQa.P] = Qra.U;
            stringArray2[tTa.h] = Bsa.a;
            return DGa.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == uqa.g && d2[uSa.E].equals(lQa.I)) {
            String[] stringArray3 = new String[uqa.g];
            stringArray3[uSa.E] = Wqa.Da;
            stringArray3[vRa.d] = NQa.Z;
            return DGa.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray3);
        }
        if (d2.length >= uqa.g && d2.length <= yRa.d && d2[uSa.E].equals(ITa.F)) {
            void a2;
            return DGa.func_181043_b((String[])d2, (int)vRa.d, (XF)a2);
        }
        if (d2.length == uqa.g && d2[uSa.E].equals(oQa.o)) {
            String[] stringArray4 = new String[uqa.g];
            stringArray4[uSa.E] = vsa.G;
            stringArray4[vRa.d] = tua.v;
            return DGa.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray4);
        }
        return null;
    }

    public DGa() {
        DGa a2;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length < vRa.d) {
            throw new eHa(jRa.A, new Object[uSa.E]);
        }
        PX pX = a2.getWorldBorder();
        if (c2[uSa.E].equals(pta.G)) {
            long l2;
            if (c2.length != uqa.g && c2.length != yRa.d) {
                throw new eHa(Lra.g, new Object[uSa.E]);
            }
            double d2 = pX.G();
            double d3 = DGa.parseDouble((String)c2[vRa.d], (double)oua.i, (double)uqa.M);
            long l3 = l2 = c2.length > uqa.g ? DGa.parseLong((String)c2[uqa.g], (long)nqa.i, (long)dsa.p) * asa.fa : nqa.i;
            if (l2 > nqa.i) {
                double d4 = d2;
                pX.J(d4, d3, l2);
                if (d4 > d3) {
                    Object[] objectArray = new Object[yRa.d];
                    Object[] objectArray2 = new Object[vRa.d];
                    objectArray2[uSa.E] = d3;
                    objectArray[uSa.E] = String.format(xTa.C, objectArray2);
                    Object[] objectArray3 = new Object[vRa.d];
                    objectArray3[uSa.E] = d2;
                    objectArray[vRa.d] = String.format(xTa.C, objectArray3);
                    objectArray[uqa.g] = Long.toString(l2 / asa.fa);
                    DGa.notifyOperators((u)b2, (Qc)a2, (String)ZRa.Da, (Object[])objectArray);
                    return;
                }
                Object[] objectArray = new Object[yRa.d];
                Object[] objectArray4 = new Object[vRa.d];
                objectArray4[uSa.E] = d3;
                objectArray[uSa.E] = String.format(xTa.C, objectArray4);
                Object[] objectArray5 = new Object[vRa.d];
                objectArray5[uSa.E] = d2;
                objectArray[vRa.d] = String.format(xTa.C, objectArray5);
                objectArray[uqa.g] = Long.toString(l2 / asa.fa);
                DGa.notifyOperators((u)b2, (Qc)a2, (String)ysa.O, (Object[])objectArray);
                return;
            }
            pX.J(d3);
            Object[] objectArray = new Object[uqa.g];
            Object[] objectArray6 = new Object[vRa.d];
            objectArray6[uSa.E] = d3;
            objectArray[uSa.E] = String.format(xTa.C, objectArray6);
            Object[] objectArray7 = new Object[vRa.d];
            objectArray7[uSa.E] = d2;
            objectArray[vRa.d] = String.format(xTa.C, objectArray7);
            DGa.notifyOperators((u)b2, (Qc)a2, (String)Nta.g, (Object[])objectArray);
            return;
        }
        if (c2[uSa.E].equals(Qra.U)) {
            double d5;
            if (c2.length != uqa.g && c2.length != yRa.d) {
                throw new eHa(Qqa.Fa, new Object[uSa.E]);
            }
            PX pX2 = pX;
            double d6 = d5 = pX2.A();
            double d7 = d6 + DGa.parseDouble((String)c2[vRa.d], (double)(-d6), (double)(uqa.M - d5));
            long l4 = pX2.J() + (c2.length > uqa.g ? DGa.parseLong((String)c2[uqa.g], (long)nqa.i, (long)dsa.p) * asa.fa : nqa.i);
            if (l4 > nqa.i) {
                double d8 = d5;
                pX.J(d8, d7, l4);
                void v14 = b2;
                if (d8 > d7) {
                    Object[] objectArray = new Object[yRa.d];
                    Object[] objectArray8 = new Object[vRa.d];
                    objectArray8[uSa.E] = d7;
                    objectArray[uSa.E] = String.format(xTa.C, objectArray8);
                    Object[] objectArray9 = new Object[vRa.d];
                    objectArray9[uSa.E] = d5;
                    objectArray[vRa.d] = String.format(xTa.C, objectArray9);
                    objectArray[uqa.g] = Long.toString(l4 / asa.fa);
                    DGa.notifyOperators((u)v14, (Qc)a2, (String)ZRa.Da, (Object[])objectArray);
                    return;
                }
                Object[] objectArray = new Object[yRa.d];
                Object[] objectArray10 = new Object[vRa.d];
                objectArray10[uSa.E] = d7;
                objectArray[uSa.E] = String.format(xTa.C, objectArray10);
                Object[] objectArray11 = new Object[vRa.d];
                objectArray11[uSa.E] = d5;
                objectArray[vRa.d] = String.format(xTa.C, objectArray11);
                objectArray[uqa.g] = Long.toString(l4 / asa.fa);
                DGa.notifyOperators((u)v14, (Qc)a2, (String)ysa.O, (Object[])objectArray);
                return;
            }
            pX.J(d7);
            Object[] objectArray = new Object[uqa.g];
            Object[] objectArray12 = new Object[vRa.d];
            objectArray12[uSa.E] = d7;
            objectArray[uSa.E] = String.format(xTa.C, objectArray12);
            Object[] objectArray13 = new Object[vRa.d];
            objectArray13[uSa.E] = d5;
            objectArray[vRa.d] = String.format(xTa.C, objectArray13);
            DGa.notifyOperators((u)b2, (Qc)a2, (String)Nta.g, (Object[])objectArray);
            return;
        }
        if (c2[uSa.E].equals(ITa.F)) {
            XF xF;
            if (c2.length != yRa.d) {
                throw new eHa(Ira.q, new Object[uSa.E]);
            }
            void v24 = b2;
            XF xF2 = xF = v24.J();
            double d9 = DGa.parseDouble((double)((double)xF2.getX() + kTa.B), (String)c2[vRa.d], vRa.d != 0);
            double d10 = DGa.parseDouble((double)((double)xF2.getZ() + kTa.B), (String)c2[uqa.g], vRa.d != 0);
            pX.J(d9, d10);
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d9;
            objectArray[vRa.d] = d10;
            DGa.notifyOperators((u)v24, (Qc)a2, (String)pPa.X, (Object[])objectArray);
            return;
        }
        if (c2[uSa.E].equals(lQa.I)) {
            if (c2.length < uqa.g) {
                throw new eHa(ZRa.j, new Object[uSa.E]);
            }
            if (c2[vRa.d].equals(Wqa.Da)) {
                if (c2.length != yRa.d) {
                    throw new eHa(ypa.k, new Object[uSa.E]);
                }
                double d11 = DGa.parseDouble((String)c2[uqa.g], (double)aSa.V);
                PX pX3 = pX;
                double d12 = pX3.f();
                pX3.l(d11);
                Object[] objectArray = new Object[uqa.g];
                Object[] objectArray14 = new Object[vRa.d];
                objectArray14[uSa.E] = d11;
                objectArray[uSa.E] = String.format(xTa.C, objectArray14);
                Object[] objectArray15 = new Object[vRa.d];
                objectArray15[uSa.E] = d12;
                objectArray[vRa.d] = String.format(xTa.C, objectArray15);
                DGa.notifyOperators((u)b2, (Qc)a2, (String)pPa.d, (Object[])objectArray);
                return;
            }
            if (c2[vRa.d].equals(NQa.Z)) {
                if (c2.length != yRa.d) {
                    throw new eHa(Nta.x, new Object[uSa.E]);
                }
                double d13 = DGa.parseDouble((String)c2[uqa.g], (double)aSa.V);
                PX pX4 = pX;
                double d14 = pX4.M();
                pX4.f(d13);
                Object[] objectArray = new Object[uqa.g];
                Object[] objectArray16 = new Object[vRa.d];
                objectArray16[uSa.E] = d13;
                objectArray[uSa.E] = String.format(zsa.fa, objectArray16);
                Object[] objectArray17 = new Object[vRa.d];
                objectArray17[uSa.E] = d14;
                objectArray[vRa.d] = String.format(zsa.fa, objectArray17);
                DGa.notifyOperators((u)b2, (Qc)a2, (String)Spa.l, (Object[])objectArray);
                return;
            }
        } else if (c2[uSa.E].equals(oQa.o)) {
            if (c2.length < uqa.g) {
                throw new eHa(SPa.R, new Object[uSa.E]);
            }
            int n2 = DGa.parseInt((String)c2[uqa.g], (int)uSa.E);
            if (c2[vRa.d].equals(vsa.G)) {
                if (c2.length != yRa.d) {
                    throw new eHa(Vua.j, new Object[uSa.E]);
                }
                PX pX5 = pX;
                int n3 = pX5.f();
                pX5.l(n2);
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = n2;
                objectArray[vRa.d] = n3;
                DGa.notifyOperators((u)b2, (Qc)a2, (String)Usa.a, (Object[])objectArray);
                return;
            }
            if (c2[vRa.d].equals(tua.v)) {
                if (c2.length != yRa.d) {
                    throw new eHa(oua.o, new Object[uSa.E]);
                }
                PX pX6 = pX;
                int n4 = pX6.J();
                pX6.f(n2);
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = n2;
                objectArray[vRa.d] = n4;
                DGa.notifyOperators((u)b2, (Qc)a2, (String)NPa.Ga, (Object[])objectArray);
                return;
            }
        } else {
            if (!c2[uSa.E].equals(Bsa.a)) {
                throw new eHa(jRa.A, new Object[uSa.E]);
            }
            double d15 = pX.A();
            b2.J(Rha.QUERY_RESULT, Oz.f((double)(d15 + kTa.B)));
            Object[] objectArray = new Object[vRa.d];
            Object[] objectArray18 = new Object[vRa.d];
            objectArray18[uSa.E] = d15;
            objectArray[uSa.E] = String.format(WPa.S, objectArray18);
            b2.J((ld)new CZ(hTa.H, objectArray));
        }
    }

    public PX getWorldBorder() {
        return OCa.J().G[uSa.E].J();
    }
}

