package com.mymain;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.mymain.Api.Bean;

public class MainActivity extends Activity 
{
	EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		Api目录下的类要和插件保持一致:super.onCreate(savedInstanceState);
  		打包后可以删除掉主app的dex中api目录:setContentView(R.layout.main);	
	    主app中这个api只是让ide不报错的:ed = findViewById(R.id.mainEditText1);
	}
	public void load(View v)
	{
		Bean be=new Bean();
		设置传给插件的Bean类的参数:be.setCon(MainActivity.this);
		加载插件:Utils.load(MainActivity.this, ed.getText().toString(), be);
	}
}
