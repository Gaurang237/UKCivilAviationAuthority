package com.UkAuthority;

import com.UkAuthority.propertyreader.PropertyReader;
import com.UkAuthority.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
