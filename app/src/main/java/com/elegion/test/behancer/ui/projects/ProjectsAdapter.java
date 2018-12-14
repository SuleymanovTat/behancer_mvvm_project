package com.elegion.test.behancer.ui.projects;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.elegion.test.behancer.data.model.project.Project;
import com.elegion.test.behancer.databinding.ProjectBinding;

import java.util.List;

/**
 * Created by Vladislav Falzan.
 */

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsHolder> {

    @NonNull
    private final List<Project> mProjects;
    private final OnItemClickListener mOnItemClickListener;

    public ProjectsAdapter(List<Project> projects, OnItemClickListener onItemClickListener) {
        mProjects = projects;
        mOnItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ProjectsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ProjectBinding binding = ProjectBinding.inflate(inflater, parent, false);
        return new ProjectsHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsHolder holder, int position) {
        Project project = mProjects.get(position);
        holder.bind(project, mOnItemClickListener);
    }

    @Override
    public int getItemCount() {
        return mProjects.size();
    }

//    public void addData(List<Project> data, boolean isRefreshed) {
//        if (isRefreshed) {
//            mProjects.clear();
//        }
//
//        mProjects.addAll(data);
//        notifyDataSetChanged();
//    }

    public interface OnItemClickListener {

        void onItemClick(String username);
    }
}
