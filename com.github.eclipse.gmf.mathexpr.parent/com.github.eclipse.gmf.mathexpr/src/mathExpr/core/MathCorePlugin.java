package mathExpr.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MathCorePlugin implements BundleActivator {

	private static MathCorePlugin instance;

	public MathCorePlugin() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
	}

	public static MathCorePlugin getInstance() {
		return instance;
	}
}
