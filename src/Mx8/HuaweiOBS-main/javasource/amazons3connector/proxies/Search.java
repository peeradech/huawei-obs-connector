// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package amazons3connector.proxies;

public class Search
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AmazonS3Connector.Search";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BucketName("BucketName"),
		ObjectKey("ObjectKey");

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

	public Search(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AmazonS3Connector.Search"));
	}

	protected Search(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchMendixObject)
	{
		if (searchMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AmazonS3Connector.Search", searchMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AmazonS3Connector.Search");

		this.searchMendixObject = searchMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Search.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static amazons3connector.proxies.Search initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return amazons3connector.proxies.Search.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static amazons3connector.proxies.Search initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new amazons3connector.proxies.Search(context, mendixObject);
	}

	public static amazons3connector.proxies.Search load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return amazons3connector.proxies.Search.initialize(context, mendixObject);
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
	 * @return value of BucketName
	 */
	public final java.lang.String getBucketName()
	{
		return getBucketName(getContext());
	}

	/**
	 * @param context
	 * @return value of BucketName
	 */
	public final java.lang.String getBucketName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BucketName.toString());
	}

	/**
	 * Set value of BucketName
	 * @param bucketname
	 */
	public final void setBucketName(java.lang.String bucketname)
	{
		setBucketName(getContext(), bucketname);
	}

	/**
	 * Set value of BucketName
	 * @param context
	 * @param bucketname
	 */
	public final void setBucketName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bucketname)
	{
		getMendixObject().setValue(context, MemberNames.BucketName.toString(), bucketname);
	}

	/**
	 * @return value of ObjectKey
	 */
	public final java.lang.String getObjectKey()
	{
		return getObjectKey(getContext());
	}

	/**
	 * @param context
	 * @return value of ObjectKey
	 */
	public final java.lang.String getObjectKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ObjectKey.toString());
	}

	/**
	 * Set value of ObjectKey
	 * @param objectkey
	 */
	public final void setObjectKey(java.lang.String objectkey)
	{
		setObjectKey(getContext(), objectkey);
	}

	/**
	 * Set value of ObjectKey
	 * @param context
	 * @param objectkey
	 */
	public final void setObjectKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String objectkey)
	{
		getMendixObject().setValue(context, MemberNames.ObjectKey.toString(), objectkey);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchMendixObject;
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
			final amazons3connector.proxies.Search that = (amazons3connector.proxies.Search) obj;
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
		return "AmazonS3Connector.Search";
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
