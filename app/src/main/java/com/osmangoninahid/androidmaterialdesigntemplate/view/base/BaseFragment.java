package com.osmangoninahid.androidmaterialdesigntemplate.view.base;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.osmangoninahid.androidmaterialdesigntemplate.util.LogUtil;

import butterknife.ButterKnife;

/**
 * Created by Osman Goni Nahid on 12/17/2015.
 */
public class BaseFragment extends Fragment {
    private static final String TAG = LogUtil.makeLogTag(BaseFragment.class);

    /**
     * Inflates the layout and binds the view via ButterKnife.
     * @param inflater the inflater
     * @param container the layout container
     * @param layout the layout resource
     * @return the inflated view
     */
    public View inflateAndBind(LayoutInflater inflater, ViewGroup container, int layout) {
        View view = inflater.inflate(layout, container, false);
        ButterKnife.bind(this, view);

        LogUtil.logD(TAG, ">>> view inflated");
        return view;
    }
}
