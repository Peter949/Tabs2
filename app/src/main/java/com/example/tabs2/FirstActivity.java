package com.example.tabs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstActivity extends Fragment implements View.OnClickListener
{
    private Button button1;
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.first_main, container, false);
        button1 = view.findViewById(R.id.button2);
        button1.setOnClickListener(this);
        return view;
    }
        public void onClick(View v)
        {
            Intent intent = new Intent(".List");
            startActivity(intent);
        }
}
