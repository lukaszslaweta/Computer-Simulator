package computer;

import computer.Computer;
import computer.Monitor;
import computer.drive.SSDDrive;
import computer.file.imagefile.GIFImageFile;
import computer.file.imagefile.JPGImageFile;
import computer.file.musicfile.MP3MusicFile;
import computer.usbdevice.MemoryStick;
import computer.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1", 399);
        JPGImageFile jpg1 = new JPGImageFile("nazwa2", 2300, 70);

        new MP3MusicFile("plik.mp3",234,"happysad","Most na krzywej",100);

    }
}