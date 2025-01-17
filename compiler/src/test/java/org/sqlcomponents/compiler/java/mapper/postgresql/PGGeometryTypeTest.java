package org.sqlcomponents.compiler.java.mapper.postgresql;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.LineSegment;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static  org.sqlcomponents.compiler.java.util.CompilerTestUtil.getDataType;

/**
 * Test Mappings of Geometry Types in Postgres.
 * Ref: https://www.postgresql.org/docs/current/datatype-geometric.html
 */
class PGGeometryTypeTest {

    @Test
    @Disabled
    void testDataType() throws Exception {
        assertEquals(LineSegment.class, Class.forName(getDataType("a_closed")), "Type Mismatch");
    }
}









