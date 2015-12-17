package com.osmangoninahid.androidmaterialdesigntemplate.view.quote;

import android.os.Bundle;

import com.osmangoninahid.androidmaterialdesigntemplate.R;
import com.osmangoninahid.androidmaterialdesigntemplate.view.base.BaseActivity;

/**
 * Created by Osman Goni Nahid on 12/17/2015.
 */
public class ArticleDetailActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Show the Up button in the action bar.
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArticleDetailFragment fragment =  ArticleDetailFragment.newInstance(getIntent().getStringExtra(ArticleDetailFragment.ARG_ITEM_ID));
        getFragmentManager().beginTransaction().replace(R.id.article_detail_container, fragment).commit();
    }

    @Override
    public boolean providesActivityToolbar() {
        return false;
    }
}
