// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package huaweiobsconnector.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the HuaweiOBSConnector module
	public static void aCr_HuaweiConfig(IContext context, huaweiobsconnector.proxies.HuaweiConfig _huaweiConfig)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HuaweiConfig", _huaweiConfig == null ? null : _huaweiConfig.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACr_HuaweiConfig").withParams(params).execute(context);
	}
	public static void aCT_ExplorePrefix(IContext context, huaweiobsconnector.proxies.Prefix _prefix, huaweiobsconnector.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Prefix", _prefix == null ? null : _prefix.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_ExplorePrefix").withParams(params).execute(context);
	}
	public static void aCT_Explorer_DeleteObject(IContext context, huaweiobsconnector.proxies.Explorer _explorer, huaweiobsconnector.proxies.ObsObject _obsObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		params.put("ObsObject", _obsObject == null ? null : _obsObject.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_Explorer_DeleteObject").withParams(params).execute(context);
	}
	public static void aCT_Explorer_RetrieveBucket(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_Explorer_RetrieveBucket").withParams(params).execute(context);
	}
	public static void aCT_Explorer_RetrieveObjects(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_Explorer_RetrieveObjects").withParams(params).execute(context);
	}
	public static void aCT_Explorer_RetrievePrefixes(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_Explorer_RetrievePrefixes").withParams(params).execute(context);
	}
	public static void aCT_Explorer_UploadObject(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_Explorer_UploadObject").withParams(params).execute(context);
	}
	public static void aCT_Explorer_UploadObjectConfirm(IContext context, huaweiobsconnector.proxies.PutObject _putObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PutObject", _putObject == null ? null : _putObject.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_Explorer_UploadObjectConfirm").withParams(params).execute(context);
	}
	public static void aCT_ObsObject_DownloadObject(IContext context, huaweiobsconnector.proxies.ObsObject _obsObject, huaweiobsconnector.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ObsObject", _obsObject == null ? null : _obsObject.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_ObsObject_DownloadObject").withParams(params).execute(context);
	}
	public static void aCT_PutObject(IContext context, huaweiobsconnector.proxies.OBSDocument _oBSObject, huaweiobsconnector.proxies.HuaweiConfig _huaweiConfig)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OBSObject", _oBSObject == null ? null : _oBSObject.getMendixObject());
		params.put("HuaweiConfig", _huaweiConfig == null ? null : _huaweiConfig.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.ACT_PutObject").withParams(params).execute(context);
	}
	public static huaweiobsconnector.proxies.OBSDocument dS_OBSFile(IContext context, huaweiobsconnector.proxies.HuaweiConfig _huaweiConfig)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HuaweiConfig", _huaweiConfig == null ? null : _huaweiConfig.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("HuaweiOBSConnector.DS_OBSFile").withParams(params).execute(context);
		return result == null ? null : huaweiobsconnector.proxies.OBSDocument.initialize(context, result);
	}
	public static void oPN_Explorer(IContext context, huaweiobsconnector.proxies.HuaweiConfig _huaweiConfig)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HuaweiConfig", _huaweiConfig == null ? null : _huaweiConfig.getMendixObject());
		Core.microflowCall("HuaweiOBSConnector.OPN_Explorer").withParams(params).execute(context);
	}
}