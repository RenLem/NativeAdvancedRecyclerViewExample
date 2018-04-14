package com.google.android.gms.example.nativeadvancedrecyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;


public class NativeContentAdViewHolder extends RecyclerView.ViewHolder {
    public NativeContentAdViewHolder(View view) {
        super(view);
        NativeAppInstallAdView adView = (NativeAppInstallAdView) view;

        // Register the view used for each individual asset.
        adView.setHeadlineView(adView.findViewById(R.id.contentad_headline));
        adView.setImageView(adView.findViewById(R.id.contentad_image));
        adView.setBodyView(adView.findViewById(R.id.contentad_body));
        adView.setCallToActionView(adView.findViewById(R.id.contentad_call_to_action));
        //adView.setLogoView(adView.findViewById(R.id.contentad_logo));
        //adView.setAdvertiserView(adView.findViewById(R.id.contentad_advertiser));
    }
}
