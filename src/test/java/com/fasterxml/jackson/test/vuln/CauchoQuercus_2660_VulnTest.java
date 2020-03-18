package com.fasterxml.jackson.test.vuln;

import java.util.Collections;

public class CauchoQuercus_2660_VulnTest
    extends VulnTestBase
{
    public void testResourceRef() throws Exception
    {
        _testIllegalType(com.caucho.config.types.ResourceRef.class,
                Collections.singletonMap("lookupName", "ldap://localhost:43658/Calc")
        );
    }
}
