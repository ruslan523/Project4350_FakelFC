package com.example.limefive.fakel_fc.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.limefive.fakel_fc.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentTable.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentTable#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTable extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentTable() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTable.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTable newInstance(String param1, String param2) {
        FragmentTable fragment = new FragmentTable();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragment_table,
                container, false);

        final TextView tv1 = (TextView)view.findViewById(R.id.textView1);
        final TextView tv2 = (TextView)view.findViewById(R.id.textView2);
        final TextView tv3 = (TextView)view.findViewById(R.id.textView3);
        final TextView tv4 = (TextView)view.findViewById(R.id.textView4);
        final TextView tv5 = (TextView)view.findViewById(R.id.textView5);
        final TextView tv6 = (TextView)view.findViewById(R.id.textView6);
        final TextView tv7 = (TextView)view.findViewById(R.id.textView7);
        final TextView tv8 = (TextView)view.findViewById(R.id.textView8);
        final TextView tv9 = (TextView)view.findViewById(R.id.textView9);
        final TextView tv10 = (TextView)view.findViewById(R.id.textView10);
        final TextView tv11 = (TextView)view.findViewById(R.id.textView11);
        final TextView tv12 = (TextView)view.findViewById(R.id.textView12);
        final TextView tv13 = (TextView)view.findViewById(R.id.textView13);
        final TextView tv14 = (TextView)view.findViewById(R.id.textView14);
        final TextView tv15 = (TextView)view.findViewById(R.id.textView15);
        final TextView tv16 = (TextView)view.findViewById(R.id.textView16);
        final TextView tv17 = (TextView)view.findViewById(R.id.textView17);
        final TextView tv18 = (TextView)view.findViewById(R.id.textView18);
        final TextView tv19 = (TextView)view.findViewById(R.id.textView19);
        final TextView tv20 = (TextView)view.findViewById(R.id.textView20);
        final TextView tv21 = (TextView)view.findViewById(R.id.textView21);
        final TextView tv22 = (TextView)view.findViewById(R.id.textView22);
        final TextView tv23 = (TextView)view.findViewById(R.id.textView23);
        final TextView tv24 = (TextView)view.findViewById(R.id.textView24);
        final TextView tv25 = (TextView)view.findViewById(R.id.textView25);
        final TextView tv26 = (TextView)view.findViewById(R.id.textView26);
        final TextView tv27 = (TextView)view.findViewById(R.id.textView27);
        final TextView tv28 = (TextView)view.findViewById(R.id.textView28);
        final TextView tv29 = (TextView)view.findViewById(R.id.textView29);
        final TextView tv30 = (TextView)view.findViewById(R.id.textView30);
        final TextView tv31 = (TextView)view.findViewById(R.id.textView31);
        final TextView tv32 = (TextView)view.findViewById(R.id.textView32);
        final TextView tv33 = (TextView)view.findViewById(R.id.textView33);
        final TextView tv34 = (TextView)view.findViewById(R.id.textView34);
        final TextView tv35 = (TextView)view.findViewById(R.id.textView35);
        final TextView tv36 = (TextView)view.findViewById(R.id.textView36);
        final TextView tv37 = (TextView)view.findViewById(R.id.textView37);
        final TextView tv38 = (TextView)view.findViewById(R.id.textView38);
        final TextView tv39 = (TextView)view.findViewById(R.id.textView39);
        final TextView tv40 = (TextView)view.findViewById(R.id.textView40);
        final TextView tv41 = (TextView)view.findViewById(R.id.textView41);

        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        tv7.setText("");
        tv8.setText("");
        tv9.setText("");
        tv10.setText("");
        tv11.setText("");
        tv12.setText("");
        tv13.setText("");
        tv14.setText("");
        tv15.setText("");
        tv16.setText("");
        tv17.setText("");
        tv18.setText("");
        tv19.setText("");
        tv20.setText("");
        tv21.setText("");
        tv22.setText("");
        tv23.setText("");
        tv24.setText("");
        tv25.setText("");
        tv26.setText("");
        tv27.setText("");
        tv28.setText("");
        tv29.setText("");
        tv30.setText("");
        tv31.setText("");
        tv32.setText("");
        tv33.setText("");
        tv34.setText("");
        tv35.setText("");
        tv36.setText("");
        tv37.setText("");
        tv38.setText("");
        tv39.setText("");
        tv40.setText("");
        tv41.setText("");

        class MyTask extends AsyncTask<Void, Void, Void> {

            String title;
            String finalRes = null;
            String resultToScreen = null;
            String tmp;
            int tmpForIndex;
            int start = 17, finish = 787;
            String[] mass = new String[41];

            @Override
            protected Void doInBackground(Void... params) {

                Document doc = null;//Здесь хранится будет разобранный html документ
                try {

                    doc = Jsoup.connect("http://fakelfc.ru/calendars").get();
                    Elements elem = doc.select("span");

                    for (Element element : elem) {
                        finalRes += elem.text();
                    }
                    for (int i = 0; i < 20; i++) {
                        resultToScreen = finalRes.substring(start, finish);
                        tmpForIndex = resultToScreen.indexOf("(");
                        tmp = resultToScreen.substring(tmpForIndex);
                        mass[i] = resultToScreen.substring(start, tmpForIndex);
                        start = tmp.indexOf(")") + 2;
                        resultToScreen = tmp.substring(start);
                        mass[i + 20] = resultToScreen.substring(0, resultToScreen.indexOf(".") - 1);
                        resultToScreen = resultToScreen.substring(resultToScreen.indexOf(".") - 1);
                        start = 0;
                    }

                } catch (IOException e) {
                    //Если не получилось считать
                    e.printStackTrace();
                }

                //Если всё считалось, что вытаскиваем из считанного html документа заголовок
                if (doc != null)
                    //title = doc.title();
                    title = resultToScreen;
                else
                    title = "Ошибка";

                return null;
            }

            @Override
            protected void onPostExecute(Void result) {
                super.onPostExecute(result);

                //Тут выводим итоговые данные
                tv41.setText(title);

                /*
                tv1.setText(mass[0]);
                tv2.setText(mass[1]);
                tv3.setText(mass[2]);
                tv4.setText(mass[3]);
                tv5.setText(mass[4]);
                tv6.setText(mass[5]);
                tv7.setText(mass[6]);
                tv8.setText(mass[7]);
                tv9.setText(mass[8]);
                tv10.setText(mass[9]);
                tv11.setText(mass[10]);
                tv12.setText(mass[11]);
                tv13.setText(mass[12]);
                tv14.setText(mass[13]);
                tv15.setText(mass[14]);
                tv16.setText(mass[15]);
                tv17.setText(mass[16]);
                tv18.setText(mass[17]);
                tv19.setText(mass[18]);
                tv20.setText(mass[19]);
                tv21.setText(mass[20]);
                tv22.setText(mass[21]);
                tv23.setText(mass[22]);
                tv24.setText(mass[23]);
                tv25.setText(mass[24]);
                tv26.setText(mass[25]);
                tv27.setText(mass[26]);
                tv28.setText(mass[27]);
                tv29.setText(mass[28]);
                tv30.setText(mass[29]);
                tv31.setText(mass[30]);
                tv32.setText(mass[31]);
                tv33.setText(mass[32]);
                tv34.setText(mass[33]);
                tv35.setText(mass[34]);
                tv36.setText(mass[35]);
                tv37.setText(mass[36]);
                tv38.setText(mass[37]);
                tv39.setText(mass[38]);
                tv40.setText(mass[39]);
                */
            }
        }
            //return inflater.inflate(R.layout.fragment_fragment_table, container, false);

        MyTask mt = new MyTask();
        mt.execute();
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
