import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DatabaseGUI extends JFrame {

    private JTextField queryTextField;
    private JTextArea resultTextArea;
    private JButton executeButton;
    private JTextField filterTextField;
    private JButton filterButton;
    private JTable resultTable;

    private Connection connection;

    public DatabaseGUI() {
        setTitle("Database GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        queryTextField = new JTextField();
        executeButton = new JButton("Execute Query");
        resultTextArea = new JTextArea();
        filterTextField = new JTextField();
        filterButton = new JButton("Filter");
        resultTable = new JTable();

        // Set layout
        setLayout(new BorderLayout());

        // Add components to the frame
        JPanel queryPanel = new JPanel(new BorderLayout());
        queryPanel.add(new JLabel("Enter SQL Query:"), BorderLayout.NORTH);
        queryPanel.add(queryTextField, BorderLayout.CENTER);
        queryPanel.add(executeButton, BorderLayout.SOUTH);

        add(queryPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultTable), BorderLayout.CENTER);

        JPanel filterPanel = new JPanel(new FlowLayout());
        filterPanel.add(new JLabel("Filter:"));

        // Set preferred size for filter text field
        filterTextField.setPreferredSize(new Dimension(200, 25));

        filterPanel.add(filterTextField);
        filterPanel.add(filterButton);

        add(filterPanel, BorderLayout.SOUTH);

        // Register event listeners
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeQuery();
            }
        });

        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyFilter();
            }
        });

        // Initialize database connection
        initializeDatabase();
    }

    private void initializeDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/YOUR_DATABASE?useSSL=false";
            String username = "";
            String password = "";
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void executeQuery() {
        String sqlQuery = queryTextField.getText();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Display result in a JTable
            resultTable.setModel(buildTableModel(resultSet));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void applyFilter() {
        String filterText = filterTextField.getText();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>((DefaultTableModel) resultTable.getModel());
        resultTable.setRowSorter(rowSorter);

        if (filterText.trim().length() == 0) {
            rowSorter.setRowFilter(null);
        } else {
            try {
                RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + filterText);
                rowSorter.setRowFilter(rowFilter);
            } catch (java.util.regex.PatternSyntaxException e) {
                // Handle invalid regex syntax if needed
                e.printStackTrace();
            }
        }
    }

    private static DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Create column names
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int column = 1; column <= columnCount; column++) {
            columnNames[column - 1] = metaData.getColumnName(column);
        }

        // Create data array
        Object[][] data = new Object[100][columnCount]; // Assuming a maximum of 100 rows

        // Populate data array
        int row = 0;
        while (resultSet.next() && row < 100) {
            for (int column = 1; column <= columnCount; column++) {
                data[row][column - 1] = resultSet.getObject(column);
            }
            row++;
        }

        return new DefaultTableModel(data, columnNames);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DatabaseGUI databaseGUI = new DatabaseGUI();
            databaseGUI.setVisible(true);
        });
    }
}