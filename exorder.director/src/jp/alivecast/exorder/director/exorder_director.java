package jp.alivecast.exorder.director;

import jp.alivecast.exorder.director.R;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;

public class exorder_director extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // スプラッシュを表示するためのプロパティを設定
        super.setIntegerProperty("splashscreen", R.drawable.splash) ;
        // 第2引数に表示する時間をミリ秒で指定
        super.loadUrl("file:///android_asset/www/index.html", 3000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// 121129 ogawa commentout
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
