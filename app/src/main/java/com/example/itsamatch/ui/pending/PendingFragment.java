package com.example.itsamatch.ui.pending;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.itsamatch.databinding.FragmentPendingBinding;
import com.example.itsamatch.ui.notifications.NotificationsViewModel;

public class PendingFragment extends Fragment {

    private FragmentPendingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PendingViewModel pendingViewModel =
                new ViewModelProvider(this).get(PendingViewModel.class);

        binding = FragmentPendingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPending;
        pendingViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
