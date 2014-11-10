//Class Name: Game.java
//Purpose: Main activity class for puzzle
//Created by Josh on 2012-09-04

package com.joshl.drop7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Game extends Activity
{
	PuzzleView view;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        view = new PuzzleView(this);
        setContentView(view);
        view.requestFocus();
    }
    
	@Override
	public void onResume ()
	{
		super.onResume ();

		// tell the view to start the animation
		view.resume ();
	}

	@Override
	public void onPause ()
	{
		super.onPause ();

		// tell the view to stop the animation
		view.pause ();
	}

}
