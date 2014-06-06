package ms.cloudtea.viewpagermultiplefragmentdemo.app.frags;

import android.support.v4.app.Fragment;

import ms.cloudtea.viewpagermultiplefragmentdemo.app.BackPressImpl;
import ms.cloudtea.viewpagermultiplefragmentdemo.app.OnBackPressListener;

/**
 * Created by shahabuddin on 6/6/14.
 */
public class RootFragment extends Fragment implements OnBackPressListener {

    @Override
    public boolean onBackPressed() {
        return new BackPressImpl(this).onBackPressed();
    }
}
