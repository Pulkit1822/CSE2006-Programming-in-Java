import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class PrimeTaskCalculator {
    private JFrame frame;
    private JProgressBar progressBar;
    private JTextArea resultTextArea;

    public PrimeTaskCalculator() {
        frame = new JFrame("Prime Number Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        progressBar = new JProgressBar(0, 0);
        progressBar.setStringPainted(true);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        resultTextArea.setWrapStyleWord(true);
        resultTextArea.setLineWrap(true);

        frame.add(progressBar, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        JButton startButton = new JButton("Start Calculations");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maxPrimeInput = JOptionPane.showInputDialog(frame, "Enter the maximum prime number:");
                try {
                    int maxPrime = Integer.parseInt(maxPrimeInput);
                    if (maxPrime > 1) {
                        progressBar.setMaximum(maxPrime);
                        startPrimeCalculation(maxPrime);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter a valid positive number.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
                }
            }
        });

        frame.add(startButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void startPrimeCalculation(int maxPrime) {
        SwingWorker<List<Integer>, Integer> worker = new SwingWorker<List<Integer>, Integer>() {
            @Override
            protected List<Integer> doInBackground() {
                List<Integer> primeNumbers = new ArrayList<>();
                for (int number = 2; number <= maxPrime; number++) {
                    if (isPrime(number)) {
                        primeNumbers.add(number);
                        publish(number);
                    }
                }
                return primeNumbers;
            }

            @Override
            protected void process(List<Integer> chunks) {
                for (Integer prime : chunks) {
                    progressBar.setValue(prime);
                    resultTextArea.append(prime + "\n");
                }
            }

            @Override
            protected void done() {
                progressBar.setValue(maxPrime);
                resultTextArea.append("Calculation completed!\n");
            }
        };

        worker.execute();
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PrimeTaskCalculator());
    }
}
