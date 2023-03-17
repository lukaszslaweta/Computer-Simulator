package computer.usbdevice;

public interface USBDevice {
     boolean connect();
     boolean disconnect();
     String getName();

     void add(USBDevice usbDevice);

     void remove(USBDevice usbDevice);
}
