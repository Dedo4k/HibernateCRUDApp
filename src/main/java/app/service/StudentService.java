package app.service;

import app.dao.StudentDaoImpl;
import app.model.Student;

import java.util.List;

public class StudentService {

    private final StudentDaoImpl studentDao;

    public StudentService() {
        this.studentDao = new StudentDaoImpl();
    }

    public void create(Student student) {
        studentDao.create(student);
    }

    public Student getById(Long id) {
        return (Student) studentDao.read(id);
    }

    public List<?> getAll() {
        return studentDao.readAll();
    }

    public void updateById(Long id, Student student) {
        Student studentToUpdate = getById(id);
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        studentToUpdate.setCity(student.getCity());
        studentDao.update(student);
    }

    public void deleteById(Long id) {
        studentDao.delete(getById(id));
    }
}
