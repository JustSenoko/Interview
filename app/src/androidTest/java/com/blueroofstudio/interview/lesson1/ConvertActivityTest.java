package com.blueroofstudio.interview.lesson1;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.ActivityTestRule;

import com.blueroofstudio.interview.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

public class ConvertActivityTest {
    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<ConvertActivity> mActivityRule = new ActivityTestRule<>(
            ConvertActivity.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        mStringToBetyped = "36";
    }

    @Test
    public void ConvertActivity_toMetersPerSecButton_Test() {
        // Type text and then press the button.
        onView(withId(R.id.kmPerHourValue))
                .perform(typeText(mStringToBetyped), closeSoftKeyboard());
        onView(withId(R.id.toMPerSecButton)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.kmPerHourValue))
                .check(matches(withText(mStringToBetyped)));

        onView(withId(R.id.mPerSecValue))
                .check(matches(withText("10.00"))); // формат вывода два знака после запятой

    }

    @Test
    public void AppContext_Test() {
        // Context of the app under test.
        Context appContext = ApplicationProvider.getApplicationContext();

        assertEquals("com.blueroofstudio.interview", appContext.getPackageName());
    }
}