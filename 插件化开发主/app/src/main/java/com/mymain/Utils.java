package com.mymain;

import android.content.Context;
import com.mymain.Api.Bean;
import com.mymain.Api.Plugin;
import dalvik.system.DexClassLoader;

public class Utils
{

	public static void load(Context ctx, String packagename, final Bean be)
	{

		try
		{
			String apkpath=ctx.getPackageManager().getApplicationInfo(packagename, 0).sourceDir;
			DexClassLoader dcl=new DexClassLoader(apkpath, ctx.getCacheDir().getPath(), null, ctx.getClassLoader());
			Class<?> pluginCls ;
			加载插件app中的Main类:pluginCls = dcl.loadClass(packagename + ".Main");
			Plugin plugin;
			这里这个plugin对象就是插件中的plugin对象了:plugin = (Plugin)pluginCls.newInstance();
			调用插件的onload方法并传入主app给的Bean:plugin.onLoad(be);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
