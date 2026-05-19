/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  D
 */
package ru.vimeworld.minidot.atlas.emoji;

import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.obfuscator.KeepClassName;
import ru.vimeworld.minidot.atlas.emoji.MiniDotEmoji;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Emoji
implements KeepClassName,
D {
    private boolean available;
    private int id;
    private char character;
    private String category;

    public String J() {
        Emoji a2;
        return a2.category;
    }

    public Emoji() {
        Emoji a2;
    }

    public boolean J() {
        Emoji a2;
        return a2.available;
    }

    public MiniDotEmoji J() {
        Emoji emoji = this;
        KeepClassName a2 = (MiniDotItem)BS.ITEMS.get(emoji.id);
        if (a2 instanceof MiniDotEmoji) {
            return (MiniDotEmoji)a2;
        }
        Emoji emoji2 = emoji;
        a2 = new MiniDotEmoji(emoji2.id, emoji2.character);
        BS.ITEMS.put(emoji.id, a2);
        return a2;
    }

    public int J() {
        Emoji a2;
        return a2.id;
    }

    public char J() {
        Emoji a2;
        return a2.character;
    }
}

