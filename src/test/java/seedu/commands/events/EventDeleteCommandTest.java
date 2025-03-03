package seedu.commands.events;

import org.junit.jupiter.api.Test;
import seedu.data.SysLibException;
import seedu.parser.Parser;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EventDeleteCommandTest {
    private final Parser parser = new Parser();
    private final EventAddCommand eventAddCommand = new EventAddCommand();
    private final EventDeleteCommand eventDeleteCommand = new EventDeleteCommand();

    @Test
    public void eventDeleteCommandOutput() throws SysLibException {
        eventAddCommand.execute("/t testrun /date 1-12-2001 /desc testing 123", parser);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        eventDeleteCommand.execute("/i 0", parser);
        String output = outputStream.toString();
        String expectedOutput = "This event is removed:" + System.lineSeparator() +
                "testrun | 01-12-2001 | testing 123" + System.lineSeparator() +
                "____________________________________________________________" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void eventDeleteCommandInvalidIndex() {
        assertThrows(IllegalArgumentException.class, ()->eventDeleteCommand.execute(
                "/i aaaaa", parser));
    }

    @Test
    public void eventDeleteCommandInsufficientData() {
        assertThrows(IllegalArgumentException.class, ()->eventDeleteCommand.execute("/i ", parser));
    }
}
