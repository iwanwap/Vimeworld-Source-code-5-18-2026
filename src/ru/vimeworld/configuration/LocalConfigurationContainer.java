/*
 * Decompiled with CFR 0.152.
 */
package ru.vimeworld.configuration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import optifine.Config;
import ru.vimeworld.configuration.ConfigurationContainer;
import ru.vimeworld.configuration.ConfigurationService;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LocalConfigurationContainer<T>
extends ConfigurationContainer<T> {
    private final File file;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void J() throws IOException {
        BufferedWriter a2;
        block13: {
            LocalConfigurationContainer localConfigurationContainer = this;
            if (localConfigurationContainer.config == null) {
                return;
            }
            if (!localConfigurationContainer.file.getParentFile().exists()) {
                localConfigurationContainer.file.getParentFile().mkdirs();
            }
            if (!localConfigurationContainer.file.exists()) {
                localConfigurationContainer.file.createNewFile();
            }
            a2 = new BufferedWriter(new FileWriter(localConfigurationContainer.file));
            Throwable throwable = null;
            try {
                a2.write(ConfigurationService.GSON.toJson(localConfigurationContainer.config));
                if (a2 == null) return;
                if (throwable == null) break block13;
            }
            catch (Throwable throwable2) {
                try {
                    throwable = throwable2;
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    Throwable throwable4;
                    if (a2 != null) {
                        if (throwable != null) {
                            try {
                                a2.close();
                                throwable4 = throwable3;
                                throw throwable4;
                            }
                            catch (Throwable throwable5) {
                                throwable4 = throwable3;
                                throwable.addSuppressed(throwable5);
                                throw throwable4;
                            }
                        }
                        a2.close();
                    }
                    throwable4 = throwable3;
                    throw throwable4;
                }
            }
            try {
                a2.close();
                return;
            }
            catch (Throwable throwable6) {
                throwable.addSuppressed(throwable6);
                return;
            }
        }
        a2.close();
    }

    public LocalConfigurationContainer(File file) throws IOException {
        File b2 = file;
        LocalConfigurationContainer a2 = this;
        super(Config.J(Files.newInputStream(b2.toPath(), new OpenOption[uSa.E])));
        a2.file = b2;
    }

    @Override
    public File J() {
        LocalConfigurationContainer a2;
        return a2.file;
    }
}

