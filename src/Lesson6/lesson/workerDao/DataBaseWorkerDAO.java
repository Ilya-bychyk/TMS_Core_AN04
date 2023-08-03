package Lesson6.lesson.workerDao;

import java.util.Arrays;
import java.util.List;

public class DataBaseWorkerDAO implements WorkersDAO {
    @Override
    public List<String> getWorkerNames() {
        // читаем из базы
        //
        return Arrays.asList("name1");
    }
}
