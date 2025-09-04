package datastream.example3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/tem/Temp/test3.db");

            byte[] array = {10, 20, 30, 40, 50};

            os.write(array,1,3); // byte 배열 1~3이 os에 저장된다.

            os.flush();
            os.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
