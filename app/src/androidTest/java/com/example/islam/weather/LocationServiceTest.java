package com.example.islam.weather;

import android.content.Context;
import android.location.Location;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.RenamingDelegatingContext;
import android.test.suitebuilder.annotation.SmallTest;

import com.example.islam.weather.service.location.LocationService;

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
public class LocationServiceTest {
    public LocationServiceTest(){}
    private LocationService locationService;
    Context context;
    @Before
    public void setUp() throws Exception {
        context = new RenamingDelegatingContext(InstrumentationRegistry.getInstrumentation().getTargetContext(), "test_");

        locationService = new LocationService();
    }

    @Test
    public void testReceiveLocationWithNoErrors() {
        TestSubscriber<Location> testSubscriber = new TestSubscriber<>();
        locationService.getLocation(context).subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent();
        testSubscriber.assertNoErrors();
        testSubscriber.assertValueCount(1);
        testSubscriber.assertCompleted();
        assertNotNull(testSubscriber.getOnNextEvents().get(0));

    }


}
