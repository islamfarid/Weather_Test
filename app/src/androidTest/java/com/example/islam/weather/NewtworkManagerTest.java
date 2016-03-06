package com.example.islam.weather;

import android.content.Context;
import android.location.Location;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.RenamingDelegatingContext;
import android.test.suitebuilder.annotation.SmallTest;

import com.example.islam.weather.common.Constants;
import com.example.islam.weather.models.weather.WeatherModel;
import com.example.islam.weather.network.NetworkManager;
import com.example.islam.weather.service.location.LocationService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import rx.observers.TestSubscriber;
import rx.schedulers.Schedulers;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by islam on 06/03/16.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class NewtworkManagerTest {
    public NewtworkManagerTest(){}
    private NetworkManager networkManager;
    Context context;
    @Before
    public void setUp() throws Exception {
        context = new RenamingDelegatingContext(InstrumentationRegistry.getInstrumentation().getTargetContext(), "test_");

        networkManager = new NetworkManager();
    }

    @Test
    public void testGetWeatherFromApi() {
        TestSubscriber<WeatherModel> testSubscriber = new TestSubscriber<>();
        networkManager.getWeatherData(Constants.API_KEY,"30.124050392109403,31.265614337397764").subscribeOn(Schedulers.io()).subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent();
        testSubscriber.assertNoErrors();
        testSubscriber.assertValueCount(1);
        testSubscriber.assertCompleted();
        assertNotNull(testSubscriber.getOnNextEvents().get(0));

    }


}
