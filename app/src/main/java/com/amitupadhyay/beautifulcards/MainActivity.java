package com.amitupadhyay.beautifulcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.gmariotti.cardslib.library.view.CardViewNative;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCardSuggested();
    }

    /**
     * This method builds a suggested card example
     */
    private void initCardSuggested() {

        SuggestedCard card = new SuggestedCard(this);
        CardViewNative cardView = (CardViewNative) this.findViewById(R.id.carddemo_suggested);
        cardView.setCard(card);
    }
}
