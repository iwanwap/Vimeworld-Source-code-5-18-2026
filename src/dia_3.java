/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  Mha
 *  OCa
 *  Qc
 *  RPa
 *  Tz
 *  Usa
 *  aX
 *  bFa
 *  bIa
 *  dia
 *  eHa
 *  gY
 *  oGa
 *  vRa
 *  yQa
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dia_3
extends Mha {
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        Iterator a2;
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = ITa.Ja;
            stringArray2[vRa.d] = yQa.B;
            return dia_3.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length != uqa.g) {
            if (d2.length == yRa.d) {
                return dia_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
            }
            return null;
        }
        ArrayList<String> c2 = Lists.newArrayList();
        Iterator iterator = a2 = Tz.Aa.iterator();
        while (iterator.hasNext()) {
            aX aX2 = (aX)a2.next();
            iterator = a2;
            c2.add(aX2.statId);
        }
        return dia_3.getListOfStringsMatchingLastWord((String[])d2, c2);
    }

    public dia_3() {
        dia_3 a2;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        dia_3 a2 = this;
        return nua.r;
    }

    public String getCommandName() {
        return Usa.V;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        void a22;
        dia_3 dia_32 = this;
        if (((void)a22).length < uqa.g) {
            throw new eHa(nua.r, new Object[uSa.E]);
        }
        aX aX2 = Tz.J((String)a22[vRa.d]);
        if (aX2 == null && !a22[vRa.d].equals(JSa.a)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a22[vRa.d];
            throw new oGa(AQa.x, objectArray);
        }
        bFa bFa2 = ((void)a22).length >= yRa.d ? dia_3.getPlayer((u)b2, (String)a22[uqa.g]) : dia_3.getCommandSenderAsPlayer((u)b2);
        void v1 = a22;
        boolean a22 = v1[uSa.E].equalsIgnoreCase(ITa.Ja);
        boolean bl = v1[uSa.E].equalsIgnoreCase(yQa.B);
        if (a22 || bl) {
            Object c22;
            if (aX2 == null) {
                if (a22) {
                    c22 = mY.m.iterator();
                    Object object = c22;
                    while (object.hasNext()) {
                        gY gY2 = (gY)c22.next();
                        object = c22;
                        bFa2.J((aX)gY2);
                    }
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = bFa2.J();
                    dia_3.notifyOperators((u)b2, (Qc)dia_32, (String)RPa.Z, (Object[])objectArray);
                    return;
                }
                if (bl) {
                    c22 = Lists.reverse(mY.m).iterator();
                    Object object = c22;
                    while (object.hasNext()) {
                        gY gY3 = (gY)c22.next();
                        object = c22;
                        bFa2.f((aX)gY3);
                    }
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = bFa2.J();
                    dia_3.notifyOperators((u)b2, (Qc)dia_32, (String)lTa.C, (Object[])objectArray);
                    return;
                }
            } else {
                if (aX2 instanceof gY) {
                    c22 = (gY)aX2;
                    if (a22) {
                        Iterator iterator;
                        if (bFa2.J().f((gY)c22)) {
                            Object[] objectArray = new Object[uqa.g];
                            objectArray[uSa.E] = bFa2.J();
                            objectArray[vRa.d] = aX2.J();
                            throw new oGa(Yua.Da, objectArray);
                        }
                        ArrayList<gY> arrayList = Lists.newArrayList();
                        Object object = c22;
                        while (((gY)object).parentAchievement != null && !bFa2.J().f(((gY)c22).parentAchievement)) {
                            arrayList.add(((gY)c22).parentAchievement);
                            c22 = ((gY)c22).parentAchievement;
                            object = c22;
                        }
                        Iterator iterator2 = iterator = Lists.reverse(arrayList).iterator();
                        while (iterator2.hasNext()) {
                            gY gY4 = (gY)iterator.next();
                            iterator2 = iterator;
                            bFa2.J((aX)gY4);
                        }
                    } else if (bl) {
                        if (!bFa2.J().f((gY)c22)) {
                            Object[] objectArray = new Object[uqa.g];
                            objectArray[uSa.E] = bFa2.J();
                            objectArray[vRa.d] = aX2.J();
                            throw new oGa(Yua.D, objectArray);
                        }
                        Object object = Lists.newArrayList(Iterators.filter(mY.m.iterator(), new bIa((dia)dia_32, bFa2, aX2)));
                        ArrayList<gY> arrayList = Lists.newArrayList(object);
                        for (Object c22 : object) {
                            object = c22;
                            int n2 = uSa.E;
                            gY gY5 = object;
                            while (gY5 != null) {
                                if (object == aX2) {
                                    n2 = vRa.d;
                                }
                                gY5 = object.parentAchievement;
                            }
                            if (n2 != 0) continue;
                            object = c22;
                            Object object2 = object;
                            while (object2 != null) {
                                arrayList.remove(c22);
                                object = object.parentAchievement;
                                object2 = object;
                            }
                        }
                        Iterator iterator = arrayList.iterator();
                        Iterator iterator3 = iterator;
                        while (iterator3.hasNext()) {
                            c22 = (gY)iterator.next();
                            iterator3 = iterator;
                            bFa2.f((aX)c22);
                        }
                    }
                }
                if (a22) {
                    bFa2.J(aX2);
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = bFa2.J();
                    objectArray[vRa.d] = aX2.J();
                    dia_3.notifyOperators((u)b2, (Qc)dia_32, (String)DPa.a, (Object[])objectArray);
                    return;
                }
                if (bl) {
                    bFa2.f(aX2);
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = aX2.J();
                    objectArray[vRa.d] = bFa2.J();
                    dia_3.notifyOperators((u)b2, (Qc)dia_32, (String)cTa.b, (Object[])objectArray);
                }
            }
        }
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        dia_3 a2 = this;
        if (c2 == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

