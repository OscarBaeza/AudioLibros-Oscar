package AudioOscar.example.Oscak.AudiLibroo.fragmentos;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.example.Oscar.AudiLibroo.R;

public class PreferenciasFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
