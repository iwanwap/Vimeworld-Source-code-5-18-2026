/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  OCa
 *  TY
 *  fZ
 *  jRa
 *  sz
 *  vRa
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class TY_3
implements D {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat(jRa.n);
    private final File usercacheFile;
    private final Map<UUID, aY> uuidToProfileEntryMap;
    private final Map<String, aY> usernameToProfileEntryMap;
    public final Gson gson;
    private static final ParameterizedType TYPE = new fZ();
    private final LinkedList<GameProfile> gameProfiles;
    private final OCa mcServer;

    private aY J(UUID uUID) {
        Object b2 = uUID;
        TY_3 a2 = this;
        if ((b2 = a2.uuidToProfileEntryMap.get(b2)) != null) {
            GameProfile gameProfile = ((aY)b2).J();
            a2.gameProfiles.remove(gameProfile);
            a2.gameProfiles.addFirst(gameProfile);
        }
        return b2;
    }

    public String[] J() {
        TY_3 a2;
        ArrayList<String> arrayList = Lists.newArrayList(a2.usernameToProfileEntryMap.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static GameProfile J(OCa oCa2, String string) {
        Object b2 = string;
        OCa a2 = oCa2;
        GameProfile[] gameProfileArray = new GameProfile[vRa.d];
        rZ rZ2 = new rZ(gameProfileArray);
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = b2;
        a2.J().findProfilesByNames(stringArray, Agent.MINECRAFT, rZ2);
        if (!a2.G() && gameProfileArray[uSa.E] == null) {
            UUID uUID = Sx.J(new GameProfile(null, (String)b2));
            b2 = new GameProfile(uUID, (String)b2);
            rZ2.onProfileLookupSucceeded((GameProfile)b2);
        }
        return gameProfileArray[uSa.E];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        TY_3 tY_3 = this;
        String string = tY_3.gson.toJson(tY_3.J(PRa.U));
        Object a2 = null;
        try {
            a2 = Files.newWriter(tY_3.usercacheFile, Charsets.UTF_8);
            ((Writer)a2).write(string);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            return;
        }
        finally {
            IOUtils.closeQuietly((Writer)a2);
        }
    }

    public GameProfile J(UUID uUID) {
        Object b2 = uUID;
        TY_3 a2 = this;
        if ((b2 = a2.uuidToProfileEntryMap.get(b2)) == null) {
            return null;
        }
        return ((aY)b2).J();
    }

    /*
     * WARNING - void declaration
     */
    private List<aY> J(int n2) {
        void a2;
        TY_3 tY_3 = this;
        ArrayList<aY> arrayList = Lists.newArrayList();
        for (Object b2 : Lists.newArrayList(Iterators.limit(tY_3.gameProfiles.iterator(), (int)a2))) {
            if ((b2 = tY_3.J(((GameProfile)b2).getId())) == null) continue;
            arrayList.add((aY)b2);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public TY_3(OCa oCa2, File file) {
        void a2;
        TY_3 b2;
        Object c2 = oCa2;
        TY_3 tY_3 = b2 = this;
        b2.usernameToProfileEntryMap = Maps.newHashMap();
        b2.uuidToProfileEntryMap = Maps.newHashMap();
        b2.gameProfiles = Lists.newLinkedList();
        tY_3.mcServer = c2;
        tY_3.usercacheFile = a2;
        c2 = new GsonBuilder();
        ((GsonBuilder)c2).registerTypeHierarchyAdapter(aY.class, new sz((TY)b2, null));
        b2.gson = ((GsonBuilder)c2).create();
        b2.J();
    }

    public void J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        TY_3 a2 = this;
        a2.J(b2, null);
    }

    public GameProfile J(String string) {
        TY_3 tY_3;
        String a2;
        TY_3 tY_32 = this;
        Object b2 = tY_32.usernameToProfileEntryMap.get(a2 = a2.toLowerCase(Locale.ROOT));
        if (b2 != null && new Date().getTime() >= aY.J((aY)b2).getTime()) {
            tY_32.uuidToProfileEntryMap.remove(((aY)b2).J().getId());
            tY_32.usernameToProfileEntryMap.remove(((aY)b2).J().getName().toLowerCase(Locale.ROOT));
            tY_32.gameProfiles.remove(((aY)b2).J());
            b2 = null;
        }
        if (b2 != null) {
            GameProfile gameProfile = ((aY)b2).J();
            TY_3 tY_33 = tY_32;
            tY_32.gameProfiles.remove(gameProfile);
            tY_3 = tY_33;
            tY_33.gameProfiles.addFirst(gameProfile);
        } else {
            GameProfile gameProfile = TY_3.J(tY_32.mcServer, a2);
            if (gameProfile != null) {
                TY_3 tY_34 = tY_32;
                tY_34.J(gameProfile);
                b2 = tY_34.usernameToProfileEntryMap.get(a2);
            }
            tY_3 = tY_32;
        }
        tY_3.f();
        if (b2 == null) {
            return null;
        }
        return ((aY)b2).J();
    }

    /*
     * WARNING - void declaration
     */
    private void J(GameProfile gameProfile, Date date) {
        Object object;
        void b2;
        Object c2 = date;
        TY_3 a2 = this;
        UUID uUID = b2.getId();
        if (c2 == null) {
            Object object2 = object = Calendar.getInstance();
            ((Calendar)object).setTime(new Date());
            ((Calendar)object2).add(uqa.g, vRa.d);
            c2 = ((Calendar)object).getTime();
        }
        object = b2.getName().toLowerCase(Locale.ROOT);
        c2 = new aY((TY)a2, (GameProfile)b2, (Date)c2, null);
        if (a2.uuidToProfileEntryMap.containsKey(uUID)) {
            object = a2.uuidToProfileEntryMap.get(uUID);
            a2.usernameToProfileEntryMap.remove(((aY)object).J().getName().toLowerCase(Locale.ROOT));
            a2.gameProfiles.remove(b2);
        }
        a2.usernameToProfileEntryMap.put(b2.getName().toLowerCase(Locale.ROOT), (aY)c2);
        a2.uuidToProfileEntryMap.put(uUID, (aY)c2);
        TY_3 tY_3 = a2;
        tY_3.gameProfiles.addFirst((GameProfile)b2);
        tY_3.f();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        TY_3 tY_3 = this;
        Object a2 = null;
        try {
            TY_3 tY_32 = tY_3;
            a2 = Files.newReader(tY_32.usercacheFile, Charsets.UTF_8);
            List list = (List)tY_32.gson.fromJson((Reader)a2, (Type)TYPE);
            TY_3 tY_33 = tY_3;
            tY_33.usernameToProfileEntryMap.clear();
            tY_33.uuidToProfileEntryMap.clear();
            tY_33.gameProfiles.clear();
            for (aY aY2 : Lists.reverse(list)) {
                if (aY2 == null) continue;
                tY_3.J(aY2.J(), aY2.J());
            }
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (JsonParseException jsonParseException) {
            return;
        }
        finally {
            IOUtils.closeQuietly((Reader)a2);
        }
    }
}

