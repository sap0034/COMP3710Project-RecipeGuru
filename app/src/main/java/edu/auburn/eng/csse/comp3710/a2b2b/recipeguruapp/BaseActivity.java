package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by sap00 on 4/30/2018.
 */

public class BaseActivity extends AppCompatActivity {
    Toolbar toolbar;
//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
//    }
//    public void setupToolbar(int toolbarId, String title, @ColorRes int titleColor, @ColorRes int colorBg, @DrawableRes int burger){
//        toolbar = (Toolbar) findViewById(toolbarId);
//        toolbar.setBackgroundColor(getResources().getColor(colorBg));
//        setSupportActionBar(toolbar);
//        TextView pageTitle = (TextView) toolbar.findViewById(R.id.tv_title);
//        pageTitle.setText(title);
//        pageTitle.setTextColor(getResources().getColor(titleColor));
//        getSupportActionBar().setTitle("");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(burger);
//    }
//    public void changeStatusBarColor() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//        }
//    }
}
