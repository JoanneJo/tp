package seedu.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import seedu.parser.Parser;

class HelpCommandTest {

    @Test
    void execute() {
        Parser parser = new Parser();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        HelpCommand helpCommand = new HelpCommand();
        helpCommand.execute("", parser);

        String output = outputStream.toString();
        String expectedOutput = "Commands available:" + System.lineSeparator() +
<<<<<<< HEAD
                "add: adds a new resource to the library inventory.(e.g. add /id ID /t TITLE /a AUTHOR " +
                "/tag TAG /i ISBN [/g GENRE])" + System.lineSeparator() +
                "delete: deletes the resource with the specified ID from the library inventory. " +
                "(e.g. delete /id 123456789)" + System.lineSeparator() +
                "list: list all resources OR filter by certain tags or genre.(e.g. list /tag B /g Fiction " +
                "/a J. K. Rowling /i 9780763630188)" + System.lineSeparator() +
                "find: find a resource by title, author, ISBN or given id. (e.g. find /i 9780763630188)" +
                System.lineSeparator() + "exit: displays a farewell message and exits the program (e.g. exit)" +
                System.lineSeparator() +
                "For more information, please refer to our user guide at:" +
                "https://ay2324s1-cs2113t-w11-1.github.io/tp/UserGuide.html" + System.lineSeparator() +
=======
                "add: add an item (e.g. add /id 123456789 /t Moby Dick /a Herman Melville " +
                "/tag B /i 9780763630188 /g Adventure, Fiction)" +
                System.lineSeparator() +
                "delete: delete an item (e.g. delete /id 123456789)" + System.lineSeparator() +
                "list: (e.g. list /tag B /g Fiction)" + System.lineSeparator() +
                "find: (e.g. find /i 9780763630188)" + System.lineSeparator() +
                "exit: (e.g. exit)" + System.lineSeparator() +
                "For more information, please refer to our user guide at: " +
                "https://ay2324s1-cs2113t-w11-1.github.io/tp/UserGuide.html" + System.lineSeparator()+
>>>>>>> 446c9c1b9d6b76ce5b9b366d67eba021b3075894
                "____________________________________________________________" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }
}
