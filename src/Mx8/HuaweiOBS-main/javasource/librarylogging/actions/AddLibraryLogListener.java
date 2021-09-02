// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package librarylogging.actions;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import librarylogging.impl.MendixLog4jAppender;

public class AddLibraryLogListener extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String classpath;
	private java.lang.String logNode;

	public AddLibraryLogListener(IContext context, java.lang.String classpath, java.lang.String logNode)
	{
		super(context);
		this.classpath = classpath;
		this.logNode = logNode;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		Configuration config = ctx.getConfiguration();
		MendixLog4jAppender mendixAppender = new MendixLog4jAppender(logNode, null, logNode);
		
		AppenderRef ref = AppenderRef.createAppenderRef(logNode + "-" + System.currentTimeMillis(), null, null);
		AppenderRef[] refs = new AppenderRef[] { ref };
		LoggerConfig orgApacheKafka = LoggerConfig.createLogger(true, Level.ALL, 
				classpath, null, refs, null, config, null);
		orgApacheKafka.setLevel(Level.ALL);
		orgApacheKafka.addAppender(mendixAppender, Level.ALL, null);
		config.addLogger(classpath, orgApacheKafka);
		ctx.updateLoggers();
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "AddLibraryLogListener";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
