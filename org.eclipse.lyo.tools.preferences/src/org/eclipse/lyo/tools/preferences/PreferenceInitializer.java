package org.eclipse.lyo.tools.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.eclipse.lyo.tools.preferences.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_VIEW_LABELS_AS, PreferenceConstants.DEFAULT_VIEW_LABELS_AS);
        store.setDefault(PreferenceConstants.P_VIEW_PREFIXES, PreferenceConstants.DEFAULT_VIEW_PREFIXES);

	}

}
