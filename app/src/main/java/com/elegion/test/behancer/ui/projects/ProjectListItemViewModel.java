package com.elegion.test.behancer.ui.projects;

import com.elegion.test.behancer.data.model.project.Project;
import com.elegion.test.behancer.utils.DateUtils;

/**
 * @author Azret Magometov
 */
public class ProjectListItemViewModel {

    private static final int FIRST_OWNER_INDEX = 0;

    private String mImageUrl;
    private String mName;
    private String mUsername;
    private String mPublishedOn;

    public ProjectListItemViewModel(Project project) {
        mImageUrl = project.getCover().getPhotoUrl();
        mName = project.getName();
        mUsername = project.getOwners().get(FIRST_OWNER_INDEX).getUsername();
        mPublishedOn = DateUtils.format(project.getPublishedOn());
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getPublishedOn() {
        return mPublishedOn;
    }
}
