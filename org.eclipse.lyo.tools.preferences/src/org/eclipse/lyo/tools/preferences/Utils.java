package org.eclipse.lyo.tools.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

public class Utils {

    private Boolean alwaysViewPrefixes = null;
    private Boolean viewLabelsAsShape = null;

    public Utils() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        

        store.addPropertyChangeListener(event -> {
            if (event.getProperty().equals(PreferenceConstants.P_VIEW_PREFIXES)) {
                alwaysViewPrefixes = alwaysViewPrefixes();
            }
            if (event.getProperty().equals(PreferenceConstants.P_VIEW_LABELS_AS)) {
                viewLabelsAsShape = viewLabelsAsShape();
            }
        });
      
    }
    
    private Boolean alwaysViewPrefixes() {
        return Platform.getPreferencesService().
                getString(Activator.PLUGIN_ID, PreferenceConstants.P_VIEW_PREFIXES, PreferenceConstants.DEFAULT_VIEW_PREFIXES, null)
                .equals("always");
    }

    private Boolean viewLabelsAsShape() {
        return Platform.getPreferencesService().
                getString(Activator.PLUGIN_ID, PreferenceConstants.P_VIEW_LABELS_AS, PreferenceConstants.DEFAULT_VIEW_LABELS_AS, null)
                .equals("shape");
    }

    public Boolean userPreferenceAlwaysViewPrefixes() {
        if (null == alwaysViewPrefixes) {
            alwaysViewPrefixes = alwaysViewPrefixes();
        }
        return alwaysViewPrefixes;
    }


    public Boolean userPreferenceViewLabelsAsShape() {
        if (null == viewLabelsAsShape) {
            viewLabelsAsShape = viewLabelsAsShape();
        }
        return viewLabelsAsShape;
    }
}
