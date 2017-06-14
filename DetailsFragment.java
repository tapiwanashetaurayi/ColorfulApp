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

public class DetailsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_SCHOOL_INDEX);
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.detailsLayout);
        String[] details = Schools.detail[index].split("`");
        setUpTextViews(details, linearLayout);

        return view;
    }
    private void setUpTextViews(String[] details, ViewGroup container){
        for (String detail : details){
            TextView textView = new TextView(getActivity());
            textView.setPadding(8, 16, 8, 16);
            textView.setTextSize(20f);
            textView.setText(detail);
            container.addView(textView);
        }
    }
}
