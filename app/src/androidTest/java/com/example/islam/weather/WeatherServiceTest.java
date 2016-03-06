package com.example.islam.weather;

import android.content.Context;
import android.location.Location;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.test.RenamingDelegatingContext;
import android.test.suitebuilder.annotation.SmallTest;

import com.example.islam.weather.models.weather.WeatherModel;
import com.example.islam.weather.service.weather.WeatherService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import rx.observers.TestSubscriber;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by islam on 06/03/16.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class WeatherServiceTest {
    public WeatherServiceTest(){}
    private WeatherService weatherService;
    Context context;
    @Before
    public void setUp() throws Exception {
        context = new RenamingDelegatingContext(InstrumentationRegistry.getInstrumentation().getTargetContext(), "test_");

        weatherService = new WeatherService();
    }

    @Test
    public void testGetWeatherForSpecificLocation() {
        TestSubscriber<WeatherModel> testSubscriber = new TestSubscriber<>();
        weatherService.obtainWeather(context).subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent();
        testSubscriber.assertNoErrors();
        testSubscriber.assertValueCount(1);
        testSubscriber.assertCompleted();
        assertNotNull(testSubscriber.getOnNextEvents().get(0));
    }


}
