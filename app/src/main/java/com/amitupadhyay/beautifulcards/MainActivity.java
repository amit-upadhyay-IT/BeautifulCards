package com.amitupadhyay.beautifulcards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.amitupadhyay.beautifulcards.cards.MayKnowCard;
import com.amitupadhyay.beautifulcards.cards.SuggestedCard;

import it.gmariotti.cardslib.library.view.CardView;
import it.gmariotti.cardslib.library.view.CardViewNative;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCardSuggested();
        initCardMayKnow();
    }

    /**
     * This method builds a suggested card example
     */
    private void initCardSuggested() {

        String titleMessage = "Amit Upadhyay";
        String subtitleMessageOne = "--CEO";
        String subtitleMessageTwo = "2000 members";
        String communityMessage = "View Community";
        String thumbnailUrl = "https://lh5.googleusercontent.com/-N8bz9q4Kz0I/AAAAAAAAAAI/AAAAAAAAAAs/Icl2bQMyK7c/s265-c-k-no/photo.jpg";

        SuggestedCard card = new SuggestedCard(this);

        /*
        setting the different types of message to be displayed on card
         */
        card.setTitleMessage(titleMessage);
        card.setSubtitleMessageOne(subtitleMessageOne);
        card.setSubTitleMessageTwo(subtitleMessageTwo);
        card.setCommunityMessage(communityMessage);
        card.setThumbnailUrl(thumbnailUrl);

        // after setting the message we will instantiate the view and set the card.
        CardViewNative cardView = (CardViewNative) this.findViewById(R.id.carddemo_suggested);
        cardView.setCard(card);
    }

    /**
     * This method builds a simple card
     */
    private void initCardMayKnow() {

        String titleMessage = "Amit Upadhyay";
        String subtitleMessage = "App Developer";
        String thumbnailUrl = "https://lh5.googleusercontent.com/-N8bz9q4Kz0I/AAAAAAAAAAI/AAAAAAAAAAs/Icl2bQMyK7c/s265-c-k-no/photo.jpg";
        String endButtonMessage = "FB";

        //Create a Card
        MayKnowCard card= new MayKnowCard(this);
        card.setShadow(false);

        card.setTitleMessage(titleMessage);
        card.setSubtitleMessage(subtitleMessage);
        card.setThumbnailUrl(thumbnailUrl);
        card.setEndButtonText(endButtonMessage);
        card.setCardOnClickListener(getOnClickListenerCardOne());

        //Set card in the cardView
        CardView cardView = (CardView) this.findViewById(R.id.carddemo_MayKnow);
        cardView.setCard(card);

        String titleMessageTwo = "Amit Kr. Upadhyay";
        String subtitleMessageTwo = "CEO";
        String thumbnailUrlTwo = "https://lh5.googleusercontent.com/-N8bz9q4Kz0I/AAAAAAAAAAI/AAAAAAAAAAs/Icl2bQMyK7c/s265-c-k-no/photo.jpg";
        String endButtonMessageTwo = "MORE";

        MayKnowCard card2 = new MayKnowCard(this);
        card2.addCardHeader(null);
        card2.setShadow(true);

        card2.setTitleMessage(titleMessageTwo);
        card2.setSubtitleMessage(subtitleMessageTwo);
        card2.setThumbnailUrl(thumbnailUrlTwo);
        card2.setEndButtonText(endButtonMessageTwo);
        card2.setCardOnClickListener(getOnClickListenerCardTwo());

        CardView mayView2 = (CardView) this.findViewById(R.id.carddemo_MayKnow2);
        mayView2.setCard(card2);
    }

    /*
    OnClickEventListener for first card of MayKnowCard
     */
    private View.OnClickListener getOnClickListenerCardOne()
    {
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "First Card", Toast.LENGTH_SHORT).show();
            }
        };

        return onClickListener;
    }

    /*
OnClickEventListener for second card of MayKnowCard
 */
    private View.OnClickListener getOnClickListenerCardTwo()
    {
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Second Card", Toast.LENGTH_SHORT).show();
            }
        };

        return onClickListener;
    }
}
