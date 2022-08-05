package librarysystemfinal;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * @author balta
 */
public class LoadItems {
    public HashMap<String, Item> items = new HashMap<>();
    BufferedReader bReader;
    public int itemsCount = 0;

    public LoadItems() throws FileNotFoundException, IOException {
        bReader = new BufferedReader(new FileReader("items.txt"));
        String line;

        while ((line = bReader.readLine()) != null) {
            Item newItem = new Item();
            itemsCount++;

            String[] info = line.split(",", 0);

            newItem.title = info[0];
            newItem.itemNum = info[1];
            newItem.author = info[2];
            newItem.value = info[3];
            newItem.itemType = info[4];
            newItem.bSeller = info[5];
            newItem.copies = info[6];
            newItem.requested = info[7];
            newItem.renewed = info[8];
            if (info.length > 9) {
                newItem.dueDate = info[9];
            }
            if ((info[4].compareTo("audio") == 0) ||
                    (info[4].compareTo("video") == 0))
                newItem.rentable = "Item available for checkout";
            if ((info[4].compareTo("book") == 0) && (info[5].compareTo("No") == 0))
                newItem.rentable = "Item available for checkout";
            items.put(newItem.title, newItem);
        }
    }
}