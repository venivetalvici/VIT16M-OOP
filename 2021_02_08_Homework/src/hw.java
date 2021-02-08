import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class hw extends JFrame {
    private int book = 0;
    private JLabel countLabel;
    private JButton addBook;
    private JButton removeBook;


    public hw(){
        super("Crow calculator");
        //Подготавливаем компоненты объекта
        countLabel = new JLabel("Books:" + book);
        addBook = new JButton("Add Book");
        removeBook = new JButton("Remove Book");

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        buttonsPanel.add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже

        buttonsPanel.add(addBook);
        buttonsPanel.add(removeBook);

        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initListeners();
    }

    private void initListeners() {
        addBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                book = book + 1;     //Добавляем одну ворону
                countLabel.setText("Books:" + book); //Сообщаем приложению, что количество ворон изменилось
            }
        });
        removeBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (book > 0) {
                    book = book - 1;
                    countLabel.setText("Books:" + book);  //Сообщаем приложению, что количество ворон изменилось
                }
            }
        });
    }
        private void updateBookCounter() {
            countLabel.setText("Books:" + book);
        }


    public static void main(String[] args) {
        hw app = new hw();
        app.setVisible(true);
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }

}