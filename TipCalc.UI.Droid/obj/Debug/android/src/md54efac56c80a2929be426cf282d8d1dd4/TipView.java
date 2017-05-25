package md54efac56c80a2929be426cf282d8d1dd4;


public class TipView
	extends mvvmcross.droid.views.MvxActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("TipCalc.UI.Droid.Views.TipView, TipCalc.UI.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", TipView.class, __md_methods);
	}


	public TipView () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TipView.class)
			mono.android.TypeManager.Activate ("TipCalc.UI.Droid.Views.TipView, TipCalc.UI.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
