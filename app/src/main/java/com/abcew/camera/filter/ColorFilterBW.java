package com.abcew.camera.filter;

import com.abcew.camera.R;

/**
 * Created by laputan on 16/12/21.
 */

public class ColorFilterBW extends LutColorFilter {

    public ColorFilterBW() {
        super(R.string.color_filter_name_bw, R.drawable.filter_preview_photo, R.drawable.lut_bw);
    }
}
