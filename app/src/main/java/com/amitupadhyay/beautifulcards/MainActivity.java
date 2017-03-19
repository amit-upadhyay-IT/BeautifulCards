package com.amitupadhyay.beautifulcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        SuggestedCard card = new SuggestedCard(this);
        CardViewNative cardView = (CardViewNative) this.findViewById(R.id.carddemo_suggested);
        cardView.setCard(card);
    }

    /**
     * This method builds a simple card
     */
    private void initCardMayKnow() {

        //Create a Card
        MayKnowCard card= new MayKnowCard(this);
        card.setShadow(false);

        //Set card in the cardView
        CardView cardView = (CardView) this.findViewById(R.id.carddemo_MayKnow);
        cardView.setCard(card);

        MayKnowCard card2 = new MayKnowCard(this);
        card2.addCardHeader(null);
        card2.setShadow(true);
        CardView mayView2 = (CardView) this.findViewById(R.id.carddemo_MayKnow2);
        mayView2.setCard(card2);

    }
}
