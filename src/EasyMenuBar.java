import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class EasyMenuBar extends JMenuBar implements ActionListener {

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem newGameItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    EasyMenuBar(){

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        newGameItem = new JMenuItem("New Game");
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        newGameItem.addActionListener(this);
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadIcon = new ImageIcon("images/Opened Folder.png");
        saveIcon = new ImageIcon("images/Done.png");
        exitIcon = new ImageIcon("images/Close.png");

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file menu
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for file menu
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for file menu

        newGameItem.setMnemonic(KeyEvent.VK_N); // n for new game
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(newGameItem);
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.add(fileMenu);
        this.add(editMenu);
        this.add(helpMenu);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loadItem){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int response = fileChooser.showOpenDialog(null); //select a file to open

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
            System.out.println("User tried to load a file.");
        }else if(e.getSource() == saveItem){
            System.out.println("User tried you save a file");
        }else if(e.getSource() == exitItem){
            System.exit(0);
        }else if(e.getSource() == newGameItem){
            EasyFrame.newGameStart();
        }
    }
}
