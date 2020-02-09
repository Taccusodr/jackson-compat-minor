package com.fasterxml.jackson.test.vuln;

import java.util.Collections;

import org.apache.xalan.lib.sql.JNDIConnectionPool;

// [databind#2469] with xalan2
public class Xalan_2469_CVE_Test extends VulnTestBase
{
    public void testXalan2Vuln() throws Exception
    {
        _testIllegalType(JNDIConnectionPool.class,
                Collections.singletonMap("jndiPath", "ldap://127.0.0.1:1389/Exploit"));
    }
}
