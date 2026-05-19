/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  MD
 *  Mha
 *  NTa
 *  Oy
 *  QFa
 *  Qc
 *  Rha
 *  Waa
 *  Xv
 *  Ypa
 *  aQa
 *  bqa
 *  eHa
 *  hra
 *  kPa
 *  lqa
 *  oGa
 *  pPa
 *  pQa
 *  pua
 *  sHa
 *  uOa
 *  uY
 *  vPa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class zGa_2
extends Mha {
    public String getCommandName() {
        return aQa.T;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        zGa_2 a2 = this;
        return Zra.M;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        ArrayList<sHa> a2;
        zGa_2 zGa_22 = this;
        if (((void)a2).length < WOa.fa) {
            throw new eHa(Zra.M, new Object[uSa.E]);
        }
        void v0 = b2;
        void v1 = b2;
        v1.J(Rha.AFFECTED_BLOCKS, uSa.E);
        XF xF = zGa_2.parseBlockPos((u)v0, (String[])a2, (int)uSa.E, uSa.E != 0);
        XF xF2 = zGa_2.parseBlockPos((u)v1, (String[])a2, (int)yRa.d, uSa.E != 0);
        XF xF3 = zGa_2.parseBlockPos((u)v0, (String[])a2, (int)uua.p, uSa.E != 0);
        xF = new Xv((MD)xF, (MD)xF2);
        XF xF4 = xF3;
        xF2 = new Xv((MD)xF4, (MD)xF4.add(xF.J()));
        int n2 = xF.J() * xF.f() * xF.l();
        if (n2 > CRa.Y) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = n2;
            objectArray[vRa.d] = CRa.Y;
            throw new oGa(Yqa.X, objectArray);
        }
        int n3 = uSa.E;
        Block block = null;
        int n4 = pua.o;
        if ((((void)a2).length < pPa.f || !a2[NTa.C].equals(vPa.m) && !a2[NTa.C].equals(kPa.c)) && xF.J((Xv)xF2)) {
            throw new oGa(CRa.Ka, new Object[uSa.E]);
        }
        if (((void)a2).length >= pPa.f && a2[NTa.C].equals(kPa.c)) {
            n3 = vRa.d;
        }
        if (((Xv)xF).minY >= 0 && ((Xv)xF).maxY < hra.Ja && ((Xv)xF2).minY >= 0 && ((Xv)xF2).maxY < hra.Ja) {
            Gg gg2 = b2.J();
            if (gg2.J((Xv)xF) && gg2.J((Xv)xF2)) {
                Object object;
                XF xF5;
                Object c2;
                int n5;
                int n6 = uSa.E;
                if (((void)a2).length >= NTa.C) {
                    if (a2[WOa.fa].equals(sra.a)) {
                        n6 = vRa.d;
                    } else if (((String)((Object)a2[WOa.fa])).equals(bqa.K)) {
                        if (((ArrayList<E>)a2).length < lqa.s) {
                            throw new eHa(Zra.M, new Object[uSa.E]);
                        }
                        block = zGa_2.getBlockByText((u)b2, a2[pPa.f]);
                        if (((ArrayList<E>)a2).length >= uua.s) {
                            n4 = zGa_2.parseInt(a2[lqa.s], (int)uSa.E, (int)Ypa.A);
                        }
                    }
                }
                a2 = Lists.newArrayList();
                ArrayList<sHa> arrayList = Lists.newArrayList();
                ArrayList<sHa> arrayList2 = Lists.newArrayList();
                LinkedList<Object> linkedList = Lists.newLinkedList();
                xF2 = new XF(((Xv)xF2).minX - ((Xv)xF).minX, ((Xv)xF2).minY - ((Xv)xF).minY, ((Xv)xF2).minZ - ((Xv)xF).minZ);
                int n7 = n5 = ((Xv)xF).minZ;
                while (n7 <= ((Xv)xF).maxZ) {
                    int n8 = ((Xv)xF).minY;
                    while (n8 <= ((Xv)xF).maxY) {
                        int n9;
                        int n10 = ((Xv)xF).minX;
                        while (n10 <= ((Xv)xF).maxX) {
                            int n11;
                            c2 = new XF(n11, n9, n5);
                            xF5 = ((XF)((Object)c2)).add(xF2);
                            object = gg2.J((XF)((Object)c2));
                            if (!(n6 != 0 && object.J() == QFa.HF || block != null && (object.J() != block || n4 >= 0 && object.J().f((IBlockState)object) != n4))) {
                                uY uY2 = gg2.J((XF)((Object)c2));
                                if (uY2 != null) {
                                    Waa waa2 = new Waa();
                                    uY2.J(waa2);
                                    arrayList.add(new sHa(xF5, object, waa2));
                                    linkedList.addLast(c2);
                                } else if (!object.J().J() && !object.J().l()) {
                                    arrayList2.add(new sHa(xF5, object, (Waa)null));
                                    linkedList.addFirst(c2);
                                } else {
                                    a2.add(new sHa(xF5, object, (Waa)null));
                                    linkedList.addLast(c2);
                                }
                            }
                            n10 = ++n11;
                        }
                        n8 = ++n9;
                    }
                    n7 = ++n5;
                }
                if (n3 != 0) {
                    Iterator iterator;
                    Iterator iterator2 = iterator = linkedList.iterator();
                    while (iterator2.hasNext()) {
                        XF xF6 = (XF)((Object)iterator.next());
                        uY uY3 = gg2.J(xF6);
                        if (uY3 instanceof HA) {
                            ((HA)uY3).l();
                        }
                        gg2.J(xF6, QFa.fE.J(), uqa.g);
                        iterator2 = iterator;
                    }
                    iterator = linkedList.iterator();
                    Iterator iterator3 = iterator;
                    while (iterator3.hasNext()) {
                        XF xF7 = (XF)((Object)iterator.next());
                        iterator3 = iterator;
                        gg2.J(xF7, QFa.HF.J(), yRa.d);
                    }
                }
                ArrayList<sHa> arrayList3 = Lists.newArrayList();
                arrayList3.addAll(a2);
                arrayList3.addAll(arrayList);
                arrayList3.addAll(arrayList2);
                List list = Lists.reverse(arrayList3);
                Object object2 = list.iterator();
                Iterator iterator = object2;
                while (iterator.hasNext()) {
                    c2 = (sHa)object2.next();
                    xF5 = gg2.J(((sHa)c2).J);
                    if (xF5 instanceof HA) {
                        ((HA)xF5).l();
                    }
                    gg2.J(((sHa)c2).J, QFa.fE.J(), uqa.g);
                    iterator = object2;
                }
                n2 = uSa.E;
                object2 = arrayList3.iterator();
                while (object2.hasNext()) {
                    c2 = (sHa)object2.next();
                    Object object3 = c2;
                    if (!gg2.J(((sHa)object3).J, ((sHa)object3).A, uqa.g)) continue;
                    ++n2;
                }
                Object object4 = object2 = arrayList.iterator();
                while (object4.hasNext()) {
                    c2 = (sHa)object2.next();
                    xF5 = gg2.J(((sHa)c2).J);
                    if (((sHa)c2).I != null && xF5 != null) {
                        XF xF8 = xF5;
                        Object object5 = c2;
                        ((sHa)object5).I.J(rRa.X, ((sHa)c2).J.getX());
                        Object object6 = c2;
                        ((sHa)object5).I.J(uOa.Ja, ((sHa)object6).J.getY());
                        ((sHa)object6).I.J(oua.v, ((sHa)c2).J.getZ());
                        xF8.f(((sHa)c2).I);
                        xF8.f();
                    }
                    Object object7 = c2;
                    gg2.J(((sHa)object7).J, ((sHa)object7).A, uqa.g);
                    object4 = object2;
                }
                Object object8 = object2 = list.iterator();
                while (object8.hasNext()) {
                    c2 = (sHa)object2.next();
                    object8 = object2;
                    Object object9 = c2;
                    gg2.d(((sHa)object9).J, ((sHa)object9).A.J());
                }
                object2 = gg2.J((Xv)xF, uSa.E != 0);
                if (object2 != null) {
                    c2 = object2.iterator();
                    while (c2.hasNext()) {
                        xF5 = (Oy)c2.next();
                        if (!xF.J(((Oy)xF5).position)) continue;
                        object = ((Oy)xF5).position.add(xF2);
                        gg2.l((XF)((Object)object), xF5.getBlock(), (int)(((Oy)xF5).scheduledTime - gg2.J().l()), ((Oy)xF5).priority);
                    }
                }
                if (n2 <= 0) {
                    throw new oGa(WOa.G, new Object[uSa.E]);
                }
                b2.J(Rha.AFFECTED_BLOCKS, n2);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = n2;
                zGa_2.notifyOperators((u)b2, (Qc)zGa_22, (String)vsa.O, (Object[])objectArray);
                return;
            }
            throw new oGa(pQa.Ma, new Object[uSa.E]);
        }
        throw new oGa(pQa.Ma, new Object[uSa.E]);
    }

    public zGa_2() {
        zGa_2 a2;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        void a2;
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            return zGa_2.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        if (d2.length > yRa.d && d2.length <= uua.p) {
            return zGa_2.func_175771_a((String[])d2, (int)yRa.d, (XF)a2);
        }
        if (d2.length > uua.p && d2.length <= WOa.fa) {
            return zGa_2.func_175771_a((String[])d2, (int)uua.p, (XF)a2);
        }
        if (d2.length == NTa.C) {
            String[] stringArray2 = new String[yRa.d];
            stringArray2[uSa.E] = sOa.G;
            stringArray2[vRa.d] = sra.a;
            stringArray2[uqa.g] = bqa.K;
            return zGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == pPa.f) {
            String[] stringArray3 = new String[yRa.d];
            stringArray3[uSa.E] = AQa.t;
            stringArray3[vRa.d] = vPa.m;
            stringArray3[uqa.g] = kPa.c;
            return zGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray3);
        }
        if (d2.length == lqa.s && bqa.K.equals(d2[WOa.fa])) {
            return zGa_2.getListOfStringsMatchingLastWord((String[])d2, (Collection)Block.blockRegistry.J());
        }
        return null;
    }
}

