package lirctek.com.settingapp.carrier;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lirctek.com.settingapp.R;
import lirctek.com.settingapp.model.LocalDataModel;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link CarrierFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CarrierFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";
    private static final String ARG_PARAM5 = "param5";
    private static final String ARG_PARAM6 = "param6";
    private static final String ARG_PARAM7 = "param7";

    // TODO: Rename and change types of parameters
    private Integer id;
    private String fName;
    private String lName;
    private String eMail;
    private String phone;
    private String truck;
    private String trailer;


    public CarrierFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment CarrierFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CarrierFragment newInstance(Integer id, String fname, String lname,String phone,String mail,String truck,String trailer) {
        CarrierFragment fragment = new CarrierFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, id);
        args.putString(ARG_PARAM2, fname);
        args.putString(ARG_PARAM3, lname);
        args.putString(ARG_PARAM4, phone);
        args.putString(ARG_PARAM5, mail);
        args.putString(ARG_PARAM6, truck);
        args.putString(ARG_PARAM7, trailer);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getInt(ARG_PARAM1);
            fName = getArguments().getString(ARG_PARAM2);
            lName = getArguments().getString(ARG_PARAM3);
            eMail = getArguments().getString(ARG_PARAM4);
            phone = getArguments().getString(ARG_PARAM5);
            truck = getArguments().getString(ARG_PARAM6);
            trailer = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_carrier, container, false);
    }

}
