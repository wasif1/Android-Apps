package com.ny.times.ViewHolder;

import android.app.Activity;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ny.times.R;

public class MainActivityViewHolder {

    private TextView uri, url, id, asset_id, published_date, updated, section,source, subsection,
            nytdsection, adx_keywords, column, byline, type, title,
            abstract_, des_facet, org_facet, per_facet, media,geo_facet;
    private RecyclerView media_list;

    public MainActivityViewHolder(Activity activity) {
        uri = activity.findViewById(R.id.uri);
        url = activity.findViewById(R.id.url);
        id = activity.findViewById(R.id.id);
        geo_facet = activity.findViewById(R.id.geo_facet);
        asset_id = activity.findViewById(R.id.asset_id);
        published_date = activity.findViewById(R.id.published_date);
        updated = activity.findViewById(R.id.updated);
        section = activity.findViewById(R.id.section);
        source = activity.findViewById(R.id.source);
        subsection = activity.findViewById(R.id.subsection);
        nytdsection = activity.findViewById(R.id.nytdsection);
        adx_keywords = activity.findViewById(R.id.adx_keywords);
        column = activity.findViewById(R.id.column);
        byline = activity.findViewById(R.id.byline);
        type = activity.findViewById(R.id.type);
        title = activity.findViewById(R.id.title);
        abstract_ = activity.findViewById(R.id.abstract_);
        des_facet = activity.findViewById(R.id.des_facet);
        org_facet = activity.findViewById(R.id.org_facet);
        per_facet = activity.findViewById(R.id.per_facet);
        media = activity.findViewById(R.id.media);
        media_list = activity.findViewById(R.id.media_list);
    }

    public TextView getGeo_facet() {
        return geo_facet;
    }
    public TextView getSection() {
        return section;
    }
    public TextView getUpdated() {
        return updated;
    }

    public TextView getPublished_date() {
        return published_date;
    }

    public TextView getUri() {
        return uri;
    }

    public TextView getUrl() {
        return url;
    }

    public TextView getId() {
        return id;
    }

    public TextView getAsset_id() {
        return asset_id;
    }

    public TextView getSource() {
        return source;
    }

    public TextView getSubsection() {
        return subsection;
    }

    public TextView getNytdsection() {
        return nytdsection;
    }

    public TextView getAdx_keywords() {
        return adx_keywords;
    }

    public TextView getColumn() {
        return column;
    }

    public TextView getByline() {
        return byline;
    }

    public TextView getType() {
        return type;
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getAbstract_() {
        return abstract_;
    }

    public TextView getDes_facet() {
        return des_facet;
    }

    public TextView getOrg_facet() {
        return org_facet;
    }

    public TextView getPer_facet() {
        return per_facet;
    }

    public TextView getMedia() {
        return media;
    }

    public RecyclerView getMedia_list() {
        return media_list;
    }
}
