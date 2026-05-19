/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.rnnoise4j;

import de.maxhenkel.rnnoise4j.UnknownPlatformException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;

class LibraryLoader {
    private static final String OS_NAME = System.getProperty("os.name").toLowerCase();
    private static final String OS_ARCH = System.getProperty("os.arch").toLowerCase();

    LibraryLoader() {
    }

    private static boolean isWindows() {
        return OS_NAME.contains("win");
    }

    private static boolean isMac() {
        return OS_NAME.contains("mac");
    }

    private static boolean isLinux() {
        return OS_NAME.contains("nux");
    }

    private static String getPlatform() throws UnknownPlatformException {
        if (LibraryLoader.isWindows()) {
            return "windows";
        }
        if (LibraryLoader.isMac()) {
            return "mac";
        }
        if (LibraryLoader.isLinux()) {
            return "linux";
        }
        throw new UnknownPlatformException(String.format("Unknown operating system: %s", OS_NAME));
    }

    private static String getArchitecture() {
        switch (OS_ARCH) {
            case "i386": 
            case "i486": 
            case "i586": 
            case "i686": 
            case "x86": 
            case "x86_32": {
                return "x86";
            }
            case "amd64": 
            case "x86_64": 
            case "x86-64": {
                return "x64";
            }
            case "aarch64": {
                return "aarch64";
            }
        }
        return OS_ARCH;
    }

    private static String getLibraryExtension() throws UnknownPlatformException {
        if (LibraryLoader.isWindows()) {
            return "dll";
        }
        if (LibraryLoader.isMac()) {
            return "dylib";
        }
        if (LibraryLoader.isLinux()) {
            return "so";
        }
        throw new UnknownPlatformException(String.format("Unknown operating system: %s", OS_NAME));
    }

    private static String getLibraryName(String name) throws UnknownPlatformException {
        return String.format("%s.%s", name, LibraryLoader.getLibraryExtension());
    }

    private static String getNativeFolderName() throws UnknownPlatformException {
        return String.format("%s-%s", LibraryLoader.getPlatform(), LibraryLoader.getArchitecture());
    }

    private static String getResourcePath(String libName) throws UnknownPlatformException {
        return String.format("natives/%s/%s", LibraryLoader.getNativeFolderName(), LibraryLoader.getLibraryName(libName));
    }

    private static File getTempDir() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    public static void load(String libraryName) throws UnknownPlatformException, IOException {
        boolean copyFile;
        String md5;
        String resourcePath = LibraryLoader.getResourcePath(libraryName);
        try (InputStream in2 = LibraryLoader.getResource(resourcePath);){
            if (in2 == null) {
                throw new UnknownPlatformException(String.format("Could not find %s natives for platform %s", libraryName, LibraryLoader.getNativeFolderName()));
            }
            md5 = LibraryLoader.checksum(in2);
        }
        File tempDir = new File(LibraryLoader.getTempDir(), String.format("%s-%s", libraryName, md5));
        tempDir.mkdirs();
        File tempFile = new File(tempDir, LibraryLoader.getLibraryName(libraryName));
        if (tempFile.exists()) {
            String existingMd5;
            try (InputStream in3 = Files.newInputStream(tempFile.toPath(), new OpenOption[0]);){
                existingMd5 = LibraryLoader.checksum(in3);
            }
            if (!existingMd5.equals(md5)) {
                Files.deleteIfExists(tempFile.toPath());
                copyFile = true;
            } else {
                copyFile = false;
            }
        } else {
            copyFile = true;
        }
        if (copyFile) {
            try (InputStream in4 = LibraryLoader.getResource(resourcePath);){
                if (in4 == null) {
                    throw new UnknownPlatformException(String.format("Could not find %s natives for platform %s", libraryName, LibraryLoader.getNativeFolderName()));
                }
                Files.copy(in4, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        try {
            System.load(tempFile.getAbsolutePath());
        }
        catch (UnsatisfiedLinkError e2) {
            throw new UnknownPlatformException(String.format("Could not load %s natives for %s", libraryName, LibraryLoader.getNativeFolderName()), e2);
        }
    }

    @Nullable
    private static InputStream getResource(String path) {
        return LibraryLoader.class.getClassLoader().getResourceAsStream(path);
    }

    private static String checksum(InputStream inputStream) throws IOException {
        try {
            int numRead;
            byte[] buffer = new byte[1024];
            MessageDigest digest = MessageDigest.getInstance("MD5");
            do {
                if ((numRead = inputStream.read(buffer)) <= 0) continue;
                digest.update(buffer, 0, numRead);
            } while (numRead != -1);
            inputStream.close();
            byte[] bytes = digest.digest();
            StringBuilder result = new StringBuilder();
            for (byte value : bytes) {
                result.append(String.format("%02x", value));
            }
            return result.toString();
        }
        catch (NoSuchAlgorithmException e2) {
            throw new IOException(e2);
        }
    }
}

