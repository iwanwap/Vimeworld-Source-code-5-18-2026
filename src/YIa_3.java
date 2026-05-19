/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  Mha
 *  OCa
 *  Oz
 *  Qc
 *  Qqa
 *  RPa
 *  bFa
 *  bRa
 *  cQa
 *  eHa
 *  iha
 *  kPa
 *  oGa
 *  vL
 *  vRa
 */
import java.util.EnumSet;
import java.util.List;

public final class YIa_3
extends Mha {
    public String getCommandName() {
        return bRa.M;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        YIa_3 a2 = this;
        return RPa.x;
    }

    public YIa_3() {
        YIa_3 a2;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length != vRa.d && d2.length != uqa.g) {
            return null;
        }
        return YIa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        YIa_3 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void v0;
        YIa_3 c2;
        void b2;
        void a2;
        YIa_3 yIa_3 = this;
        if (((void)a2).length < vRa.d) {
            throw new eHa(RPa.x, new Object[uSa.E]);
        }
        int n2 = uSa.E;
        if (((void)a2).length != uqa.g && ((void)a2).length != AQa.P && ((void)a2).length != uua.p) {
            c2 = YIa_3.getCommandSenderAsPlayer((u)b2);
            v0 = a2;
        } else {
            c2 = YIa_3.func_175768_b((u)b2, (String)a2[uSa.E]);
            n2 = vRa.d;
            v0 = a2;
        }
        if (((void)v0).length != vRa.d && ((void)a2).length != uqa.g) {
            if (((void)a2).length < n2 + yRa.d) {
                throw new eHa(RPa.x, new Object[uSa.E]);
            }
            if (((vL)c2).j != null) {
                void v8;
                String string;
                int n3 = n2 + vRa.d;
                YIa_3 yIa_32 = c2;
                iha iha2 = YIa_3.parseCoordinate((double)((vL)yIa_32).la, (String)a2[n2], vRa.d != 0);
                void v2 = a2[n3];
                iha iha3 = YIa_3.parseCoordinate((double)((vL)yIa_32).Z, (String)v2, (int)uSa.E, (int)uSa.E, uSa.E != 0);
                iha iha4 = YIa_3.parseCoordinate((double)((vL)yIa_32).A, (String)a2[++n3], vRa.d != 0);
                iha iha5 = iha4;
                double d2 = ((vL)yIa_32).X;
                if (((void)a2).length > ++n3) {
                    string = a2[n3];
                    ++n3;
                } else {
                    string = kPa.x;
                }
                iha iha6 = YIa_3.parseCoordinate((double)d2, (String)string, uSa.E != 0);
                iha iha7 = YIa_3.parseCoordinate((double)((vL)c2).d, (String)(((void)a2).length > n3 ? a2[n3] : kPa.x), uSa.E != 0);
                if (c2 instanceof bFa) {
                    EnumSet<WAa> enumSet = EnumSet.noneOf(WAa.class);
                    if (iha2.J()) {
                        enumSet.add(WAa.X);
                    }
                    if (iha3.J()) {
                        enumSet.add(WAa.Y);
                    }
                    if (iha5.J()) {
                        enumSet.add(WAa.Z);
                    }
                    if (iha7.J()) {
                        enumSet.add(WAa.X_ROT);
                    }
                    if (iha6.J()) {
                        enumSet.add(WAa.Y_ROT);
                    }
                    iha iha8 = iha6;
                    float f2 = (float)iha8.J();
                    if (!iha8.J()) {
                        f2 = Oz.f((float)f2);
                    }
                    iha iha9 = iha7;
                    float f3 = (float)iha9.J();
                    if (!iha9.J()) {
                        f3 = Oz.f((float)f3);
                    }
                    if (f3 > ISa.a || f3 < kPa.Ha) {
                        f3 = Oz.f((float)(Hra.Ga - f3));
                        f2 = Oz.f((float)(f2 + Hra.Ga));
                    }
                    c2.l(null);
                    ((bFa)c2).I.J(iha2.J(), iha3.J(), iha5.J(), f2, f3, enumSet);
                    v8 = b2;
                    c2.J(f2);
                } else {
                    float f4 = (float)Oz.J((double)iha6.f());
                    float f5 = (float)Oz.J((double)iha7.f());
                    if (f5 > ISa.a || f5 < kPa.Ha) {
                        f5 = Oz.f((float)(Hra.Ga - f5));
                        f4 = Oz.f((float)(f4 + Hra.Ga));
                    }
                    c2.f(iha2.f(), iha3.f(), iha5.f(), f4, f5);
                    c2.J(f4);
                    v8 = b2;
                }
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = c2.J();
                objectArray[vRa.d] = iha2.f();
                objectArray[uqa.g] = iha3.f();
                objectArray[yRa.d] = iha5.f();
                YIa_3.notifyOperators((u)v8, (Qc)yIa_3, (String)cQa.fa, (Object[])objectArray);
                return;
            }
        } else {
            void v13;
            void v10 = a2;
            vL vL2 = YIa_3.func_175768_b((u)b2, (String)v10[((void)v10).length - vRa.d]);
            if (vL2.j != ((vL)c2).j) {
                throw new oGa(hQa.P, new Object[uSa.E]);
            }
            c2.l(null);
            YIa_3 yIa_33 = c2;
            if (c2 instanceof bFa) {
                vL vL3 = vL2;
                ((bFa)yIa_33).I.J(vL2.la, vL2.Z, vL2.A, vL3.X, vL3.d);
                v13 = b2;
            } else {
                vL vL4 = vL2;
                yIa_33.f(vL2.la, vL2.Z, vL2.A, vL4.X, vL4.d);
                v13 = b2;
            }
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = c2.J();
            objectArray[vRa.d] = vL2.J();
            YIa_3.notifyOperators((u)v13, (Qc)yIa_3, (String)Qqa.q, (Object[])objectArray);
        }
    }
}

