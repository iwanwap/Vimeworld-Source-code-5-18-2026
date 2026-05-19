/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  Fpa
 *  Ioa
 *  KNa
 *  Kpa
 *  NTa
 *  Oaa
 *  Pma
 *  RNa
 *  RPa
 *  Roa
 *  Spa
 *  Usa
 *  Uta
 *  VQa
 *  Zta
 *  aQa
 *  asa
 *  hqa
 *  hra
 *  ina
 *  pua
 *  uOa
 *  vRa
 *  wra
 *  zTa
 *  zsa
 */
package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLDecoder;
import java.util.Base64;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Main {
    private static boolean J(String a2) {
        if (a2 != null && !a2.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Main() {
        Main a2;
    }

    private static String J(String string) {
        String string2 = string;
        if (string2.startsWith(CRa.y)) {
            return new String(Base64.getDecoder().decode(string2.substring(CRa.y.length())));
        }
        if (string2.startsWith(ATa.e)) {
            try {
                return URLDecoder.decode(string2.substring(ATa.e.length()), wsa.H);
            }
            catch (UnsupportedEncodingException a2) {
                throw new RuntimeException(a2);
            }
        }
        return string2;
    }

    public static void main(String[] stringArray) {
        OptionSet optionSet;
        OptionSet optionSet2;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec3;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec4;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec5;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec6;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec7;
        ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec8;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object a2;
        block5: {
            String[] stringArray2 = stringArray;
            System.setProperty(EPa.e, oQa.l);
            a2 = new OptionParser();
            ((OptionParser)a2).allowsUnrecognizedOptions();
            ((OptionParser)a2).accepts(tSa.fa);
            ((OptionParser)a2).accepts(vRa.U);
            ((OptionParser)a2).accepts(zTa.Aa);
            object10 = ((OptionParser)a2).accepts(Zta.Fa).withRequiredArg();
            object9 = ((OptionParser)a2).accepts(RPa.A).withRequiredArg().ofType(Integer.class).defaultsTo(WRa.d, (Integer[])new Integer[uSa.E]);
            object8 = ((OptionParser)a2).accepts(NTa.t).withRequiredArg().ofType(File.class).defaultsTo(new File(VQa.ja), (File[])new File[uSa.E]);
            Object object11 = a2;
            object7 = ((OptionParser)object11).accepts(Uta.Ga).withRequiredArg().ofType(File.class);
            object6 = ((OptionParser)object11).accepts(Ora.A).withRequiredArg().ofType(File.class);
            object5 = ((OptionParser)object11).accepts(Fpa.Q).withRequiredArg();
            ArgumentAcceptingOptionSpec<Integer> argumentAcceptingOptionSpec9 = ((OptionParser)object11).accepts(VPa.T).withRequiredArg().defaultsTo(Zqa.v, (String[])new String[uSa.E]).ofType(Integer.class);
            Object object12 = a2;
            argumentAcceptingOptionSpec8 = ((OptionParser)object12).accepts(Cta.P).withRequiredArg();
            argumentAcceptingOptionSpec7 = ((OptionParser)object12).accepts(rQa.L).withRequiredArg();
            argumentAcceptingOptionSpec6 = ((OptionParser)object12).accepts(rua.f).withRequiredArg().defaultsTo(new StringBuilder().insert(3 ^ 3, hqa.Ha).append(Kpa.J() % asa.fa).toString(), (String[])new String[uSa.E]);
            Object object13 = a2;
            argumentAcceptingOptionSpec5 = ((OptionParser)object13).accepts(Usa.w).withRequiredArg();
            argumentAcceptingOptionSpec4 = ((OptionParser)object13).accepts(Zqa.C).withRequiredArg().required();
            argumentAcceptingOptionSpec3 = ((OptionParser)object13).accepts(uSa.K).withRequiredArg().required();
            object4 = ((OptionParser)object13).accepts(oQa.R).withRequiredArg().ofType(Integer.class).defaultsTo(Jpa.Z, (Integer[])new Integer[uSa.E]);
            object3 = ((OptionParser)a2).accepts(NTa.x).withRequiredArg().ofType(Integer.class).defaultsTo(wra.O, (Integer[])new Integer[uSa.E]);
            object2 = ((OptionParser)a2).accepts(opa.d).withRequiredArg().defaultsTo(Spa.T, (String[])new String[uSa.E]);
            object = ((OptionParser)a2).accepts(aQa.v).withRequiredArg().defaultsTo(Spa.T, (String[])new String[uSa.E]);
            Object object14 = a2;
            argumentAcceptingOptionSpec2 = ((OptionParser)object14).accepts(uOa.I).withRequiredArg();
            argumentAcceptingOptionSpec = ((OptionParser)object14).accepts(Gta.X).withRequiredArg().defaultsTo(pua.i, (String[])new String[uSa.E]);
            Object object15 = a2;
            a2 = ((OptionParser)object15).nonOptions();
            optionSet2 = ((OptionParser)object15).parse(stringArray2);
            a2 = optionSet2.valuesOf(a2);
            if (!a2.isEmpty()) {
                System.out.println(new StringBuilder().insert(3 >> 2, sra.E).append(a2).toString());
            }
            a2 = optionSet2.valueOf(object5);
            object5 = Proxy.NO_PROXY;
            if (a2 != null) {
                try {
                    object5 = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress((String)a2, (int)optionSet2.valueOf(argumentAcceptingOptionSpec9)));
                    optionSet = optionSet2;
                    break block5;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            optionSet = optionSet2;
        }
        String string = optionSet.valueOf(argumentAcceptingOptionSpec8);
        a2 = optionSet2.valueOf(argumentAcceptingOptionSpec7);
        if (!((Proxy)object5).equals(Proxy.NO_PROXY) && Main.J(string) && Main.J((String)a2)) {
            Authenticator.setDefault((Authenticator)new Pma(string, (String)a2));
        }
        a2 = Main.J((String)argumentAcceptingOptionSpec6.value(optionSet2));
        int n2 = optionSet2.valueOf(object4);
        int n3 = optionSet2.valueOf(object3);
        OptionSet optionSet3 = optionSet2;
        boolean bl = optionSet2.has(vRa.U);
        boolean bl2 = optionSet3.has(zTa.Aa);
        boolean bl3 = optionSet3.has(tSa.fa);
        object4 = optionSet3.valueOf(argumentAcceptingOptionSpec3);
        object3 = new GsonBuilder().registerTypeAdapter((Type)((Object)PropertyMap.class), new PropertyMap.Serializer()).create();
        object2 = ((Gson)object3).fromJson(optionSet2.valueOf(object2), PropertyMap.class);
        object3 = ((Gson)object3).fromJson(optionSet2.valueOf(object), PropertyMap.class);
        object8 = optionSet2.valueOf(object8);
        object = optionSet2.has((OptionSpec<?>)object7) ? optionSet2.valueOf(object7) : new File((File)object8, zsa.la);
        object7 = optionSet2.has((OptionSpec<?>)object6) ? optionSet2.valueOf(object6) : new File((File)object8, ATa.ha);
        object6 = optionSet2.has(argumentAcceptingOptionSpec5) ? (String)argumentAcceptingOptionSpec5.value(optionSet2) : a2;
        argumentAcceptingOptionSpec5 = optionSet2.has(argumentAcceptingOptionSpec2) ? (String)argumentAcceptingOptionSpec2.value(optionSet2) : null;
        object10 = optionSet2.valueOf(object10);
        object9 = optionSet2.valueOf(object9);
        a2 = new Oaa((String)a2, (String)object6, (String)argumentAcceptingOptionSpec4.value(optionSet2), (String)argumentAcceptingOptionSpec.value(optionSet2));
        a2 = new ina(new aNa((Oaa)a2, (PropertyMap)object2, (PropertyMap)object3, (Proxy)object5), new KNa(n2, n3, bl, bl2), new RNa((File)object8, (File)object7, (File)object, argumentAcceptingOptionSpec5), new Ioa(bl3, (String)object4), new wLa((String)object10, (Integer)object9));
        Runtime.getRuntime().addShutdownHook((Thread)new Roa(rta.l));
        Thread.currentThread().setName(hra.m);
        new Kpa((ina)a2).F();
    }
}

