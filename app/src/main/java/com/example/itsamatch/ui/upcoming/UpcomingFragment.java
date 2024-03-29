package com.example.itsamatch.ui.upcoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.itsamatch.databinding.FragmentUpcomingBinding;
import com.example.itsamatch.ui.notifications.NotificationsViewModel;

public class UpcomingFragment extends Fragment {

    private FragmentUpcomingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UpcomingViewModel upcomingViewModel =
                new ViewModelProvider(this).get(UpcomingViewModel.class);

        binding = FragmentUpcomingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textUpcoming;
        upcomingViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
