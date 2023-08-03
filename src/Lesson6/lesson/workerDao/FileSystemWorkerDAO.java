package Lesson6.lesson.workerDao;

import java.util.Collections;
import java.util.List;

public class FileSystemWorkerDAO implements WorkersDAO {
    @Override
    public List<String> getWorkerNames() {
        // с файла читает сотрудников
        // new File()....
        return Collections.emptyList();
    }
}
