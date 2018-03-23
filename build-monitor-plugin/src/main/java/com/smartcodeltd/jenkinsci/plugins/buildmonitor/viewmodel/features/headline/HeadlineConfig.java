package com.smartcodeltd.jenkinsci.plugins.buildmonitor.viewmodel.features.headline;

/**
 * @author Jan Molak
 */
public class HeadlineConfig {
    public final boolean displayCommitters;
    public final boolean allowRepeatedJobs;

    public HeadlineConfig(boolean displayCommitters, boolean allowRepeatedJobs) {
        this.displayCommitters = displayCommitters;
        this.allowRepeatedJobs = allowRepeatedJobs;
    }
}
