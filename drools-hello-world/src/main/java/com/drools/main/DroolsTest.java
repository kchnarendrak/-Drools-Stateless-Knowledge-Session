package com.drools.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import com.drools.model.Counter;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    
//get stateless session
StatelessKieSession kSession = kContainer.newStatelessKieSession();

           
        	Counter counter1 = new Counter(1,"cnt1");
            Counter counter2 = new Counter(2,"cnt2");

            //execute with counter1
            kSession.execute(counter1);

          //execute with counter2
            kSession.execute(counter2);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
