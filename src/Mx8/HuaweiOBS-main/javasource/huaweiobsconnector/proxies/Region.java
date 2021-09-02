// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package huaweiobsconnector.proxies;

/**
 * https://developer.huaweicloud.com/intl/en-us/endpoint
 */
public class Region
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject regionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HuaweiOBSConnector.Region";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Region("Region"),
		Endpoint("Endpoint");

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

	public Region(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "HuaweiOBSConnector.Region"));
	}

	protected Region(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject regionMendixObject)
	{
		if (regionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("HuaweiOBSConnector.Region", regionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a HuaweiOBSConnector.Region");

		this.regionMendixObject = regionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Region.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static huaweiobsconnector.proxies.Region initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return huaweiobsconnector.proxies.Region.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static huaweiobsconnector.proxies.Region initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new huaweiobsconnector.proxies.Region(context, mendixObject);
	}

	public static huaweiobsconnector.proxies.Region load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return huaweiobsconnector.proxies.Region.initialize(context, mendixObject);
	}

	public static java.util.List<huaweiobsconnector.proxies.Region> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<huaweiobsconnector.proxies.Region> result = new java.util.ArrayList<huaweiobsconnector.proxies.Region>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//HuaweiOBSConnector.Region" + xpathConstraint))
			result.add(huaweiobsconnector.proxies.Region.initialize(context, obj));
		return result;
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Region
	 */
	public final java.lang.String getRegion()
	{
		return getRegion(getContext());
	}

	/**
	 * @param context
	 * @return value of Region
	 */
	public final java.lang.String getRegion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Region.toString());
	}

	/**
	 * Set value of Region
	 * @param region
	 */
	public final void setRegion(java.lang.String region)
	{
		setRegion(getContext(), region);
	}

	/**
	 * Set value of Region
	 * @param context
	 * @param region
	 */
	public final void setRegion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String region)
	{
		getMendixObject().setValue(context, MemberNames.Region.toString(), region);
	}

	/**
	 * @return value of Endpoint
	 */
	public final java.lang.String getEndpoint()
	{
		return getEndpoint(getContext());
	}

	/**
	 * @param context
	 * @return value of Endpoint
	 */
	public final java.lang.String getEndpoint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Endpoint.toString());
	}

	/**
	 * Set value of Endpoint
	 * @param endpoint
	 */
	public final void setEndpoint(java.lang.String endpoint)
	{
		setEndpoint(getContext(), endpoint);
	}

	/**
	 * Set value of Endpoint
	 * @param context
	 * @param endpoint
	 */
	public final void setEndpoint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String endpoint)
	{
		getMendixObject().setValue(context, MemberNames.Endpoint.toString(), endpoint);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return regionMendixObject;
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
			final huaweiobsconnector.proxies.Region that = (huaweiobsconnector.proxies.Region) obj;
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
		return "HuaweiOBSConnector.Region";
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
