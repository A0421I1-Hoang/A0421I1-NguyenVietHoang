package b16_IO_TextFile.TimGiaTriLonNhat;

import java.util.List;

import static b16_IO_TextFile.TimGiaTriLonNhat.ReadFileAndWriteFile.findMax;

public class Main {
    public static void main(String[] args) {
        ReadFileAndWriteFile readAndWriteFile = new ReadFileAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
