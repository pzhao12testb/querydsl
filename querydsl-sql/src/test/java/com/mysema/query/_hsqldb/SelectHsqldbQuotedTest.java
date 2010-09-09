/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query._hsqldb;

import org.junit.Before;
import org.junit.BeforeClass;

import com.mysema.query.Connections;
import com.mysema.query.SelectBaseTest;
import com.mysema.query.SkipForQuoted;
import com.mysema.query.Target;
import com.mysema.query.sql.HSQLDBTemplates;
import com.mysema.testutil.Label;

@Label(Target.HSQLDB)
@SkipForQuoted
public class SelectHsqldbQuotedTest extends SelectBaseTest {

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initHSQL();
    }

    @Before
    public void setUpForTest() {
        templates = new HSQLDBTemplates(true).newLineToSingleSpace();
    }
    
}
