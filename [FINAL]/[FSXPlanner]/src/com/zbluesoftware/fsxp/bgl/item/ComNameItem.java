// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ComNameItem.java

package com.zbluesoftware.fsxp.bgl.item;


// Referenced classes of package com.zbluesoftware.fsxp.bgl.item:
//            Item

public class ComNameItem extends Item
{

    public ComNameItem()
    {
        name = "comName";
        dataType = "StringZ";
        offset = 0;
        length = 4;
        hexData = null;
        decodedData = null;
    }

    public void setDecodedData()
    {
        String tempHex = hexData.replaceAll(" ", "");
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < tempHex.length(); i += 2)
            if(!tempHex.substring(i, i + 2).equals("00"))
                buffer.append(Character.toString((char)Long.valueOf(tempHex.substring(i, i + 2), 16).intValue()));

        decodedData = buffer.toString();
    }
}
