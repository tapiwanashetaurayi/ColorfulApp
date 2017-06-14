package googleplayservices.samples.android.treehouse.com.colourful2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Nomore on 17/06/04.
 */

public class ViewPagerFragment extends Fragment {

    public static final String KEY_SCHOOL_INDEX = "school_index";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int index = getArguments().getInt(KEY_SCHOOL_INDEX);
        getActivity().setTitle(Schools.names[index]);
        View view = inflater.inflate(R.layout.fragment_viewpager, container, false);
        final AboutSchoolFragment aboutSchoolFragment = new AboutSchoolFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_SCHOOL_INDEX, index);
        aboutSchoolFragment.setArguments(bundle);
        final DetailsFragment detailsFragment = new DetailsFragment();

        bundle = new Bundle();
        bundle.putInt(KEY_SCHOOL_INDEX, index);
        detailsFragment.setArguments(bundle);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
            return position == 0 ? aboutSchoolFragment : detailsFragment;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return position == 0 ? "About School" : "Details";
            }

            @Override
            public int getCount() {
                return 2;
            }
        });
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        getActivity().setTitle(getResources().getString(R.string.app_name));
    }
}
