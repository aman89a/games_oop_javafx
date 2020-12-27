package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack expected = new BishopBlack(Cell.B8);
        Cell cell = expected.position();
        assertThat(cell, is(Cell.B8));
    }

    @Test
    public void copy() {
        BishopBlack expected = new BishopBlack(Cell.A8);
        Figure bishopBlack = expected.copy(Cell.C6);
        assertThat(bishopBlack.position(), is(new BishopBlack(Cell.C6).position()));
    }

    @Test
    public void way() throws ImpossibleMoveException {
        Cell[] expected = { D2, E3, F4, G5};
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlack.way(Cell.G5);
        assertThat(expected, is(cells));
    }
}