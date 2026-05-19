/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Epa
 *  Hf
 *  Hg
 *  Jf
 *  Kpa
 *  Lra
 *  NQa
 *  Pqa
 *  URa
 *  WQa
 *  fsa
 *  qe
 *  vpa
 */
package ru.vimeworld.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.obfuscator.KeepClassName;
import ru.vimeworld.configuration.ConfigurationContainer;
import ru.vimeworld.configuration.LocalConfigurationContainer;
import ru.vimeworld.configuration.impl.EmojisConfiguration;
import ru.vimeworld.configuration.impl.HomeScreenConfiguration;
import ru.vimeworld.configuration.impl.MDConfiguration;
import ru.vimeworld.configuration.impl.PresetsConfiguration;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ConfigurationService
implements D,
KeepClassName {
    private static final Logger logger = LogManager.getLogger(Ora.o);
    private static final ConfigurationService instance;
    private final Map<Type, ConfigurationContainer<?>> containers;
    public static final Gson GSON;

    public int J() {
        ConfigurationService a2;
        return a2.containers.size();
    }

    /*
     * WARNING - void declaration
     */
    private <T> void J(LocalConfigurationContainer<T> localConfigurationContainer, Supplier<T> supplier, File file) {
        void b2;
        File d2 = file;
        ConfigurationService a2 = this;
        c.config = b2.get();
        logger.log(Level.ERROR, new StringBuilder().insert(3 ^ 3, vpa.F).append(d2.getAbsolutePath()).append(hpa.b).toString());
    }

    public void f() {
        ConfigurationService configurationService = this;
        long l2 = System.currentTimeMillis();
        ConfigurationService a2 = Kpa.J();
        ConfigurationService configurationService2 = configurationService;
        configurationService2.J(new File(((Kpa)a2).p, new StringBuilder().insert(5 >> 3, URa.q).append(a2.J().J()).append(Epa.k).toString()), MDConfiguration.class, qe.J());
        configurationService2.J(new File(((Kpa)a2).p, aua.e), VoiceChatConfiguration.class, Hg.J());
        ConfigurationService.J(VoiceChatConfiguration.class).f();
        configurationService.J(KQa.H, (Type)((Object)EmojisConfiguration.class), (Supplier)Jf.J());
        ConfigurationService.J(EmojisConfiguration.class).J();
        configurationService.J(yRa.s, (Type)((Object)HomeScreenConfiguration.class), (Supplier)SD.J());
        ConfigurationService.J(HomeScreenConfiguration.class).J();
        configurationService.J(WQa.G, (Type)((Object)PresetsConfiguration.class), (Supplier)Hf.J());
        logger.info(new StringBuilder().insert(5 >> 3, Lra.N).append(System.currentTimeMillis() - l2).append(APa.z).toString());
    }

    /*
     * WARNING - void declaration
     */
    private <T> void J(LocalConfigurationContainer<T> localConfigurationContainer, File file) {
        D c22 = localConfigurationContainer;
        ConfigurationService b2 = this;
        try {
            c22.J();
            return;
        }
        catch (Exception c22) {
            void a2;
            logger.log(Level.ERROR, new StringBuilder().insert(3 & 4, UOa.G).append(a2.getAbsolutePath()).append(Pqa.N).toString(), (Throwable)c22);
            return;
        }
    }

    private void J(File file) throws IOException {
        File b2 = file;
        ConfigurationService a2 = this;
        if (!b2.getParentFile().exists()) {
            b2.getParentFile().mkdirs();
        }
        b2.createNewFile();
    }

    static {
        GSON = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        instance = new ConfigurationService();
    }

    public static <T> void J(Class<T> clazz) {
        Class<T> clazz2 = clazz;
        LocalConfigurationContainer a2 = (LocalConfigurationContainer)ConfigurationService.J().containers.get(clazz2);
        try {
            a2.J();
            return;
        }
        catch (Exception exception) {
            logger.log(Level.FATAL, new StringBuilder().insert(3 & 4, UOa.G).append(a2.J().getAbsolutePath()).append(Pqa.N).toString(), (Throwable)exception);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private <T> void J(LocalConfigurationContainer<T> localConfigurationContainer, File file, Class<T> clazz, Supplier<T> supplier) {
        void a2;
        void d2;
        File e2 = file;
        ConfigurationService c2 = this;
        try {
            void b2;
            d2.config = GSON.fromJson((Reader)new BufferedReader(new FileReader(e2)), b2);
            if (d2.config == null) {
                c2.J((LocalConfigurationContainer<T>)d2, (Supplier<T>)a2, e2);
                return;
            }
        }
        catch (Exception exception) {
            c2.J((LocalConfigurationContainer<T>)d2, (Supplier<T>)a2, e2);
        }
    }

    private ConfigurationService() {
        ConfigurationService a2;
        ConfigurationService configurationService = a2;
        configurationService.containers = new HashMap();
    }

    public void J() {
        ConfigurationService configurationService = this;
        Iterator<ConfigurationContainer<?>> a2 = configurationService.containers.values().iterator();
        block2: while (true) {
            Iterator<ConfigurationContainer<?>> iterator = a2;
            while (iterator.hasNext()) {
                ConfigurationContainer configurationContainer = (ConfigurationContainer)a2.next();
                if (!(configurationContainer instanceof LocalConfigurationContainer)) {
                    iterator = a2;
                    continue;
                }
                try {
                    ((LocalConfigurationContainer)configurationContainer).J();
                }
                catch (Exception exception) {
                    logger.log(Level.ERROR, new StringBuilder().insert(2 & 5, NQa.r).append(configurationContainer.getClass().getSimpleName()).append(Pqa.N).toString(), (Throwable)exception);
                }
                continue block2;
            }
            break;
        }
        configurationService.containers.clear();
    }

    /*
     * Exception decompiling
     */
    private <T> T J(String var1_2, Type var2_3, Supplier<T> var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static <T> T J(Class<T> a2) {
        return ConfigurationService.J().containers.get(a2).config;
    }

    public static ConfigurationService J() {
        return instance;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> void J(File file, Class<T> clazz, Supplier<T> supplier) {
        void c2;
        ConfigurationService configurationService = this;
        try {
            ConfigurationService configurationService2;
            void b2;
            void a2;
            D d2;
            if (!c2.exists()) {
                ConfigurationService configurationService3 = configurationService;
                configurationService3.J((File)c2);
                d2 = new LocalConfigurationContainer((File)c2);
                new LocalConfigurationContainer((File)c2).config = a2.get();
                configurationService3.containers.put((Type)b2, (ConfigurationContainer<?>)d2);
                d2.J();
                return;
            }
            d2 = new LocalConfigurationContainer((File)c2);
            if (c2.exists()) {
                ConfigurationService configurationService4 = configurationService;
                configurationService2 = configurationService4;
                configurationService4.J((LocalConfigurationContainer<T>)d2, (File)c2, (Class<T>)b2, (Supplier<T>)a2);
            } else {
                d2.config = a2.get();
                configurationService2 = configurationService;
            }
            configurationService2.J((LocalConfigurationContainer<T>)d2, (File)c2);
            configurationService.containers.put((Type)b2, (ConfigurationContainer<?>)d2);
            return;
        }
        catch (Exception d2) {
            logger.log(Level.FATAL, new StringBuilder().insert(5 >> 3, fsa.Y).append(c2.getAbsolutePath()).append(Pqa.N).toString(), (Throwable)d2);
            return;
        }
    }
}

