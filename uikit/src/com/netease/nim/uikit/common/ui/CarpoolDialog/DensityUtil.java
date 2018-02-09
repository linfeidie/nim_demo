package com.netease.nim.uikit.common.ui.CarpoolDialog;

import android.content.res.Resources;

/**
 * Created by linfd on 25/12/17.
 */

public class DensityUtil {
    public static int px2dip(int pxValue)
    {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


    public static float dip2px(float dipValue)
    {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return  (dipValue * scale + 0.5f);
    }
}
