package com.client.tok.ui.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.client.tok.R;
import com.client.tok.base.BaseCommonTitleActivity;

public class POST extends BaseCommonTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post2);
    }
    @Override
    public int getTitleGravity() {
        return GRAVITY_LEFT;
    }

    @Override
    public boolean isShowBackIcon() {
        return false;
    }


    @Override
    public int getToolBarStyle() {
        return TOOL_BAR_STYLE_WHITE_BIG;
    }

    @Override
    public int getTitleId() {
        return R.string.app_name;
    }

}
