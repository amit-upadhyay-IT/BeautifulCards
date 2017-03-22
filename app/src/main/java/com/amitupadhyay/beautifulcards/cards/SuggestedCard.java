package com.amitupadhyay.beautifulcards.cards;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.amitupadhyay.beautifulcards.HashcardActivity;
import com.amitupadhyay.beautifulcards.R;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;

/**
 * Created by aupadhyay on 3/19/17.
 */

public class SuggestedCard extends Card {

    private String titleMessage, subtitleMessageOne, subTitleMessageTwo, communityMessage;
    private String thumbnailUrl;

    public String getTitleMessage() {
        return titleMessage;
    }

    public void setTitleMessage(String titleMessage) {
        this.titleMessage = titleMessage;
    }

    public String getSubtitleMessageOne() {
        return subtitleMessageOne;
    }

    public void setSubtitleMessageOne(String subtitleMessageOne) {
        this.subtitleMessageOne = subtitleMessageOne;
    }

    public String getSubTitleMessageTwo() {
        return subTitleMessageTwo;
    }

    public void setSubTitleMessageTwo(String subTitleMessageTwo) {
        this.subTitleMessageTwo = subTitleMessageTwo;
    }

    public String getCommunityMessage() {
        return communityMessage;
    }

    public void setCommunityMessage(String communityMessage) {
        this.communityMessage = communityMessage;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public SuggestedCard(Context context) {
        this(context, R.layout.carddemo_suggested_inner_content);
    }

    public SuggestedCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    private void init() {

        //Add a header
        SuggestedCardHeader header = new SuggestedCardHeader(getContext());
        addCardHeader(header);

        //Set click listener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(getContext(), "Click listener", Toast.LENGTH_LONG).show();
                getContext().startActivity(new Intent(getContext(), HashcardActivity.class));
            }
        });

        //Set swipe on
        setSwipeable(true);

        //Add thumbnail
        CardThumbnail thumb = new SuggestedCardThumb(getContext());
        thumb.setUrlResource(getThumbnailUrl());
        thumb.setErrorResource(R.drawable.ic_error_loadingorangesmall);
        addCardThumbnail(thumb);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.carddemo_suggested_title);
            TextView member = (TextView) view.findViewById(R.id.carddemo_suggested_memeber);
            TextView subtitle = (TextView) view.findViewById(R.id.carddemo_suggested_subtitle);
            TextView community = (TextView) view.findViewById(R.id.carddemo_suggested_community);

            if (title != null) {
                //title.setText(R.string.demo_suggested_title);
                title.setText(getTitleMessage());
            }

            if (member != null) {
                //member.setText(R.string.demo_suggested_member);
                member.setText(getSubtitleMessageOne());
            }

            if (subtitle != null) {
                //subtitle.setText(R.string.demo_suggested_subtitle);
                subtitle.setText(getSubTitleMessageTwo());
            }

            if (community != null) {
                //community.setText(R.string.demo_suggested_community);
                community.setText(getCommunityMessage());
            }
        }
    }


}

class SuggestedCardHeader extends CardHeader {

    public SuggestedCardHeader(Context context) {
        this(context, R.layout.carddemo_suggested_header_inner);
    }

    public SuggestedCardHeader(Context context, int innerLayout) {
        super(context, innerLayout);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.text_suggested_card1);

            if (textView != null) {
                textView.setText(R.string.demo_suggested_header);
            }
        }
    }
}

class SuggestedCardThumb extends CardThumbnail {

    public SuggestedCardThumb(Context context) {
        super(context);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View viewImage) {
        if (viewImage != null) {

            if (parent!=null && parent.getResources()!=null){
                DisplayMetrics metrics=parent.getResources().getDisplayMetrics();

                int base = 100;

                if (metrics!=null){
                    viewImage.getLayoutParams().width = (int)(base*metrics.density);
                    viewImage.getLayoutParams().height = (int)(base*metrics.density);
                }else{
                    viewImage.getLayoutParams().width = 200;
                    viewImage.getLayoutParams().height = 200;
                }
            }
        }
    }
}
