package librarysystemfinal;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * @author balta
 */
public class LoadUsers {
    public HashMap<String, User> users = new HashMap<>();
    BufferedReader bReader;
    FileWriter fWriter;
    public int itemsCount = 0;

    public LoadUsers() throws IOException {
        bReader = new BufferedReader(new FileReader("users.txt"));
        String line;

        while ((line = bReader.readLine()) != null) {
            User newUser = new User();
            itemsCount++;

            String[] info = line.split(",", 0);

            newUser.cardID = info[0];
            newUser.name = info[1];
            newUser.age = info[2];
            newUser.phoneNum = info[3];
            newUser.address = info[4];
            newUser.fines = info[5];
            newUser.itemsBorrowed = info[6];
            for (int x = 7; x < info.length; x++) {
                newUser.items.add(info[x]);
            }
            users.put(newUser.name, newUser);
        }
    }
}