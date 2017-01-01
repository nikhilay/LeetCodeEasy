/**
 * Created by Nikhil on 10/23/16.
 */

/**
 * The API: int read4(char[] buf) reads 4 characters at a time from a file.
 * The return value is the actual number of characters read. For example, it returns 3 if there is only 3 characters left in the file.
 * By using the read4 API, implement the function int read(char[] buf, int n) that reads n characters from the file.
 */
public class ReadNCharactersGivenRead4 {

    public int read(char[] buf, int n) {
        char[] buf4 = new char[4];
        boolean eof = false;
        int size = 0;
        int read = 0;
        int index = 0;
        int charactersRead = 0;
        while (!eof && index < n) {
            charactersRead = read4(buf4);
            if (charactersRead < 4) eof = true;
            size = Math.min(n - index, charactersRead);
            read += size;
            for(int i=0;i<size;i++){
                buf[index++] = buf4[i];
            }
        }
        return read;
    }

    private int read4(char[] foo) {
        return 0;
    }
}
