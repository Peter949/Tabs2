package com.example.tabs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SecondActivity extends Fragment implements View.OnClickListener
{
    private Button button2;
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.second_main, container, false);
        button2 = (Button)view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        return view;
    }
    public void onClick(View v)
    {
        Intent intent = new Intent(".Supporter");
        startActivity(intent);
    }
}
