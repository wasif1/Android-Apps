package com.ny.times.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ny.times.Models.Result;
import com.ny.times.R;
import com.ny.times.Utills.Constants;
import com.ny.times.ViewHolder.MainActivityViewHolder;

public class DetailsActivity extends AppCompatActivity {

    private MainActivityViewHolder viewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        viewHolder = new MainActivityViewHolder(this);
        setData();
    }

    private void setData() {
        try {
            if (getIntent() != null) {
                Result result = new Gson().fromJson(getIntent().getStringExtra(Constants.DATA), Result.class);
                if (result != null) {
                    if (!TextUtils.isEmpty(result.getUri())) {
                        viewHolder.getUri().setText(result.getUri());
                    } else {
                        viewHolder.getUri().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getUrl())) {
                        viewHolder.getUrl().setText(result.getUrl());
                    } else {
                        viewHolder.getUrl().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getId())) {
                        viewHolder.getId().setText(result.getId());
                    } else {
                        viewHolder.getId().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getAssetId())) {
                        viewHolder.getAsset_id().setText(result.getAssetId());
                    } else {
                        viewHolder.getAsset_id().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getSource())) {
                        viewHolder.getSource().setText(result.getSource());
                    } else {
                        viewHolder.getSource().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getPublishedDate())) {
                        viewHolder.getPublished_date().setText(result.getPublishedDate());
                    } else {
                        viewHolder.getPublished_date().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getUpdated())) {
                        viewHolder.getUpdated().setText(result.getUpdated());
                    } else {
                        viewHolder.getUpdated().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getSection())) {
                        viewHolder.getSection().setText(result.getSection());
                    } else {
                        viewHolder.getSection().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getSubsection())) {
                        viewHolder.getSubsection().setText(result.getSubsection());
                    } else {
                        viewHolder.getSubsection().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getNytdsection())) {
                        viewHolder.getNytdsection().setText(result.getNytdsection());
                    } else {
                        viewHolder.getNytdsection().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getAdxKeywords())) {
                        viewHolder.getAdx_keywords().setText(result.getAdxKeywords());
                    } else {
                        viewHolder.getAdx_keywords().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getColumn())) {
                        viewHolder.getColumn().setText(result.getColumn());
                    } else {
                        viewHolder.getColumn().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getByline())) {
                        viewHolder.getByline().setText(result.getByline());
                    } else {
                        viewHolder.getByline().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getType())) {
                        viewHolder.getType().setText(result.getType());
                    } else {
                        viewHolder.getType().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getTitle())) {
                        viewHolder.getTitle().setText(result.getTitle());
                    } else {
                        viewHolder.getTitle().setText(getString(R.string.no_data));
                    }
                    if (!TextUtils.isEmpty(result.getAbstract())) {
                        viewHolder.getAbstract_().setText(result.getAbstract());
                    } else {
                        viewHolder.getAbstract_().setText(getString(R.string.no_data));
                    }

                    if (result.getDesFacet() != null && result.getDesFacet().size() > 0) {
                        StringBuilder str = new StringBuilder();
                        for (int i = 0; i < result.getDesFacet().size(); i++) {
                            str.append(result.getDesFacet().get(i));
                            str.append(Constants.COMMA);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            viewHolder.getDes_facet().setText(str);
                        } else {
                            viewHolder.getDes_facet().setText(getString(R.string.no_data));
                        }
                    } else {
                        viewHolder.getDes_facet().setText(getString(R.string.no_data));
                    }

                    if (result.getOrgFacet() != null && result.getOrgFacet().size() > 0) {
                        StringBuilder str = new StringBuilder();
                        for (int i = 0; i < result.getOrgFacet().size(); i++) {
                            str.append(result.getOrgFacet().get(i));
                            str.append(Constants.COMMA);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            viewHolder.getOrg_facet().setText(str);
                        } else {
                            viewHolder.getOrg_facet().setText(getString(R.string.no_data));
                        }
                    } else {
                        viewHolder.getOrg_facet().setText(getString(R.string.no_data));
                    }

                    if (result.getPerFacet() != null && result.getPerFacet().size() > 0) {
                        StringBuilder str = new StringBuilder();
                        for (int i = 0; i < result.getPerFacet().size(); i++) {
                            str.append(result.getPerFacet().get(i));
                            str.append(Constants.COMMA);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            viewHolder.getPer_facet().setText(str);
                        } else {
                            viewHolder.getPer_facet().setText(getString(R.string.no_data));
                        }
                    } else {
                        viewHolder.getPer_facet().setText(getString(R.string.no_data));
                    }

                    if (result.getGeoFacet() != null && result.getGeoFacet().size() > 0) {
                        StringBuilder str = new StringBuilder();
                        for (int i = 0; i < result.getGeoFacet().size(); i++) {
                            str.append(result.getGeoFacet().get(i));
                            str.append(Constants.COMMA);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            viewHolder.getGeo_facet().setText(str);
                        } else {
                            viewHolder.getGeo_facet().setText(getString(R.string.no_data));
                        }
                    } else {
                        viewHolder.getGeo_facet().setText(getString(R.string.no_data));
                    }

                    if (result.getMedia() != null && result.getMedia().size() > 0) {
                        StringBuilder str = new StringBuilder();
                        for (int i = 0; i < result.getMedia().size(); i++) {

                            for (int j = 0; j < result.getMedia().get(i).getMediaMetadata().size(); j++) {
                                str.append(result.getMedia().get(i).getMediaMetadata().get(j).getFormat());
                                str.append(Constants.COMMA);

                            }

                        }
                        if (!TextUtils.isEmpty(str)) {
                            viewHolder.getMedia().setText(str);
                        } else {
                            viewHolder.getMedia().setText(getString(R.string.no_data));
                        }
                    } else {
                        viewHolder.getMedia().setText(getString(R.string.no_data));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
