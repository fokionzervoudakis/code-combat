package com.janestreet;

import com.janestreet.Spreadsheet.Cell;
import com.janestreet.Spreadsheet.RefCell;
import com.janestreet.Spreadsheet.ValCell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpreadsheetTest {
    @Test
    void itResolvesZeroReferences() {
        var sheet = new Spreadsheet(new Cell[][] { { new ValCell(5) } });
        assertEquals(5, sheet.getVal(0, 0));
    }

    @Test
    void itResolvesOneReference() {
        var ref = new RefCell(new ValCell(5), new ValCell(6));
        var sheet = new Spreadsheet(new Cell[][] { { ref } });
        assertEquals(11, sheet.getVal(0, 0));
    }

    @Test
    void itResolvesManyReferences() {
        var val = new ValCell(6);
        var ref1 = new RefCell(val, new ValCell(-5));
        var ref2 = new RefCell(val, new ValCell(-1));
        var sheet = new Spreadsheet(new Cell[][] { { new RefCell(ref1, ref2) } });
        assertEquals(6, sheet.getVal(0, 0));
    }

    @Test
    void itIgnoresCyclesFromReflexivePaths() {
        var ref = new RefCell();
        ref.setRef1(new ValCell(5));
        ref.setRef2(ref);
        var sheet = new Spreadsheet(new Cell[][] { { ref } });
        assertEquals(5, sheet.getVal(0, 0));
    }

    @Test
    void itIgnoresCyclesFromSymmetricPaths() {
        RefCell ref1 = new RefCell(), ref2 = new RefCell();
        ref1.setRef1(new ValCell(5));
        ref1.setRef2(ref2);
        ref2.setRef1(new ValCell(6));
        ref2.setRef2(ref1);
        var sheet = new Spreadsheet(new Cell[][] { { ref1 } });
        assertEquals(11, sheet.getVal(0, 0));
    }
}
