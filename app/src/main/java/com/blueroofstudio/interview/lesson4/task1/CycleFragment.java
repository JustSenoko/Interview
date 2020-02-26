package com.blueroofstudio.interview.lesson4.task1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.blueroofstudio.interview.R;

public class CycleFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMessage("onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        showMessage("onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cycle, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        showMessage("onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        showMessage("onDetach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showMessage("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        showMessage("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        showMessage("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        showMessage("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        showMessage("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        showMessage("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy");
    }

    private void showMessage(String message) {
        Toast.makeText(getContext(), "Fragment " + message, Toast.LENGTH_SHORT).show();
    }
}
