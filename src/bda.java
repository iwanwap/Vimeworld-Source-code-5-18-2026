/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  QSa
 *  bFa
 *  fCa
 *  ld
 *  vRa
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class bda
implements KC<Pd> {
    private final List<PCa> A;
    private gba I;

    /*
     * WARNING - void declaration
     */
    public bda(gba gba2, bFa ... bFaArray) {
        int n2;
        void a22;
        void b2;
        bda bda2 = this;
        bda2.A = Lists.newArrayList();
        bda2.I = b2;
        b2 = a22;
        int a22 = ((void)b2).length;
        int n3 = n2 = uSa.E;
        while (n3 < a22) {
            bda c2;
            bda bda3 = c2 = b2[n2];
            bda2.A.add(new PCa(bda2, c2.J(), ((bFa)bda3).w, ((bFa)bda3).s.J(), c2.f()));
            n3 = ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        Lca b2 = lca;
        bda a2 = this;
        a2.I = b2.readEnumValue(gba.class);
        int n3 = b2.readVarIntFromBuffer();
        int n4 = n2 = uSa.E;
        while (true) {
            bda bda2;
            ld ld2;
            Daa daa;
            int n5;
            GameProfile gameProfile;
            block12: {
                if (n4 >= n3) {
                    return;
                }
                gameProfile = null;
                n5 = uSa.E;
                daa = null;
                ld2 = null;
                switch (fCa.I[a2.I.ordinal()]) {
                    case 1: {
                        gameProfile = new GameProfile(b2.readUuid(), b2.readStringFromBuffer(QSa.p));
                        int n6 = b2.readVarIntFromBuffer();
                        int n7 = uSa.E;
                        while (n7 < n6) {
                            int n8;
                            Object object = b2;
                            String string = ((Lca)object).readStringFromBuffer(BQa.h);
                            String string2 = ((Lca)object).readStringFromBuffer(BQa.h);
                            if (((Lca)object).readBoolean()) {
                                String string3 = string;
                                String string4 = string;
                                gameProfile.getProperties().put(string4, new Property(string4, string2, b2.readStringFromBuffer(BQa.h)));
                            } else {
                                String string5 = string;
                                gameProfile.getProperties().put(string5, new Property(string5, string2));
                            }
                            n7 = ++n8;
                        }
                        Lca lca2 = b2;
                        daa = Daa.getByID(lca2.readVarIntFromBuffer());
                        n5 = lca2.readVarIntFromBuffer();
                        if (!lca2.readBoolean()) break;
                        ld2 = b2.readChatComponent();
                        bda2 = a2;
                        break block12;
                    }
                    case 2: {
                        gameProfile = new GameProfile(b2.readUuid(), null);
                        daa = Daa.getByID(b2.readVarIntFromBuffer());
                        bda2 = a2;
                        break block12;
                    }
                    case 3: {
                        gameProfile = new GameProfile(b2.readUuid(), null);
                        bda2 = a2;
                        n5 = b2.readVarIntFromBuffer();
                        break block12;
                    }
                    case 4: {
                        gameProfile = new GameProfile(b2.readUuid(), null);
                        if (!b2.readBoolean()) break;
                        ld2 = b2.readChatComponent();
                        bda2 = a2;
                        break block12;
                    }
                    case 5: {
                        gameProfile = new GameProfile(b2.readUuid(), null);
                    }
                }
                bda2 = a2;
            }
            bda2.A.add(new PCa(a2, gameProfile, n5, daa, ld2));
            n4 = ++n2;
        }
    }

    public bda() {
        bda a2;
        a2.A = Lists.newArrayList();
    }

    public List<PCa> J() {
        bda a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        bda b2 = pd2;
        bda a2 = this;
        b2.J(a2);
    }

    public gba J() {
        bda a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        bda a2;
        Lca b2 = lca;
        bda bda2 = a2 = this;
        b2.writeEnumValue(a2.I);
        b2.writeVarIntToBuffer(bda2.A.size());
        for (PCa pCa : bda2.A) {
            switch (fCa.I[a2.I.ordinal()]) {
                case 1: {
                    Object object = b2;
                    while (false) {
                    }
                    PCa pCa2 = pCa;
                    ((Lca)object).writeUuid(pCa2.J().getId());
                    ((Lca)object).writeString(pCa2.J().getName());
                    PCa pCa3 = pCa;
                    b2.writeVarIntToBuffer(pCa3.J().getProperties().size());
                    Iterator iterator = pCa3.J().getProperties().values().iterator();
                    while (iterator.hasNext()) {
                        Property property;
                        Property property2 = property = (Property)iterator.next();
                        b2.writeString(property.getName());
                        b2.writeString(property2.getValue());
                        if (property2.hasSignature()) {
                            b2.writeBoolean(vRa.d != 0);
                            b2.writeString(property.getSignature());
                            continue;
                        }
                        b2.writeBoolean(uSa.E != 0);
                    }
                    Object object2 = b2;
                    PCa pCa4 = pCa;
                    ((Lca)object2).writeVarIntToBuffer(pCa4.J().getID());
                    ((Lca)object2).writeVarIntToBuffer(pCa4.J());
                    Lca lca2 = b2;
                    if (pCa.J() == null) {
                        lca2.writeBoolean(uSa.E != 0);
                        break;
                    }
                    lca2.writeBoolean(vRa.d != 0);
                    b2.writeChatComponent(pCa.J());
                    break;
                }
                case 2: {
                    Lca lca3 = b2;
                    PCa pCa5 = pCa;
                    lca3.writeUuid(pCa5.J().getId());
                    lca3.writeVarIntToBuffer(pCa5.J().getID());
                    break;
                }
                case 3: {
                    Lca lca4 = b2;
                    PCa pCa6 = pCa;
                    lca4.writeUuid(pCa6.J().getId());
                    lca4.writeVarIntToBuffer(pCa6.J());
                    break;
                }
                case 4: {
                    b2.writeUuid(pCa.J().getId());
                    Lca lca5 = b2;
                    if (pCa.J() == null) {
                        lca5.writeBoolean(uSa.E != 0);
                        break;
                    }
                    lca5.writeBoolean(vRa.d != 0);
                    b2.writeChatComponent(pCa.J());
                    break;
                }
                case 5: {
                    b2.writeUuid(pCa.J().getId());
                }
            }
        }
    }

    public bda(gba gba2, Iterable<bFa> iterable) {
        Iterator b2;
        Object c2 = iterable;
        bda a2 = this;
        a2.A = Lists.newArrayList();
        a2.I = b2;
        Iterator iterator = b2 = c2.iterator();
        while (iterator.hasNext()) {
            c2 = (bFa)b2.next();
            iterator = b2;
            Object object = c2;
            a2.A.add(new PCa(a2, c2.J(), ((bFa)object).w, ((bFa)object).s.J(), c2.f()));
        }
    }

    public String toString() {
        bda a2;
        return Objects.toStringHelper(a2).add(Fsa.T, (Object)a2.I).add(uSa.X, a2.A).toString();
    }
}

