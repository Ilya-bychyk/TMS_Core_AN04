package Lesson6.lesson.workerDao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkersDAO workersDAO = new DataBaseWorkerDAO();

        // ... куча кода
        List<String> workerNames = workersDAO.getWorkerNames();
        // куча кода
    }
}
