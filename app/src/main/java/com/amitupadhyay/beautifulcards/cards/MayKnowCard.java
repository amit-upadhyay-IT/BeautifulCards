package com.amitupadhyay.beautifulcards.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amitupadhyay.beautifulcards.R;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.base.CardViewWrapper;
import it.gmariotti.cardslib.library.view.component.CardThumbnailView;

/**
 * Created by aupadhyay on 3/19/17.
 */

public class MayKnowCard extends Card {

    private String titleMessage;
    private String subtitleMessage;
    private String thumbnailUrl;

    public MayKnowCard(Context context, String titleMessage, String subtitleMessage, String thumbnailUrl) {
        this(context, R.layout.carddemo_mayknow_inner_content);
        this.titleMessage = titleMessage;
        this.subtitleMessage = subtitleMessage;
        this.thumbnailUrl = thumbnailUrl;
    }

    public MayKnowCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    private void init() {

        setSwipeable(true);

        //Add Header
        CardHeader header = new MayKnowCardHeader(getContext(), R.layout.carddemo_mayknow_inner_header);
        header.setTitle(getContext().getString(R.string.may_know_card_title));
        addCardHeader(header);
        setShadow(false);

        //Add Thumbnail
        CardThumbnail thumbnail = new CardThumbnail(getContext());
        thumbnail.setUrlResource(thumbnailUrl);
        thumbnail.setErrorResource(R.drawable.ic_error_loadingsmall);
        addCardThumbnail(thumbnail);

        OnCardClickListener clickListener = new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                //Do something
            }
        };

        addPartialOnClickListener(Card.CLICK_LISTENER_CONTENT_VIEW,clickListener);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        TextView title = (TextView) view.findViewById(R.id.carddemo_mayknow_main_inner_title);
        TextView subtitle = (TextView) view.findViewById(R.id.carddemo_mayknow_main_inner_subtitle);
        TextView add = (TextView) view.findViewById(R.id.carddemo_mayknow_main_inner_button);

        //title.setText(getContext().getString(R.string.may_know_card_inner_title));
        //subtitle.setText(getContext().getString(R.string.may_know_card_inner_subtitle));

        title.setText(titleMessage);
        subtitle.setText(subtitleMessage);
        add.setClickable(true);

        CardViewWrapper cardView = getCardView();
        CardThumbnailView thumb = cardView.getInternalThumbnailLayout();
        if (thumb != null) {
            ViewGroup.LayoutParams lp = thumb.getLayoutParams();
            if (lp instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) lp).setMargins(25, 0, 0, 5);
            }
        }


    }

    class MayKnowCardHeader extends CardHeader {

        public MayKnowCardHeader(Context context, int innerLayout) {
            super(context, innerLayout);
        }

        @Override
        public void setupInnerViewElements(ViewGroup parent, View view) {
            super.setupInnerViewElements(parent, view);

            TextView t1 = (TextView) view.findViewById(R.id.carddemo_mayknow_main_inner_subtitle);
            if (t1 != null)
                t1.setText(getContext().getString(R.string.may_know_card_subtitle));
        }
    }
}

