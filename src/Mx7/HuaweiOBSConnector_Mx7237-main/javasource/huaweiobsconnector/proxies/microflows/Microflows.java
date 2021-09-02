// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package huaweiobsconnector.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the HuaweiOBSConnector module
	public static void aCT_DeleteObject(IContext context, huaweiobsconnector.proxies.Explorer _explorer, huaweiobsconnector.proxies.ObsObject _obsObject)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			params.put("ObsObject", _obsObject == null ? null : _obsObject.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_DeleteObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Explore_Open(IContext context, huaweiobsconnector.proxies.HuaweiConfig _huaweiConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("HuaweiConfig", _huaweiConfig == null ? null : _huaweiConfig.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_Explore_Open", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Explorer_ExplorePrefix(IContext context, huaweiobsconnector.proxies.Prefix _prefix, huaweiobsconnector.proxies.Explorer _explorer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Prefix", _prefix == null ? null : _prefix.getMendixObject());
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_Explorer_ExplorePrefix", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Explorer_RetrieveBuckets(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_Explorer_RetrieveBuckets", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Explorer_RetrieveObjects(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_Explorer_RetrieveObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Explorer_RetrievePrefixes(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_Explorer_RetrievePrefixes", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ObsObject_DownloadObject(IContext context, huaweiobsconnector.proxies.ObsObject _obsObject, huaweiobsconnector.proxies.Explorer _explorer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ObsObject", _obsObject == null ? null : _obsObject.getMendixObject());
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_ObsObject_DownloadObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_UploadObject(IContext context, huaweiobsconnector.proxies.Explorer _explorer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_UploadObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_UploadObjectConfirm(IContext context, huaweiobsconnector.proxies.PutObject _putObject)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PutObject", _putObject == null ? null : _putObject.getMendixObject());
			Core.execute(context, "HuaweiOBSConnector.ACT_UploadObjectConfirm", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}