package com.myplug;
import android.content.Context;
import android.widget.Toast;
import com.mymain.Api.Bean;
import com.mymain.Api.Plugin;

public class Main implements Plugin
{

	@Override
	public String name()
	{
		加载插件名:return "插件名";//在主app中调用Plugin.name()会返回这里写的
	}

	@Override
	public void onLoad(Bean out)
	{
		Context a=	out.getCon();
		Toast.makeText(a, name()+"加载成功", 10).show();
		//被激活时执行
	}

}
