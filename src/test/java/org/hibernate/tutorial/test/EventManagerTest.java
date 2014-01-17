package org.hibernate.tutorial.test;

import org.hibernate.tutorial.EventManager;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by malance on 14-1-16.
 */
public class EventManagerTest {
    @Test
    @Ignore
    public void shouldEventManagerWorkOnStore(){
        EventManager.main(new String[]{"store"});
    }

    @Test
    public void shouldEventManagerWorkOnAddPersonToEvent() {
        EventManager.main(new String[]{"addpersontoevent"});
    }
}
