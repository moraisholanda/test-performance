package com.holanda.testeperformance;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by sergio on 21/07/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity_> activityTestRule = new ActivityTestRule<>(MainActivity_.class,false,true);

    @Test
    public void onCheckTextValid(){
        onView(withId(R.id.buttonFormat)).perform(click());
    }

}
