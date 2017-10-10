package com.epicodus.madlibs;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

/**
 * Created by Guest on 10/10/17.
 */

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity>activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void validateEditText(){
        onView(withId(R.id.noun1)).perform(typeText("Phone"))
                .check(matches(withText("Phone")));
    }
    @Test
    public void validateEditTextIsSentToActivity(){
        String noun1 = "Portland";
        String noun2 = "Portland";
        String noun3 = "Portland";
        String verb = "Portland";
        String adj = "Portland";

        onView(withId(R.id.noun1)).perform(typeText(noun1));
        onView(withId(R.id.noun2)).perform(typeText(noun2));
        onView(withId(R.id.noun3)).perform(typeText(noun3));
        onView(withId(R.id.adj)).perform(typeText(adj));
        onView(withId(R.id.verb)).perform(typeText(verb));

        onView(withId(R.id.submitMadLibsButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches
                (withText("This is my " + noun1 + ". They had a " + noun2 + ". During " + noun3 + "Likes to " + verb + " and " + adj  + "! It’s 6:30 Monday morning and you’re alarm "+" is going off! You "+verb+ " out of bed and into the shower. Then you grab the nearest and run down the stairs to the kitchen. You make your morning beverage and pack a  "+ noun1 +" lunch. But when you go into the front hall, you discover that your pet has vomited on the floor! You have to clean it up, so now you’re running late for the bus!  You run out the door to catch your bus, but while you are waiting for the light to change to cross the street, you see your bus zoom by.  So you stick out your" +noun2 +" and catch a ride with a passing time instead. You make it to Epicodus just in time to sign in before 8:15 and start your MadLibs project.")));
    }
    @Test
    public void toastStringIsReturnedWhenFieldIsEmpty(){
        String noun1 = "Portland";
        String noun2 = "Portland";
        String noun3 = "Portland";
        String verb = "Portland";
        String adj = "Portland";

        onView(withId(R.id.noun1)).perform(typeText(noun1));
        onView(withId(R.id.noun2)).perform(typeText(noun2));
        onView(withId(R.id.noun3)).perform(typeText(noun3));
        onView(withId(R.id.adj)).perform(typeText(adj));
        onView(withId(R.id.submitMadLibsButton)).perform(click());
        onView(withText(R.string.toast)).inRoot(withDecorView(not(is(activityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));;
    }


}
