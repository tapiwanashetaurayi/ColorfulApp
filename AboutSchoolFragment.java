package googleplayservices.samples.android.treehouse.com.colourful2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Nomore on 17/06/04.
 */

public class AboutSchoolFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_SCHOOL_INDEX);
        View view = inflater.inflate(R.layout.fragment_aboutschool, container, false);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.aboutSchoolLayout);
        String[] aboutschool = Schools.aboutschool[index].split("`");
          setUpTextViews(aboutschool, linearLayout);
        return view;
    }
    private void setUpTextViews(String[] aboutschool, ViewGroup container){
        for (String about : aboutschool){
            TextView textView = new TextView(getActivity());
            textView.setPadding(8, 16, 8, 16);
            textView.setTextSize(20f);
            textView.setText(about);
            container.addView(textView);
        }
    }
}
