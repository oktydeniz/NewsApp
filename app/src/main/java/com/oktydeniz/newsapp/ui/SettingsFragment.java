package com.oktydeniz.newsapp.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.oktydeniz.newsapp.R;
import com.oktydeniz.newsapp.util.AppSettings;

public class SettingsFragment extends Fragment {


    private AppSettings settings;


    public SettingsFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        settings = new AppSettings(requireContext());
        initView(view);
    }

    @SuppressLint("NonConstantResourceId")
    private void initView(View view) {

        RadioGroup rgTheme = view.findViewById(R.id.rg_theme);
        RadioButton rbDark = view.findViewById(R.id.rb_dark);
        RadioButton rbLight = view.findViewById(R.id.rb_light);
        RadioButton rbDarkAmoled = view.findViewById(R.id.rb_amoled);

        switch (settings.getTheme()) {
            case AppSettings.THEME_DARK:
                rbDark.setChecked(true);
                break;
            case AppSettings.THEME_DARK_AMOLED:
                rbDarkAmoled.setChecked(true);
                break;
            default:
                rbLight.setChecked(true);
        }

        rgTheme.setOnCheckedChangeListener((radioGroup, checkedId) -> {

            switch (checkedId) {
                case R.id.rb_dark:
                    settings.setTheme(AppSettings.THEME_DARK);
                    break;
                case R.id.rb_amoled:
                    settings.setTheme(AppSettings.THEME_DARK_AMOLED);
                    break;
                default:
                    settings.setTheme(AppSettings.THEME_LIGHT);
            }

            requireActivity().recreate();


        });


    }
}