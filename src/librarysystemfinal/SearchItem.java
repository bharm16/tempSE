package librarysystemfinal;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author balta
 */
public class SearchItem extends javax.swing.JFrame {
    public LoadItems item = new LoadItems();
    public User userNow;
    BufferedReader bReader;
    FileChannel src;
    FileChannel dest;
    File fDelete;
    FileWriter fWriter;
    PrintWriter writer;

    public SearchItem() throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(false);
        this.returnButton.setVisible(false);
        this.dueDateLabel.setVisible(false);
        this.renewButton.setVisible(false);
    }

    public SearchItem(User user) throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(true);
        this.returnButton.setVisible(false);
        this.dueDateLabel.setVisible(false);
        this.renewButton.setVisible(false);
        this.userNow = user;
    }

    public SearchItem(int init, User user, String title) throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(false);
        this.returnButton.setVisible(true);
        this.dueDateLabel.setVisible(true);
        this.renewButton.setVisible(false);
        this.userNow = user;
    }

    public SearchItem(int init, User user, String init2, String init3) throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(false);
        this.returnButton.setVisible(false);
        this.dueDateLabel.setVisible(true);
        this.renewButton.setVisible(true);
        this.userNow = user;
    }

    public SearchItem(int i, User user) throws IOException {
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoFrame = new javax.swing.JFrame();
        titleLabel = new java.awt.Label();
        itemNum = new java.awt.Label();
        valueLabel = new java.awt.Label();
        authorLabel = new java.awt.Label();
        typeLabel = new java.awt.Label();
        rentableLabel = new java.awt.Label();
        bSellerLabel = new java.awt.Label();
        checkOutButton = new javax.swing.JButton();
        copiesLabel = new java.awt.Label();
        returnButton = new javax.swing.JButton();
        dueDateLabel = new java.awt.Label();
        renewButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        infoFrame.setTitle("Item Information");
        infoFrame.setBounds(new java.awt.Rectangle(0, 0, 561, 272));
        infoFrame.setResizable(false);

        titleLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleLabel.setText("label1");

        itemNum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemNum.setText("label1");

        valueLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        valueLabel.setText("label1");

        authorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        authorLabel.setText("label1");

        typeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        typeLabel.setText("label1");

        rentableLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rentableLabel.setText("label1");

        bSellerLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bSellerLabel.setText("label1");

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        copiesLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        copiesLabel.setText("label1");

        returnButton.setText("Return");
        returnButton.addActionListener(this::returnButtonActionPerformed);

        dueDateLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dueDateLabel.setText("label1");

        renewButton.setText("Renew");
        renewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewButtonActionPerformed();
            }
        });

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame.getContentPane());
        infoFrame.getContentPane().setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
                infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(typeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(itemNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rentableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addComponent(bSellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(copiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(renewButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkOutButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(returnButton)
                                                .addGap(12, 12, 12)))
                                .addContainerGap())
        );
        infoFrameLayout.setVerticalGroup(
                infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(itemNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rentableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bSellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(checkOutButton)
                                                .addComponent(returnButton)
                                                .addComponent(renewButton))
                                        .addComponent(copiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Item Name:");

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1))
                                        .addComponent(jLabel1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String title = jTextField1.getText();
        try {
            validateItem(title);
        } catch (IOException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        String itemCount = String.valueOf(Integer.parseInt(userNow.itemsBorrowed) + 1);
        String copiesCount = String.valueOf(Integer.parseInt(item.items.get(jTextField1.getText()).copies) - 1);
        String line;
        int temp = Integer.parseInt(userNow.cardID);
        int temp3 = Integer.parseInt(item.items.get(jTextField1.getText()).itemNum);
        int temp2 = 0;
        int iterator = 1;
        int iterator2 = 1;
        

        String currentItem = item.items.get(jTextField1.getText()).itemType;
        String bestSeller = item.items.get(jTextField1.getText()).bSeller;
        if ((Integer.parseInt(userNow.age) <= 12) && (Integer.parseInt(userNow.itemsBorrowed) == 5)) {
            System.out.println("Cannot check more items");
        } else {
            if ((currentItem.compareTo("reference") != 0) && (currentItem.compareTo("magazine") != 0)) {
                //update users file
                if (Integer.parseInt(item.items.get(jTextField1.getText()).copies) > 0) {
                    LocalDate date = getLocalDate(currentItem, bestSeller);

                    userNow.items.add(jTextField1.getText());
                    userNow.itemsBorrowed = itemCount;
                    item.items.get(jTextField1.getText()).dueDate = date.toString();
                    item.items.get(jTextField1.getText()).copies = copiesCount;

                    try {
                        fWriter = new FileWriter("usersTemp.txt", true);
                        try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                            bReader = new BufferedReader(new FileReader("users.txt"));

                            while ((line = bReader.readLine()) != null) {
                                if (iterator == temp) {
                                    bWriter.write(userNow.cardID + ",");
                                    bWriter.write(userNow.name + ",");
                                    bWriter.write(userNow.age + ",");
                                    bWriter.write(userNow.phoneNum + ",");
                                    bWriter.write(userNow.address + ",");
                                    bWriter.write(userNow.fines + ",");

                                    if (userNow.items.isEmpty()) {
                                        bWriter.write(userNow.itemsBorrowed);
                                    } else {
                                        bWriter.write(userNow.itemsBorrowed + ",");
                                    }

                                    for (String x : userNow.items) {
                                        bWriter.write(x);
                                        if (temp2 < userNow.items.size() - 1)
                                            bWriter.write(",");
                                        temp2++;
                                    }
                                } else {
                                    bWriter.write(line);
                                }
                                if (iterator < item.itemsCount) {
                                    bWriter.newLine();
                                }
                                iterator++;
                            }
                            bWriter.close();

                            src = new FileInputStream("usersTemp.txt").getChannel();
                            dest = new FileOutputStream("users.txt").getChannel();
                            dest.transferFrom(src, 0, src.size());
                            fDelete = new File("usersTemp.txt");
                            writer = new PrintWriter(fDelete);
                            writer.print("");
                            writer.close();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //update items file
                    try {
                        fWriter = new FileWriter("itemsTemp.txt", true);
                        try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                            bReader = new BufferedReader(new FileReader("items.txt"));

                            while ((line = bReader.readLine()) != null) {
                                if (iterator2 == temp3) {
                                    bWriter.write(item.items.get(jTextField1.getText()).title + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).itemNum + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).author + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).value + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).itemType + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).bSeller + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).copies + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).requested + ",");

                                    if (userNow.items.isEmpty()) {
                                        bWriter.write(item.items.get(jTextField1.getText()).renewed);
                                    } else {
                                        bWriter.write(item.items.get(jTextField1.getText()).renewed + ",");
                                    }
                                    bWriter.write(item.items.get(jTextField1.getText()).dueDate);
                                } else {
                                    bWriter.write(line);
                                }
                                if (iterator2 < item.itemsCount) {
                                    bWriter.newLine();
                                }
                                iterator2++;
                            }
                            bWriter.close();

                            src = new FileInputStream("itemsTemp.txt").getChannel();
                            dest = new FileOutputStream("items.txt").getChannel();
                            dest.transferFrom(src, 0, src.size());
                            fDelete = new File("itemsTemp.txt");
                            writer = new PrintWriter(fDelete);
                            writer.print("");
                            writer.close();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.out.println("No more copies. Item Requested");
                    item.items.get(jTextField1.getText()).requested = "Yes";
                    try {
                        fWriter = new FileWriter("itemsTemp.txt", true);
                        try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                            bReader = new BufferedReader(new FileReader("items.txt"));

                            while ((line = bReader.readLine()) != null) {
                                if (iterator2 == temp3) {
                                    bWriter.write(item.items.get(jTextField1.getText()).title + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).itemNum + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).author + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).value + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).itemType + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).bSeller + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).copies + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).requested + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).renewed + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).dueDate);
                                } else {
                                    bWriter.write(line);
                                }
                                if (iterator2 < item.itemsCount) {
                                    bWriter.newLine();
                                }
                                iterator2++;
                            }
                            bWriter.close();

                            src = new FileInputStream("itemsTemp.txt").getChannel();
                            dest = new FileOutputStream("items.txt").getChannel();
                            dest.transferFrom(src, 0, src.size());
                            fDelete = new File("itemsTemp.txt");
                            writer = new PrintWriter(fDelete);
                            writer.print("");
                            writer.close();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                System.out.println("Cannot Check Out Item");
            }
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void returnButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        String itemCount = String.valueOf(Integer.parseInt(userNow.itemsBorrowed) - 1);
        String copiesCount = String.valueOf(Integer.parseInt(item.items.get(jTextField1.getText()).copies) + 1);
        String line;
        int temp = Integer.parseInt(userNow.cardID);
        int temp3 = Integer.parseInt(item.items.get(jTextField1.getText()).itemNum);
        int temp2 = 0;
        int iterator = 1;
        int iterator2 = 1;

        int days;
        double finesNow = 0.00;
        double itemValue;
        DecimalFormat format = new DecimalFormat("#.00");
        for (String x : userNow.items) {
            String dueDate = item.items.get(x).dueDate;
            days = (int) ChronoUnit.DAYS.between(LocalDate.parse(dueDate), LocalDate.now());
            System.out.println(days);
            for (int y = 0; y < days; y++) {
                finesNow = Double.parseDouble(userNow.fines);
                itemValue = Double.parseDouble(item.items.get(x).value);
                if (finesNow < itemValue) {
                    finesNow = finesNow + .10;
                    userNow.fines = String.valueOf(format.format(finesNow));
                } else {
                    break;
                }
            }
            System.out.println(finesNow);
        }
        item.items.get(jTextField1.getText()).renewed = "No";
        int toRemove = 0;
        for (String x : userNow.items) {
            if (x.compareTo(jTextField1.getText()) == 0) {
                toRemove = x.indexOf(x);
            }

        }
        userNow.items.remove(toRemove);
        userNow.itemsBorrowed = itemCount;
        item.items.get(jTextField1.getText()).dueDate = "";
        item.items.get(jTextField1.getText()).copies = copiesCount;
        try {
            fWriter = new FileWriter("usersTemp.txt", true);
            try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                bReader = new BufferedReader(new FileReader("users.txt"));

                while ((line = bReader.readLine()) != null) {
                    if (iterator == temp) {
                        bWriter.write(userNow.cardID + ",");
                        bWriter.write(userNow.name + ",");
                        bWriter.write(userNow.age + ",");
                        bWriter.write(userNow.phoneNum + ",");
                        bWriter.write(userNow.address + ",");
                        bWriter.write(userNow.fines + ",");

                        if (userNow.items.isEmpty()) {
                            bWriter.write(userNow.itemsBorrowed);
                        } else {
                            bWriter.write(userNow.itemsBorrowed + ",");
                        }

                        for (String x : userNow.items) {
                            bWriter.write(x);
                            if (temp2 < userNow.items.size() - 1)
                                bWriter.write(",");
                            temp2++;
                        }
                    } else {
                        bWriter.write(line);
                    }
                    if (iterator < item.itemsCount) {
                        bWriter.newLine();
                    }
                    iterator++;
                }
                bWriter.close();

                src = new FileInputStream("usersTemp.txt").getChannel();
                dest = new FileOutputStream("users.txt").getChannel();
                dest.transferFrom(src, 0, src.size());
                fDelete = new File("usersTemp.txt");
                writer = new PrintWriter(fDelete);
                writer.print("");
                writer.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        //update items file
        try {
            fWriter = new FileWriter("itemsTemp.txt", true);
            try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                bReader = new BufferedReader(new FileReader("items.txt"));

                while ((line = bReader.readLine()) != null) {
                    if (iterator2 == temp3) {
                        bWriter.write(item.items.get(jTextField1.getText()).title + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).itemNum + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).author + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).value + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).itemType + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).bSeller + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).copies + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).requested + ",");

                        if (userNow.items.isEmpty()) {
                            bWriter.write(item.items.get(jTextField1.getText()).renewed);
                        } else {
                            bWriter.write(item.items.get(jTextField1.getText()).renewed + ",");
                        }

                        bWriter.write(item.items.get(jTextField1.getText()).dueDate);
                    } else {
                        bWriter.write(line);
                    }
                    if (iterator2 < item.itemsCount) {
                        bWriter.newLine();
                    }
                    iterator2++;
                }
                bWriter.close();

                src = new FileInputStream("itemsTemp.txt").getChannel();
                dest = new FileOutputStream("items.txt").getChannel();
                dest.transferFrom(src, 0, src.size());
                fDelete = new File("itemsTemp.txt");
                writer = new PrintWriter(fDelete);
                writer.print("");
                writer.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void renewButtonActionPerformed() {//GEN-FIRST:event_renewButtonActionPerformed
        if (item.items.get(jTextField1.getText()).requested.compareTo("Yes") == 0) {
            System.out.println("Cannot renew. Item Requested");
        } else if (item.items.get(jTextField1.getText()).renewed.compareTo("No") == 0) {
            String line;
            int temp = Integer.parseInt(userNow.cardID);
            int temp3 = Integer.parseInt(item.items.get(jTextField1.getText()).itemNum);
            int temp2 = 0;
            int iterator = 1;
            int iterator2 = 1;
            LocalDate date;

            String currentItem = item.items.get(jTextField1.getText()).itemType;
            String bestSeller = item.items.get(jTextField1.getText()).bSeller;
            if ((Integer.parseInt(userNow.age) <= 12) && (Integer.parseInt(userNow.itemsBorrowed) == 5)) {
                System.out.println("Cannot check more items");
            } else {
                if ((currentItem.compareTo("reference") != 0) && (currentItem.compareTo("magazine") != 0)) {
                    //update users file
                    date = getLocalDate(currentItem, bestSeller);

                    item.items.get(jTextField1.getText()).dueDate = date.toString();
                    item.items.get(jTextField1.getText()).renewed = "Yes";

                    try {
                        fWriter = new FileWriter("usersTemp.txt", true);
                        try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                            bReader = new BufferedReader(new FileReader("users.txt"));

                            while ((line = bReader.readLine()) != null) {
                                if (iterator == temp) {
                                    bWriter.write(userNow.cardID + ",");
                                    bWriter.write(userNow.name + ",");
                                    bWriter.write(userNow.age + ",");
                                    bWriter.write(userNow.phoneNum + ",");
                                    bWriter.write(userNow.address + ",");
                                    bWriter.write(userNow.fines + ",");

                                    if (userNow.items.isEmpty()) {
                                        bWriter.write(userNow.itemsBorrowed);
                                    } else {
                                        bWriter.write(userNow.itemsBorrowed + ",");
                                    }

                                    for (String x : userNow.items) {
                                        bWriter.write(x);
                                        if (temp2 < userNow.items.size() - 1)
                                            bWriter.write(",");
                                        temp2++;
                                    }
                                } else {
                                    bWriter.write(line);
                                }
                                if (iterator < item.itemsCount) {
                                    bWriter.newLine();
                                }
                                iterator++;
                            }
                            bWriter.close();

                            src = new FileInputStream("usersTemp.txt").getChannel();
                            dest = new FileOutputStream("users.txt").getChannel();
                            dest.transferFrom(src, 0, src.size());
                            fDelete = new File("usersTemp.txt");
                            writer = new PrintWriter(fDelete);
                            writer.print("");
                            writer.close();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //update items file
                    try {
                        fWriter = new FileWriter("itemsTemp.txt", true);
                        try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                            bReader = new BufferedReader(new FileReader("items.txt"));

                            while ((line = bReader.readLine()) != null) {
                                if (iterator2 == temp3) {
                                    bWriter.write(item.items.get(jTextField1.getText()).title + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).itemNum + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).author + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).value + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).itemType + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).bSeller + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).copies + ",");
                                    bWriter.write(item.items.get(jTextField1.getText()).requested + ",");
                                    if (userNow.items.isEmpty()) {
                                        bWriter.write(item.items.get(jTextField1.getText()).renewed);
                                    } else {
                                        bWriter.write(item.items.get(jTextField1.getText()).renewed + ",");
                                    }
                                    bWriter.write(item.items.get(jTextField1.getText()).dueDate);
                                } else {
                                    bWriter.write(line);
                                }
                                if (iterator2 < item.itemsCount) {
                                    bWriter.newLine();
                                }
                                iterator2++;
                            }
                            bWriter.close();

                            src = new FileInputStream("itemsTemp.txt").getChannel();
                            dest = new FileOutputStream("items.txt").getChannel();
                            dest.transferFrom(src, 0, src.size());
                            fDelete = new File("itemsTemp.txt");
                            writer = new PrintWriter(fDelete);
                            writer.print("");
                            writer.close();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.out.println("Cannot Check Out Item");
                }
            }
        } else {
            System.out.println("Item Already Renewed");
        }
    }//GEN-LAST:event_renewButtonActionPerformed

    private LocalDate getLocalDate(String currentItem, String bestSeller) {
        LocalDate date;
        if ((currentItem.compareTo("book") == 0) && (bestSeller.compareTo("Yes") == 0)) {
            date = LocalDate.now().plusDays(14);
        } else if ((currentItem.compareTo("book") == 0) && (bestSeller.compareTo("No") == 0)) {
            date = LocalDate.now().plusDays(21);
        } else {
            date = LocalDate.now().plusDays(14);
        }
        return date;
    }

    private void validateItem(String title) throws IOException {
        if (item.items.containsKey(title)) {
            itemNum.setText("Item Number: " + item.items.get(title).itemNum);
            titleLabel.setText("Item Title: " + item.items.get(title).title);
            typeLabel.setText("Item Type: " + item.items.get(title).itemType);
            valueLabel.setText("Item Value: $" + item.items.get(title).value);
            authorLabel.setText("Author: " + item.items.get(title).author);
            rentableLabel.setText(item.items.get(title).rentable);
            bSellerLabel.setText("Best Seller: " + item.items.get(title).bSeller);
            copiesLabel.setText("Copies available: " + item.items.get(title).copies);
            dueDateLabel.setText("Due Date: " + item.items.get(title).dueDate);
            
            infoFrame.setVisible(true);
        } else {
            System.out.println("User not found");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label authorLabel;
    private java.awt.Label bSellerLabel;
    private javax.swing.JButton checkOutButton;
    private java.awt.Label copiesLabel;
    private java.awt.Label dueDateLabel;
    private javax.swing.JFrame infoFrame;
    private java.awt.Label itemNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton renewButton;
    private java.awt.Label rentableLabel;
    private javax.swing.JButton returnButton;
    private java.awt.Label titleLabel;
    private java.awt.Label typeLabel;
    private java.awt.Label valueLabel;
    // End of variables declaration//GEN-END:variables
}