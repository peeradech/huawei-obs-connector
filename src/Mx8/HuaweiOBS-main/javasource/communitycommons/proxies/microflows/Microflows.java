// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package communitycommons.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the CommunityCommons module
	public static void assertTrue(IContext context, boolean _valueToAssert)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("valueToAssert", _valueToAssert);
		Core.microflowCall("CommunityCommons.AssertTrue").withParams(params).execute(context);
	}
	public static void assertTrue_2(IContext context, boolean _valueToAssert, java.lang.String _message)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("valueToAssert", _valueToAssert);
		params.put("message", _message);
		Core.microflowCall("CommunityCommons.AssertTrue_2").withParams(params).execute(context);
	}
	public static void createUserIfNotExists(IContext context, java.lang.String _username, java.lang.String _role, java.lang.String _password, boolean _webserviceUser)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Username", _username);
		params.put("Role", _role);
		params.put("Password", _password);
		params.put("WebserviceUser", _webserviceUser);
		Core.microflowCall("CommunityCommons.CreateUserIfNotExists").withParams(params).execute(context);
	}
	public static void updateUserHelper(IContext context, java.lang.String _username, java.lang.String _role, java.lang.String _password, boolean _webserviceUser, system.proxies.User _user)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Username", _username);
		params.put("Role", _role);
		params.put("Password", _password);
		params.put("WebserviceUser", _webserviceUser);
		params.put("User", _user == null ? null : _user.getMendixObject());
		Core.microflowCall("CommunityCommons.UpdateUserHelper").withParams(params).execute(context);
	}
}