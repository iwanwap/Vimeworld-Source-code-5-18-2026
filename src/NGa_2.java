/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  CY
 *  CZ
 *  ERa
 *  Fpa
 *  Ica
 *  JSa
 *  KTa
 *  LQa
 *  Lqa
 *  Mha
 *  NCa
 *  OCa
 *  PTa
 *  Qc
 *  Qta
 *  Rha
 *  SOa
 *  SRa
 *  TQa
 *  Tpa
 *  Usa
 *  WSa
 *  Waa
 *  Wsa
 *  XTa
 *  YSa
 *  Ypa
 *  ZOa
 *  Zta
 *  aSa
 *  asa
 *  bSa
 *  cra
 *  dQa
 *  dpa
 *  eHa
 *  fTa
 *  fpa
 *  hTa
 *  ica
 *  isa
 *  jRa
 *  jba
 *  kPa
 *  kqa
 *  ld
 *  mca
 *  mra
 *  oGa
 *  pY
 *  pua
 *  qca
 *  qta
 *  rba
 *  uOa
 *  vPa
 *  vRa
 *  wra
 *  xBa
 *  yQa
 *  yca
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class NGa_2
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void setObjectiveDisplay(u u2, String[] stringArray, int n2) throws oGa {
        void c2;
        void a2;
        void b2;
        NGa_2 nGa_2 = this;
        qca qca2 = nGa_2.getScoreboard();
        void v0 = b2;
        void var5_6 = v0[a2];
        ++a2;
        int n3 = qca.J((String)var5_6);
        NGa_2 d2 = null;
        if (((void)v0).length == AQa.P) {
            d2 = nGa_2.getObjective((String)b2[a2], uSa.E != 0);
        }
        if (n3 < 0) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = var5_6;
            throw new oGa(TQa.A, objectArray);
        }
        qca2.J(n3, (ica)d2);
        if (d2 != null) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = qca.J((int)n3);
            objectArray[vRa.d] = d2.J();
            NGa_2.notifyOperators((u)c2, (Qc)nGa_2, (String)xqa.S, (Object[])objectArray);
            return;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = qca.J((int)n3);
        NGa_2.notifyOperators((u)c2, (Qc)nGa_2, (String)DPa.l, (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void func_175779_n(u u2, String[] ica2, int n2) throws oGa {
        void a2;
        void c2;
        ica d2 = ica2;
        ica b2 = this;
        qca qca2 = b2.getScoreboard();
        String string = NGa_2.getPlayerName((u)c2, (String)d2[a2]);
        ++a2;
        String string2 = string;
        if (string.length() > wra.P) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = string2;
            objectArray[vRa.d] = wra.P;
            throw new lha(qQa.K, objectArray);
        }
        if ((d2 = b2.getObjective(d2[a2], uSa.E != 0)).J() != lb.C) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = d2.J();
            throw new oGa(dQa.i, objectArray);
        }
        qca2.J(string2, d2).J(uSa.E != 0);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = d2.J();
        objectArray[vRa.d] = string2;
        NGa_2.notifyOperators((u)c2, (Qc)b2, (String)WOa.Q, (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void removeObjective(u u2, String string) throws oGa {
        void b2;
        void a2;
        NGa_2 nGa_2;
        NGa_2 nGa_22 = nGa_2 = this;
        qca qca2 = nGa_22.getScoreboard();
        NGa_2 c2 = nGa_22.getObjective((String)a2, uSa.E != 0);
        qca2.f((ica)c2);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = a2;
        NGa_2.notifyOperators((u)b2, (Qc)nGa_2, (String)Wsa.A, (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void joinTeam(u u2, String[] stringArray, int n2) throws oGa {
        void c2;
        void a2;
        void b2;
        NGa_2 nGa_2 = this;
        qca qca2 = nGa_2.getScoreboard();
        void var5_6 = b2[a2];
        HashSet d2 = Sets.newHashSet();
        HashSet<Object> hashSet = Sets.newHashSet();
        if (c2 instanceof Sx && ++a2 == ((void)b2).length) {
            String string = NGa_2.getCommandSenderAsPlayer((u)c2).J();
            if (qca2.J(string, (String)var5_6)) {
                d2.add(string);
            } else {
                hashSet.add(string);
            }
        } else {
            while (a2 < ((void)b2).length) {
                void var8_9 = b2[a2];
                ++a2;
                if (var8_9.startsWith(eua.Y)) {
                    for (Object object : NGa_2.func_175763_c((u)c2, (String)var8_9)) {
                        if (qca2.J((String)(object = NGa_2.getEntityName((u)c2, (String)object.J().toString())), (String)var5_6)) {
                            d2.add(object);
                            continue;
                        }
                        hashSet.add(object);
                    }
                    continue;
                }
                String string = NGa_2.getEntityName((u)c2, (String)var8_9);
                if (qca2.J(string, (String)var5_6)) {
                    d2.add(string);
                    continue;
                }
                hashSet.add(string);
            }
        }
        if (!d2.isEmpty()) {
            void v0 = c2;
            v0.J(Rha.AFFECTED_ENTITIES, d2.size());
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = d2.size();
            objectArray[vRa.d] = var5_6;
            Object object = d2;
            objectArray[uqa.g] = NGa_2.joinNiceString((Object[])object.toArray(new String[object.size()]));
            NGa_2.notifyOperators((u)v0, (Qc)nGa_2, (String)Hra.z, (Object[])objectArray);
        }
        if (!hashSet.isEmpty()) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = hashSet.size();
            objectArray[vRa.d] = var5_6;
            HashSet<Object> hashSet2 = hashSet;
            objectArray[uqa.g] = NGa_2.joinNiceString((Object[])hashSet2.toArray(new String[hashSet2.size()]));
            throw new oGa(bSa.O, objectArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void func_175781_o(u u2, String[] jba2, int n2) throws oGa {
        void a2;
        void c2;
        jba d2 = jba2;
        jba b2 = this;
        qca qca2 = b2.getScoreboard();
        String string = NGa_2.getEntityName((u)c2, (String)d2[a2]);
        ++a2;
        String string2 = string;
        if (string.length() > wra.P) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = string2;
            objectArray[vRa.d] = wra.P;
            throw new lha(qQa.K, objectArray);
        }
        ica ica2 = b2.getObjective(d2[a2], uSa.E != 0);
        ++a2;
        ica ica3 = ica2;
        if (!qca2.J(string2, ica3)) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = ica3.J();
            objectArray[vRa.d] = string2;
            throw new oGa(WSa.Da, objectArray);
        }
        int n3 = d2[a2].equals(JSa.a) ? ypa.L : NGa_2.parseInt((String)d2[a2]);
        int n4 = ++a2 < ((String[])d2).length && !d2[a2].equals(JSa.a) ? NGa_2.parseInt((String)d2[a2], (int)n3) : vqa.F;
        d2 = qca2.J(string2, ica3);
        if (d2.J() >= n3 && d2.J() <= n4) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = d2.J();
            objectArray[vRa.d] = n3;
            objectArray[uqa.g] = n4;
            NGa_2.notifyOperators((u)c2, (Qc)b2, (String)Fua.P, (Object[])objectArray);
            return;
        }
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = d2.J();
        objectArray[vRa.d] = n3;
        objectArray[uqa.g] = n4;
        throw new oGa(hTa.r, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void listPlayers(u u2, String[] stringArray, int n2) throws oGa {
        Object d2;
        void c2;
        void a22;
        Object b2;
        NGa_2 nGa_2 = this;
        qca qca2 = nGa_2.getScoreboard();
        if (((void)b2).length > a22) {
            void v0 = c2;
            d2 = NGa_2.getEntityName((u)v0, (String)b2[a22]);
            Map map = qca2.J((String)d2);
            v0.J(Rha.QUERY_RESULT, map.size());
            if (map.size() <= 0) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = d2;
                throw new oGa(Tpa.B, objectArray);
            }
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = map.size();
            objectArray[vRa.d] = d2;
            b2 = new CZ(vPa.z, objectArray);
            b2.J().J(pY.DARK_GREEN);
            c2.J((ld)b2);
            b2 = map.values().iterator();
            Object object = b2;
            while (object.hasNext()) {
                jba a22 = (jba)b2.next();
                Object[] objectArray2 = new Object[yRa.d];
                objectArray2[uSa.E] = a22.J();
                objectArray2[vRa.d] = a22.J().f();
                objectArray2[uqa.g] = a22.J().J();
                c2.J((ld)new CZ(yQa.O, objectArray2));
                object = b2;
            }
        } else {
            Object object = d2 = qca2.C();
            c2.J(Rha.QUERY_RESULT, object.size());
            if (object.size() <= 0) {
                throw new oGa(Fsa.ga, new Object[uSa.E]);
            }
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = d2.size();
            CZ cZ2 = new CZ(Lqa.ja, objectArray);
            cZ2.J().J(pY.DARK_GREEN);
            void v7 = c2;
            v7.J((ld)cZ2);
            v7.J((ld)new CY(NGa_2.joinNiceString((Object[])d2.toArray())));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void addObjective(u u2, String[] stringArray, int n2) throws oGa {
        void c2;
        void a2;
        String b2;
        NGa_2 nGa_2 = this;
        void v0 = b2;
        NGa_2 d2 = v0[a2];
        void var5_5 = v0[++a2];
        ++a2;
        qca qca2 = nGa_2.getScoreboard();
        lb lb2 = lb.A.get(var5_5);
        if (lb2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = var5_5;
            throw new eHa(cTa.t, objectArray);
        }
        if (qca2.J((String)((Object)d2)) != null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = d2;
            throw new oGa(rua.p, objectArray);
        }
        if (((String)((Object)d2)).length() > ERa.C) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d2;
            objectArray[vRa.d] = ERa.C;
            throw new lha(sra.k, objectArray);
        }
        if (((String)((Object)d2)).length() == 0) {
            throw new eHa(BQa.b, new Object[uSa.E]);
        }
        if (((void)b2).length > a2) {
            if ((b2 = NGa_2.getChatComponentFromNthArg((u)c2, (String[])b2, (int)a2).f()).length() > fPa.i) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = b2;
                objectArray[vRa.d] = fPa.i;
                throw new lha(kPa.w, objectArray);
            }
            if (b2.length() > 0) {
                qca2.J((String)((Object)d2), lb2).J(b2);
            } else {
                qca2.J((String)((Object)d2), lb2);
            }
        } else {
            qca2.J((String)((Object)d2), lb2);
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = d2;
        NGa_2.notifyOperators((u)c2, (Qc)nGa_2, (String)ERa.ga, (Object[])objectArray);
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[yRa.d];
            stringArray2[uSa.E] = WRa.n;
            stringArray2[vRa.d] = TQa.Ka;
            stringArray2[uqa.g] = fPa.v;
            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2[uSa.E].equalsIgnoreCase(WRa.n)) {
            if (d2.length == uqa.g) {
                String[] stringArray3 = new String[AQa.P];
                stringArray3[uSa.E] = Wqa.Y;
                stringArray3[vRa.d] = Qra.U;
                stringArray3[uqa.g] = aSa.c;
                stringArray3[yRa.d] = SOa.d;
                return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray3);
            }
            if (d2[vRa.d].equalsIgnoreCase(Qra.U)) {
                if (d2.length == AQa.P) {
                    Set<String> c2 = lb.A.keySet();
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, c2);
                }
            } else if (d2[vRa.d].equalsIgnoreCase(aSa.c)) {
                if (d2.length == yRa.d) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_147184_a(uSa.E != 0));
                }
            } else if (d2[vRa.d].equalsIgnoreCase(SOa.d)) {
                if (d2.length == yRa.d) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])qca.J());
                }
                if (d2.length == AQa.P) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_147184_a(uSa.E != 0));
                }
            }
        } else if (d2[uSa.E].equalsIgnoreCase(TQa.Ka)) {
            if (d2.length == uqa.g) {
                String[] stringArray4 = new String[Yqa.i];
                stringArray4[uSa.E] = pta.G;
                stringArray4[vRa.d] = Qra.U;
                stringArray4[uqa.g] = aSa.c;
                stringArray4[yRa.d] = Zta.h;
                stringArray4[AQa.P] = Wqa.Y;
                stringArray4[tTa.h] = KPa.t;
                stringArray4[uua.p] = ATa.ca;
                stringArray4[XTa.W] = ZOa.g;
                return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray4);
            }
            if (!(d2[vRa.d].equalsIgnoreCase(pta.G) || d2[vRa.d].equalsIgnoreCase(Qra.U) || d2[vRa.d].equalsIgnoreCase(aSa.c) || d2[vRa.d].equalsIgnoreCase(Zta.h))) {
                if (d2[vRa.d].equalsIgnoreCase(KPa.t)) {
                    if (d2.length == yRa.d) {
                        return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
                    }
                    if (d2.length == AQa.P) {
                        return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_175782_e());
                    }
                } else if (!d2[vRa.d].equalsIgnoreCase(Wqa.Y) && !d2[vRa.d].equalsIgnoreCase(ATa.ca)) {
                    if (d2[vRa.d].equalsIgnoreCase(ZOa.g)) {
                        if (d2.length == yRa.d) {
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)b2.getScoreboard().C());
                        }
                        if (d2.length == AQa.P) {
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_147184_a(vRa.d != 0));
                        }
                        if (d2.length == tTa.h) {
                            String[] stringArray5 = new String[WOa.fa];
                            stringArray5[uSa.E] = UTa.x;
                            stringArray5[vRa.d] = Qta.Aa;
                            stringArray5[uqa.g] = Fpa.b;
                            stringArray5[yRa.d] = YSa.Ha;
                            stringArray5[AQa.P] = PQa.Da;
                            stringArray5[tTa.h] = vTa.S;
                            stringArray5[uua.p] = tpa.ca;
                            stringArray5[XTa.W] = ZOa.j;
                            stringArray5[Yqa.i] = cra.A;
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray5);
                        }
                        if (d2.length == uua.p) {
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
                        }
                        if (d2.length == XTa.W) {
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_147184_a(uSa.E != 0));
                        }
                    }
                } else {
                    if (d2.length == yRa.d) {
                        return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)b2.getScoreboard().C());
                    }
                    if (d2.length == AQa.P && d2[vRa.d].equalsIgnoreCase(ATa.ca)) {
                        return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_147184_a(uSa.E != 0));
                    }
                }
            } else {
                if (d2.length == yRa.d) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
                }
                if (d2.length == AQa.P) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_147184_a(vRa.d != 0));
                }
            }
        } else if (d2[uSa.E].equalsIgnoreCase(fPa.v)) {
            if (d2.length == uqa.g) {
                String[] stringArray6 = new String[XTa.W];
                stringArray6[uSa.E] = Qra.U;
                stringArray6[vRa.d] = aSa.c;
                stringArray6[uqa.g] = Jpa.k;
                stringArray6[yRa.d] = Ata.E;
                stringArray6[AQa.P] = uqa.Ga;
                stringArray6[tTa.h] = Wqa.Y;
                stringArray6[uua.p] = fTa.u;
                return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray6);
            }
            if (d2[vRa.d].equalsIgnoreCase(Jpa.k)) {
                if (d2.length == yRa.d) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)b2.getScoreboard().J());
                }
                if (d2.length >= AQa.P) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
                }
            } else {
                if (d2[vRa.d].equalsIgnoreCase(Ata.E)) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
                }
                if (!(d2[vRa.d].equalsIgnoreCase(uqa.Ga) || d2[vRa.d].equalsIgnoreCase(Wqa.Y) || d2[vRa.d].equalsIgnoreCase(aSa.c))) {
                    if (d2[vRa.d].equalsIgnoreCase(fTa.u)) {
                        if (d2.length == yRa.d) {
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)b2.getScoreboard().J());
                        }
                        if (d2.length == AQa.P) {
                            String[] stringArray7 = new String[tTa.h];
                            stringArray7[uSa.E] = Zra.L;
                            stringArray7[vRa.d] = zua.t;
                            stringArray7[uqa.g] = STa.O;
                            stringArray7[yRa.d] = bsa.c;
                            stringArray7[AQa.P] = wsa.K;
                            return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray7);
                        }
                        if (d2.length == tTa.h) {
                            if (d2[yRa.d].equalsIgnoreCase(Zra.L)) {
                                return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)pY.getValidValues(vRa.d != 0, uSa.E != 0));
                            }
                            if (d2[yRa.d].equalsIgnoreCase(bsa.c) || d2[yRa.d].equalsIgnoreCase(wsa.K)) {
                                return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])xBa.func_178825_a());
                            }
                            if (d2[yRa.d].equalsIgnoreCase(zua.t) || d2[yRa.d].equalsIgnoreCase(STa.O)) {
                                String[] stringArray8 = new String[uqa.g];
                                stringArray8[uSa.E] = oQa.l;
                                stringArray8[vRa.d] = MRa.E;
                                return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray8);
                            }
                        }
                    }
                } else if (d2.length == yRa.d) {
                    return NGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)b2.getScoreboard().J());
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean isUsernameIndex(String[] stringArray, int n2) {
        void b2;
        int c2 = n2;
        NGa_2 a2 = this;
        if (!b2[uSa.E].equalsIgnoreCase(TQa.Ka)) {
            if (b2[uSa.E].equalsIgnoreCase(fPa.v)) {
                if (c2 == uqa.g) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        if (((void)b2).length > vRa.d && b2[vRa.d].equalsIgnoreCase(ZOa.g)) {
            if (c2 == uqa.g || c2 == tTa.h) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (c2 == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean func_175780_b(u u2, String[] stringArray) throws oGa {
        void b2;
        void a2;
        int c22;
        NGa_2 nGa_2 = this;
        int n2 = pua.o;
        int n3 = c22 = uSa.E;
        while (n3 < ((void)a2).length) {
            if (nGa_2.isUsernameIndex((String[])a2, c22) && JSa.a.equals(a2[c22])) {
                if (n2 >= 0) {
                    throw new oGa(vqa.o, new Object[uSa.E]);
                }
                n2 = c22;
            }
            n3 = ++c22;
        }
        if (n2 < 0) {
            return uSa.E != 0;
        }
        Object c22 = Lists.newArrayList(nGa_2.getScoreboard().C());
        void var5_7 = a2[n2];
        ArrayList<String> arrayList = Lists.newArrayList();
        c22 = c22.iterator();
        while (c22.hasNext()) {
            String string;
            a2[n2] = string = (String)c22.next();
            try {
                nGa_2.processCommand((u)b2, (String[])a2);
                arrayList.add(string);
            }
            catch (oGa oGa2) {
                string = new CZ(oGa2.getMessage(), oGa2.getErrorObjects());
                string.J().J(pY.RED);
                b2.J((ld)string);
            }
        }
        a2[n2] = var5_7;
        ArrayList<String> arrayList2 = arrayList;
        b2.J(Rha.AFFECTED_ENTITIES, arrayList2.size());
        if (arrayList2.size() == 0) {
            throw new eHa(rRa.y, new Object[uSa.E]);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void listObjectives(u u2) throws oGa {
        void a2;
        Object object = this;
        Object b2 = object.getScoreboard().d();
        if (b2.size() <= 0) {
            throw new oGa(Yqa.q, new Object[uSa.E]);
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2.size();
        CZ cZ2 = new CZ(SRa.q, objectArray);
        cZ2.J().J(pY.DARK_GREEN);
        a2.J((ld)cZ2);
        b2 = b2.iterator();
        Object object2 = b2;
        while (object2.hasNext()) {
            cZ2 = (ica)b2.next();
            Object[] objectArray2 = new Object[yRa.d];
            objectArray2[uSa.E] = cZ2.J();
            objectArray2[vRa.d] = cZ2.f();
            objectArray2[uqa.g] = cZ2.J().J();
            a2.J((ld)new CZ(Ypa.Y, objectArray2));
            object2 = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setPlayer(u u2, String[] stringArray, int n2) throws oGa {
        void v7;
        jba jba2;
        qca qca2;
        int n3;
        void c2;
        void a2;
        Waa d2 = stringArray;
        Waa b2 = this;
        String string = d2[a2 - vRa.d];
        void var5_5 = a2;
        String string2 = NGa_2.getEntityName((u)c2, (String)d2[a2]);
        ++a2;
        String string3 = string2;
        if (string2.length() > wra.P) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = string3;
            objectArray[vRa.d] = wra.P;
            throw new lha(qQa.K, objectArray);
        }
        ica ica2 = b2.getObjective(d2[a2], vRa.d != 0);
        ++a2;
        ica ica3 = ica2;
        if (string.equalsIgnoreCase(pta.G)) {
            n3 = NGa_2.parseInt((String)d2[a2]);
            ++a2;
        } else {
            n3 = NGa_2.parseInt((String)d2[a2], (int)uSa.E);
            ++a2;
        }
        int n4 = n3;
        if (((String[])d2).length > a2) {
            qca2 = NGa_2.func_175768_b((u)c2, (String)d2[var5_5]);
            try {
                jba2 = Ica.J((String)NGa_2.buildString((String[])d2, (int)a2));
                Waa waa2 = d2 = new Waa();
                qca2.C(waa2);
                if (!rba.J((NCa)jba2, (NCa)waa2, vRa.d != 0)) {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = string3;
                    throw new oGa(sSa.Ka, objectArray);
                }
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(xTa.d, objectArray);
            }
        }
        qca2 = b2.getScoreboard();
        jba2 = qca2.J(string3, ica3);
        if (string.equalsIgnoreCase(pta.G)) {
            v7 = c2;
            jba2.J(n4);
        } else {
            jba jba3 = jba2;
            if (string.equalsIgnoreCase(Qra.U)) {
                jba3.f(n4);
                v7 = c2;
            } else {
                jba3.l(n4);
                v7 = c2;
            }
        }
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = ica3.J();
        objectArray[vRa.d] = string3;
        objectArray[uqa.g] = jba2.J();
        NGa_2.notifyOperators((u)v7, (Qc)b2, (String)fTa.Ka, (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void addTeam(u u2, String[] stringArray, int n2) throws oGa {
        void c2;
        void a2;
        String b2;
        NGa_2 nGa_2 = this;
        NGa_2 d2 = b2[a2];
        ++a2;
        qca qca2 = nGa_2.getScoreboard();
        if (qca2.J((String)((Object)d2)) != null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = d2;
            throw new oGa(Ypa.Q, objectArray);
        }
        if (((String)((Object)d2)).length() > ERa.C) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d2;
            objectArray[vRa.d] = ERa.C;
            throw new lha(KQa.w, objectArray);
        }
        if (((String)((Object)d2)).length() == 0) {
            throw new eHa(nOa.r, new Object[uSa.E]);
        }
        if (((void)b2).length > a2) {
            if ((b2 = NGa_2.getChatComponentFromNthArg((u)c2, (String[])b2, (int)a2).f()).length() > fPa.i) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = b2;
                objectArray[vRa.d] = fPa.i;
                throw new lha(SRa.F, objectArray);
            }
            if (b2.length() > 0) {
                qca2.f((String)((Object)d2)).f(b2);
            } else {
                qca2.f((String)((Object)d2));
            }
        } else {
            qca2.f((String)((Object)d2));
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = d2;
        NGa_2.notifyOperators((u)c2, (Qc)nGa_2, (String)jRa.ia, (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String[] a2 = this;
        String[] c2 = stringArray;
        if (!super.func_175780_b((u)b2, c2)) {
            if (c2.length < vRa.d) {
                throw new eHa(asa.x, new Object[uSa.E]);
            }
            if (c2[uSa.E].equalsIgnoreCase(WRa.n)) {
                if (c2.length == vRa.d) {
                    throw new eHa(Npa.A, new Object[uSa.E]);
                }
                if (c2[vRa.d].equalsIgnoreCase(Wqa.Y)) {
                    a2.listObjectives((u)b2);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(Qra.U)) {
                    if (c2.length < AQa.P) {
                        throw new eHa(BQa.b, new Object[uSa.E]);
                    }
                    a2.addObjective((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(aSa.c)) {
                    if (c2.length != yRa.d) {
                        throw new eHa(rua.S, new Object[uSa.E]);
                    }
                    a2.removeObjective((u)b2, c2[uqa.g]);
                    return;
                }
                if (!c2[vRa.d].equalsIgnoreCase(SOa.d)) {
                    throw new eHa(Npa.A, new Object[uSa.E]);
                }
                if (c2.length != yRa.d && c2.length != AQa.P) {
                    throw new eHa(KTa.C, new Object[uSa.E]);
                }
                a2.setObjectiveDisplay((u)b2, c2, uqa.g);
                return;
            }
            if (c2[uSa.E].equalsIgnoreCase(TQa.Ka)) {
                if (c2.length == vRa.d) {
                    throw new eHa(ERa.I, new Object[uSa.E]);
                }
                if (c2[vRa.d].equalsIgnoreCase(Wqa.Y)) {
                    if (c2.length > yRa.d) {
                        throw new eHa(Bta.ca, new Object[uSa.E]);
                    }
                    a2.listPlayers((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(Qra.U)) {
                    if (c2.length < tTa.h) {
                        throw new eHa(ZOa.J, new Object[uSa.E]);
                    }
                    a2.setPlayer((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(aSa.c)) {
                    if (c2.length < tTa.h) {
                        throw new eHa(dqa.Da, new Object[uSa.E]);
                    }
                    a2.setPlayer((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(pta.G)) {
                    if (c2.length < tTa.h) {
                        throw new eHa(mSa.R, new Object[uSa.E]);
                    }
                    a2.setPlayer((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(Zta.h)) {
                    if (c2.length != yRa.d && c2.length != AQa.P) {
                        throw new eHa(SOa.la, new Object[uSa.E]);
                    }
                    a2.resetPlayers((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(KPa.t)) {
                    if (c2.length != AQa.P) {
                        throw new eHa(Upa.i, new Object[uSa.E]);
                    }
                    a2.func_175779_n((u)b2, c2, uqa.g);
                    return;
                }
                if (c2[vRa.d].equalsIgnoreCase(ATa.ca)) {
                    if (c2.length != tTa.h && c2.length != uua.p) {
                        throw new eHa(kqa.D, new Object[uSa.E]);
                    }
                    a2.func_175781_o((u)b2, c2, uqa.g);
                    return;
                }
                if (!c2[vRa.d].equalsIgnoreCase(ZOa.g)) {
                    throw new eHa(ERa.I, new Object[uSa.E]);
                }
                if (c2.length != XTa.W) {
                    throw new eHa(ERa.D, new Object[uSa.E]);
                }
                a2.func_175778_p((u)b2, c2, uqa.g);
                return;
            }
            if (!c2[uSa.E].equalsIgnoreCase(fPa.v)) {
                throw new eHa(asa.x, new Object[uSa.E]);
            }
            if (c2.length == vRa.d) {
                throw new eHa(dpa.H, new Object[uSa.E]);
            }
            if (c2[vRa.d].equalsIgnoreCase(Wqa.Y)) {
                if (c2.length > yRa.d) {
                    throw new eHa(PTa.C, new Object[uSa.E]);
                }
                a2.listTeams((u)b2, c2, uqa.g);
                return;
            }
            if (c2[vRa.d].equalsIgnoreCase(Qra.U)) {
                if (c2.length < yRa.d) {
                    throw new eHa(nOa.r, new Object[uSa.E]);
                }
                a2.addTeam((u)b2, c2, uqa.g);
                return;
            }
            if (c2[vRa.d].equalsIgnoreCase(aSa.c)) {
                if (c2.length != yRa.d) {
                    throw new eHa(Usa.H, new Object[uSa.E]);
                }
                a2.removeTeam((u)b2, c2, uqa.g);
                return;
            }
            if (c2[vRa.d].equalsIgnoreCase(uqa.Ga)) {
                if (c2.length != yRa.d) {
                    throw new eHa(qta.Da, new Object[uSa.E]);
                }
                a2.emptyTeam((u)b2, c2, uqa.g);
                return;
            }
            if (c2[vRa.d].equalsIgnoreCase(Jpa.k)) {
                if (!(c2.length >= AQa.P || c2.length == yRa.d && b2 instanceof Sx)) {
                    throw new eHa(wsa.u, new Object[uSa.E]);
                }
                a2.joinTeam((u)b2, c2, uqa.g);
                return;
            }
            if (c2[vRa.d].equalsIgnoreCase(Ata.E)) {
                if (c2.length < yRa.d && !(b2 instanceof Sx)) {
                    throw new eHa(rua.A, new Object[uSa.E]);
                }
                a2.leaveTeam((u)b2, c2, uqa.g);
                return;
            }
            if (!c2[vRa.d].equalsIgnoreCase(fTa.u)) {
                throw new eHa(dpa.H, new Object[uSa.E]);
            }
            if (c2.length != AQa.P && c2.length != tTa.h) {
                throw new eHa(mra.P, new Object[uSa.E]);
            }
            a2.setTeamOption((u)b2, c2, uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void listTeams(u u2, String[] stringArray, int n2) throws oGa {
        void c2;
        Object d2;
        void a2;
        mca b2;
        NGa_2 nGa_2 = this;
        qca qca2 = nGa_2.getScoreboard();
        if (((void)b2).length > a2) {
            Collection collection;
            d2 = nGa_2.getTeam((String)b2[a2]);
            if (d2 == null) {
                return;
            }
            Collection collection2 = collection = d2.J();
            c2.J(Rha.QUERY_RESULT, collection2.size());
            if (collection2.size() <= 0) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = d2.J();
                throw new oGa(isa.h, objectArray);
            }
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = collection.size();
            objectArray[vRa.d] = d2.J();
            CZ cZ2 = new CZ(Jpa.T, objectArray);
            cZ2.J().J(pY.DARK_GREEN);
            c2.J((ld)cZ2);
            c2.J((ld)new CY(NGa_2.joinNiceString((Object[])collection.toArray())));
            return;
        }
        Object object = d2 = qca2.l();
        c2.J(Rha.QUERY_RESULT, object.size());
        if (object.size() <= 0) {
            throw new oGa(sqa.I, new Object[uSa.E]);
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = d2.size();
        CZ cZ3 = new CZ(Psa.B, objectArray);
        cZ3.J().J(pY.DARK_GREEN);
        c2.J((ld)cZ3);
        Iterator iterator = d2.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            b2 = (mca)iterator.next();
            Object[] objectArray2 = new Object[yRa.d];
            objectArray2[uSa.E] = b2.J();
            objectArray2[vRa.d] = b2.C();
            objectArray2[uqa.g] = b2.J().size();
            c2.J((ld)new CZ(WPa.Ja, objectArray2));
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void removeTeam(u u2, String[] mca2, int n2) throws oGa {
        void a2;
        mca b2;
        mca d2 = mca2;
        mca mca3 = b2 = this;
        qca qca2 = mca3.getScoreboard();
        if ((d2 = mca3.getTeam(d2[a2])) != null) {
            void c2;
            qca2.l(d2);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = d2.J();
            NGa_2.notifyOperators((u)c2, (Qc)b2, (String)pta.h, (Object[])objectArray);
        }
    }

    public NGa_2() {
        NGa_2 a2;
    }

    public String getCommandName() {
        return fpa.ha;
    }

    /*
     * WARNING - void declaration
     */
    public void emptyTeam(u u2, String[] mca2, int n2) throws oGa {
        void a2;
        mca b2;
        mca d2 = mca2;
        mca mca3 = b2 = this;
        qca qca2 = mca3.getScoreboard();
        if ((d2 = mca3.getTeam(d2[a2])) != null) {
            Iterator iterator;
            void c2;
            ArrayList arrayList = a2 = Lists.newArrayList(d2.J());
            c2.J(Rha.AFFECTED_ENTITIES, arrayList.size());
            if (arrayList.isEmpty()) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = d2.J();
                throw new oGa(vsa.Aa, objectArray);
            }
            Iterator iterator2 = iterator = a2.iterator();
            while (iterator2.hasNext()) {
                String string = (String)iterator.next();
                iterator2 = iterator;
                qca2.J(string, d2);
            }
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = a2.size();
            objectArray[vRa.d] = d2.J();
            NGa_2.notifyOperators((u)c2, (Qc)b2, (String)ROa.S, (Object[])objectArray);
        }
    }

    public qca getScoreboard() {
        return OCa.J().J(uSa.E).J();
    }

    /*
     * WARNING - void declaration
     */
    public void resetPlayers(u u2, String[] ica2, int n2) throws oGa {
        void a2;
        void c2;
        ica d2 = ica2;
        ica b2 = this;
        qca qca2 = b2.getScoreboard();
        String string = NGa_2.getEntityName((u)c2, (String)d2[a2]);
        if (((String[])d2).length > ++a2) {
            ica ica3 = b2.getObjective(d2[a2], uSa.E != 0);
            ++a2;
            d2 = ica3;
            qca2.J(string, d2);
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d2.J();
            objectArray[vRa.d] = string;
            NGa_2.notifyOperators((u)c2, (Qc)b2, (String)Zqa.H, (Object[])objectArray);
            return;
        }
        qca2.J(string, (ica)null);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = string;
        NGa_2.notifyOperators((u)c2, (Qc)b2, (String)Ira.y, (Object[])objectArray);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        NGa_2 a2 = this;
        return asa.x;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> func_147184_a(boolean bl2) {
        NGa_2 nGa_2 = this;
        Object b2 = nGa_2.getScoreboard().d();
        ArrayList<String> arrayList = Lists.newArrayList();
        b2 = b2.iterator();
        while (b2.hasNext()) {
            void a2;
            ica ica2 = (ica)b2.next();
            if (a2 != false && ica2.J().J()) continue;
            arrayList.add(ica2.J());
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public ica getObjective(String string, boolean bl2) throws oGa {
        void a2;
        void b2;
        NGa_2 nGa_2 = this;
        NGa_2 c2 = nGa_2.getScoreboard().J((String)b2);
        if (c2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            throw new oGa(nOa.h, objectArray);
        }
        if (a2 != false && c2.J().J()) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            throw new oGa(KSa.G, objectArray);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public void leaveTeam(u u2, String[] stringArray, int n2) throws oGa {
        void b2;
        void a2;
        void c2;
        NGa_2 nGa_2 = this;
        qca qca2 = nGa_2.getScoreboard();
        HashSet d2 = Sets.newHashSet();
        HashSet<Object> hashSet = Sets.newHashSet();
        if (c2 instanceof Sx && a2 == ((void)b2).length) {
            String string = NGa_2.getCommandSenderAsPlayer((u)c2).J();
            if (qca2.J(string)) {
                d2.add(string);
            } else {
                hashSet.add(string);
            }
        } else {
            while (a2 < ((void)b2).length) {
                void var7_8 = b2[a2];
                ++a2;
                if (var7_8.startsWith(eua.Y)) {
                    for (Object object : NGa_2.func_175763_c((u)c2, (String)var7_8)) {
                        if (qca2.J((String)(object = NGa_2.getEntityName((u)c2, (String)object.J().toString())))) {
                            d2.add(object);
                            continue;
                        }
                        hashSet.add(object);
                    }
                    continue;
                }
                String string = NGa_2.getEntityName((u)c2, (String)var7_8);
                if (qca2.J(string)) {
                    d2.add(string);
                    continue;
                }
                hashSet.add(string);
            }
        }
        if (!d2.isEmpty()) {
            void v0 = c2;
            v0.J(Rha.AFFECTED_ENTITIES, d2.size());
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = d2.size();
            Object object = d2;
            objectArray[vRa.d] = NGa_2.joinNiceString((Object[])object.toArray(new String[object.size()]));
            NGa_2.notifyOperators((u)v0, (Qc)nGa_2, (String)lQa.v, (Object[])objectArray);
        }
        if (!hashSet.isEmpty()) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = hashSet.size();
            HashSet<Object> hashSet2 = hashSet;
            objectArray[vRa.d] = NGa_2.joinNiceString((Object[])hashSet2.toArray(new String[hashSet2.size()]));
            throw new oGa(eua.Q, objectArray);
        }
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public List<String> func_175782_e() {
        NGa_2 nGa_2 = this;
        Object a2 = nGa_2.getScoreboard().d();
        ArrayList<String> arrayList = Lists.newArrayList();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            ica ica2 = (ica)a2.next();
            if (ica2.J() != lb.C) continue;
            arrayList.add(ica2.J());
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public mca getTeam(String string) throws oGa {
        void a2;
        NGa_2 nGa_2 = this;
        NGa_2 b2 = nGa_2.getScoreboard().J((String)a2);
        if (b2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            throw new oGa(ySa.t, objectArray);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void setTeamOption(u u2, String[] stringArray, int n2) throws oGa {
        void a22;
        void b2;
        NGa_2 nGa_2 = this;
        mca mca2 = nGa_2.getTeam((String)b2[a22]);
        ++a22;
        mca mca3 = mca2;
        if (mca2 != null) {
            void v8;
            void c2;
            String string = b2[a22].toLowerCase();
            ++a22;
            String d2 = string;
            if (!(string.equalsIgnoreCase(Zra.L) || d2.equalsIgnoreCase(zua.t) || d2.equalsIgnoreCase(STa.O) || d2.equalsIgnoreCase(bsa.c) || d2.equalsIgnoreCase(wsa.K))) {
                throw new eHa(mra.P, new Object[uSa.E]);
            }
            if (((void)b2).length == AQa.P) {
                if (d2.equalsIgnoreCase(Zra.L)) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = d2;
                    objectArray[vRa.d] = NGa_2.joinNiceStringFromCollection((Collection)pY.getValidValues(vRa.d != 0, uSa.E != 0));
                    throw new eHa(LQa.Ga, objectArray);
                }
                if (!d2.equalsIgnoreCase(zua.t) && !d2.equalsIgnoreCase(STa.O)) {
                    if (!d2.equalsIgnoreCase(bsa.c) && !d2.equalsIgnoreCase(wsa.K)) {
                        throw new eHa(mra.P, new Object[uSa.E]);
                    }
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = d2;
                    objectArray[vRa.d] = NGa_2.joinNiceString((Object[])xBa.func_178825_a());
                    throw new eHa(LQa.Ga, objectArray);
                }
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = d2;
                String[] stringArray2 = new String[uqa.g];
                stringArray2[uSa.E] = oQa.l;
                stringArray2[vRa.d] = MRa.E;
                objectArray[vRa.d] = NGa_2.joinNiceStringFromCollection(Arrays.asList(stringArray2));
                throw new eHa(LQa.Ga, objectArray);
            }
            b2 = b2[a22];
            if (d2.equalsIgnoreCase(Zra.L)) {
                pY a22 = pY.getValueByName((String)b2);
                if (a22 == null || a22.isFancyStyling()) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = d2;
                    objectArray[vRa.d] = NGa_2.joinNiceStringFromCollection((Collection)pY.getValidValues(vRa.d != 0, uSa.E != 0));
                    throw new eHa(LQa.Ga, objectArray);
                }
                mca mca4 = mca3;
                mca4.J(a22);
                mca4.l(a22.toString());
                mca3.J(pY.RESET.toString());
                v8 = c2;
            } else if (d2.equalsIgnoreCase(zua.t)) {
                if (!b2.equalsIgnoreCase(oQa.l) && !b2.equalsIgnoreCase(MRa.E)) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = d2;
                    String[] stringArray3 = new String[uqa.g];
                    stringArray3[uSa.E] = oQa.l;
                    stringArray3[vRa.d] = MRa.E;
                    objectArray[vRa.d] = NGa_2.joinNiceStringFromCollection(Arrays.asList(stringArray3));
                    throw new eHa(LQa.Ga, objectArray);
                }
                mca3.J(b2.equalsIgnoreCase(oQa.l));
                v8 = c2;
            } else if (d2.equalsIgnoreCase(STa.O)) {
                if (!b2.equalsIgnoreCase(oQa.l) && !b2.equalsIgnoreCase(MRa.E)) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = d2;
                    String[] stringArray4 = new String[uqa.g];
                    stringArray4[uSa.E] = oQa.l;
                    stringArray4[vRa.d] = MRa.E;
                    objectArray[vRa.d] = NGa_2.joinNiceStringFromCollection(Arrays.asList(stringArray4));
                    throw new eHa(LQa.Ga, objectArray);
                }
                mca3.f(b2.equalsIgnoreCase(oQa.l));
                v8 = c2;
            } else if (d2.equalsIgnoreCase(bsa.c)) {
                xBa a22 = xBa.func_178824_a((String)b2);
                if (a22 == null) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = d2;
                    objectArray[vRa.d] = NGa_2.joinNiceString((Object[])xBa.func_178825_a());
                    throw new eHa(LQa.Ga, objectArray);
                }
                mca3.J(a22);
                v8 = c2;
            } else {
                if (d2.equalsIgnoreCase(wsa.K)) {
                    xBa a22 = xBa.func_178824_a((String)b2);
                    if (a22 == null) {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = d2;
                        objectArray[vRa.d] = NGa_2.joinNiceString((Object[])xBa.func_178825_a());
                        throw new eHa(LQa.Ga, objectArray);
                    }
                    mca3.f(a22);
                }
                v8 = c2;
            }
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = d2;
            objectArray[vRa.d] = mca3.J();
            objectArray[uqa.g] = b2;
            NGa_2.notifyOperators((u)v8, (Qc)nGa_2, (String)wra.Q, (Object[])objectArray);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void func_175778_p(u var1_1, String[] var2_2, int var3_3) throws oGa {
        block11: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            block10: {
                                d = var2_2;
                                b = this;
                                var4_6 = b.getScoreboard();
                                var5_7 = NGa_2.getEntityName((u)c, (String)d[a]);
                                v0 = b.getObjective(d[++a], (boolean)vRa.d);
                                var6_8 = v0;
                                var7_9 = d[++a];
                                d = NGa_2.getEntityName((u)c, (String)d[++a]);
                                a = b.getObjective(d[++a], (boolean)uSa.E);
                                if (var5_7.length() > wra.P) {
                                    v1 = new Object[uqa.g];
                                    v1[uSa.E] = var5_7;
                                    v1[vRa.d] = wra.P;
                                    throw new lha(qQa.K, v1);
                                }
                                if (d.length() > wra.P) {
                                    v2 = new Object[uqa.g];
                                    v2[uSa.E] = d;
                                    v2[vRa.d] = wra.P;
                                    throw new lha(qQa.K, v2);
                                }
                                v3 = var4_6;
                                var5_7 = v3.J(var5_7, var6_8);
                                if (!v3.J((String)d, a)) {
                                    v4 = new Object[uqa.g];
                                    v4[uSa.E] = a.J();
                                    v4[vRa.d] = d;
                                    throw new oGa(xTa.M, v4);
                                }
                                d = var4_6.J((String)d, a);
                                if (!var7_9.equals(UTa.x)) break block10;
                                v5 = c;
                                v6 = var5_7;
                                v6.J(v6.J() + d.J());
                                break block11;
                            }
                            if (!var7_9.equals(Qta.Aa)) break block12;
                            v5 = c;
                            v7 = var5_7;
                            v7.J(v7.J() - d.J());
                            break block11;
                        }
                        if (!var7_9.equals(Fpa.b)) break block13;
                        v5 = c;
                        v8 = var5_7;
                        v8.J(v8.J() * d.J());
                        break block11;
                    }
                    if (!var7_9.equals(YSa.Ha)) break block14;
                    if (d.J() == 0) ** GOTO lbl89
                    v5 = c;
                    v9 = var5_7;
                    v9.J(v9.J() / d.J());
                    break block11;
                }
                if (!var7_9.equals(PQa.Da)) break block15;
                if (d.J() == 0) ** GOTO lbl89
                v5 = c;
                v10 = var5_7;
                v10.J(v10.J() % d.J());
                break block11;
            }
            if (var7_9.equals(vTa.S)) {
                v5 = c;
                var5_7.J(d.J());
            } else if (var7_9.equals(tpa.ca)) {
                v5 = c;
                v11 = var5_7;
                v11.J(Math.min(v11.J(), d.J()));
            } else if (var7_9.equals(ZOa.j)) {
                v5 = c;
                v12 = var5_7;
                v12.J(Math.max(v12.J(), d.J()));
            } else {
                if (!var7_9.equals(cra.A)) {
                    v13 = new Object[vRa.d];
                    v13[uSa.E] = var7_9;
                    throw new oGa(XTa.Ia, v13);
                }
                a = var5_7.J();
                var5_7.J(d.J());
                d.J(a);
lbl89:
                // 3 sources

                v5 = c;
            }
        }
        NGa_2.notifyOperators((u)v5, (Qc)b, (String)uOa.A, (Object[])new Object[uSa.E]);
    }
}

