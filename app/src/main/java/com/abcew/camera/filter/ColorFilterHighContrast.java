package com.abcew.camera.filter;

import com.abcew.camera.R;

/**
 * Created by laputan on 16/12/21.
 */

public class ColorFilterHighContrast extends LutColorFilter {

    public ColorFilterHighContrast() {
        super(R.string.imgly_color_filter_name_highcontrast, R.drawable.imgly_filter_preview_photo, R.drawable.imgly_lut_highcontrast);
    }
}
