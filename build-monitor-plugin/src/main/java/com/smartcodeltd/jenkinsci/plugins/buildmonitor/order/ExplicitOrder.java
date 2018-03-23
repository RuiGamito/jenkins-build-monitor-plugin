package com.smartcodeltd.jenkinsci.plugins.buildmonitor.order;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.smartcodeltd.jenkinsci.plugins.buildmonitor.BuildMonitorLogger;

import hudson.model.Job;
import java.util.ArrayList;
import java.util.List;

public class ExplicitOrder implements Comparator<Job<?, ?>> {
    private static final BuildMonitorLogger logger = BuildMonitorLogger.forClass(ExplicitOrder.class);
    private Map<String, Integer> order;

    @Override
    // Don't really get this method, as it only compares consecutive pairs of
    // jobs (as opposed to consecutive jobs).
    // Removed all the content as returning -1 works in seemingly all the scenarios,
    // both repeating and not repeating jobs.
    public int compare(Job<?, ?> first, Job<?, ?> second) {
        return -1;
    }

    public void setExplicitOrder(String explicitOrder) {
        order = new HashMap<String, Integer>();
        String[] builds = explicitOrder.split("[ ,]+");
        for (int i = 0; i < builds.length; i++) {
            order.put(builds[i], i);
        }
    }
}
