// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package huaweiobsconnector.proxies;

public class PutObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject putObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HuaweiOBSConnector.PutObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Key("Key"),
		PutObject_Explorer("HuaweiOBSConnector.PutObject_Explorer"),
		PutObject_OBSDocument("HuaweiOBSConnector.PutObject_OBSDocument");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public PutObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "HuaweiOBSConnector.PutObject"));
	}

	protected PutObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject putObjectMendixObject)
	{
		if (putObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("HuaweiOBSConnector.PutObject", putObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a HuaweiOBSConnector.PutObject");

		this.putObjectMendixObject = putObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PutObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static huaweiobsconnector.proxies.PutObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return huaweiobsconnector.proxies.PutObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static huaweiobsconnector.proxies.PutObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new huaweiobsconnector.proxies.PutObject(context, mendixObject);
	}

	public static huaweiobsconnector.proxies.PutObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return huaweiobsconnector.proxies.PutObject.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Key
	 */
	public final java.lang.String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final java.lang.String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(java.lang.String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return value of PutObject_Explorer
	 */
	public final huaweiobsconnector.proxies.Explorer getPutObject_Explorer() throws com.mendix.core.CoreException
	{
		return getPutObject_Explorer(getContext());
	}

	/**
	 * @param context
	 * @return value of PutObject_Explorer
	 */
	public final huaweiobsconnector.proxies.Explorer getPutObject_Explorer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		huaweiobsconnector.proxies.Explorer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PutObject_Explorer.toString());
		if (identifier != null)
			result = huaweiobsconnector.proxies.Explorer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PutObject_Explorer
	 * @param putobject_explorer
	 */
	public final void setPutObject_Explorer(huaweiobsconnector.proxies.Explorer putobject_explorer)
	{
		setPutObject_Explorer(getContext(), putobject_explorer);
	}

	/**
	 * Set value of PutObject_Explorer
	 * @param context
	 * @param putobject_explorer
	 */
	public final void setPutObject_Explorer(com.mendix.systemwideinterfaces.core.IContext context, huaweiobsconnector.proxies.Explorer putobject_explorer)
	{
		if (putobject_explorer == null)
			getMendixObject().setValue(context, MemberNames.PutObject_Explorer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PutObject_Explorer.toString(), putobject_explorer.getMendixObject().getId());
	}

	/**
	 * @return value of PutObject_OBSDocument
	 */
	public final huaweiobsconnector.proxies.OBSDocument getPutObject_OBSDocument() throws com.mendix.core.CoreException
	{
		return getPutObject_OBSDocument(getContext());
	}

	/**
	 * @param context
	 * @return value of PutObject_OBSDocument
	 */
	public final huaweiobsconnector.proxies.OBSDocument getPutObject_OBSDocument(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		huaweiobsconnector.proxies.OBSDocument result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PutObject_OBSDocument.toString());
		if (identifier != null)
			result = huaweiobsconnector.proxies.OBSDocument.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PutObject_OBSDocument
	 * @param putobject_obsdocument
	 */
	public final void setPutObject_OBSDocument(huaweiobsconnector.proxies.OBSDocument putobject_obsdocument)
	{
		setPutObject_OBSDocument(getContext(), putobject_obsdocument);
	}

	/**
	 * Set value of PutObject_OBSDocument
	 * @param context
	 * @param putobject_obsdocument
	 */
	public final void setPutObject_OBSDocument(com.mendix.systemwideinterfaces.core.IContext context, huaweiobsconnector.proxies.OBSDocument putobject_obsdocument)
	{
		if (putobject_obsdocument == null)
			getMendixObject().setValue(context, MemberNames.PutObject_OBSDocument.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PutObject_OBSDocument.toString(), putobject_obsdocument.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return putObjectMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final huaweiobsconnector.proxies.PutObject that = (huaweiobsconnector.proxies.PutObject) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "HuaweiOBSConnector.PutObject";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
