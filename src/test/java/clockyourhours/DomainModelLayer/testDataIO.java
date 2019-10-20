package clockyourhours.DomainModelLayer;

import clockyourhours.Main.DataIO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;



public class testDataIO {

    @Test
    @DisplayName("Test whether write and read file contain the same content")
    void testObjectIOGiveEqualResultFromWrittenAndReadFile(){
        //Arrange
        File tempFile = new File("TestTextFile", "tempfile.obj");
        String tempFilePath = tempFile.getAbsolutePath();
        Client clientBefore1 = new Client (1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");
        Client clientBefore2 = new Client (2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");

        ArrayList<Client> clientBefore = new ArrayList<>(Arrays.asList(clientBefore1,clientBefore2));
        //Act
        DataIO.writeToObjectFile(tempFilePath, clientBefore);
        ArrayList<Client> clientAfter = DataIO.readFromObjectFile(tempFilePath);
        //Assert
        Assertions.assertEquals(clientBefore, clientAfter);
    }
}
