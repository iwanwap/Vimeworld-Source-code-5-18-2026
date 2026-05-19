/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Af
 *  Cra
 *  D
 *  Gl
 *  Kl
 *  Sk
 *  Xd
 *  YQ
 *  bq
 *  dT
 *  eD
 *  eS
 *  kta
 *  vRa
 *  zU
 */
package ru.vimeworld.minidot.emotes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MiniDotEmote
extends MiniDotItem {
    private double speed;
    private final String folder;
    public Random rand;
    private boolean loop;
    private final List<String> meshes;
    private final List<YQ> models;
    private int duration;
    private final Map<Integer, hg> sounds;

    public List<String> C() {
        MiniDotEmote a2;
        return a2.meshes;
    }

    public List<YQ> l() {
        MiniDotEmote a2;
        return a2.models;
    }

    public double J() {
        MiniDotEmote a2;
        return a2.speed;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2) {
        void a2;
        Object c2 = string;
        MiniDotEmote b2 = this;
        c2 = new ResourceLocation(Cra.V, (String)c2);
        b2.sounds.put((int)a2, new hg((ResourceLocation)c2, (int)a2));
    }

    /*
     * WARNING - void declaration
     */
    public void f(eD eD2) {
        Object b2;
        MiniDotEmote miniDotEmote = this;
        Object object = b2 = miniDotEmote.meshes.iterator();
        while (object.hasNext()) {
            void a2;
            String string = (String)b2.next();
            ((sf)a2.J().f().get(string)).J(uSa.E != 0);
            object = b2;
        }
    }

    public String f() {
        MiniDotEmote a2;
        return a2.folder;
    }

    public void J(String string) {
        Object b2 = string;
        MiniDotEmote a2 = this;
        b2 = Sk.J((ResourceLocation)new ResourceLocation(Cra.V, (String)b2));
        bq bq2 = zU.M.J();
        List<YQ> list = a2.models;
        list.getClass();
        bq2.J((Kl)b2, Af.J(list));
    }

    public void J(Gl gl2, eD eD2, int n2) {
        int d2 = n2;
        MiniDotEmote miniDotEmote = this;
    }

    public int J() {
        MiniDotEmote a2;
        return a2.duration;
    }

    public float J(float f2) {
        float b2 = f2;
        MiniDotEmote a2 = this;
        return a2.rand.nextFloat() * b2 - b2 / kta.v;
    }

    public MDModel J() {
        MiniDotEmote a2;
        return a2.model;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eD eD2) {
        Object b2;
        MiniDotEmote miniDotEmote = this;
        Object object = b2 = miniDotEmote.meshes.iterator();
        while (object.hasNext()) {
            void a2;
            String string = (String)b2.next();
            ((sf)a2.J().f().get(string)).J(vRa.d != 0);
            object = b2;
        }
    }

    public void J(double a2) {
        b.speed = a2;
    }

    @Override
    public void f(dT object) {
        MiniDotEmote b2 = object;
        object = this;
    }

    public MiniDotEmote J() {
        MiniDotEmote a2;
        return a2;
    }

    public void f(Gl gl2, Xd xd2, eD eD2, int n2, float f2) {
        float f3 = f2;
        MiniDotEmote a2 = this;
    }

    public void J(Gl gl2, Xd xd2, eD eD2, int n2, float f2) {
        float f3 = f2;
        MiniDotEmote a2 = this;
    }

    public boolean l() {
        MiniDotEmote a2;
        return a2.loop;
    }

    public void J(int n2) {
        int b2 = n2;
        MiniDotEmote a2 = this;
        a2.duration = b2;
    }

    public MiniDotEmote J(String string) {
        String b2 = string;
        MiniDotEmote a2 = this;
        return a2;
    }

    public Map<Integer, hg> J() {
        MiniDotEmote a2;
        return a2.sounds;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        MiniDotEmote a2 = this;
        a2.loop = b2;
    }

    /*
     * WARNING - void declaration
     */
    public MiniDotEmote(int n2, eS eS2, String string, MDModel mDModel) {
        void b2;
        D e2;
        void c2;
        void d2;
        MiniDotEmote a2;
        MiniDotEmote miniDotEmote = d3;
        D d3 = mDModel;
        MiniDotEmote miniDotEmote2 = a2 = miniDotEmote;
        super((int)d2, (eS)c2, (MDModel)e2);
        a2.speed = oua.i;
        a2.rand = ThreadLocalRandom.current();
        MiniDotEmote miniDotEmote3 = a2;
        a2.meshes = new ArrayList<String>();
        miniDotEmote2.models = new ArrayList<YQ>();
        miniDotEmote2.sounds = new HashMap<Integer, hg>();
        miniDotEmote2.folder = b2;
    }
}

