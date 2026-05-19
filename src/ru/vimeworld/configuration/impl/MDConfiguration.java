/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  D
 *  bf
 *  eS
 *  vRa
 *  vd
 *  zU
 */
package ru.vimeworld.configuration.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MDConfiguration
implements D,
KeepClassName {
    private int currentProfile = uSa.E;
    private final List<bf> profiles;

    public bf J() {
        MDConfiguration a2;
        return a2.J().get(a2.J());
    }

    public Map<Integer, Integer> J() {
        MDConfiguration a2;
        return a2.J().get(a2.currentProfile).f();
    }

    public void J(int n2) {
        int b2 = n2;
        MDConfiguration a2 = this;
        a2.currentProfile = b2 = Math.max(Math.min(b2, AQa.P), uSa.E);
        MDConfiguration mDConfiguration = a2;
        zU.M.J().J(mDConfiguration.J(mDConfiguration.profiles.get((int)b2).I));
        if (mx.J() == null) {
            return;
        }
        if (mx.J().J() == null) {
            return;
        }
        mx.J().J().f().clear();
        mx.J().l(mx.J().J());
    }

    public int J() {
        MDConfiguration a2;
        return Math.max(Math.min(a2.currentProfile, AQa.P), uSa.E);
    }

    public List<bf> J() {
        MDConfiguration a2;
        MDConfiguration mDConfiguration = a2;
        while (mDConfiguration.profiles.size() > tTa.h) {
            MDConfiguration mDConfiguration2 = a2;
            mDConfiguration = mDConfiguration2;
            a2.profiles.remove(mDConfiguration2.profiles.size() - vRa.d);
        }
        MDConfiguration mDConfiguration3 = a2;
        while (mDConfiguration3.profiles.size() < tTa.h) {
            MDConfiguration mDConfiguration4 = a2;
            mDConfiguration3 = mDConfiguration4;
            mDConfiguration4.profiles.add(new bf());
        }
        return a2.profiles;
    }

    public MDConfiguration() {
        MDConfiguration a2;
        MDConfiguration mDConfiguration = a2;
        mDConfiguration.profiles = new ArrayList<bf>();
    }

    public Map<eS, cw> J(Map<eS, vd> map) {
        Iterator b2 = map;
        MDConfiguration a2 = this;
        HashMap<eS, cw> hashMap = new HashMap<eS, cw>();
        jU jU2 = zU.M.J();
        Iterator iterator = b2 = b2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = b2.next();
            if (entry.getKey() == null) {
                iterator = b2;
                continue;
            }
            if (!((eS)entry.getKey()).isWearable()) {
                iterator = b2;
                continue;
            }
            eS eS2 = (eS)entry.getKey();
            MiniDotItem miniDotItem = (MiniDotItem)BS.ITEMS.get(vd.J((vd)((vd)entry.getValue())));
            if (miniDotItem == null) {
                iterator = b2;
                continue;
            }
            if (eS2 == eS.PET) {
                eS2 = jU2.J(eS2);
            }
            hashMap.put(eS2, new cw(miniDotItem, eS2, ((vd)entry.getValue()).J()));
            iterator = b2;
        }
        return hashMap;
    }
}

