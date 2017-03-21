package com.amitupadhyay.beautifulcards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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

        //Create a Card
        MayKnowCard card= new MayKnowCard(this, "Amit Upadhyay", "App developer", "https://lh5.googleusercontent.com/-N8bz9q4Kz0I/AAAAAAAAAAI/AAAAAAAAAAs/Icl2bQMyK7c/s265-c-k-no/photo.jpg");
        card.setShadow(false);

        //Set card in the cardView
        CardView cardView = (CardView) this.findViewById(R.id.carddemo_MayKnow);
        cardView.setCard(card);

        MayKnowCard card2 = new MayKnowCard(this, "Amit", "CEO", "https://lh5.googleusercontent.com/-N8bz9q4Kz0I/AAAAAAAAAAI/AAAAAAAAAAs/Icl2bQMyK7c/s265-c-k-no/photo.jpg");
        card2.addCardHeader(null);
        card2.setShadow(true);
        CardView mayView2 = (CardView) this.findViewById(R.id.carddemo_MayKnow2);
        mayView2.setCard(card2);

    }
}
