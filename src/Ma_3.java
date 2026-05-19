/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WM
 *  pn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Ma_3
extends MessageLiteOrBuilder {
    public int getScrollbarColor();

    public boolean hasTitle();

    public boolean hasFont();

    public String getTitle();

    public int getTitleColor();

    public int getMaxRows();

    public int getColumnsCount();

    public boolean hasRadius();

    public List<WM> getColumnsList();

    public boolean hasMaxRows();

    public WM getColumns(int var1);

    public boolean hasRowHoverColor();

    public boolean hasDrawBack();

    public ByteString getTitleBytes();

    public boolean hasHeadingColor();

    public int getHeadingColor();

    public boolean getDrawBack();

    public boolean hasScrollbarColor();

    public int getRowHoverColor();

    public List<An> getRowsList();

    public An getRows(int var1);

    public int getRadius();

    public pn getFont();

    public boolean hasTitleColor();

    public int getRowsCount();
}

