package org.hibernate.tutorial.test;

import org.hibernate.tutorial.EventManager;
import org.junit.Test;

/**
 * Created by malance on 14-1-16.
 */
public class EventManagerTest {
    @Test
    public void shouldEventManagerWork(){
        EventManager.main(new String[]{"store"});
    }
}
