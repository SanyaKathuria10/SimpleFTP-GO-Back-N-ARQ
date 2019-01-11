import java.io.*;
import java.net.*;

public class UDPDatagram implements Serializable
{

    byte dataArray[];
    long type;
    int seqNumber;
    int checksum;
    long sentTime;
    long uid;

    public UDPDatagram(int seqNumber, int checksum, short type, byte[] dataArray) {
        this.dataArray = dataArray;
        this.type = type;
        this.seqNumber = seqNumber;
        this.uid = 1L;
        this.checksum = checksum;
    }

}
