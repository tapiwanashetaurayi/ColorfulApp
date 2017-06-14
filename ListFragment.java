package googleplayservices.samples.android.treehouse.com.colourful2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nomore on 17/06/04.
 */

public class ListFragment extends Fragment {

    public interface OnSchoolSelectedInterface {
        void onListSchoolSelected(int index);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        OnSchoolSelectedInterface listener = (OnSchoolSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecyclerView);
        ListAdapter listAdapter = new ListAdapter(listener);
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
