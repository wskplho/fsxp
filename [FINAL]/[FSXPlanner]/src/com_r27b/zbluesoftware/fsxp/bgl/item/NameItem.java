// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NameItem.java

package com.zbluesoftware.fsxp.bgl.item;


// Referenced classes of package com.zbluesoftware.fsxp.bgl.item:
//            Item

public class NameItem extends Item
{

    public NameItem()
    {
        name = "name";
        dataType = "String";
        offset = 0;
        length = 1;
        hexData = null;
        decodedData = null;
        nameLength = 0;
    }

    public void setNameLength(int nameLength)
    {
        this.nameLength = nameLength;
    }

    public void setDecodedData()
    {
        String tempHex = hexData.replaceAll(" ", "");
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < tempHex.length(); i += 2)
        {
            if(i + 2 > tempHex.length())
                continue;
            int letter = Long.valueOf(tempHex.substring(i, i + 2), 16).intValue();
            if(letter == 0)
                buffer.append(" ");
            else
                buffer.append(Character.toString((char)letter));
        }

        decodedData = buffer.toString().trim();
    }

    private int nameLength;
}
